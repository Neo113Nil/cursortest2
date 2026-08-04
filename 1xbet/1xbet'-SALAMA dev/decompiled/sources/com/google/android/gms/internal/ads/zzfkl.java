package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzfkl extends BroadcastReceiver {
    final /* synthetic */ zzfkm zza;

    public zzfkl(zzfkm zzfkmVar) {
        this.zza = zzfkmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfkm zzfkmVar = this.zza;
            zzfkmVar.zzd(true, zzfkmVar.zzd);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfkm zzfkmVar2 = this.zza;
            zzfkmVar2.zzd(false, zzfkmVar2.zzd);
            this.zza.zzc = false;
        }
    }
}
