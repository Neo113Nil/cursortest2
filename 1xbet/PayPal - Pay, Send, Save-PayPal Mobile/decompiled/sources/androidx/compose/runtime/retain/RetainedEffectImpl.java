package androidx.compose.runtime.retain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u000bR%\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/retain/RetainedEffectImpl;", "Landroidx/compose/runtime/retain/RetainObserver;", "Lkotlin/Function1;", "Landroidx/compose/runtime/retain/RetainedEffectScope;", "Landroidx/compose/runtime/retain/RetainedEffectResult;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onRetained", "()V", "onRetired", "onEnteredComposition", "onExitedComposition", "onUnused", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/retain/RetainedEffectResult;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class RetainedEffectImpl implements androidx.compose.runtime.retain.RetainObserver {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.retain.RetainedEffectResult getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.runtime.retain.RetainedEffectScope, androidx.compose.runtime.retain.RetainedEffectResult> getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onEnteredComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onExitedComposition() {
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onUnused() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RetainedEffectImpl(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.retain.RetainedEffectScope, ? extends androidx.compose.runtime.retain.RetainedEffectResult> function1) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onRetained() {
        androidx.compose.runtime.retain.RetainedEffectScope retainedEffectScope;
        kotlin.jvm.functions.Function1<androidx.compose.runtime.retain.RetainedEffectScope, androidx.compose.runtime.retain.RetainedEffectResult> function1 = this.getHighResolutionOutputSizeshNQ4ISI;
        retainedEffectScope = androidx.compose.runtime.retain.RetainedEffectKt.getHighSpeedVideoFpsRangesFor;
        this.getHighSpeedVideoSizes = function1.invoke(retainedEffectScope);
    }

    @Override // androidx.compose.runtime.retain.RetainObserver
    public final void onRetired() {
        androidx.compose.runtime.retain.RetainedEffectResult retainedEffectResult = this.getHighSpeedVideoSizes;
        if (retainedEffectResult != null) {
            retainedEffectResult.retire();
        }
        this.getHighSpeedVideoSizes = null;
    }
}
