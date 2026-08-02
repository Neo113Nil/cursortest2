package com.google.android.gms.internal.firebase_database;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzij implements Iterator<zziz> {
    private final Iterator<Map.Entry<zzid, zzja>> zzri;

    public zzij(Iterator<Map.Entry<zzid, zzja>> it) {
        this.zzri = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzri.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zziz next() {
        Map.Entry<zzid, zzja> next = this.zzri.next();
        return new zziz(next.getKey(), next.getValue());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zzri.remove();
    }
}
