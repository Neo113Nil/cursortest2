package util.h.xy.ai;

/* loaded from: classes5.dex */
interface rh extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.rh Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = 68 - (s2 * 4);
        byte[] bArr = $$a;
        int i4 = (s * 3) + 6;
        int i5 = s3 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i4;
            int i7 = i5;
            i2 = 0;
            int i8 = (i5 + i6) - 1;
            i = i2;
            i5 = i7;
            i3 = i8;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i5 + 1;
            i6 = bArr[i9];
            i5 = i3;
            i7 = i9;
            int i82 = (i5 + i6) - 1;
            i = i2;
            i5 = i7;
            i3 = i82;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    int _GAsBZSW9wcqpxeenbXvtsW(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {com.google.common.base.Ascii.GS, -87, -11, 106, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE;
        byte b = bArr[8];
        byte b2 = (byte) (b - 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b2, (byte) (-b), objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.rh) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rh.class);
    }
}
