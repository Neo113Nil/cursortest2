package com.google.android.gms.internal.drive;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzaf implements com.google.android.gms.drive.DriveApi {
    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.MetadataBufferResult> query(com.google.android.gms.common.api.GoogleApiClient googleApiClient, com.google.android.gms.drive.query.Query query) {
        if (query == null) {
            throw new java.lang.IllegalArgumentException("Query must be provided.");
        }
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzag(this, googleApiClient, query));
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveContentsResult> newDriveContents(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzah(this, googleApiClient, 536870912));
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.drive.DriveApi.DriveIdResult> fetchDriveId(com.google.android.gms.common.api.GoogleApiClient googleApiClient, java.lang.String str) {
        return googleApiClient.enqueue(new com.google.android.gms.internal.drive.zzai(this, googleApiClient, str));
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.DriveFolder getRootFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY);
        if (!zzawVar.zzag()) {
            throw new java.lang.IllegalStateException("Client is not yet connected");
        }
        com.google.android.gms.drive.DriveId zzae = zzawVar.zzae();
        if (zzae != null) {
            return new com.google.android.gms.internal.drive.zzbs(zzae);
        }
        return null;
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.DriveFolder getAppFolder(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        com.google.android.gms.internal.drive.zzaw zzawVar = (com.google.android.gms.internal.drive.zzaw) googleApiClient.getClient(com.google.android.gms.drive.Drive.CLIENT_KEY);
        if (!zzawVar.zzag()) {
            throw new java.lang.IllegalStateException("Client is not yet connected");
        }
        com.google.android.gms.drive.DriveId zzaf = zzawVar.zzaf();
        if (zzaf != null) {
            return new com.google.android.gms.internal.drive.zzbs(zzaf);
        }
        return null;
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestSync(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        return googleApiClient.execute(new com.google.android.gms.internal.drive.zzaj(this, googleApiClient));
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.OpenFileActivityBuilder newOpenFileActivityBuilder() {
        return new com.google.android.gms.drive.OpenFileActivityBuilder();
    }

    @Override // com.google.android.gms.drive.DriveApi
    public final com.google.android.gms.drive.CreateFileActivityBuilder newCreateFileActivityBuilder() {
        return new com.google.android.gms.drive.CreateFileActivityBuilder();
    }
}
