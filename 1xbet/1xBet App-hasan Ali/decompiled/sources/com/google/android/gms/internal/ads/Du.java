package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public class Du implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f8409k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Iterator f8410l;

    /* renamed from: m, reason: collision with root package name */
    public Object f8411m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f8412n;

    public Du(Fu fu, Iterator it) {
        this.f8410l = it;
        this.f8412n = fu;
    }

    public void a() {
        Nu nu = (Nu) this.f8412n;
        nu.d();
        if (nu.f10864l != ((Collection) this.f8411m)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f8409k) {
            case 0:
                break;
            case 1:
                break;
            default:
                a();
                break;
        }
        return this.f8410l.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f8409k) {
            case 0:
                Map.Entry entry = (Map.Entry) this.f8410l.next();
                this.f8411m = (Collection) entry.getValue();
                return ((Eu) this.f8412n).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f8410l.next();
                this.f8411m = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f8410l.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f8409k) {
            case 0:
                AbstractC1400ot.i0("no calls to next() since the last call to remove()", ((Collection) this.f8411m) != null);
                this.f8410l.remove();
                ((Eu) this.f8412n).f8626n.f15614o -= ((Collection) this.f8411m).size();
                ((Collection) this.f8411m).clear();
                this.f8411m = null;
                break;
            case 1:
                AbstractC1400ot.i0("no calls to next() since the last call to remove()", ((Map.Entry) this.f8411m) != null);
                Collection collection = (Collection) ((Map.Entry) this.f8411m).getValue();
                this.f8410l.remove();
                ((Fu) this.f8412n).f9140l.f15614o -= collection.size();
                collection.clear();
                this.f8411m = null;
                break;
            default:
                this.f8410l.remove();
                Nu nu = (Nu) this.f8412n;
                C1581sv c1581sv = nu.f10867o;
                c1581sv.f15614o--;
                nu.e();
                break;
        }
    }

    public Du(Nu nu, ListIterator listIterator) {
        this.f8412n = nu;
        this.f8411m = nu.f10864l;
        this.f8410l = listIterator;
    }

    public Du(Eu eu) {
        this.f8412n = eu;
        this.f8410l = eu.f8625m.entrySet().iterator();
    }

    public Du(Nu nu) {
        Iterator it;
        this.f8412n = nu;
        Collection collection = nu.f10864l;
        this.f8411m = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f8410l = it;
    }
}
