package org.modelmapper.internal.bytebuddy.utility.visitor;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Attribute;
import org.modelmapper.internal.asm.ClassVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public abstract class MetadataAwareClassVisitor extends ClassVisitor {
    private boolean triggerAttributes;
    private boolean triggerNestHost;
    private boolean triggerOuterClass;

    protected abstract void onAfterAttributes();

    protected abstract void onNestHost();

    protected abstract void onOuterType();

    protected MetadataAwareClassVisitor(int i, ClassVisitor classVisitor) {
        super(i, classVisitor);
        this.triggerNestHost = true;
        this.triggerOuterClass = true;
        this.triggerAttributes = true;
    }

    private void considerTriggerNestHost() {
        if (this.triggerNestHost) {
            this.triggerNestHost = false;
            onNestHost();
        }
    }

    private void considerTriggerOuterClass() {
        if (this.triggerOuterClass) {
            this.triggerOuterClass = false;
            onOuterType();
        }
    }

    private void considerTriggerAfterAttributes() {
        if (this.triggerAttributes) {
            this.triggerAttributes = false;
            onAfterAttributes();
        }
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitNestHostExperimental(String str) {
        this.triggerNestHost = false;
        onVisitNestHost(str);
    }

    protected void onVisitNestHost(String str) {
        super.visitNestHostExperimental(str);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        considerTriggerNestHost();
        this.triggerOuterClass = false;
        onVisitOuterClass(str, str2, str3);
    }

    protected void onVisitOuterClass(String str, String str2, String str3) {
        super.visitOuterClass(str, str2, str3);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final AnnotationVisitor visitAnnotation(String str, boolean z) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        return onVisitAnnotation(str, z);
    }

    protected AnnotationVisitor onVisitAnnotation(String str, boolean z) {
        return super.visitAnnotation(str, z);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        return onVisitTypeAnnotation(i, typePath, str, z);
    }

    protected AnnotationVisitor onVisitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        return super.visitTypeAnnotation(i, typePath, str, z);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        onVisitAttribute(attribute);
    }

    protected void onVisitAttribute(Attribute attribute) {
        super.visitAttribute(attribute);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitNestMemberExperimental(String str) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        considerTriggerAfterAttributes();
        onVisitNestMember(str);
    }

    protected void onVisitNestMember(String str) {
        super.visitNestMemberExperimental(str);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        considerTriggerAfterAttributes();
        onVisitInnerClass(str, str2, str3, i);
    }

    protected void onVisitInnerClass(String str, String str2, String str3, int i) {
        super.visitInnerClass(str, str2, str3, i);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final FieldVisitor visitField(int i, String str, String str2, String str3, Object obj) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        considerTriggerAfterAttributes();
        return onVisitField(i, str, str2, str3, obj);
    }

    protected FieldVisitor onVisitField(int i, String str, String str2, String str3, Object obj) {
        return super.visitField(i, str, str2, str3, obj);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i, String str, String str2, String str3, String[] strArr) {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        considerTriggerAfterAttributes();
        return onVisitMethod(i, str, str2, str3, strArr);
    }

    protected MethodVisitor onVisitMethod(int i, String str, String str2, String str3, String[] strArr) {
        return super.visitMethod(i, str, str2, str3, strArr);
    }

    @Override // org.modelmapper.internal.asm.ClassVisitor
    public final void visitEnd() {
        considerTriggerNestHost();
        considerTriggerOuterClass();
        considerTriggerAfterAttributes();
        onVisitEnd();
    }

    protected void onVisitEnd() {
        super.visitEnd();
    }
}
