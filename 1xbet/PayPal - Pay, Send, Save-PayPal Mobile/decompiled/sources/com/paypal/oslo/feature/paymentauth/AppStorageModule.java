package com.paypal.oslo.feature.paymentauth;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/paymentauth/AppStorageModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "provideAppStorage", "(Landroid/content/Context;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes13.dex */
public final class AppStorageModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.paymentauth.AppStorageModule INSTANCE = new com.paypal.oslo.feature.paymentauth.AppStorageModule();

    private AppStorageModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage provideAppStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.paypal.oslo.core.persistence.appstorage.AppStorage("feature:payment-auth", context);
    }
}
