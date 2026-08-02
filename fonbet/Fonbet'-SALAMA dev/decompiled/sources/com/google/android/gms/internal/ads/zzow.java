package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class zzow extends BroadcastReceiver {
    final /* synthetic */ zzoy zza;

    public /* synthetic */ zzow(zzoy zzoyVar, zzox zzoxVar) {
        this.zza = zzoyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        zze zzeVar;
        zzoz zzozVar;
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzoy zzoyVar = this.zza;
        zzeVar = zzoyVar.zzh;
        zzozVar = zzoyVar.zzg;
        zzoyVar.zzj(zzot.zzd(context, intent, zzeVar, zzozVar));
    }
}
