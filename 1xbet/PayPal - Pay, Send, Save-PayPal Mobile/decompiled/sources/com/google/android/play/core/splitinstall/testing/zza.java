package com.google.android.play.core.splitinstall.testing;

/* loaded from: classes9.dex */
final class zza extends com.google.android.play.core.splitinstall.testing.zzu {
    private java.lang.Integer zza;
    private java.util.Map zzb;

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final com.google.android.play.core.splitinstall.testing.zzu zza(int i) {
        this.zza = java.lang.Integer.valueOf(i);
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final com.google.android.play.core.splitinstall.testing.zzu zzb(java.util.Map map) {
        if (map == null) {
            throw new java.lang.NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.zzb = map;
        return this;
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final com.google.android.play.core.splitinstall.testing.zzv zzc() {
        if (this.zzb != null) {
            return new com.google.android.play.core.splitinstall.testing.zzc(this.zza, this.zzb, null);
        }
        throw new java.lang.IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
    }

    @Override // com.google.android.play.core.splitinstall.testing.zzu
    final java.util.Map zzd() {
        java.util.Map map = this.zzb;
        if (map != null) {
            return map;
        }
        throw new java.lang.IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }

    zza() {
    }
}
