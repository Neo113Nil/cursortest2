package util.h.xy.ai;

/* loaded from: classes18.dex */
interface l extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 185;
    public static final util.h.xy.ai.l getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 68 - (i * 3);
        int i4 = s * 4;
        int i5 = s2 + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i4];
        int i6 = 5 - i4;
        if (bArr == null) {
            int i7 = i3;
            i2 = 0;
            int i8 = i5;
            int i9 = i8;
            i3 = (i5 + i7) - 1;
            i5 = i9;
            int i10 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i2++;
            i7 = bArr[i10];
            int i11 = i3;
            i8 = i10;
            i5 = i11;
            int i92 = i8;
            i3 = (i5 + i7) - 1;
            i5 = i92;
            int i102 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            int i1022 = i5 + 1;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    int _SqrNKXzQoV5wHLXuPvqkRa(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    static {
        byte[] bArr = {6, -55, 67, -52, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = bArr[8];
        byte b2 = (byte) (b - 1);
        byte b3 = (byte) (-b);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 + 1), objArr);
        getHighSpeedVideoFpsRangesFor = (util.h.xy.ai.l) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.l.class);
    }
}
