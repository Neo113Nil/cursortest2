package org.apache.commons.imaging.formats.gif;

/* loaded from: classes17.dex */
class GenericGifBlock extends org.apache.commons.imaging.formats.gif.GifBlock {
    final java.util.List<byte[]> subblocks;

    GenericGifBlock(int i, java.util.List<byte[]> list) {
        super(i);
        this.subblocks = list;
    }

    public byte[] appendSubBlocks() throws java.io.IOException {
        return appendSubBlocks(false);
    }

    public byte[] appendSubBlocks(boolean z) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        for (int i = 0; i < this.subblocks.size(); i++) {
            byte[] bArr = this.subblocks.get(i);
            if (z && i > 0) {
                byteArrayOutputStream.write(bArr.length);
            }
            byteArrayOutputStream.write(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }
}
