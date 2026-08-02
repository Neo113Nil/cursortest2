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
import n3.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
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
        zzhbc zzc2 = zzhdb.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhbd zzc3 = zzhbe.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhbe) zzc3.zzbr());
        zzhcs zzc4 = zzhct.zzc();
        zzc4.zzc(c.a(this.zzh).v());
        String str3 = versionInfoParcel.f10834a;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        d dVar = d.f11217b;
        Context context2 = this.zzh;
        dVar.getClass();
        long apkVersion = g.getApkVersion(context2);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhct) zzc4.zzbr());
        this.zzd = zzc2;
    }

    public static /* synthetic */ I3.b zzb(zzbwt zzbwtVar, Map map) {
        zzhcq zzhcqVar;
        I3.b zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (zzbwtVar.zzj) {
                            try {
                                int length = optJSONArray.length();
                                synchronized (zzbwtVar.zzj) {
                                    zzhcqVar = (zzhcq) zzbwtVar.zze.get(str);
                                }
                                if (zzhcqVar == null) {
                                    zzbwx.zza("Cannot find the corresponding resource object for " + str);
                                } else {
                                    for (int i7 = 0; i7 < length; i7++) {
                                        zzhcqVar.zza(optJSONArray.getJSONObject(i7).getString("threat_type"));
                                    }
                                    zzbwtVar.zza = (length > 0) | zzbwtVar.zza;
                                }
                            } finally {
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
                byte[] zzaV = ((zzhdb) zzbwtVar.zzd.zzbr()).zzaV();
                String str2 = zzbwtVar.zzi.zzb;
                new x(zzbwtVar.zzh);
                C0313v a2 = x.a(1, str2, null, zzaV);
                if (zzbwx.zzb()) {
                    a2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i9 = zzbwt.zzb;
                            zzbwx.zza("Pinged SB successfully.");
                        }
                    }, zzbza.zza);
                }
                zzm = zzgbc.zzm(a2, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzbwr
                    @Override // com.google.android.gms.internal.ads.zzfsw
                    public final Object apply(Object obj) {
                        int i9 = zzbwt.zzb;
                        return null;
                    }
                }, zzbza.zzg);
            } finally {
            }
        }
        return zzm;
    }

    public static /* synthetic */ void zzd(zzbwt zzbwtVar, Bitmap bitmap) {
        zzgvw zzt = zzgvy.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (zzbwtVar.zzj) {
            zzhbc zzhbcVar = zzbwtVar.zzd;
            zzhck zzc2 = zzhcm.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhbcVar.zzi((zzhcm) zzc2.zzbr());
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
            zzhcq zzd = zzhcr.zzd();
            int zza = zzhcp.zza(i7);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhbp zzc2 = zzhbs.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhbn zzc3 = zzhbo.zzc();
                        zzc3.zza(zzgvy.zzw(str2));
                        zzc3.zzb(zzgvy.zzw(str3));
                        zzc2.zza((zzhbo) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhbs) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            I3.b zzh = zzgbc.zzh(Collections.emptyMap());
            zzgaj zzgajVar = new zzgaj() { // from class: com.google.android.gms.internal.ads.zzbwo
                @Override // com.google.android.gms.internal.ads.zzgaj
                public final I3.b zza(Object obj) {
                    return zzbwt.zzb(zzbwt.this, (Map) obj);
                }
            };
            zzgbn zzgbnVar = zzbza.zzg;
            I3.b zzn = zzgbc.zzn(zzh, zzgajVar, zzgbnVar);
            I3.b zzo = zzgbc.zzo(zzn, 10L, TimeUnit.SECONDS, zzbza.zzd);
            zzgbc.zzr(zzn, new zzbws(this, zzo), zzgbnVar);
            zzc.add(zzo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f  */
    @Override // com.google.android.gms.internal.ads.zzbwy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            P p5 = o.f1952C.f1957c;
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e7) {
                    e = e7;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e8) {
                    e = e8;
                    int i7 = J.f3546b;
                    j.e("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i8 = J.f3546b;
                        j.g("Width or height of view is zero");
                    } catch (RuntimeException e9) {
                        int i9 = J.f3546b;
                        j.e("Fail to capture the webview", e9);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzbwx.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwp
                @Override // java.lang.Runnable
                public final void run() {
                    zzbwt.zzd(zzbwt.this, bitmap2);
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
