package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class Pu extends AbstractCollection {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11131k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f11132l;

    public /* synthetic */ Pu(int i, Serializable serializable) {
        this.f11131k = i;
        this.f11132l = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f11131k) {
            case 0:
                ((C1581sv) this.f11132l).b();
                break;
            case 1:
                ((Uu) this.f11132l).clear();
                break;
            default:
                ((Eu) this.f11132l).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f11131k) {
            case 0:
                Iterator it = ((Eu) ((C1581sv) this.f11132l).a()).values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Eu) this.f11132l).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f11131k) {
            case 2:
                return ((Eu) this.f11132l).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11131k) {
            case 0:
                return new Bu((C1581sv) this.f11132l);
            case 1:
                Uu uu = (Uu) this.f11132l;
                Map d5 = uu.d();
                return d5 != null ? d5.values().iterator() : new Ru(uu, 2);
            default:
                return new C1536rv(((Eu) this.f11132l).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f11131k) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Eu eu = (Eu) this.f11132l;
                    for (Map.Entry entry : eu.entrySet()) {
                        if (AbstractC1400ot.q(obj, entry.getValue())) {
                            eu.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f11131k) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Eu eu = (Eu) this.f11132l;
                    for (Map.Entry entry : eu.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return eu.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f11131k) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Eu eu = (Eu) this.f11132l;
                    for (Map.Entry entry : eu.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return eu.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f11131k) {
            case 0:
                return ((C1581sv) this.f11132l).f15614o;
            case 1:
                return ((Uu) this.f11132l).size();
            default:
                return ((Eu) this.f11132l).f8625m.size();
        }
    }

    public Pu(Eu eu) {
        this.f11131k = 2;
        this.f11132l = eu;
    }
}
