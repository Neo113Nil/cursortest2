package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class CloseGuard implements java.io.Closeable {
    public static final int API_TRANSLATE = 1;
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean();
    private final java.lang.String zzb;
    private final com.google.mlkit.common.sdkinternal.Cleaner.Cleanable zzc;

    CloseGuard(java.lang.Object obj, final int i, com.google.mlkit.common.sdkinternal.Cleaner cleaner, final java.lang.Runnable runnable, final com.google.android.gms.internal.mlkit_common.zzsh zzshVar) {
        this.zzb = obj.toString();
        this.zzc = cleaner.register(obj, new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zze
            @Override // java.lang.Runnable
            public final void run() {
                com.google.mlkit.common.sdkinternal.CloseGuard.this.zza(i, zzshVar, runnable);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.zza.set(true);
        this.zzc.clean();
    }

    final /* synthetic */ void zza(int i, com.google.android.gms.internal.mlkit_common.zzsh zzshVar, java.lang.Runnable runnable) {
        if (!this.zza.get()) {
            new java.lang.Object[]{this.zzb};
            com.google.android.gms.internal.mlkit_common.zzmw zzmwVar = new com.google.android.gms.internal.mlkit_common.zzmw();
            com.google.android.gms.internal.mlkit_common.zzmn zzmnVar = new com.google.android.gms.internal.mlkit_common.zzmn();
            zzmnVar.zzb(com.google.android.gms.internal.mlkit_common.zzmm.zzb(i));
            zzmwVar.zzh(zzmnVar.zzc());
            zzshVar.zzd(com.google.android.gms.internal.mlkit_common.zzsk.zzf(zzmwVar), com.google.android.gms.internal.mlkit_common.zzmv.HANDLE_LEAKED);
        }
        runnable.run();
    }

    public static class Factory {
        private final com.google.mlkit.common.sdkinternal.Cleaner zza;

        public com.google.mlkit.common.sdkinternal.CloseGuard create(java.lang.Object obj, int i, java.lang.Runnable runnable) {
            return new com.google.mlkit.common.sdkinternal.CloseGuard(obj, i, this.zza, runnable, com.google.android.gms.internal.mlkit_common.zzss.zzb("common"));
        }

        public Factory(com.google.mlkit.common.sdkinternal.Cleaner cleaner) {
            this.zza = cleaner;
        }
    }
}
