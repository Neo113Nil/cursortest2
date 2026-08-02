package util.h.xy.ai;

/* loaded from: classes18.dex */
interface mj extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 148;
    public static final util.h.xy.ai.mj getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = 68 - (i2 * 3);
        byte[] bArr = $$a;
        int i5 = b * 3;
        int i6 = (i * 2) + 4;
        byte[] bArr2 = new byte[6 - i5];
        int i7 = 5 - i5;
        if (bArr == null) {
            int i8 = i4;
            i3 = 0;
            i4 = i6;
            i6++;
            i4 = (i4 + (-i8)) - 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i6];
            i3++;
            i6++;
            i4 = (i4 + (-i8)) - 1;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i4;
            if (i3 == i7) {
            }
        }
    }

    int _3Wbwdz5QepMJWsUMJgi7m2o74hXuQi5Ss(java.lang.Object obj, java.lang.Object obj2);

    static {
        byte[] bArr = {65, 77, -54, 89, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRangesFor = (util.h.xy.ai.mj) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mj.class);
    }
}
