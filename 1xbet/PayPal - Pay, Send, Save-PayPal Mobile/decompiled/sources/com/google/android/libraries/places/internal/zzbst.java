package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbst implements com.google.android.libraries.places.internal.zzbzx {
    @Override // com.google.android.libraries.places.internal.zzbzx
    public final /* synthetic */ void zza(java.lang.Object obj) {
        ((java.util.concurrent.ExecutorService) ((java.util.concurrent.Executor) obj)).shutdown();
    }

    @Override // com.google.android.libraries.places.internal.zzbzx
    public final /* synthetic */ java.lang.Object zzb() {
        return java.util.concurrent.Executors.newCachedThreadPool(com.google.android.libraries.places.internal.zzbsz.zzd("grpc-default-executor-%d", true));
    }

    public final java.lang.String toString() {
        return "grpc-default-executor";
    }

    zzbst() {
    }
}
