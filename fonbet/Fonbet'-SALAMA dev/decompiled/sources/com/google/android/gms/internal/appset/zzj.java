package com.google.android.gms.internal.appset;

import android.content.Context;

/* loaded from: classes.dex */
final class zzj implements Runnable {
    final /* synthetic */ zzl zza;

    public /* synthetic */ zzj(zzl zzlVar, zzi zziVar) {
        this.zza = zzlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        long zza = this.zza.zza();
        if (zza == -1 || System.currentTimeMillis() <= zza) {
            return;
        }
        context = this.zza.zzb;
        zzl.zze(context);
    }
}
