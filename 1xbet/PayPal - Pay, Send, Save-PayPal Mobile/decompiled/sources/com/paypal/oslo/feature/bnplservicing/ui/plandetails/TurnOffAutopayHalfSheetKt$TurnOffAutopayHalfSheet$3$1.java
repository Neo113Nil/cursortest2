package com.paypal.oslo.feature.bnplservicing.ui.plandetails;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1", f = "TurnOffAutopayHalfSheet.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, nl = {111}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/bnplservicing/ui/autopay/UpdateAutopayUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1$1", f = "TurnOffAutopayHalfSheet.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
        final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect updateAutopayUiEffect = (com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(updateAutopayUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowErrorHalfSheet)) {
                if (!(updateAutopayUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.ShowAutopayUpdatedHalfSheet)) {
                    if (!(updateAutopayUiEffect instanceof com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRangesFor.invoke(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(((com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect.DismissAutopayOffHalfSheet) updateAutopayUiEffect).getAutopayStatusUpdated()));
                } else {
                    this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(true));
                }
            } else {
                this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayUiEffect updateAutopayUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1.AnonymousClass1) create(updateAutopayUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = function1;
            this.getHighSpeedVideoFpsRanges = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRanges.getUiEffect$bnpl_servicing_prodRelease(), new com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1(com.paypal.oslo.feature.bnplservicing.ui.autopay.UpdateAutopayViewModel updateAutopayViewModel, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.plandetails.TurnOffAutopayHalfSheetKt$TurnOffAutopayHalfSheet$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = updateAutopayViewModel;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = mutableState;
    }
}
