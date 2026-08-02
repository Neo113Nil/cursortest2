package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.os.Bundle;
import android.text.TextUtils;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzffy implements Runnable {
    private final zzfgb zzb;
    private String zzc;
    private String zze;
    private zzfaq zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private Future zzh;
    private final List zza = new ArrayList();
    private int zzi = 2;
    private zzfgd zzd = zzfgd.SCAR_REQUEST_TYPE_UNSPECIFIED;

    public zzffy(zzfgb zzfgbVar) {
        this.zzb = zzfgbVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzh();
    }

    public final synchronized zzffy zza(zzffn zzffnVar) {
        try {
            if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
                List list = this.zza;
                zzffnVar.zzj();
                list.add(zzffnVar);
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                this.zzh = zzbza.zzd.schedule(this, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zziN)).intValue(), TimeUnit.MILLISECONDS);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzffy zzb(String str) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue() && zzffx.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzffy zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.zzg = zzeVar;
        }
        return this;
    }

    public final synchronized zzffy zzd(ArrayList arrayList) {
        try {
            if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
                if (!arrayList.contains("banner") && !arrayList.contains("BANNER")) {
                    if (!arrayList.contains("interstitial") && !arrayList.contains("INTERSTITIAL")) {
                        if (!arrayList.contains(SentryStackFrame.JsonKeys.NATIVE) && !arrayList.contains("NATIVE")) {
                            if (!arrayList.contains("rewarded") && !arrayList.contains("REWARDED")) {
                                if (arrayList.contains("app_open_ad")) {
                                    this.zzi = 7;
                                } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains("REWARDED_INTERSTITIAL")) {
                                    this.zzi = 6;
                                }
                            }
                            this.zzi = 5;
                        }
                        this.zzi = 8;
                    }
                    this.zzi = 4;
                }
                this.zzi = 3;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this;
    }

    public final synchronized zzffy zze(String str) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.zze = str;
        }
        return this;
    }

    public final synchronized zzffy zzf(Bundle bundle) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.zzd = Q0.a.e0(bundle);
        }
        return this;
    }

    public final synchronized zzffy zzg(zzfaq zzfaqVar) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.zzf = zzfaqVar;
        }
        return this;
    }

    public final synchronized void zzh() {
        try {
            if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
                Future future = this.zzh;
                if (future != null) {
                    future.cancel(false);
                }
                for (zzffn zzffnVar : this.zza) {
                    int i7 = this.zzi;
                    if (i7 != 2) {
                        zzffnVar.zzn(i7);
                    }
                    if (!TextUtils.isEmpty(this.zzc)) {
                        zzffnVar.zze(this.zzc);
                    }
                    if (!TextUtils.isEmpty(this.zze) && !zzffnVar.zzl()) {
                        zzffnVar.zzd(this.zze);
                    }
                    zzfaq zzfaqVar = this.zzf;
                    if (zzfaqVar != null) {
                        zzffnVar.zzb(zzfaqVar);
                    } else {
                        com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
                        if (zzeVar != null) {
                            zzffnVar.zza(zzeVar);
                        }
                    }
                    zzffnVar.zzf(this.zzd);
                    this.zzb.zzc(zzffnVar.zzm());
                }
                this.zza.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized zzffy zzi(int i7) {
        if (((Boolean) zzbdr.zzc.zze()).booleanValue()) {
            this.zzi = i7;
        }
        return this;
    }
}
