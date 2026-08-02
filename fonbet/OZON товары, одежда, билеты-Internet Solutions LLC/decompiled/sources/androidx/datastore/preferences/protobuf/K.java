package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class K<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final K<?, ?> f42472b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f42473a = true;

    static {
        K<?, ?> k11 = new K<>();
        f42472b = k11;
        ((K) k11).f42473a = false;
    }

    private K() {
    }

    private static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof C5378y.a) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C5378y.f42629b;
        int length = bArr.length;
        for (byte b11 : bArr) {
            length = (length * 31) + b11;
        }
        if (length == 0) {
            return 1;
        }
        return length;
    }

    public static <K, V> K<K, V> e() {
        return (K<K, V>) f42472b;
    }

    private void h() {
        if (!this.f42473a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005d A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z11;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    for (Map.Entry<K, V> entry : entrySet()) {
                        if (map.containsKey(entry.getKey())) {
                            V value = entry.getValue();
                            Object obj2 = map.get(entry.getKey());
                            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                            }
                        }
                    }
                }
                z11 = false;
                if (!z11) {
                    return true;
                }
            }
            z11 = true;
            if (!z11) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i11 = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            i11 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i11;
    }

    public final boolean i() {
        return this.f42473a;
    }

    public final void j() {
        this.f42473a = false;
    }

    public final void l(K<K, V> k11) {
        h();
        if (k11.isEmpty()) {
            return;
        }
        putAll(k11);
    }

    public final K<K, V> m() {
        if (isEmpty()) {
            return new K<>();
        }
        K<K, V> k11 = new K<>(this);
        k11.f42473a = true;
        return k11;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k11, V v11) {
        h();
        byte[] bArr = C5378y.f42629b;
        k11.getClass();
        v11.getClass();
        return (V) super.put(k11, v11);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        h();
        for (K k11 : map.keySet()) {
            byte[] bArr = C5378y.f42629b;
            k11.getClass();
            map.get(k11).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        h();
        return (V) super.remove(obj);
    }
}
