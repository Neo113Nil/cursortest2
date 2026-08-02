package com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsRequest;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs.FUNDING_SOURCE, "", "instrumentId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "primaryFundingOption", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;)Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/SetDebitCardFundingOptionsRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingSource;", "getFundingSource", "Ljava/lang/String;", "getInstrumentId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/PrimaryFundingOptionType;", "getPrimaryFundingOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SetDebitCardFundingOptionsRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource fundingSource;
    private final java.lang.String instrumentId;
    private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOption;

    public SetDebitCardFundingOptionsRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFundingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.fundingSource = debitCardFundingSource;
        this.instrumentId = str;
        this.primaryFundingOption = primaryFundingOptionType;
    }

    public /* synthetic */ SetDebitCardFundingOptionsRequest(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(debitCardFundingSource, str, (i & 4) != 0 ? null : primaryFundingOptionType);
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getFundingSource() {
        return this.fundingSource;
    }

    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource = this.fundingSource;
        java.lang.String str = this.instrumentId;
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType = this.primaryFundingOption;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetDebitCardFundingOptionsRequest(fundingSource=");
        sb.append(debitCardFundingSource);
        sb.append(", instrumentId=");
        sb.append(str);
        sb.append(", primaryFundingOption=");
        sb.append(primaryFundingOptionType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fundingSource.hashCode();
        int hashCode2 = this.instrumentId.hashCode();
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType = this.primaryFundingOption;
        return (((hashCode * 31) + hashCode2) * 31) + (primaryFundingOptionType == null ? 0 : primaryFundingOptionType.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest = (com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSource, setDebitCardFundingOptionsRequest.fundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, setDebitCardFundingOptionsRequest.instrumentId) && this.primaryFundingOption == setDebitCardFundingOptionsRequest.primaryFundingOption;
    }

    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest copy(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource fundingSource, java.lang.String instrumentId, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        return new com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest(fundingSource, instrumentId, primaryFundingOption);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType getPrimaryFundingOption() {
        return this.primaryFundingOption;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource getFundingSource() {
        return this.fundingSource;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest copy$default(com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.SetDebitCardFundingOptionsRequest setDebitCardFundingOptionsRequest, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingSource debitCardFundingSource, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.PrimaryFundingOptionType primaryFundingOptionType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            debitCardFundingSource = setDebitCardFundingOptionsRequest.fundingSource;
        }
        if ((i & 2) != 0) {
            str = setDebitCardFundingOptionsRequest.instrumentId;
        }
        if ((i & 4) != 0) {
            primaryFundingOptionType = setDebitCardFundingOptionsRequest.primaryFundingOption;
        }
        return setDebitCardFundingOptionsRequest.copy(debitCardFundingSource, str, primaryFundingOptionType);
    }
}
