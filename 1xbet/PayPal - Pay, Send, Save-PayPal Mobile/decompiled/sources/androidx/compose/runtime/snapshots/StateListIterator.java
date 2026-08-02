package androidx.compose.runtime.snapshots;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0014R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010\u001d\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/snapshots/StateListIterator;", "T", "", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "list", "", "offset", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V", "", "hasPrevious", "()Z", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)V", "hasNext", io.ktor.http.LinkHeader.Rel.Next, "remove", "()V", "set", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StateListIterator<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes = -1;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private final androidx.compose.runtime.snapshots.SnapshotStateList<T> list;

    public StateListIterator(androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList, int i) {
        this.list = snapshotStateList;
        this.getHighSpeedVideoFpsRangesFor = i - 1;
        this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(snapshotStateList);
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.getHighSpeedVideoFpsRangesFor >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.getHighSpeedVideoFpsRangesFor + 1;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public final void add(T element) {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list) == this.getHighSpeedVideoFpsRanges) {
            this.list.add(this.getHighSpeedVideoFpsRangesFor + 1, element);
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoFpsRangesFor++;
            this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list);
            return;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list) == this.getHighSpeedVideoFpsRanges) {
            int i = this.getHighSpeedVideoFpsRangesFor + 1;
            this.getHighSpeedVideoSizes = i;
            androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighResolutionOutputSizeshNQ4ISI(i, this.list.size());
            T t = this.list.get(i);
            this.getHighSpeedVideoFpsRangesFor = i;
            return t;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list) == this.getHighSpeedVideoFpsRanges) {
            androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.list.size());
            int i = this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRangesFor--;
            return this.list.get(i);
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list) == this.getHighSpeedVideoFpsRanges) {
            this.list.remove(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoFpsRangesFor--;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list);
            return;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final void set(T element) {
        if (androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list) == this.getHighSpeedVideoFpsRanges) {
            int i = this.getHighSpeedVideoSizes;
            if (i < 0) {
                androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighSpeedVideoFpsRangesFor();
                throw new kotlin.KotlinNothingValueException();
            }
            this.list.set(i, element);
            this.getHighSpeedVideoFpsRanges = androidx.compose.runtime.snapshots.SnapshotStateListKt.getStructure(this.list);
            return;
        }
        throw new java.util.ConcurrentModificationException();
    }
}
