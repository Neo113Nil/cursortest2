package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0012R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u00148\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\u00078\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\f\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "node", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;)V", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "", "getHighSpeedVideoSizes", "()V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "currentElement", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "path", "Ljava/util/List;", "getPath", "()Ljava/util/List;", "pathLastIndex", com.visa.cbp.getEncExpo.warmup, "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "getHighSpeedVideoFpsRanges", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PersistentHashSetIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    private final java.util.List<androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E> trieNode) {
        java.util.List<androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator<E>> mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator());
        this.path = mutableListOf;
        this.getHighSpeedVideoSizes = true;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator.reset$default(mutableListOf.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        getHighSpeedVideoSizes();
    }

    protected final java.util.List<androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(int p0) {
        while (!this.path.get(p0).hasNextElement()) {
            if (!this.path.get(p0).hasNextNode()) {
                return -1;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<? extends E> currentNode = this.path.get(p0).currentNode();
            p0++;
            if (p0 == this.path.size()) {
                this.path.add(new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator<>());
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator.reset$default(this.path.get(p0), currentNode.getBuffer(), 0, 2, null);
        }
        return p0;
    }

    private final void getHighSpeedVideoSizes() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i = this.pathLastIndex; i >= 0; i--) {
            int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
            if (highResolutionOutputSizeshNQ4ISI == -1 && this.path.get(i).hasNextCell()) {
                this.path.get(i).moveToNextCell();
                highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(i);
            }
            if (highResolutionOutputSizeshNQ4ISI != -1) {
                this.pathLastIndex = highResolutionOutputSizeshNQ4ISI;
                return;
            }
            if (i > 0) {
                this.path.get(i - 1).moveToNextCell();
            }
            this.path.get(i).reset(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.INSTANCE.getEMPTY$runtime().getBuffer(), 0);
        }
        this.getHighSpeedVideoSizes = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.getHighSpeedVideoSizes) {
            throw new java.util.NoSuchElementException();
        }
        E nextElement = this.path.get(this.pathLastIndex).nextElement();
        getHighSpeedVideoSizes();
        return nextElement;
    }

    protected final E currentElement() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
