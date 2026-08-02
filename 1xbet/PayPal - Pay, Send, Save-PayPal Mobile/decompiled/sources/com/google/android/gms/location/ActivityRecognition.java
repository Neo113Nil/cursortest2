package com.google.android.gms.location;

/* loaded from: classes8.dex */
public class ActivityRecognition {

    @java.lang.Deprecated
    public static final com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> API = com.google.android.gms.internal.identity.zzaj.zzb;

    @java.lang.Deprecated
    public static final com.google.android.gms.location.ActivityRecognitionApi ActivityRecognitionApi = new com.google.android.gms.internal.identity.zzaf();

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.app.Activity activity) {
        return new com.google.android.gms.internal.identity.zzaj(activity);
    }

    public static com.google.android.gms.location.ActivityRecognitionClient getClient(android.content.Context context) {
        return new com.google.android.gms.internal.identity.zzaj(context);
    }

    private ActivityRecognition() {
    }
}
