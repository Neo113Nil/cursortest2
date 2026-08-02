package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class zzfkl extends BroadcastReceiver {
    final /* synthetic */ zzfkm zza;

    public zzfkl(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z4;
        boolean z7;
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfkm zzfkmVar = this.zza;
            z7 = zzfkmVar.zzd;
            zzfkmVar.zzd(true, z7);
            this.zza.zzc = true;
            return;
        }
        if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfkm zzfkmVar2 = this.zza;
            z4 = zzfkmVar2.zzd;
            zzfkmVar2.zzd(false, z4);
            this.zza.zzc = false;
        }
    }
}
