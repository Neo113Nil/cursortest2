package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgaz {
    private final com.google.android.gms.internal.ads.zzgav zza;

    public final /* synthetic */ com.google.android.gms.internal.ads.zzgax zza() {
        com.google.android.gms.internal.ads.zziee zzbu = this.zza.zzbu();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
        return (com.google.android.gms.internal.ads.zzgax) zzbu;
    }

    public final /* synthetic */ com.google.android.gms.internal.ads.zzihj zzb() {
        java.util.Map zzb = this.zza.zzb();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzb, "getQueryIdToAdQualityDataMapMap(...)");
        return new com.google.android.gms.internal.ads.zzihj(zzb);
    }

    public final void zzc(com.google.android.gms.internal.ads.zzihj zzihjVar, java.lang.String key, com.google.android.gms.internal.ads.zzgat value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzihjVar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        this.zza.zzc(key, value);
    }

    public final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzihj zzihjVar, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzihjVar, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        this.zza.zza(key);
    }
}
