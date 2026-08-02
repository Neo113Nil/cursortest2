package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1", f = "ActivityDetailScreen.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, nl = {136}, s = {}, v = 2)
/* loaded from: classes14.dex */
final class ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.platform.Clipboard Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "uiEffect", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/activity/detail/viewmodel/ActivityDetailUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1$1", f = "ActivityDetailScreen.kt", i = {0}, l = {111}, m = "invokeSuspend", n = {"uiEffect"}, nl = {114}, s = {"L$0"}, v = 2)
    /* renamed from: com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.ui.platform.Clipboard getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ android.content.Context getHighSpeedVideoSizes;
        int getInputFormats;
        /* synthetic */ java.lang.Object getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect activityDetailUiEffect = (com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect) this.getOutputMinFrameDuration;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getInputFormats;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (activityDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard) {
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(activityDetailUiEffect);
                    this.getInputFormats = 1;
                    if (com.paypal.oslo.feature.revolvingcreditservicing.utils.ClipboardExtensionsKt.copyPlainText$default(this.getHighSpeedVideoFpsRanges, null, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.CopyToClipboard) activityDetailUiEffect).getText(), this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityDetailUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBack.INSTANCE)) {
                    this.Camera2StreamConfigurationMap.invoke();
                } else if (activityDetailUiEffect instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer) {
                    com.paypal.oslo.feature.revolvingcreditservicing.utils.ContextExtensionsKt.launchDialer(this.getHighSpeedVideoSizes, ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateToDialer) activityDetailUiEffect).getPhoneNumber());
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityDetailUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.ShowCancelPaymentBottomSheet.INSTANCE)) {
                    this.getHighSpeedVideoFpsRangesFor.showSheet();
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(activityDetailUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.DismissCancelPaymentBottomSheet.INSTANCE)) {
                    this.getHighSpeedVideoFpsRangesFor.hideSheet();
                } else {
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(activityDetailUiEffect, com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect.NavigateBackWithCancelResult.INSTANCE)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRangesFor.hideSheet();
                    this.getHighResolutionOutputSizeshNQ4ISI.invoke(new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.PAYMENT_CANCELED));
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
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailUiEffect activityDetailUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1.AnonymousClass1) create(activityDetailUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
            anonymousClass1.getOutputMinFrameDuration = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(androidx.compose.ui.platform.Clipboard clipboard, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = clipboard;
            this.Camera2StreamConfigurationMap = function0;
            this.getHighSpeedVideoSizes = context;
            this.getHighSpeedVideoFpsRangesFor = bottomSheetController;
            this.getHighResolutionOutputSizeshNQ4ISI = function1;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getOutputFormats.getUiEffect(), new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1(this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.viewmodel.ActivityDetailViewModel activityDetailViewModel, androidx.compose.ui.platform.Clipboard clipboard, kotlin.jvm.functions.Function0<kotlin.Unit> function0, android.content.Context context, com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.detail.ActivityDetailScreenKt$ActivityDetailUiEffectHandler$1$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = activityDetailViewModel;
        this.Camera2StreamConfigurationMap = clipboard;
        this.getHighSpeedVideoSizes = function0;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = bottomSheetController;
        this.getHighSpeedVideoFpsRanges = function1;
    }
}
