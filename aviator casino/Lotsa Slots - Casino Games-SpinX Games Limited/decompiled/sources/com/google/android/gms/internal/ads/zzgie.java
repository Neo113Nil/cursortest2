package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgie extends com.google.android.gms.internal.ads.zzgix {
    private final java.util.Map zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzgec zzc;
    private final long zzd;
    private final long zze;

    zzgie(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, java.util.Map map, android.content.Context context, com.google.android.gms.internal.ads.zzgec zzgecVar, com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("xY3gDYg3ehHtRa/OArDkyuYqE4ANbddC+yAYvnChUVnwqVQ4d5eLbYgJUUNK/LyJ", "Ni/EfqOeHVEZXBaAYj8opGVmmXN/Fcivd07F+tESqqU=", zzaxmVar, zzghtVar, zzgqhVar.zza(113));
        this.zzb = context;
        this.zza = map;
        this.zzc = zzgecVar;
        this.zzd = zzgdfVar.zzl();
        this.zze = zzgdfVar.zzm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaym zzaymVar;
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", this.zzb, java.lang.Integer.valueOf(this.zzc.ordinal()));
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        java.lang.String str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        try {
            com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) this.zza.get("gs");
            if (listenableFuture != null && ((android.os.Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaymVar = (com.google.android.gms.internal.ads.zzaym) listenableFuture.get(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS)) != null && zzaymVar.zzb().length() > 1)) {
                str = zzaymVar.zzb();
            }
        } catch (java.lang.ClassCastException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
        }
        if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
            try {
                com.google.common.util.concurrent.ListenableFuture listenableFuture2 = (com.google.common.util.concurrent.ListenableFuture) this.zza.get("ai");
                if (listenableFuture2 != null) {
                    java.lang.String str2 = (java.lang.String) listenableFuture2.get(this.zze, java.util.concurrent.TimeUnit.MILLISECONDS);
                    if (!com.google.android.gms.internal.ads.zzgua.zzc(str2)) {
                        str = str2;
                    }
                }
            } catch (java.lang.ClassCastException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) objArr2[5];
        synchronized (zzaxmVar) {
            zzaxmVar.zzu(((java.lang.Long) objArr2[0]).longValue());
            zzaxmVar.zzt((java.lang.String) objArr2[1]);
            zzaxmVar.zzD((java.lang.String) objArr2[2]);
            zzaxmVar.zzE((java.lang.String) objArr2[3]);
            com.google.android.gms.internal.ads.zzgzh zzi = com.google.android.gms.internal.ads.zzgzh.zzn().zzi();
            byte[] bArr = (byte[]) objArr2[4];
            zzaxmVar.zzp(zzi.zzj(bArr, 0, bArr.length));
            zzaxmVar.zzo(str);
            if (bool != null) {
                zzaxmVar.zzai(true != bool.booleanValue() ? 1 : 2);
            }
        }
    }
}
