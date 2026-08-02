package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/CompositionObserverHolder;", "", "Landroidx/compose/runtime/tooling/CompositionObserver;", "observer", "", "root", "Landroidx/compose/runtime/CompositionContext;", "parent", "<init>", "(Landroidx/compose/runtime/tooling/CompositionObserver;ZLandroidx/compose/runtime/CompositionContext;)V", "current", "()Landroidx/compose/runtime/tooling/CompositionObserver;", "Landroidx/compose/runtime/tooling/CompositionObserver;", "getObserver", "setObserver", "(Landroidx/compose/runtime/tooling/CompositionObserver;)V", "Z", "getRoot", "()Z", "setRoot", "(Z)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/CompositionContext;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompositionObserverHolder {
    public static final int $stable = 8;
    private final androidx.compose.runtime.CompositionContext getHighSpeedVideoFpsRangesFor;
    private androidx.compose.runtime.tooling.CompositionObserver observer;
    private boolean root;

    public CompositionObserverHolder(androidx.compose.runtime.tooling.CompositionObserver compositionObserver, boolean z, androidx.compose.runtime.CompositionContext compositionContext) {
        this.observer = compositionObserver;
        this.root = z;
        this.getHighSpeedVideoFpsRangesFor = compositionContext;
    }

    public /* synthetic */ CompositionObserverHolder(androidx.compose.runtime.tooling.CompositionObserver compositionObserver, boolean z, androidx.compose.runtime.CompositionContext compositionContext, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : compositionObserver, (i & 2) != 0 ? false : z, compositionContext);
    }

    public final androidx.compose.runtime.tooling.CompositionObserver getObserver() {
        return this.observer;
    }

    public final void setObserver(androidx.compose.runtime.tooling.CompositionObserver compositionObserver) {
        this.observer = compositionObserver;
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final void setRoot(boolean z) {
        this.root = z;
    }

    public final androidx.compose.runtime.tooling.CompositionObserver current() {
        if (this.root) {
            return this.observer;
        }
        androidx.compose.runtime.CompositionObserverHolder observerHolder$runtime = this.getHighSpeedVideoFpsRangesFor.getObserverHolder$runtime();
        androidx.compose.runtime.tooling.CompositionObserver compositionObserver = observerHolder$runtime != null ? observerHolder$runtime.observer : null;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(compositionObserver, this.observer)) {
            this.observer = compositionObserver;
        }
        return compositionObserver;
    }
}
