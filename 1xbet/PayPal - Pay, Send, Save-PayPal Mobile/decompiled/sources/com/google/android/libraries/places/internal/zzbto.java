package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbto implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbqa zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbua zzc;

    zzbto(com.google.android.libraries.places.internal.zzbua zzbuaVar, com.google.android.libraries.places.internal.zzbqa zzbqaVar, boolean z) {
        this.zza = zzbqaVar;
        this.zzb = z;
        java.util.Objects.requireNonNull(zzbuaVar);
        this.zzc = zzbuaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzz().zza(this.zza, this.zzb);
    }
}
