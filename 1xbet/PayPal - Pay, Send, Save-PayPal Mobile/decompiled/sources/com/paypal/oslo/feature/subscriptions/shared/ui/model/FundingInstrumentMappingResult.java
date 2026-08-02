package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentMappingResult;", "", "", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentWithPosition;", "instruments", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "absence", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentMappingResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getInstruments", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/PaymentMethodAbsence;", "getAbsence"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingInstrumentMappingResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence absence;
    private final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> instruments;

    public FundingInstrumentMappingResult(java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.instruments = list;
        this.absence = paymentMethodAbsence;
    }

    public /* synthetic */ FundingInstrumentMappingResult(java.util.List list, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : paymentMethodAbsence);
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> getInstruments() {
        return this.instruments;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence getAbsence() {
        return this.absence;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> list = this.instruments;
        com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence = this.absence;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentMappingResult(instruments=");
        sb.append(list);
        sb.append(", absence=");
        sb.append(paymentMethodAbsence);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.instruments.hashCode();
        com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence = this.absence;
        return (hashCode * 31) + (paymentMethodAbsence == null ? 0 : paymentMethodAbsence.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult fundingInstrumentMappingResult = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.instruments, fundingInstrumentMappingResult.instruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.absence, fundingInstrumentMappingResult.absence);
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult copy(java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> instruments, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence absence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instruments, "");
        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult(instruments, absence);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence getAbsence() {
        return this.absence;
    }

    public final java.util.List<com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition> component1() {
        return this.instruments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentMappingResult fundingInstrumentMappingResult, java.util.List list, com.paypal.oslo.feature.subscriptions.shared.ui.model.PaymentMethodAbsence paymentMethodAbsence, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = fundingInstrumentMappingResult.instruments;
        }
        if ((i & 2) != 0) {
            paymentMethodAbsence = fundingInstrumentMappingResult.absence;
        }
        return fundingInstrumentMappingResult.copy(list, paymentMethodAbsence);
    }
}
