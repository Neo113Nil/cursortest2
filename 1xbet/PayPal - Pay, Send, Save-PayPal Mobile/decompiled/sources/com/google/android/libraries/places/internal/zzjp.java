package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzjp {
    final com.google.android.libraries.places.internal.zzblw zza;
    final java.util.concurrent.ScheduledExecutorService zzb = java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
    int zzc = 0;
    java.lang.Long zzd;
    com.google.android.libraries.places.internal.zzbfw zze;
    java.lang.String zzf;
    private final android.content.Context zzg;
    private final com.google.android.libraries.places.internal.zzbgv zzh;

    zzjp(android.content.Context context, com.google.android.libraries.places.internal.zzblw zzblwVar) {
        this.zzg = context;
        this.zza = zzblwVar;
        this.zzh = com.google.android.libraries.places.internal.zzbgw.zzc(zzblwVar);
    }

    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        this.zzc++;
        android.content.Context context = this.zzg;
        com.google.android.libraries.places.internal.zzbgx zzc = com.google.android.libraries.places.internal.zzbgy.zzc();
        zzc.zza(context.getPackageName());
        com.google.android.libraries.places.internal.zzbgy zzbgyVar = (com.google.android.libraries.places.internal.zzbgy) zzc.zzG();
        com.google.android.libraries.places.internal.zzbgv zzbgvVar = this.zzh;
        com.google.common.util.concurrent.ListenableFuture zzb = com.google.android.libraries.places.internal.zzcef.zzb(zzbgvVar.zzc().zza(com.google.android.libraries.places.internal.zzbgw.zza(), zzbgvVar.zzd()), zzbgyVar);
        com.google.common.util.concurrent.Futures.addCallback(zzb, new com.google.android.libraries.places.internal.zzjm(this), com.google.common.util.concurrent.MoreExecutors.directExecutor());
        return zzb;
    }

    final java.lang.String zzc(long j) {
        java.lang.String packageName = this.zzg.getPackageName();
        int length = packageName.length() + 1;
        long[] jArr = new long[length];
        jArr[0] = j;
        int i = 0;
        while (i < packageName.length()) {
            int i2 = i + 1;
            jArr[i2] = packageName.codePointAt(i) & 4294967295L;
            i = i2;
        }
        long j2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            j2 = ((j2 * 1729) + jArr[i3]) % 131071;
        }
        java.lang.String valueOf = java.lang.String.valueOf(j2);
        this.zzf = valueOf;
        return valueOf;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.libraries.places.internal.zzbfw zzbfwVar = this.zze;
        if (zzbfwVar == null || zzbfwVar.zzc() < java.time.Instant.now().getEpochSecond()) {
            return com.google.common.util.concurrent.Futures.transform(zzb(), new com.google.common.base.Function() { // from class: com.google.android.libraries.places.internal.zzjo
                @Override // com.google.common.base.Function
                public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                    java.lang.String str = com.google.android.libraries.places.internal.zzjp.this.zzf;
                    if (str != null) {
                        return str;
                    }
                    throw new java.lang.IllegalStateException("Signature not generated.");
                }
            }, com.google.common.util.concurrent.MoreExecutors.directExecutor());
        }
        java.lang.String str = this.zzf;
        if (str != null) {
            return com.google.common.util.concurrent.Futures.immediateFuture(str);
        }
        throw new java.lang.IllegalStateException("Signature not generated.");
    }
}
