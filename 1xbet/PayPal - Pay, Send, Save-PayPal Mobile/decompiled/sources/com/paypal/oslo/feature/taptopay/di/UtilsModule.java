package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/UtilsModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;", "provideCardPrioritySorter", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes15.dex */
public final class UtilsModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.di.UtilsModule INSTANCE = new com.paypal.oslo.feature.taptopay.di.UtilsModule();

    private UtilsModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter provideCardPrioritySorter(kotlinx.coroutines.CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcher, "");
        return new com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter(null, dispatcher, 1, null);
    }
}
