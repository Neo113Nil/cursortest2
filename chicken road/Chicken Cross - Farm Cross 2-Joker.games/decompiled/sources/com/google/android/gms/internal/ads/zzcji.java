package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcji implements Runnable {
    final /* synthetic */ zzcjk zza;

    zzcji(zzcjk zzcjkVar) {
        Objects.requireNonNull(zzcjkVar);
        this.zza = zzcjkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzB().zzd(this.zza);
    }
}
