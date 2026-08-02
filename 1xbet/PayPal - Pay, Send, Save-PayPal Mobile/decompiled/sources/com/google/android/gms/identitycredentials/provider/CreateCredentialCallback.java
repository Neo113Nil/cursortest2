package com.google.android.gms.identitycredentials.provider;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcom/google/android/gms/identitycredentials/provider/CreateCredentialCallback;", "", "Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;", "result", "Landroid/app/PendingIntent;", com.google.android.gms.common.internal.BaseGmsClient.KEY_PENDING_INTENT, "", "onConditionalCreateResult", "(Lcom/google/android/gms/identitycredentials/CreateCredentialResponse;Landroid/app/PendingIntent;)V", "Lcom/google/android/gms/identitycredentials/CreateCredentialException;", "error", "onError", "(Lcom/google/android/gms/identitycredentials/CreateCredentialException;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CreateCredentialCallback {
    void onConditionalCreateResult(com.google.android.gms.identitycredentials.CreateCredentialResponse result, android.app.PendingIntent pendingIntent);

    void onError(com.google.android.gms.identitycredentials.CreateCredentialException error);
}
