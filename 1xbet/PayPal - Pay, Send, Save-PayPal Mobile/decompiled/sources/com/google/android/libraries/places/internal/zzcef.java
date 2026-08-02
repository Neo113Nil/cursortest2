package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcef {
    static final com.google.android.libraries.places.internal.zzbir zza;
    private static final java.util.logging.Logger zzb = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzcef.class.getName());

    static {
        if (!com.google.common.base.Strings.isNullOrEmpty(java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE"))) {
            java.lang.System.getenv("GRPC_CLIENT_CALL_REJECT_RUNNABLE");
        }
        zza = com.google.android.libraries.places.internal.zzbir.zza("internal-stub-type");
    }

    public static void zza(com.google.android.libraries.places.internal.zzbix zzbixVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzcej zzcejVar) {
        com.google.common.base.Preconditions.checkNotNull(zzcejVar, "responseObserver");
        zzd(zzbixVar, obj, new com.google.android.libraries.places.internal.zzcec(zzcejVar, new com.google.android.libraries.places.internal.zzcdz(zzbixVar, false)));
    }

    public static com.google.common.util.concurrent.ListenableFuture zzb(com.google.android.libraries.places.internal.zzbix zzbixVar, java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzcea zzceaVar = new com.google.android.libraries.places.internal.zzcea(zzbixVar);
        zzd(zzbixVar, obj, new com.google.android.libraries.places.internal.zzcee(zzceaVar));
        return zzceaVar;
    }

    private static java.lang.RuntimeException zzc(com.google.android.libraries.places.internal.zzbix zzbixVar, java.lang.Throwable th) {
        try {
            zzbixVar.zze(null, th);
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            zzb.logp(java.util.logging.Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", e);
        }
        if (th instanceof java.lang.RuntimeException) {
            throw ((java.lang.RuntimeException) th);
        }
        if (th instanceof java.lang.Error) {
            throw ((java.lang.Error) th);
        }
        throw new java.lang.AssertionError(th);
    }

    private static void zzd(com.google.android.libraries.places.internal.zzbix zzbixVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzceb zzcebVar) {
        zzbixVar.zza(zzcebVar, new com.google.android.libraries.places.internal.zzbmg());
        zzcebVar.zze();
        try {
            zzbixVar.zzb(obj);
            zzbixVar.zzd();
        } catch (java.lang.Error | java.lang.RuntimeException e) {
            throw zzc(zzbixVar, e);
        }
    }

    private zzcef() {
    }
}
