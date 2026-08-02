package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorage;", "getProvideSettingsStorage", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;)Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorage;", "Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "provideSettingsAnalytics", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;)Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "provideTippingAnalytics", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;)Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayFeatureConfigExtKt {
    public static final com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics provideSettingsAnalytics(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return com.zettle.sdk.feature.taptopay.core.ManagerKt.exposeSettingsAnalytics();
    }

    public static final com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage getProvideSettingsStorage(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion companion) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        try {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt.getDelegate().getStorage());
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        return (com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage) m23436constructorimpl;
    }

    public static final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics provideTippingAnalytics(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion companion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companion, "");
        return com.zettle.sdk.feature.taptopay.core.ManagerKt.exposeTippingAnalytics();
    }
}
