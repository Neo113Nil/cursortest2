package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdo {
    private com.google.android.libraries.places.internal.zzcdn zza;
    private final com.google.android.libraries.places.internal.zzccj zzb = new com.google.android.libraries.places.internal.zzccj();

    public final com.google.android.libraries.places.internal.zzcdo zzb(java.lang.String str, java.lang.String str2) {
        this.zzb.zza(str, str2);
        return this;
    }

    public final com.google.android.libraries.places.internal.zzcdp zzc() {
        if (this.zza != null) {
            return new com.google.android.libraries.places.internal.zzcdp(this, null);
        }
        throw new java.lang.IllegalStateException("url == null");
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzccj zze() {
        return this.zzb;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzcdn zzd() {
        return this.zza;
    }

    public final com.google.android.libraries.places.internal.zzcdo zza(com.google.android.libraries.places.internal.zzcdn zzcdnVar) {
        this.zza = zzcdnVar;
        return this;
    }
}
