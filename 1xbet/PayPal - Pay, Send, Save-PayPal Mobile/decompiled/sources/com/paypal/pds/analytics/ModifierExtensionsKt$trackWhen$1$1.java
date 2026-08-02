package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1", f = "ModifierExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes3.dex */
final class ModifierExtensionsKt$trackWhen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.pds.analytics.AnalyticsLeafElement getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.pds.analytics.AnalyticsLeafState state = this.getHighSpeedVideoSizes.getState();
        kotlin.jvm.internal.Intrinsics.checkNotNull(state, "");
        final com.paypal.pds.analytics.AnalyticsLeafState.Condition condition = (com.paypal.pds.analytics.AnalyticsLeafState.Condition) state;
        if (!condition.getTracked() && this.getHighResolutionOutputSizeshNQ4ISI) {
            com.paypal.pds.analytics.AnalyticsLeafElement analyticsLeafElement = this.getHighSpeedVideoSizes;
            final java.lang.String str = this.Camera2StreamConfigurationMap;
            analyticsLeafElement.track(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    com.paypal.pds.analytics.AnalyticsEvent condition2;
                    condition2 = com.paypal.pds.analytics.AnalyticsEventKt.condition((com.paypal.pds.analytics.AnalyticsEventScope) obj2, str, condition.getInitialValue());
                    return condition2;
                }
            });
            this.getHighSpeedVideoSizes.setState(com.paypal.pds.analytics.AnalyticsLeafState.Condition.copy$default(condition, true, false, 2, null));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1(this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ModifierExtensionsKt$trackWhen$1$1(com.paypal.pds.analytics.AnalyticsLeafElement analyticsLeafElement, boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.pds.analytics.ModifierExtensionsKt$trackWhen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = analyticsLeafElement;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        this.Camera2StreamConfigurationMap = str;
    }
}
