package com.google.android.gms.common.util.concurrent;

/* loaded from: classes8.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb = new java.util.concurrent.atomic.AtomicInteger();
    private final java.util.concurrent.ThreadFactory zzc = java.util.concurrent.Executors.defaultThreadFactory();

    public NumberedThreadFactory(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str, "Name must not be null");
        this.zza = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread newThread = this.zzc.newThread(new com.google.android.gms.common.util.concurrent.zza(runnable, 0));
        int andIncrement = this.zzb.getAndIncrement();
        int length = java.lang.String.valueOf(andIncrement).length();
        java.lang.String str = this.zza;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 1 + length + 1);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
