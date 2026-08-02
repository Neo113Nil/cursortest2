package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbqi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbiw zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbmg zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqu zzc;

    zzbqi(com.google.android.libraries.places.internal.zzbqu zzbquVar, com.google.android.libraries.places.internal.zzbiw zzbiwVar, com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        this.zza = zzbiwVar;
        this.zzb = zzbmgVar;
        java.util.Objects.requireNonNull(zzbquVar);
        this.zzc = zzbquVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzk().zza(this.zza, this.zzb);
    }
}
