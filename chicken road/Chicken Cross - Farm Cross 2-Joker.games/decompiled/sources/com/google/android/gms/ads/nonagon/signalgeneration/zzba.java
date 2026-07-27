package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzehq;
import com.google.android.gms.internal.ads.zzhcg;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStreamReader;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzba implements zzhcg {
    private final Executor zza;
    private final zzegd zzb;

    public zzba(Executor executor, zzegd zzegdVar) {
        this.zza = executor;
        this.zzb = zzegdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* bridge */ /* synthetic */ ListenableFuture zza(Object obj) throws Exception {
        final zzcbv zzcbvVar = (zzcbv) obj;
        return zzhcy.zzj(this.zzb.zza(zzcbvVar), new zzhcg() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaz
            @Override // com.google.android.gms.internal.ads.zzhcg
            public final /* synthetic */ ListenableFuture zza(Object obj2) {
                zzehq zzehqVar = (zzehq) obj2;
                zzbc zzbcVar = new zzbc(new JsonReader(new InputStreamReader(zzehqVar.zza())), zzehqVar.zzb());
                try {
                    zzbcVar.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzo(zzcbv.this.zza).toString();
                } catch (JSONException unused) {
                    zzbcVar.zzb = JsonUtils.EMPTY_JSON;
                }
                return zzhcy.zza(zzbcVar);
            }
        }, this.zza);
    }
}
