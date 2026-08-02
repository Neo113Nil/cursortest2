package util.h.xy.ai;

/* loaded from: classes5.dex */
interface mf extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.mf getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, byte b, byte b2, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b2 + 4;
        int i5 = (i * 4) + 68;
        int i6 = b * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i6];
        int i7 = 5 - i6;
        if (bArr == null) {
            int i8 = i7;
            i3 = i4;
            i2 = -1;
            i4 = (i4 + i8) - 1;
            i2++;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i3];
            i4 = (i4 + i8) - 1;
            i2++;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
            }
        } else {
            i2 = -1;
            i4 = i5;
            i3 = i4;
            i2++;
            bArr2[i2] = (byte) i4;
            i3++;
            if (i2 == i7) {
            }
        }
    }

    int _BAvwmAysqzVkeV6uRSb5XK(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {110, 41, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -101, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = 236;
        byte b = bArr[8];
        byte b2 = (byte) (b - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b2, (byte) (-b), objArr);
        getHighSpeedVideoFpsRangesFor = (util.h.xy.ai.mf) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mf.class);
    }
}
