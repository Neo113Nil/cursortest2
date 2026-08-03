package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdrt implements com.google.android.gms.internal.ads.zzddl {
    private final com.google.android.gms.internal.ads.zzdpt zza;
    private final com.google.android.gms.internal.ads.zzdpy zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.Executor zzd;

    public zzdrt(com.google.android.gms.internal.ads.zzdpt zzdptVar, com.google.android.gms.internal.ads.zzdpy zzdpyVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2) {
        this.zza = zzdptVar;
        this.zzb = zzdpyVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final com.google.android.gms.internal.ads.zzcku zzckuVar) {
        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdrs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzcku.this.zze("onSdkImpression", new androidx.collection.ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddl
    public final void zzdr() {
        if (this.zzb.zzd()) {
            com.google.android.gms.internal.ads.zzdpt zzdptVar = this.zza;
            com.google.android.gms.internal.ads.zzeln zzZ = zzdptVar.zzZ();
            if (zzZ == null && zzdptVar.zzX() != null && ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgr)).booleanValue()) {
                com.google.common.util.concurrent.ListenableFuture zzX = zzdptVar.zzX();
                com.google.android.gms.internal.ads.zzcfw zzY = zzdptVar.zzY();
                if (zzX == null || zzY == null) {
                    return;
                }
                com.google.android.gms.internal.ads.zzhbw.zzr(com.google.android.gms.internal.ads.zzhbw.zzq(zzX, zzY), new com.google.android.gms.internal.ads.zzdrr(this), this.zzd);
                return;
            }
            if (zzZ != null) {
                com.google.android.gms.internal.ads.zzcku zzW = zzdptVar.zzW();
                com.google.android.gms.internal.ads.zzcku zzT = zzdptVar.zzT();
                if (zzW == null) {
                    zzW = zzT == null ? null : zzT;
                }
                if (zzW != null) {
                    zza(zzW);
                }
            }
        }
    }
}
