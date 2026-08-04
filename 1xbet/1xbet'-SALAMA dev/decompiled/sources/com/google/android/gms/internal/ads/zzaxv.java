package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzaxv extends BroadcastReceiver {
    final /* synthetic */ zzaxy zza;

    public zzaxv(zzaxy zzaxyVar) {
        this.zza = zzaxyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzj(3);
    }
}
