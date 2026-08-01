package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcjw extends zzcjs {
    public zzcjw(zzcif zzcifVar) {
        super(zzcifVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final boolean zze(String str) {
        String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        zzcif zzcifVar = (zzcif) this.zzc.get();
        if (zzcifVar != null && zzg != null) {
            zzcifVar.zzt(zzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, zzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
    }
}
