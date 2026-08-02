package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rp1 extends LinkedHashMap {

    /* JADX INFO: renamed from: k */
    public static final rp1 f6937k;

    /* JADX INFO: renamed from: j */
    public boolean f6938j = true;

    static {
        rp1 rp1Var = new rp1();
        f6937k = rp1Var;
        rp1Var.f6938j = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m4393b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof bp1)) {
                return obj.hashCode();
            }
            dd0.m1164i();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iM2669a = ip1.m2669a(length, bArr, 0, length);
        if (iM2669a == 0) {
            return 1;
        }
        return iM2669a;
    }

    /* JADX INFO: renamed from: a */
    public final rp1 m4394a() {
        if (isEmpty()) {
            return new rp1();
        }
        rp1 rp1Var = new rp1(this);
        rp1Var.f6938j = true;
        return rp1Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m4395c() {
        if (this.f6938j) {
            return;
        }
        dd0.m1164i();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4395c();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM4393b = 0;
        for (Map.Entry entry : entrySet()) {
            iM4393b += m4393b(entry.getValue()) ^ m4393b(entry.getKey());
        }
        return iM4393b;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4395c();
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4395c();
        for (Object obj : map.keySet()) {
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4395c();
        return super.remove(obj);
    }
}
