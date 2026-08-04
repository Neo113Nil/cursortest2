package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.C;
import I2.J;
import I2.P;
import I2.r;
import J2.j;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class zzbnc {
    private final Context zzb;
    private final String zzc;
    private final VersionInfoParcel zzd;
    private final zzfgb zze;
    private final r zzf;
    private final r zzg;
    private zzbnb zzh;
    private final Object zza = new Object();
    private int zzi = 1;

    public zzbnc(Context context, VersionInfoParcel versionInfoParcel, String str, r rVar, r rVar2, zzfgb zzfgbVar) {
        this.zzc = str;
        this.zzb = context.getApplicationContext();
        this.zzd = versionInfoParcel;
        this.zze = zzfgbVar;
        this.zzf = rVar;
        this.zzg = rVar2;
    }

    public static /* synthetic */ void zzg(zzbnc zzbncVar, zzblx zzblxVar) {
        if (zzblxVar.zzi()) {
            zzbncVar.zzi = 1;
        }
    }

    public static void zzh(zzbnc zzbncVar, zzauo zzauoVar, zzbnb zzbnbVar) {
        o.f1952C.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            J.k("loadJavascriptEngine > Before createJavascriptEngine");
            zzbmf zzbmfVar = new zzbmf(zzbncVar.zzb, zzbncVar.zzd, null, null);
            J.k("loadJavascriptEngine > After createJavascriptEngine");
            J.k("loadJavascriptEngine > Before setting new engine loaded listener");
            zzbmfVar.zzk(new zzbmi(zzbncVar, arrayList, jCurrentTimeMillis, zzbnbVar, zzbmfVar));
            J.k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            zzbmfVar.zzq("/jsLoaded", new zzbmn(zzbncVar, jCurrentTimeMillis, zzbnbVar, zzbmfVar));
            C c3 = new C();
            zzbmo zzbmoVar = new zzbmo(zzbncVar, null, zzbmfVar, c3);
            c3.f3528a = zzbmoVar;
            J.k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            zzbmfVar.zzq("/requestReload", zzbmoVar);
            J.k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(zzbncVar.zzc)));
            if (zzbncVar.zzc.endsWith(".js")) {
                J.k("loadJavascriptEngine > Before newEngine.loadJavascript");
                zzbmfVar.zzh(zzbncVar.zzc);
                J.k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (zzbncVar.zzc.startsWith("<html>")) {
                J.k("loadJavascriptEngine > Before newEngine.loadHtml");
                zzbmfVar.zzf(zzbncVar.zzc);
                J.k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                J.k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                zzbmfVar.zzg(zzbncVar.zzc);
                J.k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            J.k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            P.f3579l.postDelayed(new zzbmq(zzbncVar, zzbnbVar, zzbmfVar, arrayList, jCurrentTimeMillis), ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzc)).intValue());
        } catch (Throwable th) {
            int i7 = J.f3546b;
            j.e("Error creating webview.", th);
            zzbbp zzbbpVar = zzbby.zzhI;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                zzbnbVar.zzh(th, "SdkJavascriptFactory.loadJavascriptEngine.createJavascriptEngine");
                return;
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhK)).booleanValue()) {
                o.f1952C.f1961g.zzv(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnbVar.zzg();
            } else {
                o.f1952C.f1961g.zzw(th, "SdkJavascriptFactory.loadJavascriptEngine");
                zzbnbVar.zzg();
            }
        }
    }

    public static void zzi(zzbnc zzbncVar, zzbnb zzbnbVar, final zzblx zzblxVar, ArrayList arrayList, long j) {
        J.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (zzbncVar.zza) {
            try {
                J.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
                if (zzbnbVar.zze() != -1 && zzbnbVar.zze() != 1) {
                    zzbbp zzbbpVar = zzbby.zzhI;
                    C0254t c0254t = C0254t.f2723d;
                    if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                        zzbnbVar.zzh(new TimeoutException("Unable to receive /jsLoaded GMSG."), "SdkJavascriptFactory.loadJavascriptEngine.setLoadedListener");
                    } else {
                        zzbnbVar.zzg();
                    }
                    zzgbn zzgbnVar = zzbza.zzf;
                    Objects.requireNonNull(zzblxVar);
                    zzgbnVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzblxVar.zzc();
                        }
                    });
                    String strValueOf = String.valueOf(c0254t.f2726c.zzb(zzbby.zzb));
                    int iZze = zzbnbVar.zze();
                    int i7 = zzbncVar.zzi;
                    String strValueOf2 = String.valueOf(arrayList.get(0));
                    o.f1952C.j.getClass();
                    J.k("Could not receive /jsLoaded in " + strValueOf + " ms. JS engine session reference status(onEngLoadedTimeout) is " + iZze + ". Update status(onEngLoadedTimeout) is " + i7 + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + strValueOf2 + " ms. Total latency(onEngLoadedTimeout) is " + (System.currentTimeMillis() - j) + " ms. Rejecting.");
                    J.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                    return;
                }
                J.k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbmw zzb(zzauo zzauoVar) {
        J.k("getEngine: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                J.k("getEngine: Lock acquired");
                J.k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.zza) {
                    try {
                        J.k("refreshIfDestroyed: Lock acquired");
                        zzbnb zzbnbVar = this.zzh;
                        if (zzbnbVar != null && this.zzi == 0) {
                            zzbnbVar.zzj(new zzbzj() { // from class: com.google.android.gms.internal.ads.zzbmk
                                @Override // com.google.android.gms.internal.ads.zzbzj
                                public final void zza(Object obj) {
                                    zzbnc.zzg(this.zza, (zzblx) obj);
                                }
                            }, new zzbzh() { // from class: com.google.android.gms.internal.ads.zzbml
                                @Override // com.google.android.gms.internal.ads.zzbzh
                                public final void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                J.k("refreshIfDestroyed: Lock released");
                zzbnb zzbnbVar2 = this.zzh;
                if (zzbnbVar2 != null && zzbnbVar2.zze() != -1) {
                    int i7 = this.zzi;
                    if (i7 == 0) {
                        J.k("getEngine (NO_UPDATE): Lock released");
                        return this.zzh.zza();
                    }
                    if (i7 != 1) {
                        J.k("getEngine (UPDATING): Lock released");
                        return this.zzh.zza();
                    }
                    this.zzi = 2;
                    zzd(null);
                    J.k("getEngine (PENDING_UPDATE): Lock released");
                    return this.zzh.zza();
                }
                this.zzi = 2;
                this.zzh = zzd(null);
                J.k("getEngine (NULL or REJECTED): Lock released");
                return this.zzh.zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzbnb zzd(zzauo zzauoVar) {
        zzffn zzffnVarZza = zzffm.zza(this.zzb, 6);
        zzffnVarZza.zzi();
        final zzbnb zzbnbVar = new zzbnb(this.zzg);
        J.k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final zzauo zzauoVar2 = null;
        zzbza.zzf.execute(new Runnable(zzauoVar2, zzbnbVar) { // from class: com.google.android.gms.internal.ads.zzbmm
            public final /* synthetic */ zzbnb zzb;

            {
                this.zzb = zzbnbVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbnc.zzh(this.zza, null, this.zzb);
            }
        });
        J.k("loadNewJavascriptEngine: Promise created");
        zzbnbVar.zzj(new zzbmr(this, zzbnbVar, zzffnVarZza), new zzbms(this, zzbnbVar, zzffnVarZza));
        return zzbnbVar;
    }
}
