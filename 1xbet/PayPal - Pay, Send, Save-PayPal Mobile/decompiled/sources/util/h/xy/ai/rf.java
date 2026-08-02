package util.h.xy.ai;

/* loaded from: classes18.dex */
interface rf extends com.sun.jna.Library {
    public static final byte[] $$a;
    public static final int $$b = 161;
    public static final util.h.xy.ai.rf getHighSpeedVideoSizes;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(byte b, int i, short s, java.lang.Object[] objArr) {
        int i2;
        int i3 = 68 - (s * 4);
        byte[] bArr = $$a;
        int i4 = b + 4;
        int i5 = i * 3;
        byte[] bArr2 = new byte[i5 + 6];
        int i6 = i5 + 5;
        if (bArr == null) {
            int i7 = i3;
            int i8 = 0;
            i3 = i6;
            i3 = (i3 + i7) - 1;
            i2 = i8;
            i4++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i4];
            i3 = (i3 + i7) - 1;
            i2 = i8;
            i4++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        } else {
            i2 = 0;
            i4++;
            bArr2[i2] = (byte) i3;
            i8 = i2 + 1;
            if (i2 == i6) {
            }
        }
    }

    int _GAsBZSW9wcqmQdWd2MwwWT(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7, java.lang.Object obj8, java.lang.Object obj9);

    static {
        byte[] bArr = {5, 2, 102, 37, 35, -47, 47, -47, 1};
        $$a = bArr;
        byte b = (byte) (-bArr[8]);
        byte b2 = (byte) (b + 1);
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(b, b2, b2, objArr);
        getHighSpeedVideoSizes = (util.h.xy.ai.rf) com.sun.jna.Native.loadLibrary((java.lang.String) objArr[0], util.h.xy.ai.rf.class);
    }
}
