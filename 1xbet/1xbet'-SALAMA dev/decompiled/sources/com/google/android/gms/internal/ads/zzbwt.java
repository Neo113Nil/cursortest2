package com.google.android.gms.internal.ads;

import E2.o;
import I2.C0313v;
import I2.J;
import I2.P;
import I2.x;
import J2.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.d;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p097n3.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbwt implements zzbwy {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhbc zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbwv zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbwt(Context context, VersionInfoParcel versionInfoParcel, zzbwv zzbwvVar, String str, zzbwu zzbwuVar) {
        D.j(zzbwvVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbwvVar;
        Iterator it = zzbwvVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhbc zzhbcVarZzc = zzhdb.zzc();
        zzhbcVarZzc.zzn(9);
        zzhbcVarZzc.zzj(str);
        zzhbcVarZzc.zzh(str);
        zzhbd zzhbdVarZzc = zzhbe.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzhbdVarZzc.zza(str2);
        }
        zzhbcVarZzc.zzg((zzhbe) zzhbdVarZzc.zzbr());
        zzhcs zzhcsVarZzc = zzhct.zzc();
        zzhcsVarZzc.zzc(c.a(this.zzh).v());
        String str3 = versionInfoParcel.f10834a;
        if (str3 != null) {
            zzhcsVarZzc.zza(str3);
        }
        d dVar = d.f11217b;
        Context context2 = this.zzh;
        dVar.getClass();
        long apkVersion = g.getApkVersion(context2);
        if (apkVersion > 0) {
            zzhcsVarZzc.zzb(apkVersion);
        }
        zzhbcVarZzc.zzf((zzhct) zzhcsVarZzc.zzbr());
        this.zzd = zzhbcVarZzc;
    }

    public static /* synthetic */ I3.b zzb(zzbwt zzbwtVar, Map map) {
        zzhcq zzhcqVar;
        I3.b bVarZzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (jSONArrayOptJSONArray != null) {
                        synchronized (zzbwtVar.zzj) {
                            try {
                                int length = jSONArrayOptJSONArray.length();
                                synchronized (zzbwtVar.zzj) {
                                    try {
                                        zzhcqVar = (zzhcq) zzbwtVar.zze.get(str);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                if (zzhcqVar == null) {
                                    zzbwx.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i7 = 0; i7 < length; i7++) {
                                        zzhcqVar.zza(jSONArrayOptJSONArray.getJSONObject(i7).getString("threat_type"));
                                    }
                                    zzbwtVar.zza = (length > 0) | zzbwtVar.zza;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }
            } catch (JSONException e7) {
                if (((Boolean) zzbeg.zza.zze()).booleanValue()) {
                    int i8 = J.f3546b;
                    j.c("Failed to get SafeBrowsing metadata", e7);
                }
                return zzgbc.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (zzbwtVar.zza) {
            synchronized (zzbwtVar.zzj) {
                zzbwtVar.zzd.zzn(10);
            }
        }
        boolean z4 = zzbwtVar.zza;
        if (!(z4 && zzbwtVar.zzi.zzg) && (!(zzbwtVar.zzm && zzbwtVar.zzi.zzf) && (z4 || !zzbwtVar.zzi.zzd))) {
            return zzgbc.zzh(null);
        }
        synchronized (zzbwtVar.zzj) {
            try {
                Iterator it = zzbwtVar.zze.values().iterator();
                while (it.hasNext()) {
                    zzbwtVar.zzd.zzc((zzhcr) ((zzhcq) it.next()).zzbr());
                }
                zzbwtVar.zzd.zza(zzbwtVar.zzf);
                zzbwtVar.zzd.zzb(zzbwtVar.zzg);
                if (zzbwx.zzb()) {
                    StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + zzbwtVar.zzd.zzl() + "\n  clickUrl: " + zzbwtVar.zzd.zzk() + "\n  resources: \n");
                    for (zzhcr zzhcrVar : zzbwtVar.zzd.zzm()) {
                        sb.append("    [");
                        sb.append(zzhcrVar.zzc());
                        sb.append("] ");
                        sb.append(zzhcrVar.zzg());
                    }
                    zzbwx.zza(sb.toString());
                }
                byte[] bArrZzaV = ((zzhdb) zzbwtVar.zzd.zzbr()).zzaV();
                String str2 = zzbwtVar.zzi.zzb;
                new x(zzbwtVar.zzh);
                C0313v c0313vA = x.a(1, str2, null, bArrZzaV);
                if (zzbwx.zzb()) {
                    c0313vA.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i9 = zzbwt.zzb;
                            zzbwx.zza("Pinged SB successfully.");
                        }
                    }, zzbza.zza);
                }
                bVarZzm = zzgbc.zzm(c0313vA, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbwr
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        int i9 = zzbwt.zzb;
                        return null;
                    }
                }, zzbza.zzg);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return bVarZzm;
    }

    public static /* synthetic */ void zzd(zzbwt zzbwtVar, Bitmap bitmap) {
        zzgvw zzgvwVarZzt = zzgvy.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzgvwVarZzt);
        synchronized (zzbwtVar.zzj) {
            zzhbc zzhbcVar = zzbwtVar.zzd;
            zzhck zzhckVarZzc = zzhcm.zzc();
            zzhckVarZzc.zza(zzgvwVarZzt.zzb());
            zzhckVarZzc.zzb("image/png");
            zzhckVarZzc.zzc(2);
            zzhbcVar.zzi((zzhcm) zzhckVarZzc.zzbr());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final zzbwv zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zze(String str, Map map, int i7) {
        synchronized (this.zzj) {
            if (i7 == 3) {
                try {
                    this.zzm = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.zze.containsKey(str)) {
                if (i7 == 3) {
                    ((zzhcq) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhcq zzhcqVarZzd = zzhcr.zzd();
            int iZza = zzhcp.zza(i7);
            if (iZza != 0) {
                zzhcqVarZzd.zze(iZza);
            }
            zzhcqVarZzd.zzb(this.zze.size());
            zzhcqVarZzd.zzd(str);
            zzhbp zzhbpVarZzc = zzhbs.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhbn zzhbnVarZzc = zzhbo.zzc();
                        zzhbnVarZzc.zza(zzgvy.zzw(str2));
                        zzhbnVarZzc.zzb(zzgvy.zzw(str3));
                        zzhbpVarZzc.zza((zzhbo) zzhbnVarZzc.zzbr());
                    }
                }
            }
            zzhcqVarZzd.zzc((zzhbs) zzhbpVarZzc.zzbr());
            this.zze.put(str, zzhcqVarZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            I3.b bVarZzh = zzgbc.zzh(Collections.emptyMap());
            zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzbwo
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzbwt.zzb(this.zza, (Map) obj);
                }
            };
            zzgbn zzgbnVar = zzbza.zzg;
            I3.b bVarZzn = zzgbc.zzn(bVarZzh, zzgajVar, zzgbnVar);
            I3.b bVarZzo = zzgbc.zzo(bVarZzn, 10L, TimeUnit.SECONDS, zzbza.zzd);
            zzgbc.zzr(bVarZzn, new zzbws(this, bVarZzo), zzgbnVar);
            zzc.add(bVarZzo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzg(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.zzi.zzc && !this.zzl) {
            P p5 = o.f1952C.f1957c;
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e7) {
                        e = e7;
                        int i7 = J.f3546b;
                        j.e("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e8) {
                    e = e8;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            int i8 = J.f3546b;
                            j.g("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e9) {
                        int i9 = J.f3546b;
                        j.e("Fail to capture the webview", e9);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                zzbwx.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwp
                @Override // java.lang.Runnable
                public final void run() {
                    zzbwt.zzd(this.zza, bitmap);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzbza.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzh(String str) {
        synchronized (this.zzj) {
            try {
                if (str == null) {
                    this.zzd.zzd();
                } else {
                    this.zzd.zze(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzi() {
        return this.zzi.zzc && !this.zzl;
    }
}
