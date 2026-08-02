package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzath {
    final /* synthetic */ com.google.android.libraries.places.internal.zzatk zza;
    private final java.lang.Object zzb;
    private final java.util.LinkedHashMap zzc;
    private int zzd;

    /* synthetic */ zzath(com.google.android.libraries.places.internal.zzatk zzatkVar, java.lang.Object obj, byte[] bArr) {
        java.util.Objects.requireNonNull(zzatkVar);
        this.zza = zzatkVar;
        this.zzc = new java.util.LinkedHashMap();
        this.zzb = obj;
    }

    final boolean zza() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzd();
    }

    final boolean zzb() {
        return this.zzc.isEmpty() && this.zzd == this.zza.zzr().zzf() + 1;
    }

    final /* synthetic */ void zzf(int i) {
        this.zzd = i;
    }

    final /* synthetic */ int zze() {
        return this.zzd;
    }

    final /* synthetic */ java.util.LinkedHashMap zzd() {
        return this.zzc;
    }

    final /* synthetic */ java.lang.Object zzc() {
        return this.zzb;
    }
}
