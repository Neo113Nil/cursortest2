package org.bouncycastle.tsp.ers;

/* loaded from: classes17.dex */
class ByteArrayComparator implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        for (int i = 0; i < bArr.length && i < bArr2.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 != i3) {
                return i2 - i3;
            }
        }
        return bArr.length - bArr2.length;
    }

    ByteArrayComparator() {
    }
}
