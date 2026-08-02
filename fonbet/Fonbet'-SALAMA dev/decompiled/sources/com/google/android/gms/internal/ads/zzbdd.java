package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import P2.B;
import P2.G;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.AbstractC1514a;
import p.AbstractC1520g;
import p.C1530q;
import y2.h;
import y2.i;

/* loaded from: classes.dex */
public final class zzbdd {
    private final ScheduledExecutorService zza;
    private final G zzb;
    private final B zzc;
    private final zzdqv zzd;
    private Runnable zze;
    private zzbda zzf;
    private C1530q zzg;
    private String zzh;
    private long zzi = 0;
    private long zzj;
    private JSONArray zzk;
    private Context zzl;

    public zzbdd(ScheduledExecutorService scheduledExecutorService, G g3, B b7, zzdqv zzdqvVar) {
        this.zza = scheduledExecutorService;
        this.zzb = g3;
        this.zzc = b7;
        this.zzd = zzdqvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() <= r5.zzi) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        r0 = r5.zzg;
        r1 = android.net.Uri.parse(r5.zzh);
        r0.getClass();
        r0.d(r1, null, new android.os.Bundle());
        r5.zza.schedule(r5.zze, ((java.lang.Long) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzjR)).longValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (((java.lang.Boolean) F2.C0254t.f2723d.f2726c.zzb(com.google.android.gms.internal.ads.zzbby.zzjQ)).booleanValue() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzj() {
        zzbda zzbdaVar = this.zzf;
        if (zzbdaVar == null) {
            int i7 = J.f3546b;
            j.d("PACT callback is not present, please initialize the PawCustomTabsImpl.");
        } else {
            if (zzbdaVar.zza().booleanValue()) {
                return;
            }
            if (this.zzh != null && this.zzg != null && this.zza != null) {
                if (this.zzi != 0) {
                    o.f1952C.j.getClass();
                }
            }
            J.k("PACT max retry connection duration timed out");
        }
    }

    private final void zzk(JSONObject jSONObject) {
        try {
            if (this.zzk == null) {
                this.zzk = new JSONArray((String) C0254t.f2723d.f2726c.zzb(zzbby.zzjT));
            }
            jSONObject.put("eids", this.zzk);
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error fetching the PACT active eids JSON: ", e7);
        }
    }

    public final C1530q zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbed.zzd.zze()).booleanValue() ? ((Long) zzbed.zzg.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.a());
        }
        return jSONObject;
    }

    public final JSONObject zzd(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        jSONObject.put("sdk_ttl_ms", ((Boolean) zzbed.zzd.zze()).booleanValue() ? ((Long) zzbed.zzg.zze()).longValue() : 0L);
        zzk(jSONObject);
        if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
            jSONObject.put("as", this.zzc.a());
        }
        return jSONObject;
    }

    public final void zzf() {
        o.f1952C.j.getClass();
        this.zzi = SystemClock.elapsedRealtime() + ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzjP)).intValue();
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdb
                @Override // java.lang.Runnable
                public final void run() {
                    zzbdd.this.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, AbstractC1520g abstractC1520g, String str, AbstractC1514a abstractC1514a) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (abstractC1520g == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzbda zzbdaVar = new zzbda(this, abstractC1514a, this.zzd);
        this.zzf = zzbdaVar;
        C1530q c3 = abstractC1520g.c(zzbdaVar);
        this.zzg = c3;
        if (c3 == null) {
            int i7 = J.f3546b;
            j.d("CustomTabsClient failed to create new session.");
        }
        Q0.a.n0(this.zzd, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            C1530q c1530q = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.a());
            }
            c1530q.c(jSONObject.toString(), null);
            zzbdc zzbdcVar = new zzbdc(this, str);
            if (((Boolean) zzbed.zzd.zze()).booleanValue()) {
                this.zzb.b(this.zzg, zzbdcVar);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            R2.a.a(this.zzl, new i((h) new h(6).a(bundle, AdMobAdapter.class)), zzbdcVar);
        } catch (JSONException e7) {
            int i7 = J.f3546b;
            j.e("Error creating JSON: ", e7);
        }
    }

    public final void zzi(long j) {
        this.zzj = j;
    }
}
