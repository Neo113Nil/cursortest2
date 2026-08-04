package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.os.RemoteException;
import android.os.SystemClock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzeic extends zzbqp {
    private final String zza;
    private final zzbqn zzb;
    private final zzbzf zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzeic(String str, zzbqn zzbqnVar, zzbzf zzbzfVar, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzbzfVar;
        this.zza = str;
        this.zzb = zzbqnVar;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbqnVar.zzf().toString());
            jSONObject.put("sdk_version", zzbqnVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzbzf zzbzfVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbL)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzbzfVar.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final synchronized void zzh(String str, int i7) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", str);
                zzbbp zzbbpVar = zzbby.zzbM;
                C0254t c0254t = C0254t.f2723d;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                    JSONObject jSONObject = this.zzd;
                    o.f1952C.j.getClass();
                    jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
                }
                if (((Boolean) c0254t.f2726c.zzb(zzbby.zzbL)).booleanValue()) {
                    this.zzd.put("signal_error_code", i7);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbL)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final synchronized void zze(String str) {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            zzbbp zzbbpVar = zzbby.zzbM;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                JSONObject jSONObject = this.zzd;
                o.f1952C.j.getClass();
                jSONObject.put("latency", SystemClock.elapsedRealtime() - this.zze);
            }
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzbL)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final synchronized void zzf(String str) {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbqq
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzh(zzeVar.f10721b, 2);
    }
}
