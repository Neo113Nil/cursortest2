package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjc {
    private com.google.android.libraries.places.internal.zzbis zza = com.google.android.libraries.places.internal.zzbis.zza;
    private int zzb;
    private boolean zzc;
    private boolean zzd;

    zzbjc() {
    }

    public final com.google.android.libraries.places.internal.zzbjc zza(com.google.android.libraries.places.internal.zzbis zzbisVar) {
        this.zza = (com.google.android.libraries.places.internal.zzbis) com.google.common.base.Preconditions.checkNotNull(zzbisVar, "callOptions cannot be null");
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbjd zze() {
        return new com.google.android.libraries.places.internal.zzbjd(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final com.google.android.libraries.places.internal.zzbjc zzd(boolean z) {
        this.zzd = z;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbjc zzc(boolean z) {
        this.zzc = z;
        return this;
    }

    public final com.google.android.libraries.places.internal.zzbjc zzb(int i) {
        this.zzb = i;
        return this;
    }
}
