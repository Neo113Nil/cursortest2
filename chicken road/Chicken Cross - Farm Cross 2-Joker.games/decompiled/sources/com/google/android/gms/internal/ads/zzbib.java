package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbib {
    private zzbhq zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbib(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbhr zzbhrVar) {
        zzbhv zzbhvVar = new zzbhv(this);
        zzbhz zzbhzVar = new zzbhz(this, zzbhrVar, zzbhvVar);
        zzbia zzbiaVar = new zzbia(this, zzbhvVar);
        synchronized (this.zzd) {
            zzbhq zzbhqVar = new zzbhq(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbhzVar, zzbiaVar);
            this.zza = zzbhqVar;
            zzbhqVar.checkAvailabilityAndConnect();
        }
        return zzbhvVar;
    }

    final /* synthetic */ zzbhq zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbhq zzbhqVar = this.zza;
            if (zzbhqVar == null) {
                return;
            }
            zzbhqVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
