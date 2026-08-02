package com.paypal.oslo.feature.identity.identitymanagement;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001d\u0010\u001cJ+\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001e0\u00192\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010+\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100R\u0014\u00102\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101"}, d2 = {"Lcom/paypal/oslo/feature/identity/identitymanagement/IdentityManagementImpl;", "Lcom/paypal/oslo/feature/identity/api/IdentityManagement;", "Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/EnableAuthenticationMethodUseCase;", "enableAuthenticationMethodUseCase", "Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/DisableAuthenticationMethodUseCase;", "disableAuthenticationMethodUseCase", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "deviceBindingTokenStorage", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "rememberedUserStorage", "Lkotlinx/coroutines/CoroutineDispatcher;", "ioDispatcher", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/EnableAuthenticationMethodUseCase;Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/DisableAuthenticationMethodUseCase;Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "flowInfo", "", "enableLLSAndBiometricSilently", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;", "authenticationMethod", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/api/model/IdentityManagementError;", "enable", "(Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disable", "", "isEnabled", "(Lcom/paypal/oslo/feature/identity/api/AuthenticationMethod;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;)Larrow/core/Either;", "isPrimaryUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasPasskeys", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/EnableAuthenticationMethodUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/identitymanagement/domain/usecase/DisableAuthenticationMethodUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceBindingTokenStorage;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/userstore/UserStore;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityManagementImpl implements com.paypal.oslo.feature.identity.api.IdentityManagement {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoSizesFor;
    private final com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public IdentityManagementImpl(com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase enableAuthenticationMethodUseCase, com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.DisableAuthenticationMethodUseCase disableAuthenticationMethodUseCase, com.paypal.oslo.feature.identity.devicebinding.domain.storage.DeviceBindingTokenStorage deviceBindingTokenStorage, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enableAuthenticationMethodUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disableAuthenticationMethodUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceBindingTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedUserStorageWithProfile, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRanges = enableAuthenticationMethodUseCase;
        this.getHighResolutionOutputSizeshNQ4ISI = disableAuthenticationMethodUseCase;
        this.Camera2StreamConfigurationMap = deviceBindingTokenStorage;
        this.getHighSpeedVideoSizes = userStore;
        this.getHighSpeedVideoFpsRangesFor = rememberedUserStorageWithProfile;
        this.getHighSpeedVideoSizesFor = coroutineDispatcher;
        this.getOutputFormats = appStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object enableLLSAndBiometricSilently(com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$enableLLSAndBiometricSilently$1 identityManagementImpl$enableLLSAndBiometricSilently$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$enableLLSAndBiometricSilently$1) {
            identityManagementImpl$enableLLSAndBiometricSilently$1 = (com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$enableLLSAndBiometricSilently$1) continuation;
            if ((identityManagementImpl$enableLLSAndBiometricSilently$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                identityManagementImpl$enableLLSAndBiometricSilently$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = identityManagementImpl$enableLLSAndBiometricSilently$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityManagementImpl$enableLLSAndBiometricSilently$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Enabling LLS and Biometric silently", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", authenticationFlowInfo.getSource()), kotlin.TuplesKt.to("additionalInfo", authenticationFlowInfo.getAdditionalParameters())), null, 4, null);
                    com.paypal.oslo.feature.identity.identitymanagement.domain.usecase.EnableAuthenticationMethodUseCase enableAuthenticationMethodUseCase = this.getHighSpeedVideoFpsRanges;
                    java.util.List<? extends com.paypal.oslo.feature.identity.api.AuthenticationMethod> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.identity.api.AuthenticationMethod[]{com.paypal.oslo.feature.identity.api.AuthenticationMethod.LLS, com.paypal.oslo.feature.identity.api.AuthenticationMethod.BIOMETRIC});
                    identityManagementImpl$enableLLSAndBiometricSilently$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(authenticationFlowInfo);
                    identityManagementImpl$enableLLSAndBiometricSilently$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = enableAuthenticationMethodUseCase.invoke(listOf, identityManagementImpl$enableLLSAndBiometricSilently$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "LLS and Biometric enabled successfully", null, null, 6, null);
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Failed to enable LLS and Biometric silently", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((arrow.core.Either.Left) either).getValue().toString())), null, 4, null);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        identityManagementImpl$enableLLSAndBiometricSilently$1 = new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$enableLLSAndBiometricSilently$1(this, continuation);
        java.lang.Object obj2 = identityManagementImpl$enableLLSAndBiometricSilently$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityManagementImpl$enableLLSAndBiometricSilently$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    public final java.lang.Object enable(com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.IdentityManagementError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Enabling ".concat(java.lang.String.valueOf(authenticationMethod)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", authenticationFlowInfo.getSource()), kotlin.TuplesKt.to("additionalInfo", authenticationFlowInfo.getAdditionalParameters())), null, 4, null);
        return this.getHighSpeedVideoFpsRanges.invoke(kotlin.collections.CollectionsKt.listOf(authenticationMethod), continuation);
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    public final java.lang.Object disable(com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.api.model.IdentityManagementError, kotlin.Unit>> continuation) {
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Disabling ".concat(java.lang.String.valueOf(authenticationMethod)), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", authenticationFlowInfo.getSource()), kotlin.TuplesKt.to("additionalInfo", authenticationFlowInfo.getAdditionalParameters())), null, 4, null);
        return this.getHighResolutionOutputSizeshNQ4ISI.invoke(authenticationMethod, continuation);
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    public final arrow.core.Either<com.paypal.oslo.feature.identity.api.model.IdentityManagementError, java.lang.Boolean> isEnabled(com.paypal.oslo.feature.identity.api.AuthenticationMethod authenticationMethod, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo flowInfo) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethod, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowInfo, "");
        com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Checking if ");
        sb.append(authenticationMethod);
        sb.append(" is enabled");
        com.paypal.android.logger.Logger.d$default(logger, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("source", flowInfo.getSource()), kotlin.TuplesKt.to("additionalInfo", flowInfo.getAdditionalParameters())), null, 4, null);
        arrow.core.raise.DefaultRaise defaultRaise = new arrow.core.raise.DefaultRaise(false);
        try {
            arrow.core.raise.DefaultRaise defaultRaise2 = defaultRaise;
            try {
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isEnabled$1$token$1(this, authenticationMethod, null), 1, null);
                boolean z = ((java.lang.String) runBlocking$default) != null;
                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Enabled check for ");
                sb2.append(authenticationMethod);
                sb2.append(": ");
                sb2.append(z);
                com.paypal.android.logger.Logger.d$default(logger2, sb2.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("method", authenticationMethod.name()), kotlin.TuplesKt.to("hasToken", java.lang.Boolean.valueOf(z))), null, 4, null);
                defaultRaise.complete();
                return new arrow.core.Either.Right(java.lang.Boolean.valueOf(z));
            } catch (arrow.core.raise.RaiseCancellationException e) {
                e = e;
                defaultRaise.complete();
                return new arrow.core.Either.Left(arrow.core.raise.RaiseKt.raisedOrRethrow(e, defaultRaise));
            } catch (java.lang.Throwable th) {
                th = th;
                defaultRaise.complete();
                throw arrow.core.NonFatalOrThrowKt.nonFatalOrThrow(th);
            }
        } catch (arrow.core.raise.RaiseCancellationException e2) {
            e = e2;
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    public final java.lang.Object isPrimaryUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.getHighSpeedVideoSizesFor, new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$isPrimaryUser$2(this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.api.IdentityManagement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object hasPasskeys(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$hasPasskeys$1 identityManagementImpl$hasPasskeys$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$hasPasskeys$1) {
            identityManagementImpl$hasPasskeys$1 = (com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$hasPasskeys$1) continuation;
            if ((identityManagementImpl$hasPasskeys$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                identityManagementImpl$hasPasskeys$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = identityManagementImpl$hasPasskeys$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = identityManagementImpl$hasPasskeys$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.getOutputFormats;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted(com.paypal.oslo.feature.identity.passkey.management.PasskeyStorageKeys.PASSKEY_CREDENTIAL_COUNT);
                    identityManagementImpl$hasPasskeys$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = appStorage.getInt(unencrypted, identityManagementImpl$hasPasskeys$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.lang.Integer num = (java.lang.Integer) obj;
                int intValue = num == null ? num.intValue() : 0;
                boolean z = intValue <= 0;
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Passkey status check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasPasskeys", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(intValue))), null, 4, null);
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        identityManagementImpl$hasPasskeys$1 = new com.paypal.oslo.feature.identity.identitymanagement.IdentityManagementImpl$hasPasskeys$1(this, continuation);
        java.lang.Object obj2 = identityManagementImpl$hasPasskeys$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = identityManagementImpl$hasPasskeys$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        java.lang.Integer num2 = (java.lang.Integer) obj2;
        if (num2 == null) {
        }
        if (intValue <= 0) {
        }
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Passkey status check", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasPasskeys", kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z)), kotlin.TuplesKt.to(com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, kotlin.coroutines.jvm.internal.Boxing.boxInt(intValue))), null, 4, null);
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
    }
}
