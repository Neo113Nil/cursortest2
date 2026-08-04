package com.google.android.gms.internal.ads;

import F2.F0;
import F2.M;
import F2.S;
import I2.J;
import J2.j;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzfif extends zzfiz {
    public zzfif(ClientApi clientApi, Context context, int i7, zzboo zzbooVar, com.google.android.gms.ads.internal.client.zzfq zzfqVar, S s7, ScheduledExecutorService scheduledExecutorService, zzfig zzfigVar, p090m3.a aVar) {
        super(clientApi, context, i7, zzbooVar, zzfqVar, s7, scheduledExecutorService, zzfigVar, aVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfiz
    public final /* bridge */ /* synthetic */ F0 zza(Object obj) {
        try {
            return ((zzazq) obj).zzf();
        } catch (RemoteException e7) {
            int i7 = J.f3546b;
            j.c("Failed to get response info for the app open ad.", e7);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfiz
    public final I3.b zzb(Context context) {
        zzgbw zzgbwVarZze = zzgbw.zze();
        M mZ = this.zza.z(new p105o3.b(context), com.google.android.gms.ads.internal.client.zzr.j(), this.zze.f10729a, this.zzd, this.zzc);
        if (mZ != null) {
            try {
                mZ.zzH(new zzfie(this, zzgbwVarZze, this.zze));
                mZ.zzab(this.zze.f10731c);
            } catch (RemoteException e7) {
                j.h("Failed to load app open ad.", e7);
                zzgbwVarZze.zzd(new zzfic(1, "remote exception"));
            }
        } else {
            zzgbwVarZze.zzd(new zzfic(1, "Failed to create an app open ad manager."));
        }
        return zzgbwVarZze;
    }
}
