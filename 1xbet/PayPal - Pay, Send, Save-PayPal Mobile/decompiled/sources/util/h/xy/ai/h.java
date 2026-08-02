package util.h.xy.ai;

/* loaded from: classes18.dex */
interface h extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 19;
    public static final util.h.xy.ai.h Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, short s3, java.lang.Object[] objArr) {
        int i;
        byte[] bArr = $$a;
        int i2 = 68 - (s * 2);
        int i3 = s2 * 2;
        int i4 = s3 + 4;
        byte[] bArr2 = new byte[i3 + 6];
        int i5 = i3 + 5;
        if (bArr == null) {
            int i6 = i4;
            int i7 = 0;
            int i8 = i5;
            i2 = (i8 + (-i2)) - 1;
            i4 = i6;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i4 + 1;
            int i10 = bArr[i9];
            i8 = i2;
            i2 = i10;
            i7 = i + 1;
            i6 = i9;
            i2 = (i8 + (-i2)) - 1;
            i4 = i6;
            i = i7;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        } else {
            i = 0;
            bArr2[i] = (byte) i2;
            if (i == i5) {
            }
        }
    }

    int _3Wbwdz5QepMbJNn8CiW3HwFivKZsZoNvu(java.lang.Object obj);

    static {
        byte[] bArr = {5, 2, 102, 37, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = bArr[8];
        byte b2 = (byte) (b + 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b2, b, objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.h) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.h.class);
    }
}
