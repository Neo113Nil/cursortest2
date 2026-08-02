package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbxu implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbxv zza;

    /* synthetic */ zzbxu(com.google.android.libraries.places.internal.zzbxv zzbxvVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbxvVar);
        this.zza = zzbxvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbxv zzbxvVar = this.zza;
        com.google.android.libraries.places.internal.zzbxt zzbxtVar = new com.google.android.libraries.places.internal.zzbxt(zzbxvVar, null);
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = (com.google.android.libraries.places.internal.zzbnx) zzbxvVar.zze();
        zzbnxVar.zzb(zzbxtVar);
        zzbnxVar.zza();
    }
}
