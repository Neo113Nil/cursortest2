package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbtl zza;

    zzbtk(com.google.android.libraries.places.internal.zzbtl zzbtlVar) {
        java.util.Objects.requireNonNull(zzbtlVar);
        this.zza = zzbtlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.libraries.places.internal.zzbua zzbuaVar = this.zza.zzb;
        zzbuaVar.zzv(null);
        zzbuaVar.zzx(null);
        zzbuaVar.zzw().zzd(com.google.android.libraries.places.internal.zzbnp.zzi.zze("InternalSubchannel closed transport due to address change"));
    }
}
