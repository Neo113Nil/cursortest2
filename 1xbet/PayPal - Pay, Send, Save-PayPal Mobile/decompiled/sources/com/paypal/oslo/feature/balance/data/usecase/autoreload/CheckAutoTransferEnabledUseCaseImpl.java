package com.paypal.oslo.feature.balance.data.usecase.autoreload;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/balance/data/usecase/autoreload/CheckAutoTransferEnabledUseCaseImpl;", "Lcom/paypal/oslo/feature/balance/domain/usecase/autoreload/CheckAutoTransferEnabledUseCase;", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;", "autoTransferRepository", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/balance/domain/error/AutoReloadError;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/BalanceAutoTransfer;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/balance/domain/repository/autoreload/AutoTransferRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckAutoTransferEnabledUseCaseImpl implements com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CheckAutoTransferEnabledUseCaseImpl(com.paypal.oslo.feature.balance.domain.repository.autoreload.AutoTransferRepository autoTransferRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoTransferRepository, "");
        this.Camera2StreamConfigurationMap = autoTransferRepository;
    }

    @Override // com.paypal.oslo.feature.balance.domain.usecase.autoreload.CheckAutoTransferEnabledUseCase
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.balance.domain.error.AutoReloadError, com.paypal.oslo.feature.balance.domain.model.autoreload.BalanceAutoTransfer>> continuation) {
        return this.Camera2StreamConfigurationMap.fetchAutoTransfer(continuation);
    }
}
