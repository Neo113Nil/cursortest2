package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdva extends com.google.android.gms.internal.ads.zzdul implements com.google.android.gms.internal.ads.zzdky {
    private com.google.android.gms.internal.ads.zzdky zza;

    @Override // com.google.android.gms.internal.ads.zzdky
    public final synchronized void zzdR() {
        com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zza;
        if (zzdkyVar != null) {
            zzdkyVar.zzdR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdky
    public final synchronized void zzdu() {
        com.google.android.gms.internal.ads.zzdky zzdkyVar = this.zza;
        if (zzdkyVar != null) {
            zzdkyVar.zzdu();
        }
    }

    protected final synchronized void zzn(com.google.android.gms.ads.internal.client.zza zzaVar, com.google.android.gms.internal.ads.zzbog zzbogVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, com.google.android.gms.internal.ads.zzboi zzboiVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, com.google.android.gms.internal.ads.zzdky zzdkyVar) {
        super.zzm(zzaVar, zzbogVar, zzrVar, zzboiVar, zzadVar);
        this.zza = zzdkyVar;
    }
}
