package com.paypal.oslo.feature.subscriptions.shared.ui.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentWithPosition;", "", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "fi", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;", com.daon.sdk.face.license.License.FEATURE_POSITION, "<init>", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;)V", "component1", "()Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "component2", "()Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;", "copy", "(Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;)Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentWithPosition;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/subscriptions/shared/ui/model/FundingInstrumentUiModel;", "getFi", "Lcom/paypal/oslo/feature/subscriptions/shared/domain/model/FundingInstrumentPriority;", "getPosition"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class FundingInstrumentWithPosition {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fi;
    private final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority position;

    public FundingInstrumentWithPosition(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentPriority, "");
        this.fi = fundingInstrumentUiModel;
        this.position = fundingInstrumentPriority;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFi() {
        return this.fi;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority getPosition() {
        return this.position;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel = this.fi;
        com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority = this.position;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentWithPosition(fi=");
        sb.append(fundingInstrumentUiModel);
        sb.append(", position=");
        sb.append(fundingInstrumentPriority);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.fi.hashCode() * 31) + this.position.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition)) {
            return false;
        }
        com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition fundingInstrumentWithPosition = (com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fi, fundingInstrumentWithPosition.fi) && this.position == fundingInstrumentWithPosition.position;
    }

    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition copy(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fi, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority position) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fi, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(position, "");
        return new com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition(fi, position);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority getPosition() {
        return this.position;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel getFi() {
        return this.fi;
    }

    public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition copy$default(com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentWithPosition fundingInstrumentWithPosition, com.paypal.oslo.feature.subscriptions.shared.ui.model.FundingInstrumentUiModel fundingInstrumentUiModel, com.paypal.oslo.feature.subscriptions.shared.domain.model.FundingInstrumentPriority fundingInstrumentPriority, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fundingInstrumentUiModel = fundingInstrumentWithPosition.fi;
        }
        if ((i & 2) != 0) {
            fundingInstrumentPriority = fundingInstrumentWithPosition.position;
        }
        return fundingInstrumentWithPosition.copy(fundingInstrumentUiModel, fundingInstrumentPriority);
    }
}
