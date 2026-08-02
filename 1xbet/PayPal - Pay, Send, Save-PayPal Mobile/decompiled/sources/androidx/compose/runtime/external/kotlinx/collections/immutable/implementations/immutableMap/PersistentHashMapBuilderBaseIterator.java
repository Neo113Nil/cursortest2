package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00182\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u001e\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0016\u0010&\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "builder", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "path", "<init>", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "remove", "()V", "key", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "setValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "p0", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Ljava/lang/Object;I)V", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Object;", "", "Z", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PersistentHashMapBuilderBaseIterator<K, V, T> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator<K, V, T> implements java.util.Iterator<T>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;
    private K getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> getHighSpeedVideoFpsRanges;

    public PersistentHashMapBuilderBaseIterator(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder<K, V> persistentHashMapBuilder, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator<K, V, T>[] trieNodeBaseIteratorArr) {
        super(persistentHashMapBuilder.getNode$runtime(), trieNodeBaseIteratorArr);
        this.getHighSpeedVideoFpsRanges = persistentHashMapBuilder;
        this.Camera2StreamConfigurationMap = persistentHashMapBuilder.getModCount();
    }

    public final void setValue(K key, V newValue) {
        if (this.getHighSpeedVideoFpsRanges.containsKey(key)) {
            if (getGetHighSpeedVideoFpsRangesFor()) {
                K currentKey = currentKey();
                this.getHighSpeedVideoFpsRanges.put(key, newValue);
                getHighSpeedVideoFpsRangesFor(currentKey != null ? currentKey.hashCode() : 0, this.getHighSpeedVideoFpsRanges.getNode$runtime(), currentKey, 0);
            } else {
                this.getHighSpeedVideoFpsRanges.put(key, newValue);
            }
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getModCount();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<?, ?> p1, K p2, int p3) {
        while (true) {
            int i = p3 * 5;
            if (i > 30) {
                getPath()[p3].reset(p1.getBuffer(), p1.getBuffer().length, 0);
                while (!kotlin.jvm.internal.Intrinsics.areEqual(getPath()[p3].currentKey(), p2)) {
                    getPath()[p3].moveToNextKey();
                }
                setPathLastIndex(p3);
                return;
            }
            int indexSegment = 1 << androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeKt.indexSegment(p0, i);
            if (p1.hasEntryAt$runtime(indexSegment)) {
                getPath()[p3].reset(p1.getBuffer(), p1.entryCount$runtime() * 2, p1.entryKeyIndex$runtime(indexSegment));
                setPathLastIndex(p3);
                return;
            } else {
                int nodeIndex$runtime = p1.nodeIndex$runtime(indexSegment);
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<?, ?> nodeAtIndex$runtime = p1.nodeAtIndex$runtime(nodeIndex$runtime);
                getPath()[p3].reset(p1.getBuffer(), p1.entryCount$runtime() * 2, nodeIndex$runtime);
                p3++;
                p1 = nodeAtIndex$runtime;
            }
        }
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public T next() {
        if (this.getHighSpeedVideoFpsRanges.getModCount() == this.Camera2StreamConfigurationMap) {
            this.getHighResolutionOutputSizeshNQ4ISI = currentKey();
            this.getHighSpeedVideoSizes = true;
            return (T) super.next();
        }
        throw new java.util.ConcurrentModificationException();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator, java.util.Iterator
    public void remove() {
        if (this.getHighSpeedVideoSizes) {
            if (getGetHighSpeedVideoFpsRangesFor()) {
                K currentKey = currentKey();
                kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoFpsRanges).remove(this.getHighResolutionOutputSizeshNQ4ISI);
                getHighSpeedVideoFpsRangesFor(currentKey != null ? currentKey.hashCode() : 0, this.getHighSpeedVideoFpsRanges.getNode$runtime(), currentKey, 0);
            } else {
                kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.getHighSpeedVideoFpsRanges).remove(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoSizes = false;
            this.Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRanges.getModCount();
            return;
        }
        throw new java.lang.IllegalStateException();
    }
}
