package util.h.xy.ai;

/* loaded from: classes5.dex */
interface mg extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE;
    public static final util.h.xy.ai.mg getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = (i * 2) + 6;
        int i5 = (s2 * 4) + 68;
        int i6 = s + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i5;
            i3 = 0;
            int i8 = i6;
            int i9 = (i7 + i6) - 1;
            i2 = i3;
            int i10 = i8;
            i5 = i9;
            i6 = i10;
            int i11 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i12 = i5;
            i8 = i11;
            i6 = bArr[i11];
            i7 = i12;
            int i92 = (i7 + i6) - 1;
            i2 = i3;
            int i102 = i8;
            i5 = i92;
            i6 = i102;
            int i112 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i6 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i5;
            if (i3 == i4) {
            }
        }
    }

    int _GAsBZSW9wcqffkqT9Wjo5r(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {56, -54, 111, 88, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (-bArr[8]);
        byte b2 = (byte) (b + 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighResolutionOutputSizeshNQ4ISI = (util.h.xy.ai.mg) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mg.class);
    }
}
