package util.h.xy.ai;

/* loaded from: classes5.dex */
interface mh extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.mh getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:4:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, byte b2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (b2 * 4) + 4;
        byte[] bArr = $$a;
        int i4 = s * 3;
        int i5 = 68 - (b * 3);
        byte[] bArr2 = new byte[i4 + 6];
        int i6 = i4 + 5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = -1;
            int i9 = i6;
            i5 = (i9 + (-i5)) - 1;
            i3 = i7 + 1;
            i = i8;
            i2 = i + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i10 = bArr[i3];
            int i11 = i3;
            i9 = i5;
            i5 = i10;
            i8 = i2;
            i7 = i11;
            i5 = (i9 + (-i5)) - 1;
            i3 = i7 + 1;
            i = i8;
            i2 = i + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i = -1;
            i2 = i + 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    int _GAsBZSW9wcqnjKQm7VncWr(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {84, 109, 101, com.visa.cbp.getEncExpo.IResultReceiver2StubProxy, -35, 47, -47, 47, -1};
        $$a = bArr;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.mh) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.mh.class);
    }
}
