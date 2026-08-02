package androidx.compose.runtime.snapshots;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\u0007\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList$listIterator$1;", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", io.ktor.http.LinkHeader.Rel.Next, "remove", "()Ljava/lang/Void;", "set"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubList$listIterator$1<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.snapshots.SubList<T> getHighSpeedVideoSizes;

    SubList$listIterator$1(kotlin.jvm.internal.Ref.IntRef intRef, androidx.compose.runtime.snapshots.SubList<T> subList) {
        this.Camera2StreamConfigurationMap = intRef;
        this.getHighSpeedVideoSizes = subList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
        add((androidx.compose.runtime.snapshots.SubList$listIterator$1<T>) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj) {
        set((androidx.compose.runtime.snapshots.SubList$listIterator$1<T>) obj);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.Camera2StreamConfigurationMap.element >= 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.Camera2StreamConfigurationMap.element + 1;
    }

    @Override // java.util.ListIterator
    public final T previous() {
        int i = this.Camera2StreamConfigurationMap.element;
        androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighResolutionOutputSizeshNQ4ISI(i, this.getHighSpeedVideoSizes.size());
        this.Camera2StreamConfigurationMap.element = i - 1;
        return this.getHighSpeedVideoSizes.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.Camera2StreamConfigurationMap.element;
    }

    @Override // java.util.ListIterator
    public final java.lang.Void add(T element) {
        androidx.compose.runtime.snapshots.SnapshotStateListKt.Camera2StreamConfigurationMap();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap.element < this.getHighSpeedVideoSizes.size() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        int i = this.Camera2StreamConfigurationMap.element + 1;
        androidx.compose.runtime.snapshots.SnapshotStateListKt.getHighResolutionOutputSizeshNQ4ISI(i, this.getHighSpeedVideoSizes.size());
        this.Camera2StreamConfigurationMap.element = i;
        return this.getHighSpeedVideoSizes.get(i);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Void remove() {
        androidx.compose.runtime.snapshots.SnapshotStateListKt.Camera2StreamConfigurationMap();
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // java.util.ListIterator
    public final java.lang.Void set(T element) {
        androidx.compose.runtime.snapshots.SnapshotStateListKt.Camera2StreamConfigurationMap();
        throw new kotlin.KotlinNothingValueException();
    }
}
