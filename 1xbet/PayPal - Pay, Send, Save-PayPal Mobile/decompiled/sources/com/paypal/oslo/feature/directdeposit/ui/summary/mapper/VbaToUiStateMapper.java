package com.paypal.oslo.feature.directdeposit.ui.summary.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/mapper/VbaToUiStateMapper;", "Lcom/paypal/oslo/feature/directdeposit/domain/common/Mapper;", "Lcom/paypal/oslo/feature/directdeposit/domain/model/VbaItem;", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/directdeposit/domain/model/VbaItem;)Lcom/paypal/oslo/feature/directdeposit/ui/summary/state/VbaSummaryItemState;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class VbaToUiStateMapper implements com.paypal.oslo.feature.directdeposit.domain.common.Mapper<com.paypal.oslo.feature.directdeposit.domain.model.VbaItem, com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public VbaToUiStateMapper() {
    }

    @Override // com.paypal.oslo.feature.directdeposit.domain.common.Mapper
    public final com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState map(com.paypal.oslo.feature.directdeposit.domain.model.VbaItem input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.directdeposit.ui.summary.state.VbaSummaryItemState(input.getRoutingNumber(), input.getBankAccountNumber(), input.getStatus(), input.getDirectDebitStatus(), input.getBankName());
    }
}
