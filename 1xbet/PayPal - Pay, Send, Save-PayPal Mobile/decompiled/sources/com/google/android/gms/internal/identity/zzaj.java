package com.google.android.gms.internal.identity;

/* loaded from: classes8.dex */
public final class zzaj extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.location.ActivityRecognitionClient {
    static final com.google.android.gms.common.api.Api.ClientKey zza;
    public static final com.google.android.gms.common.api.Api zzb;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        zzb = new com.google.android.gms.common.api.Api("ActivityRecognition.API", new com.google.android.gms.internal.identity.zzag(), clientKey);
    }

    public zzaj(android.app.Activity activity) {
        super(activity, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeActivityTransitionUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzam
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzaj.zzb;
                com.google.android.gms.internal.identity.zzai zzaiVar = new com.google.android.gms.internal.identity.zzai((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzg) obj).getService()).zzk(pendingIntent, new com.google.android.gms.common.api.internal.StatusCallback(zzaiVar));
            }
        }).setMethodKey(2406).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeActivityUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzak
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzaj.zzb;
                ((com.google.android.gms.internal.identity.zzg) obj).zzp(pendingIntent);
                ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2402).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> removeSleepSegmentUpdates(final android.app.PendingIntent pendingIntent) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzan
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzaj.zzb;
                com.google.android.gms.internal.identity.zzai zzaiVar = new com.google.android.gms.internal.identity.zzai((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzg) obj).getService()).zzn(pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzaiVar));
            }
        }).setMethodKey(2411).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestActivityTransitionUpdates(final com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest, final android.app.PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzal
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzaj.zzb;
                com.google.android.gms.internal.identity.zzai zzaiVar = new com.google.android.gms.internal.identity.zzai((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.location.ActivityTransitionRequest activityTransitionRequest2 = com.google.android.gms.location.ActivityTransitionRequest.this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(activityTransitionRequest2, "activityTransitionRequest must be specified.");
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzg) obj).getService()).zzj(activityTransitionRequest2, pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzaiVar));
            }
        }).setMethodKey(2405).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestActivityUpdates(long j, final android.app.PendingIntent pendingIntent) {
        com.google.android.gms.location.zza zzaVar = new com.google.android.gms.location.zza();
        zzaVar.zza(j);
        final com.google.android.gms.location.zzb zzb2 = zzaVar.zzb();
        zzb2.zza(getContextAttributionTag());
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzap
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.common.api.Api api = com.google.android.gms.internal.identity.zzaj.zzb;
                com.google.android.gms.internal.identity.zzai zzaiVar = new com.google.android.gms.internal.identity.zzai((com.google.android.gms.tasks.TaskCompletionSource) obj2);
                com.google.android.gms.location.zzb zzbVar = com.google.android.gms.location.zzb.this;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzbVar, "ActivityRecognitionRequest can't be null.");
                android.app.PendingIntent pendingIntent2 = pendingIntent;
                com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent2, "PendingIntent must be specified.");
                com.google.android.gms.common.internal.Preconditions.checkNotNull(zzaiVar, "ResultHolder not provided.");
                ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzg) obj).getService()).zzi(zzbVar, pendingIntent2, new com.google.android.gms.common.api.internal.StatusCallback(zzaiVar));
            }
        }).setMethodKey(2401).build());
    }

    @Override // com.google.android.gms.location.ActivityRecognitionClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> requestSleepSegmentUpdates(final android.app.PendingIntent pendingIntent, final com.google.android.gms.location.SleepSegmentRequest sleepSegmentRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.location.zzao
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.identity.zzv) ((com.google.android.gms.internal.identity.zzg) obj).getService()).zzm(pendingIntent, sleepSegmentRequest, new com.google.android.gms.internal.identity.zzah(com.google.android.gms.internal.identity.zzaj.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setFeatures(com.google.android.gms.location.zzo.zzb).setMethodKey(2410).build());
    }

    public zzaj(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
