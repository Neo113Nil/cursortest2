package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import io.sentry.SentryLockReason;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdog {
    private final zzfbw zza;
    private final zzdod zzb;

    public zzdog(zzfbw zzfbwVar, zzdod zzdodVar) {
        this.zza = zzfbwVar;
        this.zzb = zzdodVar;
    }

    public final zzboo zza() throws RemoteException {
        zzboo zzbooVarZzb = this.zza.zzb();
        if (zzbooVarZzb != null) {
            return zzbooVarZzb;
        }
        int i7 = J.f3546b;
        j.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqn zzb(String str) {
        zzbqn zzbqnVarZzc = zza().zzc(str);
        this.zzb.zzd(str, zzbqnVarZzc);
        return zzbqnVarZzc;
    }

    public final zzfby zzc(String str, JSONObject jSONObject) {
        zzbor zzborVarZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzborVarZzb = new zzbpp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzborVarZzb = new zzbpp(new zzbrg());
            } else {
                zzboo zzbooVarZza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(SentryLockReason.JsonKeys.CLASS_NAME);
                        if (zzbooVarZza.zze(string)) {
                            zzborVarZzb = zzbooVarZza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            zzborVarZzb = zzbooVarZza.zzd(string) ? zzbooVarZza.zzb(string) : zzbooVarZza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e7) {
                        int i7 = J.f3546b;
                        j.e("Invalid custom event.", e7);
                        zzborVarZzb = zzbooVarZza.zzb(str);
                    }
                } else {
                    zzborVarZzb = zzbooVarZza.zzb(str);
                }
            }
            zzfby zzfbyVar = new zzfby(zzborVarZzb);
            this.zzb.zzc(str, zzfbyVar);
            return zzfbyVar;
        } catch (Throwable th) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzjr)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfbh(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
