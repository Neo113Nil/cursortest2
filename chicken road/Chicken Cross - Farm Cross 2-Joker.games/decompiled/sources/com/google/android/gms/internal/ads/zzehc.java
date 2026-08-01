package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzehc extends zzeha {
    private final Context zzg;
    private final Executor zzh;

    zzehc(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzcax(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoM)).booleanValue() ? new zzegz(this.zza, this.zze) : new zzegy(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzehp(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zzd(new zzehp(1));
                }
            }
        }
    }

    public final ListenableFuture zza(zzcbv zzcbvVar) {
        synchronized (this.zzb) {
            if (this.zzc) {
                return this.zza;
            }
            this.zzc = true;
            this.zze = zzcbvVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcgo zzcgoVar = this.zza;
            zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehb
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzehc.this.zzb();
                }
            }, zzcgj.zzh);
            zzc(this.zzg, zzcgoVar, this.zzh);
            return zzcgoVar;
        }
    }
}
