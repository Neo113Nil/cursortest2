package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import I2.P;
import J2.n;
import Q2.c;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import io.sentry.protocol.App;
import io.sentry.protocol.Device;
import io.sentry.protocol.OperatingSystem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdqv extends zzdqz {
    private final Q2.a zzf;

    public zzdqv(Executor executor, n nVar, Q2.a aVar, c cVar, Context context) {
        super(executor, nVar, cVar, context);
        this.zzf = aVar;
        Map map = this.zza;
        aVar.getClass();
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(OperatingSystem.TYPE, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        o oVar = o.f1952C;
        P p5 = oVar.f1957c;
        map.put(Device.TYPE, P.H());
        map.put(App.TYPE, aVar.f5793b);
        Context context2 = aVar.f5792a;
        map.put("is_lite_sdk", true != P.e(context2) ? "0" : "1");
        zzbbp zzbbpVar = zzbby.zza;
        C0254t c0254t = C0254t.f2723d;
        List listZzb = c0254t.f2724a.zzb();
        zzbbp zzbbpVar2 = zzbby.zzgN;
        zzbbw zzbbwVar = c0254t.f2726c;
        boolean zBooleanValue = ((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue();
        zzbyq zzbyqVar = oVar.f1961g;
        if (zBooleanValue) {
            listZzb.addAll(((M) zzbyqVar.zzi()).n().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", aVar.f5794c);
        if (((Boolean) zzbbwVar.zzb(zzbby.zzlp)).booleanValue()) {
            map.put("is_bstar", true != P.c(context2) ? "0" : "1");
        }
        if (((Boolean) zzbbwVar.zzb(zzbby.zzju)).booleanValue() && ((Boolean) zzbbwVar.zzb(zzbby.zzcx)).booleanValue()) {
            map.put("plugin", zzfty.zzc(zzbyqVar.zzn()));
        }
    }

    public final Map zza() {
        return new HashMap(this.zza);
    }
}
