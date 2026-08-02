package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0004\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\b"}, d2 = {"Lcom/zettle/android/entities/InvoiceSettingsImpl;", "Lcom/zettle/android/entities/InvoiceSettings;", "", "isEnabled", "isCheckoutEnabled", "<init>", "(ZZ)V", "component1", "()Z", "component2", "copy", "(ZZ)Lcom/zettle/android/entities/InvoiceSettingsImpl;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class InvoiceSettingsImpl implements com.zettle.android.entities.InvoiceSettings {
    private final boolean isCheckoutEnabled;
    private final boolean isEnabled;

    public InvoiceSettingsImpl(boolean z, boolean z2) {
        this.isEnabled = z;
        this.isCheckoutEnabled = z2;
    }

    @Override // com.zettle.android.entities.InvoiceSettings
    public final boolean isEnabled() {
        return this.isEnabled;
    }

    @Override // com.zettle.android.entities.InvoiceSettings
    public final boolean isCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    public final java.lang.String toString() {
        boolean z = this.isEnabled;
        boolean z2 = this.isCheckoutEnabled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InvoiceSettingsImpl(isEnabled=");
        sb.append(z);
        sb.append(", isCheckoutEnabled=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (java.lang.Boolean.hashCode(this.isEnabled) * 31) + java.lang.Boolean.hashCode(this.isCheckoutEnabled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.InvoiceSettingsImpl)) {
            return false;
        }
        com.zettle.android.entities.InvoiceSettingsImpl invoiceSettingsImpl = (com.zettle.android.entities.InvoiceSettingsImpl) other;
        return this.isEnabled == invoiceSettingsImpl.isEnabled && this.isCheckoutEnabled == invoiceSettingsImpl.isCheckoutEnabled;
    }

    public final com.zettle.android.entities.InvoiceSettingsImpl copy(boolean isEnabled, boolean isCheckoutEnabled) {
        return new com.zettle.android.entities.InvoiceSettingsImpl(isEnabled, isCheckoutEnabled);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsCheckoutEnabled() {
        return this.isCheckoutEnabled;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public static /* synthetic */ com.zettle.android.entities.InvoiceSettingsImpl copy$default(com.zettle.android.entities.InvoiceSettingsImpl invoiceSettingsImpl, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = invoiceSettingsImpl.isEnabled;
        }
        if ((i & 2) != 0) {
            z2 = invoiceSettingsImpl.isCheckoutEnabled;
        }
        return invoiceSettingsImpl.copy(z, z2);
    }
}
