package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbhl implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbhn zza;

    zzbhl(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.zza = zzbhnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbhn zzbhnVar = this.zza;
        synchronized (zzbhnVar.zzh()) {
            try {
                if (zzbhnVar.zzi() != null) {
                    zzbhnVar.zzk(zzbhnVar.zzi().zzq());
                }
            } catch (DeadObjectException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        zzbhn zzbhnVar = this.zza;
        synchronized (zzbhnVar.zzh()) {
            zzbhnVar.zzk(null);
            zzbhnVar.zzh().notifyAll();
        }
    }
}
