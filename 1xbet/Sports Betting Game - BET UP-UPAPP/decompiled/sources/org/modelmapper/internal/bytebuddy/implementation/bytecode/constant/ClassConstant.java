package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import com.ironsource.mediationsdk.logger.IronSourceError;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;

/* loaded from: classes4.dex */
public enum ClassConstant implements StackManipulation {
    VOID(Void.class),
    BOOLEAN(Boolean.class),
    BYTE(Byte.class),
    SHORT(Short.class),
    CHARACTER(Character.class),
    INTEGER(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class);

    private static final String CLASS_TYPE_INTERNAL_NAME = "Ljava/lang/Class;";
    private static final String PRIMITIVE_TYPE_FIELD = "TYPE";
    private static final StackManipulation.Size SIZE = StackSize.SINGLE.toIncreasingSize();
    private final String fieldOwnerInternalName;

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    ClassConstant(Class cls) {
        this.fieldOwnerInternalName = Type.getInternalName(cls);
    }

    public static StackManipulation of(TypeDescription typeDescription) {
        if (!typeDescription.isPrimitive()) {
            return new ForReferenceType(typeDescription);
        }
        if (typeDescription.represents(Boolean.TYPE)) {
            return BOOLEAN;
        }
        if (typeDescription.represents(Byte.TYPE)) {
            return BYTE;
        }
        if (typeDescription.represents(Short.TYPE)) {
            return SHORT;
        }
        if (typeDescription.represents(Character.TYPE)) {
            return CHARACTER;
        }
        if (typeDescription.represents(Integer.TYPE)) {
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
        return VOID;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, this.fieldOwnerInternalName, "TYPE", CLASS_TYPE_INTERNAL_NAME);
        return SIZE;
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class ForReferenceType implements StackManipulation {
        private final TypeDescription typeDescription;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForReferenceType) obj).typeDescription);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return true;
        }

        protected ForReferenceType(TypeDescription typeDescription) {
            this.typeDescription = typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            if (context.getClassFileVersion().isAtLeast(ClassFileVersion.JAVA_V5) && this.typeDescription.isVisibleTo(context.getInstrumentedType())) {
                methodVisitor.visitLdcInsn(Type.getType(this.typeDescription.getDescriptor()));
            } else {
                methodVisitor.visitLdcInsn(this.typeDescription.getName());
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME, "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
            }
            return ClassConstant.SIZE;
        }
    }
}
