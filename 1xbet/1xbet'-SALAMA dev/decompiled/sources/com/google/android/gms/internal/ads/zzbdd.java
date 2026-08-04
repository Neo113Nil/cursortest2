package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import P2.B;
import P2.G;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p109p.g;
import p109p.q;
import p167y2.h;
import p167y2.i;

/* JADX INFO: loaded from: classes.dex */
public final class zzbdd {
    private final ScheduledExecutorService zza;
    private final G zzb;
    private final B zzc;
    private final zzdqv zzd;
    private Runnable zze;
    private zzbda zzf;
    private q zzg;
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
    /* JADX WARN: Code duplicated, block: B:21:0x003e  */
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
            return;
        }
        if (zzbdaVar.zza().booleanValue()) {
            return;
        }
        if (this.zzh != null && this.zzg != null && this.zza != null) {
            if (this.zzi == 0) {
            } else {
                o.f1952C.j.getClass();
                if (SystemClock.elapsedRealtime() > this.zzi) {
                }
            }
            q qVar = this.zzg;
            Uri uri = Uri.parse(this.zzh);
            qVar.getClass();
            qVar.d(uri, null, new Bundle());
            this.zza.schedule(this.zze, ((Long) C0254t.f2723d.f2726c.zzb(zzbby.zzjR)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        J.k("PACT max retry connection duration timed out");
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

    public final q zzb() {
        return this.zzg;
    }

    public final JSONObject zzc(String str, String str2) throws JSONException {
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

    public final JSONObject zzd(String str, String str2) throws JSONException {
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
        this.zzi = SystemClock.elapsedRealtime() + ((long) ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzjP)).intValue());
        if (this.zze == null) {
            this.zze = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzj();
                }
            };
        }
        zzj();
    }

    public final void zzg(Context context, g gVar, String str, p109p.a aVar) {
        if (context == null) {
            throw new IllegalArgumentException("App Context parameter is null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Origin parameter is empty or null");
        }
        if (gVar == null) {
            throw new IllegalArgumentException("CustomTabsClient parameter is null");
        }
        this.zzl = context;
        this.zzh = str;
        zzbda zzbdaVar = new zzbda(this, aVar, this.zzd);
        this.zzf = zzbdaVar;
        q qVarC = gVar.c(zzbdaVar);
        this.zzg = qVarC;
        if (qVarC == null) {
            int i7 = J.f3546b;
            j.d("CustomTabsClient failed to create new session.");
        }
        Q0.a.n0(this.zzd, "pact_action", new Pair("pe", "pact_init"));
    }

    public final void zzh(String str) {
        try {
            q qVar = this.zzg;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.zzj).toString());
            zzk(jSONObject);
            if (((Boolean) zzbed.zzb.zze()).booleanValue()) {
                jSONObject.put("as", this.zzc.a());
            }
            qVar.c(jSONObject.toString(), null);
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
