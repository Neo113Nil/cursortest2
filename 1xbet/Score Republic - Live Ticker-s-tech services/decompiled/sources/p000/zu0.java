package p000;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 extends m80 implements Map {

    /* JADX INFO: renamed from: p */
    public final HashMap f9963p;

    public zu0() {
        super(6);
        this.f9963p = new HashMap();
    }

    @Override // java.util.Map
    public final void clear() {
        this.f9963p.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f9963p.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f9963p.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f9963p.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f9963p.equals(obj);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final Object mo3068g() {
        return this.f9963p;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f9963p.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f9963p.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f9963p.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f9963p.keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f9963p.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f9963p.putAll(map);
    }

    /* JADX INFO: renamed from: q */
    public final double m6041q() {
        HashMap map = this.f9963p;
        if (map.isEmpty()) {
            return 0.0d;
        }
        Iterator it = map.values().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2++;
            if (((yu0) it.next()).m5837d()) {
                i++;
            }
        }
        return (((double) i) / ((double) i2)) * 100.0d;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f9963p.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f9963p.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f9963p.values();
    }
}
