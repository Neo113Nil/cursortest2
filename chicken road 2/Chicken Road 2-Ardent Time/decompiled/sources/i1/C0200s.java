package i1;

/* renamed from: i1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200s implements java.util.Map, java.io.Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final i1.C0200s f3326a = new i1.C0200s();

    @Override // java.util.Map
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(java.lang.Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Void)) {
            return false;
        }
        java.lang.Void value = (java.lang.Void) obj;
        kotlin.jvm.internal.i.e(value, "value");
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set entrySet() {
        return i1.C0201t.f3327a;
    }

    @Override // java.util.Map
    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof java.util.Map) && ((java.util.Map) obj).isEmpty();
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
    public final /* bridge */ java.util.Set keySet() {
        return i1.C0201t.f3327a;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map map) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final java.lang.String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection values() {
        return i1.C0199r.f3325a;
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object obj, java.lang.Object obj2) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
