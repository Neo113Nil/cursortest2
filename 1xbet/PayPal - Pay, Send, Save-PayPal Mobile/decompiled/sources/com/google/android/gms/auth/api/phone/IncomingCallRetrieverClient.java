package com.google.android.gms.auth.api.phone;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverClient;", "Lcom/google/android/gms/common/api/HasApiKey;", "Lcom/google/android/gms/common/api/Api$ApiOptions$NoOptions;", "Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverRequest;", "incomingCallRetrieverRequest", "Lcom/google/android/gms/tasks/Task;", "Landroid/app/PendingIntent;", "startIncomingCallRetriever", "(Lcom/google/android/gms/auth/api/phone/IncomingCallRetrieverRequest;)Lcom/google/android/gms/tasks/Task;", "startUserConsent", "()Lcom/google/android/gms/tasks/Task;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IncomingCallRetrieverClient extends com.google.android.gms.common.api.HasApiKey<com.google.android.gms.common.api.Api.ApiOptions.NoOptions> {
    com.google.android.gms.tasks.Task<android.app.PendingIntent> startIncomingCallRetriever(com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest incomingCallRetrieverRequest);

    com.google.android.gms.tasks.Task<android.app.PendingIntent> startUserConsent();
}
