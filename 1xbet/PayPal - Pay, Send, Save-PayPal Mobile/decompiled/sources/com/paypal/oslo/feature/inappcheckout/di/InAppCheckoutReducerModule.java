package com.paypal.oslo.feature.inappcheckout.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/di/InAppCheckoutReducerModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;", "provideOneShotReducer", "()Lcom/paypal/oslo/feature/inappcheckout/ui/oneshot/reducer/OneShotReducer;", "Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/reducer/RypReducer;", "provideRypReducer", "()Lcom/paypal/oslo/feature/inappcheckout/ui/ryp/reducer/RypReducer;", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;", "provideCardFormReducer", "()Lcom/paypal/oslo/feature/inappcheckout/ui/card/reducer/CardFormReducer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class InAppCheckoutReducerModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule INSTANCE = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutReducerModule();

    private InAppCheckoutReducerModule() {
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer provideOneShotReducer() {
        return new com.paypal.oslo.feature.inappcheckout.ui.oneshot.reducer.OneShotReducer();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer provideRypReducer() {
        return new com.paypal.oslo.feature.inappcheckout.ui.ryp.reducer.RypReducer();
    }

    @dagger.Provides
    public final com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer provideCardFormReducer() {
        return new com.paypal.oslo.feature.inappcheckout.ui.card.reducer.CardFormReducer();
    }
}
