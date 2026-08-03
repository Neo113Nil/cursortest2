package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzco extends com.google.android.gms.internal.measurement.zzct {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();
    private boolean zzb;

    public static final java.lang.Object zzf(android.os.Bundle bundle, java.lang.Class cls) {
        java.lang.Object obj;
        if (bundle == null || (obj = bundle.get(com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ)) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (java.lang.ClassCastException e) {
            android.util.Log.w("AM", java.lang.String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzcu
    public final void zzb(android.os.Bundle bundle) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.zzb = true;
                } finally {
                    this.zza.notify();
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public final java.lang.String zzc(long j) {
        return (java.lang.String) zzf(zze(j), java.lang.String.class);
    }

    public final java.lang.Long zzd(long j) {
        return (java.lang.Long) zzf(zze(j), java.lang.Long.class);
    }

    public final android.os.Bundle zze(long j) {
        android.os.Bundle bundle;
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            if (!this.zzb) {
                try {
                    atomicReference.wait(j);
                } catch (java.lang.InterruptedException unused) {
                    return null;
                }
            }
            bundle = (android.os.Bundle) this.zza.get();
        }
        return bundle;
    }
}
