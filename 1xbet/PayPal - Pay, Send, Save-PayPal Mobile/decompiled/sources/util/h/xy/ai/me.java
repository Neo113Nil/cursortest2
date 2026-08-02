package util.h.xy.ai;

/* loaded from: classes18.dex */
interface me extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 119;
    public static final util.h.xy.ai.me getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 6 - (i * 2);
        byte[] bArr = $$a;
        int i5 = 3 - (s2 * 4);
        int i6 = 68 - (s * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            i6 = (i7 + (-i6)) - 1;
            i2 = i3;
            int i8 = i5;
            int i9 = i6;
            int i10 = i8 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i9;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i5 = i10;
            i6 = bArr[i10];
            i7 = i9;
            i6 = (i7 + (-i6)) - 1;
            i2 = i3;
            int i82 = i5;
            int i92 = i6;
            int i102 = i82 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i92;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i822 = i5;
            int i922 = i6;
            int i1022 = i822 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i922;
            if (i3 == i4) {
            }
        }
    }

    int _LwnbKq4C3Hfia7jCEY9EyNdtScmMgpsrj(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8);

    static {
        byte[] bArr = {73, -124, -71, 2, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.me) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.me.class);
    }
}
