package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroid/content/Intent;", "Landroid/credentials/CreateCredentialException;", "getCreateCredentialException", "(Landroid/content/Intent;)Landroid/credentials/CreateCredentialException;", "Landroid/credentials/GetCredentialException;", "getGetCredentialException", "(Landroid/content/Intent;)Landroid/credentials/GetCredentialException;", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "getBeginGetResponse", "(Landroid/content/Intent;)Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroid/credentials/GetCredentialResponse;", "getGetCredentialResponse", "(Landroid/content/Intent;)Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/CreateCredentialResponse;", "getCreateCredentialCredentialResponse", "(Landroid/content/Intent;)Landroid/credentials/CreateCredentialResponse;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class IntentHandlerConverters {
    public static final android.credentials.CreateCredentialException getCreateCredentialException(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return (android.credentials.CreateCredentialException) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", android.credentials.CreateCredentialException.class);
        }
        return null;
    }

    public static final android.credentials.GetCredentialException getGetCredentialException(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return (android.credentials.GetCredentialException) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", android.credentials.GetCredentialException.class);
        }
        return null;
    }

    public static final androidx.view.provider.BeginGetCredentialResponse getBeginGetResponse(android.content.Intent intent) {
        android.service.credentials.BeginGetCredentialResponse beginGetCredentialResponse;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE") && (beginGetCredentialResponse = (android.service.credentials.BeginGetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", android.service.credentials.BeginGetCredentialResponse.class)) != null) {
            return androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToJetpackResponse(beginGetCredentialResponse);
        }
        return null;
    }

    public static final android.credentials.GetCredentialResponse getGetCredentialResponse(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return (android.credentials.GetCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", android.credentials.GetCredentialResponse.class);
        }
        return null;
    }

    public static final android.credentials.CreateCredentialResponse getCreateCredentialCredentialResponse(android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        if (intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return (android.credentials.CreateCredentialResponse) intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", android.credentials.CreateCredentialResponse.class);
        }
        return null;
    }
}
