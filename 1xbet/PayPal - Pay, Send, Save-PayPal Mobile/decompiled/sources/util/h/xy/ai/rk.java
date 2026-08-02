package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rk extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 224;
    public static final util.h.xy.ai.rk getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = i * 2;
        int i4 = (b * 2) + 68;
        int i5 = 4 - (s * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i3];
        int i6 = 5 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = -1;
            i4 = (i4 + i7) - 1;
            i5++;
            i2++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i5];
            i4 = (i4 + i7) - 1;
            i5++;
            i2++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        } else {
            i2 = -1;
            i2++;
            bArr2[i2] = (byte) i4;
            if (i2 == i6) {
            }
        }
    }

    int _VXTcgisUsrRw8jW8YWcEix(java.lang.Object obj);

    static {
        byte[] bArr = {41, -125, -85, 4, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.rk) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rk.class);
    }
}
