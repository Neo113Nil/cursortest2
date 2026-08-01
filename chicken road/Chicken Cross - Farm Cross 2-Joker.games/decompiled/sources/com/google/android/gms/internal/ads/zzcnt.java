package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzcnt implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);
    private final int zzb;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.zza.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(andIncrement).length() + 26);
        sb.append("AdWorker(WebViewStartup) #");
        sb.append(andIncrement);
        return new zzcns(this, runnable, sb.toString(), runnable);
    }

    final /* synthetic */ int zza() {
        return this.zzb;
    }
}
