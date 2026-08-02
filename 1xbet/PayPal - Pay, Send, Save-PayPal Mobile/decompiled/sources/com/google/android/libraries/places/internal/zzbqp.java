package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqp implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqt zzb;

    zzbqp(com.google.android.libraries.places.internal.zzbqt zzbqtVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbmgVar;
        java.util.Objects.requireNonNull(zzbqtVar);
        this.zzb = zzbqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zza(this.zza);
    }
}
