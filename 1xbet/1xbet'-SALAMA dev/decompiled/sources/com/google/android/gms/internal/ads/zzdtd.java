package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import I2.J;
import J2.j;
import android.os.IBinder;
import android.text.TextUtils;
import io.sentry.Session;
import io.sentry.protocol.SentryThread;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdtd implements zzcut, zzcxn, zzcwi {
    private final zzdtp zza;
    private final String zzb;
    private final String zzc;
    private zzcuj zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdtc zze = zzdtc.AD_REQUESTED;

    public zzdtd(zzdtp zzdtpVar, zzfba zzfbaVar, String str) {
        this.zza = zzdtpVar;
        this.zzc = str;
        this.zzb = zzfbaVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.f10722c);
        jSONObject.put("errorCode", zzeVar.f10720a);
        jSONObject.put("errorDescription", zzeVar.f10721b);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.f10723d;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : zzh(zzeVar2));
        return jSONObject;
    }

    private final JSONObject zzi(zzcuj zzcujVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcujVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcujVar.zzd());
        jSONObject.put("responseId", zzcujVar.zzi());
        zzbbp zzbbpVar = zzbby.zzjl;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            String strZzk = zzcujVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                String strValueOf = String.valueOf(strZzk);
                int i7 = J.f3546b;
                j.b("Bidding data: ".concat(strValueOf));
                jSONObject.put("biddingData", new JSONObject(strZzk));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjo)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzv zzvVar : zzcujVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzvVar.f10784a);
            jSONObject2.put("latencyMillis", zzvVar.f10785b);
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjm)).booleanValue()) {
                jSONObject2.put("credentials", C0252s.f2717f.f2718a.j(zzvVar.f10787d));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzvVar.f10786c;
            jSONObject2.put("error", zzeVar == null ? null : zzh(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    public final void zza(zzcpw zzcpwVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcpwVar.zzl();
            this.zze = zzdtc.AD_LOADED;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjs)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObjectZzi;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(SentryThread.JsonKeys.STATE, this.zze);
        jSONObject.put("format", zzfaf.zza(this.zzd));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjs)).booleanValue()) {
            jSONObject.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject.put("shown", this.zzn);
            }
        }
        zzcuj zzcujVar = this.zzf;
        if (zzcujVar != null) {
            jSONObjectZzi = zzi(zzcujVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObjectZzi2 = null;
            if (zzeVar != null && (iBinder = zzeVar.f10724e) != null) {
                zzcuj zzcujVar2 = (zzcuj) iBinder;
                jSONObjectZzi2 = zzi(zzcujVar2);
                if (zzcujVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObjectZzi2.put(Session.JsonKeys.ERRORS, jSONArray);
                }
            }
            jSONObjectZzi = jSONObjectZzi2;
        }
        jSONObject.put("responseInfo", jSONObjectZzi);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjs)).booleanValue() || !this.zza.zzq()) {
            return;
        }
        this.zza.zzf(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
        if (this.zza.zzq()) {
            if (!zzfarVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfaf) zzfarVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfarVar.zzb.zzb.zzl)) {
                this.zzh = zzfarVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfarVar.zzb.zzb.zzm)) {
                this.zzi = zzfarVar.zzb.zzb.zzm;
            }
            if (zzfarVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfarVar.zzb.zzb.zzp;
            }
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjo)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfarVar.zzb.zzb.zzn)) {
                    this.zzj = zzfarVar.zzb.zzb.zzn;
                }
                if (zzfarVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfarVar.zzb.zzb.zzo;
                }
                zzdtp zzdtpVar = this.zza;
                JSONObject jSONObject = this.zzk;
                int length = jSONObject != null ? jSONObject.toString().length() : 0;
                if (!TextUtils.isEmpty(this.zzj)) {
                    length += this.zzj.length();
                }
                zzdtpVar.zzk(length);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdtc.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjs)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdtc.AD_REQUESTED;
    }
}
