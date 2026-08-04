package com.google.android.gms.internal.ads;

import java.util.AbstractList;

/* JADX INFO: loaded from: classes.dex */
public final class zzgxq extends AbstractList {
    private final zzgxo zza;
    private final zzgxp zzb;

    public zzgxq(zzgxo zzgxoVar, zzgxp zzgxpVar) {
        this.zza = zzgxoVar;
        this.zzb = zzgxpVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        return this.zzb.zzb(this.zza.zzd(i7));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }
}
