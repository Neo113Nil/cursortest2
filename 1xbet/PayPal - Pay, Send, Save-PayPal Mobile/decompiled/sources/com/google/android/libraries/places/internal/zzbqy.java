package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
final class zzbqy implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrb zzb;

    zzbqy(com.google.android.libraries.places.internal.zzbrb zzbrbVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbrbVar);
        this.zzb = zzbrbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzm().zzd(this.zza);
    }
}
