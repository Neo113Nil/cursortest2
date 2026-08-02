package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Handle;
import org.modelmapper.internal.asm.Label;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public class MethodRemapper extends MethodVisitor {
    protected final Remapper remapper;

    public MethodRemapper(MethodVisitor methodVisitor, Remapper remapper) {
        this(Opcodes.ASM6, methodVisitor, remapper);
    }

    protected MethodRemapper(int i, MethodVisitor methodVisitor, Remapper remapper) {
        super(i, methodVisitor);
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        AnnotationVisitor visitAnnotationDefault = super.visitAnnotationDefault();
        return visitAnnotationDefault == null ? visitAnnotationDefault : new AnnotationRemapper(this.api, visitAnnotationDefault, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        return visitAnnotation == null ? visitAnnotation : new AnnotationRemapper(this.api, visitAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return visitTypeAnnotation == null ? visitTypeAnnotation : new AnnotationRemapper(this.api, visitTypeAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        AnnotationVisitor visitParameterAnnotation = super.visitParameterAnnotation(i, this.remapper.mapDesc(str), z);
        return visitParameterAnnotation == null ? visitParameterAnnotation : new AnnotationRemapper(this.api, visitParameterAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super.visitFrame(i, i2, remapFrameTypes(i2, objArr), i3, remapFrameTypes(i3, objArr2));
    }

    private Object[] remapFrameTypes(int i, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i];
                    System.arraycopy(objArr, 0, objArr2, 0, i);
                }
                objArr2[i2] = this.remapper.mapType((String) objArr[i2]);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, this.remapper.mapType(str), this.remapper.mapFieldName(str, str2, str3), this.remapper.mapDesc(str3));
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    @Deprecated
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        if (this.api >= 327680) {
            super.visitMethodInsn(i, str, str2, str3);
        } else {
            doVisitMethodInsn(i, str, str2, str3, i == 185);
        }
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api < 327680) {
            super.visitMethodInsn(i, str, str2, str3, z);
        } else {
            doVisitMethodInsn(i, str, str2, str3, z);
        }
    }

    private void doVisitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.mv != null) {
            this.mv.visitMethodInsn(i, this.remapper.mapType(str), this.remapper.mapMethodName(str, str2, str3), this.remapper.mapMethodDesc(str3), z);
        }
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        Object[] objArr2 = new Object[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            objArr2[i] = this.remapper.mapValue(objArr[i]);
        }
        super.visitInvokeDynamicInsn(this.remapper.mapInvokeDynamicMethodName(str, str2), this.remapper.mapMethodDesc(str2), (Handle) this.remapper.mapValue(handle), objArr2);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        super.visitTypeInsn(i, this.remapper.mapType(str));
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(this.remapper.mapValue(obj));
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(this.remapper.mapDesc(str), i);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitInsnAnnotation = super.visitInsnAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return visitInsnAnnotation == null ? visitInsnAnnotation : new AnnotationRemapper(this.api, visitInsnAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str == null ? null : this.remapper.mapType(str));
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitTryCatchAnnotation = super.visitTryCatchAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return visitTryCatchAnnotation == null ? visitTryCatchAnnotation : new AnnotationRemapper(this.api, visitTryCatchAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        super.visitLocalVariable(str, this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), label, label2, i);
    }

    @Override // org.modelmapper.internal.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        AnnotationVisitor visitLocalVariableAnnotation = super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, this.remapper.mapDesc(str), z);
        return visitLocalVariableAnnotation == null ? visitLocalVariableAnnotation : new AnnotationRemapper(this.api, visitLocalVariableAnnotation, this.remapper);
    }
}
