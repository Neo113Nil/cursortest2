package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhao extends com.google.android.gms.internal.ads.zzhbn implements java.lang.Runnable {
    public static final /* synthetic */ int zzd = 0;
    com.google.common.util.concurrent.ListenableFuture zza;
    java.lang.Class zzb;
    java.lang.Object zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        java.lang.Object obj;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Class cls = this.zzb;
        java.lang.Object obj2 = this.zzc;
        if (((obj2 == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof com.google.android.gms.internal.ads.zzhcy ? ((com.google.android.gms.internal.ads.zzhcy) listenableFuture).zzl() : null;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                java.lang.String valueOf = java.lang.String.valueOf(listenableFuture.getClass());
                java.lang.String valueOf2 = java.lang.String.valueOf(e.getClass());
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 19 + java.lang.String.valueOf(valueOf2).length() + 16);
                sb.append("Future type ");
                sb.append(valueOf);
                sb.append(" threw ");
                sb.append(valueOf2);
                sb.append(" without a cause");
                cause = new java.lang.NullPointerException(sb.toString());
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            obj = com.google.android.gms.internal.ads.zzhbw.zzs(listenableFuture);
            if (th != null) {
                zza(obj);
                return;
            }
            if (!cls.isInstance(th)) {
                zzk(listenableFuture);
                return;
            }
            try {
                java.lang.Object zzf = zzf(obj2, th);
                this.zzb = null;
                this.zzc = null;
                zze(zzf);
                return;
            } catch (java.lang.Throwable th2) {
                try {
                    com.google.android.gms.internal.ads.zzhco.zza(th2);
                    zzb(th2);
                    return;
                } finally {
                    this.zzb = null;
                    this.zzc = null;
                }
            }
        }
        obj = null;
        if (th != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Class cls = this.zzb;
        java.lang.Object obj = this.zzc;
        java.lang.String zzd2 = super.zzd();
        if (listenableFuture != null) {
            java.lang.String obj2 = listenableFuture.toString();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(obj2.length() + 16);
            sb.append("inputFuture=[");
            sb.append(obj2);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zzd2 != null) {
                return str.concat(zzd2);
            }
            return null;
        }
        int length = str.length();
        java.lang.String obj3 = cls.toString();
        int length2 = obj3.length();
        java.lang.String obj4 = obj.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length + 15 + length2 + 13 + obj4.length() + 1);
        sb2.append(str);
        sb2.append("exceptionType=[");
        sb2.append(obj3);
        sb2.append("], fallback=[");
        sb2.append(obj4);
        sb2.append(com.ironsource.X3.j.e);
        return sb2.toString();
    }

    abstract void zze(java.lang.Object obj);

    abstract java.lang.Object zzf(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception;

    zzhao(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, java.lang.Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }
}
