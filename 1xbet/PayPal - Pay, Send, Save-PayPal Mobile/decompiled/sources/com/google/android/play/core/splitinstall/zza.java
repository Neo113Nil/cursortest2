package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
final class zza extends com.google.android.play.core.splitinstall.SplitInstallSessionState {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;
    private final long zze;
    private final java.util.List zzf;
    private final java.util.List zzg;
    private final android.app.PendingIntent zzh;
    private final java.util.List zzi;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.play.core.splitinstall.SplitInstallSessionState)) {
            return false;
        }
        com.google.android.play.core.splitinstall.SplitInstallSessionState splitInstallSessionState = (com.google.android.play.core.splitinstall.SplitInstallSessionState) obj;
        if (this.zza != splitInstallSessionState.sessionId() || this.zzb != splitInstallSessionState.status() || this.zzc != splitInstallSessionState.errorCode() || this.zzd != splitInstallSessionState.bytesDownloaded() || this.zze != splitInstallSessionState.totalBytesToDownload()) {
            return false;
        }
        java.util.List list = this.zzf;
        if (list == null) {
            if (splitInstallSessionState.zzb() != null) {
                return false;
            }
        } else if (!list.equals(splitInstallSessionState.zzb())) {
            return false;
        }
        java.util.List list2 = this.zzg;
        if (list2 == null) {
            if (splitInstallSessionState.zza() != null) {
                return false;
            }
        } else if (!list2.equals(splitInstallSessionState.zza())) {
            return false;
        }
        android.app.PendingIntent pendingIntent = this.zzh;
        if (pendingIntent == null) {
            if (splitInstallSessionState.resolutionIntent() != null) {
                return false;
            }
        } else if (!pendingIntent.equals(splitInstallSessionState.resolutionIntent())) {
            return false;
        }
        java.util.List list3 = this.zzi;
        if (list3 == null) {
            if (splitInstallSessionState.zzc() != null) {
                return false;
            }
        } else if (!list3.equals(splitInstallSessionState.zzc())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        long j = this.zzd;
        long j2 = this.zze;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzf);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzg);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.zzh);
        java.lang.String valueOf4 = java.lang.String.valueOf(this.zzi);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SplitInstallSessionState{sessionId=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", moduleNamesNullable=");
        sb.append(valueOf);
        sb.append(", languagesNullable=");
        sb.append(valueOf2);
        sb.append(", resolutionIntent=");
        sb.append(valueOf3);
        sb.append(", splitFileIntents=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        long j = this.zzd;
        long j2 = this.zze;
        java.util.List list = this.zzf;
        int hashCode = list == null ? 0 : list.hashCode();
        int i4 = (int) (j ^ (j >>> 32));
        int i5 = (int) ((j2 >>> 32) ^ j2);
        java.util.List list2 = this.zzg;
        int hashCode2 = list2 == null ? 0 : list2.hashCode();
        android.app.PendingIntent pendingIntent = this.zzh;
        int hashCode3 = pendingIntent == null ? 0 : pendingIntent.hashCode();
        java.util.List list3 = this.zzi;
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003) ^ i5) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (list3 != null ? list3.hashCode() : 0);
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List zzc() {
        return this.zzi;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List zzb() {
        return this.zzf;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    final java.util.List zza() {
        return this.zzg;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long totalBytesToDownload() {
        return this.zze;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int status() {
        return this.zzb;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int sessionId() {
        return this.zza;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    @java.lang.Deprecated
    public final android.app.PendingIntent resolutionIntent() {
        return this.zzh;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final int errorCode() {
        return this.zzc;
    }

    @Override // com.google.android.play.core.splitinstall.SplitInstallSessionState
    public final long bytesDownloaded() {
        return this.zzd;
    }

    zza(int i, int i2, int i3, long j, long j2, java.util.List list, java.util.List list2, android.app.PendingIntent pendingIntent, java.util.List list3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j;
        this.zze = j2;
        this.zzf = list;
        this.zzg = list2;
        this.zzh = pendingIntent;
        this.zzi = list3;
    }
}
