package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeak implements com.google.android.gms.ads.admanager.AppEventListener, com.google.android.gms.internal.ads.zzdfx, com.google.android.gms.ads.internal.client.zza, com.google.android.gms.internal.ads.zzdcr, com.google.android.gms.internal.ads.zzddl, com.google.android.gms.internal.ads.zzddm, com.google.android.gms.internal.ads.zzdef, com.google.android.gms.internal.ads.zzdcu, com.google.android.gms.internal.ads.zzfpl {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzdzy zzb;
    private long zzc;

    public zzeak(com.google.android.gms.internal.ads.zzdzy zzdzyVar, com.google.android.gms.internal.ads.zzcnj zzcnjVar) {
        this.zzb = zzdzyVar;
        this.zza = java.util.Collections.singletonList(zzcnjVar);
    }

    private final void zzi(java.lang.Class cls, java.lang.String str, java.lang.Object... objArr) {
        java.lang.String simpleName = cls.getSimpleName();
        java.lang.String.valueOf(simpleName);
        this.zzb.zza(this.zza, "Event-".concat(java.lang.String.valueOf(simpleName)), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzi(com.google.android.gms.ads.internal.client.zza.class, com.ironsource.Vf.f, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(java.lang.String str, java.lang.String str2) {
        zzi(com.google.android.gms.ads.admanager.AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zza(android.content.Context context) {
        zzi(com.google.android.gms.internal.ads.zzddm.class, com.ironsource.X3.i.t0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzb(android.content.Context context) {
        zzi(com.google.android.gms.internal.ads.zzddm.class, com.ironsource.X3.i.u0, context);
    }

    @Override // com.google.android.gms.internal.ads.zzddm
    public final void zzc(android.content.Context context) {
        zzi(com.google.android.gms.internal.ads.zzddm.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    @javax.annotation.ParametersAreNonnullByDefault
    public final void zzd(com.google.android.gms.internal.ads.zzcbp zzcbpVar, java.lang.String str, java.lang.String str2) {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, "onRewarded", zzcbpVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdcu
    public final void zzdJ(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzi(com.google.android.gms.internal.ads.zzdcu.class, "onAdFailedToLoad", java.lang.Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdK() {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, com.ironsource.Vf.k, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdL(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        zzi(com.google.android.gms.internal.ads.zzfpd.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdM(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        zzi(com.google.android.gms.internal.ads.zzfpd.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdN(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str, java.lang.Throwable th) {
        zzi(com.google.android.gms.internal.ads.zzfpd.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfpl
    public final void zzdO(com.google.android.gms.internal.ads.zzfpe zzfpeVar, java.lang.String str) {
        zzi(com.google.android.gms.internal.ads.zzfpd.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdP(com.google.android.gms.internal.ads.zzcbd zzcbdVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        zzi(com.google.android.gms.internal.ads.zzdfx.class, "onAdRequest", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdfx
    public final void zzdQ(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        zzi(com.google.android.gms.internal.ads.zzddl.class, "onAdImpression", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzds() {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, com.ironsource.Vf.g, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzdt() {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, com.ironsource.Vf.c, new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zze() {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, "onRewardedVideoStarted", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcr
    public final void zzf() {
        zzi(com.google.android.gms.internal.ads.zzdcr.class, "onRewardedVideoCompleted", new java.lang.Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdef
    public final void zzg() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(elapsedRealtime).length() + 21);
        sb.append("Ad Request Latency : ");
        sb.append(elapsedRealtime);
        com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        zzi(com.google.android.gms.internal.ads.zzdef.class, com.ironsource.Vf.j, new java.lang.Object[0]);
    }
}
