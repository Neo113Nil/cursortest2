package com.google.android.gms.internal.firebase_auth;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class zzfg<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private Iterator<Map.Entry<K, V>> zzuq;
    private final /* synthetic */ zzey zzur;
    private boolean zzuv;

    private zzfg(zzey zzeyVar) {
        this.zzur = zzeyVar;
        this.pos = -1;
    }

    /* synthetic */ zzfg(zzey zzeyVar, zzez zzezVar) {
        this(zzeyVar);
    }

    private final Iterator<Map.Entry<K, V>> zzft() {
        Map map;
        if (this.zzuq == null) {
            map = this.zzur.zzum;
            this.zzuq = map.entrySet().iterator();
        }
        return this.zzuq;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzur.zzul;
        if (i >= list.size()) {
            map = this.zzur.zzum;
            if (map.isEmpty() || !zzft().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        List list;
        Map.Entry<K, V> next;
        List list2;
        this.zzuv = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzur.zzul;
        if (i < list.size()) {
            list2 = this.zzur.zzul;
            next = (Map.Entry<K, V>) list2.get(this.pos);
        } else {
            next = zzft().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzuv) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzuv = false;
        this.zzur.zzfr();
        int i = this.pos;
        list = this.zzur.zzul;
        if (i >= list.size()) {
            zzft().remove();
            return;
        }
        zzey zzeyVar = this.zzur;
        int i2 = this.pos;
        this.pos = i2 - 1;
        zzeyVar.zzav(i2);
    }
}
