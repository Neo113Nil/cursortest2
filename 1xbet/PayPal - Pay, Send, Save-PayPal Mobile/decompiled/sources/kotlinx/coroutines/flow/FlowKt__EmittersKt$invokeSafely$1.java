package kotlinx.coroutines.flow;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt", f = "Emitters.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE}, m = "invokeSafely$FlowKt__EmittersKt", n = {"cause"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class FlowKt__EmittersKt$invokeSafely$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = kotlinx.coroutines.flow.FlowKt__EmittersKt.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    FlowKt__EmittersKt$invokeSafely$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1> continuation) {
        super(continuation);
    }
}
