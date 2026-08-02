package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.AnnotationVisitor;
import org.modelmapper.internal.asm.FieldVisitor;
import org.modelmapper.internal.asm.Opcodes;
import org.modelmapper.internal.asm.TypePath;

/* loaded from: classes4.dex */
public class FieldRemapper extends FieldVisitor {
    protected final Remapper remapper;

    public FieldRemapper(FieldVisitor fieldVisitor, Remapper remapper) {
        this(Opcodes.ASM6, fieldVisitor, remapper);
    }

    protected FieldRemapper(int i, FieldVisitor fieldVisitor, Remapper remapper) {
        super(i, fieldVisitor);
        this.remapper = remapper;
    }

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor visitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (visitAnnotation == null) {
            return null;
        }
        return new AnnotationRemapper(this.api, visitAnnotation, this.remapper);
    }

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor visitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (visitTypeAnnotation == null) {
            return null;
        }
        return new AnnotationRemapper(this.api, visitTypeAnnotation, this.remapper);
    }
}
