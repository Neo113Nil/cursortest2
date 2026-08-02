package com.paypal.oslo.core.telemetry.vendors.adobe;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\f\b\u0001\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0001\u0018\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adobe/AdobeInitializer;", "Landroidx/startup/Initializer;", "", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)V", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdobeInitializer implements androidx.startup.Initializer<kotlin.Unit> {
    public static final int $stable = 0;

    @Override // androidx.startup.Initializer
    public final /* bridge */ /* synthetic */ kotlin.Unit create(android.content.Context context) {
        create2(context);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final void create2(android.content.Context context) {
        com.adobe.marketing.mobile.LoggingMode loggingMode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.paypal.oslo.core.telemetry.util.AndroidContextExtensionsKt.isRunningFromTestProcess(context)) {
            return;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNull(applicationContext, "");
        android.app.Application application = (android.app.Application) applicationContext;
        java.lang.Object obj = dagger.hilt.android.EarlyEntryPoints.get(context, com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint telemetryEntryPoint = (com.paypal.oslo.core.telemetry.di.TelemetryEntryPoint) obj;
        com.paypal.oslo.core.userstore.UserStore userStore = telemetryEntryPoint.userStore();
        com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager adobeEnvironmentManager = telemetryEntryPoint.adobeEnvironmentManager();
        kotlinx.coroutines.CoroutineScope ioApplicationScope = telemetryEntryPoint.ioApplicationScope();
        com.paypal.oslo.core.telemetry.vendors.adobe.AdobeIdentitiesManager adobeIdentitiesManager = telemetryEntryPoint.adobeIdentitiesManager();
        if (telemetryEntryPoint.telemetryFeatureGateProvider().isAdobeEnabled()) {
            com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType environmentType = adobeEnvironmentManager.environmentType();
            int i = com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer.WhenMappings.$EnumSwitchMapping$0[environmentType.ordinal()];
            if (i == 1) {
                loggingMode = com.adobe.marketing.mobile.LoggingMode.ERROR;
            } else {
                if (i != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                loggingMode = com.adobe.marketing.mobile.LoggingMode.DEBUG;
            }
            com.adobe.marketing.mobile.MobileCore.setLogLevel(loggingMode);
            com.adobe.marketing.mobile.MobileCore.initialize(application, environmentType.getAppId());
            application.registerActivityLifecycleCallbacks(new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeActivityLifecycleCallbacks());
            kotlinx.coroutines.flow.FlowKt.launchIn(kotlinx.coroutines.flow.FlowKt.onEach(userStore.getUserState(), new com.paypal.oslo.core.telemetry.vendors.adobe.AdobeInitializer$create$1(adobeIdentitiesManager, null)), ioApplicationScope);
        }
    }

    @Override // androidx.startup.Initializer
    public final java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.values().length];
            try {
                iArr[com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.PROD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.STAGE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
