package com.paypal.oslo.core.security.initializer;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/core/security/initializer/RiskDataConfiguratorImpl;", "Lcom/paypal/oslo/core/security/initializer/RiskDataConfigurator;", "Landroid/content/Context;", "context", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "magnesSDK", "Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;", "appGuidProvider", "<init>", "(Landroid/content/Context;Llib/android/paypal/com/magnessdk/MagnesSDK;Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;)V", "", "setUp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isDebug", "Llib/android/paypal/com/magnessdk/Environment;", "resolveEnvironment$security_release", "(Z)Llib/android/paypal/com/magnessdk/Environment;", "Camera2StreamConfigurationMap", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/di/appguid/AppGuidProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RiskDataConfiguratorImpl implements com.paypal.oslo.core.security.initializer.RiskDataConfigurator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final lib.android.paypal.com.magnessdk.MagnesSDK getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.di.appguid.AppGuidProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public RiskDataConfiguratorImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK, com.paypal.oslo.core.di.appguid.AppGuidProvider appGuidProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(magnesSDK, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appGuidProvider, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighResolutionOutputSizeshNQ4ISI = magnesSDK;
        this.Camera2StreamConfigurationMap = appGuidProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.core.security.initializer.RiskDataConfigurator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object setUp(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl$setUp$1 riskDataConfiguratorImpl$setUp$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl$setUp$1) {
            riskDataConfiguratorImpl$setUp$1 = (com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl$setUp$1) continuation;
            if ((riskDataConfiguratorImpl$setUp$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                riskDataConfiguratorImpl$setUp$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = riskDataConfiguratorImpl$setUp$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = riskDataConfiguratorImpl$setUp$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.di.appguid.AppGuidProvider appGuidProvider = this.Camera2StreamConfigurationMap;
                    riskDataConfiguratorImpl$setUp$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = appGuidProvider.getAppGuid(riskDataConfiguratorImpl$setUp$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setUp(new lib.android.paypal.com.magnessdk.MagnesSettings.Builder(this.getHighSpeedVideoSizes).setMagnesSource(lib.android.paypal.com.magnessdk.MagnesSource.PAYPAL).setMagnesEnvironment(resolveEnvironment$security_release$default(this, false, 1, null)).setAppGuid((java.lang.String) obj).build());
                return kotlin.Unit.INSTANCE;
            }
        }
        riskDataConfiguratorImpl$setUp$1 = new com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl$setUp$1(this, continuation);
        java.lang.Object obj2 = riskDataConfiguratorImpl$setUp$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = riskDataConfiguratorImpl$setUp$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setUp(new lib.android.paypal.com.magnessdk.MagnesSettings.Builder(this.getHighSpeedVideoSizes).setMagnesSource(lib.android.paypal.com.magnessdk.MagnesSource.PAYPAL).setMagnesEnvironment(resolveEnvironment$security_release$default(this, false, 1, null)).setAppGuid((java.lang.String) obj2).build());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ lib.android.paypal.com.magnessdk.Environment resolveEnvironment$security_release$default(com.paypal.oslo.core.security.initializer.RiskDataConfiguratorImpl riskDataConfiguratorImpl, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return riskDataConfiguratorImpl.resolveEnvironment$security_release(z);
    }

    public final lib.android.paypal.com.magnessdk.Environment resolveEnvironment$security_release(boolean isDebug) {
        return isDebug ? lib.android.paypal.com.magnessdk.Environment.STAGE : lib.android.paypal.com.magnessdk.Environment.LIVE;
    }
}
