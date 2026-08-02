package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0012\u001a\u00020\r2\n\u0010\u0011\u001a\u00060\u0014j\u0002`\u00152\u0017\u0010\u0016\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UpdateTokenUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "tokenStorage", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;)V", "", "newToken", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onTokenUpdateComplete", "invoke", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "p1", "(Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;)V", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateTokenUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdateTokenUseCase(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        this.getHighSpeedVideoFpsRangesFor = userStore;
        this.Camera2StreamConfigurationMap = identityTokenStorage;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:23|24|(2:26|22))|20))|31|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r8, r2, r0) != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        getHighResolutionOutputSizeshNQ4ISI(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
    
        getHighResolutionOutputSizeshNQ4ISI(r6, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$1 updateTokenUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$1) {
            updateTokenUseCase$invoke$1 = (com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$1) continuation;
            if ((updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    updateTokenUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    updateTokenUseCase$invoke$1.getHighSpeedVideoSizes = function1;
                    updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    if (getHighResolutionOutputSizeshNQ4ISI(str, updateTokenUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    function1 = (kotlin.jvm.functions.Function1) updateTokenUseCase$invoke$1.getHighSpeedVideoSizes;
                    str = (java.lang.String) updateTokenUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState = this.getHighSpeedVideoFpsRangesFor.getUserState();
                com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$2 updateTokenUseCase$invoke$2 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$2(function1, null);
                updateTokenUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                updateTokenUseCase$invoke$1.getHighSpeedVideoSizes = function1;
                updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
            }
        }
        updateTokenUseCase$invoke$1 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.userstore.model.UserState> userState2 = this.getHighSpeedVideoFpsRangesFor.getUserState();
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$2 updateTokenUseCase$invoke$22 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$invoke$2(function1, null);
        updateTokenUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        updateTokenUseCase$invoke$1.getHighSpeedVideoSizes = function1;
        updateTokenUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r15.refresh(r2, r0) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r15.saveUserAccessToken(r2, r0) != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$updateTokenAndRefreshUserData$1 updateTokenUseCase$updateTokenAndRefreshUserData$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$updateTokenAndRefreshUserData$1) {
            updateTokenUseCase$updateTokenAndRefreshUserData$1 = (com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$updateTokenAndRefreshUserData$1) continuation;
            if ((updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = new com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData(str, com.paypal.oslo.feature.identity.foundation.model.AuthenticationTier.USER_ACCESS_TOKEN_AUTHENTICATED_STATE, 0L, null, 12, null);
                    updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    str = (java.lang.String) updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent = com.paypal.oslo.core.userstore.model.ProfileIntent.SWITCH_ACCOUNT;
                updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap = 2;
            }
        }
        updateTokenUseCase$updateTokenAndRefreshUserData$1 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UpdateTokenUseCase$updateTokenAndRefreshUserData$1(this, continuation);
        java.lang.Object obj2 = updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        com.paypal.oslo.core.userstore.UserStore userStore2 = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent2 = com.paypal.oslo.core.userstore.model.ProfileIntent.SWITCH_ACCOUNT;
        updateTokenUseCase$updateTokenAndRefreshUserData$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        updateTokenUseCase$updateTokenAndRefreshUserData$1.Camera2StreamConfigurationMap = 2;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.Exception p0, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> p1) {
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Exception when updating token and user data", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "UpdateTokenUseCase")), null, p0, 4, null);
        p1.invoke(java.lang.Boolean.FALSE);
    }
}
