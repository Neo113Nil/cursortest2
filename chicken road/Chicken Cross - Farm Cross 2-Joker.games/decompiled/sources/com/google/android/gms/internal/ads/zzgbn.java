package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzgbn implements ThreadFactory {
    private final ThreadFactory zza = Executors.defaultThreadFactory();

    private zzgbn() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.zza.newThread(runnable);
        if (newThread == null) {
            throw new NullPointerException("Default ThreadFactory returned null thread");
        }
        String name = newThread.getName();
        String.valueOf(name);
        newThread.setName("punch".concat(String.valueOf(name)));
        return newThread;
    }

    /* synthetic */ zzgbn(byte[] bArr) {
    }
}
