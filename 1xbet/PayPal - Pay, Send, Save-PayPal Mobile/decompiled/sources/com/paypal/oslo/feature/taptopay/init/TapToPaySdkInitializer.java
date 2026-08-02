package com.paypal.oslo.feature.taptopay.init;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/init/TapToPaySdkInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TapToPaySdkInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    public static final int $stable = 0;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context.getApplicationContext(), com.paypal.oslo.feature.taptopay.di.TapToPaySdkInitializerEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.feature.taptopay.di.TapToPaySdkInitializerEntryPoint tapToPaySdkInitializerEntryPoint = (com.paypal.oslo.feature.taptopay.di.TapToPaySdkInitializerEntryPoint) obj;
        if (!tapToPaySdkInitializerEntryPoint.deviceCapability().isNFCSupported()) {
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay SDK initialization skipped: NFC is not supported on this device", null, null, 6, null);
            return;
        }
        com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer = tapToPaySdkInitializerEntryPoint.sdkInitializer();
        com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig = tapToPaySdkInitializerEntryPoint.remoteConfigConfig();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(tapToPaySdkInitializerEntryPoint.ioApplicationScope(), null, null, new com.paypal.oslo.feature.taptopay.init.TapToPaySdkInitializer$create$1(tapToPaySdkInitializerEntryPoint.companionSyncPolicy(), remoteConfigConfig, sdkInitializer, null), 3, null);
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.core.remoteconfig.RemoteConfigInitializer.class);
    }
}
