package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.content.Context;
import android.os.Build;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class zzbcb {
    private final String zza = (String) zzbds.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbcb(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        linkedHashMap.put(Device.TYPE, P.H());
        linkedHashMap.put(App.TYPE, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        P p7 = oVar.f1957c;
        linkedHashMap.put("is_lite_sdk", true != P.e(context) ? "0" : "1");
        Future zzb = oVar.f1968o.zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbus) zzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbus) zzb.get()).zzk));
        } catch (Exception e7) {
            o.f1952C.f1961g.zzw(e7, "CsiConfiguration.CsiConfiguration");
        }
        zzbbp zzbbpVar = zzbby.zzlp;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            Map map = this.zzb;
            P p8 = o.f1952C.f1957c;
            map.put("is_bstar", true != P.c(context) ? "0" : "1");
        }
        if (((Boolean) c0254t.f2726c.zzb(zzbby.zzju)).booleanValue()) {
            if (((Boolean) c0254t.f2726c.zzb(zzbby.zzcx)).booleanValue()) {
                o oVar2 = o.f1952C;
                if (zzfty.zzd(oVar2.f1961g.zzn())) {
                    return;
                }
                this.zzb.put("plugin", oVar2.f1961g.zzn());
            }
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
