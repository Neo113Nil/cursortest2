package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class zzavx extends BroadcastReceiver {
    final /* synthetic */ zzavy zza;

    public zzavx(zzavy zzavyVar) {
        this.zza = zzavyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
