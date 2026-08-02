package com.gemalto.mfs.mwsdk.dcm;

/* loaded from: classes8.dex */
public enum TokenSyncStatus {
    TOKEN_SYNC_STATUS_SUCCESS(0),
    TOKEN_SYNC_STATUS_FAIL(1);

    private int getHighSpeedVideoSizes;

    TokenSyncStatus(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }
}
