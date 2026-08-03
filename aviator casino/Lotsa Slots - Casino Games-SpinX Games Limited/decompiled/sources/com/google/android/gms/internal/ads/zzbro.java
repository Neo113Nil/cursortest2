package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbro implements com.google.android.gms.internal.ads.zzasx {
    private volatile com.google.android.gms.internal.ads.zzbrb zza;
    private final android.content.Context zzb;

    public zzbro(android.content.Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzasx
    public final com.google.android.gms.internal.ads.zzata zza(com.google.android.gms.internal.ads.zzate zzateVar) throws com.google.android.gms.internal.ads.zzatn {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzbrc> creator = com.google.android.gms.internal.ads.zzbrc.CREATOR;
        java.util.Map zzm = zzateVar.zzm();
        int size = zzm.size();
        java.lang.String[] strArr = new java.lang.String[size];
        java.lang.String[] strArr2 = new java.lang.String[size];
        int i = 0;
        for (java.util.Map.Entry entry : zzm.entrySet()) {
            strArr[i] = (java.lang.String) entry.getKey();
            strArr2[i] = (java.lang.String) entry.getValue();
            i++;
        }
        com.google.android.gms.internal.ads.zzbrc zzbrcVar = new com.google.android.gms.internal.ads.zzbrc(zzateVar.zzh(), strArr, strArr2);
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            com.google.android.gms.internal.ads.zzcfw zzcfwVar = new com.google.android.gms.internal.ads.zzcfw();
            this.zza = new com.google.android.gms.internal.ads.zzbrb(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new com.google.android.gms.internal.ads.zzbrm(this, zzcfwVar), new com.google.android.gms.internal.ads.zzbrn(this, zzcfwVar));
            this.zza.checkAvailabilityAndConnect();
            com.google.android.gms.internal.ads.zzbrk zzbrkVar = new com.google.android.gms.internal.ads.zzbrk(this, zzbrcVar);
            com.google.android.gms.internal.ads.zzhcg zzhcgVar = com.google.android.gms.internal.ads.zzcfr.zza;
            com.google.common.util.concurrent.ListenableFuture zzi = com.google.android.gms.internal.ads.zzhbw.zzi(com.google.android.gms.internal.ads.zzhbw.zzj(zzcfwVar, zzbrkVar, zzhcgVar), ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfs)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS, com.google.android.gms.internal.ads.zzcfr.zzd);
            zzi.addListener(new com.google.android.gms.internal.ads.zzbrl(this), zzhcgVar);
            android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) zzi.get();
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            com.google.android.gms.internal.ads.zzbre zzbreVar = (com.google.android.gms.internal.ads.zzbre) new com.google.android.gms.internal.ads.zzcbb(parcelFileDescriptor).zza(com.google.android.gms.internal.ads.zzbre.CREATOR);
            if (zzbreVar == null) {
                return null;
            }
            if (zzbreVar.zza) {
                throw new com.google.android.gms.internal.ads.zzatn(zzbreVar.zzb);
            }
            java.lang.String[] strArr3 = zzbreVar.zze;
            java.lang.String[] strArr4 = zzbreVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i2 = 0; i2 < strArr3.length; i2++) {
                hashMap.put(strArr3[i2], strArr4[i2]);
            }
            return new com.google.android.gms.internal.ads.zzata(zzbreVar.zzc, zzbreVar.zzd, hashMap, zzbreVar.zzg, zzbreVar.zzh);
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            long elapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(elapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (java.lang.Throwable th) {
            long elapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(elapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        android.os.Binder.flushPendingCommands();
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzbrb zzc() {
        return this.zza;
    }
}
