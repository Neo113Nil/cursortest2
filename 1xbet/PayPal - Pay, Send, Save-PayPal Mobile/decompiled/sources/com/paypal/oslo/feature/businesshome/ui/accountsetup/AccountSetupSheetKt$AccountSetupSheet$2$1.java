package com.paypal.oslo.feature.businesshome.ui.accountsetup;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1", f = "AccountSetupSheet.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, nl = {97}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AccountSetupSheetKt$AccountSetupSheet$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/businesshome/ui/accountsetup/AccountSetupEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1$1", f = "AccountSetupSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect accountSetupEffect = (com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect) this.Camera2StreamConfigurationMap;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRangesFor != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (accountSetupEffect instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToVerifyAccount) {
                this.getHighSpeedVideoSizes.invoke();
            } else if (accountSetupEffect instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToConfirmEmail) {
                this.getHighResolutionOutputSizeshNQ4ISI.invoke();
            } else if (!(accountSetupEffect instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToAddBankAccount) && !(accountSetupEffect instanceof com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect.NavigateToDebitCard)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupEffect accountSetupEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1.AnonymousClass1) create(accountSetupEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.Camera2StreamConfigurationMap = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoSizes = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = function02;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getEffects(), new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSetupSheetKt$AccountSetupSheet$2$1(com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupViewModel accountSetupViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.businesshome.ui.accountsetup.AccountSetupSheetKt$AccountSetupSheet$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = accountSetupViewModel;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRanges = function02;
    }
}
