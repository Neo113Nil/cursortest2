package com.paypal.oslo.feature.wallet.me.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJJ\u0010\u0013\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\f0\u00100\u000f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/usecase/WalletComponentsUseCase;", "", "Lcom/paypal/oslo/feature/wallet/me/domain/repository/WalletComponentsRepository;", "repository", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "features", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lcom/paypal/oslo/feature/wallet/me/domain/repository/WalletComponentsRepository;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "placementId", "", "Lcom/paypal/oslo/feature/wallet/me/domain/Product$Type;", "filters", "Lkotlinx/coroutines/flow/Flow;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/wallet/me/domain/ProductError;", "Lcom/paypal/oslo/feature/wallet/me/domain/Product;", "invoke", "(Ljava/lang/String;Ljava/util/List;)Lkotlinx/coroutines/flow/Flow;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/wallet/me/domain/repository/WalletComponentsRepository;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class WalletComponentsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public WalletComponentsUseCase(com.paypal.oslo.feature.wallet.me.domain.repository.WalletComponentsRepository walletComponentsRepository, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager, @com.paypal.oslo.feature.wallet.common.di.IoDispatcher kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletComponentsRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = walletComponentsRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = walletFeatureManager;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.flow.Flow invoke$default(com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase walletComponentsUseCase, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            list = null;
        }
        return walletComponentsUseCase.invoke(str, list);
    }

    public final kotlinx.coroutines.flow.Flow<arrow.core.Either<com.paypal.oslo.feature.wallet.me.domain.ProductError, java.util.List<com.paypal.oslo.feature.wallet.me.domain.Product<?>>>> invoke(java.lang.String placementId, java.util.List<? extends com.paypal.oslo.feature.wallet.me.domain.Product.Type> filters) {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.me.domain.usecase.WalletComponentsUseCase$invoke$1(this, placementId, filters, null));
    }
}
