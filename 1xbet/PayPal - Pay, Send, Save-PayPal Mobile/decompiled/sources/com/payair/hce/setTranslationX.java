package com.payair.hce;

/* loaded from: classes4.dex */
final class setTranslationX {
    private static int AlternateContactlessPaymentDataJson = 1;
    private static int DigitizedCardProfile = 66;
    private static long values;

    public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = i2 | i4;
        int i7 = (i * (-751)) + (i2 * (-751)) + (((~(i4 | i5)) | (~(i4 | i3))) * 1504) + ((~(i3 | i6)) * (-1504)) + (((~(i | i5)) | (~i6)) * 752);
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? AlternateContactlessPaymentDataJson(objArr) : values(objArr) : writeReplace(objArr) : valueOf(objArr);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        android.content.Intent launchIntentForPackage;
        int i = DigitizedCardProfile;
        int i2 = i & 41;
        int i3 = (i | 41) & (~i2);
        int i4 = -(-(i2 << 1));
        int i5 = (i3 & i4) + (i3 | i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                throw null;
            }
            if (((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1113737201, -1113737134, (int) java.lang.System.currentTimeMillis())) != null) {
                int i6 = AlternateContactlessPaymentDataJson;
                int i7 = (i6 ^ 101) + ((i6 & 101) << 1);
                DigitizedCardProfile = i7 % 128;
                launchIntentForPackage = i7 % 2 != 0 ? android.content.Intent.parseUri((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1113737201, -1113737134, (int) java.lang.System.currentTimeMillis()), 0) : android.content.Intent.parseUri((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 1113737201, -1113737134, (int) java.lang.System.currentTimeMillis()), 1);
                AlternateContactlessPaymentDataJson = (DigitizedCardProfile + 47) % 128;
            } else {
                launchIntentForPackage = ((android.content.Context) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], -1451542343, 1451542366, (int) java.lang.System.currentTimeMillis())).getPackageManager().getLaunchIntentForPackage((java.lang.String) com.payair.hce.setSaveFromParentEnabled.DigitizedCardProfile(new java.lang.Object[0], 164907968, -164907959, (int) java.lang.System.currentTimeMillis()));
                int i8 = AlternateContactlessPaymentDataJson;
                int i9 = i8 & 3;
                DigitizedCardProfile = (i9 + ((i8 ^ 3) | i9)) % 128;
            }
            if (launchIntentForPackage != null) {
                int i10 = AlternateContactlessPaymentDataJson;
                int i11 = ((i10 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE) + (i10 | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE)) - 1;
                DigitizedCardProfile = i11 % 128;
                if (i11 % 2 != 0) {
                    launchIntentForPackage.addFlags(805306368);
                    throw null;
                }
                launchIntentForPackage.addFlags(805306368);
                DigitizedCardProfile = (AlternateContactlessPaymentDataJson + 115) % 128;
            }
            int i12 = DigitizedCardProfile + 49;
            AlternateContactlessPaymentDataJson = i12 % 128;
            if (i12 % 2 != 0) {
                return launchIntentForPackage;
            }
            throw null;
        } catch (java.net.URISyntaxException unused) {
            return null;
        }
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        final android.content.Context context = (android.content.Context) objArr[0];
        final android.content.Intent intent = (android.content.Intent) objArr[1];
        new android.os.Handler(context.getMainLooper()).post(new java.lang.Runnable() { // from class: com.payair.hce.setTranslationX.1
            private static int AlternateContactlessPaymentDataJson = 1;
            private static int values;

            public static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr2, int i, int i2, int i3) {
                return valueOf(objArr2);
            }

            private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr2) {
                com.payair.hce.setTranslationX.AnonymousClass1 anonymousClass1 = (com.payair.hce.setTranslationX.AnonymousClass1) objArr2[0];
                int i = AlternateContactlessPaymentDataJson;
                int i2 = i & 73;
                int i3 = (i | 73) & (~i2);
                int i4 = -(-(i2 << 1));
                values = ((i3 ^ i4) + ((i3 & i4) << 1)) % 128;
                context.startActivity(intent);
                int i5 = values;
                int i6 = (((i5 ^ 75) | (i5 & 75)) << 1) - ((i5 & (-76)) | ((~i5) & 75));
                AlternateContactlessPaymentDataJson = i6 % 128;
                if (i6 % 2 != 0) {
                    return null;
                }
                throw null;
            }

            @Override // java.lang.Runnable
            public final void run() {
                AlternateContactlessPaymentDataJson(new java.lang.Object[]{this}, 1566204985, -1566204985, java.lang.System.identityHashCode(this));
            }
        });
        int i = DigitizedCardProfile;
        int i2 = i ^ 23;
        int i3 = ((i & 23) | i2) << 1;
        int i4 = -i2;
        int i5 = (i3 & i4) + (i3 | i4);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        long longValue = ((java.lang.Number) objArr[0]).longValue();
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 31;
        int i3 = (i2 - (~((i ^ 31) | i2))) - 1;
        int i4 = i3 % 128;
        DigitizedCardProfile = i4;
        if (i3 % 2 == 0) {
            values = longValue;
            int i5 = i4 ^ 17;
            int i6 = -(-((i4 & 17) << 1));
            int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
            AlternateContactlessPaymentDataJson = i7 % 128;
            if (i7 % 2 != 0) {
                return null;
            }
            throw null;
        }
        values = longValue;
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        int i = (-2) - (~(AlternateContactlessPaymentDataJson + 2));
        DigitizedCardProfile = i % 128;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j = values;
        if (i % 2 == 0 ? currentTimeMillis - j < 90000 : (currentTimeMillis ^ j) < 90000) {
            int i2 = AlternateContactlessPaymentDataJson;
            DigitizedCardProfile = ((i2 & 75) + (i2 | 75)) % 128;
            return java.lang.Boolean.TRUE;
        }
        int i3 = DigitizedCardProfile;
        int i4 = i3 & 25;
        int i5 = ((i3 | 25) & (~i4)) + (i4 << 1);
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 != 0) {
            return java.lang.Boolean.FALSE;
        }
        throw null;
    }

    static boolean DigitizedCardProfile() {
        return ((java.lang.Boolean) valueOf(new java.lang.Object[0], -626139571, 626139574, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }

    static void writeReplace(long j) {
        valueOf(new java.lang.Object[]{java.lang.Long.valueOf(j)}, -325243520, 325243521, (int) java.lang.System.currentTimeMillis());
    }

    static void ag_(android.content.Context context, android.content.Intent intent) {
        valueOf(new java.lang.Object[]{context, intent}, 101450197, -101450197, (int) java.lang.System.currentTimeMillis());
    }

    static android.content.Intent af_() {
        return (android.content.Intent) valueOf(new java.lang.Object[0], 964113186, -964113184, (int) java.lang.System.currentTimeMillis());
    }
}
