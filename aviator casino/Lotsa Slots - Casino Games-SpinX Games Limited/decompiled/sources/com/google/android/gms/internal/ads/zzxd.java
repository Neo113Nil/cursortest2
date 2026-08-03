package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzxd extends com.google.android.gms.internal.ads.zzwy {
    public static final java.lang.Object zzc = new java.lang.Object();
    private final java.lang.Object zzd;
    private final java.lang.Object zze;

    private zzxd(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, java.lang.Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }

    public static com.google.android.gms.internal.ads.zzxd zzp(com.google.android.gms.internal.ads.zzak zzakVar) {
        return new com.google.android.gms.internal.ads.zzxd(new com.google.android.gms.internal.ads.zzxe(zzakVar), com.google.android.gms.internal.ads.zzbe.zza, zzc);
    }

    public static com.google.android.gms.internal.ads.zzxd zzq(com.google.android.gms.internal.ads.zzbf zzbfVar, java.lang.Object obj, java.lang.Object obj2) {
        return new com.google.android.gms.internal.ads.zzxd(zzbfVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbe zzb(int i, com.google.android.gms.internal.ads.zzbe zzbeVar, long j) {
        this.zzb.zzb(i, zzbeVar, j);
        if (java.util.Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = com.google.android.gms.internal.ads.zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final com.google.android.gms.internal.ads.zzbd zzd(int i, com.google.android.gms.internal.ads.zzbd zzbdVar, boolean z) {
        this.zzb.zzd(i, zzbdVar, z);
        if (java.util.Objects.equals(zzbdVar.zzb, this.zze) && z) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final int zze(java.lang.Object obj) {
        java.lang.Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzwy, com.google.android.gms.internal.ads.zzbf
    public final java.lang.Object zzf(int i) {
        java.lang.Object zzf = this.zzb.zzf(i);
        return java.util.Objects.equals(zzf, this.zze) ? zzc : zzf;
    }

    public final com.google.android.gms.internal.ads.zzxd zzr(com.google.android.gms.internal.ads.zzbf zzbfVar) {
        return new com.google.android.gms.internal.ads.zzxd(zzbfVar, this.zzd, this.zze);
    }

    final /* synthetic */ java.lang.Object zzs() {
        return this.zze;
    }
}
