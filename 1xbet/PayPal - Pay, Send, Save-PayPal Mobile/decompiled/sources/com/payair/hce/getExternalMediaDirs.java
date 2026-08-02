package com.payair.hce;

/* loaded from: classes4.dex */
public class getExternalMediaDirs extends com.payair.hce.fileList {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int DigitizedCardProfile;
    private static int valueOf;
    private java.lang.String values;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, java.lang.Object[] objArr) {
        int i2;
        int i3;
        int i4 = 1 - (s * 4);
        byte[] bArr = $$a;
        int i5 = 3 - (i * 2);
        int i6 = 105 - (b * 2);
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            int i7 = i4;
            int i8 = i5;
            i3 = 0;
            int i9 = i5 + i7;
            i2 = i3;
            int i10 = i8;
            i6 = i9;
            i5 = i10;
            int i11 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
                objArr[0] = new java.lang.String(bArr2, 0);
                return;
            }
            i7 = bArr[i11];
            int i12 = i6;
            i8 = i11;
            i5 = i12;
            int i92 = i5 + i7;
            i2 = i3;
            int i102 = i8;
            i6 = i92;
            i5 = i102;
            int i112 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        } else {
            i2 = 0;
            int i1122 = i5 + 1;
            i3 = i2 + 1;
            bArr2[i2] = (byte) i6;
            if (i3 == i4) {
            }
        }
    }

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public getExternalMediaDirs(java.lang.String str, java.lang.String str2) {
        super(null, str2);
        this.values = str;
    }

    public getExternalMediaDirs(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(null, str, str2, str3);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.getExternalMediaDirs getexternalmediadirs = (com.payair.hce.getExternalMediaDirs) objArr[0];
        int i = DigitizedCardProfile;
        int i2 = (((i & (-60)) | ((~i) & 59)) - (~(-(-((i & 59) << 1))))) - 1;
        valueOf = i2 % 128;
        java.lang.String str = getexternalmediadirs.values;
        if (i2 % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = (-2) - (~(valueOf + 116));
        DigitizedCardProfile = i % 128;
        if (i % 2 == 0) {
            return "getExternalMediaDirs";
        }
        throw null;
    }

    static {
        init$0();
        DigitizedCardProfile = 0;
        valueOf = 1;
    }

    static void init$0() {
        $$a = new byte[]{120, 91, -87, 14};
        $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE;
    }

    public static void h(java.lang.Object obj, int i, int i2) {
        try {
            java.lang.Object[] objArr = {obj, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)};
            java.lang.Object obj2 = com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.get(2107355451);
            if (obj2 == null) {
                java.lang.Class cls = (java.lang.Class) com.payair.hce.DigitizedCardJson123.AlternateContactlessPaymentDataJson((android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 1864, (char) (41775 - android.graphics.Color.argb(0, 0, 0, 0)));
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                a((short) 0, 0, (byte) 0, objArr2);
                obj2 = cls.getMethod((java.lang.String) objArr2[0], java.lang.Object.class, java.lang.Integer.TYPE, java.lang.Integer.TYPE);
                com.payair.hce.DigitizedCardJson123.getAdditionalCheckTable.put(2107355451, obj2);
            }
            ((java.lang.reflect.Method) obj2).invoke(null, objArr);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final java.lang.String values() {
        return (java.lang.String) values(new java.lang.Object[]{this}, -1143098849, 1143098849, java.lang.System.identityHashCode(this));
    }
}
