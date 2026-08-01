package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbla;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfrg;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzy implements zzhcv {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzcfi zzb;
    final /* synthetic */ zzcfb zzc;
    final /* synthetic */ zzfqw zzd;
    final /* synthetic */ zzap zze;

    zzy(zzap zzapVar, ListenableFuture listenableFuture, zzcfi zzcfiVar, zzcfb zzcfbVar, zzfqw zzfqwVar) {
        this.zza = listenableFuture;
        this.zzb = zzcfiVar;
        this.zzc = zzcfbVar;
        this.zzd = zzfqwVar;
        Objects.requireNonNull(zzapVar);
        this.zze = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziM)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfrg zzx = zzap.zzx(this.zza, this.zzb);
        if (((Boolean) zzbla.zze.zze()).booleanValue() && zzx != null) {
            zzfqw zzfqwVar = this.zzd;
            zzfqwVar.zzj(th);
            zzfqwVar.zzd(false);
            zzx.zza(zzfqwVar);
            zzx.zzh();
        }
        zzcfb zzcfbVar = this.zzc;
        if (zzcfbVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzcfbVar.zza(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean zzM = this.zze.zzM();
        zzbc zzbcVar = (zzbc) obj;
        zzfrg zzx = zzap.zzx(listenableFuture, this.zzb);
        zzM.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziG)).booleanValue()) {
            try {
                zzcfb zzcfbVar = this.zzc;
                if (zzcfbVar != null) {
                    zzcfbVar.zza("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String concat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(concat);
            }
            if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                return;
            }
            zzfqw zzfqwVar = this.zzd;
            zzfqwVar.zzk("QueryInfo generation has been disabled.");
            zzfqwVar.zzd(false);
            zzx.zza(zzfqwVar);
            zzx.zzh();
            return;
        }
        try {
            try {
                if (zzbcVar == null) {
                    zzcfb zzcfbVar2 = this.zzc;
                    if (zzcfbVar2 != null) {
                        zzcfbVar2.zzb(null, null, null);
                    }
                    zzfqw zzfqwVar2 = this.zzd;
                    zzfqwVar2.zzd(true);
                    if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                        return;
                    }
                    zzx.zza(zzfqwVar2);
                    zzx.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(zzbcVar.zzb).optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcfb zzcfbVar3 = this.zzc;
                        if (zzcfbVar3 != null) {
                            zzcfbVar3.zza("Internal error: request ID is empty in request JSON.");
                        }
                        zzfqw zzfqwVar3 = this.zzd;
                        zzfqwVar3.zzk("Request ID empty");
                        zzfqwVar3.zzd(false);
                        if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                            return;
                        }
                        zzx.zza(zzfqwVar3);
                        zzx.zzh();
                        return;
                    }
                    Bundle bundle = zzbcVar.zzd;
                    zzap zzapVar = this.zze;
                    if (zzapVar.zzE() && bundle != null && bundle.getInt(zzapVar.zzG(), -1) == -1) {
                        bundle.putInt(zzapVar.zzG(), zzapVar.zzH().get());
                    }
                    if (zzapVar.zzD() && bundle != null && TextUtils.isEmpty(bundle.getString(zzapVar.zzF()))) {
                        if (TextUtils.isEmpty(zzapVar.zzJ())) {
                            zzapVar.zzK(com.google.android.gms.ads.internal.zzt.zzc().zze(zzapVar.zzy(), zzapVar.zzI().afmaVersion));
                        }
                        bundle.putString(zzapVar.zzF(), zzapVar.zzJ());
                    }
                    zzcfb zzcfbVar4 = this.zzc;
                    if (zzcfbVar4 != null) {
                        zzcfbVar4.zzb(zzbcVar.zza, zzbcVar.zzb, bundle);
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                        return;
                    }
                    zzx.zza(this.zzd);
                    zzx.zzh();
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcfb zzcfbVar5 = this.zzc;
                    if (zzcfbVar5 != null) {
                        String obj2 = e2.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(obj2);
                        zzcfbVar5.zza(sb.toString());
                    }
                    zzfqw zzfqwVar4 = this.zzd;
                    zzfqwVar4.zzj(e2);
                    zzfqwVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                        return;
                    }
                    zzx.zza(zzfqwVar4);
                    zzx.zzh();
                }
            } catch (RemoteException e3) {
                zzfqw zzfqwVar5 = this.zzd;
                zzfqwVar5.zzj(e3);
                zzfqwVar5.zzd(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbla.zze.zze()).booleanValue() || zzx == null) {
                    return;
                }
                zzx.zza(this.zzd);
                zzx.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbla.zze.zze()).booleanValue() && zzx != null) {
                zzx.zza(this.zzd);
                zzx.zzh();
            }
            throw th;
        }
    }
}
