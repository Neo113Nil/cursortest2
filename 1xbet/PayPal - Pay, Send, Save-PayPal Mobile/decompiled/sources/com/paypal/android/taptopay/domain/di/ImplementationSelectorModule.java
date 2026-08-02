package com.paypal.android.taptopay.domain.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/android/taptopay/domain/di/ImplementationSelectorModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;", "provideImplementationSelector", "(Landroid/content/Context;)Lcom/paypal/android/taptopay/domain/di/ImplementationSelector;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class ImplementationSelectorModule {
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.di.ImplementationSelector provideImplementationSelector(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.android.taptopay.domain.di.ImplementationSelector(context);
    }
}
