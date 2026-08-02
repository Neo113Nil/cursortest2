package com.zettle.sdk.core.requirements;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.requirements.RequirementsFragment$showLoadingViewWithDelay$1", f = "RequirementsFragment.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class RequirementsFragment$showLoadingViewWithDelay$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.core.requirements.RequirementsFragment getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.View view;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.DelayKt.delay(400L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (!this.getHighSpeedVideoSizes.isDetached()) {
            view = this.getHighSpeedVideoSizes.getInputFormats;
            android.widget.ImageView imageView3 = null;
            if (view == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                view = null;
            }
            if (view.getVisibility() == 8) {
                imageView = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                if (imageView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    imageView = null;
                }
                imageView.setVisibility(0);
                com.zettle.sdk.core.requirements.RequirementsFragment requirementsFragment = this.getHighSpeedVideoSizes;
                androidx.swiperefreshlayout.widget.CircularProgressDrawable circularProgressDrawable2 = new androidx.swiperefreshlayout.widget.CircularProgressDrawable(this.getHighSpeedVideoSizes.requireContext());
                com.zettle.sdk.core.requirements.RequirementsFragment requirementsFragment2 = this.getHighSpeedVideoSizes;
                circularProgressDrawable2.setStrokeWidth(requirementsFragment2.getResources().getDimension(com.zettle.sdk.R.dimen.loading_stroke_width));
                circularProgressDrawable2.setColorSchemeColors(androidx.core.content.res.ResourcesCompat.getColor(requirementsFragment2.getResources(), com.zettle.sdk.R.color.progressIndicator, null));
                circularProgressDrawable2.start();
                requirementsFragment.getOutputMinFrameDuration = circularProgressDrawable2;
                imageView2 = this.getHighSpeedVideoSizes.getInputSizeshNQ4ISI;
                if (imageView2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    imageView3 = imageView2;
                }
                circularProgressDrawable = this.getHighSpeedVideoSizes.getOutputMinFrameDuration;
                imageView3.setImageDrawable(circularProgressDrawable);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.core.requirements.RequirementsFragment$showLoadingViewWithDelay$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.core.requirements.RequirementsFragment$showLoadingViewWithDelay$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RequirementsFragment$showLoadingViewWithDelay$1(com.zettle.sdk.core.requirements.RequirementsFragment requirementsFragment, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.requirements.RequirementsFragment$showLoadingViewWithDelay$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = requirementsFragment;
    }
}
