package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
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
        int zzw;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzw = this.zza.zzw(entry.getKey());
            if (zzw != -1 && zzfte.zza(zzfvq.zzj(this.zza, zzw), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        zzfvq zzfvqVar = this.zza;
        Map zzl = zzfvqVar.zzl();
        return zzl != null ? zzl.entrySet().iterator() : new zzfvi(zzfvqVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int zzv;
        int[] zzA;
        Object[] zzB;
        Object[] zzC;
        int i7;
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        zzfvq zzfvqVar = this.zza;
        if (zzfvqVar.zzr()) {
            return false;
        }
        zzv = zzfvqVar.zzv();
        Object key = entry.getKey();
        Object value = entry.getValue();
        zzfvq zzfvqVar2 = this.zza;
        Object zzi = zzfvq.zzi(zzfvqVar2);
        zzA = zzfvqVar2.zzA();
        zzB = zzfvqVar2.zzB();
        zzC = zzfvqVar2.zzC();
        int zzb = zzfvr.zzb(key, value, zzv, zzi, zzA, zzB, zzC);
        if (zzb == -1) {
            return false;
        }
        this.zza.zzq(zzb, zzv);
        zzfvq zzfvqVar3 = this.zza;
        i7 = zzfvqVar3.zzg;
        zzfvqVar3.zzg = i7 - 1;
        this.zza.zzo();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
