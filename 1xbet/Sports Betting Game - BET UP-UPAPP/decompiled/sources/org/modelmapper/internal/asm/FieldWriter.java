package org.modelmapper.internal.asm;

import org.modelmapper.internal.asm.Attribute;

/* loaded from: classes4.dex */
final class FieldWriter extends FieldVisitor {
    private final int accessFlags;
    private int constantValueIndex;
    private final int descriptorIndex;
    private Attribute firstAttribute;
    private AnnotationWriter lastRuntimeInvisibleAnnotation;
    private AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private AnnotationWriter lastRuntimeVisibleAnnotation;
    private AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private final int nameIndex;
    private int signatureIndex;
    private final SymbolTable symbolTable;

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public void visitEnd() {
    }

    FieldWriter(SymbolTable symbolTable, int i, String str, String str2, String str3, Object obj) {
        super(Opcodes.ASM6);
        this.symbolTable = symbolTable;
        this.accessFlags = i;
        this.nameIndex = symbolTable.addConstantUtf8(str);
        this.descriptorIndex = symbolTable.addConstantUtf8(str2);
        if (str3 != null) {
            this.signatureIndex = symbolTable.addConstantUtf8(str3);
        }
        if (obj != null) {
            this.constantValueIndex = symbolTable.addConstant(obj).index;
        }
    }

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.symbolTable.addConstantUtf8(str)).putShort(0);
        if (z) {
            AnnotationWriter annotationWriter = new AnnotationWriter(this.symbolTable, byteVector, this.lastRuntimeVisibleAnnotation);
            this.lastRuntimeVisibleAnnotation = annotationWriter;
            return annotationWriter;
        }
        AnnotationWriter annotationWriter2 = new AnnotationWriter(this.symbolTable, byteVector, this.lastRuntimeInvisibleAnnotation);
        this.lastRuntimeInvisibleAnnotation = annotationWriter2;
        return annotationWriter2;
    }

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        ByteVector byteVector = new ByteVector();
        TypeReference.putTarget(i, byteVector);
        TypePath.put(typePath, byteVector);
        byteVector.putShort(this.symbolTable.addConstantUtf8(str)).putShort(0);
        if (z) {
            AnnotationWriter annotationWriter = new AnnotationWriter(this.symbolTable, byteVector, this.lastRuntimeVisibleTypeAnnotation);
            this.lastRuntimeVisibleTypeAnnotation = annotationWriter;
            return annotationWriter;
        }
        AnnotationWriter annotationWriter2 = new AnnotationWriter(this.symbolTable, byteVector, this.lastRuntimeInvisibleTypeAnnotation);
        this.lastRuntimeInvisibleTypeAnnotation = annotationWriter2;
        return annotationWriter2;
    }

    @Override // org.modelmapper.internal.asm.FieldVisitor
    public void visitAttribute(Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    int computeFieldInfoSize() {
        int i;
        if (this.constantValueIndex != 0) {
            this.symbolTable.addConstantUtf8("ConstantValue");
            i = 16;
        } else {
            i = 8;
        }
        if ((this.accessFlags & 4096) != 0 && this.symbolTable.getMajorVersion() < 49) {
            this.symbolTable.addConstantUtf8("Synthetic");
            i += 6;
        }
        if (this.signatureIndex != 0) {
            this.symbolTable.addConstantUtf8("Signature");
            i += 8;
        }
        if ((this.accessFlags & 131072) != 0) {
            this.symbolTable.addConstantUtf8("Deprecated");
            i += 6;
        }
        AnnotationWriter annotationWriter = this.lastRuntimeVisibleAnnotation;
        if (annotationWriter != null) {
            i += annotationWriter.computeAnnotationsSize("RuntimeVisibleAnnotations");
        }
        AnnotationWriter annotationWriter2 = this.lastRuntimeInvisibleAnnotation;
        if (annotationWriter2 != null) {
            i += annotationWriter2.computeAnnotationsSize("RuntimeInvisibleAnnotations");
        }
        AnnotationWriter annotationWriter3 = this.lastRuntimeVisibleTypeAnnotation;
        if (annotationWriter3 != null) {
            i += annotationWriter3.computeAnnotationsSize("RuntimeVisibleTypeAnnotations");
        }
        AnnotationWriter annotationWriter4 = this.lastRuntimeInvisibleTypeAnnotation;
        if (annotationWriter4 != null) {
            i += annotationWriter4.computeAnnotationsSize("RuntimeInvisibleTypeAnnotations");
        }
        Attribute attribute = this.firstAttribute;
        return attribute != null ? i + attribute.computeAttributesSize(this.symbolTable) : i;
    }

    void putFieldInfo(ByteVector byteVector) {
        boolean z = this.symbolTable.getMajorVersion() < 49;
        byteVector.putShort((~(z ? 4096 : 0)) & this.accessFlags).putShort(this.nameIndex).putShort(this.descriptorIndex);
        int i = this.constantValueIndex == 0 ? 0 : 1;
        int i2 = this.accessFlags;
        if ((i2 & 4096) != 0 && z) {
            i++;
        }
        if (this.signatureIndex != 0) {
            i++;
        }
        if ((i2 & 131072) != 0) {
            i++;
        }
        if (this.lastRuntimeVisibleAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeInvisibleAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeVisibleTypeAnnotation != null) {
            i++;
        }
        if (this.lastRuntimeInvisibleTypeAnnotation != null) {
            i++;
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            i += attribute.getAttributeCount();
        }
        byteVector.putShort(i);
        if (this.constantValueIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("ConstantValue")).putInt(2).putShort(this.constantValueIndex);
        }
        if ((4096 & this.accessFlags) != 0 && z) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        }
        if ((this.accessFlags & 131072) != 0) {
            byteVector.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(0);
        }
        AnnotationWriter annotationWriter = this.lastRuntimeVisibleAnnotation;
        if (annotationWriter != null) {
            annotationWriter.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleAnnotations"), byteVector);
        }
        AnnotationWriter annotationWriter2 = this.lastRuntimeInvisibleAnnotation;
        if (annotationWriter2 != null) {
            annotationWriter2.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleAnnotations"), byteVector);
        }
        AnnotationWriter annotationWriter3 = this.lastRuntimeVisibleTypeAnnotation;
        if (annotationWriter3 != null) {
            annotationWriter3.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeVisibleTypeAnnotations"), byteVector);
        }
        AnnotationWriter annotationWriter4 = this.lastRuntimeInvisibleTypeAnnotation;
        if (annotationWriter4 != null) {
            annotationWriter4.putAnnotations(this.symbolTable.addConstantUtf8("RuntimeInvisibleTypeAnnotations"), byteVector);
        }
        Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector);
        }
    }

    final void collectAttributePrototypes(Attribute.Set set) {
        set.addAttributes(this.firstAttribute);
    }
}
