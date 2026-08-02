package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010."}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/sdk/ZettleSDKManager;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/sdk/TapToPaySDKManager;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;", "zettleTokenExchange", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;", "configProvider", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/mapper/DeviceRequirementMapper;", "mapper", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/mapper/DeviceRequirementMapper;)V", "", "zettleAuthCode", "", "initialize", "(Ljava/lang/String;)V", "applicationContext", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "isRunningOnRemoteProcess", "(Landroid/content/Context;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "checkDeviceSupport", "checkDeviceCapability", "logout", "()V", com.adobe.marketing.mobile.internal.configuration.MobileIdentitiesProvider.SharedStateKeys.Audience.UUID, "", "amount", "Larrow/core/Either;", "", "Landroid/content/Intent;", "createPaymentIntent", "(Landroid/content/Context;Ljava/lang/String;J)Larrow/core/Either;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/auth/ZettleTokenExchange;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/config/ZettleConfigProvider;", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/mapper/DeviceRequirementMapper;", "Lcom/zettle/sdk/ZettleSDK;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/ZettleSDK;", "", "isInitialized", "()Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ZettleSDKManager implements com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider getHighSpeedVideoFpsRangesFor;
    private com.zettle.sdk.ZettleSDK getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ZettleSDKManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.auth.ZettleTokenExchange zettleTokenExchange, com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.config.ZettleConfigProvider zettleConfigProvider, com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper.DeviceRequirementMapper deviceRequirementMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleTokenExchange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleConfigProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceRequirementMapper, "");
        this.getHighSpeedVideoFpsRanges = context;
        this.getHighSpeedVideoSizes = zettleTokenExchange;
        this.getHighSpeedVideoFpsRangesFor = zettleConfigProvider;
        this.Camera2StreamConfigurationMap = deviceRequirementMapper;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final boolean isInitialized() {
        return com.zettle.sdk.ZettleSDK.INSTANCE.isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final void initialize(java.lang.String zettleAuthCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuthCode, "");
        this.getHighResolutionOutputSizeshNQ4ISI = com.zettle.sdk.ZettleSDK.INSTANCE.configure(this.getHighSpeedVideoFpsRangesFor.provideConfiguration(this.getHighSpeedVideoFpsRanges, new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.auth.TokenProvider(new com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.sdk.ZettleSDKManager$initialize$tokenProvider$1(this.getHighSpeedVideoSizes))));
        com.zettle.sdk.ZettleSDK zettleSDK = null;
        androidx.view.ProcessLifecycleOwner.INSTANCE.get().getLifecycleRegistry().addObserver(new com.zettle.sdk.ZettleSDKLifecycle(0L, 1, 0 == true ? 1 : 0));
        com.zettle.sdk.ZettleSDK zettleSDK2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (zettleSDK2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            zettleSDK = zettleSDK2;
        }
        zettleSDK.login(zettleAuthCode);
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult isRunningOnRemoteProcess(android.content.Context applicationContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        if (com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.INSTANCE.isRunningOnRemoteProcess(applicationContext)) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.REMOTE_PROCESS);
        }
        return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceSupport(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.INSTANCE.isDeviceSupported(context)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible.INSTANCE;
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.UNSUPPORTED_DEVICE);
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult checkDeviceCapability(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return this.Camera2StreamConfigurationMap.mapToDeviceCompatibilityResult(com.zettle.sdk.feature.taptopay.ui.TapToPayFeature.INSTANCE.isDeviceCapable(context));
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final void logout() {
        com.zettle.sdk.ZettleSDK companion;
        if (!isInitialized() || (companion = com.zettle.sdk.ZettleSDK.INSTANCE.getInstance()) == null) {
            return;
        }
        com.zettle.sdk.ZettleSDK.DefaultImpls.logout$default(companion, null, 1, null);
    }

    @Override // com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.sdk.TapToPaySDKManager
    public final arrow.core.Either<java.lang.Throwable, android.content.Intent> createPaymentIntent(android.content.Context context, java.lang.String uuid, long amount) {
        java.lang.Object m23436constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuid, "");
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            if (!isInitialized()) {
                defaultRaise2.raise(new java.lang.IllegalStateException("Zettle SDK not initialized. Call initialize() first."));
                throw new kotlin.KotlinNothingValueException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.businesspayandgetpaid.LoggerKt.log, "Creating payment intent", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("amount", java.lang.Long.valueOf(amount))), null, 4, null);
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.zettle.sdk.features.ActionUtils.charge(com.zettle.sdk.feature.taptopay.ui.InternalExtensionsKt.internalPaymentAction$default(uuid, amount, com.zettle.sdk.feature.taptopay.ui.models.TapToPayPaymentProperties.INSTANCE.m23173default(), null, uuid, 8, null), context));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            java.lang.Throwable m23439exceptionOrNullimpl = kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl);
            if (m23439exceptionOrNullimpl != null) {
                defaultRaise2.raise(m23439exceptionOrNullimpl);
                throw new kotlin.KotlinNothingValueException();
            }
            defaultRaise.complete();
            return new arrow.core.Either.Right((android.content.Intent) m23436constructorimpl);
        } catch (arrow.core.raise.RaiseCancellationException e) {
            defaultRaise.complete();
            return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
        } catch (java.lang.Throwable th2) {
            defaultRaise.complete();
            throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th2);
        }
    }
}
