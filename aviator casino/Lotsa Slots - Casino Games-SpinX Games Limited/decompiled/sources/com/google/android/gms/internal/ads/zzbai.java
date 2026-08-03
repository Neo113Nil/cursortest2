package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbai implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbaj zza;

    zzbai(com.google.android.gms.internal.ads.zzbaj zzbajVar) {
        java.util.Objects.requireNonNull(zzbajVar);
        this.zza = zzbajVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.ConditionVariable conditionVariable;
        boolean z;
        android.os.ConditionVariable conditionVariable2;
        com.google.android.gms.internal.ads.zzbaj zzbajVar = this.zza;
        if (zzbajVar.zzb != null) {
            return;
        }
        conditionVariable = com.google.android.gms.internal.ads.zzbaj.zzd;
        synchronized (conditionVariable) {
            if (zzbajVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((java.lang.Boolean) com.google.android.gms.internal.ads.zzbiq.zzdu.zze()).booleanValue();
            } catch (java.lang.IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    com.google.android.gms.internal.ads.zzbaj.zza = com.google.android.gms.internal.ads.zzfzc.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (java.lang.Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = java.lang.Boolean.valueOf(z2);
            conditionVariable2 = com.google.android.gms.internal.ads.zzbaj.zzd;
            conditionVariable2.open();
        }
    }
}
