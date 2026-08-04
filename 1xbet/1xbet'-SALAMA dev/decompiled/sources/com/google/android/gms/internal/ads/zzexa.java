package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzexa implements zzfdh {
    private final zzexw zza;

    public zzexa(zzexw zzexwVar) {
        this.zza = zzexwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final I3.b zza(zzfdi zzfdiVar) {
        zzexb zzexbVar = (zzexb) zzfdiVar;
        return ((zzewx) this.zza).zzb(zzexbVar.zzb, zzexbVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfdh
    public final void zzb(zzfcw zzfcwVar) {
        zzfcwVar.zza = ((zzewx) this.zza).zza();
    }
}
