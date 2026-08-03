package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
final class zzv {
    private java.lang.String zza = null;
    private java.lang.Boolean zzb = null;
    private java.lang.Boolean zzc = null;

    private zzv() {
    }

    /* synthetic */ zzv(byte[] bArr) {
    }

    final com.google.android.gms.common.zzv zza(java.lang.String str) {
        this.zza = str;
        return this;
    }

    final com.google.android.gms.common.zzv zzb(boolean z) {
        this.zzb = java.lang.Boolean.valueOf(z);
        return this;
    }

    final com.google.android.gms.common.zzv zzc(boolean z) {
        this.zzc = java.lang.Boolean.valueOf(z);
        return this;
    }

    final com.google.android.gms.common.zzw zzd() {
        java.lang.Boolean bool = this.zzb;
        if (bool == null) {
            throw new java.lang.IllegalStateException("allowTestKeys must be set");
        }
        if (this.zzc != null) {
            return new com.google.android.gms.common.zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        throw new java.lang.IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
