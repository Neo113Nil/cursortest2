package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.j;
import P2.v;
import R0.d;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzdpw implements zzcxn, zzcwe, zzcut, zzddb {
    private final zzdqk zza;
    private final zzdqv zzb;
    private final int zzc;

    public zzdpw(zzdqk zzdqkVar, zzdqv zzdqvVar, int i7) {
        this.zza = zzdqkVar;
        this.zzb = zzdqvVar;
        this.zzc = i7;
    }

    private final void zzc(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (String str : bundle.keySet()) {
            long j = bundle.getLong(str);
            if (j >= 0) {
                this.zza.zzd(str, String.valueOf(j));
            }
        }
    }

    private final void zzd(Bundle bundle, zzfwh zzfwhVar) {
        if (!((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzco)).booleanValue() || bundle == null) {
            return;
        }
        AbstractC1663a.n(o.f1952C.j, bundle, zzdpy.PUBLIC_API_CALLBACK.zza());
        this.zza.zzc();
        if (bundle.containsKey("ls")) {
            this.zza.zzd("ls", true != bundle.getBoolean("ls") ? "0" : "1");
        }
        int size = zzfwhVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            zzdpz zzdpzVar = (zzdpz) zzfwhVar.get(i7);
            long j = bundle.getLong(zzdpzVar.zza().zza(), -1L);
            long j3 = bundle.getLong(zzdpzVar.zzb().zza(), -1L);
            if (j > 0 && j3 > 0) {
                this.zza.zzd(zzdpzVar.zzc(), String.valueOf(j3 - j));
            }
        }
        zzc(bundle.getBundle("client_sig_latency_key"));
        zzc(bundle.getBundle("gms_sig_latency_key"));
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhx)).booleanValue()) {
            if (bundle.containsKey("sod_h")) {
                this.zza.zzd("sod_h", true != bundle.getBoolean("sod_h") ? "0" : "1");
            }
            if (bundle.containsKey("cmr")) {
                this.zza.zzd("cmr", String.valueOf(bundle.getInt("cmr")));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdl(zzbuo zzbuoVar) {
        this.zza.zzf(zzbuoVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcxn
    public final void zzdm(zzfar zzfarVar) {
        this.zza.zze(zzfarVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcut
    public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.zzb().put("action", "ftl");
        this.zza.zzd("ftl", String.valueOf(zzeVar.f10720a));
        this.zza.zzd("ed", zzeVar.f10722c);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzhf)).booleanValue()) {
            this.zza.zzd("emsg", zzeVar.f10721b);
        }
        this.zzb.zzg(this.zza.zzb());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    @Override // com.google.android.gms.internal.ads.zzddb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(v vVar) {
        String str;
        zzbbp zzbbpVar = zzbby.zzgR;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhx)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            if (vVar == null) {
                this.zza.zzb().put("action", "sgs");
                this.zza.zzb().put("request_id", "-1");
                this.zzb.zzg(this.zza.zzb());
                return;
            }
            Bundle bundle = vVar.f5567e;
            zzbuo zzbuoVar = vVar.f5566d;
            if (zzbuoVar != null) {
                zzd(zzbuoVar.zzm, zzdpz.zza);
            } else if (bundle != null && !bundle.isEmpty()) {
                zzd(bundle, zzdpz.zza);
            }
            try {
                JSONObject jSONObject = new JSONObject(TextUtils.isEmpty(vVar.f5565c) ? vVar.f5564b : vVar.f5565c);
                this.zza.zzb().put("action", "sgs");
                Map zzb = this.zza.zzb();
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzjG)).booleanValue()) {
                    try {
                        str = jSONObject.getJSONObject("extras").getBoolean("accept_3p_cookie") ? "1" : "0";
                    } catch (JSONException e7) {
                        int i7 = J.f3546b;
                        j.e("Error retrieving JSONObject from the requestJson, ", e7);
                    }
                    zzb.put("tpc", str);
                    if (zzbuoVar != null) {
                        this.zza.zzf(zzbuoVar.zza);
                    }
                    this.zzb.zzg(this.zza.zzb());
                }
                str = "na";
                zzb.put("tpc", str);
                if (zzbuoVar != null) {
                }
                this.zzb.zzg(this.zza.zzb());
            } catch (JSONException unused) {
                this.zza.zzb().put("action", "sgf");
                this.zza.zzb().put("sgf_reason", "request_invalid");
                this.zzb.zzg(this.zza.zzb());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zzf(String str) {
        zzbbp zzbbpVar = zzbby.zzgR;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzhx)).booleanValue()) {
                this.zza.zzb().put("sgw", String.valueOf(this.zzc));
            }
            this.zza.zzb().put("action", "sgf");
            this.zza.zzd("sgf_reason", str);
            this.zzb.zzg(this.zza.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwe
    public final void zzs() {
        this.zza.zzb().put("action", "loaded");
        zzd(this.zza.zza(), zzdpz.zzb);
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmC)).booleanValue()) {
            this.zza.zzb().put("mafe", true != d.a("MUTE_AUDIO") ? "0" : "1");
        }
        this.zzb.zzg(this.zza.zzb());
    }
}
