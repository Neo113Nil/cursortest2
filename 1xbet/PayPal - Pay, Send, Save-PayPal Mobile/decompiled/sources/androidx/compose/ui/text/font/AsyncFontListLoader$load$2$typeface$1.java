package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {282}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class AsyncFontListLoader$load$2$typeface$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super java.lang.Object>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.text.font.Font getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.text.font.AsyncFontListLoader getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighResolutionOutputSizeshNQ4ISI = 1;
        java.lang.Object loadWithTimeoutOrNull$ui_text = this.getHighSpeedVideoSizes.loadWithTimeoutOrNull$ui_text(this.getHighSpeedVideoFpsRangesFor, this);
        return loadWithTimeoutOrNull$ui_text == coroutine_suspended ? coroutine_suspended : loadWithTimeoutOrNull$ui_text;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Object> continuation) {
        return ((androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(androidx.compose.ui.text.font.AsyncFontListLoader asyncFontListLoader, androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<? super androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoSizes = asyncFontListLoader;
        this.getHighSpeedVideoFpsRangesFor = font;
    }
}
