package com.paypal.oslo.feature.oneonboarding.ui.common;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1", f = "ContextualErrorBanner.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, nl = {145}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.focus.FocusRequester getHighSpeedVideoSizes;
    int getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean booleanValue;
        com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRanges.getValue()).booleanValue();
            if (!booleanValue) {
                if (this.getHighSpeedVideoFpsRangesFor) {
                    java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list = this.Camera2StreamConfigurationMap;
                    if (((list == null || (contextualInfo = (com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) list)) == null) ? null : com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMapperKt.toErrorMessage(contextualInfo, this.getHighResolutionOutputSizeshNQ4ISI)) != null) {
                        this.getOutputFormats = 1;
                        if (androidx.compose.runtime.MonotonicFrameClockKt.withFrameNanos(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj2) {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        }, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return kotlin.Unit.INSTANCE;
            }
            this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(false));
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(this.getHighSpeedVideoSizes, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1(boolean z, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> list, android.content.Context context, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.oneonboarding.ui.common.ContextualErrorBannerKt$ContextualFocusAndAnalyticsEffects$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = list;
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = focusRequester;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
