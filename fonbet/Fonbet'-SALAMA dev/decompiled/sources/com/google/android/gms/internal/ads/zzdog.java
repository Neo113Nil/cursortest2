package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import io.sentry.SentryLockReason;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdog {
    private final zzfbw zza;
    private final zzdod zzb;

    public zzdog(zzfbw zzfbwVar, zzdod zzdodVar) {
        this.zza = zzfbwVar;
        this.zzb = zzdodVar;
    }

    public final zzboo zza() {
        zzboo zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        int i7 = J.f3546b;
        j.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbqn zzb(String str) {
        zzbqn zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfby zzc(String str, JSONObject jSONObject) {
        zzbor zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbpp(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbpp(new zzbrg());
            } else {
                zzboo zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString(SentryLockReason.JsonKeys.CLASS_NAME);
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e7) {
                        int i7 = J.f3546b;
                        j.e("Invalid custom event.", e7);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfby zzfbyVar = new zzfby(zzb);
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
