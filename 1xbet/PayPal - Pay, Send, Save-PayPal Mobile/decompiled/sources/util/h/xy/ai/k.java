package util.h.xy.ai;

/* loaded from: classes18.dex */
interface k extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b;
    public static final util.h.xy.ai.k getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:4:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, short s2, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = 68 - (s * 4);
        int i4 = s2 * 3;
        int i5 = 4 - (i * 4);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[6 - i4];
        int i6 = 5 - i4;
        if (bArr == null) {
            i3 = i6;
            int i7 = i5;
            int i8 = 0;
            i3 = (i3 + i5) - 1;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            int i9 = i2 + 1;
            i7 = i5;
            i5 = bArr[i5];
            i8 = i9;
            i3 = (i3 + i5) - 1;
            i5 = i7 + 1;
            i2 = i8;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i6) {
            }
        }
    }

    int _6ufZmPaXWTRzowJggBajU22MamziJYuUoJUGnmwkNJ2vy6i2W9V1yZv(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3);

    static {
        byte[] bArr = {com.google.common.base.Ascii.ESC, 104, -14, com.google.common.base.Ascii.SUB, 35, -47, 47, -47, 1};
        $$a = bArr;
        $$b = 63;
        byte b = (byte) (bArr[8] - 1);
        byte b2 = b;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.k) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.k.class);
    }
}
