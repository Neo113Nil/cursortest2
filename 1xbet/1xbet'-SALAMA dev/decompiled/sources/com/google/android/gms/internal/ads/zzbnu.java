package com.google.android.gms.internal.ads;

import E2.o;
import I2.J;
import I2.P;
import J2.j;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzbnu implements zzbng {
    private final zzbni zza;
    private final zzbnj zzb;
    private final zzbnc zzc;
    private final String zzd;

    public zzbnu(zzbnc zzbncVar, String str, zzbnj zzbnjVar, zzbni zzbniVar) {
        this.zzc = zzbncVar;
        this.zzd = str;
        this.zzb = zzbnjVar;
        this.zza = zzbniVar;
    }

    public static void zzd(zzbnu zzbnuVar, zzbmw zzbmwVar, zzbnd zzbndVar, Object obj, zzbzf zzbzfVar) {
        try {
            P p5 = o.f1952C.f1957c;
            String string = UUID.randomUUID().toString();
            zzbiy.zzo.zzc(string, new zzbnt(zzbnuVar, zzbmwVar, zzbzfVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", zzbnuVar.zzb.zzb(obj));
            zzbndVar.zzp(zzbnuVar.zzd, jSONObject);
        } catch (Exception e7) {
            try {
                zzbzfVar.zzd(e7);
                int i7 = J.f3546b;
                j.e("Unable to invokeJavascript", e7);
            } finally {
                zzbmwVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final I3.b zza(Object obj) {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbng
    public final I3.b zzb(Object obj) {
        zzbzf zzbzfVar = new zzbzf();
        zzbmw zzbmwVarZzb = this.zzc.zzb(null);
        J.k("callJs > getEngine: Promise created");
        zzbmwVarZzb.zzj(new zzbnr(this, zzbmwVarZzb, obj, zzbzfVar), new zzbns(this, zzbzfVar, zzbmwVarZzb));
        return zzbzfVar;
    }
}
