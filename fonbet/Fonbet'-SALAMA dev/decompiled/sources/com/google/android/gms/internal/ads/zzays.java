package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
final class zzays implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzayw zzb;

    public zzays(zzayw zzaywVar, View view) {
        this.zza = view;
        this.zzb = zzaywVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
