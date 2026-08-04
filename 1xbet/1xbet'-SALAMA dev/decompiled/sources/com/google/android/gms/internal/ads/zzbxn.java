package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import I2.P;
import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbxn {
    static zzbxn zzi;

    public static synchronized zzbxn zzb(Context context) {
        try {
            zzbxn zzbxnVar = zzi;
            if (zzbxnVar != null) {
                return zzbxnVar;
            }
            Context applicationContext = context.getApplicationContext();
            zzbby.zza(applicationContext);
            o oVar = o.f1952C;
            M m7 = (M) oVar.f1961g.zzi();
            m7.p(applicationContext);
            zzbxf zzbxfVar = new zzbxf(null);
            zzbxfVar.zzb(applicationContext);
            zzbxfVar.zzc(oVar.j);
            zzbxfVar.zza(m7);
            zzbxfVar.zzd(oVar.f1978y);
            zzbxn zzbxnVarZze = zzbxfVar.zze();
            zzi = zzbxnVarZze;
            ((zzbwz) ((zzbxg) zzbxnVarZze).zzc.zzb()).zza();
            zzbxr zzbxrVar = (zzbxr) ((zzbxg) zzi).zzh.zzb();
            zzbbp zzbbpVar = zzbby.zzaH;
            C0254t c0254t = C0254t.f2723d;
            if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
                HashMap mapI = P.I((String) c0254t.f2726c.zzb(zzbby.zzaI));
                Iterator it = mapI.keySet().iterator();
                while (it.hasNext()) {
                    zzbxrVar.zzc((String) it.next());
                }
                zzbxrVar.zzd(new zzbxp(zzbxrVar, mapI));
            }
            return zzi;
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract zzbxd zza();
}
