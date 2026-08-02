package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class G extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    public static final G f9112b;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9113a = true;

    static {
        G g3 = new G();
        f9112b = g3;
        g3.f9113a = false;
    }

    public final void a() {
        if (!this.f9113a) {
            throw new UnsupportedOperationException();
        }
    }

    public final G b() {
        if (isEmpty()) {
            return new G();
        }
        G g3 = new G(this);
        g3.f9113a = true;
        return g3;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005d  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this != map) {
            if (size() == map.size()) {
                for (Map.Entry entry : entrySet()) {
                    if (map.containsKey(entry.getKey())) {
                        Object value = entry.getValue();
                        Object obj2 = map.get(entry.getKey());
                        if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                        }
                    }
                }
            }
            z4 = false;
            return !z4;
        }
        z4 = true;
        if (!z4) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i7 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                Charset charset = AbstractC0698w.f9255a;
                hashCode = bArr.length;
                for (byte b7 : bArr) {
                    hashCode = (hashCode * 31) + b7;
                }
                if (hashCode == 0) {
                    hashCode = 1;
                }
            } else {
                hashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                Charset charset2 = AbstractC0698w.f9255a;
                hashCode2 = bArr2.length;
                for (byte b8 : bArr2) {
                    hashCode2 = (hashCode2 * 31) + b8;
                }
                if (hashCode2 == 0) {
                    hashCode2 = 1;
                }
            } else {
                hashCode2 = value.hashCode();
            }
            i7 += hashCode ^ hashCode2;
        }
        return i7;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        Charset charset = AbstractC0698w.f9255a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC0698w.f9255a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        return super.remove(obj);
    }
}
