package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class zzfa<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzuq;
    private final /* synthetic */ zzey zzur;

    private zzfa(zzey zzeyVar) {
        List list;
        this.zzur = zzeyVar;
        list = this.zzur.zzul;
        this.pos = list.size();
    }

    /* synthetic */ zzfa(zzey zzeyVar, zzez zzezVar) {
        this(zzeyVar);
    }

    private final Iterator<Map.Entry<K, V>> zzft() {
        Map map;
        if (this.zzuq == null) {
            map = this.zzur.zzuo;
            this.zzuq = map.entrySet().iterator();
        }
        return this.zzuq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        int i = this.pos;
        if (i > 0) {
            list = this.zzur.zzul;
            if (i <= list.size()) {
                return true;
            }
        }
        return zzft().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> entry;
        if (zzft().hasNext()) {
            entry = zzft().next();
        } else {
            list = this.zzur.zzul;
            int i = this.pos - 1;
            this.pos = i;
            entry = (Map.Entry<K, V>) list.get(i);
        }
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
