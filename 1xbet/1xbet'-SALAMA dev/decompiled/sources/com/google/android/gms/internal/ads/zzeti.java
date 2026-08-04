package com.google.android.gms.internal.ads;

import I2.J;
import Y4.D;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzeti implements zzesg {
    private final AdvertisingIdClient.Info zza;
    private final String zzb;
    private final zzfpu zzc;

    public zzeti(AdvertisingIdClient.Info info, String str, zzfpu zzfpuVar) {
        this.zza = info;
        this.zzb = str;
        this.zzc = zzfpuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            JSONObject jSONObjectE0 = D.E0((JSONObject) obj, "pii");
            AdvertisingIdClient.Info info = this.zza;
            if (info == null || TextUtils.isEmpty(info.getId())) {
                String str = this.zzb;
                if (str != null) {
                    jSONObjectE0.put("pdid", str);
                    jSONObjectE0.put("pdidtype", "ssaid");
                    return;
                }
                return;
            }
            jSONObjectE0.put("rdid", this.zza.getId());
            jSONObjectE0.put("is_lat", this.zza.isLimitAdTrackingEnabled());
            jSONObjectE0.put("idtype", "adid");
            zzfpu zzfpuVar = this.zzc;
            if (zzfpuVar.zzc()) {
                jSONObjectE0.put("paidv1_id_android_3p", zzfpuVar.zzb());
                jSONObjectE0.put("paidv1_creation_time_android_3p", this.zzc.zza());
            }
        } catch (JSONException e7) {
            J.l("Failed putting Ad ID.", e7);
        }
    }
}
