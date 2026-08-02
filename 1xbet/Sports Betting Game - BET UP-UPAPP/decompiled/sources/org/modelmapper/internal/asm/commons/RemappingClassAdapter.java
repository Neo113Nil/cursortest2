package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.ModuleVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

@Deprecated
/* loaded from: classes4.dex */
public class RemappingClassAdapter extends ClassVisitor {
    protected String className;
    protected final Remapper remapper;

    public RemappingClassAdapter(ClassVisitor classVisitor, Remapper remapper) {
        this(Opcodes.ASM6, classVisitor, remapper);
    }

    protected RemappingClassAdapter(int i, ClassVisitor classVisitor, Remapper remapper) {
        super(i, classVisitor);
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visit(int i, int i2, String str, String str2, String str3, String[] strArr) {
        this.className = str;
        super.visit(i, i2, this.remapper.mapType(str), this.remapper.mapSignature(str2, false), this.remapper.mapType(str3), strArr == null ? null : this.remapper.mapTypes(strArr));
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public ModuleVisitor visitModule(String str, int i, String str2) {
        throw new RuntimeException("RemappingClassAdapter is deprecated, use ClassRemapper instead");
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (visitAnnotation == null) {
            return null;
        }
        return createRemappingAnnotationAdapter(visitAnnotation);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (visitTypeAnnotation == null) {
            return null;
        }
        return createRemappingAnnotationAdapter(visitTypeAnnotation);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldVisitor visitField = super.visitField(i, this.remapper.mapFieldName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), this.remapper.mapValue(obj));
        if (visitField == null) {
            return null;
        }
        return createRemappingFieldAdapter(visitField);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        String mapMethodDesc = this.remapper.mapMethodDesc(str2);
        MethodVisitor visitMethod = super.visitMethod(i, this.remapper.mapMethodName(this.className, str, str2), mapMethodDesc, this.remapper.mapSignature(str3, false), strArr == null ? null : this.remapper.mapTypes(strArr));
        if (visitMethod == null) {
            return null;
        }
        return createRemappingMethodAdapter(i, mapMethodDesc, visitMethod);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        super.visitInnerClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapType(str2), str3, i);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        super.visitOuterClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapMethodName(str, str2, str3), str3 != null ? this.remapper.mapMethodDesc(str3) : null);
    }

    protected FieldVisitor createRemappingFieldAdapter(FieldVisitor fieldVisitor) {
        return new RemappingFieldAdapter(fieldVisitor, this.remapper);
    }

    protected MethodVisitor createRemappingMethodAdapter(int i, String str, MethodVisitor methodVisitor) {
        return new RemappingMethodAdapter(i, str, methodVisitor, this.remapper);
    }

    protected AnnotationVisitor createRemappingAnnotationAdapter(AnnotationVisitor annotationVisitor) {
        return new RemappingAnnotationAdapter(annotationVisitor, this.remapper);
    }
}
