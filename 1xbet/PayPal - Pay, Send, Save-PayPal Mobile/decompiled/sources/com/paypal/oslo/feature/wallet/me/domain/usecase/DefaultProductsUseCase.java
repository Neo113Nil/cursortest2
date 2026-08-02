package com.paypal.oslo.feature.wallet.me.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/usecase/DefaultProductsUseCase;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/wallet/me/domain/preferred/PaymentPreferencesProduct;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DefaultProductsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DefaultProductsUseCase(@com.paypal.oslo.feature.wallet.common.di.IoDispatcher kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.wallet.me.domain.preferred.PaymentPreferencesProduct> invoke() {
        return kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.wallet.me.domain.usecase.DefaultProductsUseCase$invoke$1(this, null));
    }
}
