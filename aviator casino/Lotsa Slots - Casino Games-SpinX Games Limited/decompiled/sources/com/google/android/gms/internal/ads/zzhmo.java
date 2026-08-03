package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmo {
    private static final com.google.android.gms.internal.ads.zzhmo zza = new com.google.android.gms.internal.ads.zzhmo();
    private final java.util.concurrent.atomic.AtomicReference zzb;

    zzhmo() {
        byte[] bArr = null;
        this.zzb = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.zzhnj(new com.google.android.gms.internal.ads.zzhng(bArr), bArr));
    }

    public static com.google.android.gms.internal.ads.zzhmo zza() {
        return zza;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzhnf zzhnfVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        com.google.android.gms.internal.ads.zzhng zzhngVar = new com.google.android.gms.internal.ads.zzhng((com.google.android.gms.internal.ads.zzhnj) atomicReference.get(), bArr);
        zzhngVar.zza(zzhnfVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnj(zzhngVar, bArr));
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzhnl zzhnlVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        byte[] bArr = null;
        com.google.android.gms.internal.ads.zzhng zzhngVar = new com.google.android.gms.internal.ads.zzhng((com.google.android.gms.internal.ads.zzhnj) atomicReference.get(), bArr);
        zzhngVar.zzb(zzhnlVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnj(zzhngVar, bArr));
    }

    public final java.lang.Object zzd(com.google.android.gms.internal.ads.zzhdq zzhdqVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnj) this.zzb.get()).zza(zzhdqVar, cls);
    }

    public final java.lang.Object zze(com.google.android.gms.internal.ads.zzhec zzhecVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnj) this.zzb.get()).zzb(zzhecVar, cls);
    }
}
