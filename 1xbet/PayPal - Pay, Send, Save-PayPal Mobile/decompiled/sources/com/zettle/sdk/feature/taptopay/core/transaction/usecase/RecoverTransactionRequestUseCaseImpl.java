package com.zettle.sdk.feature.taptopay.core.transaction.usecase;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "service", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/zettle/sdk/commons/network/NetworkClient;", "networkClient", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lkotlin/Function1;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/usecase/RecoverTransactionRequestUseCase$Result;", "", "block", "invoke", "(Lcom/zettle/sdk/commons/network/NetworkClient;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lkotlin/jvm/functions/Function1;)V", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineScope;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/transaction/TransactionService;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RecoverTransactionRequestUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase {
    private final java.util.concurrent.atomic.AtomicInteger getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.transaction.TransactionService Camera2StreamConfigurationMap;

    public RecoverTransactionRequestUseCaseImpl(com.zettle.sdk.feature.taptopay.core.transaction.TransactionService transactionService, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.Camera2StreamConfigurationMap = transactionService;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, ? extends kotlin.Unit> function1) {
        invoke2(networkClient, transactionInfo, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit>) function1);
        return kotlin.Unit.INSTANCE;
    }

    public /* synthetic */ RecoverTransactionRequestUseCaseImpl(com.zettle.sdk.feature.taptopay.core.transaction.TransactionService transactionService, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transactionService, (i & 2) != 0 ? com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "RetryRecoverTransactionScope", null, null, 6, null) : coroutineScope);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCase.Result, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkClient, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(info, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        this.getHighResolutionOutputSizeshNQ4ISI.set(0);
        this.Camera2StreamConfigurationMap.recoverTransactionRequest(info, networkClient, new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$callRecoverService$1(block, this, networkClient, info));
    }

    public static final /* synthetic */ void access$retry(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl, com.zettle.sdk.commons.network.NetworkClient networkClient, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, kotlin.jvm.functions.Function1 function1) {
        recoverTransactionRequestUseCaseImpl.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(recoverTransactionRequestUseCaseImpl.getHighSpeedVideoFpsRanges, null, null, new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl$retry$1(recoverTransactionRequestUseCaseImpl, transactionInfo, networkClient, function1, null), 3, null);
    }

    public static final /* synthetic */ boolean access$shouldRetry(com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl, com.zettle.sdk.feature.taptopay.core.FailureReason failureReason) {
        return (failureReason instanceof com.zettle.sdk.feature.taptopay.core.FailureReason.NetworkError) && recoverTransactionRequestUseCaseImpl.getHighResolutionOutputSizeshNQ4ISI.get() < 2;
    }
}
