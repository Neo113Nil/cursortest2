package util.h.xy.ai;

/* loaded from: classes5.dex */
interface ml extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 224;
    public static final util.h.xy.ai.ml Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:4:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3 = b * 2;
        int i4 = 3 - (i * 4);
        int i5 = 68 - (s * 3);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i3];
        int i6 = 5 - i3;
        if (bArr == null) {
            int i7 = i6;
            i2 = 0;
            i5 = (i5 + (-i7)) - 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i4++;
            i2++;
            i7 = bArr[i4];
            i5 = (i5 + (-i7)) - 1;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i5;
            if (i2 == i6) {
            }
        }
    }

    int _EFCoEKTUsesANHdevt81HF(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {100, 73, 105, -29, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = (byte) (bArr[8] + 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.ml) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.ml.class);
    }
}
