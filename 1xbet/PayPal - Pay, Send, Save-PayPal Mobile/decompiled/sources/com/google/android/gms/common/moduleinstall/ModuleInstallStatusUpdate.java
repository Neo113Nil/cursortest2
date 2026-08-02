package com.google.android.gms.common.moduleinstall;

/* loaded from: classes8.dex */
public class ModuleInstallStatusUpdate extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate> CREATOR = new com.google.android.gms.common.moduleinstall.zae();
    private final int zaa;
    private final int zab;
    private final java.lang.Long zac;
    private final java.lang.Long zad;
    private final int zae;
    private final com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo zaf;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes3.dex */
    public @interface InstallState {
        public static final int STATE_CANCELED = 3;
        public static final int STATE_COMPLETED = 4;
        public static final int STATE_DOWNLOADING = 2;
        public static final int STATE_DOWNLOAD_PAUSED = 7;
        public static final int STATE_FAILED = 5;
        public static final int STATE_INSTALLING = 6;
        public static final int STATE_PENDING = 1;
        public static final int STATE_UNKNOWN = 0;
    }

    public ModuleInstallStatusUpdate(int i, int i2, java.lang.Long l, java.lang.Long l2, int i3) {
        this.zaa = i;
        this.zab = i2;
        this.zac = l;
        this.zad = l2;
        this.zae = i3;
        this.zaf = (l == null || l2 == null || l2.longValue() == 0) ? null : new com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo(l.longValue(), l2.longValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, getSessionId());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, getInstallState());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 3, this.zac, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongObject(parcel, 4, this.zad, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 5, getErrorCode());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public int getSessionId() {
        return this.zaa;
    }

    public com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.ProgressInfo getProgressInfo() {
        return this.zaf;
    }

    public static class ProgressInfo {
        private final long zaa;
        private final long zab;

        ProgressInfo(long j, long j2) {
            com.google.android.gms.common.internal.Preconditions.checkNotZero(j2);
            this.zaa = j;
            this.zab = j2;
        }

        public long getTotalBytesToDownload() {
            return this.zab;
        }

        public long getBytesDownloaded() {
            return this.zaa;
        }
    }

    public int getInstallState() {
        return this.zab;
    }

    public int getErrorCode() {
        return this.zae;
    }
}
