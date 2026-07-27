package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzfeb implements zzhcg {
    static final /* synthetic */ zzfeb zza = new zzfeb();

    private /* synthetic */ zzfeb() {
    }

    @Override // com.google.android.gms.internal.ads.zzhcg
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzhcy.zza(new zzfed("", 1, null));
        }
        zzijf zzc = zzijg.zzc();
        for (Topic topic : getTopicsResponse.getTopics()) {
            zzijd zzc2 = zzije.zzc();
            zzc2.zza(topic.getTopicId());
            zzc2.zzb(topic.getModelVersion());
            zzc2.zzc(topic.getTaxonomyVersion());
            zzc.zza((zzije) zzc2.zzbu());
        }
        return zzhcy.zza(new zzfed(Base64.encodeToString(((zzijg) zzc.zzbu()).zzaN(), 1), 1, null));
    }
}
