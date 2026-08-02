package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbrm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbnp zza;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbrt zzb;

    zzbrm(com.google.android.libraries.places.internal.zzbrt zzbrtVar, com.google.android.libraries.places.internal.zzbnp zzbnpVar) {
        this.zza = zzbnpVar;
        java.util.Objects.requireNonNull(zzbrtVar);
        this.zzb = zzbrtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzq().zzl(this.zza);
    }
}
