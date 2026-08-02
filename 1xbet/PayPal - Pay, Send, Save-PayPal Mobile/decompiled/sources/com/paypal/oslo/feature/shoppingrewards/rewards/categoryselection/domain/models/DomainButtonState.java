package com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/categoryselection/domain/models/DomainButtonState;", "", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DomainButtonState {
    private static final /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState DISABLED;
    public static final com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState ENABLED;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private DomainButtonState(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState domainButtonState = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState("ENABLED", 0);
        ENABLED = domainButtonState;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState domainButtonState2 = new com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState("DISABLED", 1);
        DISABLED = domainButtonState2;
        com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState[] domainButtonStateArr = {domainButtonState, domainButtonState2};
        Camera2StreamConfigurationMap = domainButtonStateArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(domainButtonStateArr);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState[] values() {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState) java.lang.Enum.valueOf(com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.shoppingrewards.rewards.categoryselection.domain.models.DomainButtonState> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
