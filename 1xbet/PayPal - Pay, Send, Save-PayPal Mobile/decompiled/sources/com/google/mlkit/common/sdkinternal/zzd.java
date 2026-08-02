package com.google.mlkit.common.sdkinternal;

/* loaded from: classes9.dex */
final class zzd extends java.lang.ref.PhantomReference implements com.google.mlkit.common.sdkinternal.Cleaner.Cleanable {
    private final java.util.Set zza;
    private final java.lang.Runnable zzb;

    /* synthetic */ zzd(java.lang.Object obj, java.lang.ref.ReferenceQueue referenceQueue, java.util.Set set, java.lang.Runnable runnable, com.google.mlkit.common.sdkinternal.zzc zzcVar) {
        super(obj, referenceQueue);
        this.zza = set;
        this.zzb = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.Cleaner.Cleanable
    public final void clean() {
        if (this.zza.remove(this)) {
            clear();
            this.zzb.run();
        }
    }
}
