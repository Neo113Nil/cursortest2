package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rg extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 131;
    public static final util.h.xy.ai.rg getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = (s2 * 4) + 68;
        int i4 = 3 - (s * 2);
        int i5 = i * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5 + 6];
        int i6 = i5 + 5;
        if (bArr == null) {
            int i7 = i3;
            i3 = i6;
            i2 = 0;
            i3 = (i3 + i7) - 1;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i2++;
            i3 = (i3 + i7) - 1;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    int _9siYbfHsXjYsBQHpS7pAt7dN9pwftfR26(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5);

    static {
        byte[] bArr = {118, -29, -86, -87, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.rg) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rg.class);
    }
}
