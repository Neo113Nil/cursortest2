package com.paypal.oslo.feature.oneonboarding.api.domain;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/NavDecor;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, "SKIP"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavDecor {
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor BACK;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor CLOSE;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor HOME;
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor SKIP;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor[] getHighSpeedVideoFpsRanges;

    static {
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor = new com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor("HOME", 0);
        HOME = navDecor;
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor2 = new com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor(com.ingo.sdk.kotlin.common.core.http.response.ImageValidationFailureResponse.BACK, 1);
        BACK = navDecor2;
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor3 = new com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor(com.statsig.androidsdk.HttpUtils.CONNECTION_HEADER_CLOSE, 2);
        CLOSE = navDecor3;
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor navDecor4 = new com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor("SKIP", 3);
        SKIP = navDecor4;
        com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor[] navDecorArr = {navDecor, navDecor2, navDecor3, navDecor4};
        getHighSpeedVideoFpsRanges = navDecorArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(navDecorArr);
    }

    private NavDecor(java.lang.String str, int i) {
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor[] values() {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor) java.lang.Enum.valueOf(com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.oneonboarding.api.domain.NavDecor> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
