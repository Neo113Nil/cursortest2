package com.paypal.oslo.feature.identity.rememberedlogin.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$loadUserData$1", f = "RememberedLoginViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBMIT_VALUE}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class RememberedLoginViewModel$loadUserData$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.rememberedlogin.domain.usecase.GetRememberedUserUseCase getRememberedUserUseCase;
        java.lang.String str;
        java.lang.String primaryPhone;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            getRememberedUserUseCase = this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = 1;
            obj = getRememberedUserUseCase.invoke(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel = this.getHighResolutionOutputSizeshNQ4ISI;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser rememberedUser = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser) ((arrow.core.Either.Right) either).getValue();
            int i2 = com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$loadUserData$1.WhenMappings.$EnumSwitchMapping$0[rememberedUser.getLoginType().ordinal()];
            if (i2 == 1) {
                primaryPhone = rememberedUser.getPrimaryPhone();
                if (primaryPhone == null) {
                    primaryPhone = rememberedUser.getPublicCredential();
                }
            } else {
                if (i2 != 2) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                primaryPhone = rememberedUser.getPublicCredential();
            }
            rememberedLoginViewModel.processEvent(new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataSuccess(rememberedUser.getDisplayName(), primaryPhone, rememberedUser.getAvatarUrl(), rememberedUser.getPublicCredential()));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError rememberedLoginError = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError) ((arrow.core.Either.Left) either).getValue();
            if (!(rememberedLoginError instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.NoRememberedUser) && !(rememberedLoginError instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound)) {
                if (rememberedLoginError instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.StorageCorrupted) {
                    str = "Storage data corrupted, please log in again";
                } else if (rememberedLoginError instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.StorageError) {
                    str = "Storage error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.StorageError) rememberedLoginError).getMessage()));
                } else {
                    if (!(rememberedLoginError instanceof com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.DataAccess)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    str = "Data access error: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.DataAccess) rememberedLoginError).getMessage()));
                }
            } else {
                str = "No remembered user available";
            }
            rememberedLoginViewModel.processEvent(new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginEvent.UserDataError(str));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$loadUserData$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.PHONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.EMAIL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$loadUserData$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RememberedLoginViewModel$loadUserData$1(com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel rememberedLoginViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.rememberedlogin.ui.RememberedLoginViewModel$loadUserData$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = rememberedLoginViewModel;
    }
}
