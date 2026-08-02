package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\"\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u00002\u0006\u0010!\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010%\u001a\u00020$8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010("}, d2 = {"Lkotlinx/serialization/internal/HashMapSerializer;", "K", "V", "Lkotlinx/serialization/internal/MapLikeSerializer;", "", "Ljava/util/HashMap;", "Lkotlin/collections/getHighSpeedVideoFpsRangesFor;", "Lkotlinx/serialization/KSerializer;", "kSerializer", "vSerializer", "<init>", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "", "collectionSize", "(Ljava/util/Map;)I", "", "", "collectionIterator", "(Ljava/util/Map;)Ljava/util/Iterator;", "builder", "()Ljava/util/HashMap;", "builderSize", "(Ljava/util/HashMap;)I", "toResult", "(Ljava/util/HashMap;)Ljava/util/Map;", "toBuilder", "(Ljava/util/Map;)Ljava/util/HashMap;", io.ktor.http.ContentDisposition.Parameters.Size, "", "checkCapacity", "(Ljava/util/HashMap;I)V", "index", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "insertKeyValuePair", "(Ljava/util/HashMap;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HashMapSerializer<K, V> extends kotlinx.serialization.internal.MapLikeSerializer<K, V, java.util.Map<K, ? extends V>, java.util.HashMap<K, V>> {
    private final kotlinx.serialization.descriptors.SerialDescriptor descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HashMapSerializer(kotlinx.serialization.KSerializer<K> kSerializer, kotlinx.serialization.KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kSerializer2, "");
        this.descriptor = new kotlinx.serialization.internal.HashMapClassDesc(kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.internal.MapLikeSerializer
    public final /* bridge */ /* synthetic */ void insertKeyValuePair(java.util.Map map, int i, java.lang.Object obj, java.lang.Object obj2) {
        insertKeyValuePair((java.util.HashMap<int, java.lang.Object>) map, i, (int) obj, obj2);
    }

    @Override // kotlinx.serialization.internal.MapLikeSerializer, kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int collectionSize(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.Iterator<java.util.Map.Entry<K, V>> collectionIterator(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        return map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.HashMap<K, V> builder() {
        return new java.util.HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final int builderSize(java.util.HashMap<K, V> hashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.Map<K, V> toResult(java.util.HashMap<K, V> hashMap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "");
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final java.util.HashMap<K, V> toBuilder(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.util.HashMap<K, V> hashMap = map instanceof java.util.HashMap ? (java.util.HashMap) map : null;
        return hashMap == null ? new java.util.HashMap<>(map) : hashMap;
    }

    protected final void insertKeyValuePair(java.util.HashMap<K, V> hashMap, int i, K k, V v) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "");
        hashMap.put(k, v);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.AbstractCollectionSerializer
    public final void checkCapacity(java.util.HashMap<K, V> hashMap, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashMap, "");
    }
}
