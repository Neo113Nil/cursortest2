package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class W6 implements com.facebook.ads.redexgen.core.VN {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.C1636gi A00;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 12);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{94, 89, 91, 76, 77, 89, 84, 103, 76, 81, 85, 93, 75, 76, 89, 85, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 79, 74, 70, 77, 87, 124, 66, 83, 74, 124, 85, 70, 81, 80, 74, 76, 77, 101, 105, 104, 114, 99, 104, 114, 60, 41, 41, 5, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, 0, 0, 51, com.google.common.base.Ascii.RS, 9, 10, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.RS, 9, com.google.common.base.Ascii.RS, 68, 94, 114, 78, 89, 57, 40, 42, 34, 40, 46, 44, com.google.common.base.Ascii.SYN, 39, 40, 36, 44};
    }

    public W6(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        this.A00 = c1636gi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A03(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j) {
        this.A00.A0F().ABN(str);
        android.content.pm.PackageManager packageManager = this.A00.getPackageManager();
        if (packageManager == null) {
            this.A00.A0F().ABS(str);
            return false;
        }
        android.content.ContentResolver contentResolver = this.A00.getContentResolver();
        if (contentResolver == null) {
            this.A00.A0F().ABP(str);
            return false;
        }
        if (packageManager.resolveContentProvider(str, 0) == null) {
            this.A00.A0F().ABO(str);
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(A00(35, 10, 10) + str + A00(0, 1, 125) + str2);
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(A00(17, 18, 47), (java.lang.Integer) 1);
        values.put(A00(61, 5, 33), java.lang.Boolean.valueOf(z));
        values.put(A00(45, 16, 96), str3);
        values.put(A00(66, 12, 69), str4);
        values.put(A00(1, 16, 52), java.lang.Long.valueOf(j));
        try {
            contentResolver.insert(parse, values);
            this.A00.A0F().ABU(str);
            return true;
        } catch (java.lang.UnsupportedOperationException unused) {
            this.A00.A0F().ABR(str);
            return false;
        } catch (java.lang.Exception unused2) {
            this.A00.A0F().ABQ(str);
            return false;
        }
    }

    public final void A04(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, boolean z2) {
        this.A00.A0F().ABT();
        com.facebook.ads.redexgen.core.YG.A06.execute(new com.facebook.ads.redexgen.core.W7(this, z, str, str2, str3, j, z2));
    }
}
