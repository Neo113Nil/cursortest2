package com.google.android.gms.common.api;

/* loaded from: classes3.dex */
public class ResolvableApiException extends com.google.android.gms.common.api.ApiException {
    public ResolvableApiException(com.google.android.gms.common.api.Status status) {
        super(status);
    }

    public android.app.PendingIntent getResolution() {
        return getStatus().getResolution();
    }

    public void startResolutionForResult(android.app.Activity activity, int i) throws android.content.IntentSender.SendIntentException {
        getStatus().startResolutionForResult(activity, i);
    }
}
