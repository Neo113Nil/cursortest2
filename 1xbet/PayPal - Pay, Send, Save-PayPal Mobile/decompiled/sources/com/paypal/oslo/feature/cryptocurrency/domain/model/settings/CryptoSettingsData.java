package com.paypal.oslo.feature.cryptocurrency.domain.model.settings;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/CryptoSettingsData;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;", "recurringBuys", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PriceAlertsSettings;", "priceAlerts", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;", "pyusdRewards", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PriceAlertsSettings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PriceAlertsSettings;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PriceAlertsSettings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/CryptoSettingsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;", "getRecurringBuys", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PriceAlertsSettings;", "getPriceAlerts", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/PyusdRewardsSettings;", "getPyusdRewards"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoSettingsData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlerts;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewards;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuys;

    public CryptoSettingsData(com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlertsSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewardsSettings) {
        this.recurringBuys = recurringBuysSettings;
        this.priceAlerts = priceAlertsSettings;
        this.pyusdRewards = pyusdRewardsSettings;
    }

    public /* synthetic */ CryptoSettingsData(com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlertsSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewardsSettings, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : recurringBuysSettings, (i & 2) != 0 ? null : priceAlertsSettings, (i & 4) != 0 ? null : pyusdRewardsSettings);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings getRecurringBuys() {
        return this.recurringBuys;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings getPriceAlerts() {
        return this.priceAlerts;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings getPyusdRewards() {
        return this.pyusdRewards;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings = this.recurringBuys;
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlertsSettings = this.priceAlerts;
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewardsSettings = this.pyusdRewards;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoSettingsData(recurringBuys=");
        sb.append(recurringBuysSettings);
        sb.append(", priceAlerts=");
        sb.append(priceAlertsSettings);
        sb.append(", pyusdRewards=");
        sb.append(pyusdRewardsSettings);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings = this.recurringBuys;
        int hashCode = recurringBuysSettings == null ? 0 : recurringBuysSettings.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlertsSettings = this.priceAlerts;
        int hashCode2 = priceAlertsSettings == null ? 0 : priceAlertsSettings.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewardsSettings = this.pyusdRewards;
        return (((hashCode * 31) + hashCode2) * 31) + (pyusdRewardsSettings != null ? pyusdRewardsSettings.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData cryptoSettingsData = (com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.recurringBuys, cryptoSettingsData.recurringBuys) && kotlin.jvm.internal.Intrinsics.areEqual(this.priceAlerts, cryptoSettingsData.priceAlerts) && kotlin.jvm.internal.Intrinsics.areEqual(this.pyusdRewards, cryptoSettingsData.pyusdRewards);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData copy(com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuys, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlerts, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewards) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData(recurringBuys, priceAlerts, pyusdRewards);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings getPyusdRewards() {
        return this.pyusdRewards;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings getPriceAlerts() {
        return this.priceAlerts;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings getRecurringBuys() {
        return this.recurringBuys;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.settings.CryptoSettingsData cryptoSettingsData, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PriceAlertsSettings priceAlertsSettings, com.paypal.oslo.feature.cryptocurrency.domain.model.settings.PyusdRewardsSettings pyusdRewardsSettings, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            recurringBuysSettings = cryptoSettingsData.recurringBuys;
        }
        if ((i & 2) != 0) {
            priceAlertsSettings = cryptoSettingsData.priceAlerts;
        }
        if ((i & 4) != 0) {
            pyusdRewardsSettings = cryptoSettingsData.pyusdRewards;
        }
        return cryptoSettingsData.copy(recurringBuysSettings, priceAlertsSettings, pyusdRewardsSettings);
    }

    public CryptoSettingsData() {
        this(null, null, null, 7, null);
    }
}
