package com.zettle.sdk.feature.taptopay.ui;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000e\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0017"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature;", "", "", "permissionArray", "", "hasGrantPermission", "([I)Z", "Landroid/content/Context;", "context", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "isDeviceCapable", "(Landroid/content/Context;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "isDeviceSupported", "Landroid/app/Activity;", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TapToPayFeature {

    /* renamed from: Configuration, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion INSTANCE = com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion.getHighSpeedVideoFpsRangesFor;

    boolean hasGrantPermission(int[] permissionArray);

    boolean hasRequiredPermission(android.content.Context context);

    com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement isDeviceCapable(android.content.Context context);

    boolean isDeviceSupported(android.content.Context context);

    boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode);

    boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode);

    @kotlin.Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013Jy\u0010*\u001a\u00020)2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u000eJ\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u000bH\u0007¢\u0006\u0004\b1\u0010\u000eJ\u001f\u00106\u001a\u00020\b2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u001f\u00106\u001a\u00020\b2\u0006\u00109\u001a\u0002082\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u0010:J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002082\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020)2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020)H\u0016¢\u0006\u0004\bE\u0010\u0005J\u000f\u0010F\u001a\u00020)H\u0016¢\u0006\u0004\bF\u0010\u0005R\u001a\u0010H\u001a\u00020G8\u0017X\u0096D¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010R\u001a\u00020P2\u0006\u0010Q\u001a\u00020P8\u0001@BX\u0081.¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u00020Y8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bO\u0010Z\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature$Configuration;", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayFeature;", "Lcom/zettle/sdk/features/FeatureConf;", "Lcom/zettle/sdk/core/log/Loggable;", "<init>", "()V", "", "permissionArray", "", "hasGrantPermission", "([I)Z", "Landroid/content/Context;", "context", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/features/Action;", "action", "Lcom/zettle/sdk/ui/ZettleResult;", "headless", "(Lcom/zettle/sdk/features/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "serviceProvider", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lcom/zettle/sdk/core/auth/AuthStateProvider;", "authStateProvider", "Lcom/zettle/sdk/core/os/LocationInfoController;", "locationInfo", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "isDebug", "analyticsWhileRoaming", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "config", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "globalContext", "isUatMode", "Lcom/zettle/sdk/core/auth/Environment;", "environment", "", "internalInit", "(Landroid/content/Context;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lcom/zettle/sdk/core/auth/AuthStateProvider;Lcom/zettle/sdk/core/os/LocationInfoController;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;ZZLcom/zettle/sdk/commons/util/ExternalConfig;Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;ZLcom/zettle/sdk/core/auth/Environment;)V", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "isDeviceCapable", "(Landroid/content/Context;)Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "isDeviceSupported", "applicationContext", "isRunningOnRemoteProcess", "Landroid/app/Activity;", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "(Lcom/zettle/sdk/features/Action;)Ljava/util/List;", "screen", "(Lcom/zettle/sdk/features/Action;)Landroidx/fragment/app/Fragment;", "Lcom/zettle/sdk/core/Register;", "register", "setup", "(Lcom/zettle/sdk/core/Register;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "stop", "", "ID", "Ljava/lang/String;", "getID", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/payment/MagnesModule;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/payment/MagnesModule;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/Manager;", "p0", "manager", "Lcom/zettle/sdk/feature/taptopay/core/Manager;", "getManager$ui_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/Manager;", "Lcom/zettle/sdk/core/network/NetworkModule;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/core/network/NetworkModule;", "Lcom/zettle/sdk/core/user/UserModule;", "Lcom/zettle/sdk/core/user/UserModule;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.zettle.sdk.feature.taptopay.ui.TapToPayFeature$Configuration, reason: from kotlin metadata */
    public static final class Companion implements com.zettle.sdk.feature.taptopay.ui.TapToPayFeature, com.zettle.sdk.features.FeatureConf, com.zettle.sdk.core.log.Loggable {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private static com.zettle.sdk.core.payment.MagnesModule getHighSpeedVideoSizes;
        private static com.zettle.sdk.core.network.NetworkModule getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static com.zettle.sdk.core.user.UserModule Camera2StreamConfigurationMap;
        private static com.zettle.sdk.feature.taptopay.core.Manager manager;
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion();
        private static final java.lang.String ID = "TapToPay";

        @Override // com.zettle.sdk.features.FeatureConf
        public final void start() {
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final void stop() {
        }

        private Companion() {
        }

        @Override // com.zettle.sdk.core.log.Loggable
        /* renamed from: getLogTag */
        public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
            return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final java.util.List<com.zettle.sdk.headless.HeadlessPlugin> getProvidedHeadlessPlugins() {
            return com.zettle.sdk.features.FeatureConf.DefaultImpls.getProvidedHeadlessPlugins(this);
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final com.zettle.sdk.ui.ZettleApiResult headlessApi(com.zettle.sdk.features.Action action) {
            return com.zettle.sdk.features.FeatureConf.DefaultImpls.headlessApi(this, action);
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final boolean isActionValid(com.zettle.sdk.features.Action action) {
            return com.zettle.sdk.features.FeatureConf.DefaultImpls.isActionValid(this, action);
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final java.lang.String getID() {
            return ID;
        }

        public final com.zettle.sdk.feature.taptopay.core.Manager getManager$ui_publicRelease() {
            com.zettle.sdk.feature.taptopay.core.Manager manager2 = manager;
            if (manager2 != null) {
                return manager2;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        @kotlin.jvm.JvmStatic
        public final boolean isRunningOnRemoteProcess(android.content.Context applicationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
            return com.zettle.sdk.feature.taptopay.core.Manager.INSTANCE.isRunningOnRemoteProcess(applicationContext);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
            return getManager$ui_publicRelease().requestPermissionIfRequired(activityContext, requestCode);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentContext, "");
            return getManager$ui_publicRelease().requestPermissionIfRequired(fragmentContext, requestCode);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final boolean hasRequiredPermission(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return getManager$ui_publicRelease().hasRequiredPermission(context);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final boolean hasGrantPermission(int[] permissionArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionArray, "");
            return getManager$ui_publicRelease().hasGrantPermission(permissionArray);
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement isDeviceCapable(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirementKt.isCapable(com.zettle.sdk.feature.taptopay.core.DeviceCapabilitiesKt.create(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.INSTANCE, context, com.zettle.sdk.meta.Platform.INSTANCE));
        }

        @Override // com.zettle.sdk.feature.taptopay.ui.TapToPayFeature
        public final boolean isDeviceSupported(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            return com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirementKt.isSupported(com.zettle.sdk.feature.taptopay.core.DeviceCapabilitiesKt.create(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.INSTANCE, context, com.zettle.sdk.meta.Platform.INSTANCE));
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final java.lang.Object headless(com.zettle.sdk.features.Action action, kotlin.coroutines.Continuation<? super com.zettle.sdk.ui.ZettleResult> continuation) {
            if (!(action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction)) {
                return com.zettle.sdk.features.FeatureConf.DefaultImpls.headless(this, action, continuation);
            }
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            getHighSpeedVideoFpsRangesFor.getManager$ui_publicRelease().getRetrieveTransaction().retrieveCardPaymentInfo(((com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction) action).getReference(), new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.ui.TapToPayFeature$Configuration$headless$2$1
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult) {
                    getHighResolutionOutputSizeshNQ4ISI(retrieveCardPaymentInfoResult);
                    return kotlin.Unit.INSTANCE;
                }

                public final void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult retrieveCardPaymentInfoResult) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrieveCardPaymentInfoResult, "");
                    if (retrieveCardPaymentInfoResult instanceof com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed) {
                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.ui.ZettleResult> cancellableContinuation = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Failed(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionExtensionsKt.toRetrieveTransactionFailureReason(((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Failed) retrieveCardPaymentInfoResult).getFailure()))));
                    } else if (retrieveCardPaymentInfoResult instanceof com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) {
                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.ui.ZettleResult> cancellableContinuation2 = cancellableContinuationImpl2;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.feature.taptopay.ui.retrieve.TapToPayRetrieveTransactionResult.Completed(com.zettle.sdk.feature.taptopay.ui.retrieve.RetrieveTransactionExtensionsKt.toTapToPayCardPaymentPayload(((com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveCardPaymentInfoResult.Success) retrieveCardPaymentInfoResult).getCardPaymentPayload()))));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }
            });
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final void internalInit(android.content.Context context, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.core.auth.AuthStateProvider authStateProvider, com.zettle.sdk.core.os.LocationInfoController locationInfo, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo, boolean isDebug, boolean analyticsWhileRoaming, com.zettle.sdk.commons.util.ExternalConfig config, com.zettle.sdk.core.context.ZettleGlobalContext.Initializer globalContext, boolean isUatMode, com.zettle.sdk.core.auth.Environment environment) {
            com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate tapToPayFeatureDelegate;
            com.zettle.sdk.commons.util.ExternalConfig externalConfig;
            com.zettle.sdk.core.network.NetworkModule networkModule;
            com.zettle.sdk.core.user.UserModule userModule;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStateProvider, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
            if (isDeviceSupported(context)) {
                com.zettle.sdk.core.os.LocationInfoController locationInfoController = locationInfo;
                boolean isForTestingPurpose = com.zettle.sdk.core.auth.EnvironmentKt.isForTestingPurpose(environment);
                synchronized (this) {
                    tapToPayFeatureDelegate = com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt.delegate;
                    if (tapToPayFeatureDelegate != null) {
                        return;
                    }
                    com.zettle.sdk.core.user.UserModule userModule2 = Camera2StreamConfigurationMap;
                    if (userModule2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        externalConfig = config;
                        userModule2 = null;
                    } else {
                        externalConfig = config;
                    }
                    com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate tapToPayFeatureDelegate2 = new com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureDelegate(context, userModule2, externalConfig, isForTestingPurpose);
                    com.zettle.sdk.feature.taptopay.core.Manager.Companion companion = com.zettle.sdk.feature.taptopay.core.Manager.INSTANCE;
                    com.zettle.sdk.core.network.NetworkModule networkModule2 = getHighSpeedVideoFpsRanges;
                    if (networkModule2 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        networkModule = null;
                    } else {
                        networkModule = networkModule2;
                    }
                    kotlinx.coroutines.CoroutineScope sdk = com.zettle.sdk.core.ZettleScope.INSTANCE.getSdk();
                    com.zettle.sdk.commons.thread.EventsLoop tapToPay = com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt.getTapToPay(com.zettle.sdk.commons.thread.EventsLoop.INSTANCE);
                    com.zettle.sdk.core.user.UserModule userModule3 = Camera2StreamConfigurationMap;
                    if (userModule3 == null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                        userModule = null;
                    } else {
                        userModule = userModule3;
                    }
                    manager = companion.instance(context, merchantConfig, locationInfoController, networkModule, sdk, analytics, appInfo, tapToPay, userModule, com.zettle.sdk.meta.Platform.INSTANCE, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.zettle.sdk.feature.taptopay.ui.TapToPayFeature$Configuration$init$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            com.zettle.sdk.core.payment.MagnesModule magnesModule;
                            magnesModule = com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.Companion.getHighSpeedVideoSizes;
                            if (magnesModule == null) {
                                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                                magnesModule = null;
                            }
                            java.lang.String paypalClientMetaDataId = magnesModule.getPaypalClientMetaDataId();
                            return paypalClientMetaDataId == null ? "" : paypalClientMetaDataId;
                        }
                    }, config, isForTestingPurpose);
                    com.zettle.sdk.feature.taptopay.ui.TapToPayFeatureKt.delegate = tapToPayFeatureDelegate2;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
            }
            com.zettle.sdk.core.log.LogKt.warn(this, "Tap to pay not initialised", new com.zettle.sdk.core.NonFatalException(getGetHighSpeedVideoFpsRangesFor(), "Not Supported"));
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final androidx.fragment.app.Fragment screen(com.zettle.sdk.features.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) {
                return new com.zettle.sdk.feature.taptopay.ui.payment.TapToPayPaymentContainer();
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings) {
                return new com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsFragment();
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund) {
                return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsFragment();
            }
            java.lang.String str = ID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" feature can't handle action: ");
            sb.append(action);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements(com.zettle.sdk.features.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Payment) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE, new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null), com.zettle.sdk.core.permission.Prerequisite.Permission.Location.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Location.INSTANCE, com.zettle.sdk.core.permission.Prerequisite.SystemFeature.NFC.INSTANCE});
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Settings) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE, new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null)});
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Refund) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE, new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Refund, false, 2, null)});
            }
            if (action instanceof com.zettle.sdk.feature.taptopay.ui.TapToPayAction.Transaction) {
                return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.core.permission.Prerequisite[]{com.zettle.sdk.core.permission.Prerequisite.SystemFeature.Network.INSTANCE, new com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted(com.zettle.sdk.commons.network.Scope.Payment, false, 2, null)});
            }
            java.lang.String str = ID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(" feature can't handle action: ");
            sb.append(action);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        @Override // com.zettle.sdk.features.FeatureConf
        public final void setup(com.zettle.sdk.core.Register register) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(register, "");
            boolean z = register instanceof com.zettle.sdk.core.ModuleStore;
            com.zettle.sdk.core.ModuleStore moduleStore = z ? (com.zettle.sdk.core.ModuleStore) register : null;
            if (moduleStore != null) {
                com.zettle.sdk.core.Module fetch = moduleStore.fetch(com.zettle.sdk.core.network.NetworkModule.class);
                if (fetch instanceof com.zettle.sdk.core.network.NetworkModule) {
                    getHighSpeedVideoFpsRanges = (com.zettle.sdk.core.network.NetworkModule) fetch;
                    com.zettle.sdk.core.ModuleStore moduleStore2 = z ? (com.zettle.sdk.core.ModuleStore) register : null;
                    if (moduleStore2 != null) {
                        com.zettle.sdk.core.Module fetch2 = moduleStore2.fetch(com.zettle.sdk.core.payment.MagnesModule.class);
                        if (fetch2 instanceof com.zettle.sdk.core.payment.MagnesModule) {
                            getHighSpeedVideoSizes = (com.zettle.sdk.core.payment.MagnesModule) fetch2;
                            com.zettle.sdk.core.ModuleStore moduleStore3 = z ? (com.zettle.sdk.core.ModuleStore) register : null;
                            if (moduleStore3 != null) {
                                com.zettle.sdk.core.Module fetch3 = moduleStore3.fetch(com.zettle.sdk.core.user.UserModule.class);
                                if (fetch3 instanceof com.zettle.sdk.core.user.UserModule) {
                                    Camera2StreamConfigurationMap = (com.zettle.sdk.core.user.UserModule) fetch3;
                                    return;
                                } else {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder("No module found for: ");
                                    sb.append(com.zettle.sdk.core.user.UserModule.class);
                                    throw new java.lang.IllegalStateException(sb.toString());
                                }
                            }
                            throw new java.lang.IllegalStateException("Register is not implemented correctly.");
                        }
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("No module found for: ");
                        sb2.append(com.zettle.sdk.core.payment.MagnesModule.class);
                        throw new java.lang.IllegalStateException(sb2.toString());
                    }
                    throw new java.lang.IllegalStateException("Register is not implemented correctly.");
                }
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("No module found for: ");
                sb3.append(com.zettle.sdk.core.network.NetworkModule.class);
                throw new java.lang.IllegalStateException(sb3.toString());
            }
            throw new java.lang.IllegalStateException("Register is not implemented correctly.");
        }
    }

    @kotlin.jvm.JvmStatic
    static boolean isRunningOnRemoteProcess(android.content.Context context) {
        return INSTANCE.isRunningOnRemoteProcess(context);
    }
}
