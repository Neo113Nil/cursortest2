package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000bR%\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/DisposableEffectImpl;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/Function1;", "Landroidx/compose/runtime/DisposableEffectScope;", "Landroidx/compose/runtime/DisposableEffectResult;", "Lkotlin/ExtensionFunctionType;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/DisposableEffectResult;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DisposableEffectImpl implements androidx.compose.runtime.RememberObserver {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.runtime.DisposableEffectResult getHighSpeedVideoSizes;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DisposableEffectImpl(kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult> function1) {
        this.getHighSpeedVideoFpsRangesFor = function1;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        androidx.compose.runtime.DisposableEffectScope disposableEffectScope;
        kotlin.jvm.functions.Function1<androidx.compose.runtime.DisposableEffectScope, androidx.compose.runtime.DisposableEffectResult> function1 = this.getHighSpeedVideoFpsRangesFor;
        disposableEffectScope = androidx.compose.runtime.EffectsKt.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoSizes = function1.invoke(disposableEffectScope);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        androidx.compose.runtime.DisposableEffectResult disposableEffectResult = this.getHighSpeedVideoSizes;
        if (disposableEffectResult != null) {
            disposableEffectResult.dispose();
        }
        this.getHighSpeedVideoSizes = null;
    }
}
