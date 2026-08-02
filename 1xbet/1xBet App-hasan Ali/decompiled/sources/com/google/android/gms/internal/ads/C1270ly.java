package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.ly, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1270ly extends AbstractC0952et implements Map {

    /* renamed from: m, reason: collision with root package name */
    public final Map f14448m;

    public C1270ly(Map map) {
        super(7);
        this.f14448m = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14448m.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f14448m.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Iterator it = ((Gv) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return AbstractC0952et.L(this.f14448m.entrySet(), new Ux(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && AbstractC0952et.K(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f14448m.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC0952et.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f14448m;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0952et
    public final /* synthetic */ Object j() {
        return this.f14448m;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return AbstractC0952et.L(this.f14448m.keySet(), new Ux(1));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f14448m.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f14448m.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f14448m.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f14448m;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f14448m.values();
    }
}
