package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzazl extends zzazs {
    private final A2.a zza;
    private final String zzb;

    public zzazl(A2.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzb(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.k());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazt
    public final void zzd(zzazq zzazqVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzazm(zzazqVar, this.zzb));
        }
    }
}
