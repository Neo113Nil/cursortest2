package com.paypal.oslo.app.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/app/di/PostLoginSuccessDestinationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/app/di/PostLoginDestinationResolver;", "resolver", "Landroidx/navigation3/runtime/NavKey;", "providePostLoginDestination", "(Lcom/paypal/oslo/app/di/PostLoginDestinationResolver;)Landroidx/navigation3/runtime/NavKey;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class PostLoginSuccessDestinationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.di.PostLoginSuccessDestinationModule INSTANCE = new com.paypal.oslo.app.di.PostLoginSuccessDestinationModule();

    private PostLoginSuccessDestinationModule() {
    }

    @dagger.Provides
    @com.paypal.oslo.feature.identity.api.di.PostLoginSuccessDestination
    public final androidx.navigation3.runtime.NavKey providePostLoginDestination(com.paypal.oslo.app.di.PostLoginDestinationResolver resolver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "");
        return resolver.resolve();
    }
}
