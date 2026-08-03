package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfc {
    private final java.util.concurrent.ExecutorService zza;

    public zzgfc(java.util.concurrent.ExecutorService executorService) {
        this.zza = executorService;
    }

    public final com.google.android.gms.internal.ads.zzget zza(java.io.File file, com.google.android.gms.internal.ads.zzifp zzifpVar, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        return new com.google.android.gms.internal.ads.zzgfb(file, this.zza, new com.google.android.gms.internal.ads.zzgez(zzifpVar), zzgtaVar);
    }

    public final com.google.android.gms.internal.ads.zzget zzb(java.io.File file, byte[] bArr, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        return new com.google.android.gms.internal.ads.zzgfb(file, this.zza, new com.google.android.gms.internal.ads.zzgev(bArr), zzgtaVar);
    }
}
