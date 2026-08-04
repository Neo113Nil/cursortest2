package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzebs implements zzebr {
    public final zzebr zza;
    private final zzfsw zzb;

    public zzebs(zzebr zzebrVar, zzfsw zzfswVar) {
        this.zza = zzebrVar;
        this.zzb = zzfswVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final I3.b zza(zzfar zzfarVar, zzfaf zzfafVar) {
        return zzgbc.zzm(this.zza.zza(zzfarVar, zzfafVar), this.zzb, zzbza.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzebr
    public final boolean zzb(zzfar zzfarVar, zzfaf zzfafVar) {
        return this.zza.zzb(zzfarVar, zzfafVar);
    }
}
