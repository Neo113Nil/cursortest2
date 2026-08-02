package e0;

import f6.C1111d;
import g6.AbstractC1159h;
import g6.AbstractC1161j;
import g6.AbstractC1170s;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import w1.C1719l1;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map f12496a;

    /* renamed from: b, reason: collision with root package name */
    public final C1719l1 f12497b;

    public b(Map map, boolean z4) {
        t6.h.e(map, "preferencesMap");
        this.f12496a = map;
        C1719l1 c1719l1 = new C1719l1();
        c1719l1.f17771a = new AtomicBoolean(z4);
        this.f12497b = c1719l1;
    }

    public final Map a() {
        C1111d c1111d;
        Set<Map.Entry> entrySet = this.f12496a.entrySet();
        int K02 = AbstractC1170s.K0(AbstractC1161j.N0(entrySet));
        if (K02 < 16) {
            K02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(K02);
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                t6.h.d(copyOf, "copyOf(this, size)");
                c1111d = new C1111d(key, copyOf);
            } else {
                c1111d = new C1111d(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c1111d.f13000a, c1111d.f13001b);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        t6.h.d(unmodifiableMap, "unmodifiableMap(map)");
        return unmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f12497b.f17771a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        t6.h.e(eVar, "key");
        Object obj = this.f12496a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        t6.h.d(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void d(e eVar, Object obj) {
        b();
        Map map = this.f12496a;
        if (obj == null) {
            b();
            map.remove(eVar);
            return;
        }
        if (obj instanceof Set) {
            Set unmodifiableSet = Collections.unmodifiableSet(AbstractC1159h.e1((Set) obj));
            t6.h.d(unmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(eVar, unmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            t6.h.d(copyOf, "copyOf(this, size)");
            map.put(eVar, copyOf);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[LOOP:0: B:16:0x002d->B:31:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z4;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f12496a;
        Map map2 = this.f12496a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f12496a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        z4 = t6.h.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        z4 = true;
                    }
                    if (z4) {
                        return false;
                    }
                }
                z4 = false;
                if (z4) {
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f12496a.entrySet().iterator();
        int i7 = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            i7 += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i7;
    }

    public final String toString() {
        return AbstractC1159h.T0(this.f12496a.entrySet(), ",\n", "{\n", "\n}", C0993a.f12495a, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
