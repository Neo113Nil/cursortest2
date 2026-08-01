package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzeae;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzr implements zzdmi {
    private final zzeae zza;
    private final zzq zzb;
    private final String zzc;

    public zzr(zzeae zzeaeVar, zzq zzqVar, String str) {
        this.zza = zzeaeVar;
        this.zzb = zzqVar;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zzd(zzbc zzbcVar) {
        if (zzbcVar == null) {
            return;
        }
        this.zzb.zza(this.zzc, zzbcVar.zzb, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdmi
    public final void zze(String str) {
    }
}
