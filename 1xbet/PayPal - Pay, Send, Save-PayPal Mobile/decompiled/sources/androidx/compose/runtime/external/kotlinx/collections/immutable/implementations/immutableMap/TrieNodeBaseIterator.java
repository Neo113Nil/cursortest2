package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\r2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0006J\r\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0019\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u0011H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u0013R4\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0005@BX\u0084\u000e¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\"\u0010\f\u001a\u00020\n8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "<init>", "()V", "", "", "buffer", "", "dataSize", "index", "", "reset", "([Ljava/lang/Object;II)V", "([Ljava/lang/Object;I)V", "", "hasNextKey", "()Z", "currentKey", "()Ljava/lang/Object;", "moveToNextKey", "hasNextNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "currentNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "moveToNextNode", "hasNext", "p0", "[Ljava/lang/Object;", "getBuffer", "()[Ljava/lang/Object;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getIndex", "()I", "setIndex", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Object[] buffer = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode.INSTANCE.getEMPTY$runtime().getBuffer();
    private int index;

    protected final java.lang.Object[] getBuffer() {
        return this.buffer;
    }

    protected final int getIndex() {
        return this.index;
    }

    protected final void setIndex(int i) {
        this.index = i;
    }

    public final void reset(java.lang.Object[] buffer, int dataSize, int index) {
        this.buffer = buffer;
        this.getHighResolutionOutputSizeshNQ4ISI = dataSize;
        this.index = index;
    }

    public final void reset(java.lang.Object[] buffer, int dataSize) {
        reset(buffer, dataSize, 0);
    }

    public final boolean hasNextKey() {
        return this.index < this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final K currentKey() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final void moveToNextKey() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNextKey());
        this.index += 2;
    }

    public final boolean hasNextNode() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(this.index >= this.getHighResolutionOutputSizeshNQ4ISI);
        return this.index < this.buffer.length;
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<? extends K, ? extends V> currentNode() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNextNode());
        java.lang.Object obj = this.buffer[this.index];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        return (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode) obj;
    }

    public final void moveToNextNode() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
