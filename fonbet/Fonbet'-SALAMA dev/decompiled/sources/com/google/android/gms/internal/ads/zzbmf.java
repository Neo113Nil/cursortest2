package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import I2.J;
import I2.K;
import I2.P;
import J2.d;
import J2.j;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import m3.e;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbmf implements zzblx, zzblw {
    private final zzceb zza;

    public zzbmf(Context context, VersionInfoParcel versionInfoParcel, zzauo zzauoVar, E2.a aVar) {
        zzceo zzceoVar = o.f1952C.f1958d;
        zzceb zza = zzceo.zza(context, zzcfv.zza(), "", false, false, null, null, versionInfoParcel, null, null, null, zzbaw.zza(), null, null, null, null, null);
        this.zza = zza;
        zza.zzF().setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        d dVar = C0252s.f2717f.f2718a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            J.k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            J.k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (P.f3579l.post(runnable)) {
                return;
            }
            j.g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final void zza(final String str) {
        J.k("invokeJavascript on adWebView from js");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmb
            @Override // java.lang.Runnable
            public final void run() {
                zzbmf.this.zza.zza(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final /* synthetic */ void zzb(String str, String str2) {
        zzblv.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final /* synthetic */ void zzd(String str, Map map) {
        zzblv.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzblu
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzblv.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzf(final String str) {
        J.k("loadHtml on adWebView from html");
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmc
            @Override // java.lang.Runnable
            public final void run() {
                zzbmf.this.zza.loadData(str, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzg(final String str) {
        J.k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzblz
            @Override // java.lang.Runnable
            public final void run() {
                zzbmf.this.zza.loadUrl(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzh(String str) {
        J.k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = "<!DOCTYPE html><html><head><script src=\"" + str + "\"></script></head><body></body></html>";
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmd
            @Override // java.lang.Runnable
            public final void run() {
                zzbmf.this.zza.loadData(str2, "text/html", "UTF-8");
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final boolean zzi() {
        return this.zza.zzaE();
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final zzbne zzj() {
        return new zzbne(this);
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zzk(final zzbmi zzbmiVar) {
        zzcft zzN = this.zza.zzN();
        Objects.requireNonNull(zzbmiVar);
        zzN.zzJ(new zzcfs() { // from class: com.google.android.gms.internal.ads.zzbma
            @Override // com.google.android.gms.internal.ads.zzcfs
            public final void zza() {
                o.f1952C.j.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                zzbmi zzbmiVar2 = zzbmi.this;
                final long j = zzbmiVar2.zzc;
                final ArrayList arrayList = zzbmiVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j));
                J.k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                K k7 = P.f3579l;
                final zzbnc zzbncVar = zzbmiVar2.zza;
                final zzbnb zzbnbVar = zzbmiVar2.zzd;
                final zzblx zzblxVar = zzbmiVar2.zze;
                k7.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmj
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnc.zzi(zzbnc.this, zzbnbVar, zzblxVar, arrayList, j);
                    }
                }, ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzb)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmg
    public final /* synthetic */ void zzp(String str, JSONObject jSONObject) {
        zzblv.zzd(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzq(String str, zzbiz zzbizVar) {
        this.zza.zzag(str, new zzbme(this, zzbizVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnd
    public final void zzr(String str, final zzbiz zzbizVar) {
        this.zza.zzaA(str, new e() { // from class: com.google.android.gms.internal.ads.zzbly
            @Override // m3.e
            public final boolean apply(Object obj) {
                zzbiz zzbizVar2;
                zzbiz zzbizVar3 = (zzbiz) obj;
                if (!(zzbizVar3 instanceof zzbme)) {
                    return false;
                }
                zzbiz zzbizVar4 = zzbiz.this;
                zzbizVar2 = ((zzbme) zzbizVar3).zzb;
                return zzbizVar2.equals(zzbizVar4);
            }
        });
    }
}
