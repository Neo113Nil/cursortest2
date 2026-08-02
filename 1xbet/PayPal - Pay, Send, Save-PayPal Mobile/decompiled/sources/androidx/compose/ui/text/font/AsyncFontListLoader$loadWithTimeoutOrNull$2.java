package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AsyncFontListLoader$loadWithTimeoutOrNull$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    final /* synthetic */ androidx.compose.ui.text.font.AsyncFontListLoader getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.ui.text.font.Font getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.text.font.PlatformFontLoader platformFontLoader;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        platformFontLoader = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoFpsRanges = 1;
        java.lang.Object awaitLoad = platformFontLoader.awaitLoad(this.getHighSpeedVideoFpsRangesFor, this);
        return awaitLoad == coroutine_suspended ? coroutine_suspended : awaitLoad;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$loadWithTimeoutOrNull$2(androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader, androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = asyncFontListLoader;
        this.getHighSpeedVideoFpsRangesFor = font;
    }
}
