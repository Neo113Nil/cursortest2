package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zq0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9907a;

    /* JADX INFO: renamed from: b */
    public final b90 f9908b;

    public zq0(LinkedHashMap linkedHashMap, boolean z) {
        this.f9907a = linkedHashMap;
        this.f9908b = new b90(z);
    }

    /* JADX INFO: renamed from: a */
    public final Map m6022a() {
        kv0 kv0Var;
        Set<Map.Entry> setEntrySet = this.f9907a.entrySet();
        int iM1881G = fm0.m1881G(AbstractC0545oi.m3692r(setEntrySet));
        if (iM1881G < 16) {
            iM1881G = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM1881G);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                kv0Var = new kv0(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                kv0Var = new kv0(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(kv0Var.f4582j, kv0Var.f4583k);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    /* JADX INFO: renamed from: b */
    public final void m6023b() {
        if (((AtomicBoolean) this.f9908b.f793k).get()) {
            C0270h1.m2191g("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6024c(rw0 rw0Var, Object obj) {
        rw0Var.getClass();
        m6025d(rw0Var, obj);
    }

    /* JADX INFO: renamed from: d */
    public final void m6025d(rw0 rw0Var, Object obj) {
        rw0Var.getClass();
        m6023b();
        LinkedHashMap linkedHashMap = this.f9907a;
        if (obj == null) {
            m6023b();
            linkedHashMap.remove(rw0Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(AbstractC0471mi.m3390x((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(rw0Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(rw0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(rw0Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zM187a;
        if (obj instanceof zq0) {
            LinkedHashMap linkedHashMap = ((zq0) obj).f9907a;
            LinkedHashMap linkedHashMap2 = this.f9907a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zM187a = af0.m187a(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zM187a = true;
                                } else {
                                    zM187a = false;
                                }
                            } else {
                                zM187a = false;
                            }
                            if (!zM187a) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f9907a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return AbstractC0471mi.m3387u(this.f9907a.entrySet(), ",\n", "{\n", "\n}", j00.f3762m, 24);
    }

    public /* synthetic */ zq0(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
