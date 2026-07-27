package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbhz implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbhr zza;
    final /* synthetic */ zzcgo zzb;
    final /* synthetic */ zzbib zzc;

    zzbhz(zzbib zzbibVar, zzbhr zzbhrVar, zzcgo zzcgoVar) {
        this.zza = zzbhrVar;
        this.zzb = zzcgoVar;
        Objects.requireNonNull(zzbibVar);
        this.zzc = zzbibVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbib zzbibVar = this.zzc;
        synchronized (zzbibVar.zzf()) {
            if (zzbibVar.zzd()) {
                return;
            }
            zzbibVar.zze(true);
            final zzbhq zzc = zzbibVar.zzc();
            if (zzc == null) {
                return;
            }
            zzhdi zzhdiVar = zzcgj.zza;
            final zzbhr zzbhrVar = this.zza;
            final zzcgo zzcgoVar = this.zzb;
            final ListenableFuture submit = zzhdiVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgo zzcgoVar2 = zzcgoVar;
                    zzbhq zzbhqVar = zzc;
                    zzbhz zzbhzVar = zzbhz.this;
                    try {
                        zzbht zzq = zzbhqVar.zzq();
                        boolean zzp = zzbhqVar.zzp();
                        zzbhr zzbhrVar2 = zzbhrVar;
                        zzbho zzf = zzp ? zzq.zzf(zzbhrVar2) : zzq.zze(zzbhrVar2);
                        if (!zzf.zza()) {
                            zzcgoVar2.zzd(new RuntimeException("No entry contents."));
                            zzbhzVar.zzc.zzb();
                            return;
                        }
                        zzbhw zzbhwVar = new zzbhw(zzbhzVar, zzf.zzb(), 1);
                        int read = zzbhwVar.read();
                        if (read == -1) {
                            throw new IOException("Unable to read from cache.");
                        }
                        zzbhwVar.unread(read);
                        zzcgoVar2.zzc(zzbid.zza(zzbhwVar, zzf.zzd(), zzf.zzg(), zzf.zzf(), zzf.zze()));
                    } catch (RemoteException | IOException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                        zzcgoVar2.zzd(e);
                        zzbhzVar.zzc.zzb();
                    }
                }
            });
            zzcgoVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhx
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    int i = zzbhz.zzd;
                    if (zzcgo.this.isCancelled()) {
                        submit.cancel(true);
                    }
                }
            }, zzcgj.zzh);
        }
    }
}
