package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgdm implements com.google.android.gms.internal.ads.zzgdb {
    private java.util.concurrent.ExecutorService zza;
    private android.content.Context zzb;
    private com.google.android.gms.internal.ads.zzgdf zzc;

    private zzgdm() {
        throw null;
    }

    /* synthetic */ zzgdm(byte[] bArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final com.google.android.gms.internal.ads.zzgdc zza() {
        com.google.android.gms.internal.ads.zzinc.zzc(this.zza, java.util.concurrent.ExecutorService.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzb, android.content.Context.class);
        com.google.android.gms.internal.ads.zzinc.zzc(this.zzc, com.google.android.gms.internal.ads.zzgdf.class);
        return new com.google.android.gms.internal.ads.zzgdl(new com.google.android.gms.internal.ads.zzgjg(), new com.google.android.gms.internal.ads.zzgji(), new com.google.android.gms.internal.ads.zzgjk(), this.zza, this.zzb, this.zzc);
    }

    public final com.google.android.gms.internal.ads.zzgdm zzb(java.util.concurrent.ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgdm zzc(android.content.Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzgdm zzd(com.google.android.gms.internal.ads.zzgdf zzgdfVar) {
        zzgdfVar.getClass();
        this.zzc = zzgdfVar;
        return this;
    }
}
