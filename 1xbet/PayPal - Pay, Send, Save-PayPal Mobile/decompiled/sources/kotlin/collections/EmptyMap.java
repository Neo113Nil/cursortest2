package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0015\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/collections/EmptyMap;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "<init>", "()V", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isEmpty", "()Z", "containsKey", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class EmptyMap implements java.util.Map, java.io.Serializable, kotlin.jvm.internal.markers.KMappedMarker {
    public static final kotlin.collections.EmptyMap INSTANCE = new kotlin.collections.EmptyMap();
    private static final long serialVersionUID = 8246714829545688274L;

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object p0) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    private EmptyMap() {
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter((java.lang.Void) obj, "");
        return false;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object p0) {
        return (p0 instanceof java.util.Map) && ((java.util.Map) p0).isEmpty();
    }

    public final java.lang.String toString() {
        return "{}";
    }

    private final java.lang.Object readResolve() {
        return INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry> entrySet() {
        return kotlin.collections.EmptySet.INSTANCE;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.lang.Object> keySet() {
        return kotlin.collections.EmptySet.INSTANCE;
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return kotlin.collections.EmptyList.INSTANCE;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
