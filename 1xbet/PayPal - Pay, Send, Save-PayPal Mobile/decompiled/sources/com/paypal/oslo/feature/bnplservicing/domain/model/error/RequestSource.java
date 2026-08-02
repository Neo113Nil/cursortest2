package com.paypal.oslo.feature.bnplservicing.domain.model.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/error/RequestSource;", "", "<init>", "(Ljava/lang/String;I)V", "PREQUALIFICATION_SUMMARY", "PLANS_OVERVIEW", "READY_TO_USE_PLANS", "APPLICATION_ELIGIBILITY", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RequestSource {
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource APPLICATION_ELIGIBILITY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource PLANS_OVERVIEW;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource PREQUALIFICATION_SUMMARY;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource READY_TO_USE_PLANS;
    public static final com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource UNKNOWN;
    private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private RequestSource(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource = new com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource("PREQUALIFICATION_SUMMARY", 0);
        PREQUALIFICATION_SUMMARY = requestSource;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource2 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource("PLANS_OVERVIEW", 1);
        PLANS_OVERVIEW = requestSource2;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource3 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource("READY_TO_USE_PLANS", 2);
        READY_TO_USE_PLANS = requestSource3;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource4 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource("APPLICATION_ELIGIBILITY", 3);
        APPLICATION_ELIGIBILITY = requestSource4;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource requestSource5 = new com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource("UNKNOWN", 4);
        UNKNOWN = requestSource5;
        com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource[] requestSourceArr = {requestSource, requestSource2, requestSource3, requestSource4, requestSource5};
        getHighResolutionOutputSizeshNQ4ISI = requestSourceArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(requestSourceArr);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource[] values() {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.domain.model.error.RequestSource> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
