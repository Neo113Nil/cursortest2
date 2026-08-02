package util.h.xy.ai;

/* loaded from: classes18.dex */
interface mi extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 129;
    public static final util.h.xy.ai.mi getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b * 4) + 6;
        int i4 = 68 - (s * 3);
        int i5 = 4 - (s2 * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i3;
            int i7 = i5;
            i2 = 0;
            int i8 = (i5 + i6) - 1;
            i = i2;
            i5 = i7 + 1;
            i4 = i8;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i5];
            int i9 = i5;
            i5 = i4;
            i7 = i9;
            int i82 = (i5 + i6) - 1;
            i = i2;
            i5 = i7 + 1;
            i4 = i82;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    int _LwnbKq4C3Hfj9aWfEWKt8Gf6BuR8xEG9L(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4);

    static {
        byte[] bArr = {100, 73, 105, -29, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.mi) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mi.class);
    }
}
