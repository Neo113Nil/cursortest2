package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Addition;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Multiplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class HashCodeMethod implements Implementation {
    private static final int DEFAULT_MULTIPLIER = 31;
    private static final int DEFAULT_OFFSET = 17;
    private static final MethodDescription.InDefinedShape HASH_CODE = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(Object.class).getDeclaredMethods().filter(ElementMatchers.isHashCode()).getOnly();
    private final ElementMatcher.Junction<? super FieldDescription.InDefinedShape> ignored;
    private final int multiplier;
    private final ElementMatcher.Junction<? super FieldDescription.InDefinedShape> nonNullable;
    private final OffsetProvider offsetProvider;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HashCodeMethod hashCodeMethod = (HashCodeMethod) obj;
        return this.offsetProvider.equals(hashCodeMethod.offsetProvider) && this.multiplier == hashCodeMethod.multiplier && this.ignored.equals(hashCodeMethod.ignored) && this.nonNullable.equals(hashCodeMethod.nonNullable);
    }

    public int hashCode() {
        return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.offsetProvider.hashCode()) * 31) + this.multiplier) * 31) + this.ignored.hashCode()) * 31) + this.nonNullable.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    protected HashCodeMethod(OffsetProvider offsetProvider) {
        this(offsetProvider, 31, ElementMatchers.none(), ElementMatchers.none());
    }

    private HashCodeMethod(OffsetProvider offsetProvider, int i, ElementMatcher.Junction<? super FieldDescription.InDefinedShape> junction, ElementMatcher.Junction<? super FieldDescription.InDefinedShape> junction2) {
        this.offsetProvider = offsetProvider;
        this.multiplier = i;
        this.ignored = junction;
        this.nonNullable = junction2;
    }

    public static HashCodeMethod usingSuperClassOffset() {
        return new HashCodeMethod(OffsetProvider.ForSuperMethodCall.INSTANCE);
    }

    public static HashCodeMethod usingDefaultOffset() {
        return usingOffset(17);
    }

    public static HashCodeMethod usingOffset(int i) {
        return new HashCodeMethod(new OffsetProvider.ForFixedValue(i));
    }

    public HashCodeMethod withIgnoredFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new HashCodeMethod(this.offsetProvider, this.multiplier, this.ignored.or(elementMatcher), this.nonNullable);
    }

    public HashCodeMethod withNonNullableFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new HashCodeMethod(this.offsetProvider, this.multiplier, this.ignored, this.nonNullable.or(elementMatcher));
    }

    public Implementation withMultiplier(int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Hash code multiplier must not be zero");
        }
        return new HashCodeMethod(this.offsetProvider, i, this.ignored, this.nonNullable);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        if (target.getInstrumentedType().isInterface()) {
            throw new IllegalStateException("Cannot implement meaningful hash code method for " + target.getInstrumentedType());
        }
        return new Appender(this.offsetProvider.resolve(target.getInstrumentedType()), this.multiplier, target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.not(ElementMatchers.isStatic().or(this.ignored))), this.nonNullable);
    }

    protected interface OffsetProvider {
        StackManipulation resolve(TypeDescription typeDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements OffsetProvider {
            private final int value;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.value == ((ForFixedValue) obj).value;
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value;
            }

            protected ForFixedValue(int i) {
                this.value = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public StackManipulation resolve(TypeDescription typeDescription) {
                return IntegerConstant.forValue(this.value);
            }
        }

        public enum ForSuperMethodCall implements OffsetProvider {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.OffsetProvider
            public StackManipulation resolve(TypeDescription typeDescription) {
                TypeDescription.Generic superClass = typeDescription.getSuperClass();
                if (superClass == null) {
                    throw new IllegalStateException(typeDescription + " does not declare a super class");
                }
                return new StackManipulation.Compound(MethodVariableAccess.loadThis(), MethodInvocation.invoke(HashCodeMethod.HASH_CODE).special(superClass.asErasure()));
            }
        }
    }

    protected interface NullValueGuard {
        StackManipulation after();

        StackManipulation before();

        int getRequiredVariablePadding();

        public enum NoOp implements NullValueGuard {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public StackManipulation before() {
                return StackManipulation.Trivial.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public StackManipulation after() {
                return StackManipulation.Trivial.INSTANCE;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                return StackSize.ZERO.getSize();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class UsingJump implements NullValueGuard {
            private static final Object[] EMPTY = new Object[0];
            private static final Object[] INTEGER = {Opcodes.INTEGER};
            private final MethodDescription instrumentedMethod;
            private final Label label = new Label();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UsingJump usingJump = (UsingJump) obj;
                return this.instrumentedMethod.equals(usingJump.instrumentedMethod) && this.label.equals(usingJump.label);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public int getRequiredVariablePadding() {
                return 1;
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedMethod.hashCode()) * 31) + this.label.hashCode();
            }

            protected UsingJump(MethodDescription methodDescription) {
                this.instrumentedMethod = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
            public StackManipulation before() {
                return new BeforeInstruction();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.NullValueGuard
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
                    methodVisitor.visitVarInsn(25, UsingJump.this.instrumentedMethod.getStackSize());
                    methodVisitor.visitJumpInsn(Opcodes.IFNULL, UsingJump.this.label);
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
                    methodVisitor.visitLabel(UsingJump.this.label);
                    if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V6)) {
                        methodVisitor.visitFrame(4, UsingJump.EMPTY.length, UsingJump.EMPTY, UsingJump.INTEGER.length, UsingJump.INTEGER);
                    }
                    return new StackManipulation.Size(0, 0);
                }
            }
        }
    }

    protected enum ValueTransformer implements StackManipulation {
        LONG { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitInsn(92);
                methodVisitor.visitIntInsn(16, 32);
                methodVisitor.visitInsn(125);
                methodVisitor.visitInsn(131);
                methodVisitor.visitInsn(136);
                return new StackManipulation.Size(-1, 3);
            }
        },
        FLOAT { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "floatToIntBits", "(F)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        DOUBLE { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.3
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "doubleToLongBits", "(D)J", false);
                methodVisitor.visitInsn(92);
                methodVisitor.visitIntInsn(16, 32);
                methodVisitor.visitInsn(125);
                methodVisitor.visitInsn(131);
                methodVisitor.visitInsn(136);
                return new StackManipulation.Size(-1, 3);
            }
        },
        BOOLEAN_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.4
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([Z)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        BYTE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.5
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([B)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        SHORT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.6
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([S)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        CHARACTER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.7
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([C)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        INTEGER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.8
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([I)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        LONG_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.9
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([J)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        FLOAT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.10
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([F)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        DOUBLE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.11
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([D)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        REFERENCE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.12
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "hashCode", "([Ljava/lang/Object;)I", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        NESTED_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.HashCodeMethod.ValueTransformer.13
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "deepHashCode", "([Ljava/lang/Object;)I", false);
                return new StackManipulation.Size(0, 0);
            }
        };

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        public static StackManipulation of(TypeDefinition typeDefinition) {
            if (typeDefinition.represents(Boolean.TYPE) || typeDefinition.represents(Byte.TYPE) || typeDefinition.represents(Short.TYPE) || typeDefinition.represents(Character.TYPE) || typeDefinition.represents(Integer.TYPE)) {
                return StackManipulation.Trivial.INSTANCE;
            }
            if (typeDefinition.represents(Long.TYPE)) {
                return LONG;
            }
            if (typeDefinition.represents(Float.TYPE)) {
                return FLOAT;
            }
            if (typeDefinition.represents(Double.TYPE)) {
                return DOUBLE;
            }
            if (typeDefinition.represents(boolean[].class)) {
                return BOOLEAN_ARRAY;
            }
            if (typeDefinition.represents(byte[].class)) {
                return BYTE_ARRAY;
            }
            if (typeDefinition.represents(short[].class)) {
                return SHORT_ARRAY;
            }
            if (typeDefinition.represents(char[].class)) {
                return CHARACTER_ARRAY;
            }
            if (typeDefinition.represents(int[].class)) {
                return INTEGER_ARRAY;
            }
            if (typeDefinition.represents(long[].class)) {
                return LONG_ARRAY;
            }
            if (typeDefinition.represents(float[].class)) {
                return FLOAT_ARRAY;
            }
            if (typeDefinition.represents(double[].class)) {
                return DOUBLE_ARRAY;
            }
            if (typeDefinition.isArray()) {
                return typeDefinition.getComponentType().isArray() ? NESTED_ARRAY : REFERENCE_ARRAY;
            }
            return MethodInvocation.invoke(HashCodeMethod.HASH_CODE).virtual(typeDefinition.asErasure());
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final List<FieldDescription.InDefinedShape> fieldDescriptions;
        private final StackManipulation initialValue;
        private final int multiplier;
        private final ElementMatcher<? super FieldDescription.InDefinedShape> nonNullable;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.initialValue.equals(appender.initialValue) && this.multiplier == appender.multiplier && this.fieldDescriptions.equals(appender.fieldDescriptions) && this.nonNullable.equals(appender.nonNullable);
        }

        public int hashCode() {
            return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.initialValue.hashCode()) * 31) + this.multiplier) * 31) + this.fieldDescriptions.hashCode()) * 31) + this.nonNullable.hashCode();
        }

        protected Appender(StackManipulation stackManipulation, int i, List<FieldDescription.InDefinedShape> list, ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
            this.initialValue = stackManipulation;
            this.multiplier = i;
            this.fieldDescriptions = list;
            this.nonNullable = elementMatcher;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            if (methodDescription.isStatic()) {
                throw new IllegalStateException("Hash code method must not be static: " + methodDescription);
            }
            if (!methodDescription.getReturnType().represents(Integer.TYPE)) {
                throw new IllegalStateException("Hash code method does not return primitive integer: " + methodDescription);
            }
            ArrayList arrayList = new ArrayList((this.fieldDescriptions.size() * 8) + 2);
            arrayList.add(this.initialValue);
            int i = 0;
            for (FieldDescription.InDefinedShape inDefinedShape : this.fieldDescriptions) {
                arrayList.add(IntegerConstant.forValue(this.multiplier));
                arrayList.add(Multiplication.INTEGER);
                arrayList.add(MethodVariableAccess.loadThis());
                arrayList.add(FieldAccess.forField(inDefinedShape).read());
                NullValueGuard usingJump = (inDefinedShape.getType().isPrimitive() || inDefinedShape.getType().isArray() || this.nonNullable.matches(inDefinedShape)) ? NullValueGuard.NoOp.INSTANCE : new NullValueGuard.UsingJump(methodDescription);
                arrayList.add(usingJump.before());
                arrayList.add(ValueTransformer.of(inDefinedShape.getType()));
                arrayList.add(Addition.INTEGER);
                arrayList.add(usingJump.after());
                i = Math.max(i, usingJump.getRequiredVariablePadding());
            }
            arrayList.add(MethodReturn.INTEGER);
            return new ByteCodeAppender.Size(new StackManipulation.Compound(arrayList).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize() + i);
        }
    }
}
