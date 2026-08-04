package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzdz extends BroadcastReceiver {
    final /* synthetic */ zzeb zza;

    public /* synthetic */ zzdz(zzeb zzebVar, zzea zzeaVar) {
        this.zza = zzebVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdy
            @Override // java.lang.Runnable
            public final void run() {
                zzeb.zzd(this.zza.zza, context);
            }
        });
    }
}
