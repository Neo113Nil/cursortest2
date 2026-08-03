package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwq implements com.google.android.gms.internal.ads.zzddm {
    private final com.google.android.gms.internal.ads.zzcku zza;

    zzdwq(com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zza = zzckuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(android.content.Context context) {
        com.google.android.gms.internal.ads.zzcku zzckuVar = this.zza;
        if (zzckuVar != null) {
            zzckuVar.destroy();
        }
    }
}
