package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "builder", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "", "Z", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersistentHashSetMutableIterator<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<E> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private E Camera2StreamConfigurationMap;
    private int getHighSpeedVideoSizes;

    public PersistentHashSetMutableIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder<E> persistentHashSetBuilder) {
        super(persistentHashSetBuilder.getNode$runtime());
        this.getHighSpeedVideoFpsRanges = persistentHashSetBuilder;
        this.getHighSpeedVideoSizes = persistentHashSetBuilder.getModCount();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final E next() {
        if (this.getHighSpeedVideoFpsRanges.getModCount() == this.getHighSpeedVideoSizes) {
            E e = (E) super.next();
            this.Camera2StreamConfigurationMap = e;
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            return e;
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator, java.util.Iterator
    public final void remove() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            if (getGetHighSpeedVideoSizes()) {
                E currentElement = currentElement();
                kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRanges).remove(this.Camera2StreamConfigurationMap);
                int hashCode = currentElement != null ? currentElement.hashCode() : 0;
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> node$runtime = this.getHighSpeedVideoFpsRanges.getNode$runtime();
                int i = 0;
                while (true) {
                    if (node$runtime.getBitmap() == 0) {
                        int indexOf = kotlin.collections.ArraysKt.indexOf((E[]) node$runtime.getBuffer(), currentElement);
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(indexOf != -1);
                        getPath().get(i).reset(node$runtime.getBuffer(), indexOf);
                    } else {
                        int indexOfCellAt$runtime = node$runtime.indexOfCellAt$runtime(1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.indexSegment(hashCode, i * 5));
                        getPath().get(i).reset(node$runtime.getBuffer(), indexOfCellAt$runtime);
                        java.lang.Object obj = node$runtime.getBuffer()[indexOfCellAt$runtime];
                        if (!(obj instanceof androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode)) {
                            break;
                        }
                        node$runtime = (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode) obj;
                        i++;
                    }
                }
                setPathLastIndex(i);
            } else {
                kotlin.jvm.internal.TypeIntrinsics.asMutableCollection(this.getHighSpeedVideoFpsRanges).remove(this.Camera2StreamConfigurationMap);
            }
            this.Camera2StreamConfigurationMap = null;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges.getModCount();
            return;
        }
        throw new java.lang.IllegalStateException();
    }
}
