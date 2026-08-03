package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzepb implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ long zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfki zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkf zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfry zze;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfkq zzf;
    final /* synthetic */ com.google.android.gms.internal.ads.zzepd zzg;

    zzepb(com.google.android.gms.internal.ads.zzepd zzepdVar, long j, com.google.android.gms.internal.ads.zzfki zzfkiVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar, java.lang.String str, com.google.android.gms.internal.ads.zzfry zzfryVar, com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        this.zza = j;
        this.zzb = zzfkiVar;
        this.zzc = zzfkfVar;
        this.zzd = str;
        this.zze = zzfryVar;
        this.zzf = zzfkqVar;
        java.util.Objects.requireNonNull(zzepdVar);
        this.zzg = zzepdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(java.lang.Throwable th) {
        java.lang.Integer num;
        int i;
        com.google.android.gms.ads.internal.client.zze zzb;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        com.google.android.gms.internal.ads.zzepd zzepdVar = this.zzg;
        long elapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        if (!(th instanceof java.util.concurrent.TimeoutException)) {
            if (th instanceof com.google.android.gms.internal.ads.zzeol) {
                num = null;
                i = 3;
            } else if (th instanceof java.util.concurrent.CancellationException) {
                i = 4;
            } else if (th instanceof com.google.android.gms.internal.ads.zzflf) {
                i = 5;
            } else {
                if (th instanceof com.google.android.gms.internal.ads.zzeed) {
                    int i2 = com.google.android.gms.internal.ads.zzfma.zza(th).zza == 3 ? 1 : 6;
                    num = (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcn)).booleanValue() && (th instanceof com.google.android.gms.internal.ads.zzelw) && (zzb = ((com.google.android.gms.internal.ads.zzelw) th).zzb()) != null) ? java.lang.Integer.valueOf(zzb.zza) : null;
                    i = i2;
                } else {
                    num = null;
                    i = 6;
                }
            }
            synchronized (zzepdVar) {
                if (zzepdVar.zzn()) {
                    zzepdVar.zzk().zza(this.zzb, this.zzc, i, th instanceof com.google.android.gms.internal.ads.zzelw ? (com.google.android.gms.internal.ads.zzelw) th : null, elapsedRealtime);
                }
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjE)).booleanValue()) {
                    com.google.android.gms.internal.ads.zzfsc zzl = zzepdVar.zzl();
                    com.google.android.gms.internal.ads.zzfry zzfryVar = this.zze;
                    com.google.android.gms.internal.ads.zzfkq zzfkqVar = this.zzf;
                    com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
                    zzl.zza(zzfryVar.zza(zzfkqVar, zzfkfVar, zzfkfVar.zzn), zzfkfVar.zzax);
                }
                if (zzepdVar.zzp()) {
                    return;
                }
                java.util.LinkedHashMap zzm = zzepdVar.zzm();
                com.google.android.gms.internal.ads.zzfkf zzfkfVar2 = this.zzc;
                zzm.put(zzfkfVar2, new com.google.android.gms.internal.ads.zzepc(this.zzd, zzfkfVar2.zzaf, i, elapsedRealtime, num));
                com.google.android.gms.ads.internal.client.zze zza = com.google.android.gms.internal.ads.zzfma.zza(th);
                int i3 = zza.zza;
                if ((i3 == 3 || i3 == 0) && (zzeVar = zza.zzd) != null && !zzeVar.zzc.equals(com.google.android.gms.ads.MobileAds.ERROR_DOMAIN)) {
                    zza = com.google.android.gms.internal.ads.zzfma.zza(new com.google.android.gms.internal.ads.zzelw(13, zza.zzd));
                }
                zzepdVar.zzo().zze(zzfkfVar2, elapsedRealtime, zza);
                return;
            }
        }
        i = 2;
        num = null;
        synchronized (zzepdVar) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzepd zzepdVar = this.zzg;
        long elapsedRealtime = zzepdVar.zzj().elapsedRealtime() - this.zza;
        synchronized (zzepdVar) {
            if (zzepdVar.zzn()) {
                zzepdVar.zzk().zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            if (zzepdVar.zzp()) {
                return;
            }
            com.google.android.gms.internal.ads.zzfkf zzfkfVar = this.zzc;
            if (zzepdVar.zzi(zzfkfVar)) {
                ((com.google.android.gms.internal.ads.zzepc) zzepdVar.zzm().get(zzfkfVar)).zzd = elapsedRealtime;
            } else {
                zzepdVar.zzm().put(zzfkfVar, new com.google.android.gms.internal.ads.zzepc(this.zzd, zzfkfVar.zzaf, 0, elapsedRealtime, null));
            }
            zzepdVar.zzo().zzd(zzfkfVar, elapsedRealtime, null);
        }
    }
}
