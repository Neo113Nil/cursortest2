package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class lIIllllllI {
    private static final byte[] $$a = {37, 75, 83, -62, -38, 7, -1, 7, 38, 9};
    private static final int $$b = 193;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, short s, short s2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 3 - (s * 2);
        byte[] bArr = $$a;
        int i6 = 66 - (s2 * 3);
        int i7 = 7 - (i * 2);
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            int i8 = i7;
            i3 = i5;
            i4 = 0;
            i5 = i5 + (-i8) + 4;
            i2 = i4;
            i3++;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i5 = i5 + (-i8) + 4;
            i2 = i4;
            i3++;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
            }
        } else {
            i2 = 0;
            i3 = i5;
            i5 = i6;
            i3++;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i4 == i7) {
            }
        }
    }

    public static /* synthetic */ java.lang.String llIIlIlIIl(int i) {
        switch (i) {
            case 1:
                return "Pdf417Mobi";
            case 2:
                return "PhotoPay";
            case 3:
                byte b = (byte) ($$a[6] + 1);
                byte b2 = b;
                java.lang.Object[] objArr = new java.lang.Object[1];
                a(b, b2, b2, objArr);
                return (java.lang.String) objArr[0];
            case 4:
                return "BlinkInput";
            case 5:
                return "BlinkCard";
            case 6:
                return "Liveness";
            case 7:
                return "MicroblinkCore";
            case 8:
                return "InvalidProduct";
            default:
                throw null;
        }
    }
}
