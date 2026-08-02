package com.google.android.libraries.places.api.auth;

/* loaded from: classes8.dex */
final class zzc extends com.google.android.libraries.places.api.auth.zza {
    private boolean zza;
    private java.lang.String zzb;
    private java.lang.String zzc;
    private byte zzd;

    @Override // com.google.android.libraries.places.api.auth.zza
    public final com.google.android.libraries.places.api.auth.zzb zzd() {
        if (this.zzd == 1) {
            return new com.google.android.libraries.places.api.auth.zzd(this.zza, this.zzb, this.zzc, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: appCheckEnabled");
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final com.google.android.libraries.places.api.auth.zza zzc(java.lang.String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final com.google.android.libraries.places.api.auth.zza zzb(java.lang.String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.libraries.places.api.auth.zza
    public final com.google.android.libraries.places.api.auth.zza zza(boolean z) {
        this.zza = z;
        this.zzd = (byte) 1;
        return this;
    }

    zzc() {
    }
}
