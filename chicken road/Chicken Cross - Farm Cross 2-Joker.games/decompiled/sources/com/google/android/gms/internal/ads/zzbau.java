package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbau implements Runnable {
    final /* synthetic */ zzbav zza;

    zzbau(zzbav zzbavVar) {
        Objects.requireNonNull(zzbavVar);
        this.zza = zzbavVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbav zzbavVar = this.zza;
        synchronized (zzbavVar.zzp()) {
            if (zzbavVar.zzq()) {
                return;
            }
            zzbavVar.zzr(true);
            try {
                zzbavVar.zzn();
            } catch (Exception e) {
                this.zza.zzo().zzc(2023, -1L, e);
            }
            zzbav zzbavVar2 = this.zza;
            synchronized (zzbavVar2.zzp()) {
                zzbavVar2.zzr(false);
            }
        }
    }
}
