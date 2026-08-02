package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "", "Z", "", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentOrderedSetMutableIterator<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private E getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder<E> getHighResolutionOutputSizeshNQ4ISI;

    public PersistentOrderedSetMutableIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetBuilder<E> persistentOrderedSetBuilder) {
        super(persistentOrderedSetBuilder.getFirstElement(), persistentOrderedSetBuilder.getHashMapBuilder$runtime());
        this.getHighResolutionOutputSizeshNQ4ISI = persistentOrderedSetBuilder;
        this.Camera2StreamConfigurationMap = persistentOrderedSetBuilder.getHashMapBuilder$runtime().getModCount();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public final E next() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getHashMapBuilder$runtime().getModCount() == this.Camera2StreamConfigurationMap) {
            E e = (E) super.next();
            this.getHighSpeedVideoFpsRangesFor = e;
            this.getHighSpeedVideoFpsRanges = true;
            return e;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator, java.util.Iterator
    public final void remove() {
        if (this.getHighSpeedVideoFpsRanges) {
            kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighResolutionOutputSizeshNQ4ISI).remove(this.getHighSpeedVideoFpsRangesFor);
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = false;
            this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.getHashMapBuilder$runtime().getModCount();
            setIndex$runtime(getIndex() - 1);
            return;
        }
        throw new java.lang.IllegalStateException();
    }
}
