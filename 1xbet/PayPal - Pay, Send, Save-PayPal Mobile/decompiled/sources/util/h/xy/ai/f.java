package util.h.xy.ai;

/* loaded from: classes18.dex */
interface f extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.f getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4;
        byte[] bArr = $$a;
        int i5 = (b * 4) + 68;
        int i6 = 6 - (i2 * 4);
        int i7 = (i * 3) + 4;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i8 = i5;
            i4 = 0;
            i5 = i7;
            i7++;
            i5 = (i5 + i8) - 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i7];
            i7++;
            i5 = (i5 + i8) - 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i5;
            if (i4 == i6) {
            }
        }
    }

    int _BqhpQr8dmicEPxyWfpRfubbw3ktfTQAs2(java.lang.Object obj);

    static {
        byte[] bArr = {com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, -57, 120, 109, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = 92;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.f) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.f.class);
    }
}
