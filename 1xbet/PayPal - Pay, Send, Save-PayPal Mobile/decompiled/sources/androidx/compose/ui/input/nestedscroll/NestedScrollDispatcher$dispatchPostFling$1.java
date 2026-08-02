package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SUBTRACT_VALUE, 224}, m = "dispatchPostFling-RZ2iAVY", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class NestedScrollDispatcher$dispatchPostFling$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.m7107dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollDispatcher$dispatchPostFling$1(androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher, kotlin.coroutines.Continuation<? super androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = nestedScrollDispatcher;
    }
}
