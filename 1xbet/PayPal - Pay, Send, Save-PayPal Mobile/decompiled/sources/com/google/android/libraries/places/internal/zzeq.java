package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzeq implements com.google.android.libraries.places.internal.zzbie {
    public static com.google.common.util.concurrent.ListeningExecutorService zzc() {
        com.google.common.util.concurrent.ListeningScheduledExecutorService listeningDecorator = com.google.common.util.concurrent.MoreExecutors.listeningDecorator(java.util.concurrent.Executors.newScheduledThreadPool(4, new com.google.common.util.concurrent.ThreadFactoryBuilder().setNameFormat("Maps Platform Background-%d").setPriority(10).build()));
        com.google.android.libraries.places.internal.zzbig.zza(listeningDecorator);
        return listeningDecorator;
    }

    @Override // com.google.android.libraries.places.internal.zzcez
    public final /* synthetic */ java.lang.Object zzb() {
        return zzc();
    }

    public static com.google.android.libraries.places.internal.zzeq zza() {
        return com.google.android.libraries.places.internal.zzep.zza;
    }
}
