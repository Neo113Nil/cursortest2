package util.h.xy.ai;

/* loaded from: classes5.dex */
interface j extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.j getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(int i, int i2, short s, java.lang.Object[] objArr) {
        int i3;
        int i4 = (i * 2) + 4;
        int i5 = (i2 * 4) + 6;
        int i6 = (s * 2) + 68;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i5];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            i4++;
            i6 = (i7 + (-i8)) - 1;
            int i9 = i6;
            int i10 = i4;
            bArr2[i3] = (byte) i9;
            i3++;
            if (i3 == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i8 = bArr[i10];
            i7 = i9;
            i4 = i10;
            i4++;
            i6 = (i7 + (-i8)) - 1;
            int i92 = i6;
            int i102 = i4;
            bArr2[i3] = (byte) i92;
            i3++;
            if (i3 == i5) {
            }
        } else {
            i3 = 0;
            int i922 = i6;
            int i1022 = i4;
            bArr2[i3] = (byte) i922;
            i3++;
            if (i3 == i5) {
            }
        }
    }

    int _BAvwmAysqzVKuWkvnn1nEt(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {69, -115, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -14, -35, 47, -47, 47, -1};
        $$a = bArr;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.j) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.j.class);
    }
}
