package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqr implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqt zzc;

    zzbqr(com.google.android.libraries.places.internal.zzbqt zzbqtVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbnpVar;
        this.zzb = zzbmgVar;
        java.util.Objects.requireNonNull(zzbqtVar);
        this.zzc = zzbqtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzf().zzc(this.zza, this.zzb);
    }
}
