package p000;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zl0 extends LinkedHashMap {

    /* JADX INFO: renamed from: k */
    public static final zl0 f9859k;

    /* JADX INFO: renamed from: j */
    public boolean f9860j = true;

    static {
        zl0 zl0Var = new zl0();
        f9859k = zl0Var;
        zl0Var.f9860j = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m5936a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof ce0)) {
                return obj.hashCode();
            }
            dd0.m1164i();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = fe0.f2381a;
        int i = length;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final void m5937b() {
        if (this.f9860j) {
            return;
        }
        dd0.m1164i();
    }

    /* JADX INFO: renamed from: c */
    public final zl0 m5938c() {
        if (isEmpty()) {
            return new zl0();
        }
        zl0 zl0Var = new zl0(this);
        zl0Var.f9860j = true;
        return zl0Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m5937b();
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
        int iM5936a = 0;
        for (Map.Entry entry : entrySet()) {
            iM5936a += m5936a(entry.getValue()) ^ m5936a(entry.getKey());
        }
        return iM5936a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m5937b();
        Charset charset = fe0.f2381a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m5937b();
        for (Object obj : map.keySet()) {
            Charset charset = fe0.f2381a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m5937b();
        return super.remove(obj);
    }
}
