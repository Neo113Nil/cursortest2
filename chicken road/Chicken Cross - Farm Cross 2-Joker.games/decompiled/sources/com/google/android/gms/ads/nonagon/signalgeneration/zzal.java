package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgub;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzal implements zzgub {
    static final /* synthetic */ zzal zza = new zzal();

    private /* synthetic */ zzal() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        int i = zzap.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
