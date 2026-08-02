package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzatl {
    private final java.lang.Object zza;
    private final java.util.LinkedHashMap zzb;
    private int zzc;

    zzatl(com.google.android.libraries.places.internal.zzatm zzatmVar, java.lang.Object obj, int i) {
        java.util.Objects.requireNonNull(zzatmVar);
        this.zzb = new java.util.LinkedHashMap();
        this.zza = obj;
        this.zzc = i;
    }

    final boolean zza() {
        return this.zzb.isEmpty();
    }

    final boolean zzb() {
        return this.zzb.isEmpty() && this.zzc == 0;
    }

    final /* synthetic */ void zze(int i) {
        this.zzc = i;
    }

    final /* synthetic */ int zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zza;
    }
}
