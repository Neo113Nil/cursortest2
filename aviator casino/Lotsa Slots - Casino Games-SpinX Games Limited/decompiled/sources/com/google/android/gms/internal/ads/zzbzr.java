package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbzr extends com.google.android.gms.internal.ads.zzcei {
    final /* synthetic */ com.google.android.gms.ads.query.QueryInfoGenerationCallback zza;

    zzbzr(com.google.android.gms.internal.ads.zzbzs zzbzsVar, com.google.android.gms.ads.query.QueryInfoGenerationCallback queryInfoGenerationCallback) {
        this.zza = queryInfoGenerationCallback;
        java.util.Objects.requireNonNull(zzbzsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzb(java.lang.String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcej
    public final void zzc(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        this.zza.onSuccess(new com.google.android.gms.ads.query.QueryInfo(new com.google.android.gms.ads.internal.client.zzex(str, bundle, str2)));
    }
}
