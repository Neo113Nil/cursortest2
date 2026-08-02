package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.InstanceCheck;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class EqualsMethod implements Implementation {
    private static final MethodDescription.InDefinedShape EQUALS = (MethodDescription.InDefinedShape) TypeDescription.OBJECT.getDeclaredMethods().filter(ElementMatchers.isEquals()).getOnly();
    private final Comparator<? super FieldDescription.InDefinedShape> comparator;
    private final ElementMatcher.Junction<? super FieldDescription.InDefinedShape> ignored;
    private final ElementMatcher.Junction<? super FieldDescription.InDefinedShape> nonNullable;
    private final SuperClassCheck superClassCheck;
    private final TypeCompatibilityCheck typeCompatibilityCheck;

    protected enum NaturalOrderComparator implements Comparator<FieldDescription.InDefinedShape> {
        INSTANCE;

        @Override // java.util.Comparator
        public int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
            return 0;
        }
    }

    protected enum SuperClassCheck {
        DISABLED { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.SuperClassCheck.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.SuperClassCheck
            protected StackManipulation resolve(TypeDescription typeDescription) {
                return StackManipulation.Trivial.INSTANCE;
            }
        },
        ENABLED { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.SuperClassCheck.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.SuperClassCheck
            protected StackManipulation resolve(TypeDescription typeDescription) {
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    throw new IllegalStateException(typeDescription + " does not declare a super class");
                }
                return new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodVariableAccess.REFERENCE.loadFrom(1), MethodInvocation.invoke(EqualsMethod.EQUALS).special(superClass.asErasure()), ConditionalReturn.onZeroInteger());
            }
        };

        protected abstract StackManipulation resolve(TypeDescription typeDescription);
    }

    protected enum TypeCompatibilityCheck {
        EXACT { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck
            public StackManipulation resolve(TypeDescription typeDescription) {
                return new StackManipulation.Compound(MethodVariableAccess.REFERENCE.loadFrom(1), ConditionalReturn.onNullValue(), MethodVariableAccess.REFERENCE.loadFrom(0), MethodInvocation.invoke(GET_CLASS), MethodVariableAccess.REFERENCE.loadFrom(1), MethodInvocation.invoke(GET_CLASS), ConditionalReturn.onNonIdentity());
            }
        },
        SUBCLASS { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypeCompatibilityCheck
            protected StackManipulation resolve(TypeDescription typeDescription) {
                return new StackManipulation.Compound(MethodVariableAccess.REFERENCE.loadFrom(1), InstanceCheck.of(typeDescription), ConditionalReturn.onZeroInteger());
            }
        };

        protected static final MethodDescription.InDefinedShape GET_CLASS = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(Object.class).getDeclaredMethods().filter(ElementMatchers.named("getClass")).getOnly();

        protected abstract StackManipulation resolve(TypeDescription typeDescription);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EqualsMethod equalsMethod = (EqualsMethod) obj;
        return this.superClassCheck.equals(equalsMethod.superClassCheck) && this.typeCompatibilityCheck.equals(equalsMethod.typeCompatibilityCheck) && this.ignored.equals(equalsMethod.ignored) && this.nonNullable.equals(equalsMethod.nonNullable) && this.comparator.equals(equalsMethod.comparator);
    }

    public int hashCode() {
        return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.superClassCheck.hashCode()) * 31) + this.typeCompatibilityCheck.hashCode()) * 31) + this.ignored.hashCode()) * 31) + this.nonNullable.hashCode()) * 31) + this.comparator.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    protected EqualsMethod(SuperClassCheck superClassCheck) {
        this(superClassCheck, TypeCompatibilityCheck.EXACT, ElementMatchers.none(), ElementMatchers.none(), NaturalOrderComparator.INSTANCE);
    }

    private EqualsMethod(SuperClassCheck superClassCheck, TypeCompatibilityCheck typeCompatibilityCheck, ElementMatcher.Junction<? super FieldDescription.InDefinedShape> junction, ElementMatcher.Junction<? super FieldDescription.InDefinedShape> junction2, Comparator<? super FieldDescription.InDefinedShape> comparator) {
        this.superClassCheck = superClassCheck;
        this.typeCompatibilityCheck = typeCompatibilityCheck;
        this.ignored = junction;
        this.nonNullable = junction2;
        this.comparator = comparator;
    }

    public static EqualsMethod requiringSuperClassEquality() {
        return new EqualsMethod(SuperClassCheck.ENABLED);
    }

    public static EqualsMethod isolated() {
        return new EqualsMethod(SuperClassCheck.DISABLED);
    }

    public EqualsMethod withIgnoredFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new EqualsMethod(this.superClassCheck, this.typeCompatibilityCheck, this.ignored.or(elementMatcher), this.nonNullable, this.comparator);
    }

    public EqualsMethod withNonNullableFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new EqualsMethod(this.superClassCheck, this.typeCompatibilityCheck, this.ignored, this.nonNullable.or(elementMatcher), this.comparator);
    }

    public EqualsMethod withPrimitiveTypedFieldsFirst() {
        return withFieldOrder(TypePropertyComparator.FOR_PRIMITIVE_TYPES);
    }

    public EqualsMethod withEnumerationTypedFieldsFirst() {
        return withFieldOrder(TypePropertyComparator.FOR_ENUMERATION_TYPES);
    }

    public EqualsMethod withPrimitiveWrapperTypedFieldsFirst() {
        return withFieldOrder(TypePropertyComparator.FOR_PRIMITIVE_WRAPPER_TYPES);
    }

    public EqualsMethod withStringTypedFieldsFirst() {
        return withFieldOrder(TypePropertyComparator.FOR_STRING_TYPES);
    }

    public EqualsMethod withFieldOrder(Comparator<? super FieldDescription.InDefinedShape> comparator) {
        return new EqualsMethod(this.superClassCheck, this.typeCompatibilityCheck, this.ignored, this.nonNullable, new CompoundComparator((Comparator<? super FieldDescription.InDefinedShape>[]) new Comparator[]{this.comparator, comparator}));
    }

    public Implementation withSubclassEquality() {
        return new EqualsMethod(this.superClassCheck, TypeCompatibilityCheck.SUBCLASS, this.ignored, this.nonNullable, this.comparator);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        if (target.getInstrumentedType().isInterface()) {
            throw new IllegalStateException("Cannot implement meaningful equals method for " + target.getInstrumentedType());
        }
        ArrayList arrayList = new ArrayList(target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.not(ElementMatchers.isStatic().or(this.ignored))));
        Collections.sort(arrayList, this.comparator);
        return new Appender(target.getInstrumentedType(), new StackManipulation.Compound(this.superClassCheck.resolve(target.getInstrumentedType()), MethodVariableAccess.loadThis(), MethodVariableAccess.REFERENCE.loadFrom(1), ConditionalReturn.onIdentity().returningTrue(), this.typeCompatibilityCheck.resolve(target.getInstrumentedType())), arrayList, this.nonNullable);
    }

    protected interface NullValueGuard {
        StackManipulation after();

        StackManipulation before();

        int getRequiredVariablePadding();

        public enum NoOp implements NullValueGuard {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public StackManipulation before() {
                return StackManipulation.Trivial.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public StackManipulation after() {
                return StackManipulation.Trivial.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                return StackSize.ZERO.getSize();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class UsingJump implements NullValueGuard {
            private static final Object[] EMPTY = new Object[0];
            private static final Object[] REFERENCE = {Type.getInternalName(Object.class)};
            private final MethodDescription instrumentedMethod;
            private final Label firstValueNull = new Label();
            private final Label secondValueNull = new Label();
            private final Label endOfBlock = new Label();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UsingJump usingJump = (UsingJump) obj;
                return this.instrumentedMethod.equals(usingJump.instrumentedMethod) && this.firstValueNull.equals(usingJump.firstValueNull) && this.secondValueNull.equals(usingJump.secondValueNull) && this.endOfBlock.equals(usingJump.endOfBlock);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                return 2;
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedMethod.hashCode()) * 31) + this.firstValueNull.hashCode()) * 31) + this.secondValueNull.hashCode()) * 31) + this.endOfBlock.hashCode();
            }

            protected UsingJump(MethodDescription methodDescription) {
                this.instrumentedMethod = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public StackManipulation before() {
                return new BeforeInstruction();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.NullValueGuard
            public StackManipulation after() {
                return new AfterInstruction();
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class BeforeInstruction implements StackManipulation {
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && UsingJump.this.equals(UsingJump.this);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + UsingJump.this.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                    return true;
                }

                protected BeforeInstruction() {
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                    methodVisitor.visitVarInsn(58, UsingJump.this.instrumentedMethod.getStackSize());
                    methodVisitor.visitVarInsn(58, UsingJump.this.instrumentedMethod.getStackSize() + 1);
                    methodVisitor.visitVarInsn(25, UsingJump.this.instrumentedMethod.getStackSize() + 1);
                    methodVisitor.visitVarInsn(25, UsingJump.this.instrumentedMethod.getStackSize());
                    methodVisitor.visitJumpInsn(Opcodes.IFNULL, UsingJump.this.secondValueNull);
                    methodVisitor.visitJumpInsn(Opcodes.IFNULL, UsingJump.this.firstValueNull);
                    methodVisitor.visitVarInsn(25, UsingJump.this.instrumentedMethod.getStackSize() + 1);
                    methodVisitor.visitVarInsn(25, UsingJump.this.instrumentedMethod.getStackSize());
                    return new StackManipulation.Size(0, 0);
                }
            }

            @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            protected class AfterInstruction implements StackManipulation {
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && UsingJump.this.equals(UsingJump.this);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + UsingJump.this.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                    return true;
                }

                protected AfterInstruction() {
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
                public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                    methodVisitor.visitJumpInsn(Opcodes.GOTO, UsingJump.this.endOfBlock);
                    methodVisitor.visitLabel(UsingJump.this.secondValueNull);
                    if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6)) {
                        methodVisitor.visitFrame(4, UsingJump.EMPTY.length, UsingJump.EMPTY, UsingJump.REFERENCE.length, UsingJump.REFERENCE);
                    }
                    methodVisitor.visitJumpInsn(Opcodes.IFNULL, UsingJump.this.endOfBlock);
                    methodVisitor.visitLabel(UsingJump.this.firstValueNull);
                    if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6)) {
                        methodVisitor.visitFrame(3, UsingJump.EMPTY.length, UsingJump.EMPTY, UsingJump.EMPTY.length, UsingJump.EMPTY);
                    }
                    methodVisitor.visitInsn(3);
                    methodVisitor.visitInsn(172);
                    methodVisitor.visitLabel(UsingJump.this.endOfBlock);
                    if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6)) {
                        methodVisitor.visitFrame(3, UsingJump.EMPTY.length, UsingJump.EMPTY, UsingJump.EMPTY.length, UsingJump.EMPTY);
                    }
                    return new StackManipulation.Size(0, 0);
                }
            }
        }
    }

    protected enum ValueComparator implements StackManipulation {
        LONG { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitInsn(Opcodes.LCMP);
                return new StackManipulation.Size(-2, 0);
            }
        },
        FLOAT { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitInsn(Opcodes.FCMPL);
                return new StackManipulation.Size(-1, 0);
            }
        },
        DOUBLE { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.3
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitInsn(Opcodes.DCMPL);
                return new StackManipulation.Size(-2, 0);
            }
        },
        BOOLEAN_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.4
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([Z[Z)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        BYTE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.5
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([B[B)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        SHORT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.6
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([S[S)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        CHARACTER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.7
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([C[C)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        INTEGER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.8
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([I[I)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        LONG_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.9
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([J[J)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        FLOAT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.10
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([F[F)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        DOUBLE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.11
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([D[D)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        REFERENCE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.12
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "equals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        NESTED_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.ValueComparator.13
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "deepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", false);
                return new StackManipulation.Size(-1, 0);
            }
        };

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        public static StackManipulation of(TypeDefinition typeDefinition) {
            if (typeDefinition.represents(Boolean.TYPE) || typeDefinition.represents(Byte.TYPE) || typeDefinition.represents(Short.TYPE) || typeDefinition.represents(Character.TYPE) || typeDefinition.represents(Integer.TYPE)) {
                return ConditionalReturn.onNonEqualInteger();
            }
            if (typeDefinition.represents(Long.TYPE)) {
                return new StackManipulation.Compound(LONG, ConditionalReturn.onNonZeroInteger());
            }
            if (typeDefinition.represents(Float.TYPE)) {
                return new StackManipulation.Compound(FLOAT, ConditionalReturn.onNonZeroInteger());
            }
            if (typeDefinition.represents(Double.TYPE)) {
                return new StackManipulation.Compound(DOUBLE, ConditionalReturn.onNonZeroInteger());
            }
            if (typeDefinition.represents(boolean[].class)) {
                return new StackManipulation.Compound(BOOLEAN_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(byte[].class)) {
                return new StackManipulation.Compound(BYTE_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(short[].class)) {
                return new StackManipulation.Compound(SHORT_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(char[].class)) {
                return new StackManipulation.Compound(CHARACTER_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(int[].class)) {
                return new StackManipulation.Compound(INTEGER_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(long[].class)) {
                return new StackManipulation.Compound(LONG_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(float[].class)) {
                return new StackManipulation.Compound(FLOAT_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.represents(double[].class)) {
                return new StackManipulation.Compound(DOUBLE_ARRAY, ConditionalReturn.onZeroInteger());
            }
            if (typeDefinition.isArray()) {
                StackManipulation[] stackManipulationArr = new StackManipulation[2];
                stackManipulationArr[0] = typeDefinition.getComponentType().isArray() ? NESTED_ARRAY : REFERENCE_ARRAY;
                stackManipulationArr[1] = ConditionalReturn.onZeroInteger();
                return new StackManipulation.Compound(stackManipulationArr);
            }
            return new StackManipulation.Compound(MethodInvocation.invoke(EqualsMethod.EQUALS).virtual(typeDefinition.asErasure()), ConditionalReturn.onZeroInteger());
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final StackManipulation baseline;
        private final List<FieldDescription.InDefinedShape> fieldDescriptions;
        private final TypeDescription instrumentedType;
        private final ElementMatcher<? super FieldDescription.InDefinedShape> nonNullable;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.instrumentedType.equals(appender.instrumentedType) && this.baseline.equals(appender.baseline) && this.fieldDescriptions.equals(appender.fieldDescriptions) && this.nonNullable.equals(appender.nonNullable);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode()) * 31) + this.baseline.hashCode()) * 31) + this.fieldDescriptions.hashCode()) * 31) + this.nonNullable.hashCode();
        }

        protected Appender(TypeDescription typeDescription, StackManipulation stackManipulation, List<FieldDescription.InDefinedShape> list, ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
            this.instrumentedType = typeDescription;
            this.baseline = stackManipulation;
            this.fieldDescriptions = list;
            this.nonNullable = elementMatcher;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            if (methodDescription.isStatic()) {
                throw new IllegalStateException("Hash code method must not be static: " + methodDescription);
            }
            if (methodDescription.getParameters().size() != 1 || ((ParameterDescription) methodDescription.getParameters().getOnly()).getType().isPrimitive()) {
                throw new IllegalStateException();
            }
            if (!methodDescription.getReturnType().represents(Boolean.TYPE)) {
                throw new IllegalStateException("Hash code method does not return primitive boolean: " + methodDescription);
            }
            ArrayList arrayList = new ArrayList((this.fieldDescriptions.size() * 8) + 3);
            arrayList.add(this.baseline);
            int i = 0;
            for (FieldDescription.InDefinedShape inDefinedShape : this.fieldDescriptions) {
                arrayList.add(MethodVariableAccess.loadThis());
                arrayList.add(FieldAccess.forField(inDefinedShape).read());
                arrayList.add(MethodVariableAccess.REFERENCE.loadFrom(1));
                arrayList.add(TypeCasting.to(this.instrumentedType));
                arrayList.add(FieldAccess.forField(inDefinedShape).read());
                NullValueGuard usingJump = (inDefinedShape.getType().isPrimitive() || inDefinedShape.getType().isArray() || this.nonNullable.matches(inDefinedShape)) ? NullValueGuard.NoOp.INSTANCE : new NullValueGuard.UsingJump(methodDescription);
                arrayList.add(usingJump.before());
                arrayList.add(ValueComparator.of(inDefinedShape.getType()));
                arrayList.add(usingJump.after());
                i = Math.max(i, usingJump.getRequiredVariablePadding());
            }
            arrayList.add(IntegerConstant.forValue(true));
            arrayList.add(MethodReturn.INTEGER);
            return new ByteCodeAppender.Size(new StackManipulation.Compound(arrayList).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize() + i);
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ConditionalReturn implements StackManipulation {
        private static final Object[] EMPTY = new Object[0];
        private final int jumpCondition;
        private final int value;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ConditionalReturn conditionalReturn = (ConditionalReturn) obj;
            return this.jumpCondition == conditionalReturn.jumpCondition && this.value == conditionalReturn.value;
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.jumpCondition) * 31) + this.value;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected ConditionalReturn(int i) {
            this(i, 3);
        }

        private ConditionalReturn(int i, int i2) {
            this.jumpCondition = i;
            this.value = i2;
        }

        protected static ConditionalReturn onZeroInteger() {
            return new ConditionalReturn(154);
        }

        protected static ConditionalReturn onNonZeroInteger() {
            return new ConditionalReturn(153);
        }

        protected static ConditionalReturn onNullValue() {
            return new ConditionalReturn(Opcodes.IFNONNULL);
        }

        protected static ConditionalReturn onNonIdentity() {
            return new ConditionalReturn(Opcodes.IF_ACMPEQ);
        }

        protected static ConditionalReturn onIdentity() {
            return new ConditionalReturn(Opcodes.IF_ACMPNE);
        }

        protected static ConditionalReturn onNonEqualInteger() {
            return new ConditionalReturn(Opcodes.IF_ICMPEQ);
        }

        protected StackManipulation returningTrue() {
            return new ConditionalReturn(this.jumpCondition, 4);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            Label label = new Label();
            methodVisitor.visitJumpInsn(this.jumpCondition, label);
            methodVisitor.visitInsn(this.value);
            methodVisitor.visitInsn(172);
            methodVisitor.visitLabel(label);
            if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6)) {
                Object[] objArr = EMPTY;
                methodVisitor.visitFrame(3, objArr.length, objArr, objArr.length, objArr);
            }
            return new StackManipulation.Size(-1, 1);
        }
    }

    protected enum TypePropertyComparator implements Comparator<FieldDescription.InDefinedShape> {
        FOR_PRIMITIVE_TYPES { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
                return super.compare(inDefinedShape, inDefinedShape2);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            protected boolean resolve(TypeDefinition typeDefinition) {
                return typeDefinition.isPrimitive();
            }
        },
        FOR_ENUMERATION_TYPES { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
                return super.compare(inDefinedShape, inDefinedShape2);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            protected boolean resolve(TypeDefinition typeDefinition) {
                return typeDefinition.isEnum();
            }
        },
        FOR_STRING_TYPES { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.3
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
                return super.compare(inDefinedShape, inDefinedShape2);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            protected boolean resolve(TypeDefinition typeDefinition) {
                return typeDefinition.represents(String.class);
            }
        },
        FOR_PRIMITIVE_WRAPPER_TYPES { // from class: org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator.4
            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator, java.util.Comparator
            public /* bridge */ /* synthetic */ int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
                return super.compare(inDefinedShape, inDefinedShape2);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.EqualsMethod.TypePropertyComparator
            protected boolean resolve(TypeDefinition typeDefinition) {
                return typeDefinition.asErasure().isPrimitiveWrapper();
            }
        };

        protected abstract boolean resolve(TypeDefinition typeDefinition);

        @Override // java.util.Comparator
        public int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
            if (!resolve(inDefinedShape.getType()) || resolve(inDefinedShape2.getType())) {
                return (resolve(inDefinedShape.getType()) || !resolve(inDefinedShape2.getType())) ? 0 : 1;
            }
            return -1;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class CompoundComparator implements Comparator<FieldDescription.InDefinedShape> {
        private final List<Comparator<? super FieldDescription.InDefinedShape>> comparators;

        @Override // java.util.Comparator
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.comparators.equals(((CompoundComparator) obj).comparators);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.comparators.hashCode();
        }

        protected CompoundComparator(Comparator<? super FieldDescription.InDefinedShape>... comparatorArr) {
            this((List<? extends Comparator<? super FieldDescription.InDefinedShape>>) Arrays.asList(comparatorArr));
        }

        protected CompoundComparator(List<? extends Comparator<? super FieldDescription.InDefinedShape>> list) {
            this.comparators = new ArrayList();
            for (Comparator<? super FieldDescription.InDefinedShape> comparator : list) {
                if (comparator instanceof CompoundComparator) {
                    this.comparators.addAll(((CompoundComparator) comparator).comparators);
                } else if (!(comparator instanceof NaturalOrderComparator)) {
                    this.comparators.add(comparator);
                }
            }
        }

        @Override // java.util.Comparator
        public int compare(FieldDescription.InDefinedShape inDefinedShape, FieldDescription.InDefinedShape inDefinedShape2) {
            Iterator<Comparator<? super FieldDescription.InDefinedShape>> it = this.comparators.iterator();
            while (it.hasNext()) {
                int compare = it.next().compare(inDefinedShape, inDefinedShape2);
                if (compare != 0) {
                    return compare;
                }
            }
            return 0;
        }
    }
}
