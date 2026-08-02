package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzfvm extends AbstractSet {
    final /* synthetic */ zzfvq zza;

    public zzfvm(zzfvq zzfvqVar) {
        this.zza = zzfvqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfvq zzfvqVar = this.zza;
        Map zzl = zzfvqVar.zzl();
        return zzl != null ? zzl.keySet().iterator() : new zzfvh(zzfvqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object zzy;
        Object obj2;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.keySet().remove(obj);
        }
        zzy = this.zza.zzy(obj);
        obj2 = zzfvq.zzd;
        return zzy != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
