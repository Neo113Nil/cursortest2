package util.h.xy.ai;

/* loaded from: classes18.dex */
interface g extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE;
    public static final util.h.xy.ai.g getHighSpeedVideoFpsRanges;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, short s, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = (s * 4) + 6;
        int i4 = (s2 * 3) + 4;
        byte[] bArr = $$a;
        int i5 = 68 - (b * 3);
        byte[] bArr2 = new byte[i3];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4++;
            i5 = (i6 + i5) - 1;
            i = i2;
            int i7 = i4;
            int i8 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i8;
            if (i2 == i3) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4 = i7;
            i5 = bArr[i7];
            i6 = i8;
            i4++;
            i5 = (i6 + i5) - 1;
            i = i2;
            int i72 = i4;
            int i82 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i82;
            if (i2 == i3) {
            }
        } else {
            i = 0;
            int i722 = i4;
            int i822 = i5;
            i2 = i + 1;
            bArr2[i] = (byte) i822;
            if (i2 == i3) {
            }
        }
    }

    int _GAsBZSW9wcr9aMZUp2FTw4(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9);

    static {
        byte[] bArr = {33, 69, 87, -70, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoFpsRanges = (util.h.xy.ai.g) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.g.class);
    }
}
