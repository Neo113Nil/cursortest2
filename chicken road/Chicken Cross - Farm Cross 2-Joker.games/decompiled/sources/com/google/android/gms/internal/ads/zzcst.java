package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzcst implements zzhcg {
    static final /* synthetic */ zzcst zza = new zzcst();

    private /* synthetic */ zzcst() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzmb)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzj(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzhcy.zza(new GetTopicsResponse(zzgxm.zzi()));
    }
}
