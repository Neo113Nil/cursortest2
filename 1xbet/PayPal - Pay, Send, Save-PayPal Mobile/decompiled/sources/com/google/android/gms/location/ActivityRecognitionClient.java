package com.google.android.gms.location;

/* loaded from: classes8.dex */
public interface ActivityRecognitionClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> removeSleepSegmentUpdates(android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long j, android.app.PendingIntent pendingIntent);

    com.google.android.gms.tasks.Task<java.lang.Void> requestSleepSegmentUpdates(android.app.PendingIntent pendingIntent, com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest);
}
