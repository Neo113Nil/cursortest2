package org.apache.commons.imaging.formats.jpeg.iptc;

/* loaded from: classes17.dex */
public class IptcBlock {
    private final byte[] blockData;
    private final byte[] blockNameBytes;
    private final int blockType;

    public IptcBlock(int i, byte[] bArr, byte[] bArr2) {
        java.util.Objects.requireNonNull(bArr, "Block name bytes must not be null.");
        java.util.Objects.requireNonNull(bArr, "Block data bytes must not be null.");
        this.blockData = bArr2;
        this.blockNameBytes = bArr;
        this.blockType = i;
    }

    public int getBlockType() {
        return this.blockType;
    }

    public byte[] getBlockNameBytes() {
        return (byte[]) this.blockNameBytes.clone();
    }

    public byte[] getBlockData() {
        return (byte[]) this.blockData.clone();
    }

    public boolean isIPTCBlock() {
        return this.blockType == 1028;
    }
}
