package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u001cR*\u0010\f\u001a\u0004\u0018\u00018\u00008\u0007@\u0007X\u0086\u000e¢\u0006\u0018\n\u0004\b\f\u0010\u0019\u0012\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u001cR\"\u0010!\u001a\u00020 8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&"}, d2 = {"Landroidx/compose/runtime/snapshots/StateSetIterator;", "T", "", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "set", "", "iterator", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateSet;Ljava/util/Iterator;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "getSet", "()Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "current", "Ljava/lang/Object;", "getCurrent", "setCurrent", "(Ljava/lang/Object;)V", "getNext", "setNext", "getNext$annotations", "", "modification", com.visa.cbp.getEncExpo.warmup, "getModification", "()I", "setModification", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StateSetIterator<T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;
    private T current;
    private final java.util.Iterator<T> iterator;
    private int modification;
    private T next;
    private final androidx.compose.runtime.snapshots.SnapshotStateSet<T> set;

    public static /* synthetic */ void getNext$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(androidx.compose.runtime.snapshots.SnapshotStateSet<T> snapshotStateSet, java.util.Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = androidx.compose.runtime.snapshots.SnapshotStateSetKt.getModification(snapshotStateSet);
        getHighSpeedVideoSizes();
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateSet<T> getSet() {
        return this.set;
    }

    public final T getCurrent() {
        return this.current;
    }

    public final void setCurrent(T t) {
        this.current = t;
    }

    public final T getNext() {
        return this.next;
    }

    public final void setNext(T t) {
        this.next = t;
    }

    public final int getModification() {
        return this.modification;
    }

    public final void setModification(int i) {
        this.modification = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.next != null;
    }

    private final void getHighSpeedVideoSizes() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (androidx.compose.runtime.snapshots.SnapshotStateSetKt.getModification(this.set) == this.modification) {
            getHighSpeedVideoSizes();
            T t = this.current;
            if (t != null) {
                return t;
            }
            throw new java.lang.IllegalStateException();
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (androidx.compose.runtime.snapshots.SnapshotStateSetKt.getModification(this.set) == this.modification) {
            T t = this.current;
            if (t != null) {
                this.set.remove(t);
                this.current = null;
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                this.modification = androidx.compose.runtime.snapshots.SnapshotStateSetKt.getModification(this.set);
                return;
            }
            throw new java.lang.IllegalStateException();
        }
        throw new java.util.ConcurrentModificationException();
    }
}
