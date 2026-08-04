package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzfvk extends AbstractSet {
    final /* synthetic */ zzfvq zza;

    public zzfvk(zzfvq zzfvqVar) {
        this.zza = zzfvqVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZzw = this.zza.zzw(entry.getKey());
            if (iZzw != -1 && zzfte.zza(zzfvq.zzj(this.zza, iZzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfvq zzfvqVar = this.zza;
        Map mapZzl = zzfvqVar.zzl();
        return mapZzl != null ? mapZzl.entrySet().iterator() : new zzfvi(zzfvqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapZzl = this.zza.zzl();
        if (mapZzl != null) {
            return mapZzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfvq zzfvqVar = this.zza;
        if (zzfvqVar.zzr()) {
            return false;
        }
        int iZzv = zzfvqVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfvq zzfvqVar2 = this.zza;
        int iZzb = zzfvr.zzb(key, value, iZzv, zzfvq.zzi(zzfvqVar2), zzfvqVar2.zzA(), zzfvqVar2.zzB(), zzfvqVar2.zzC());
        if (iZzb == -1) {
            return false;
        }
        this.zza.zzq(iZzb, iZzv);
        this.zza.zzg--;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
