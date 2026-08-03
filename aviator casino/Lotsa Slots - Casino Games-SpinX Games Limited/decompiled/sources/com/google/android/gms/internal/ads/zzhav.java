package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhav extends com.google.android.gms.internal.ads.zzhbn implements java.lang.Runnable {
    public static final /* synthetic */ int zzc = 0;
    com.google.common.util.concurrent.ListenableFuture zza;
    java.lang.Object zzb;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzk(listenableFuture);
            return;
        }
        try {
            try {
                java.lang.Object zzf = zzf(obj, com.google.android.gms.internal.ads.zzhbw.zzs(listenableFuture));
                this.zzb = null;
                zze(zzf);
            } catch (java.lang.Throwable th) {
                try {
                    com.google.android.gms.internal.ads.zzhco.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (java.lang.Error e) {
            zzb(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e2) {
            zzb(e2.getCause());
        } catch (java.lang.Exception e3) {
            zzb(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Object obj = this.zzb;
        java.lang.String zzd = super.zzd();
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
        if (obj == null) {
            if (zzd != null) {
                return str.concat(zzd);
            }
            return null;
        }
        int length = str.length();
        java.lang.String obj3 = obj.toString();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length + 10 + obj3.length() + 1);
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj3);
        sb2.append(com.ironsource.X3.j.e);
        return sb2.toString();
    }

    abstract void zze(java.lang.Object obj);

    abstract java.lang.Object zzf(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception;

    zzhav(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }
}
