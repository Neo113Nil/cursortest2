package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;", "", "isInstrumentAdditionMandatory", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdateTransferTypeResult;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateTransferTypeResultKt {
    public static final boolean isInstrumentAdditionMandatory(com.paypal.oslo.feature.p2p.domain.model.UpdateTransferTypeResult updateTransferTypeResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateTransferTypeResult, "");
        if (updateTransferTypeResult.getFundingOptions() != null) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfig instrumentAdditionConfig = updateTransferTypeResult.getInstrumentAdditionConfig();
        return (instrumentAdditionConfig != null ? instrumentAdditionConfig.getStatus() : null) == com.paypal.oslo.feature.p2p.domain.model.InstrumentAdditionConfigStatus.MANDATORY;
    }
}
