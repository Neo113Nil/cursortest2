package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzasb {
    private final android.os.Bundle zza;

    public zzasb(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    public final java.lang.String zza() {
        return this.zza.getString(com.adjust.sdk.Constants.INSTALL_REFERRER);
    }

    public final long zzb() {
        return this.zza.getLong("referrer_click_timestamp_seconds");
    }

    public final long zzc() {
        return this.zza.getLong("install_begin_timestamp_seconds");
    }

    public final boolean zzd() {
        return this.zza.getBoolean("google_play_instant");
    }

    public final long zze() {
        return this.zza.getLong("referrer_click_timestamp_server_seconds");
    }

    public final long zzf() {
        return this.zza.getLong("install_begin_timestamp_server_seconds");
    }

    public final java.lang.String zzg() {
        return this.zza.getString("install_version");
    }
}
