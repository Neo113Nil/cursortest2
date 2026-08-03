package com.google.android.gms.common.util.concurrent;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
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
        sb.append(com.ironsource.X3.j.d);
        sb.append(andIncrement);
        sb.append(com.ironsource.X3.j.e);
        newThread.setName(sb.toString());
        return newThread;
    }
}
