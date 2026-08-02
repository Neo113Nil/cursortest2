package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000  2\u00020\u0001:\u0001 J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/Manager;", "", "", "permissionArray", "", "hasGrantPermission", "([I)Z", "Landroid/content/Context;", "context", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "getRefund", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "refund", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "getRetrieveTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "retrieveTransaction", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "getTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "transaction", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface Manager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.feature.taptopay.core.Manager.Companion INSTANCE = com.zettle.sdk.feature.taptopay.core.Manager.Companion.getHighResolutionOutputSizeshNQ4ISI;

    com.zettle.sdk.feature.taptopay.core.refunds.Refund getRefund();

    com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction getRetrieveTransaction();

    com.zettle.sdk.feature.taptopay.core.transaction.Transaction getTransaction();

    boolean hasGrantPermission(int[] permissionArray);

    boolean hasRequiredPermission(android.content.Context context);

    boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode);

    boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode);

    @kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0081\u0001\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R$\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'8\u0001@BX\u0080.¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020-8\u0001@BX\u0081.¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/Manager$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "tapToPayEventsLoop", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lkotlin/Function0;", "", "magnesId", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "config", "", "isTestingEnvironment", "Lcom/zettle/sdk/feature/taptopay/core/Manager;", "instance", "(Landroid/content/Context;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/core/network/NetworkModule;Lkotlinx/coroutines/CoroutineScope;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/commons/thread/EventsLoop;Lcom/zettle/sdk/core/user/UserModule;Lcom/zettle/sdk/meta/Platform;Lkotlin/jvm/functions/Function0;Lcom/zettle/sdk/commons/util/ExternalConfig;Z)Lcom/zettle/sdk/feature/taptopay/core/Manager;", "isRunningOnRemoteProcess", "(Landroid/content/Context;)Z", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/Manager;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "p0", "settingsAnalytics", "Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "getSettingsAnalytics$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/settings/SettingsAnalytics;", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "tippingAnalytics", "Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;", "getTippingAnalytics$core_publicRelease", "()Lcom/zettle/sdk/feature/taptopay/core/tipping/TippingAnalytics;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.feature.taptopay.core.Manager.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.feature.taptopay.core.Manager.Companion();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static volatile com.zettle.sdk.feature.taptopay.core.Manager getHighSpeedVideoFpsRangesFor;
        private static com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics settingsAnalytics;
        private static com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics tippingAnalytics;

        private Companion() {
        }

        public final boolean isRunningOnRemoteProcess(android.content.Context applicationContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
            return com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor.INSTANCE.isRunningOnRemoteProcess(applicationContext);
        }

        public final com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics getSettingsAnalytics$core_publicRelease() {
            com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics settingsAnalytics2 = settingsAnalytics;
            if (settingsAnalytics2 != null) {
                return settingsAnalytics2;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics getTippingAnalytics$core_publicRelease() {
            com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics tippingAnalytics2 = tippingAnalytics;
            if (tippingAnalytics2 != null) {
                return tippingAnalytics2;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final com.zettle.sdk.feature.taptopay.core.Manager instance(android.content.Context applicationContext, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.core.network.NetworkModule networkModule, kotlinx.coroutines.CoroutineScope zettleScope, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.commons.thread.EventsLoop tapToPayEventsLoop, com.zettle.sdk.core.user.UserModule userModule, com.zettle.sdk.meta.Platform platform, kotlin.jvm.functions.Function0<java.lang.String> magnesId, com.zettle.sdk.commons.util.ExternalConfig config, boolean isTestingEnvironment) {
            com.zettle.sdk.feature.taptopay.core.Manager manager;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleScope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tapToPayEventsLoop, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(magnesId, "");
            com.zettle.sdk.feature.taptopay.core.Manager manager2 = getHighSpeedVideoFpsRangesFor;
            if (manager2 != null) {
                return manager2;
            }
            synchronized (this) {
                com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCachingImpl runTimeCachingImpl = com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCachingImpl.INSTANCE;
                com.zettle.sdk.feature.taptopay.core.DeviceCapabilities create = com.zettle.sdk.feature.taptopay.core.DeviceCapabilitiesKt.create(com.zettle.sdk.feature.taptopay.core.DeviceCapabilities.INSTANCE, applicationContext, com.zettle.sdk.meta.Platform.INSTANCE);
                com.zettle.sdk.commons.network.ResponseParser create2 = com.zettle.sdk.commons.network.ResponseParser.INSTANCE.create();
                com.zettle.sdk.commons.network.NetworkClient createTapToPayNetworkClient = com.zettle.sdk.feature.taptopay.core.configuration.TapToPayNetworkKt.createTapToPayNetworkClient(networkModule, com.zettle.sdk.commons.network.Service.CardPayment, com.zettle.sdk.commons.network.Scope.Payment);
                com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase create3 = com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecaseKt.create(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.INSTANCE, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepositoryImplKt.create(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitRepository.INSTANCE, createTapToPayNetworkClient, runTimeCachingImpl, create2), com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalyticsKt.createForInitConfiguration(com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.INSTANCE, analytics), com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCaseKt.create(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitFailedAnalyticsUseCase.INSTANCE, analytics, appInfo), com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractorKt.create(com.zettle.sdk.feature.taptopay.core.configuration.init.PreRequisiteInteractor.INSTANCE, merchantConfig, create), zettleScope);
                com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase create4 = com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecaseKt.create(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase.INSTANCE, com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepositoryKt.create(com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsRepository.INSTANCE, createTapToPayNetworkClient, runTimeCachingImpl, create2), com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalyticsKt.createForCvmLimit(com.zettle.sdk.feature.taptopay.core.configuration.HerdAnalytics.INSTANCE, analytics), zettleScope);
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxyImpl softspaceProxyImpl = new com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxyImpl(new com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceBehaviourImpl(applicationContext));
                com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl = new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl(applicationContext, config, analytics, softspaceProxyImpl, networkModule, locationInfo, appInfo, tapToPayEventsLoop, zettleScope, platform, com.zettle.sdk.feature.taptopay.core.Translations.INSTANCE.create(applicationContext, merchantConfig.getUserConfigState()), create3, create4, merchantConfig, magnesId, isTestingEnvironment);
                settingsAnalytics = com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalyticsKt.create(com.zettle.sdk.feature.taptopay.core.settings.SettingsAnalytics.INSTANCE, analytics, softspaceProxyImpl);
                tippingAnalytics = com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalyticsKt.create(com.zettle.sdk.feature.taptopay.core.tipping.TippingAnalytics.INSTANCE, analytics);
                getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.feature.taptopay.core.ManagerImpl(userModule, zettleScope, applicationContext, tapToPayEngineInteractorImpl);
                manager = getHighSpeedVideoFpsRangesFor;
                kotlin.jvm.internal.Intrinsics.checkNotNull(manager);
            }
            return manager;
        }
    }
}
