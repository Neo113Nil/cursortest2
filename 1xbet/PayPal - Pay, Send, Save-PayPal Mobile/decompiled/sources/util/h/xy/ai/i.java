package util.h.xy.ai;

/* loaded from: classes5.dex */
interface i extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.i Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, byte b2, short s, java.lang.Object[] objArr) {
        int i;
        int i2;
        byte[] bArr = $$a;
        int i3 = 68 - (s * 3);
        int i4 = (b * 3) + 6;
        int i5 = b2 + 4;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i6 = i3;
            i2 = 0;
            int i7 = i5;
            int i8 = (i6 + i5) - 1;
            i = i2;
            int i9 = i7;
            i3 = i8;
            i5 = i9;
            int i10 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i11 = i3;
            i7 = i10;
            i5 = bArr[i10];
            i6 = i11;
            int i82 = (i6 + i5) - 1;
            i = i2;
            int i92 = i7;
            i3 = i82;
            i5 = i92;
            int i102 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i = 0;
            int i1022 = i5 + 1;
            i2 = i + 1;
            bArr2[i] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    int _EFCoEKTUsesSSwpAKUhiws(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {75, com.visa.cbp.getEncExpo.startTransaction, 86, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE;
        byte b = bArr[8];
        byte b2 = (byte) (b - 1);
        byte b3 = (byte) (-b);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 + 1), objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.i) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.i.class);
    }
}
