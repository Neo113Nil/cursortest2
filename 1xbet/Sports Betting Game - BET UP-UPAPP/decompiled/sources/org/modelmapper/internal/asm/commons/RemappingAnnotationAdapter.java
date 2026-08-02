package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.Opcodes;

@Deprecated
/* loaded from: classes4.dex */
public class RemappingAnnotationAdapter extends AnnotationVisitor {
    protected final Remapper remapper;

    public RemappingAnnotationAdapter(AnnotationVisitor annotationVisitor, Remapper remapper) {
        this(Opcodes.ASM6, annotationVisitor, remapper);
    }

    protected RemappingAnnotationAdapter(int i, AnnotationVisitor annotationVisitor, Remapper remapper) {
        super(i, annotationVisitor);
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public void visit(String str, Object obj) {
        this.av.visit(str, this.remapper.mapValue(obj));
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public void visitEnum(String str, String str2, String str3) {
        this.av.visitEnum(str, this.remapper.mapDesc(str2), str3);
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor visitAnnotation = this.av.visitAnnotation(str, this.remapper.mapDesc(str2));
        if (visitAnnotation == null) {
            return null;
        }
        return visitAnnotation == this.av ? this : new RemappingAnnotationAdapter(visitAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.AnnotationVisitor
    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor visitArray = this.av.visitArray(str);
        if (visitArray == null) {
            return null;
        }
        return visitArray == this.av ? this : new RemappingAnnotationAdapter(visitArray, this.remapper);
    }
}
