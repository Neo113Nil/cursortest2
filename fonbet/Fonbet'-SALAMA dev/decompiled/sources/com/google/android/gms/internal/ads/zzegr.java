package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import J2.j;
import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzegr implements zzebt {
    private final zzehv zza;
    private final zzdog zzb;

    public zzegr(zzehv zzehvVar, zzdog zzdogVar) {
        this.zza = zzehvVar;
        this.zzb = zzdogVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebt
    public final zzebu zza(String str, JSONObject jSONObject) {
        zzbqn zzbqnVar;
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzbP)).booleanValue()) {
            try {
                zzbqnVar = this.zzb.zzb(str);
            } catch (RemoteException e7) {
                int i7 = J.f3546b;
                j.e("Coundn't create RTB adapter: ", e7);
                zzbqnVar = null;
            }
        } else {
            zzbqnVar = this.zza.zza(str);
        }
        if (zzbqnVar == null) {
            return null;
        }
        return new zzebu(zzbqnVar, new zzedi(), str);
    }
}
