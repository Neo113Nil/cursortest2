package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdpd implements com.google.android.gms.internal.ads.zzbeq {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpo zzb;

    zzdpd(com.google.android.gms.internal.ads.zzdpo zzdpoVar, java.lang.String str) {
        this.zza = str;
        java.util.Objects.requireNonNull(zzdpoVar);
        this.zzb = zzdpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbeq
    public final void zzdj(com.google.android.gms.internal.ads.zzbep zzbepVar) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcu)).booleanValue()) {
            synchronized (this) {
                if (zzbepVar.zzj) {
                    com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzb;
                    if (zzdpoVar.zzaa() != null) {
                        zzdpoVar.zzab().put(this.zza, true);
                        if (zzdpoVar.zzaa() == null) {
                            return;
                        } else {
                            zzdpoVar.zzu(zzdpoVar.zzaa().zzdF(), zzdpoVar.zzaa().zzi(), zzdpoVar.zzaa().zzj(), true);
                        }
                    }
                }
                return;
            }
        }
        if (zzbepVar.zzj) {
            com.google.android.gms.internal.ads.zzdpo zzdpoVar2 = this.zzb;
            if (zzdpoVar2.zzaa() != null) {
                zzdpoVar2.zzab().put(this.zza, true);
                if (zzdpoVar2.zzaa() == null) {
                    return;
                }
                zzdpoVar2.zzu(zzdpoVar2.zzaa().zzdF(), zzdpoVar2.zzaa().zzi(), zzdpoVar2.zzaa().zzj(), true);
            }
        }
    }
}
