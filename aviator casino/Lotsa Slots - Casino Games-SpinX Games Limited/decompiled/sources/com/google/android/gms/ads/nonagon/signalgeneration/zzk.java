package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzk extends com.google.android.gms.ads.query.QueryInfoGenerationCallback {
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzj zza;
    private final com.google.android.gms.internal.ads.zzdzq zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
    private final java.lang.Boolean zzf;

    public zzk(com.google.android.gms.ads.nonagon.signalgeneration.zzj zzjVar, boolean z, int i, java.lang.Boolean bool, com.google.android.gms.internal.ads.zzdzq zzdzqVar) {
        this.zza = zzjVar;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdzqVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + ((java.lang.Long) com.google.android.gms.internal.ads.zzbkv.zzh.zze()).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(java.lang.String str) {
        android.util.Pair[] pairArr = new android.util.Pair[9];
        pairArr[0] = new android.util.Pair("sgf_reason", str);
        pairArr[1] = new android.util.Pair("se", "query_g");
        pairArr[2] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[3] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[4] = new android.util.Pair("scar", "true");
        pairArr[5] = new android.util.Pair("lat_ms", java.lang.Long.toString(zzb()));
        int i = this.zzd;
        pairArr[6] = new android.util.Pair("sgpc_rn", java.lang.Integer.toString(i));
        pairArr[7] = new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.zzf));
        boolean z = this.zzc;
        pairArr[8] = new android.util.Pair("tpc", true != z ? "0" : "1");
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzc(z, new com.google.android.gms.ads.nonagon.signalgeneration.zzl(null, str, zza(), i));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(com.google.android.gms.ads.query.QueryInfo queryInfo) {
        android.util.Pair[] pairArr = new android.util.Pair[8];
        pairArr[0] = new android.util.Pair("se", "query_g");
        pairArr[1] = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        pairArr[2] = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        pairArr[3] = new android.util.Pair("scar", "true");
        pairArr[4] = new android.util.Pair("lat_ms", java.lang.Long.toString(zzb()));
        int i = this.zzd;
        pairArr[5] = new android.util.Pair("sgpc_rn", java.lang.Integer.toString(i));
        pairArr[6] = new android.util.Pair("sgpc_lsu", java.lang.String.valueOf(this.zzf));
        boolean z = this.zzc;
        pairArr[7] = new android.util.Pair("tpc", true != z ? "0" : "1");
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzc(z, new com.google.android.gms.ads.nonagon.signalgeneration.zzl(queryInfo, "", zza(), i));
    }
}
