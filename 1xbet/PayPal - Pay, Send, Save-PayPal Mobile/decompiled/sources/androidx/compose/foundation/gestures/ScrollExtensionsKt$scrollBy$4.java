package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/Scroll2DScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4", f = "ScrollExtensions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollExtensionsKt$scrollBy$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.Scroll2DScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope = (androidx.compose.foundation.gestures.Scroll2DScope) this.Camera2StreamConfigurationMap;
        this.getHighResolutionOutputSizeshNQ4ISI.element = scroll2DScope.mo1438scrollByMKHz9U(this.getHighSpeedVideoSizes);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.Scroll2DScope scroll2DScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4) create(scroll2DScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4 scrollExtensionsKt$scrollBy$4 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        scrollExtensionsKt$scrollBy$4.Camera2StreamConfigurationMap = obj;
        return scrollExtensionsKt$scrollBy$4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$scrollBy$4(kotlin.jvm.internal.Ref.LongRef longRef, long j, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$4> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = longRef;
        this.getHighSpeedVideoSizes = j;
    }
}
