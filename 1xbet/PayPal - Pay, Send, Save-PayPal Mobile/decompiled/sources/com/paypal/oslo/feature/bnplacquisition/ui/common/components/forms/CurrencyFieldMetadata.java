package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/CurrencyFieldMetadata;", "", "", "disableFractionalEntry", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/forms/CurrencyFieldMetadata;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getDisableFractionalEntry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CurrencyFieldMetadata {
    public static final int $stable = 0;
    private final boolean disableFractionalEntry;

    public CurrencyFieldMetadata(boolean z) {
        this.disableFractionalEntry = z;
    }

    public /* synthetic */ CurrencyFieldMetadata(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }

    public final boolean getDisableFractionalEntry() {
        return this.disableFractionalEntry;
    }

    public final java.lang.String toString() {
        boolean z = this.disableFractionalEntry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyFieldMetadata(disableFractionalEntry=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.disableFractionalEntry);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata) && this.disableFractionalEntry == ((com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata) other).disableFractionalEntry;
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata copy(boolean disableFractionalEntry) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata(disableFractionalEntry);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getDisableFractionalEntry() {
        return this.disableFractionalEntry;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.CurrencyFieldMetadata currencyFieldMetadata, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = currencyFieldMetadata.disableFractionalEntry;
        }
        return currencyFieldMetadata.copy(z);
    }

    public CurrencyFieldMetadata() {
        this(false, 1, null);
    }
}
