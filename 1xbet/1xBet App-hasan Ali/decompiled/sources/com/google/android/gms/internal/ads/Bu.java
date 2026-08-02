package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Bu implements Iterator {

    /* renamed from: k, reason: collision with root package name */
    public final Iterator f7909k;

    /* renamed from: l, reason: collision with root package name */
    public Collection f7910l = null;

    /* renamed from: m, reason: collision with root package name */
    public Iterator f7911m = EnumC1267lv.f14446k;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1581sv f7912n;

    public Bu(C1581sv c1581sv) {
        this.f7912n = c1581sv;
        this.f7909k = c1581sv.f15613n.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7909k.hasNext() || this.f7911m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f7911m.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f7909k.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f7910l = collection;
            this.f7911m = collection.iterator();
        }
        return this.f7911m.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f7911m.remove();
        Collection collection = this.f7910l;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f7909k.remove();
        }
        C1581sv c1581sv = this.f7912n;
        c1581sv.f15614o--;
    }
}
