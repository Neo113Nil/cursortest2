package util.h.xy.ai;

/* loaded from: classes5.dex */
interface ri extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.ri getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (s * 4) + 68;
        int i5 = b + 4;
        byte[] bArr = $$a;
        int i6 = (i * 4) + 6;
        byte[] bArr2 = new byte[i6];
        if (bArr == null) {
            int i7 = i6;
            i3 = 0;
            i4 = (i4 + (-i7)) - 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 = (i4 + (-i7)) - 1;
            i2 = i3;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        } else {
            i2 = 0;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i4;
            i5++;
            if (i3 == i6) {
            }
        }
    }

    int _BAvwmAysqzVm1rYZ1PJ4ge(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {com.google.common.base.Ascii.DC4, 111, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, 89, -35, 47, -47, 47, -1};
        $$a = bArr;
        $$b = 131;
        byte b = bArr[8];
        byte b2 = (byte) (b + 1);
        byte b3 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 + 1), objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.ri) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.ri.class);
    }
}
