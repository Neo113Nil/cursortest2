package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaft {
    private final com.google.android.gms.internal.ads.zzafs zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzaft(com.google.android.gms.internal.ads.zzafs zzafsVar) {
        this.zza = zzafsVar;
    }

    public final com.google.android.gms.internal.ads.zzafy zza(java.lang.Object... objArr) {
        java.lang.reflect.Constructor zza;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.zzb;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    zza = this.zza.zza();
                } catch (java.lang.ClassNotFoundException unused) {
                    this.zzb.set(true);
                } catch (java.lang.Exception e) {
                    throw new java.lang.RuntimeException("Error instantiating extension", e);
                }
            }
            zza = null;
        }
        if (zza == null) {
            return null;
        }
        try {
            return (com.google.android.gms.internal.ads.zzafy) zza.newInstance(objArr);
        } catch (java.lang.Exception e2) {
            throw new java.lang.IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
