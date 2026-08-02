package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$1", f = "SmallImageCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SmallImageCardKt$SmallImageCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.SmallImageUI Camera2StreamConfigurationMap;
    final /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SmallImageCardKt$SmallImageCard$1(com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver, com.adobe.marketing.mobile.aepcomposeui.SmallImageUI smallImageUI, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.aepcomposeui.components.SmallImageCardKt$SmallImageCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = aepUIEventObserver;
        this.Camera2StreamConfigurationMap = smallImageUI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver = this.getHighSpeedVideoFpsRanges;
            if (aepUIEventObserver != null) {
                aepUIEventObserver.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display(this.Camera2StreamConfigurationMap));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
