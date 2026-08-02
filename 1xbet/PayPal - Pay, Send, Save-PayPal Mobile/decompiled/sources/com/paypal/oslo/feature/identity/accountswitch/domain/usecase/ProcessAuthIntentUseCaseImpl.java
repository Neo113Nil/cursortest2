package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/ProcessAuthIntentUseCaseImpl;", "Lcom/paypal/oslo/feature/identity/login/domain/ProcessAuthIntentUseCase;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/RefreshUserStoreUseCase;", "refreshUserStoreUseCase", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/ObserveLinkAccountCompletionUseCase;", "observeLinkAccountCompletionUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/RefreshUserStoreUseCase;Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/ObserveLinkAccountCompletionUseCase;)V", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "authIntent", "", "invoke", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/RefreshUserStoreUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/ObserveLinkAccountCompletionUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ProcessAuthIntentUseCaseImpl implements com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ProcessAuthIntentUseCaseImpl(com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase refreshUserStoreUseCase, com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ObserveLinkAccountCompletionUseCase observeLinkAccountCompletionUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refreshUserStoreUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observeLinkAccountCompletionUseCase, "");
        this.getHighSpeedVideoFpsRanges = refreshUserStoreUseCase;
        this.Camera2StreamConfigurationMap = observeLinkAccountCompletionUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0073, code lost:
    
        if (r2.invoke(r14, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.identity.login.domain.ProcessAuthIntentUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$1 processAuthIntentUseCaseImpl$invoke$1;
        java.lang.Object coroutine_suspended;
        int i;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent;
        kotlinx.coroutines.flow.Flow<java.lang.Boolean> invoke;
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2 processAuthIntentUseCaseImpl$invoke$2;
        com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent2;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent2;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$1) {
            processAuthIntentUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$1) continuation;
            if ((processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i2 = com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl.WhenMappings.$EnumSwitchMapping$0[authIntent.ordinal()];
                    if (i2 == 1) {
                        profileIntent = com.paypal.oslo.core.userstore.model.ProfileIntent.LINK_ACCOUNT;
                    } else {
                        profileIntent = i2 != 2 ? null : com.paypal.oslo.core.userstore.model.ProfileIntent.SWITCH_ACCOUNT;
                    }
                    if (profileIntent == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.feature.identity.accountswitch.domain.usecase.RefreshUserStoreUseCase refreshUserStoreUseCase = this.getHighSpeedVideoFpsRanges;
                    processAuthIntentUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = authIntent;
                    processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoSizes = profileIntent;
                    processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        profileIntent2 = (com.paypal.oslo.core.userstore.model.ProfileIntent) processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                        authIntent2 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) processAuthIntentUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account auth intent processing completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("auth_intent", authIntent2.name()), kotlin.TuplesKt.to("profile_intent", profileIntent2.name())), null, 4, null);
                        return kotlin.Unit.INSTANCE;
                    }
                    com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent3 = (com.paypal.oslo.core.userstore.model.ProfileIntent) processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent3 = (com.paypal.oslo.feature.identity.login.domain.model.AuthIntent) processAuthIntentUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                    profileIntent = profileIntent3;
                    authIntent = authIntent3;
                }
                invoke = this.Camera2StreamConfigurationMap.invoke();
                processAuthIntentUseCaseImpl$invoke$2 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2(null);
                processAuthIntentUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = authIntent;
                processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoSizes = profileIntent;
                processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 2;
                if (kotlinx.coroutines.flow.FlowKt.first(invoke, processAuthIntentUseCaseImpl$invoke$2, processAuthIntentUseCaseImpl$invoke$1) != coroutine_suspended) {
                    authIntent2 = authIntent;
                    profileIntent2 = profileIntent;
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account auth intent processing completed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("auth_intent", authIntent2.name()), kotlin.TuplesKt.to("profile_intent", profileIntent2.name())), null, 4, null);
                    return kotlin.Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        processAuthIntentUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        invoke = this.Camera2StreamConfigurationMap.invoke();
        processAuthIntentUseCaseImpl$invoke$2 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.ProcessAuthIntentUseCaseImpl$invoke$2(null);
        processAuthIntentUseCaseImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI = authIntent;
        processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoSizes = profileIntent;
        processAuthIntentUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges = 2;
        if (kotlinx.coroutines.flow.FlowKt.first(invoke, processAuthIntentUseCaseImpl$invoke$2, processAuthIntentUseCaseImpl$invoke$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.LINK_ACCOUNT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.login.domain.model.AuthIntent.SWITCH_ACCOUNT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
