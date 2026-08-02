package com.paypal.oslo.feature.directdeposit.ui.form.composable;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1", f = "DirectDepositESignatureScreen.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.geometry.Offset> Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> getHighSpeedVideoSizes;
    int getOutputMinFrameDuration;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/directdeposit/ui/form/effect/ESignatureEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1$1", f = "DirectDepositESignatureScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ kotlin.jvm.functions.Function1<android.graphics.Bitmap, kotlin.Unit> getHighSpeedVideoSizes;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
        int getOutputFormats;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect eSignatureEffect = (com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect) this.getHighSpeedVideoSizesFor;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getOutputFormats != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (eSignatureEffect instanceof com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.NavigateBack) {
                this.Camera2StreamConfigurationMap.invoke();
            } else if (eSignatureEffect instanceof com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.NavigateDone) {
                android.graphics.Bitmap signatureBitmap = this.getHighResolutionOutputSizeshNQ4ISI.getState().getValue().getSignatureBitmap();
                if (signatureBitmap != null) {
                    this.getHighSpeedVideoSizes.invoke(signatureBitmap);
                }
            } else {
                if (!(eSignatureEffect instanceof com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect.ClearCanvas)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.clear();
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.directdeposit.ui.form.effect.ESignatureEffect eSignatureEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1.AnonymousClass1) create(eSignatureEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizesFor = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1, androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.geometry.Offset> snapshotStateList2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = function0;
            this.getHighResolutionOutputSizeshNQ4ISI = directDepositESignatureViewModel;
            this.getHighSpeedVideoSizes = function1;
            this.getHighSpeedVideoFpsRanges = snapshotStateList;
            this.getHighSpeedVideoFpsRangesFor = snapshotStateList2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputMinFrameDuration;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputMinFrameDuration = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighResolutionOutputSizeshNQ4ISI.getEffect(), new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1(com.paypal.oslo.feature.directdeposit.ui.form.viewmodel.DirectDepositESignatureViewModel directDepositESignatureViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super android.graphics.Bitmap, kotlin.Unit> function1, androidx.compose.runtime.snapshots.SnapshotStateList<com.paypal.oslo.feature.directdeposit.ui.form.composable.StrokePath> snapshotStateList, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.compose.ui.geometry.Offset> snapshotStateList2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.directdeposit.ui.form.composable.DirectDepositESignatureScreenKt$DirectDepositESignatureScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = directDepositESignatureViewModel;
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = snapshotStateList;
        this.Camera2StreamConfigurationMap = snapshotStateList2;
    }
}
