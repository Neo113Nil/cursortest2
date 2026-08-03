package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I extends java.util.LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.I f2234b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2235a = true;

    static {
        androidx.datastore.preferences.protobuf.I i2 = new androidx.datastore.preferences.protobuf.I();
        f2234b = i2;
        i2.f2235a = false;
    }

    public final void a() {
        if (!this.f2235a) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final androidx.datastore.preferences.protobuf.I b() {
        if (isEmpty()) {
            return new androidx.datastore.preferences.protobuf.I();
        }
        androidx.datastore.preferences.protobuf.I i2 = new androidx.datastore.preferences.protobuf.I(this);
        i2.f2235a = true;
        return i2;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
        return isEmpty() ? java.util.Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(java.lang.Object obj) {
        boolean z2;
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (java.util.Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        java.lang.Object value = entry.getValue();
                        java.lang.Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? java.util.Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
            }
            z2 = false;
            return !z2;
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i2 = 0;
        for (java.util.Map.Entry entry : entrySet()) {
            java.lang.Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
                hashCode = bArr.length;
                for (byte b2 : bArr) {
                    hashCode = (hashCode * 31) + b2;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            java.lang.Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                java.nio.charset.Charset charset2 = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
                hashCode2 = bArr2.length;
                for (byte b3 : bArr2) {
                    hashCode2 = (hashCode2 * 31) + b3;
                }
                if (hashCode2 == 0) {
                    hashCode2 = 1;
                }
            } else {
                hashCode2 = value.hashCode();
            }
            i2 += hashCode ^ hashCode2;
        }
        return i2;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object obj, java.lang.Object obj2) {
        a();
        java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        a();
        for (java.lang.Object obj : map.keySet()) {
            java.nio.charset.Charset charset = androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object obj) {
        a();
        return super.remove(obj);
    }
}
