package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/UnlinkAccountUseCase;", "", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;", "repository", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/ClearRememberedUserProfileUseCase;", "clearRememberedUserProfileUseCase", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;Lcom/paypal/oslo/feature/identity/api/IdentitySession;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/ClearRememberedUserProfileUseCase;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/DataResultError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/usecase/ClearRememberedUserProfileUseCase;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnlinkAccountUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UnlinkAccountUseCase(com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository, com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase clearRememberedUserProfileUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountSwitchRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearRememberedUserProfileUseCase, "");
        this.Camera2StreamConfigurationMap = userAccountSwitchRepository;
        this.getHighSpeedVideoFpsRangesFor = identitySession;
        this.getHighSpeedVideoFpsRanges = clearRememberedUserProfileUseCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0068, code lost:
    
        if (r0 != r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase$invoke$1 unlinkAccountUseCase$invoke$1;
        int i;
        arrow.core.Ior ior;
        boolean booleanValue;
        boolean z;
        arrow.core.Ior ior2;
        boolean z2;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.ClearRememberedUserProfileUseCase clearRememberedUserProfileUseCase;
        java.lang.String message;
        arrow.core.Ior ior3;
        com.paypal.oslo.feature.identity.api.IdentitySession identitySession;
        if (continuation instanceof com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase$invoke$1) {
            unlinkAccountUseCase$invoke$1 = (com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase$invoke$1) continuation;
            if ((unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = unlinkAccountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository = this.Camera2StreamConfigurationMap;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = userAccountSwitchRepository.unlinkAccount(unlinkAccountUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            boolean z3 = unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes;
                            ior3 = (arrow.core.Ior) unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap;
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                                return ior3;
                            } catch (java.lang.Exception e) {
                                e = e;
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
                                java.lang.String message2 = e.getMessage();
                                com.paypal.android.logger.Logger.w$default(logger, "Logout failed after successful unlink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message2 != null ? message2 : "")), null, 4, null);
                                return ior3;
                            }
                        }
                        z2 = unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes;
                        ior2 = (arrow.core.Ior) unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap;
                        try {
                            try {
                                kotlin.ResultKt.throwOnFailure(obj);
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                com.paypal.android.logger.Logger logger2 = com.paypal.oslo.feature.identity.LoggerKt.log;
                                message = e.getMessage();
                                if (message == null) {
                                }
                                com.paypal.android.logger.Logger.w$default(logger2, "Failed to clear remembered user profile after unlink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
                                identitySession = this.getHighSpeedVideoFpsRangesFor;
                                unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap = ior2;
                                unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes = z2;
                                unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 3;
                                if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, unlinkAccountUseCase$invoke$1, 1, null) != coroutine_suspended) {
                                }
                                return coroutine_suspended;
                            }
                            identitySession = this.getHighSpeedVideoFpsRangesFor;
                            unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap = ior2;
                            unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes = z2;
                            unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 3;
                            if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, unlinkAccountUseCase$invoke$1, 1, null) != coroutine_suspended) {
                                return ior2;
                            }
                            return coroutine_suspended;
                        } catch (java.lang.Exception e3) {
                            e = e3;
                            ior3 = ior2;
                            com.paypal.android.logger.Logger logger3 = com.paypal.oslo.feature.identity.LoggerKt.log;
                            java.lang.String message22 = e.getMessage();
                            com.paypal.android.logger.Logger.w$default(logger3, "Logout failed after successful unlink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message22 != null ? message22 : "")), null, 4, null);
                            return ior3;
                        }
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (ior instanceof arrow.core.Ior.Left) {
                    if (ior instanceof arrow.core.Ior.Right) {
                        booleanValue = ((java.lang.Boolean) ((arrow.core.Ior.Right) ior).getValue()).booleanValue();
                    } else {
                        if (!(ior instanceof arrow.core.Ior.Both)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        arrow.core.Ior.Both both = (arrow.core.Ior.Both) ior;
                        java.lang.Object leftValue = both.getLeftValue();
                        booleanValue = ((java.lang.Boolean) both.getRightValue()).booleanValue();
                    }
                    z = booleanValue;
                } else {
                    z = false;
                }
                if (z) {
                    return ior;
                }
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Account unlinked successfully, clearing remembered user and bindings", null, null, 6, null);
                try {
                    clearRememberedUserProfileUseCase = this.getHighSpeedVideoFpsRanges;
                    unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap = ior;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes = z;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 2;
                } catch (java.lang.Exception e4) {
                    e = e4;
                    ior2 = ior;
                    z2 = z;
                    com.paypal.android.logger.Logger logger22 = com.paypal.oslo.feature.identity.LoggerKt.log;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    com.paypal.android.logger.Logger.w$default(logger22, "Failed to clear remembered user profile after unlink", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", message)), null, 4, null);
                    identitySession = this.getHighSpeedVideoFpsRangesFor;
                    unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap = ior2;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes = z2;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 3;
                    if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, unlinkAccountUseCase$invoke$1, 1, null) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (clearRememberedUserProfileUseCase.invoke(unlinkAccountUseCase$invoke$1) != coroutine_suspended) {
                    ior2 = ior;
                    z2 = z;
                    identitySession = this.getHighSpeedVideoFpsRangesFor;
                    unlinkAccountUseCase$invoke$1.Camera2StreamConfigurationMap = ior2;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoSizes = z2;
                    unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 3;
                    if (com.paypal.oslo.feature.identity.api.IdentitySession.logout$default(identitySession, false, unlinkAccountUseCase$invoke$1, 1, null) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        unlinkAccountUseCase$invoke$1 = new com.paypal.oslo.feature.identity.accountswitch.domain.usecase.UnlinkAccountUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = unlinkAccountUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = unlinkAccountUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (ior instanceof arrow.core.Ior.Left) {
        }
        if (z) {
        }
    }
}
