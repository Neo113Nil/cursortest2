package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u0012R2\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0005X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\f8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "node", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "", "p0", "Camera2StreamConfigurationMap", "(I)I", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "currentKey", "()Ljava/lang/Object;", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "getHighSpeedVideoSizes", "[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "getPath", "()[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "pathLastIndex", com.visa.cbp.getEncExpo.warmup, "getPathLastIndex", "()I", "setPathLastIndex", "(I)V", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PersistentHashMapBaseIterator<K, V, T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor = true;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator<K, V, T>[] path;
    private int pathLastIndex;

    public PersistentHashMapBaseIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K, V> trieNode, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        this.path = trieNodeBaseIteratorArr;
        trieNodeBaseIteratorArr[0].reset(trieNode.getBuffer(), trieNode.entryCount$runtime() * 2);
        this.pathLastIndex = 0;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    protected final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator<K, V, T>[] getPath() {
        return this.path;
    }

    protected final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    protected final void setPathLastIndex(int i) {
        this.pathLastIndex = i;
    }

    private final int Camera2StreamConfigurationMap(int p0) {
        while (!this.path[p0].hasNextKey()) {
            if (!this.path[p0].hasNextNode()) {
                return -1;
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<? extends K, ? extends V> currentNode = this.path[p0].currentNode();
            if (p0 == 6) {
                this.path[p0 + 1].reset(currentNode.getBuffer(), currentNode.getBuffer().length);
            } else {
                this.path[p0 + 1].reset(currentNode.getBuffer(), currentNode.entryCount$runtime() * 2);
            }
            p0++;
        }
        return p0;
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.path[this.pathLastIndex].hasNextKey()) {
            return;
        }
        for (int i = this.pathLastIndex; i >= 0; i--) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            if (Camera2StreamConfigurationMap == -1 && this.path[i].hasNextNode()) {
                this.path[i].moveToNextNode();
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i);
            }
            if (Camera2StreamConfigurationMap != -1) {
                this.pathLastIndex = Camera2StreamConfigurationMap;
                return;
            }
            if (i > 0) {
                this.path[i - 1].moveToNextNode();
            }
            this.path[i].reset(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime().getBuffer(), 0);
        }
        this.getHighSpeedVideoFpsRangesFor = false;
    }

    protected final K currentKey() {
        getHighSpeedVideoSizes();
        return this.path[this.pathLastIndex].currentKey();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // java.util.Iterator
    public T next() {
        getHighSpeedVideoSizes();
        T next = this.path[this.pathLastIndex].next();
        getHighResolutionOutputSizeshNQ4ISI();
        return next;
    }

    private final void getHighSpeedVideoSizes() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
