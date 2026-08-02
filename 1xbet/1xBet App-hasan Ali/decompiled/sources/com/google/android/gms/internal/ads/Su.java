package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Su extends AbstractSet {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Uu f11599l;

    public /* synthetic */ Su(Uu uu, int i) {
        this.f11598k = i;
        this.f11599l = uu;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f11598k) {
            case 0:
                this.f11599l.clear();
                break;
            default:
                this.f11599l.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f11598k) {
            case 0:
                Uu uu = this.f11599l;
                Map d5 = uu.d();
                if (d5 != null) {
                    return d5.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int h3 = uu.h(entry.getKey());
                    if (h3 != -1 && AbstractC1400ot.q(uu.c()[h3], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return this.f11599l.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f11598k) {
            case 0:
                Uu uu = this.f11599l;
                Map d5 = uu.d();
                return d5 != null ? d5.entrySet().iterator() : new Ru(uu, 1);
            default:
                Uu uu2 = this.f11599l;
                Map d6 = uu2.d();
                return d6 != null ? d6.keySet().iterator() : new Ru(uu2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f11598k) {
            case 0:
                Uu uu = this.f11599l;
                Map d5 = uu.d();
                if (d5 != null) {
                    return d5.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!uu.f()) {
                        int g5 = uu.g();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = uu.f11833k;
                        Objects.requireNonNull(obj2);
                        int w5 = AbstractC1400ot.w(key, value, g5, obj2, uu.a(), uu.b(), uu.c());
                        if (w5 != -1) {
                            uu.e(w5, g5);
                            uu.f11838p--;
                            uu.f11837o += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                Uu uu2 = this.f11599l;
                Map d6 = uu2.d();
                return d6 != null ? d6.keySet().remove(obj) : uu2.j(obj) != Uu.f11832t;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f11598k) {
        }
        return this.f11599l.size();
    }
}
