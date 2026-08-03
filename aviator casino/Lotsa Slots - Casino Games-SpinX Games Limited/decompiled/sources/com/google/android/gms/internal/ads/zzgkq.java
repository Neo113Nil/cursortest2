package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgkq implements com.google.android.gms.internal.ads.zzfza {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzgpc zzb;
    private final java.lang.String zzc;
    private final long zzd;
    private final long zze;

    zzgkq(android.content.Context context, com.google.android.gms.internal.ads.zzgdf zzgdfVar, com.google.android.gms.internal.ads.zzgpc zzgpcVar) {
        this.zza = context;
        this.zzc = zzgdfVar.zzd();
        this.zzd = zzgdfVar.zzl();
        this.zze = zzgdfVar.zzm();
        this.zzb = zzgpcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza(java.util.Map map) {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture listenableFuture;
        com.google.android.gms.internal.ads.zzaym zzaymVar;
        map.put("v", this.zzc);
        map.put("t", new java.lang.Throwable());
        try {
            listenableFuture = (com.google.common.util.concurrent.ListenableFuture) map.get("gs");
        } catch (java.lang.ClassCastException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused) {
        }
        if (listenableFuture != null && ((android.os.Build.VERSION.SDK_INT < 31 || listenableFuture.isDone()) && (zzaymVar = (com.google.android.gms.internal.ads.zzaym) listenableFuture.get(this.zzd, java.util.concurrent.TimeUnit.MILLISECONDS)) != null && zzaymVar.zzb().length() > 1)) {
            str = zzaymVar.zzb();
            if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
                try {
                    com.google.common.util.concurrent.ListenableFuture listenableFuture2 = (com.google.common.util.concurrent.ListenableFuture) map.get("ai");
                    if (listenableFuture2 != null) {
                        java.lang.String str2 = (java.lang.String) listenableFuture2.get(this.zze, java.util.concurrent.TimeUnit.MILLISECONDS);
                        if (!com.google.android.gms.internal.ads.zzgua.zzc(str2)) {
                            str = str2;
                        }
                    }
                } catch (java.lang.ClassCastException | java.lang.InterruptedException | java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException unused2) {
                }
            }
            map.put("int", str);
        }
        str = androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST;
        if (str.equals(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST)) {
        }
        map.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzb() {
        java.util.Map zzb = this.zzb.zzb();
        zza(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzc() {
        java.util.Map zzc = this.zzb.zzc(this.zza, null);
        zza(zzc);
        return zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zzd() {
        java.util.Map zzd = this.zzb.zzd();
        zza(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfza
    public final java.util.Map zze() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("t", new java.lang.Throwable());
        return hashMap;
    }
}
