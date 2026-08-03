package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzibu implements java.util.Iterator {
    com.google.android.gms.internal.ads.zzibv zza;
    com.google.android.gms.internal.ads.zzibv zzb;
    int zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzibw zzd;

    zzibu(com.google.android.gms.internal.ads.zzibw zzibwVar) {
        java.util.Objects.requireNonNull(zzibwVar);
        this.zzd = zzibwVar;
        this.zza = zzibwVar.zzd.zzd;
        this.zzb = null;
        this.zzc = zzibwVar.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    @Override // java.util.Iterator
    public final void remove() {
        com.google.android.gms.internal.ads.zzibv zzibvVar = this.zzb;
        if (zzibvVar == null) {
            throw new java.lang.IllegalStateException();
        }
        com.google.android.gms.internal.ads.zzibw zzibwVar = this.zzd;
        zzibwVar.zzd(zzibvVar, true);
        this.zzb = null;
        this.zzc = zzibwVar.zzc;
    }

    final com.google.android.gms.internal.ads.zzibv zza() {
        com.google.android.gms.internal.ads.zzibw zzibwVar = this.zzd;
        com.google.android.gms.internal.ads.zzibv zzibvVar = this.zza;
        if (zzibvVar == zzibwVar.zzd) {
            throw new java.util.NoSuchElementException();
        }
        if (zzibwVar.zzc != this.zzc) {
            throw new java.util.ConcurrentModificationException();
        }
        this.zza = zzibvVar.zzd;
        this.zzb = zzibvVar;
        return zzibvVar;
    }
}
