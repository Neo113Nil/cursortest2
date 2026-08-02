package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/promotions/PromotionalActivityStatus;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, "EXPIRED", "EXPIRING", "PAID_OFF", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PromotionalActivityStatus {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus EXPIRED;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus EXPIRING;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus PAID_OFF;
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private PromotionalActivityStatus(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = promotionalActivityStatus;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus2 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus("EXPIRED", 1);
        EXPIRED = promotionalActivityStatus2;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus3 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus("EXPIRING", 2);
        EXPIRING = promotionalActivityStatus3;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus4 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus("PAID_OFF", 3);
        PAID_OFF = promotionalActivityStatus4;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus promotionalActivityStatus5 = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus("UNKNOWN", 4);
        UNKNOWN = promotionalActivityStatus5;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus[] promotionalActivityStatusArr = {promotionalActivityStatus, promotionalActivityStatus2, promotionalActivityStatus3, promotionalActivityStatus4, promotionalActivityStatus5};
        Camera2StreamConfigurationMap = promotionalActivityStatusArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(promotionalActivityStatusArr);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus[] values() {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.promotions.PromotionalActivityStatus> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
