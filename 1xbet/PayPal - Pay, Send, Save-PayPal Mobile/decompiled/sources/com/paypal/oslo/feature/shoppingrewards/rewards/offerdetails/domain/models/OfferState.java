package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/domain/models/OfferState;", "", "<init>", "(Ljava/lang/String;I)V", com.payair.model.TokenStatusKt.TOKEN_ACTIVE, com.payair.model.TokenStatusKt.TOKEN_INACTIVE}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferState {
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState ACTIVE;
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState INACTIVE;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private OfferState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState offerState = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState(com.payair.model.TokenStatusKt.TOKEN_ACTIVE, 0);
        ACTIVE = offerState;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState offerState2 = new com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState(com.payair.model.TokenStatusKt.TOKEN_INACTIVE, 1);
        INACTIVE = offerState2;
        com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState[] offerStateArr = {offerState, offerState2};
        Camera2StreamConfigurationMap = offerStateArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(offerStateArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.domain.models.OfferState> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
