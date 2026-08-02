package org.modelmapper.internal.asm.commons;

import org.modelmapper.internal.asm.Attribute;
import org.modelmapper.internal.asm.ByteVector;
import org.modelmapper.internal.asm.ClassReader;
import org.modelmapper.internal.asm.ClassWriter;
import org.modelmapper.internal.asm.Label;

/* loaded from: classes4.dex */
public final class ModuleResolutionAttribute extends Attribute {
    public static final int RESOLUTION_DO_NOT_RESOLVE_BY_DEFAULT = 1;
    public static final int RESOLUTION_WARN_DEPRECATED = 2;
    public static final int RESOLUTION_WARN_DEPRECATED_FOR_REMOVAL = 4;
    public static final int RESOLUTION_WARN_INCUBATING = 8;
    public int resolution;

    public ModuleResolutionAttribute(int i) {
        super("ModuleResolution");
        this.resolution = i;
    }

    public ModuleResolutionAttribute() {
        this(0);
    }

    @Override // org.modelmapper.internal.asm.Attribute
    protected Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        return new ModuleResolutionAttribute(classReader.readUnsignedShort(i));
    }

    @Override // org.modelmapper.internal.asm.Attribute
    protected ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byteVector.putShort(this.resolution);
        return byteVector;
    }
}
