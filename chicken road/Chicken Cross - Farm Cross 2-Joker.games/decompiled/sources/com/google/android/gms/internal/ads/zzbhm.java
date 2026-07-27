package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbhm implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbhn zza;

    zzbhm(zzbhn zzbhnVar) {
        Objects.requireNonNull(zzbhnVar);
        this.zza = zzbhnVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        zzbhn zzbhnVar = this.zza;
        synchronized (zzbhnVar.zzh()) {
            zzbhnVar.zzk(null);
            if (zzbhnVar.zzi() != null) {
                zzbhnVar.zzj(null);
            }
            zzbhnVar.zzh().notifyAll();
        }
    }
}
