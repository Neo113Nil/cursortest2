package util.h.xy.ai;

/* loaded from: classes5.dex */
interface n extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.n Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = b * 3;
        int i5 = 68 - (b2 * 4);
        int i6 = 4 - (i * 2);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i4];
        int i7 = 5 - i4;
        if (bArr == null) {
            i5 = i7;
            int i8 = i6;
            int i9 = -1;
            i5 = (i5 + (-i6)) - 1;
            i6 = i8 + 1;
            i2 = i9;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = i6;
            i6 = bArr[i6];
            i9 = i3;
            i5 = (i5 + (-i6)) - 1;
            i6 = i8 + 1;
            i2 = i9;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        } else {
            i2 = -1;
            i3 = i2 + 1;
            bArr2[i3] = (byte) i5;
            if (i3 == i7) {
            }
        }
    }

    int _KBBeBVsz3au5Hjv4VoBJsa(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9, java.lang.Object obj10, java.lang.Object obj11, java.lang.Object obj12);

    static {
        byte[] bArr = {83, -73, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -24, -35, 47, -47, 47, -1};
        $$a = bArr;
        $$b = 60;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.n) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.n.class);
    }
}
