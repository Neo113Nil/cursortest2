package com.paypal.oslo.feature.cryptocurrency.domain.model.settings;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;", "", "", "isActive", "", "", "assets", "<init>", "(ZLjava/util/List;)V", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/settings/RecurringBuysSettings;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Z", "Ljava/util/List;", "getAssets"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RecurringBuysSettings {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> assets;
    private final boolean isActive;

    public RecurringBuysSettings(boolean z, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.isActive = z;
        this.assets = list;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final java.util.List<java.lang.String> getAssets() {
        return this.assets;
    }

    public final java.lang.String toString() {
        boolean z = this.isActive;
        java.util.List<java.lang.String> list = this.assets;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecurringBuysSettings(isActive=");
        sb.append(z);
        sb.append(", assets=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isActive) * 31) + this.assets.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings = (com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings) other;
        return this.isActive == recurringBuysSettings.isActive && kotlin.jvm.internal.Intrinsics.areEqual(this.assets, recurringBuysSettings.assets);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings copy(boolean isActive, java.util.List<java.lang.String> assets) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assets, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings(isActive, assets);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.assets;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.settings.RecurringBuysSettings recurringBuysSettings, boolean z, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = recurringBuysSettings.isActive;
        }
        if ((i & 2) != 0) {
            list = recurringBuysSettings.assets;
        }
        return recurringBuysSettings.copy(z, list);
    }
}
