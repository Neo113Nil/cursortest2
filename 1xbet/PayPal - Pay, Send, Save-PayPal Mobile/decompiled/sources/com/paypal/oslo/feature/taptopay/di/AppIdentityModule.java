package com.paypal.oslo.feature.taptopay.di;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/di/AppIdentityModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformation", "Lkotlin/Lazy;", "", "provideTapToPayAppGuid", "(Lcom/paypal/oslo/core/appidentity/domain/AppInformation;)Lkotlin/Lazy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class AppIdentityModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.di.AppIdentityModule INSTANCE = new com.paypal.oslo.feature.taptopay.di.AppIdentityModule();

    private AppIdentityModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlin.Lazy<java.lang.String> provideTapToPayAppGuid(final com.paypal.oslo.core.appidentity.domain.AppInformation appInformation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        return kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.di.AppIdentityModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.lang.String appGUID;
                appGUID = com.paypal.oslo.core.appidentity.domain.AppInformation.this.getAppGUID();
                return appGUID;
            }
        });
    }
}
