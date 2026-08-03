package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeeu implements com.google.android.gms.internal.ads.zzimu {
    private final com.google.android.gms.internal.ads.zzind zza;
    private final com.google.android.gms.internal.ads.zzind zzb;
    private final com.google.android.gms.internal.ads.zzind zzc;
    private final com.google.android.gms.internal.ads.zzind zzd;

    private zzeeu(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
        this.zzc = zzindVar3;
        this.zzd = zzindVar4;
    }

    public static com.google.android.gms.internal.ads.zzeeu zza(com.google.android.gms.internal.ads.zzind zzindVar, com.google.android.gms.internal.ads.zzind zzindVar2, com.google.android.gms.internal.ads.zzind zzindVar3, com.google.android.gms.internal.ads.zzind zzindVar4, com.google.android.gms.internal.ads.zzind zzindVar5) {
        return new com.google.android.gms.internal.ads.zzeeu(zzindVar, zzindVar2, zzindVar3, zzindVar4, zzindVar5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0056, code lost:
    
        if (java.lang.Integer.toString(r6).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzc(r2.zzd))) != false) goto L6;
     */
    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ java.lang.Object zzb() {
        com.google.common.util.concurrent.ListenableFuture zzc;
        final com.google.android.gms.internal.ads.zzbap zzbapVar = (com.google.android.gms.internal.ads.zzbap) this.zza.zzb();
        final android.content.Context zza = ((com.google.android.gms.internal.ads.zzcns) this.zzb).zza();
        com.google.android.gms.internal.ads.zzfky zza2 = ((com.google.android.gms.internal.ads.zzdci) this.zzc).zza();
        long longValue = ((java.lang.Long) this.zzd.zzb()).longValue();
        com.google.android.gms.internal.ads.zzhcg zzc2 = com.google.android.gms.internal.ads.zzfoa.zzc();
        int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdA)).intValue();
        if (intValue != -1) {
        }
        if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - longValue < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdC)).intValue()) {
            zzc = zzc2.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeep
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ java.lang.Object call() {
                    return com.google.android.gms.internal.ads.zzbap.this.zzb().zzk(zza);
                }
            });
            com.google.android.gms.internal.ads.zzinc.zzb(zzc);
            return zzc;
        }
        zzc = zzc2.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeeo
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzbap.this.zzb().zzl(zza);
            }
        });
        com.google.android.gms.internal.ads.zzinc.zzb(zzc);
        return zzc;
    }
}
