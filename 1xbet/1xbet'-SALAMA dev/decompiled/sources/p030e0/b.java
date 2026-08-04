package p030e0;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p044f6.d;
import p050g6.j;
import p050g6.s;
import p155w1.C1010l1;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f12502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1010l1 f12503b;

    public b(Map map, boolean z4) {
        h.e(map, "preferencesMap");
        this.f12502a = map;
        C1010l1 c1010l1 = new C1010l1();
        c1010l1.f17777a = new AtomicBoolean(z4);
        this.f12503b = c1010l1;
    }

    public final Map a() {
        d dVar;
        Set<Map.Entry> setEntrySet = this.f12502a.entrySet();
        int iK0 = s.K0(j.N0(setEntrySet));
        if (iK0 < 16) {
            iK0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iK0);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                h.d(bArrCopyOf, "copyOf(this, size)");
                dVar = new d(key, bArrCopyOf);
            } else {
                dVar = new d(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(dVar.f13006a, dVar.f13007b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        h.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.f12503b.f17777a).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(e eVar) {
        h.e(eVar, "key");
        Object obj = this.f12502a.get(eVar);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        h.d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    public final void d(e eVar, Object obj) {
        b();
        Map map = this.f12502a;
        if (obj == null) {
            b();
            map.remove(eVar);
            return;
        }
        if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(p050g6.h.e1((Set) obj));
            h.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
            map.put(eVar, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                map.put(eVar, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            h.d(bArrCopyOf, "copyOf(this, size)");
            map.put(eVar, bArrCopyOf);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    public final boolean equals(Object obj) {
        boolean zA;
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        Map map = bVar.f12502a;
        Map map2 = this.f12502a;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        Map map3 = bVar.f12502a;
        if (!map3.isEmpty()) {
            for (Map.Entry entry : map3.entrySet()) {
                Object obj2 = map2.get(entry.getKey());
                if (obj2 != null) {
                    Object value = entry.getValue();
                    if (!(value instanceof byte[])) {
                        zA = h.a(value, obj2);
                    } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                        zA = true;
                    } else {
                        zA = false;
                    }
                } else {
                    zA = false;
                }
                if (!zA) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        Iterator it = this.f12502a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return p050g6.h.T0(this.f12502a.entrySet(), ",\n", "{\n", "\n}", a.f12501a, 24);
    }

    public /* synthetic */ b(boolean z4) {
        this(new LinkedHashMap(), z4);
    }
}
