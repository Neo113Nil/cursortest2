package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Opcodes;

/* loaded from: classes4.dex */
public class AnnotationRemapper extends AnnotationVisitor {
    protected final Remapper remapper;

    public AnnotationRemapper(AnnotationVisitor annotationVisitor, Remapper remapper) {
        this(Opcodes.ASM6, annotationVisitor, remapper);
    }

    protected AnnotationRemapper(int i, AnnotationVisitor annotationVisitor, Remapper remapper) {
        super(i, annotationVisitor);
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        super.visit(str, this.remapper.mapValue(obj));
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        super.visitEnum(str, this.remapper.mapDesc(str2), str3);
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(str, this.remapper.mapDesc(str2));
        if (visitAnnotation == null) {
            return null;
        }
        return visitAnnotation == this.av ? this : new AnnotationRemapper(this.api, visitAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor visitArray = super.visitArray(str);
        if (visitArray == null) {
            return null;
        }
        return visitArray == this.av ? this : new AnnotationRemapper(this.api, visitArray, this.remapper);
    }
}
