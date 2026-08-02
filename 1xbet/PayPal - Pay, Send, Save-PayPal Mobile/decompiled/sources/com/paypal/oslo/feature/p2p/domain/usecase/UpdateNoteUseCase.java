package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/UpdateNoteUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "transferFlowRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;)V", "Lcom/paypal/oslo/feature/p2p/domain/model/Note;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/TransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptNoteResult;", "invoke", "(Lcom/paypal/oslo/feature/p2p/domain/model/Note;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/p2p/domain/repository/TransferFlowRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UpdateNoteUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public UpdateNoteUseCase(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferFlowRepository, "");
        this.getHighSpeedVideoSizes = transferFlowRepository;
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Ior<com.paypal.oslo.feature.p2p.domain.error.TransferError, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptNoteResult>> invoke(com.paypal.oslo.feature.p2p.domain.model.Note note) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(note, "");
        return this.getHighSpeedVideoSizes.updatePaymentTransferAttemptNote(note);
    }
}
