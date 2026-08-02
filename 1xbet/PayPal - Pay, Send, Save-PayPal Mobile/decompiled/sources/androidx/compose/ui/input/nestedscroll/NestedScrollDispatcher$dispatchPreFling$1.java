package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {199}, m = "dispatchPreFling-QWom1Mo", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class NestedScrollDispatcher$dispatchPreFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.m7109dispatchPreFlingQWom1Mo(0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPreFling$1(androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPreFling$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = nestedScrollDispatcher;
    }
}
