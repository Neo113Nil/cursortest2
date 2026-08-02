package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;", "", "", "name", "countryCode", "issuerProductDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/CardIssuer;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getCountryCode", "getIssuerProductDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CardIssuer {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String issuerProductDescription;
    private final java.lang.String name;

    public CardIssuer(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.countryCode = str2;
        this.issuerProductDescription = str3;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getIssuerProductDescription() {
        return this.issuerProductDescription;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.countryCode;
        java.lang.String str3 = this.issuerProductDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardIssuer(name=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(str2);
        sb.append(", issuerProductDescription=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.issuerProductDescription.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cardIssuer.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, cardIssuer.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerProductDescription, cardIssuer.issuerProductDescription);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer copy(java.lang.String name2, java.lang.String countryCode, java.lang.String issuerProductDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerProductDescription, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer(name2, countryCode, issuerProductDescription);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getIssuerProductDescription() {
        return this.issuerProductDescription;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.CardIssuer cardIssuer, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardIssuer.name;
        }
        if ((i & 2) != 0) {
            str2 = cardIssuer.countryCode;
        }
        if ((i & 4) != 0) {
            str3 = cardIssuer.issuerProductDescription;
        }
        return cardIssuer.copy(str, str2, str3);
    }
}
