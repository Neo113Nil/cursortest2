package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class VideoOptions {
    private final boolean zza;
    private final boolean zzb;
    private final boolean zzc;

    /* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
    public static final class Builder {
        private boolean zza = true;
        private boolean zzb = false;
        private boolean zzc = false;

        public com.google.android.gms.ads.VideoOptions build() {
            return new com.google.android.gms.ads.VideoOptions(this, null);
        }

        public com.google.android.gms.ads.VideoOptions.Builder setClickToExpandRequested(boolean z) {
            this.zzc = z;
            return this;
        }

        public com.google.android.gms.ads.VideoOptions.Builder setCustomControlsRequested(boolean z) {
            this.zzb = z;
            return this;
        }

        public com.google.android.gms.ads.VideoOptions.Builder setStartMuted(boolean z) {
            this.zza = z;
            return this;
        }

        final /* synthetic */ boolean zza() {
            return this.zza;
        }

        final /* synthetic */ boolean zzb() {
            return this.zzb;
        }

        final /* synthetic */ boolean zzc() {
            return this.zzc;
        }
    }

    /* synthetic */ VideoOptions(com.google.android.gms.ads.VideoOptions.Builder builder, byte[] bArr) {
        this.zza = builder.zza();
        this.zzb = builder.zzb();
        this.zzc = builder.zzc();
    }

    public VideoOptions(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        this.zza = zzfwVar.zza;
        this.zzb = zzfwVar.zzb;
        this.zzc = zzfwVar.zzc;
    }

    public boolean getClickToExpandRequested() {
        return this.zzc;
    }

    public boolean getCustomControlsRequested() {
        return this.zzb;
    }

    public boolean getStartMuted() {
        return this.zza;
    }
}
