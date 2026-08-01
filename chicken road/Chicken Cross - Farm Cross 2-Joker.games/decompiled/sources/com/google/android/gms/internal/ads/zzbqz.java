package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.U3;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbqz implements zzbqh {
    private final Object zza = new Object();
    private final Map zzb = new HashMap();

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void zza(Object obj, Map map) {
        String concat;
        String str = (String) map.get("id");
        String str2 = (String) map.get(U3.g.e);
        String str3 = (String) map.get("fail_reason");
        String str4 = (String) map.get("fail_stack");
        String str5 = (String) map.get("result");
        if (true == TextUtils.isEmpty(str4)) {
            str3 = "Unknown Fail Reason.";
        }
        if (TextUtils.isEmpty(str4)) {
            concat = "";
        } else {
            String.valueOf(str4);
            concat = "\n".concat(String.valueOf(str4));
        }
        synchronized (this.zza) {
            zzbqy zzbqyVar = (zzbqy) this.zzb.remove(str);
            if (zzbqyVar == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                sb.append("Received result for unexpected method invocation: ");
                sb.append(str);
                String sb2 = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + concat.length());
                sb3.append(str3);
                sb3.append(concat);
                zzbqyVar.zzb(sb3.toString());
                return;
            }
            if (str5 == null) {
                zzbqyVar.zza(null);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str5);
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    String jSONObject2 = jSONObject.toString(2);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(jSONObject2).length() + 13);
                    sb4.append("Result GMSG: ");
                    sb4.append(jSONObject2);
                    com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
                }
                zzbqyVar.zza(jSONObject);
            } catch (JSONException e) {
                zzbqyVar.zzb(e.getMessage());
            }
        }
    }

    public final void zzb(String str, zzbqy zzbqyVar) {
        synchronized (this.zza) {
            this.zzb.put(str, zzbqyVar);
        }
    }

    public final ListenableFuture zzc(zzbtq zzbtqVar, String str, JSONObject jSONObject) {
        zzcgo zzcgoVar = new zzcgo();
        com.google.android.gms.ads.internal.zzt.zzc();
        String uuid = UUID.randomUUID().toString();
        zzb(uuid, new zzbqx(this, zzcgoVar));
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", uuid);
            jSONObject2.put("args", jSONObject);
            zzbtqVar.zzb(str, jSONObject2);
        } catch (Exception e) {
            zzcgoVar.zzd(e);
        }
        return zzcgoVar;
    }
}
