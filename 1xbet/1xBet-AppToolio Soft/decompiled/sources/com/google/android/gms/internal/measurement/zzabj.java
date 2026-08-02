package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: classes.dex */
final class zzabj<K, V> implements Iterator<Map.Entry<K, V>> {
    private int pos;
    private final /* synthetic */ zzabd zzbwm;
    private boolean zzbwn;
    private Iterator<Map.Entry<K, V>> zzbwo;

    private zzabj(zzabd zzabdVar) {
        this.zzbwm = zzabdVar;
        this.pos = -1;
    }

    /* synthetic */ zzabj(zzabd zzabdVar, zzabe zzabeVar) {
        this(zzabdVar);
    }

    private final Iterator<Map.Entry<K, V>> zzve() {
        Map map;
        if (this.zzbwo == null) {
            map = this.zzbwm.zzbwg;
            this.zzbwo = map.entrySet().iterator();
        }
        return this.zzbwo;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int i = this.pos + 1;
        list = this.zzbwm.zzbwf;
        if (i >= list.size()) {
            map = this.zzbwm.zzbwg;
            if (map.isEmpty() || !zzve().hasNext()) {
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
        this.zzbwn = true;
        int i = this.pos + 1;
        this.pos = i;
        list = this.zzbwm.zzbwf;
        if (i < list.size()) {
            list2 = this.zzbwm.zzbwf;
            next = (Map.Entry<K, V>) list2.get(this.pos);
        } else {
            next = zzve().next();
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.zzbwn) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzbwn = false;
        this.zzbwm.zzva();
        int i = this.pos;
        list = this.zzbwm.zzbwf;
        if (i >= list.size()) {
            zzve().remove();
            return;
        }
        zzabd zzabdVar = this.zzbwm;
        int i2 = this.pos;
        this.pos = i2 - 1;
        zzabdVar.zzai(i2);
    }
}
