package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfe implements com.google.android.libraries.places.internal.zzfa {
    private final com.google.android.libraries.places.internal.zzblw zza;
    private final com.google.common.util.concurrent.ListeningExecutorService zzb;
    private final com.google.android.libraries.places.internal.zzex zzc;

    static /* synthetic */ com.google.common.util.concurrent.ListenableFuture zzc(com.google.android.libraries.places.internal.zzfe zzfeVar, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.google.android.libraries.places.internal.zzbhi zzb = com.google.android.libraries.places.internal.zzbhj.zzb(zzfeVar.zza);
        com.google.android.libraries.places.internal.zzbhd zzc = com.google.android.libraries.places.internal.zzbhe.zzc();
        zzc.zza(str);
        return com.google.android.libraries.places.internal.zzcef.zzb(zzb.zzc().zza(com.google.android.libraries.places.internal.zzbhj.zza(), zzb.zzd()), (com.google.android.libraries.places.internal.zzbhe) zzc.zzG());
    }

    @Override // com.google.android.libraries.places.internal.zzfa
    public final void zza() {
        com.google.common.util.concurrent.ListenableFuture zza = this.zzc.zza();
        final kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.internal.zzfc
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return com.google.android.libraries.places.internal.zzfe.zzc(com.google.android.libraries.places.internal.zzfe.this, (java.lang.String) obj);
            }
        };
        com.google.common.util.concurrent.AsyncFunction asyncFunction = new com.google.common.util.concurrent.AsyncFunction() { // from class: com.google.android.libraries.places.internal.zzfb
            @Override // com.google.common.util.concurrent.AsyncFunction
            public final /* synthetic */ com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                return (com.google.common.util.concurrent.ListenableFuture) kotlin.jvm.functions.Function1.this.invoke(obj);
            }
        };
        com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService = this.zzb;
        com.google.common.util.concurrent.Futures.addCallback(com.google.common.util.concurrent.Futures.transformAsync(zza, asyncFunction, listeningExecutorService), new com.google.android.libraries.places.internal.zzfd(this), listeningExecutorService);
    }

    @Override // com.google.android.libraries.places.internal.zzfa
    public final void zzb() {
        this.zza.zzd();
    }

    public zzfe(com.google.android.libraries.places.internal.zzblw zzblwVar, com.google.android.libraries.places.internal.zzex zzexVar, com.google.common.util.concurrent.ListeningExecutorService listeningExecutorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzblwVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzexVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listeningExecutorService, "");
        this.zza = zzblwVar;
        this.zzc = zzexVar;
        this.zzb = listeningExecutorService;
    }
}
