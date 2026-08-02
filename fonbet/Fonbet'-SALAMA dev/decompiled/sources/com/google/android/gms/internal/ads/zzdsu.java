package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import I2.L;
import I2.M;
import J2.j;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import io.sentry.ProfilingTraceData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdsu {
    private final long zzd;
    private final Context zzf;
    private final WeakReference zzg;
    private final zzdog zzh;
    private final Executor zzi;
    private final Executor zzj;
    private final ScheduledExecutorService zzk;
    private final zzdrb zzl;
    private final VersionInfoParcel zzm;
    private final zzdbo zzo;
    private final zzfgb zzp;
    private boolean zza = false;
    private boolean zzb = false;
    private boolean zzc = false;
    private final zzbzf zze = new zzbzf();
    private final Map zzn = new ConcurrentHashMap();
    private boolean zzq = true;

    public zzdsu(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdog zzdogVar, ScheduledExecutorService scheduledExecutorService, zzdrb zzdrbVar, VersionInfoParcel versionInfoParcel, zzdbo zzdboVar, zzfgb zzfgbVar) {
        this.zzh = zzdogVar;
        this.zzf = context;
        this.zzg = weakReference;
        this.zzi = executor2;
        this.zzk = scheduledExecutorService;
        this.zzj = executor;
        this.zzl = zzdrbVar;
        this.zzm = versionInfoParcel;
        this.zzo = zzdboVar;
        this.zzp = zzfgbVar;
        o.f1952C.j.getClass();
        this.zzd = SystemClock.elapsedRealtime();
        zzv("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    public static /* synthetic */ Object zzf(zzdsu zzdsuVar, zzffn zzffnVar) {
        zzdsuVar.zze.zzc(Boolean.TRUE);
        zzffnVar.zzg(true);
        zzdsuVar.zzp.zzc(zzffnVar.zzm());
        return null;
    }

    public static void zzi(zzdsu zzdsuVar, Object obj, zzbzf zzbzfVar, String str, long j, zzffn zzffnVar) {
        synchronized (obj) {
            try {
                if (!zzbzfVar.isDone()) {
                    o.f1952C.j.getClass();
                    zzdsuVar.zzv(str, false, "Timeout.", (int) (SystemClock.elapsedRealtime() - j));
                    zzdsuVar.zzl.zzb(str, ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                    zzdsuVar.zzo.zzb(str, ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                    zzfgb zzfgbVar = zzdsuVar.zzp;
                    zzffnVar.zzc("Timeout");
                    zzffnVar.zzg(false);
                    zzfgbVar.zzc(zzffnVar.zzm());
                    zzbzfVar.zzc(Boolean.FALSE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzj(zzdsu zzdsuVar) {
        zzdsuVar.zzl.zze();
        zzdsuVar.zzo.zze();
        zzdsuVar.zzb = true;
    }

    public static void zzl(zzdsu zzdsuVar) {
        synchronized (zzdsuVar) {
            try {
                if (zzdsuVar.zzc) {
                    return;
                }
                o.f1952C.j.getClass();
                zzdsuVar.zzv("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (SystemClock.elapsedRealtime() - zzdsuVar.zzd));
                zzdsuVar.zzl.zzb("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                zzdsuVar.zzo.zzb("com.google.android.gms.ads.MobileAds", ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
                zzdsuVar.zze.zzd(new Exception());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void zzm(zzdsu zzdsuVar, String str, zzblb zzblbVar, zzfby zzfbyVar, List list) {
        try {
            try {
                if (Objects.equals(str, "com.google.ads.mediation.admob.AdMobAdapter")) {
                    zzblbVar.zzf();
                    return;
                }
                Context context = (Context) zzdsuVar.zzg.get();
                if (context == null) {
                    context = zzdsuVar.zzf;
                }
                zzfbyVar.zzi(context, zzblbVar, list);
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.e("", e7);
            }
        } catch (RemoteException e8) {
            throw new zzfuf(e8);
        } catch (zzfbh unused) {
            zzblbVar.zze("Failed to initialize adapter. " + str + " does not implement the initialize() method.");
        }
    }

    public static void zzo(final zzdsu zzdsuVar, String str) {
        int i7 = 5;
        final zzffn zza = zzffm.zza(zzdsuVar.zzf, 5);
        zza.zzi();
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                final String next = keys.next();
                final zzffn zza2 = zzffm.zza(zzdsuVar.zzf, i7);
                zza2.zzi();
                zza2.zzd(next);
                final Object obj = new Object();
                final zzbzf zzbzfVar = new zzbzf();
                I3.b zzo = zzgbc.zzo(zzbzfVar, ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzbZ)).longValue(), TimeUnit.SECONDS, zzdsuVar.zzk);
                zzdsuVar.zzl.zzc(next);
                zzdsuVar.zzo.zzc(next);
                o.f1952C.j.getClass();
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                zzo.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdsu.zzi(zzdsu.this, obj, zzbzfVar, next, elapsedRealtime, zza2);
                    }
                }, zzdsuVar.zzi);
                arrayList.add(zzo);
                final zzdst zzdstVar = new zzdst(zzdsuVar, obj, next, elapsedRealtime, zza2, zzbzfVar);
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (optJSONObject != null) {
                    try {
                        JSONArray jSONArray = optJSONObject.getJSONArray("data");
                        int i8 = 0;
                        while (i8 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            String optString = jSONObject2.optString("format", "");
                            JSONObject optJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (optJSONObject2 != null) {
                                Iterator<String> keys2 = optJSONObject2.keys();
                                while (keys2.hasNext()) {
                                    String next2 = keys2.next();
                                    bundle.putString(next2, optJSONObject2.optString(next2, ""));
                                    jSONArray = jSONArray;
                                }
                            }
                            JSONArray jSONArray2 = jSONArray;
                            arrayList2.add(new zzblh(optString, bundle));
                            i8++;
                            jSONArray = jSONArray2;
                        }
                    } catch (JSONException unused) {
                    }
                }
                zzdsuVar.zzv(next, false, "", 0);
                try {
                    final zzfby zzc = zzdsuVar.zzh.zzc(next, new JSONObject());
                    zzdsuVar.zzj.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsp
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdsu.zzm(zzdsu.this, next, zzdstVar, zzc, arrayList2);
                        }
                    });
                } catch (zzfbh e7) {
                    try {
                        String str2 = "Failed to create Adapter.";
                        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmU)).booleanValue()) {
                            str2 = "Failed to create Adapter. " + e7.getMessage();
                        }
                        zzdstVar.zze(str2);
                    } catch (RemoteException e8) {
                        int i9 = J.f3546b;
                        j.e("", e8);
                    }
                }
                i7 = 5;
            }
            zzgbc.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdsl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzdsu.zzf(zzdsu.this, zza);
                    return null;
                }
            }, zzdsuVar.zzi);
        } catch (JSONException e9) {
            J.l("Malformed CLD response", e9);
            zzdsuVar.zzo.zza("MalformedJson");
            zzdsuVar.zzl.zza("MalformedJson");
            zzdsuVar.zze.zzd(e9);
            o.f1952C.f1961g.zzw(e9, "AdapterInitializer.updateAdapterStatus");
            zzfgb zzfgbVar = zzdsuVar.zzp;
            zza.zzh(e9);
            zza.zzg(false);
            zzfgbVar.zzc(zza.zzm());
        }
    }

    private final synchronized I3.b zzu() {
        o oVar = o.f1952C;
        String zzc = ((M) oVar.f1961g.zzi()).n().zzc();
        if (!TextUtils.isEmpty(zzc)) {
            return zzgbc.zzh(zzc);
        }
        final zzbzf zzbzfVar = new zzbzf();
        L zzi = oVar.f1961g.zzi();
        ((M) zzi).f3553c.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsm
            @Override // java.lang.Runnable
            public final void run() {
                r0.zzi.execute(new Runnable(zzdsu.this, zzbzfVar) { // from class: com.google.android.gms.internal.ads.zzdso
                    public final /* synthetic */ zzbzf zza;

                    {
                        this.zza = r2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String zzc2 = ((M) o.f1952C.f1961g.zzi()).n().zzc();
                        boolean isEmpty = TextUtils.isEmpty(zzc2);
                        zzbzf zzbzfVar2 = this.zza;
                        if (isEmpty) {
                            zzbzfVar2.zzd(new Exception());
                        } else {
                            zzbzfVar2.zzc(zzc2);
                        }
                    }
                });
            }
        });
        return zzbzfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv(String str, boolean z4, String str2, int i7) {
        this.zzn.put(str, new zzbkx(str, z4, i7, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zzn.keySet()) {
            zzbkx zzbkxVar = (zzbkx) this.zzn.get(str);
            arrayList.add(new zzbkx(str, zzbkxVar.zzb, zzbkxVar.zzc, zzbkxVar.zzd));
        }
        return arrayList;
    }

    public final void zzq() {
        this.zzq = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbee.zza.zze()).booleanValue()) {
            int i7 = this.zzm.f10836c;
            zzbbp zzbbpVar = zzbby.zzbY;
            C0254t c0254t = C0254t.f2723d;
            if (i7 >= ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue() && this.zzq) {
                if (this.zza) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.zza) {
                            return;
                        }
                        this.zzl.zzf();
                        this.zzo.zzf();
                        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsq
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdsu.zzj(zzdsu.this);
                            }
                        }, this.zzi);
                        this.zza = true;
                        I3.b zzu = zzu();
                        this.zzk.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzdsu.zzl(zzdsu.this);
                            }
                        }, ((Long) c0254t.f2726c.zzb(zzbby.zzca)).longValue(), TimeUnit.SECONDS);
                        zzgbc.zzr(zzu, new zzdss(this), this.zzi);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.zza) {
            return;
        }
        zzv("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.zze.zzc(Boolean.FALSE);
        this.zza = true;
        this.zzb = true;
    }

    public final void zzs(final zzble zzbleVar) {
        this.zze.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsn
            @Override // java.lang.Runnable
            public final void run() {
                zzdsu zzdsuVar = zzdsu.this;
                try {
                    zzbleVar.zzb(zzdsuVar.zzg());
                } catch (RemoteException e7) {
                    int i7 = J.f3546b;
                    j.e("", e7);
                }
            }
        }, this.zzj);
    }

    public final boolean zzt() {
        return this.zzb;
    }
}
