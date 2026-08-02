package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzmp {
    private volatile java.lang.String zza;
    private volatile java.util.Locale zzb;
    private volatile boolean zzc;
    private com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider zzd;

    public final void zza(java.lang.String str, java.util.Locale locale, boolean z) {
        synchronized (this) {
            com.google.common.base.Preconditions.checkNotNull(str, "API Key must not be null.");
            com.google.common.base.Preconditions.checkArgument(!str.isEmpty(), "API Key must not be empty.");
            this.zza = str;
            this.zzb = locale;
            this.zzc = z;
        }
    }

    public final java.lang.String zze() {
        java.lang.String str;
        synchronized (this) {
            com.google.common.base.Preconditions.checkState(zzb(), "ApiConfig must be initialized.");
            com.google.common.base.Preconditions.checkNotNull(this.zza);
            str = this.zza;
        }
        return str;
    }

    public final java.util.Locale zzf() {
        java.util.Locale locale;
        synchronized (this) {
            com.google.common.base.Preconditions.checkState(zzb(), "ApiConfig must be initialized.");
            locale = this.zzb == null ? java.util.Locale.getDefault() : this.zzb;
        }
        return locale;
    }

    public final com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider zzh() {
        com.google.common.base.Preconditions.checkState(zzb(), "ApiConfig must be initialized.");
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zzc;
    }

    public final void zzd() {
        synchronized (this) {
            this.zza = null;
            this.zzb = null;
            this.zzc = false;
            this.zzd = null;
        }
    }

    public final void zzc(com.google.android.libraries.places.api.auth.PlacesAppCheckTokenProvider placesAppCheckTokenProvider) {
        if (this.zzd == null) {
            this.zzd = placesAppCheckTokenProvider;
        }
    }

    public final boolean zzb() {
        java.lang.String str;
        synchronized (this) {
            str = this.zza;
        }
        return str != null;
    }
}
