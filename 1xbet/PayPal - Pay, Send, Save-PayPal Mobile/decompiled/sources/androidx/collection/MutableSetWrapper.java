package androidx.collection;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\nJ\u001d\u0010\u0015\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\rJ\u001d\u0010\u0016\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\rR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/collection/MutableSetWrapper;", "E", "Landroidx/collection/SetWrapper;", "", "Landroidx/collection/MutableScatterSet;", "p0", "<init>", "(Landroidx/collection/MutableScatterSet;)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "remove", "removeAll", "retainAll", "getHighSpeedVideoFpsRangesFor", "Landroidx/collection/MutableScatterSet;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MutableSetWrapper<E> extends androidx.collection.SetWrapper<E> implements java.util.Set<E>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.collection.MutableScatterSet<E> Camera2StreamConfigurationMap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableSetWrapper(androidx.collection.MutableScatterSet<E> mutableScatterSet) {
        super(mutableScatterSet);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableScatterSet, "");
        this.Camera2StreamConfigurationMap = mutableScatterSet;
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean add(E p0) {
        return this.Camera2StreamConfigurationMap.add(p0);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.Camera2StreamConfigurationMap.addAll(p0);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return new androidx.collection.MutableSetWrapper$iterator$1(this);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object p0) {
        return this.Camera2StreamConfigurationMap.remove(p0);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.Camera2StreamConfigurationMap.retainAll(p0);
    }

    @Override // androidx.collection.SetWrapper, java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.Camera2StreamConfigurationMap.removeAll(p0);
    }
}
