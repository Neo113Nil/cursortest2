package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
public class Cleaner {
    private final java.lang.ref.ReferenceQueue zza = new java.lang.ref.ReferenceQueue();
    private final java.util.Set zzb = java.util.Collections.synchronizedSet(new java.util.HashSet());

    public interface Cleanable {
        void clean();
    }

    private Cleaner() {
    }

    public static com.google.mlkit.common.sdkinternal.Cleaner create() {
        com.google.mlkit.common.sdkinternal.Cleaner cleaner = new com.google.mlkit.common.sdkinternal.Cleaner();
        cleaner.register(cleaner, new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zza
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final java.lang.ref.ReferenceQueue referenceQueue = cleaner.zza;
        final java.util.Set set = cleaner.zzb;
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzb
            @Override // java.lang.Runnable
            public final void run() {
                java.lang.ref.ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((com.google.mlkit.common.sdkinternal.zzd) referenceQueue2.remove()).clean();
                    } catch (java.lang.InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cleaner;
    }

    public com.google.mlkit.common.sdkinternal.Cleaner.Cleanable register(java.lang.Object obj, java.lang.Runnable runnable) {
        com.google.mlkit.common.sdkinternal.zzd zzdVar = new com.google.mlkit.common.sdkinternal.zzd(obj, this.zza, this.zzb, runnable, null);
        this.zzb.add(zzdVar);
        return zzdVar;
    }
}
