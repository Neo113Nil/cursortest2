package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0252s;
import F2.C0254t;
import F2.InterfaceC0257u0;
import I2.J;
import I2.L;
import I2.M;
import J2.d;
import J2.j;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdtp implements zzduq, zzdta {
    private final zzdua zza;
    private final zzdur zzb;
    private final zzdtb zzc;
    private final zzdtk zzd;
    private final zzdsz zze;
    private final zzdum zzf;
    private final zzdtw zzg;
    private final zzdtw zzh;
    private final String zzi;
    private final Context zzj;
    private final String zzk;
    private JSONObject zzp;
    private boolean zzs;
    private int zzt;
    private boolean zzu;
    private final Map zzl = new HashMap();
    private final Map zzm = new HashMap();
    private final Map zzn = new HashMap();
    private String zzo = "{}";
    private long zzq = Long.MAX_VALUE;
    private zzdtl zzr = zzdtl.NONE;
    private zzdto zzv = zzdto.UNKNOWN;
    private long zzw = 0;
    private String zzx = "";

    public zzdtp(zzdua zzduaVar, zzdur zzdurVar, zzdtb zzdtbVar, Context context, VersionInfoParcel versionInfoParcel, zzdtk zzdtkVar, zzdum zzdumVar, zzdtw zzdtwVar, zzdtw zzdtwVar2, String str) {
        this.zza = zzduaVar;
        this.zzb = zzdurVar;
        this.zzc = zzdtbVar;
        this.zze = new zzdsz(context);
        this.zzi = versionInfoParcel.f10834a;
        this.zzk = str;
        this.zzd = zzdtkVar;
        this.zzf = zzdumVar;
        this.zzg = zzdtwVar;
        this.zzh = zzdtwVar2;
        this.zzj = context;
        o.f1952C.f1967n.f3637g = this;
    }

    private final synchronized void zzA(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzx(jSONObject.optBoolean("isTestMode", false), false);
            zzw((zzdtl) Enum.valueOf(zzdtl.class, jSONObject.optString("gesture", "NONE")), false);
            this.zzo = jSONObject.optString("networkExtras", "{}");
            this.zzq = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject zzt() {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.zzl.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (zzdtd zzdtdVar : (List) entry.getValue()) {
                    if (zzdtdVar.zzg()) {
                        jSONArray.put(zzdtdVar.zzd());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    private final void zzu() {
        String str;
        String str2;
        this.zzu = true;
        this.zzd.zzc();
        this.zza.zzi(this);
        this.zzb.zzd(this);
        this.zzc.zzd(this);
        this.zzf.zzf(this);
        zzbbp zzbbpVar = zzbby.zzjx;
        C0254t c0254t = C0254t.f2723d;
        if (!TextUtils.isEmpty((CharSequence) c0254t.f2726c.zzb(zzbbpVar))) {
            this.zzg.zzb(PreferenceManager.getDefaultSharedPreferences(this.zzj), Arrays.asList(((String) c0254t.f2726c.zzb(zzbbpVar)).split(",")));
        }
        zzbbp zzbbpVar2 = zzbby.zzjy;
        if (!TextUtils.isEmpty((CharSequence) c0254t.f2726c.zzb(zzbbpVar2))) {
            this.zzh.zzb(this.zzj.getSharedPreferences("admob", 0), Arrays.asList(((String) c0254t.f2726c.zzb(zzbbpVar2)).split(",")));
        }
        o oVar = o.f1952C;
        M m7 = (M) oVar.f1961g.zzi();
        m7.l();
        synchronized (m7.f3551a) {
            str = m7.f3573x;
        }
        zzA(str);
        M m8 = (M) oVar.f1961g.zzi();
        m8.l();
        synchronized (m8.f3551a) {
            str2 = m8.f3547A;
        }
        this.zzx = str2;
    }

    private final void zzv() {
        L zzi = o.f1952C.f1961g.zzi();
        String zzd = zzd();
        M m7 = (M) zzi;
        m7.getClass();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue()) {
            m7.l();
            synchronized (m7.f3551a) {
                try {
                    if (m7.f3573x.equals(zzd)) {
                        return;
                    }
                    m7.f3573x = zzd;
                    SharedPreferences.Editor editor = m7.f3557g;
                    if (editor != null) {
                        editor.putString("inspector_info", zzd);
                        m7.f3557g.apply();
                    }
                    m7.m();
                } finally {
                }
            }
        }
    }

    private final synchronized void zzw(zzdtl zzdtlVar, boolean z4) {
        try {
            if (this.zzr != zzdtlVar) {
                if (zzq()) {
                    zzy();
                }
                this.zzr = zzdtlVar;
                if (zzq()) {
                    zzz();
                }
                if (z4) {
                    zzv();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:9:0x0006, B:11:0x000a, B:13:0x001c, B:16:0x0029, B:18:0x0038, B:22:0x002d, B:24:0x0033), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void zzx(boolean z4, boolean z7) {
        try {
            if (this.zzs != z4) {
                this.zzs = z4;
                if (z4) {
                    if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                        if (!o.f1952C.f1967n.g()) {
                        }
                    }
                    zzz();
                    if (z7) {
                        zzv();
                        return;
                    }
                }
                if (!zzq()) {
                    zzy();
                }
                if (z7) {
                }
            }
        } finally {
        }
    }

    private final synchronized void zzy() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzb();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzb();
        }
    }

    private final synchronized void zzz() {
        int ordinal = this.zzr.ordinal();
        if (ordinal == 1) {
            this.zzb.zzc();
        } else {
            if (ordinal != 2) {
                return;
            }
            this.zzc.zzc();
        }
    }

    public final zzdtl zza() {
        return this.zzr;
    }

    public final synchronized I3.b zzb(String str) {
        zzbzf zzbzfVar;
        try {
            zzbzfVar = new zzbzf();
            if (this.zzm.containsKey(str)) {
                zzbzfVar.zzc((zzdtd) this.zzm.get(str));
            } else {
                if (!this.zzn.containsKey(str)) {
                    this.zzn.put(str, new ArrayList());
                }
                ((List) this.zzn.get(str)).add(zzbzfVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzbzfVar;
    }

    public final synchronized String zzc() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue() && zzq()) {
            long j = this.zzq;
            o.f1952C.j.getClass();
            if (j < System.currentTimeMillis() / 1000) {
                this.zzo = "{}";
                this.zzq = Long.MAX_VALUE;
                return "";
            }
            if (!this.zzo.equals("{}")) {
                return this.zzo;
            }
        }
        return "";
    }

    public final synchronized String zzd() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.zzs);
            jSONObject.put("gesture", this.zzr);
            long j = this.zzq;
            o.f1952C.j.getClass();
            if (j > System.currentTimeMillis() / 1000) {
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("networkExtrasExpirationSecs", this.zzq);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject zze() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.zzk)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.zzk);
                }
                jSONObject.put("internalSdkVersion", this.zzi);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.zzd.zza());
                zzbbp zzbbpVar = zzbby.zzju;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    String zzn = o.f1952C.f1961g.zzn();
                    if (!TextUtils.isEmpty(zzn)) {
                        jSONObject.put("plugin", zzn);
                    }
                }
                long j = this.zzq;
                o oVar = o.f1952C;
                oVar.j.getClass();
                if (j < System.currentTimeMillis() / 1000) {
                    this.zzo = "{}";
                }
                jSONObject.put("networkExtras", this.zzo);
                jSONObject.put("adSlots", zzt());
                jSONObject.put("appInfo", this.zze.zza());
                String zzc = ((M) oVar.f1961g.zzi()).n().zzc();
                if (!TextUtils.isEmpty(zzc)) {
                    jSONObject.put("cld", new JSONObject(zzc));
                }
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjk)).booleanValue() && (jSONObject2 = this.zzp) != null) {
                    String str = "Server data: " + jSONObject2.toString();
                    int i7 = J.f3546b;
                    j.b(str);
                    jSONObject.put("serverData", this.zzp);
                }
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                    jSONObject.put("openAction", this.zzv);
                    jSONObject.put("gesture", this.zzr);
                }
                jSONObject.put("isGamRegisteredTestDevice", oVar.f1967n.g());
                d dVar = C0252s.f2717f.f2718a;
                jSONObject.put("isSimulator", d.n());
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjw)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.zzx));
                }
                if (!TextUtils.isEmpty((CharSequence) c0254t.f2726c.zzb(zzbby.zzjy))) {
                    jSONObject.put("gmaDisk", this.zzh.zza());
                }
                if (!TextUtils.isEmpty((CharSequence) c0254t.f2726c.zzb(zzbby.zzjx))) {
                    jSONObject.put("userDisk", this.zzg.zza());
                }
            } catch (JSONException e7) {
                o.f1952C.f1961g.zzv(e7, "Inspector.toJson");
                int i8 = J.f3546b;
                j.h("Ad inspector encountered an error", e7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return jSONObject;
    }

    public final synchronized void zzf(String str, zzdtd zzdtdVar) {
        zzbbp zzbbpVar = zzbby.zziU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && zzq()) {
            if (this.zzt >= ((Integer) c0254t.f2726c.zzb(zzbby.zziW)).intValue()) {
                int i7 = J.f3546b;
                j.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.zzl.containsKey(str)) {
                this.zzl.put(str, new ArrayList());
            }
            this.zzt++;
            ((List) this.zzl.get(str)).add(zzdtdVar);
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjs)).booleanValue()) {
                String zzc = zzdtdVar.zzc();
                this.zzm.put(zzc, zzdtdVar);
                if (this.zzn.containsKey(zzc)) {
                    List list = (List) this.zzn.get(zzc);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((zzbzf) it.next()).zzc(zzdtdVar);
                    }
                    list.clear();
                }
            }
        }
    }

    public final void zzg() {
        String str;
        boolean z4;
        zzbbp zzbbpVar = zzbby.zziU;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
                M m7 = (M) o.f1952C.f1961g.zzi();
                m7.l();
                synchronized (m7.f3551a) {
                    z4 = m7.f3574y;
                }
                if (z4) {
                    zzu();
                    return;
                }
            }
            M m8 = (M) o.f1952C.f1961g.zzi();
            m8.l();
            synchronized (m8.f3551a) {
                str = m8.f3573x;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (new JSONObject(str).optBoolean("isTestMode", false)) {
                    zzu();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final synchronized void zzh(InterfaceC0257u0 interfaceC0257u0, zzdto zzdtoVar) {
        if (!zzq()) {
            try {
                interfaceC0257u0.zze(zzfcb.zzd(18, null, null));
                return;
            } catch (RemoteException unused) {
                int i7 = J.f3546b;
                j.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zziU)).booleanValue()) {
            this.zzv = zzdtoVar;
            this.zza.zzj(interfaceC0257u0, new zzbjt(this), new zzbjm(this.zzf), new zzbja(this));
            return;
        } else {
            try {
                interfaceC0257u0.zze(zzfcb.zzd(1, null, null));
                return;
            } catch (RemoteException unused2) {
                int i8 = J.f3546b;
                j.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void zzi(String str, long j) {
        this.zzo = str;
        this.zzq = j;
        zzv();
    }

    public final synchronized void zzj(String str) {
        this.zzx = str;
        ((M) o.f1952C.f1961g.zzi()).b(this.zzx);
    }

    public final synchronized void zzk(long j) {
        this.zzw += j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x000a, code lost:
    
        if (r2 != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzl(boolean z4) {
        if (!this.zzu) {
            if (z4) {
                zzu();
                if (!this.zzs) {
                    zzz();
                    return;
                }
            }
            if (zzq()) {
                return;
            }
            zzy();
        }
    }

    public final void zzm(zzdtl zzdtlVar) {
        zzw(zzdtlVar, true);
    }

    public final synchronized void zzn(JSONObject jSONObject) {
        this.zzp = jSONObject;
    }

    public final void zzo(boolean z4) {
        if (!this.zzu && z4) {
            zzu();
        }
        zzx(z4, true);
    }

    public final boolean zzp() {
        return this.zzp != null;
    }

    public final synchronized boolean zzq() {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjj)).booleanValue()) {
            return this.zzs || o.f1952C.f1967n.g();
        }
        return this.zzs;
    }

    public final synchronized boolean zzr() {
        return this.zzs;
    }

    public final boolean zzs() {
        return this.zzw < ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzjp)).longValue();
    }
}
