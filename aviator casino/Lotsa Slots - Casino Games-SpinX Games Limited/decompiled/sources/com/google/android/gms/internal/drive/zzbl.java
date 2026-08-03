package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzbl implements com.google.android.gms.common.api.ResultCallback<com.google.android.gms.common.api.Status> {
    zzbl(com.google.android.gms.internal.drive.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* synthetic */ void onResult(com.google.android.gms.common.api.Status status) {
        com.google.android.gms.common.internal.GmsLogger gmsLogger;
        com.google.android.gms.common.api.Status status2 = status;
        if (status2.isSuccess()) {
            return;
        }
        gmsLogger = com.google.android.gms.internal.drive.zzbi.zzbz;
        gmsLogger.efmt("DriveContentsImpl", "Error discarding contents, status: %s", status2);
    }
}
