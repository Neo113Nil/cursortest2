package com.google.android.gms.internal.ads;

import E2.o;
import I2.P;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzboc implements zzgaj {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final I3.b zzb;

    public zzboc(I3.b bVar, String str, zzbnj zzbnjVar, zzbni zzbniVar) {
        this.zzb = bVar;
    }

    public static I3.b zzb(zzboc zzbocVar, Object obj, zzbnd zzbndVar) throws JSONException {
        zzbzf zzbzfVar = new zzbzf();
        P p5 = o.f1952C.f1957c;
        String string = UUID.randomUUID().toString();
        zzbiy.zzo.zzc(string, new zzbob(zzbocVar, zzbzfVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbndVar.zzp(zzbocVar.zza, jSONObject);
        return zzbzfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgaj
    public final I3.b zza(Object obj) {
        return zzc(obj);
    }

    public final I3.b zzc(final Object obj) {
        return zzgbc.zzn(this.zzb, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzboa
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj2) {
                return zzboc.zzb(this.zza, obj, (zzbnd) obj2);
            }
        }, zzbza.zzg);
    }
}
