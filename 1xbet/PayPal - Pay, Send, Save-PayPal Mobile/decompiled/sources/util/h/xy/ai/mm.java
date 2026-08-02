package util.h.xy.ai;

/* loaded from: classes18.dex */
interface mm extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.mm getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = (s2 * 3) + 4;
        int i4 = 6 - (s * 2);
        int i5 = (b * 3) + 68;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            i2 = i3;
            i = 0;
            i3 = (i3 + (-i6)) - 1;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i6 = bArr[i2];
            i3 = (i3 + (-i6)) - 1;
            i2++;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        } else {
            i = 0;
            i3 = i5;
            i2 = i3;
            bArr2[i] = (byte) i3;
            i++;
            if (i == i4) {
            }
        }
    }

    int _Duwhd51GQwinnaAQbv5uZurx1EBNSxDxW(java.lang.Object obj);

    static {
        byte[] bArr = {78, 109, -55, com.google.common.base.Ascii.CAN, -35, 47, -47, 47, -1};
        $$a = bArr;
        $$b = 141;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.mm) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mm.class);
    }
}
