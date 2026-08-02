package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "", "index", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "previous", "()Ljava/lang/Object;", io.ktor.http.LinkHeader.Rel.Next, "", "getHighSpeedVideoFpsRanges", "()V", "element", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)V", "remove", "set", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersistentVectorMutableIterator<T> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<T> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<? extends T> getHighSpeedVideoFpsRanges;

    public PersistentVectorMutableIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<T> persistentVectorBuilder, int i) {
        super(i, persistentVectorBuilder.size());
        this.Camera2StreamConfigurationMap = persistentVectorBuilder;
        this.getHighResolutionOutputSizeshNQ4ISI = persistentVectorBuilder.getModCount$runtime();
        this.getHighSpeedVideoFpsRangesFor = -1;
        getHighSpeedVideoFpsRanges();
    }

    private final void getHighSpeedVideoFpsRanges() {
        java.lang.Object[] root = this.Camera2StreamConfigurationMap.getRoot();
        if (root == null) {
            this.getHighSpeedVideoFpsRanges = null;
            return;
        }
        int rootSize = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(this.Camera2StreamConfigurationMap.size());
        int coerceAtMost = kotlin.ranges.RangesKt.coerceAtMost(getIndex(), rootSize);
        int rootShift = (this.Camera2StreamConfigurationMap.getRootShift() / 5) + 1;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<? extends T> trieIterator = this.getHighSpeedVideoFpsRanges;
        if (trieIterator == null) {
            this.getHighSpeedVideoFpsRanges = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<>(root, coerceAtMost, rootSize, rootShift);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(trieIterator);
            trieIterator.reset$runtime(root, coerceAtMost, rootSize, rootShift);
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void add(T element) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == this.Camera2StreamConfigurationMap.getModCount$runtime()) {
            this.Camera2StreamConfigurationMap.add(getIndex(), element);
            setIndex(getIndex() + 1);
            setSize(this.Camera2StreamConfigurationMap.size());
            this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getModCount$runtime();
            this.getHighSpeedVideoFpsRangesFor = -1;
            getHighSpeedVideoFpsRanges();
            return;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final T next() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == this.Camera2StreamConfigurationMap.getModCount$runtime()) {
            checkHasNext$runtime();
            this.getHighSpeedVideoFpsRangesFor = getIndex();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<? extends T> trieIterator = this.getHighSpeedVideoFpsRanges;
            if (trieIterator == null) {
                java.lang.Object[] tail = this.Camera2StreamConfigurationMap.getTail();
                int index = getIndex();
                setIndex(index + 1);
                return (T) tail[index];
            }
            if (trieIterator.hasNext()) {
                setIndex(getIndex() + 1);
                return trieIterator.next();
            }
            java.lang.Object[] tail2 = this.Camera2StreamConfigurationMap.getTail();
            int index2 = getIndex();
            setIndex(index2 + 1);
            return (T) tail2[index2 - trieIterator.getSize()];
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // java.util.ListIterator
    public final T previous() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == this.Camera2StreamConfigurationMap.getModCount$runtime()) {
            checkHasPrevious$runtime();
            this.getHighSpeedVideoFpsRangesFor = getIndex() - 1;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator<? extends T> trieIterator = this.getHighSpeedVideoFpsRanges;
            if (trieIterator == null) {
                java.lang.Object[] tail = this.Camera2StreamConfigurationMap.getTail();
                setIndex(getIndex() - 1);
                return (T) tail[getIndex()];
            }
            if (getIndex() > trieIterator.getSize()) {
                java.lang.Object[] tail2 = this.Camera2StreamConfigurationMap.getTail();
                setIndex(getIndex() - 1);
                return (T) tail2[getIndex() - trieIterator.getSize()];
            }
            setIndex(getIndex() - 1);
            return trieIterator.previous();
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        if (this.getHighResolutionOutputSizeshNQ4ISI != this.Camera2StreamConfigurationMap.getModCount$runtime()) {
            throw new java.util.ConcurrentModificationException();
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != -1) {
            this.Camera2StreamConfigurationMap.remove(i);
            if (this.getHighSpeedVideoFpsRangesFor < getIndex()) {
                setIndex(this.getHighSpeedVideoFpsRangesFor);
            }
            setSize(this.Camera2StreamConfigurationMap.size());
            this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getModCount$runtime();
            this.getHighSpeedVideoFpsRangesFor = -1;
            getHighSpeedVideoFpsRanges();
            return;
        }
        throw new java.lang.IllegalStateException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator
    public final void set(T element) {
        if (this.getHighResolutionOutputSizeshNQ4ISI != this.Camera2StreamConfigurationMap.getModCount$runtime()) {
            throw new java.util.ConcurrentModificationException();
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i != -1) {
            this.Camera2StreamConfigurationMap.set(i, element);
            this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getModCount$runtime();
            getHighSpeedVideoFpsRanges();
            return;
        }
        throw new java.lang.IllegalStateException();
    }
}
