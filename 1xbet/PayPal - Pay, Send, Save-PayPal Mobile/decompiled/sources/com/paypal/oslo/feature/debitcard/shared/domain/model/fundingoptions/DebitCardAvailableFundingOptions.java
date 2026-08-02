package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "fundingSources", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardAvailableFundingOptions;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getFundingSources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardAvailableFundingOptions {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> fundingSources;

    public DebitCardAvailableFundingOptions(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.fundingSources = list;
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> getFundingSources() {
        return this.fundingSources;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> list = this.fundingSources;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardAvailableFundingOptions(fundingSources=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.fundingSources.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSources, ((com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions) other).fundingSources);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions copy(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> fundingSources) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSources, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions(fundingSources);
    }

    public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource> component1() {
        return this.fundingSources;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardAvailableFundingOptions debitCardAvailableFundingOptions, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = debitCardAvailableFundingOptions.fundingSources;
        }
        return debitCardAvailableFundingOptions.copy(list);
    }
}
