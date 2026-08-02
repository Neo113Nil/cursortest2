package com.payair.hce;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u0012"}, d2 = {"Lcom/payair/hce/setWebChromeClient;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "values", "(Landroid/content/Context;)V", "", "p1", "", "writeReplace", "(Landroid/content/Context;Ljava/lang/String;)Z", "Lcom/visa/cbp/sdk/facade/data/TokenStatus;", "p2", "DigitizedCardProfile", "(Landroid/content/Context;Ljava/lang/String;Lcom/visa/cbp/sdk/facade/data/TokenStatus;)V", "()Ljava/lang/String;", "valueOf"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class setWebChromeClient {
    private static int AlternateContactlessPaymentDataJson = 0;
    public static final com.payair.hce.setWebChromeClient INSTANCE = new com.payair.hce.setWebChromeClient();
    private static int valueOf = 1;

    public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~((~i) | i2);
        int i5 = ~i2;
        int i6 = ~(i | i5);
        int i7 = (i * (-523)) + (i2 * 263) + ((i4 | i6 | (~(i5 | i3))) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE) + (i6 * (-786)) + (((~((~i3) | i5)) | i4 | i6) * com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
        return i7 != 1 ? i7 != 2 ? i7 != 3 ? DigitizedCardProfile(objArr) : AlternateContactlessPaymentDataJson(objArr) : values(objArr) : valueOf(objArr);
    }

    private setWebChromeClient() {
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        int i = AlternateContactlessPaymentDataJson;
        valueOf = (((i | 81) << 1) - (i ^ 81)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1749358625, -1749358596, (int) java.lang.System.currentTimeMillis());
        if (setinitialscale == null) {
            int i2 = AlternateContactlessPaymentDataJson;
            int i3 = (i2 & 89) + (i2 | 89);
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                return java.lang.Boolean.FALSE;
            }
            throw null;
        }
        int i4 = valueOf;
        int i5 = ((i4 ^ 43) | (i4 & 43)) << 1;
        int i6 = -((i4 & (-44)) | ((~i4) & 43));
        AlternateContactlessPaymentDataJson = (((i5 | i6) << 1) - (i6 ^ i5)) % 128;
        boolean booleanValue = ((java.lang.Boolean) com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale, context, str}, 660956007, -660956005, java.lang.System.identityHashCode(setinitialscale))).booleanValue();
        int i7 = AlternateContactlessPaymentDataJson;
        int i8 = i7 & 95;
        int i9 = (i8 - (~(-(-((i7 ^ 95) | i8))))) - 1;
        valueOf = i9 % 128;
        if (i9 % 2 != 0) {
            return java.lang.Boolean.valueOf(booleanValue);
        }
        throw null;
    }

    private static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 119;
        valueOf = (((i | 119) & (~i2)) + (i2 << 1)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1749358625, -1749358596, (int) java.lang.System.currentTimeMillis());
        if (setinitialscale == null) {
            int i3 = valueOf;
            AlternateContactlessPaymentDataJson = (((i3 & 50) + (i3 | 50)) - 1) % 128;
            return null;
        }
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = (i4 & (-86)) | ((~i4) & 85);
        int i6 = (i4 & 85) << 1;
        int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
        valueOf = i7 % 128;
        if (i7 % 2 != 0) {
            com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale, context}, 373382978, -373382977, java.lang.System.identityHashCode(setinitialscale));
            return null;
        }
        com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale, context}, 373382978, -373382977, java.lang.System.identityHashCode(setinitialscale));
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object AlternateContactlessPaymentDataJson(java.lang.Object[] objArr) {
        AlternateContactlessPaymentDataJson = (valueOf + 43) % 128;
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1749358625, -1749358596, (int) java.lang.System.currentTimeMillis());
        if (setinitialscale == null) {
            int i = valueOf;
            int i2 = ((i ^ 37) | (i & 37)) << 1;
            int i3 = -((i & (-38)) | ((~i) & 37));
            AlternateContactlessPaymentDataJson = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
            return null;
        }
        int i4 = valueOf;
        AlternateContactlessPaymentDataJson = ((i4 & 67) + (i4 | 67)) % 128;
        java.lang.String str = (java.lang.String) com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale}, 540052939, -540052939, java.lang.System.identityHashCode(setinitialscale));
        int i5 = valueOf + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        AlternateContactlessPaymentDataJson = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr) {
        android.content.Context context = (android.content.Context) objArr[0];
        java.lang.String str = (java.lang.String) objArr[1];
        com.visa.cbp.sdk.facade.data.TokenStatus tokenStatus = (com.visa.cbp.sdk.facade.data.TokenStatus) objArr[2];
        int i = valueOf;
        AlternateContactlessPaymentDataJson = (((i & (-58)) | ((~i) & 57)) + ((i & 57) << 1)) % 128;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenStatus, "");
        com.payair.hce.setNetworkAvailable setnetworkavailable = com.payair.hce.setNetworkAvailable.values;
        com.payair.hce.setInitialScale setinitialscale = (com.payair.hce.setInitialScale) com.payair.hce.setNetworkAvailable.values(new java.lang.Object[0], 1749358625, -1749358596, (int) java.lang.System.currentTimeMillis());
        if (setinitialscale == null) {
            int i2 = AlternateContactlessPaymentDataJson;
            int i3 = ((i2 | 111) << 1) - (i2 ^ 111);
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i4 = AlternateContactlessPaymentDataJson;
        int i5 = ((i4 ^ 35) | (i4 & 35)) << 1;
        int i6 = -((i4 & (-36)) | ((~i4) & 35));
        int i7 = (i5 & i6) + (i6 | i5);
        valueOf = i7 % 128;
        if (i7 % 2 == 0) {
            com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale, context, str, tokenStatus}, -1421970376, 1421970380, java.lang.System.identityHashCode(setinitialscale));
            throw new java.lang.ArithmeticException();
        }
        com.payair.hce.setInitialScale.values(new java.lang.Object[]{setinitialscale, context, str, tokenStatus}, -1421970376, 1421970380, java.lang.System.identityHashCode(setinitialscale));
        int i8 = AlternateContactlessPaymentDataJson;
        int i9 = i8 & 15;
        int i10 = -(-((i8 ^ 15) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        valueOf = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static {
        int i = AlternateContactlessPaymentDataJson;
        int i2 = i & 53;
        int i3 = i | 53;
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void DigitizedCardProfile(android.content.Context p0, java.lang.String p1, com.visa.cbp.sdk.facade.data.TokenStatus p2) {
        values(new java.lang.Object[]{p0, p1, p2}, -1894136898, 1894136898, (int) java.lang.System.currentTimeMillis());
    }

    public static final java.lang.String writeReplace() {
        return (java.lang.String) values(new java.lang.Object[0], -650477225, 650477228, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final void values(android.content.Context p0) {
        values(new java.lang.Object[]{p0}, 1176974760, -1176974759, (int) java.lang.System.currentTimeMillis());
    }

    @kotlin.jvm.JvmStatic
    public static final boolean writeReplace(android.content.Context p0, java.lang.String p1) {
        return ((java.lang.Boolean) values(new java.lang.Object[]{p0, p1}, -1289809913, 1289809915, (int) java.lang.System.currentTimeMillis())).booleanValue();
    }
}
