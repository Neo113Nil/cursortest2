package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzab implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzap zza;

    zzab(com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar) {
        java.util.Objects.requireNonNull(zzapVar);
        this.zza = zzapVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        android.util.Pair pair = new android.util.Pair("sgf_reason", th.getMessage());
        android.util.Pair pair2 = new android.util.Pair("se", "query_g");
        android.util.Pair pair3 = new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name());
        android.util.Pair pair4 = new android.util.Pair("rtype", java.lang.Integer.toString(6));
        android.util.Pair pair5 = new android.util.Pair("scar", "true");
        com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = this.zza;
        com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(zzapVar.zzA(), null, "sgf", pair, pair2, pair3, pair4, pair5, new android.util.Pair("sgi_rn", java.lang.Integer.toString(zzapVar.zzO().get())));
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to initialize webview for loading SDKCore. ", th);
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzle)).booleanValue() || zzapVar.zzN().get() || zzapVar.zzO().getAndIncrement() >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlf)).intValue()) {
            return;
        }
        zzapVar.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initialized webview successfully for SDKCore.");
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzle)).booleanValue()) {
            com.google.android.gms.ads.nonagon.signalgeneration.zzap zzapVar = this.zza;
            com.google.android.gms.ads.nonagon.signalgeneration.zzv.zze(zzapVar.zzA(), null, "sgs", new android.util.Pair("se", "query_g"), new android.util.Pair(com.google.firebase.analytics.FirebaseAnalytics.Param.AD_FORMAT, com.google.android.gms.ads.AdFormat.BANNER.name()), new android.util.Pair("rtype", java.lang.Integer.toString(6)), new android.util.Pair("scar", "true"), new android.util.Pair("sgi_rn", java.lang.Integer.toString(zzapVar.zzO().get())));
            zzapVar.zzN().set(true);
        }
    }
}
