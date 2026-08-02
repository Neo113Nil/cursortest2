package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "Landroidx/compose/runtime/RememberObserver;", "", "abandoning", "<init>", "(Ljava/util/Set;)V", "", "onRemembered", "()V", "onForgotten", "onAbandoned", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "pausedRemembers", "Landroidx/compose/runtime/collection/MutableVector;", "getPausedRemembers", "()Landroidx/compose/runtime/collection/MutableVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PausedCompositionRemembers implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<androidx.compose.runtime.RememberObserver> getHighSpeedVideoSizes;
    private final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> pausedRemembers = new androidx.compose.runtime.collection.MutableVector<>(new androidx.compose.runtime.RememberObserverHolder[16], 0);

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
    }

    public PausedCompositionRemembers(java.util.Set<androidx.compose.runtime.RememberObserver> set) {
        this.getHighSpeedVideoSizes = set;
    }

    public final androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> getPausedRemembers() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.RememberObserverHolder> mutableVector = this.pausedRemembers;
        androidx.compose.runtime.RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            androidx.compose.runtime.RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            this.getHighSpeedVideoSizes.remove(wrapped);
            wrapped.onRemembered();
        }
    }
}
