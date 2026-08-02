package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0013\u001a\u00020!8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\"R\"\u0010#\u001a\u00020!8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "nextKey", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "builder", "<init>", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "", "remove", "()V", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "getBuilder$runtime", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "lastIteratedKey", "getLastIteratedKey$runtime", "()Ljava/lang/Object;", "setLastIteratedKey$runtime", "(Ljava/lang/Object;)V", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoFpsRanges", "", com.visa.cbp.getEncExpo.warmup, "index", "getIndex$runtime", "()I", "setIndex$runtime", "(I)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class PersistentOrderedMapBuilderLinksIterator<K, V> implements java.util.Iterator<androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V>>, kotlin.jvm.internal.markers.KMutableIterator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> builder;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private java.lang.Object Camera2StreamConfigurationMap;
    private int index;
    private java.lang.Object lastIteratedKey = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain.INSTANCE;

    public PersistentOrderedMapBuilderLinksIterator(java.lang.Object obj, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> persistentOrderedMapBuilder) {
        this.Camera2StreamConfigurationMap = obj;
        this.builder = persistentOrderedMapBuilder;
        this.getHighSpeedVideoSizes = persistentOrderedMapBuilder.getHashMapBuilder$runtime().getModCount();
    }

    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.PersistentOrderedMapBuilder<K, V> getBuilder$runtime() {
        return this.builder;
    }

    /* renamed from: getLastIteratedKey$runtime, reason: from getter */
    public final java.lang.Object getLastIteratedKey() {
        return this.lastIteratedKey;
    }

    public final void setLastIteratedKey$runtime(java.lang.Object obj) {
        this.lastIteratedKey = obj;
    }

    /* renamed from: getIndex$runtime, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final void setIndex$runtime(int i) {
        this.index = i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    @Override // java.util.Iterator
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> next() {
        if (this.builder.getHashMapBuilder$runtime().getModCount() != this.getHighSpeedVideoSizes) {
            throw new java.util.ConcurrentModificationException();
        }
        if (hasNext()) {
            this.lastIteratedKey = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = true;
            this.index++;
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue = this.builder.getHashMapBuilder$runtime().get(this.Camera2StreamConfigurationMap);
            if (linkedValue == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Hash code of a key (");
                sb.append(this.Camera2StreamConfigurationMap);
                sb.append(") has changed after it was added to the persistent map.");
                throw new java.util.ConcurrentModificationException(sb.toString());
            }
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.LinkedValue<V> linkedValue2 = linkedValue;
            this.Camera2StreamConfigurationMap = linkedValue2.getNext();
            return linkedValue2;
        }
        throw new java.util.NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.getHighSpeedVideoFpsRanges) {
            kotlin.jvm.internal.TypeIntrinsics.asMutableMap(this.builder).remove(this.lastIteratedKey);
            this.lastIteratedKey = null;
            this.getHighSpeedVideoFpsRanges = false;
            this.getHighSpeedVideoSizes = this.builder.getHashMapBuilder$runtime().getModCount();
            this.index--;
            return;
        }
        throw new java.lang.IllegalStateException();
    }
}
