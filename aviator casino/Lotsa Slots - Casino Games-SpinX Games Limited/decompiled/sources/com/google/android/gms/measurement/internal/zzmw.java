package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmw implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzf;

    zzmw(com.google.android.gms.measurement.internal.zznk zznkVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzrVar;
        this.zze = z;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzf = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        com.google.android.gms.measurement.internal.zznk zznkVar;
        com.google.android.gms.measurement.internal.zzga zzZ;
        java.util.concurrent.atomic.AtomicReference atomicReference2 = this.zza;
        synchronized (atomicReference2) {
            try {
                try {
                    zznkVar = this.zzf;
                    zzZ = zznkVar.zzZ();
                } catch (android.os.RemoteException e) {
                    this.zzf.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; remote exception", null, this.zzb, e);
                    this.zza.set(java.util.Collections.emptyList());
                    atomicReference = this.zza;
                }
                if (zzZ == null) {
                    zznkVar.zzu.zzaV().zzb().zzd("(legacy) Failed to get user properties; not connected to service", null, this.zzb, this.zzc);
                    atomicReference2.set(java.util.Collections.emptyList());
                    atomicReference2.notify();
                    return;
                }
                if (android.text.TextUtils.isEmpty(null)) {
                    com.google.android.gms.measurement.internal.zzr zzrVar = this.zzd;
                    com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
                    atomicReference2.set(zzZ.zzp(this.zzb, this.zzc, this.zze, zzrVar));
                } else {
                    atomicReference2.set(zzZ.zzq(null, this.zzb, this.zzc, this.zze));
                }
                zznkVar.zzV();
                atomicReference = this.zza;
                atomicReference.notify();
            } catch (java.lang.Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
