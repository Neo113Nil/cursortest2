package com.paypal.oslo.core.i18n.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;", "", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;", "currencyLayout", "Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "currencyDetails", "Lcom/paypal/oslo/core/i18n/domain/model/Fractions;", "currencyFraction", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;Lcom/paypal/oslo/core/i18n/domain/model/Currencies;Lcom/paypal/oslo/core/i18n/domain/model/Fractions;)V", "component1", "()Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;", "component2", "()Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Fractions;", "copy", "(Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;Lcom/paypal/oslo/core/i18n/domain/model/Currencies;Lcom/paypal/oslo/core/i18n/domain/model/Fractions;)Lcom/paypal/oslo/core/i18n/domain/model/CurrencyMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/model/CurrencyLayout;", "getCurrencyLayout", "Lcom/paypal/oslo/core/i18n/domain/model/Currencies;", "getCurrencyDetails", "Lcom/paypal/oslo/core/i18n/domain/model/Fractions;", "getCurrencyFraction"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CurrencyMetadata {
    private final com.paypal.oslo.core.i18n.domain.model.Currencies currencyDetails;
    private final com.paypal.oslo.core.i18n.domain.model.Fractions currencyFraction;
    private final com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout;

    public CurrencyMetadata(com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout, com.paypal.oslo.core.i18n.domain.model.Currencies currencies, com.paypal.oslo.core.i18n.domain.model.Fractions fractions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencies, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fractions, "");
        this.currencyLayout = currencyLayout;
        this.currencyDetails = currencies;
        this.currencyFraction = fractions;
    }

    public final com.paypal.oslo.core.i18n.domain.model.CurrencyLayout getCurrencyLayout() {
        return this.currencyLayout;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Currencies getCurrencyDetails() {
        return this.currencyDetails;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Fractions getCurrencyFraction() {
        return this.currencyFraction;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout = this.currencyLayout;
        com.paypal.oslo.core.i18n.domain.model.Currencies currencies = this.currencyDetails;
        com.paypal.oslo.core.i18n.domain.model.Fractions fractions = this.currencyFraction;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurrencyMetadata(currencyLayout=");
        sb.append(currencyLayout);
        sb.append(", currencyDetails=");
        sb.append(currencies);
        sb.append(", currencyFraction=");
        sb.append(fractions);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.currencyLayout.hashCode() * 31) + this.currencyDetails.hashCode()) * 31) + this.currencyFraction.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata)) {
            return false;
        }
        com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata = (com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.currencyLayout, currencyMetadata.currencyLayout) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyDetails, currencyMetadata.currencyDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyFraction, currencyMetadata.currencyFraction);
    }

    public final com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata copy(com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout, com.paypal.oslo.core.i18n.domain.model.Currencies currencyDetails, com.paypal.oslo.core.i18n.domain.model.Fractions currencyFraction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyLayout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyFraction, "");
        return new com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata(currencyLayout, currencyDetails, currencyFraction);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Fractions getCurrencyFraction() {
        return this.currencyFraction;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Currencies getCurrencyDetails() {
        return this.currencyDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.CurrencyLayout getCurrencyLayout() {
        return this.currencyLayout;
    }

    public static /* synthetic */ com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata copy$default(com.paypal.oslo.core.i18n.domain.model.CurrencyMetadata currencyMetadata, com.paypal.oslo.core.i18n.domain.model.CurrencyLayout currencyLayout, com.paypal.oslo.core.i18n.domain.model.Currencies currencies, com.paypal.oslo.core.i18n.domain.model.Fractions fractions, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            currencyLayout = currencyMetadata.currencyLayout;
        }
        if ((i & 2) != 0) {
            currencies = currencyMetadata.currencyDetails;
        }
        if ((i & 4) != 0) {
            fractions = currencyMetadata.currencyFraction;
        }
        return currencyMetadata.copy(currencyLayout, currencies, fractions);
    }
}
