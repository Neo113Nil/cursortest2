package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfky implements zzeup {
    final /* synthetic */ zzfla zza;

    zzfky(zzfla zzflaVar) {
        Objects.requireNonNull(zzflaVar);
        this.zza = zzflaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        zzfla zzflaVar = this.zza;
        synchronized (zzflaVar) {
            zzflaVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfla zzflaVar = this.zza;
        zzdwk zzdwkVar = (zzdwk) obj;
        synchronized (zzflaVar) {
            zzflaVar.zzw(zzdwkVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeC)).booleanValue()) {
                zzdwkVar.zzh().zza = zzflaVar.zzu();
            }
            zzflaVar.zzv().zzj();
        }
    }
}
