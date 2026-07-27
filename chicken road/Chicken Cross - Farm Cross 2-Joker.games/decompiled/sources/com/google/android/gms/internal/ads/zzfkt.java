package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfkt implements zzeup {
    final /* synthetic */ zzfku zza;

    zzfkt(zzfku zzfkuVar) {
        Objects.requireNonNull(zzfkuVar);
        this.zza = zzfkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final void zza() {
        zzfku zzfkuVar = this.zza;
        synchronized (zzfkuVar) {
            zzfkuVar.zzw(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfku zzfkuVar = this.zza;
        zzdwk zzdwkVar = (zzdwk) obj;
        synchronized (zzfkuVar) {
            zzfkuVar.zzw(zzdwkVar);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzeC)).booleanValue()) {
                zzdwkVar.zzh().zza = zzfkuVar.zzu();
            }
            zzfkuVar.zzv().zzj();
        }
    }
}
