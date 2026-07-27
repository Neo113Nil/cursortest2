package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzfxd implements Runnable {
    final /* synthetic */ zzfxe zza;
    private final WebView zzb;

    zzfxd(zzfxe zzfxeVar) {
        Objects.requireNonNull(zzfxeVar);
        this.zza = zzfxeVar;
        this.zzb = zzfxeVar.zzq();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
