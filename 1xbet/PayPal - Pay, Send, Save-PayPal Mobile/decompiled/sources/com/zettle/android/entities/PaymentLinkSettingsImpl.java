package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u0004\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u0003\u0010\n"}, d2 = {"Lcom/zettle/android/entities/PaymentLinkSettingsImpl;", "Lcom/zettle/android/entities/PaymentLinkSettings;", "", "isEnabled", "isCheckoutEnabled", "", "eopStatus", "<init>", "(ZZLjava/lang/String;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/String;", "copy", "(ZZLjava/lang/String;)Lcom/zettle/android/entities/PaymentLinkSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEopStatus", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class PaymentLinkSettingsImpl implements com.zettle.android.entities.PaymentLinkSettings {
    private final java.lang.String eopStatus;
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    public PaymentLinkSettingsImpl(boolean z, boolean z2, java.lang.String str) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.eopStatus = str;
    }

    @Override // com.zettle.android.entities.PaymentLinkSettings
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.zettle.android.entities.PaymentLinkSettings
    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    @Override // com.zettle.android.entities.PaymentLinkSettings
    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        java.lang.String str = this.eopStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentLinkSettingsImpl(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(", eopStatus=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isEnabled);
        int hashCode2 = java.lang.Boolean.hashCode(this.isCheckoutEnabled);
        java.lang.String str = this.eopStatus;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.PaymentLinkSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.PaymentLinkSettingsImpl paymentLinkSettingsImpl = (com.zettle.android.entities.PaymentLinkSettingsImpl) other;
        return this.isEnabled == paymentLinkSettingsImpl.isEnabled && this.isCheckoutEnabled == paymentLinkSettingsImpl.isCheckoutEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.eopStatus, paymentLinkSettingsImpl.eopStatus);
    }

    public final com.zettle.android.entities.PaymentLinkSettingsImpl copy(boolean isEnabled, boolean isCheckoutEnabled, java.lang.String eopStatus) {
        return new com.zettle.android.entities.PaymentLinkSettingsImpl(isEnabled, isCheckoutEnabled, eopStatus);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getEopStatus() {
        return this.eopStatus;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.android.entities.PaymentLinkSettingsImpl copy$default(com.zettle.android.entities.PaymentLinkSettingsImpl paymentLinkSettingsImpl, boolean z, boolean z2, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = paymentLinkSettingsImpl.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = paymentLinkSettingsImpl.isCheckoutEnabled;
        }
        if ((i & 4) != 0) {
            str = paymentLinkSettingsImpl.eopStatus;
        }
        return paymentLinkSettingsImpl.copy(z, z2, str);
    }
}
