package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfuc extends zzfvd {
    public zzfuc(ClientApi clientApi, Context context, int i, zzfms zzfmsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzcb zzcbVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock) {
        super(clientApi, context, i, zzfmsVar, zzfpVar, zzcbVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    protected final ListenableFuture zza(Context context) {
        zzbvu zzd = this.zzd.zzd();
        if (zzd == null) {
            return zzhcy.zzc(new zzftq(1, "Failed to create an interstitial ad manager."));
        }
        zzeui zzeuiVar = (zzeui) this.zza.zzb(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza, zzd, this.zzc);
        if (zzeuiVar == null) {
            return zzhcy.zzc(new zzftq(1, "Failed to create an interstitial ad manager."));
        }
        zzhdr zze = zzhdr.zze();
        try {
            zzB(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc);
            zzftp zzftpVar = this.zzf;
            if (zzftpVar != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzY)).booleanValue()) {
                    zzeuiVar.zzK(new zzfua(zzftpVar, this.zzi, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzZ)).longValue(), this));
                }
            }
            zzeuiVar.zzP(((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zzc, new zzfub(zzeuiVar, new zzfuq(this, zze), ((com.google.android.gms.ads.internal.client.zzfp) this.zze.get()).zza));
            return zze;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e);
            return zzhcy.zzc(new zzftq(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    protected final long zzb() {
        return ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzV)).longValue();
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    protected final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzdx zzc(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbu) obj).zzs();
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e);
            return null;
        }
    }

    public zzfuc(String str, ClientApi clientApi, Context context, int i, zzfms zzfmsVar, com.google.android.gms.ads.internal.client.zzfp zzfpVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfpm zzfpmVar, zzfty zzftyVar, Clock clock, zzftp zzftpVar) {
        super(str, clientApi, context, i, zzfmsVar, zzfpVar, zzceVar, scheduledExecutorService, zzfpmVar, zzftyVar, clock, zzftpVar);
    }
}
