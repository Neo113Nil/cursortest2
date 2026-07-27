package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.U3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzhbx extends zzhcp implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
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
                Object zzf = zzf(obj, zzhcy.zzs(listenableFuture));
                this.zzb = null;
                zze(zzf);
            } catch (Throwable th) {
                try {
                    zzhdq.zza(th);
                    zzb(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zzb(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            zzb(e2.getCause());
        } catch (Exception e3) {
            zzb(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final String zzd() {
        String str;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String zzd = super.zzd();
        if (listenableFuture != null) {
            String obj2 = listenableFuture.toString();
            StringBuilder sb = new StringBuilder(obj2.length() + 16);
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
        String obj3 = obj.toString();
        StringBuilder sb2 = new StringBuilder(length + 10 + obj3.length() + 1);
        sb2.append(str);
        sb2.append("function=[");
        sb2.append(obj3);
        sb2.append(U3.j.e);
        return sb2.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Object obj2) throws Exception;

    zzhbx(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }
}
