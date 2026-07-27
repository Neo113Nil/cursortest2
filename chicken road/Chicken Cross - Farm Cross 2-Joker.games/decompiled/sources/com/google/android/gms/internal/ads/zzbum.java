package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbum {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfrj zze;
    private final com.google.android.gms.ads.internal.util.zzbc zzf;
    private final com.google.android.gms.ads.internal.util.zzbc zzg;
    private zzbul zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbum(Context context, VersionInfoParcel versionInfoParcel, String str, com.google.android.gms.ads.internal.util.zzbc zzbcVar, com.google.android.gms.ads.internal.util.zzbc zzbcVar2, zzfrj zzfrjVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfrjVar;
        this.zzf = zzbcVar;
        this.zzg = zzbcVar2;
    }

    protected final zzbul zza(zzbbd zzbbdVar) {
        zzfqw zzn = zzfqw.zzn(this.zzb, 6);
        zzn.zza();
        final zzbul zzbulVar = new zzbul(this.zzg);
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzbbd zzbbdVar2 = null;
        zzcgj.zzf.execute(new Runnable(zzbbdVar2, zzbulVar) { // from class: com.google.android.gms.internal.ads.zzbuc
            private final /* synthetic */ zzbul zzb;

            {
                this.zzb = zzbulVar;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzbum.this.zzd(null, this.zzb);
            }
        });
        com.google.android.gms.ads.internal.util.zze.zza("loadNewJavascriptEngine: Promise created");
        zzbulVar.zze(new zzbtv(this, zzbulVar, zzn), new zzbtw(this, zzbulVar, zzn));
        return zzbulVar;
    }

    public final zzbug zzb(zzbbd zzbbdVar) {
        com.google.android.gms.ads.internal.util.zze.zza("getEngine: Trying to acquire lock");
        Object obj = this.zza;
        synchronized (obj) {
            com.google.android.gms.ads.internal.util.zze.zza("getEngine: Lock acquired");
            com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Trying to acquire lock");
            synchronized (obj) {
                com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock acquired");
                zzbul zzbulVar = this.zzh;
                if (zzbulVar != null && this.zzi == 0) {
                    zzbulVar.zze(new zzcgs() { // from class: com.google.android.gms.internal.ads.zzbty
                        @Override // com.google.android.gms.internal.ads.zzcgs
                        public final /* synthetic */ void zza(Object obj2) {
                            zzbum.this.zze((zzbth) obj2);
                        }
                    }, zzbtz.zza);
                }
            }
        }
        com.google.android.gms.ads.internal.util.zze.zza("refreshIfDestroyed: Lock released");
        zzbul zzbulVar2 = this.zzh;
        if (zzbulVar2 != null && zzbulVar2.zzi() != -1) {
            int i = this.zzi;
            if (i == 0) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (NO_UPDATE): Lock released");
                return this.zzh.zza();
            }
            if (i != 1) {
                com.google.android.gms.ads.internal.util.zze.zza("getEngine (UPDATING): Lock released");
                return this.zzh.zza();
            }
            this.zzi = 2;
            zza(null);
            com.google.android.gms.ads.internal.util.zze.zza("getEngine (PENDING_UPDATE): Lock released");
            return this.zzh.zza();
        }
        this.zzi = 2;
        this.zzh = zza(null);
        com.google.android.gms.ads.internal.util.zze.zza("getEngine (NULL or REJECTED): Lock released");
        return this.zzh.zza();
    }

    public final void zzc() {
        zzbul zzbulVar = this.zzh;
        if (zzbulVar != null) {
            zzbulVar.zzc();
            this.zzh = null;
        }
    }

    final /* synthetic */ void zzd(zzbbd zzbbdVar, final zzbul zzbulVar) {
        final long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        final ArrayList arrayList = new ArrayList();
        try {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before createJavascriptEngine");
            final zzbtp zzbtpVar = new zzbtp(this.zzb, this.zzd, null, null);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After createJavascriptEngine");
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbtpVar.zzi(new zzbtg() { // from class: com.google.android.gms.internal.ads.zzbua
                @Override // com.google.android.gms.internal.ads.zzbtg
                public final /* synthetic */ void zza() {
                    long currentTimeMillis2 = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                    final long j = currentTimeMillis;
                    final ArrayList arrayList2 = arrayList;
                    arrayList2.add(Long.valueOf(currentTimeMillis2 - j));
                    String valueOf = String.valueOf(arrayList2.get(0));
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
                    sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                    sb.append(valueOf);
                    sb.append(" ms.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                    zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    final zzbum zzbumVar = zzbum.this;
                    final zzbul zzbulVar2 = zzbulVar;
                    final zzbth zzbthVar = zzbtpVar;
                    zzgbpVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbub
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbum.this.zzf(zzbulVar2, zzbthVar, arrayList2, j);
                        }
                    }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzd)).intValue());
                }
            });
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbtpVar.zzm("/jsLoaded", new zzbtr(this, currentTimeMillis, zzbulVar, zzbtpVar));
            com.google.android.gms.ads.internal.util.zzbv zzbvVar = new com.google.android.gms.ads.internal.util.zzbv();
            zzbts zzbtsVar = new zzbts(this, null, zzbtpVar, zzbvVar);
            zzbvVar.zzb(zzbtsVar);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            if (!((Boolean) zzblh.zzd.zze()).booleanValue() || TextUtils.equals(this.zzb.getPackageName(), "com.google.android.gms")) {
                zzbtpVar.zzm("/requestReload", zzbtsVar);
            }
            String str = this.zzc;
            String.valueOf(str);
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(str)));
            if (str.endsWith(".js")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbtpVar.zzf(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (str.startsWith("<html>")) {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbtpVar.zzh(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbtpVar.zzg(str);
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new zzbtu(this, zzbulVar, zzbtpVar, arrayList, currentTimeMillis), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zze)).intValue());
        } catch (Throwable th) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error creating webview.", th);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziL)).booleanValue()) {
                zzbulVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziN)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbulVar.zzg();
            } else {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbulVar.zzg();
            }
        }
    }

    final /* synthetic */ void zze(zzbth zzbthVar) {
        if (zzbthVar.zzk()) {
            this.zzi = 1;
        }
    }

    final /* synthetic */ void zzf(zzbul zzbulVar, final zzbth zzbthVar, ArrayList arrayList, long j) {
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (zzbulVar.zzi() != -1 && zzbulVar.zzi() != 1) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zziL)).booleanValue()) {
                    zzbulVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                } else {
                    zzbulVar.zzg();
                }
                zzhdi zzhdiVar = zzcgj.zzf;
                Objects.requireNonNull(zzbthVar);
                zzhdiVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbtx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzbth.this.zzj();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzd));
                int zzi = zzbulVar.zzi();
                int i = this.zzi;
                String valueOf2 = String.valueOf(arrayList.get(0));
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - j;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 94 + String.valueOf(zzi).length() + 39 + String.valueOf(i).length() + 57 + String.valueOf(valueOf2).length() + 42 + String.valueOf(currentTimeMillis).length() + 15);
                sb.append("Could not receive /jsLoaded in ");
                sb.append(valueOf);
                sb.append(" ms. JS engine session reference status(onEngLoadedTimeout) is ");
                sb.append(zzi);
                sb.append(". Update status(onEngLoadedTimeout) is ");
                sb.append(i);
                sb.append(". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is ");
                sb.append(valueOf2);
                sb.append(" ms. Total latency(onEngLoadedTimeout) is ");
                sb.append(currentTimeMillis);
                sb.append(" ms. Rejecting.");
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    final /* synthetic */ Object zzg() {
        return this.zza;
    }

    final /* synthetic */ zzfrj zzh() {
        return this.zze;
    }

    final /* synthetic */ zzbul zzi() {
        return this.zzh;
    }

    final /* synthetic */ void zzj(zzbul zzbulVar) {
        this.zzh = zzbulVar;
    }

    final /* synthetic */ int zzk() {
        return this.zzi;
    }

    final /* synthetic */ void zzl(int i) {
        this.zzi = i;
    }
}
