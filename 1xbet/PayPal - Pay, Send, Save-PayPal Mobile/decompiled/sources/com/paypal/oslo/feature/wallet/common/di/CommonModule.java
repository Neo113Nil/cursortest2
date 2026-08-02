package com.paypal.oslo.feature.wallet.common.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/common/di/CommonModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "providesIoDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class CommonModule {
    public static final int $stable = 0;

    @dagger.Provides
    @com.paypal.oslo.feature.wallet.common.di.IoDispatcher
    public final kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }
}
