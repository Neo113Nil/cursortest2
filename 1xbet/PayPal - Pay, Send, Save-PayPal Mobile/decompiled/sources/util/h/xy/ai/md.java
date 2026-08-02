package util.h.xy.ai;

/* loaded from: classes5.dex */
interface md extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 77;
    public static final util.h.xy.ai.md Camera2StreamConfigurationMap;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, byte b, short s2, java.lang.Object[] objArr) {
        int i;
        int i2;
        int i3 = b + 4;
        byte[] bArr = $$a;
        int i4 = 68 - (s2 * 2);
        int i5 = s * 2;
        byte[] bArr2 = new byte[i5 + 6];
        int i6 = i5 + 5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3 = (i3 + (-i4)) - 1;
            i2 = i7;
            i = i8;
            int i9 = i2 + 1;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = i9;
            i4 = bArr[i9];
            i3 = (i3 + (-i4)) - 1;
            i2 = i7;
            i = i8;
            int i92 = i2 + 1;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
            }
        } else {
            i = 0;
            i2 = i3;
            i3 = i4;
            int i922 = i2 + 1;
            bArr2[i] = (byte) i3;
            i8 = i + 1;
            if (i == i6) {
            }
        }
    }

    int _EFCoEKTUses2xrNi72s9N8(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6);

    static {
        byte[] bArr = {77, -89, -118, -2, -35, 47, -47, 47, -1};
        $$a = bArr;
        byte b = bArr[8];
        byte b2 = (byte) (b + 1);
        byte b3 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b2, b3, (byte) (b3 + 1), objArr);
        Camera2StreamConfigurationMap = (util.h.xy.ai.md) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.md.class);
    }
}
