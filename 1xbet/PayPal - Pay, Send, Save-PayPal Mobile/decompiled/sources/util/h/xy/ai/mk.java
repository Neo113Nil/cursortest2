package util.h.xy.ai;

/* loaded from: classes18.dex */
interface mk extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 155;
    public static final util.h.xy.ai.mk getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4;
        int i5 = 6 - (s2 * 2);
        byte[] bArr = $$a;
        int i6 = (i * 4) + 68;
        int i7 = (s * 2) + 4;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i8 = i7;
            i4 = 0;
            int i9 = i7;
            i6 = (i6 + i8) - 1;
            i2 = i4;
            i3 = i9 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i9 = i3;
            i6 = (i6 + i8) - 1;
            i2 = i4;
            i3 = i9 + 1;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        } else {
            i2 = 0;
            i3 = i7;
            i4 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i4 == i5) {
            }
        }
    }

    int _L5Yns3ZsrmnxXQXWLWBCCznmG2r172eoY(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    static {
        byte[] bArr = {1, 75, -104, -86, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[0] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRangesFor = (util.h.xy.ai.mk) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mk.class);
    }
}
