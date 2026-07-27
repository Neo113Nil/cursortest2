package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzehg extends zzeha {
    private String zzg;
    private int zzh = 1;

    zzehg(Context context) {
        this.zzf = new zzcax(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzeha, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzehp(1));
    }

    public final ListenableFuture zza(zzcbv zzcbvVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzhcy.zzc(new zzehp(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 2;
            this.zzc = true;
            this.zze = zzcbvVar;
            this.zzf.checkAvailabilityAndConnect();
            zzcgo zzcgoVar = this.zza;
            zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzehg.this.zzb();
                }
            }, zzcgj.zzh);
            return zzcgoVar;
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzhcy.zzc(new zzehp(2));
            }
            if (this.zzc) {
                return this.zza;
            }
            this.zzh = 3;
            this.zzc = true;
            this.zzg = str;
            this.zzf.checkAvailabilityAndConnect();
            zzcgo zzcgoVar = this.zza;
            zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzehe
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzehg.this.zzb();
                }
            }, zzcgj.zzh);
            return zzcgoVar;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        this.zzf.zzp().zzg(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoM)).booleanValue() ? new zzegz(this.zza, this.zze) : new zzegy(this));
                    } else if (i == 3) {
                        this.zzf.zzp().zzh(this.zzg, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzoM)).booleanValue() ? new zzegz(this.zza, this.zze) : new zzegy(this));
                    } else {
                        this.zza.zzd(new zzehp(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzehp(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzehp(1));
                }
            }
        }
    }
}
