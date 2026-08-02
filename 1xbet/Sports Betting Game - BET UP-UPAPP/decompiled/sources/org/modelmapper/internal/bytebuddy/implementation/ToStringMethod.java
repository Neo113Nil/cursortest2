package org.modelmapper.internal.bytebuddy.implementation;

import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class ToStringMethod implements Implementation {
    private static final MethodDescription.InDefinedShape STRING_BUILDER_CONSTRUCTOR = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(StringBuilder.class).getDeclaredMethods().filter(ElementMatchers.isConstructor().and(ElementMatchers.takesArguments((Class<?>[]) new Class[]{String.class}))).getOnly();
    private static final MethodDescription.InDefinedShape TO_STRING = (MethodDescription.InDefinedShape) TypeDescription.ForLoadedType.of(StringBuilder.class).getDeclaredMethods().filter(ElementMatchers.isToString()).getOnly();
    private final String definer;
    private final String end;
    private final ElementMatcher.Junction<? super FieldDescription.InDefinedShape> ignored;
    private final PrefixResolver prefixResolver;
    private final String separator;
    private final String start;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ToStringMethod toStringMethod = (ToStringMethod) obj;
        return this.prefixResolver.equals(toStringMethod.prefixResolver) && this.start.equals(toStringMethod.start) && this.end.equals(toStringMethod.end) && this.separator.equals(toStringMethod.separator) && this.definer.equals(toStringMethod.definer) && this.ignored.equals(toStringMethod.ignored);
    }

    public int hashCode() {
        return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefixResolver.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + this.separator.hashCode()) * 31) + this.definer.hashCode()) * 31) + this.ignored.hashCode();
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        return instrumentedType;
    }

    protected ToStringMethod(PrefixResolver prefixResolver) {
        this(prefixResolver, "{", "}", ", ", X3.j.b, ElementMatchers.none());
    }

    private ToStringMethod(PrefixResolver prefixResolver, String str, String str2, String str3, String str4, ElementMatcher.Junction<? super FieldDescription.InDefinedShape> junction) {
        this.prefixResolver = prefixResolver;
        this.start = str;
        this.end = str2;
        this.separator = str3;
        this.definer = str4;
        this.ignored = junction;
    }

    public static ToStringMethod prefixedByFullyQualifiedClassName() {
        return prefixedBy(PrefixResolver.Default.FULLY_QUALIFIED_CLASS_NAME);
    }

    public static ToStringMethod prefixedByCanonicalClassName() {
        return prefixedBy(PrefixResolver.Default.CANONICAL_CLASS_NAME);
    }

    public static ToStringMethod prefixedBySimpleClassName() {
        return prefixedBy(PrefixResolver.Default.SIMPLE_CLASS_NAME);
    }

    public static ToStringMethod prefixedBy(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Prefix cannot be null");
        }
        return prefixedBy(new PrefixResolver.ForFixedValue(str));
    }

    public static ToStringMethod prefixedBy(PrefixResolver prefixResolver) {
        return new ToStringMethod(prefixResolver);
    }

    public ToStringMethod withIgnoredFields(ElementMatcher<? super FieldDescription.InDefinedShape> elementMatcher) {
        return new ToStringMethod(this.prefixResolver, this.start, this.end, this.separator, this.definer, this.ignored.or(elementMatcher));
    }

    public Implementation withTokens(String str, String str2, String str3, String str4) {
        if (str == null || str2 == null || str3 == null || str4 == null) {
            throw new IllegalArgumentException("Token values cannot be null");
        }
        return new ToStringMethod(this.prefixResolver, str, str2, str3, str4, this.ignored);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public Appender appender(Implementation.Target target) {
        if (target.getInstrumentedType().isInterface()) {
            throw new IllegalStateException("Cannot implement meaningful toString method for " + target.getInstrumentedType());
        }
        String resolve = this.prefixResolver.resolve(target.getInstrumentedType());
        if (resolve == null) {
            throw new IllegalStateException("Prefix for toString method cannot be null");
        }
        return new Appender(resolve, this.start, this.end, this.separator, this.definer, target.getInstrumentedType().getDeclaredFields().filter(ElementMatchers.not(ElementMatchers.isStatic().or(this.ignored))));
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Appender implements ByteCodeAppender {
        private final String definer;
        private final String end;
        private final List<? extends FieldDescription.InDefinedShape> fieldDescriptions;
        private final String prefix;
        private final String separator;
        private final String start;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.prefix.equals(appender.prefix) && this.start.equals(appender.start) && this.end.equals(appender.end) && this.separator.equals(appender.separator) && this.definer.equals(appender.definer) && this.fieldDescriptions.equals(appender.fieldDescriptions);
        }

        public int hashCode() {
            return ((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefix.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + this.separator.hashCode()) * 31) + this.definer.hashCode()) * 31) + this.fieldDescriptions.hashCode();
        }

        protected Appender(String str, String str2, String str3, String str4, String str5, List<? extends FieldDescription.InDefinedShape> list) {
            this.prefix = str;
            this.start = str2;
            this.end = str3;
            this.separator = str4;
            this.definer = str5;
            this.fieldDescriptions = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            if (methodDescription.isStatic()) {
                throw new IllegalStateException("toString method must not be static: " + methodDescription);
            }
            if (!methodDescription.getReturnType().asErasure().isAssignableFrom(String.class)) {
                throw new IllegalStateException("toString method does not return String-compatible type: " + methodDescription);
            }
            ArrayList arrayList = new ArrayList(Math.max(0, (this.fieldDescriptions.size() * 7) - 2) + 10);
            arrayList.add(TypeCreation.of(TypeDescription.ForLoadedType.of(StringBuilder.class)));
            arrayList.add(Duplication.SINGLE);
            arrayList.add(new TextConstant(this.prefix));
            arrayList.add(MethodInvocation.invoke(ToStringMethod.STRING_BUILDER_CONSTRUCTOR));
            arrayList.add(new TextConstant(this.start));
            arrayList.add(ValueConsumer.STRING);
            boolean z = true;
            for (FieldDescription.InDefinedShape inDefinedShape : this.fieldDescriptions) {
                if (z) {
                    z = false;
                } else {
                    arrayList.add(new TextConstant(this.separator));
                    arrayList.add(ValueConsumer.STRING);
                }
                arrayList.add(new TextConstant(inDefinedShape.getName() + this.definer));
                arrayList.add(ValueConsumer.STRING);
                arrayList.add(MethodVariableAccess.loadThis());
                arrayList.add(FieldAccess.forField(inDefinedShape).read());
                arrayList.add(ValueConsumer.of(inDefinedShape.getType().asErasure()));
            }
            arrayList.add(new TextConstant(this.end));
            arrayList.add(ValueConsumer.STRING);
            arrayList.add(MethodInvocation.invoke(ToStringMethod.TO_STRING));
            arrayList.add(MethodReturn.REFERENCE);
            return new ByteCodeAppender.Size(new StackManipulation.Compound(arrayList).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }
    }

    public interface PrefixResolver {

        public enum Default implements PrefixResolver {
            FULLY_QUALIFIED_CLASS_NAME { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.1
                @Override // org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver
                public String resolve(TypeDescription typeDescription) {
                    return typeDescription.getName();
                }
            },
            CANONICAL_CLASS_NAME { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.2
                @Override // org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver
                public String resolve(TypeDescription typeDescription) {
                    return typeDescription.getCanonicalName();
                }
            },
            SIMPLE_CLASS_NAME { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.3
                @Override // org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver
                public String resolve(TypeDescription typeDescription) {
                    return typeDescription.getSimpleName();
                }
            }
        }

        String resolve(TypeDescription typeDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements PrefixResolver {
            private final String prefix;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.prefix.equals(((ForFixedValue) obj).prefix);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.prefix.hashCode();
            }

            protected ForFixedValue(String str) {
                this.prefix = str;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.PrefixResolver
            public String resolve(TypeDescription typeDescription) {
                return this.prefix;
            }
        }
    }

    protected enum ValueConsumer implements StackManipulation {
        BOOLEAN { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        CHARACTER { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        INTEGER { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.3
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(I)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        LONG { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.4
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(J)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        FLOAT { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.5
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(F)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        DOUBLE { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.6
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(D)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(-1, 0);
            }
        },
        STRING { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.7
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        CHARACTER_SEQUENCE { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.8
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        OBJECT { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.9
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        BOOLEAN_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.10
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([Z)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        BYTE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.11
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([B)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        SHORT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.12
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([S)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        CHARACTER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.13
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([C)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        INTEGER_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.14
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([I)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        LONG_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.15
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([J)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        FLOAT_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.16
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([F)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        DOUBLE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.17
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([D)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        REFERENCE_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.18
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "toString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        },
        NESTED_ARRAY { // from class: org.modelmapper.internal.bytebuddy.implementation.ToStringMethod.ValueConsumer.19
            @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
            public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/util/Arrays", "deepToString", "([Ljava/lang/Object;)Ljava/lang/String;", false);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
                return new StackManipulation.Size(0, 0);
            }
        };

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected static StackManipulation of(TypeDescription typeDescription) {
            if (typeDescription.represents(Boolean.TYPE)) {
                return BOOLEAN;
            }
            if (typeDescription.represents(Character.TYPE)) {
                return CHARACTER;
            }
            if (typeDescription.represents(Byte.TYPE) || typeDescription.represents(Short.TYPE) || typeDescription.represents(Integer.TYPE)) {
                return INTEGER;
            }
            if (typeDescription.represents(Long.TYPE)) {
                return LONG;
            }
            if (typeDescription.represents(Float.TYPE)) {
                return FLOAT;
            }
            if (typeDescription.represents(Double.TYPE)) {
                return DOUBLE;
            }
            if (typeDescription.represents(String.class)) {
                return STRING;
            }
            if (typeDescription.isAssignableTo(CharSequence.class)) {
                return CHARACTER_SEQUENCE;
            }
            if (typeDescription.represents(boolean[].class)) {
                return BOOLEAN_ARRAY;
            }
            if (typeDescription.represents(byte[].class)) {
                return BYTE_ARRAY;
            }
            if (typeDescription.represents(short[].class)) {
                return SHORT_ARRAY;
            }
            if (typeDescription.represents(char[].class)) {
                return CHARACTER_ARRAY;
            }
            if (typeDescription.represents(int[].class)) {
                return INTEGER_ARRAY;
            }
            if (typeDescription.represents(long[].class)) {
                return LONG_ARRAY;
            }
            if (typeDescription.represents(float[].class)) {
                return FLOAT_ARRAY;
            }
            if (typeDescription.represents(double[].class)) {
                return DOUBLE_ARRAY;
            }
            if (typeDescription.isArray()) {
                return typeDescription.getComponentType().isArray() ? NESTED_ARRAY : REFERENCE_ARRAY;
            }
            return OBJECT;
        }
    }
}
