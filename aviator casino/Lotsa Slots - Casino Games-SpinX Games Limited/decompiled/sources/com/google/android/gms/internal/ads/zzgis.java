package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgis extends com.google.android.gms.internal.ads.zzgix {
    private final android.content.Context zza;
    private final java.util.Map zzb;

    zzgis(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, java.util.Map map, android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("LdJAK+tGLa5RtfoE4Vj1lf7WBx7tLt5NokheHxJZ8WRPF5i3vkHONYq7jawQpmfE", "i59R9TSjiUVrKRVh1QlIoomNztzQtHmvvEjkodMX8Xo=", zzaxmVar, zzghtVar, zzgqhVar.zza(120));
        this.zza = context;
        this.zzb = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Long l = -1L;
        try {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.lang.Long l2 = (java.lang.Long) method.invoke("", this.zza);
                l2.getClass();
                java.lang.Long l3 = l2;
                l = l2;
            } else {
                com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) this.zzb.get("gs");
                if (listenableFuture != null && listenableFuture.isDone()) {
                    l = java.lang.Long.valueOf(((com.google.android.gms.internal.ads.zzaym) listenableFuture.get()).zze());
                }
            }
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
        synchronized (zzaxmVar) {
            zzaxmVar.zzR(l.longValue());
        }
    }
}
