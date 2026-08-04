package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzxr implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxr(zzz zzzVar, int i7) {
        this.zza = 1 == (zzzVar.zze & 1);
        this.zzb = zzln.zza(i7, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxr zzxrVar) {
        return zzfvw.zzj().zzd(this.zzb, zzxrVar.zzb).zzd(this.zza, zzxrVar.zza).zza();
    }
}
