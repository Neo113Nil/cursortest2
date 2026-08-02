package com.paypal.oslo.app.network;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class NetworkLoggingLevelProviderKt {
    public static final /* synthetic */ okhttp3.logging.HttpLoggingInterceptor.Level access$toOkHttpLevel(com.paypal.oslo.core.companion.domain.NetworkLoggingLevel networkLoggingLevel) {
        int i = com.paypal.oslo.app.network.NetworkLoggingLevelProviderKt.WhenMappings.$EnumSwitchMapping$0[networkLoggingLevel.ordinal()];
        if (i == 1) {
            return okhttp3.logging.HttpLoggingInterceptor.Level.NONE;
        }
        if (i == 2) {
            return okhttp3.logging.HttpLoggingInterceptor.Level.BASIC;
        }
        if (i == 3) {
            return okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return okhttp3.logging.HttpLoggingInterceptor.Level.HEADERS;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.values().length];
            try {
                iArr[com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.BASIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.HEADERS_REDACTED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.HEADERS_WITH_SENSITIVE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
