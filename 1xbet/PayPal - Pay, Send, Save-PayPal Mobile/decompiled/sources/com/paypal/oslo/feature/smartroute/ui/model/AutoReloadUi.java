package com.paypal.oslo.feature.smartroute.ui.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/smartroute/ui/model/AutoReloadUi;", "", "", "isEnabled", "", "thresholdAmount", "reloadAmount", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "copy", "(ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/smartroute/ui/model/AutoReloadUi;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getThresholdAmount", "getReloadAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class AutoReloadUi {
    public static final int $stable = 0;
    private final boolean isEnabled;
    private final java.lang.String reloadAmount;
    private final java.lang.String thresholdAmount;

    public AutoReloadUi(boolean z, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.isEnabled = z;
        this.thresholdAmount = str;
        this.reloadAmount = str2;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final java.lang.String getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final java.lang.String getReloadAmount() {
        return this.reloadAmount;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        java.lang.String str = this.thresholdAmount;
        java.lang.String str2 = this.reloadAmount;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoReloadUi(isEnabled=");
        sb.append(z);
        sb.append(", thresholdAmount=");
        sb.append(str);
        sb.append(", reloadAmount=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isEnabled) * 31) + this.thresholdAmount.hashCode()) * 31) + this.reloadAmount.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi)) {
            return false;
        }
        com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi autoReloadUi = (com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi) other;
        return this.isEnabled == autoReloadUi.isEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.thresholdAmount, autoReloadUi.thresholdAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.reloadAmount, autoReloadUi.reloadAmount);
    }

    public final com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi copy(boolean isEnabled, java.lang.String thresholdAmount, java.lang.String reloadAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thresholdAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reloadAmount, "");
        return new com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi(isEnabled, thresholdAmount, reloadAmount);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getReloadAmount() {
        return this.reloadAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getThresholdAmount() {
        return this.thresholdAmount;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi copy$default(com.paypal.oslo.feature.smartroute.ui.model.AutoReloadUi autoReloadUi, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = autoReloadUi.isEnabled;
        }
        if ((i & 2) != 0) {
            str = autoReloadUi.thresholdAmount;
        }
        if ((i & 4) != 0) {
            str2 = autoReloadUi.reloadAmount;
        }
        return autoReloadUi.copy(z, str, str2);
    }
}
