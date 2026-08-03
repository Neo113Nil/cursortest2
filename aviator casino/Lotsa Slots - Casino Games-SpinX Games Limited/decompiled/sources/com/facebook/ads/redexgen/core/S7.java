package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class S7 extends android.os.AsyncTask<com.facebook.ads.redexgen.core.S9, java.lang.Void, android.graphics.drawable.Drawable> {
    public static byte[] A03;
    public static java.lang.String[] A04 = {"Er5x4Nf8UA9tVLePD2EX", "DtYF9X90t5u", "I941X6fzqWLmgCmjxes", "iBgQ7OI2DFUGAw4NUel9vSUdaaiAzSqO", "QcmiodlDN7oY3kgnmckrDpvdiERsjn9V", "z", "b", "KLyCCmbDECCjA8c7XM6gY8wQDdZdMwfW"};
    public final com.facebook.ads.redexgen.core.S8 A00;
    public final com.facebook.ads.redexgen.core.C1636gi A01;
    public final boolean A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final android.graphics.drawable.Drawable A00(com.facebook.ads.redexgen.core.S9... s9Arr) {
        if (!com.facebook.ads.redexgen.core.WU.A02(this) && s9Arr != null) {
            try {
                if (s9Arr.length >= 1) {
                    java.lang.String str = s9Arr[0].A01;
                    java.lang.String str2 = s9Arr[0].A00;
                    android.graphics.Bitmap bitmap = null;
                    try {
                        bitmap = new com.facebook.ads.redexgen.core.C1042Sx(this.A01).A0O(str, -1, -1);
                    } catch (java.lang.Throwable th) {
                        this.A01.A08().ABC(A01(0, 7, 4), com.facebook.ads.redexgen.core.AbstractC1048Td.A1V, new com.facebook.ads.redexgen.core.C1049Te(th));
                    }
                    if (bitmap != null) {
                        return com.facebook.ads.redexgen.core.UK.A05(this.A01, bitmap, this.A02, str2);
                    }
                    return null;
                }
            } catch (java.lang.Throwable th2) {
                com.facebook.ads.redexgen.core.WU.A00(th2, this);
                return null;
            }
        }
        return null;
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] ^ i3) ^ 36;
            java.lang.String[] strArr = A04;
            if (strArr[6].length() != strArr[5].length()) {
                throw new java.lang.RuntimeException();
            }
            A04[2] = "XzO4PGfz9rpTObXE3Krp6";
            copyOfRange[i4] = (byte) i5;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{71, 69, 78, 69, 82, 73, 67};
    }

    static {
        A02();
    }

    public S7(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.S8 s8, boolean z) {
        this.A01 = c1636gi;
        this.A00 = s8;
        this.A02 = z;
    }

    public /* synthetic */ S7(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.S8 s8, boolean z, com.facebook.ads.redexgen.core.C1658h4 c1658h4) {
        this(c1636gi, s8, z);
    }

    private final void A03(android.graphics.drawable.Drawable drawable) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            this.A00.AE8(drawable);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ android.graphics.drawable.Drawable doInBackground(com.facebook.ads.redexgen.core.S9[] s9Arr) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return null;
        }
        try {
            return A00(s9Arr);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(android.graphics.drawable.Drawable drawable) {
        if (com.facebook.ads.redexgen.core.WU.A02(this)) {
            return;
        }
        try {
            A03(drawable);
        } catch (java.lang.Throwable th) {
            com.facebook.ads.redexgen.core.WU.A00(th, this);
        }
    }
}
