package androidx.compose.runtime.collection;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* compiled from: IdentityArrayMap.kt */
@kotlin.Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0012H\u0016R&\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"androidx/compose/runtime/collection/IdentityArrayMap$asMap$1", "", com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "getEntries", "()Ljava/util/Set;", com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", com.ironsource.X3.i.W, "(Ljava/lang/Object;)Z", "containsValue", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IdentityArrayMap$asMap$1<Key, Value> implements java.util.Map<Key, Value>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> this$0;

    @Override // java.util.Map
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value compute(Key key, java.util.function.BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value computeIfAbsent(Key key, java.util.function.Function<? super Key, ? extends Value> function) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value computeIfPresent(Key key, java.util.function.BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value merge(Key key, Value value, java.util.function.BiFunction<? super Value, ? super Value, ? extends Value> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value put(Key key, Value value) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends Key, ? extends Value> map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value putIfAbsent(Key key, Value value) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Value replace(Key key, Value value) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean replace(Key key, Value value, Value value2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(java.util.function.BiFunction<? super Key, ? super Value, ? extends Value> biFunction) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    IdentityArrayMap$asMap$1(androidx.compose.runtime.collection.IdentityArrayMap<Key, Value> identityArrayMap) {
        this.this$0 = identityArrayMap;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<Key, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<Key> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<Value> values() {
        return getValues();
    }

    public java.util.Set<java.util.Map.Entry<Key, Value>> getEntries() {
        return new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$entries$1(this.this$0);
    }

    public java.util.Set<Key> getKeys() {
        return new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$keys$1(this.this$0);
    }

    public int getSize() {
        return this.this$0.getSize();
    }

    public java.util.Collection<Value> getValues() {
        return new androidx.compose.runtime.collection.IdentityArrayMap$asMap$1$values$1(this.this$0);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Map
    public Value get(java.lang.Object key) {
        if (key == null) {
            return null;
        }
        return this.this$0.get(key);
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object value) {
        return kotlin.collections.ArraysKt.contains(this.this$0.getValues(), value);
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object key) {
        return (key == null || this.this$0.get(key) == null) ? false : true;
    }
}
