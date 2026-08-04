package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzfxw extends zzfwm {
    private final transient zzfwk zza;
    private final transient zzfwh zzb;

    public zzfxw(zzfwk zzfwkVar, zzfwh zzfwhVar) {
        this.zza = zzfwkVar;
        this.zzb = zzfwhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final int zza(Object[] objArr, int i7) {
        return this.zzb.zza(objArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    public final zzfwh zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwm, com.google.android.gms.internal.ads.zzfwc
    /* JADX INFO: renamed from: zze */
    public final zzfyn iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final boolean zzf() {
        return true;
    }
}
