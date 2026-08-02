package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rd extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.rd getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, byte b3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        int i4 = (b2 * 4) + 68;
        int i5 = (b3 * 2) + 6;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i6 = i5;
            i2 = 0;
            i4 = (i4 + i6) - 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i3++;
            i6 = bArr[i3];
            i4 = (i4 + i6) - 1;
            i = i2;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i5) {
            }
        }
    }

    int _L5Yns3ZsrmnyXWG9UW52YjFTrr3c4ti3M(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    static {
        byte[] bArr = {com.google.common.base.Ascii.EM, -98, 105, 102, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = 22;
        byte b = (byte) (-bArr[8]);
        byte b2 = (byte) (b + 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.rd) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rd.class);
    }
}
