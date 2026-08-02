package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000ej\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f`\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R+\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CursorAnimationState;", "", "", "animate", "<init>", "(Z)V", "", "snapToVisibleAndAnimate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelAndHide", "()V", "Z", "getAnimate", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lkotlinx/coroutines/Job;", "Landroidx/compose/foundation/getHighSpeedVideoFpsRangesFor;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicReference;", "getHighSpeedVideoFpsRangesFor", "", "<set-?>", "cursorAlpha$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getCursorAlpha", "()F", "setCursorAlpha", "(F)V", "cursorAlpha"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CursorAnimationState {
    public static final int $stable = 8;
    private final boolean animate;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.concurrent.atomic.AtomicReference<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor = new java.util.concurrent.atomic.AtomicReference<>(null);

    /* renamed from: cursorAlpha$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState cursorAlpha = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    public CursorAnimationState(boolean z) {
        this.animate = z;
    }

    public final boolean getAnimate() {
        return this.animate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCursorAlpha(float f) {
        this.cursorAlpha.setFloatValue(f);
    }

    public final float getCursorAlpha() {
        return this.cursorAlpha.getFloatValue();
    }

    public final java.lang.Object snapToVisibleAndAnimate(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutineScope = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(new androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2(this, null), continuation);
        return coroutineScope == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutineScope : kotlin.Unit.INSTANCE;
    }

    public final void cancelAndHide() {
        kotlinx.coroutines.Job andSet = this.getHighSpeedVideoFpsRangesFor.getAndSet(null);
        if (andSet != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(andSet, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}
