package org.apache.commons.imaging.formats.psd;

/* loaded from: classes17.dex */
class ImageResourceBlock {
    final byte[] data;
    final int id;
    final byte[] nameData;

    ImageResourceBlock(int i, byte[] bArr, byte[] bArr2) {
        this.id = i;
        this.nameData = bArr;
        this.data = bArr2;
    }

    java.lang.String getName() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("getName: ");
        sb.append(this.nameData.length);
        org.apache.commons.imaging.internal.Debug.debug(sb.toString());
        return new java.lang.String(this.nameData, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
}
