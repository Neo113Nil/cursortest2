package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzbsd implements Runnable {
    final /* synthetic */ zzbsg zza;

    zzbsd(zzbsg zzbsgVar) {
        Objects.requireNonNull(zzbsgVar);
        this.zza = zzbsgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb();
    }
}
