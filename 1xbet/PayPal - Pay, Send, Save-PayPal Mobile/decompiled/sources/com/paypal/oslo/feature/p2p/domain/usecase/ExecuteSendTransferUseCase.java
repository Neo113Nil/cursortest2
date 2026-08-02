package com.paypal.oslo.feature.p2p.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/usecase/ExecuteSendTransferUseCase;", "", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;", "paymentTransferRepository", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;)V", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_ATTEMPT_ID, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FUNDING_OPTION_ID, "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/p2p/domain/error/ExecutePaymentTransferError;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentTransferResult$Send;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/p2p/domain/repository/PaymentTransferRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExecuteSendTransferUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public ExecuteSendTransferUseCase(com.paypal.oslo.feature.p2p.domain.repository.PaymentTransferRepository paymentTransferRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTransferRepository, "");
        this.Camera2StreamConfigurationMap = paymentTransferRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.p2p.domain.error.ExecutePaymentTransferError, com.paypal.oslo.feature.p2p.domain.model.PaymentTransferResult.Send>> continuation) {
        return this.Camera2StreamConfigurationMap.executeSendTransfer(str, str2, continuation);
    }
}
