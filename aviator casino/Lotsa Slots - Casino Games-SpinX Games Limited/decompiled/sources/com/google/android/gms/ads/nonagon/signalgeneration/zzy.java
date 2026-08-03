package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzy implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.common.util.concurrent.ListenableFuture zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzceq zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcej zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfpw zzd;
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zze;

    zzy(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar, com.google.common.util.concurrent.ListenableFuture listenableFuture, com.google.android.gms.internal.ads.zzceq zzceqVar, com.google.android.gms.internal.ads.zzcej zzcejVar, com.google.android.gms.internal.ads.zzfpw zzfpwVar) {
        this.zza = listenableFuture;
        this.zzb = zzceqVar;
        this.zzc = zzcejVar;
        this.zzd = zzfpwVar;
        java.util.Objects.requireNonNull(zzapVar);
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        java.lang.String message = th.getMessage();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziG)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        com.google.android.gms.internal.ads.zzfqg zzy = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzy(this.zza, this.zzb);
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() && zzy != null) {
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzj(th);
            zzfpwVar.zzd(false);
            zzy.zza(zzfpwVar);
            zzy.zzh();
        }
        com.google.android.gms.internal.ads.zzcej zzcejVar = this.zzc;
        if (zzcejVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcejVar.zzb(message);
        } catch (android.os.RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.util.concurrent.atomic.AtomicBoolean zzN = this.zze.zzN();
        com.google.android.gms.ads.nonagon.signalgeneration.zzbc zzbcVar = (com.google.android.gms.ads.nonagon.signalgeneration.zzbc) obj;
        com.google.android.gms.internal.ads.zzfqg zzy = com.google.android.gms.ads.nonagon.signalgeneration.zzap.zzy(listenableFuture, this.zzb);
        zzN.set(true);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziA)).booleanValue()) {
            try {
                com.google.android.gms.internal.ads.zzcej zzcejVar = this.zzc;
                if (zzcejVar != null) {
                    zzcejVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (android.os.RemoteException e) {
                java.lang.String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
            }
            if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                return;
            }
            com.google.android.gms.internal.ads.zzfpw zzfpwVar = this.zzd;
            zzfpwVar.zzk("QueryInfo generation has been disabled.");
            zzfpwVar.zzd(false);
            zzy.zza(zzfpwVar);
            zzy.zzh();
            return;
        }
        try {
            try {
                if (zzbcVar == null) {
                    com.google.android.gms.internal.ads.zzcej zzcejVar2 = this.zzc;
                    if (zzcejVar2 != null) {
                        zzcejVar2.zzc(null, null, null);
                    }
                    com.google.android.gms.internal.ads.zzfpw zzfpwVar2 = this.zzd;
                    zzfpwVar2.zzd(true);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(zzfpwVar2);
                    zzy.zzh();
                    return;
                }
                try {
                    if (android.text.TextUtils.isEmpty(new org.json.JSONObject(zzbcVar.zzb).optString("request_id", ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        com.google.android.gms.internal.ads.zzcej zzcejVar3 = this.zzc;
                        if (zzcejVar3 != null) {
                            zzcejVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        com.google.android.gms.internal.ads.zzfpw zzfpwVar3 = this.zzd;
                        zzfpwVar3.zzk("Request ID empty");
                        zzfpwVar3.zzd(false);
                        if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                            return;
                        }
                        zzy.zza(zzfpwVar3);
                        zzy.zzh();
                        return;
                    }
                    android.os.Bundle bundle = zzbcVar.zzd;
                    com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = this.zze;
                    if (zzapVar.zzF() && bundle != null && bundle.getInt(zzapVar.zzH(), -1) == -1) {
                        bundle.putInt(zzapVar.zzH(), zzapVar.zzI().get());
                    }
                    if (zzapVar.zzE() && bundle != null && android.text.TextUtils.isEmpty(bundle.getString(zzapVar.zzG()))) {
                        if (android.text.TextUtils.isEmpty(zzapVar.zzK())) {
                            zzapVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.zzz(), zzapVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzapVar.zzG(), zzapVar.zzK());
                    }
                    com.google.android.gms.internal.ads.zzcej zzcejVar4 = this.zzc;
                    if (zzcejVar4 != null) {
                        zzcejVar4.zzc(zzbcVar.zza, zzbcVar.zzb, bundle);
                    }
                    this.zzd.zzd(true);
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(this.zzd);
                    zzy.zzh();
                } catch (org.json.JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    com.google.android.gms.internal.ads.zzcej zzcejVar5 = this.zzc;
                    if (zzcejVar5 != null) {
                        java.lang.String obj2 = e2.toString();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        zzcejVar5.zzb(sb.toString());
                    }
                    com.google.android.gms.internal.ads.zzfpw zzfpwVar4 = this.zzd;
                    zzfpwVar4.zzj(e2);
                    zzfpwVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                        return;
                    }
                    zzy.zza(zzfpwVar4);
                    zzy.zzh();
                }
            } catch (android.os.RemoteException e3) {
                com.google.android.gms.internal.ads.zzfpw zzfpwVar5 = this.zzd;
                zzfpwVar5.zzj(e3);
                zzfpwVar5.zzd(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() || zzy == null) {
                    return;
                }
                zzy.zza(this.zzd);
                zzy.zzh();
            }
        } catch (java.lang.Throwable th) {
            if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkj.zze.zze()).booleanValue() && zzy != null) {
                zzy.zza(this.zzd);
                zzy.zzh();
            }
            throw th;
        }
    }
}
