package org.modelmapper.internal.asm.commons;

import java.util.List;
import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Attribute;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.ModuleVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public class ClassRemapper extends ClassVisitor {
    protected String className;
    protected final Remapper remapper;

    public ClassRemapper(ClassVisitor classVisitor, Remapper remapper) {
        this(Opcodes.ASM6, classVisitor, remapper);
    }

    protected ClassRemapper(int i, ClassVisitor classVisitor, Remapper remapper) {
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
        ModuleVisitor visitModule = super.visitModule(this.remapper.mapModuleName(str), i, str2);
        if (visitModule == null) {
            return null;
        }
        return createModuleRemapper(visitModule);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (visitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(visitAnnotation);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (visitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(visitTypeAnnotation);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitAttribute(Attribute attribute) {
        if (attribute instanceof ModuleHashesAttribute) {
            List<String> list = ((ModuleHashesAttribute) attribute).modules;
            for (int i = 0; i < list.size(); i++) {
                list.set(i, this.remapper.mapModuleName(list.get(i)));
            }
        }
        super.visitAttribute(attribute);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        FieldVisitor visitField = super.visitField(i, this.remapper.mapFieldName(this.className, str, str2), this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), this.remapper.mapValue(obj));
        if (visitField == null) {
            return null;
        }
        return createFieldRemapper(visitField);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        MethodVisitor visitMethod = super.visitMethod(i, this.remapper.mapMethodName(this.className, str, str2), this.remapper.mapMethodDesc(str2), this.remapper.mapSignature(str3, false), strArr == null ? null : this.remapper.mapTypes(strArr));
        if (visitMethod == null) {
            return null;
        }
        return createMethodRemapper(visitMethod);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitInnerClass(String str, String str2, String str3, int i) {
        super.visitInnerClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapType(str2), str3, i);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitOuterClass(String str, String str2, String str3) {
        super.visitOuterClass(this.remapper.mapType(str), str2 == null ? null : this.remapper.mapMethodName(str, str2, str3), str3 != null ? this.remapper.mapMethodDesc(str3) : null);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitNestHostExperimental(String str) {
        super.visitNestHostExperimental(this.remapper.mapType(str));
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public void visitNestMemberExperimental(String str) {
        super.visitNestMemberExperimental(this.remapper.mapType(str));
    }

    protected FieldVisitor createFieldRemapper(FieldVisitor fieldVisitor) {
        return new FieldRemapper(this.api, fieldVisitor, this.remapper);
    }

    protected MethodVisitor createMethodRemapper(MethodVisitor methodVisitor) {
        return new MethodRemapper(this.api, methodVisitor, this.remapper);
    }

    protected AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, annotationVisitor, this.remapper);
    }

    protected ModuleVisitor createModuleRemapper(ModuleVisitor moduleVisitor) {
        return new ModuleRemapper(this.api, moduleVisitor, this.remapper);
    }
}
