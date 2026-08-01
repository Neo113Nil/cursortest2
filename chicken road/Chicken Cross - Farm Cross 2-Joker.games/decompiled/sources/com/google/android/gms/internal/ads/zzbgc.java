package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbgc implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzbgg zzb;

    zzbgc(zzbgg zzbggVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzbggVar);
        this.zzb = zzbggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
