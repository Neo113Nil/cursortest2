package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzaf implements com.google.android.gms.location.ActivityRecognitionApi {
    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> removeActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzad(this, googleApiClient, pendingIntent));
    }

    @Override // com.google.android.gms.location.ActivityRecognitionApi
    public final com.google.android.gms.common.api.PendingResult<com.google.android.gms.common.api.Status> requestActivityUpdates(com.google.android.gms.common.api.GoogleApiClient googleApiClient, long j, android.app.PendingIntent pendingIntent) {
        return googleApiClient.execute(new com.google.android.gms.internal.identity.zzac(this, googleApiClient, j, pendingIntent));
    }
}
