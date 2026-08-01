package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcmk implements Runnable {
    final /* synthetic */ zzcmp zza;

    zzcmk(zzcmp zzcmpVar) {
        Objects.requireNonNull(zzcmpVar);
        this.zza = zzcmpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
