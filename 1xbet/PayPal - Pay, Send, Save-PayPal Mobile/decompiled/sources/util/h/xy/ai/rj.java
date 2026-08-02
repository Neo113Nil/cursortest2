package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rj extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 33;
    public static final util.h.xy.ai.rj getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, int i2, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 4) + 4;
        int i5 = i2 * 3;
        byte[] bArr = $$a;
        int i6 = 68 - (s * 3);
        byte[] bArr2 = new byte[6 - i5];
        int i7 = 5 - i5;
        if (bArr == null) {
            int i8 = i4;
            i6 = i7;
            int i9 = 0;
            i6 = (i6 + i4) - 1;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = i3 + 1;
            i8 = i4;
            i4 = bArr[i4];
            i9 = i10;
            i6 = (i6 + i4) - 1;
            i4 = i8 + 1;
            i3 = i9;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        } else {
            i3 = 0;
            bArr2[i3] = (byte) i6;
            if (i3 == i7) {
            }
        }
    }

    int _L5Yns3ZsrmnyXWG9UW52YjQtpEAi4mYMB(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    static {
        byte[] bArr = {111, -40, 42, 9, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.rj) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rj.class);
    }
}
