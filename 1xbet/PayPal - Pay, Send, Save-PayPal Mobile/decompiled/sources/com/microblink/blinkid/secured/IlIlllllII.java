package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class IlIlllllII {
    private static final byte[] $$a;
    private static final int $$b = 56;
    public static final java.lang.String[] llIIlIlIIl;

    static {
        byte[] bArr = {56, -54, 111, 88, -38, 7, -1, 7, 38, 9};
        $$a = bArr;
        byte b = bArr[6];
        byte b2 = (byte) (b + 1);
        byte b3 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 + 1), objArr);
        llIIlIlIIl = new java.lang.String[]{(java.lang.String) objArr[0]};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, byte b, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = s * 4;
        int i3 = s2 + 4;
        int i4 = 66 - (b * 2);
        byte[] bArr2 = new byte[7 - i2];
        int i5 = 6 - i2;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i3;
            int i9 = i6 + (-i3) + 4;
            i = i7;
            int i10 = i8;
            i4 = i9;
            i3 = i10;
            int i11 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i4;
            i8 = i11;
            i3 = bArr[i11];
            i7 = i + 1;
            i6 = i12;
            int i92 = i6 + (-i3) + 4;
            i = i7;
            int i102 = i8;
            i4 = i92;
            i3 = i102;
            int i112 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        } else {
            i = 0;
            int i1122 = i3 + 1;
            bArr2[i] = (byte) i4;
            if (i == i5) {
            }
        }
    }
}
