package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzerl implements zzems {
    private final zzesp zza;
    private final zzdya zzb;

    zzerl(zzesp zzespVar, zzdya zzdyaVar) {
        this.zza = zzespVar;
        this.zzb = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzems
    public final zzemt zza(String str, JSONObject jSONObject) throws zzfmd {
        zzbxt zzbxtVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcu)).booleanValue()) {
            try {
                zzbxtVar = this.zzb.zzb(str);
            } catch (RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Coundn't create RTB adapter: ", e);
                zzbxtVar = null;
            }
        } else {
            zzbxtVar = this.zza.zzb(str);
        }
        if (zzbxtVar == null) {
            return null;
        }
        return new zzemt(zzbxtVar, new zzeof(), str);
    }
}
