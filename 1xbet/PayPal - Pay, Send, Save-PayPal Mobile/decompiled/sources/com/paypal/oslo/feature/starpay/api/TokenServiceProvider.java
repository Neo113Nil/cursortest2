package com.paypal.oslo.feature.starpay.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/starpay/api/TokenServiceProvider;", "", "<init>", "(Ljava/lang/String;I)V", "VISA", "MASTERCARD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TokenServiceProvider {
    public static final com.paypal.oslo.feature.starpay.api.TokenServiceProvider MASTERCARD;
    public static final com.paypal.oslo.feature.starpay.api.TokenServiceProvider VISA;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.starpay.api.TokenServiceProvider[] getHighSpeedVideoSizes;

    private TokenServiceProvider(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider = new com.paypal.oslo.feature.starpay.api.TokenServiceProvider("VISA", 0);
        VISA = tokenServiceProvider;
        com.paypal.oslo.feature.starpay.api.TokenServiceProvider tokenServiceProvider2 = new com.paypal.oslo.feature.starpay.api.TokenServiceProvider("MASTERCARD", 1);
        MASTERCARD = tokenServiceProvider2;
        com.paypal.oslo.feature.starpay.api.TokenServiceProvider[] tokenServiceProviderArr = {tokenServiceProvider, tokenServiceProvider2};
        getHighSpeedVideoSizes = tokenServiceProviderArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(tokenServiceProviderArr);
    }

    public static com.paypal.oslo.feature.starpay.api.TokenServiceProvider[] values() {
        return (com.paypal.oslo.feature.starpay.api.TokenServiceProvider[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.starpay.api.TokenServiceProvider valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.starpay.api.TokenServiceProvider) java.lang.Enum.valueOf(com.paypal.oslo.feature.starpay.api.TokenServiceProvider.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.starpay.api.TokenServiceProvider> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
