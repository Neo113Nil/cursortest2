package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public abstract class SplitInstallSessionState {
    public static com.google.android.play.core.splitinstall.SplitInstallSessionState create(int i, int i2, int i3, long j, long j2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (i2 != 8) {
            return new com.google.android.play.core.splitinstall.zza(i, i2, i3, j, j2, list, list2, null, null);
        }
        throw new java.lang.IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static com.google.android.play.core.splitinstall.SplitInstallSessionState zzd(android.os.Bundle bundle) {
        return new com.google.android.play.core.splitinstall.zza(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt(com.paypal.oslo.feature.verificationcapture.telemetry.VerificationCaptureTelemetry.Attributes.ERROR_CODE), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (android.app.PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public boolean hasTerminalStatus() {
        int status = status();
        return status == 0 || status == 5 || status == 6 || status == 7;
    }

    public java.util.List<java.lang.String> languages() {
        return zza() != null ? new java.util.ArrayList(zza()) : new java.util.ArrayList();
    }

    public java.util.List<java.lang.String> moduleNames() {
        return zzb() != null ? new java.util.ArrayList(zzb()) : new java.util.ArrayList();
    }

    @java.lang.Deprecated
    public abstract android.app.PendingIntent resolutionIntent();

    public abstract int sessionId();

    public abstract int status();

    public abstract long totalBytesToDownload();

    abstract java.util.List zza();

    abstract java.util.List zzb();

    abstract java.util.List zzc();
}
