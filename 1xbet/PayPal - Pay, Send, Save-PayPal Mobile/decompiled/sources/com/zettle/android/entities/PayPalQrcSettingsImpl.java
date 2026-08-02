package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0003\u0010\t"}, d2 = {"Lcom/zettle/android/entities/PayPalQrcSettingsImpl;", "Lcom/zettle/android/entities/PayPalQrcSettings;", "", "isEnabled", "isCheckoutEnabled", "isActivated", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/zettle/android/entities/PayPalQrcSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class PayPalQrcSettingsImpl implements com.zettle.android.entities.PayPalQrcSettings {
    private final boolean isActivated;
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    public PayPalQrcSettingsImpl(boolean z, boolean z2, boolean z3) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
        this.isActivated = z3;
    }

    @Override // com.zettle.android.entities.PayPalQrcSettings
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.zettle.android.entities.PayPalQrcSettings
    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    @Override // com.zettle.android.entities.PayPalQrcSettings
    public final boolean isActivated() {
        return this.isActivated;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        boolean z3 = this.isActivated;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalQrcSettingsImpl(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(", isActivated=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((java.lang.Boolean.hashCode(this.isEnabled) * 31) + java.lang.Boolean.hashCode(this.isCheckoutEnabled)) * 31) + java.lang.Boolean.hashCode(this.isActivated);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.PayPalQrcSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.PayPalQrcSettingsImpl payPalQrcSettingsImpl = (com.zettle.android.entities.PayPalQrcSettingsImpl) other;
        return this.isEnabled == payPalQrcSettingsImpl.isEnabled && this.isCheckoutEnabled == payPalQrcSettingsImpl.isCheckoutEnabled && this.isActivated == payPalQrcSettingsImpl.isActivated;
    }

    public final com.zettle.android.entities.PayPalQrcSettingsImpl copy(boolean isEnabled, boolean isCheckoutEnabled, boolean isActivated) {
        return new com.zettle.android.entities.PayPalQrcSettingsImpl(isEnabled, isCheckoutEnabled, isActivated);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsActivated() {
        return this.isActivated;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.android.entities.PayPalQrcSettingsImpl copy$default(com.zettle.android.entities.PayPalQrcSettingsImpl payPalQrcSettingsImpl, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = payPalQrcSettingsImpl.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = payPalQrcSettingsImpl.isCheckoutEnabled;
        }
        if ((i & 4) != 0) {
            z3 = payPalQrcSettingsImpl.isActivated;
        }
        return payPalQrcSettingsImpl.copy(z, z2, z3);
    }
}
