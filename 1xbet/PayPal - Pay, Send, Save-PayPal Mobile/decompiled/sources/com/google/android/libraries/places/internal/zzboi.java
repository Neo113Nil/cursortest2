package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzboi implements java.lang.Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzboj zzb;

    zzboi(com.google.android.libraries.places.internal.zzboj zzbojVar, com.google.android.libraries.places.internal.zzcev zzcevVar, int i) {
        this.zza = i;
        java.util.Objects.requireNonNull(zzbojVar);
        this.zzb = zzbojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzb.zzx().zzc(this.zza);
        } finally {
            try {
            } catch (java.lang.Throwable th) {
            }
        }
    }
}
