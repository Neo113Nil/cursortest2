package org.modelmapper.internal.bytebuddy.asm;

import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.Type;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.OpenedClassReader;

/* loaded from: classes4.dex */
public enum TypeConstantAdjustment implements AsmVisitorWrapper {
    INSTANCE;

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public int mergeReader(int i) {
        return i;
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public int mergeWriter(int i) {
        return i;
    }

    @Override // org.modelmapper.internal.bytebuddy.asm.AsmVisitorWrapper
    public ClassVisitor wrap(TypeDescription typeDescription, ClassVisitor classVisitor, Implementation.Context context, TypePool typePool, FieldList<FieldDescription.InDefinedShape> fieldList, MethodList<?> methodList, int i, int i2) {
        return new TypeConstantDissolvingClassVisitor(classVisitor);
    }

    protected static class TypeConstantDissolvingClassVisitor extends ClassVisitor {
        private boolean supportsTypeConstants;

        protected TypeConstantDissolvingClassVisitor(ClassVisitor classVisitor) {
            super(OpenedClassReader.ASM_API, classVisitor);
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
            this.supportsTypeConstants = ClassFileVersion.ofMinorMajor(i).isAtLeast(ClassFileVersion.JAVA_V5);
            super.visit(i, i2, str, str2, str3, strArr);
        }

        @Override // org.modelmapper.internal.asm.ClassVisitor
        public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
            MethodVisitor visitMethod = super.visitMethod(i, str, str2, str3, strArr);
            return (this.supportsTypeConstants || visitMethod == null) ? visitMethod : new TypeConstantDissolvingMethodVisitor(visitMethod);
        }

        protected static class TypeConstantDissolvingMethodVisitor extends MethodVisitor {
            private static final String DESCRIPTOR = "(Ljava/lang/String;)Ljava/lang/Class;";
            private static final String FOR_NAME = "forName";
            private static final String JAVA_LANG_CLASS = "java/lang/Class";

            protected TypeConstantDissolvingMethodVisitor(MethodVisitor methodVisitor) {
                super(OpenedClassReader.ASM_API, methodVisitor);
            }

            @Override // org.modelmapper.internal.asm.MethodVisitor
            public void visitLdcInsn(Object obj) {
                Type type;
                int sort;
                if ((obj instanceof Type) && ((sort = (type = (Type) obj).getSort()) == 9 || sort == 10)) {
                    super.visitLdcInsn(type.getInternalName().replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    super.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Class", FOR_NAME, DESCRIPTOR, false);
                } else {
                    super.visitLdcInsn(obj);
                }
            }
        }
    }
}
