package com.facebook.ads.androidx.media3.exoplayer.scheduler;

/* loaded from: assets/audience_network/classes2.dex */
public final class Requirements implements android.os.Parcelable {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"uwN5TqWruOwNeCy1aiqDeLgzeCho9gnR", "uTqO4HZ69OtT2", "pp7wWJEgHEGU283E", "XPZfXvI81RbECUtIqAEftJ2yNIIbXze1", "5SwimXMBGWXyWjNLtwjqMnX", "7CGYXLa6aYpujc5oADJ5LB3FbDI8uqBi", "FEMkx52dE2zGpzw1", "Fv9wompXFxfx6YB8Vj7MYx3uqzKPyKZl"};
    public static final android.os.Parcelable.Creator<com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements> CREATOR;
    public final int A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) + androidx.media3.common.PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{36, 49, 39, 53, 50, 44, 39, -15, 44, 49, 55, 40, 49, 55, -15, 36, 38, 55, 44, 50, 49, -15, 5, 4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, 8, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FS, 34, 6, com.google.common.base.Ascii.VT, 4, 17, 10, 8, 7, -13, 0, -10, 4, 1, -5, -10, -64, -5, 0, 6, -9, 0, 6, -64, -13, -11, 6, -5, 1, 0, -64, -42, -41, -24, -37, -43, -41, -15, -27, -26, -31, -28, -45, -39, -41, -15, -34, -31, -23, -25, -13, -14, -14, -23, -25, -8, -19, -6, -19, -8, -3, -9, -10, -2, -20, -7, 3, 4, -15, 4, 5, 3};
    }

    static {
        A02();
        CREATOR = new com.facebook.ads.redexgen.core.CO();
    }

    public Requirements(int i) {
        this.A00 = (i & 2) != 0 ? i | 1 : i;
    }

    private int A00(android.content.Context context) {
        if (!A0A()) {
            return 0;
        }
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.facebook.ads.redexgen.core.AbstractC04203y.A01(context.getSystemService(A01(77, 12, 28)));
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            boolean A06 = A06(connectivityManager);
            java.lang.String[] strArr = A02;
            if (strArr[2].length() != strArr[6].length()) {
                throw new java.lang.RuntimeException();
            }
            A02[5] = "RKqvXcDMvtoTOxGBV3lSSEVfZ64ZYoxU";
            if (A06) {
                if (A0C()) {
                    boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
                    if (A02[3].charAt(16) != 'q') {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A02;
                    strArr2[1] = "RJMLW2AndFlsS";
                    strArr2[4] = "adHoYRSEIssUTsmuQLV0TXA";
                    if (isActiveNetworkMetered) {
                        if (A02[0].charAt(4) != 'h') {
                            java.lang.String[] strArr3 = A02;
                            strArr3[1] = "EctWe7FhnH81C";
                            strArr3[4] = "lAwOl2qOFCjLVAIEQ1yyJzT";
                            return 2;
                        }
                        java.lang.String[] strArr4 = A02;
                        strArr4[1] = "YeFdaHJUx43hD";
                        strArr4[4] = "U4BsCHt3kJE5KJEOEKp0bYO";
                        return 2;
                    }
                }
                return 0;
            }
        }
        return this.A00 & 3;
    }

    private boolean A03(android.content.Context context) {
        android.content.Intent registerReceiver = context.registerReceiver(null, new android.content.IntentFilter(A01(0, 37, 91)));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(A01(94, 6, 40), -1);
        return intExtra == 2 || intExtra == 5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A04(android.content.Context context) {
        android.os.PowerManager powerManager = (android.os.PowerManager) com.facebook.ads.redexgen.core.AbstractC04203y.A01(context.getSystemService(A01(89, 5, 31)));
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 20) {
            return !powerManager.isInteractive();
        }
        boolean isScreenOn = powerManager.isScreenOn();
        if (A02[7].charAt(15) != '8') {
            throw new java.lang.RuntimeException();
        }
        A02[7] = "0vwiCxXTqkOZryo8en8HAet2lmwum6iC";
        if (!isScreenOn) {
        }
    }

    private boolean A05(android.content.Context context) {
        return context.registerReceiver(null, new android.content.IntentFilter(A01(37, 40, 42))) == null;
    }

    public static boolean A06(android.net.ConnectivityManager connectivityManager) {
        if (com.facebook.ads.redexgen.core.C5C.A02 < 24) {
            return true;
        }
        android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.SecurityException unused) {
            return true;
        }
    }

    public final int A07(android.content.Context context) {
        int A00 = A00(context);
        if (A08() && !A03(context)) {
            A00 |= 8;
        }
        if (A09() && !A04(context)) {
            A00 |= 4;
        }
        if (A0B() && !A05(context)) {
            return A00 | 16;
        }
        return A00;
    }

    public final boolean A08() {
        return (this.A00 & 8) != 0;
    }

    public final boolean A09() {
        return (this.A00 & 4) != 0;
    }

    public final boolean A0A() {
        return (this.A00 & 1) != 0;
    }

    public final boolean A0B() {
        return (this.A00 & 16) != 0;
    }

    public final boolean A0C() {
        return (this.A00 & 2) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((com.facebook.ads.androidx.media3.exoplayer.scheduler.Requirements) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }
}
