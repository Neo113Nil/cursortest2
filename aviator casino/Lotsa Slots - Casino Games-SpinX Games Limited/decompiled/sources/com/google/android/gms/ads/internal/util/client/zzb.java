package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzb {
    public static final java.util.concurrent.ThreadPoolExecutor zza = new java.util.concurrent.ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue(), new com.google.android.gms.ads.internal.util.client.zza("ClientDefault"));
    public static final java.util.concurrent.ExecutorService zzb = java.util.concurrent.Executors.newSingleThreadExecutor(new com.google.android.gms.ads.internal.util.client.zza("ClientSingle"));
}
