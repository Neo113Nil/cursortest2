package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcje extends com.google.android.gms.internal.ads.zzcja {
    public zzcje(com.google.android.gms.internal.ads.zzchn zzchnVar) {
        super(zzchnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(java.lang.String str) {
        java.lang.String zzg = com.google.android.gms.ads.internal.util.client.zzf.zzg(str);
        com.google.android.gms.internal.ads.zzchn zzchnVar = (com.google.android.gms.internal.ads.zzchn) this.zzc.get();
        if (zzchnVar != null && zzg != null) {
            zzchnVar.zzt(zzg, this);
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("VideoStreamNoopCache is doing nothing.");
        zzq(str, zzg, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
    }
}
