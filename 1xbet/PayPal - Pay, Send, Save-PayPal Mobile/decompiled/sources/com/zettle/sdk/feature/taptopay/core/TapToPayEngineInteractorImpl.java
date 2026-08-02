package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u008f\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\"2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001f\u00109\u001a\u00020\"2\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u00109\u001a\u00020\"2\u0006\u0010<\u001a\u00020;2\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010=R\u0014\u0010@\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010A\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020E8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010K\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010>\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010MR\u0014\u0010P\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\"8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010N\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010WR\u0014\u0010X\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001b\u0010c\u001a\u00020_8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\b`\u0010G\u001a\u0004\ba\u0010bR\u001b\u0010h\u001a\u00020d8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\be\u0010G\u001a\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020k8WX\u0097\u0084\u0002¢\u0006\f\n\u0004\bl\u0010G\u001a\u0004\bm\u0010nR\u0014\u0010\\\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b^\u0010pR\u0014\u0010s\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bq\u0010r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractorImpl;", "Lcom/zettle/sdk/feature/taptopay/core/TapToPayEngineInteractor;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/Context;", "applicationContext", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "config", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/os/LocationInfo;", "locationInfo", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "eventsLoop", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "translations", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;", "configurationInitUsecase", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "cvmLimitsUsecase", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lkotlin/Function0;", "", "magnesId", "", "isTestingEnvironment", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/commons/util/ExternalConfig;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/os/LocationInfo;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/commons/thread/EventsLoop;Lkotlinx/coroutines/CoroutineScope;Lcom/zettle/sdk/meta/Platform;Lcom/zettle/sdk/feature/taptopay/core/Translations;Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lkotlin/jvm/functions/Function0;Z)V", "organizationId", "", "configure", "(Ljava/lang/String;)V", "", "permissionArray", "hasGrantPermission", "([I)Z", "context", "hasRequiredPermission", "(Landroid/content/Context;)Z", "Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;", "initConfiguration", "init", "(Lcom/zettle/sdk/feature/taptopay/core/models/ConfigurationInit;)Z", "Landroid/app/Activity;", "activityContext", "", "requestCode", "requestPermissionIfRequired", "(Landroid/app/Activity;I)Z", "Landroidx/fragment/app/Fragment;", "fragmentContext", "(Landroidx/fragment/app/Fragment;I)Z", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/analytics/Analytics;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "attestation$delegate", "Lkotlin/Lazy;", "getAttestation", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/Attestation;", "attestation", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/init/ConfigurationInitUsecase;", "getOutputFormats", "Lcom/zettle/sdk/feature/taptopay/core/configuration/cvmlimits/CvmLimitsUsecase;", "getOutputMinFrameDuration", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Z", "getInputFormats", "Lcom/zettle/sdk/core/os/LocationInfo;", "Lkotlin/jvm/functions/Function0;", "getOutputSizes", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "getOutputStallDuration", "Lcom/zettle/sdk/core/network/NetworkModule;", "getOutputMinFrameDurationlomOqCM", "Lcom/zettle/sdk/meta/Platform;", "getOutputSizeshNQ4ISI", "Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "refund$delegate", "getRefund", "()Lcom/zettle/sdk/feature/taptopay/core/refunds/Refund;", "refund", "Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "retrieveTransaction$delegate", "getRetrieveTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/retrieve/RetrieveTransaction;", "retrieveTransaction", "getOutputStallDurationlomOqCM", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "transaction$delegate", "getTransaction", "()Lcom/zettle/sdk/feature/taptopay/core/transaction/Transaction;", "transaction", "Lcom/zettle/sdk/feature/taptopay/core/Translations;", "isOutputSupportedFor", "Lkotlinx/coroutines/CoroutineScope;", "isOutputSupportedForhNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPayEngineInteractorImpl implements com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighSpeedVideoFpsRanges;

    /* renamed from: attestation$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy attestation;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.commons.util.ExternalConfig getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean getInputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.core.os.LocationInfo getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.String> getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase getOutputMinFrameDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.thread.EventsLoop getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform getOutputSizeshNQ4ISI;
    private final com.zettle.sdk.core.auth.merchant.MerchantConfig getOutputSizes;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.Translations getOutputMinFrameDurationlomOqCM;
    private final com.zettle.sdk.core.network.NetworkModule getOutputStallDuration;
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getOutputStallDurationlomOqCM;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope isOutputSupportedForhNQ4ISI;

    /* renamed from: refund$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy refund;

    /* renamed from: retrieveTransaction$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy retrieveTransaction;

    /* renamed from: transaction$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy transaction;

    public TapToPayEngineInteractorImpl(android.content.Context context, com.zettle.sdk.commons.util.ExternalConfig externalConfig, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.os.LocationInfo locationInfo, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.commons.thread.EventsLoop eventsLoop, kotlinx.coroutines.CoroutineScope coroutineScope, com.zettle.sdk.meta.Platform platform, com.zettle.sdk.feature.taptopay.core.Translations translations, com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase configurationInitUsecase, com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase cvmLimitsUsecase, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, kotlin.jvm.functions.Function0<java.lang.String> function0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locationInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsLoop, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(translations, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configurationInitUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvmLimitsUsecase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = externalConfig;
        this.getHighSpeedVideoFpsRanges = analytics;
        this.getOutputStallDurationlomOqCM = softspaceProxy;
        this.getOutputStallDuration = networkModule;
        this.getOutputFormats = locationInfo;
        this.getHighSpeedVideoFpsRangesFor = appInfo;
        this.getInputSizeshNQ4ISI = eventsLoop;
        this.isOutputSupportedForhNQ4ISI = coroutineScope;
        this.getOutputSizeshNQ4ISI = platform;
        this.getOutputMinFrameDurationlomOqCM = translations;
        this.Camera2StreamConfigurationMap = configurationInitUsecase;
        this.getOutputMinFrameDuration = cvmLimitsUsecase;
        this.getOutputSizes = merchantConfig;
        this.getHighSpeedVideoSizesFor = function0;
        this.getInputFormats = z;
        this.attestation = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.attestation.Attestation>() { // from class: com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestation$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.attestation.Attestation invoke() {
                android.content.Context context2;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy2;
                com.zettle.sdk.commons.thread.EventsLoop eventsLoop2;
                com.zettle.sdk.commons.util.ExternalConfig externalConfig2;
                com.zettle.sdk.analytics.Analytics analytics2;
                com.zettle.sdk.analytics.Analytics analytics3;
                com.zettle.sdk.meta.AppInfo appInfo2;
                boolean z2;
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Companion companion = com.zettle.sdk.feature.taptopay.core.attestation.Attestation.INSTANCE;
                context2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighResolutionOutputSizeshNQ4ISI;
                softspaceProxy2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                eventsLoop2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getInputSizeshNQ4ISI;
                externalConfig2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoSizes;
                analytics2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRanges;
                analytics3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRanges;
                com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalyticsImpl attestationHerdAnalyticsImpl = new com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationHerdAnalyticsImpl(analytics3);
                appInfo2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                z2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getInputFormats;
                return com.zettle.sdk.feature.taptopay.core.attestation.AttestationImplKt.create(companion, context2, softspaceProxy2, eventsLoop2, analytics2, attestationHerdAnalyticsImpl, appInfo2, externalConfig2, z2);
            }

            {
                super(0);
            }
        });
        this.transaction = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl>() { // from class: com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$transaction$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl invoke() {
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy2;
                com.zettle.sdk.analytics.Analytics analytics2;
                com.zettle.sdk.meta.AppInfo appInfo2;
                com.zettle.sdk.analytics.Analytics analytics3;
                com.zettle.sdk.commons.thread.EventsLoop eventsLoop2;
                com.zettle.sdk.core.network.NetworkModule networkModule2;
                com.zettle.sdk.core.os.LocationInfo locationInfo2;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy3;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy4;
                com.zettle.sdk.feature.taptopay.core.configuration.cvmlimits.CvmLimitsUsecase cvmLimitsUsecase2;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy5;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy6;
                com.zettle.sdk.meta.AppInfo appInfo3;
                com.zettle.sdk.meta.Platform platform2;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy7;
                com.zettle.sdk.meta.Platform platform3;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy8;
                com.zettle.sdk.meta.AppInfo appInfo4;
                com.zettle.sdk.meta.Platform platform4;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy9;
                com.zettle.sdk.meta.AppInfo appInfo5;
                com.zettle.sdk.meta.Platform platform5;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy10;
                com.zettle.sdk.meta.AppInfo appInfo6;
                com.zettle.sdk.meta.Platform platform6;
                com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase configurationInitUsecase2;
                com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy11;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                kotlin.jvm.functions.Function0 function02;
                com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig2;
                com.zettle.sdk.feature.taptopay.core.Translations translations2;
                com.zettle.sdk.feature.taptopay.core.Translations translations3;
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionService create = com.zettle.sdk.feature.taptopay.core.transaction.TransactionServiceKt.create(com.zettle.sdk.feature.taptopay.core.transaction.TransactionService.INSTANCE);
                com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getAttestation();
                softspaceProxy2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                analytics2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRanges;
                appInfo2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalytics transactionAnalytics = new com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionAnalytics(softspaceProxy2, analytics2, appInfo2);
                analytics3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRanges;
                com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalyticsImpl transactionHerdAnalyticsImpl = new com.zettle.sdk.feature.taptopay.core.transaction.analytics.TransactionHerdAnalyticsImpl(analytics3);
                eventsLoop2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getInputSizeshNQ4ISI;
                networkModule2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDuration;
                locationInfo2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputFormats;
                softspaceProxy3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUsecaseImpl startTransactionUsecaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.StartTransactionUsecaseImpl(softspaceProxy3);
                softspaceProxy4 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCaseImpl enterPinUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.EnterPinUseCaseImpl(softspaceProxy4);
                cvmLimitsUsecase2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputMinFrameDuration;
                softspaceProxy5 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCaseImpl cancelTransactionUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.CancelTransactionUseCaseImpl(softspaceProxy5);
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCaseImpl requestOnlineAuthUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RequestOnlineAuthUseCaseImpl();
                softspaceProxy6 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                appInfo3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                platform2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCaseImpl transactionRequestUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.TransactionRequestUseCaseImpl(softspaceProxy6, create, appInfo3, platform2);
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl recoverTransactionRequestUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.RecoverTransactionRequestUseCaseImpl(create, null, 2, 0 == true ? 1 : 0);
                softspaceProxy7 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                platform3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCaseImpl finalizeRequestUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.FinalizeRequestUseCaseImpl(softspaceProxy7, create, platform3);
                softspaceProxy8 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                appInfo4 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                platform4 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl abortRequestUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.AbortRequestUseCaseImpl(softspaceProxy8, create, appInfo4, platform4);
                softspaceProxy9 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                appInfo5 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                platform5 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCaseImpl permissiveSignatureUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.PermissiveSignatureUseCaseImpl(softspaceProxy9, create, appInfo5, platform5);
                softspaceProxy10 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                appInfo6 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                platform6 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCaseImpl uploadSignatureUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.UploadSignatureUseCaseImpl(softspaceProxy10, create, appInfo6, platform6);
                configurationInitUsecase2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.Camera2StreamConfigurationMap;
                softspaceProxy11 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDurationlomOqCM;
                coroutineScope2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.isOutputSupportedForhNQ4ISI;
                com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl reinitialiseUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.transaction.usecase.ReinitialiseUseCaseImpl(softspaceProxy11, coroutineScope2);
                function02 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoSizesFor;
                merchantConfig2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizes;
                translations2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputMinFrameDurationlomOqCM;
                com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl transactionInternalImpl = new com.zettle.sdk.feature.taptopay.core.transaction.TransactionInternalImpl(attestation, transactionAnalytics, transactionHerdAnalyticsImpl, eventsLoop2, networkModule2, locationInfo2, startTransactionUsecaseImpl, enterPinUseCaseImpl, cvmLimitsUsecase2, cancelTransactionUseCaseImpl, requestOnlineAuthUseCaseImpl, transactionRequestUseCaseImpl, recoverTransactionRequestUseCaseImpl, finalizeRequestUseCaseImpl, abortRequestUseCaseImpl, permissiveSignatureUseCaseImpl, uploadSignatureUseCaseImpl, configurationInitUsecase2, reinitialiseUseCaseImpl, function02, translations2, merchantConfig2, null, 4194304, null);
                translations3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputMinFrameDurationlomOqCM;
                return new com.zettle.sdk.feature.taptopay.core.transaction.TransactionImpl(transactionInternalImpl, translations3);
            }

            {
                super(0);
            }
        });
        this.refund = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl>() { // from class: com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$refund$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl invoke() {
                com.zettle.sdk.core.network.NetworkModule networkModule2;
                com.zettle.sdk.core.network.NetworkModule networkModule3;
                com.zettle.sdk.analytics.Analytics analytics2;
                com.zettle.sdk.meta.AppInfo appInfo2;
                kotlinx.coroutines.CoroutineScope coroutineScope2;
                com.zettle.sdk.meta.AppInfo appInfo3;
                com.zettle.sdk.meta.Platform platform2;
                com.zettle.sdk.core.os.LocationInfo locationInfo2;
                com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig2;
                kotlinx.coroutines.CoroutineScope coroutineScope3;
                com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceImpl refundServiceImpl = new com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceImpl();
                networkModule2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDuration;
                com.zettle.sdk.commons.network.NetworkClient createTapToPayNetworkClient = com.zettle.sdk.feature.taptopay.core.configuration.TapToPayNetworkKt.createTapToPayNetworkClient(networkModule2, com.zettle.sdk.commons.network.Service.ApiAuthenticated, com.zettle.sdk.commons.network.Scope.Refund);
                com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceImpl refundServiceImpl2 = refundServiceImpl;
                com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCaseImpl retrievePaymentUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCaseImpl(refundServiceImpl2, createTapToPayNetworkClient);
                com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCaseImpl checkRefundableUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.refunds.usecase.CheckRefundableUseCaseImpl(refundServiceImpl2, createTapToPayNetworkClient);
                networkModule3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDuration;
                com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCaseImpl submitRefundUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.refunds.usecase.SubmitRefundUseCaseImpl(refundServiceImpl2, com.zettle.sdk.feature.taptopay.core.configuration.TapToPayNetworkKt.createTapToPayNetworkClient(networkModule3, com.zettle.sdk.commons.network.Service.CardPayment, com.zettle.sdk.commons.network.Scope.Refund));
                analytics2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRanges;
                appInfo2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl refundAnalyticsImpl = new com.zettle.sdk.feature.taptopay.core.refunds.analytics.RefundAnalyticsImpl(analytics2, appInfo2);
                coroutineScope2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.isOutputSupportedForhNQ4ISI;
                appInfo3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getHighSpeedVideoFpsRangesFor;
                platform2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizeshNQ4ISI;
                com.zettle.sdk.meta.PlatformInfo info = platform2.getInfo();
                locationInfo2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputFormats;
                com.zettle.sdk.core.os.LocationData lastKnown = locationInfo2.getLastKnown();
                merchantConfig2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizes;
                com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl refundInternalImpl = new com.zettle.sdk.feature.taptopay.core.refunds.RefundInternalImpl(retrievePaymentUseCaseImpl, checkRefundableUseCaseImpl, submitRefundUseCaseImpl, coroutineScope2, appInfo3, info, lastKnown, merchantConfig2, refundAnalyticsImpl);
                coroutineScope3 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.isOutputSupportedForhNQ4ISI;
                return new com.zettle.sdk.feature.taptopay.core.refunds.RefundImpl(coroutineScope3, refundInternalImpl);
            }

            {
                super(0);
            }
        });
        this.retrieveTransaction = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl>() { // from class: com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$retrieveTransaction$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl invoke() {
                com.zettle.sdk.core.network.NetworkModule networkModule2;
                com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig2;
                networkModule2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputStallDuration;
                com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCaseImpl retrievePaymentUseCaseImpl = new com.zettle.sdk.feature.taptopay.core.refunds.usecase.RetrievePaymentUseCaseImpl(new com.zettle.sdk.feature.taptopay.core.refunds.RefundServiceImpl(), com.zettle.sdk.feature.taptopay.core.configuration.TapToPayNetworkKt.createTapToPayNetworkClient(networkModule2, com.zettle.sdk.commons.network.Service.ApiAuthenticated, com.zettle.sdk.commons.network.Scope.Refund));
                merchantConfig2 = com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getOutputSizes;
                return new com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransactionImpl(retrievePaymentUseCaseImpl, merchantConfig2);
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final com.zettle.sdk.feature.taptopay.core.attestation.Attestation getAttestation() {
        return (com.zettle.sdk.feature.taptopay.core.attestation.Attestation) this.attestation.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final com.zettle.sdk.feature.taptopay.core.transaction.Transaction getTransaction() {
        return (com.zettle.sdk.feature.taptopay.core.transaction.Transaction) this.transaction.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final com.zettle.sdk.feature.taptopay.core.refunds.Refund getRefund() {
        return (com.zettle.sdk.feature.taptopay.core.refunds.Refund) this.refund.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction getRetrieveTransaction() {
        return (com.zettle.sdk.feature.taptopay.core.retrieve.RetrieveTransaction) this.retrieveTransaction.getValue();
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final boolean init(com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit initConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initConfiguration, "");
        return this.getOutputStallDurationlomOqCM.init(initConfiguration);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final boolean requestPermissionIfRequired(android.app.Activity activityContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityContext, "");
        return this.getOutputStallDurationlomOqCM.requestPermissionIfRequired(activityContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final boolean requestPermissionIfRequired(androidx.fragment.app.Fragment fragmentContext, int requestCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fragmentContext, "");
        return this.getOutputStallDurationlomOqCM.requestPermissionIfRequired(fragmentContext, requestCode);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final boolean hasRequiredPermission(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return this.getOutputStallDurationlomOqCM.hasRequiredPermission(context);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final boolean hasGrantPermission(int[] permissionArray) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(permissionArray, "");
        return this.getOutputStallDurationlomOqCM.hasGrantPermission(permissionArray);
    }

    @Override // com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractor
    public final void configure(java.lang.String organizationId) {
        this.Camera2StreamConfigurationMap.invoke(organizationId, (kotlin.jvm.functions.Function1<? super com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit>) new kotlin.jvm.functions.Function1<com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result, kotlin.Unit>() { // from class: com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$configure$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result result) {
                getHighSpeedVideoSizes(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success) {
                    com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success success = (com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Success) result;
                    com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(r0.isOutputSupportedForhNQ4ISI, new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialise$1(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this, success.getConfigurationInit(), success.getOrganizationId(), null));
                    return;
                }
                if (result instanceof com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed) {
                    com.zettle.sdk.core.log.LogKt.warn(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this, "Tap to pay engine not initialised", new com.zettle.sdk.core.NonFatalException(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.this.getGetHighSpeedVideoFpsRangesFor(), ((com.zettle.sdk.feature.taptopay.core.configuration.init.ConfigurationInitUsecase.Result.Failed) result).getReason().toString()));
                }
            }

            {
                super(1);
            }
        });
    }

    public static final /* synthetic */ java.lang.Object access$attestationLogin(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$attestationLogin$2(tapToPayEngineInteractorImpl, str, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }
}
