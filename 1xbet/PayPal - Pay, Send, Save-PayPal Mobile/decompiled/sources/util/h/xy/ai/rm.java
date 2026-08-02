package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rm extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE;
    public static final util.h.xy.ai.rm getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        int i6 = 3 - (i3 * 3);
        int i7 = 6 - (i2 * 2);
        byte[] bArr = $$a;
        int i8 = (i * 2) + 68;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            i8 = i7;
            int i9 = i6;
            i5 = 0;
            i8 = (i8 + (-i6)) - 1;
            i6 = i9;
            i4 = i5;
            int i10 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i9 = i10;
            i6 = bArr[i10];
            i8 = (i8 + (-i6)) - 1;
            i6 = i9;
            i4 = i5;
            int i102 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
            }
        } else {
            i4 = 0;
            int i1022 = i6 + 1;
            i5 = i4 + 1;
            bArr2[i4] = (byte) i8;
            if (i5 == i7) {
            }
        }
    }

    int _L5Yns3Zsrmo1zo4pbrjsSX1g9fSgXUYef(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7);

    static {
        byte[] bArr = {106, -95, -84, 75, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.rm) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rm.class);
    }
}
