package com.adobe.marketing.mobile.aepcomposeui.components;

@kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$1", f = "ImageOnlyCard.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ImageOnlyCardKt$ImageOnlyCard$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageOnlyCardKt$ImageOnlyCard$1(com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver, com.adobe.marketing.mobile.aepcomposeui.ImageOnlyUI imageOnlyUI, kotlin.coroutines.Continuation<? super com.adobe.marketing.mobile.aepcomposeui.components.ImageOnlyCardKt$ImageOnlyCard$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = aepUIEventObserver;
        this.getHighSpeedVideoSizes = imageOnlyUI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.adobe.marketing.mobile.aepcomposeui.observers.AepUIEventObserver aepUIEventObserver = this.getHighSpeedVideoFpsRangesFor;
            if (aepUIEventObserver != null) {
                aepUIEventObserver.onEvent(new com.adobe.marketing.mobile.aepcomposeui.UIEvent.Display(this.getHighSpeedVideoSizes));
            }
            return kotlin.Unit.INSTANCE;
        }
        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
