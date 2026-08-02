package androidx.view.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/credentials/CreateCredentialRequest;", "request", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "getFinalCreateCredentialData", "(Landroidx/credentials/CreateCredentialRequest;Landroid/content/Context;)Landroid/os/Bundle;", "", "errorType", "", "errorMsg", "Landroidx/credentials/exceptions/GetCredentialException;", "toJetpackGetException", "(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/credentials/exceptions/GetCredentialException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "toJetpackCreateException", "(Ljava/lang/String;Ljava/lang/CharSequence;)Landroidx/credentials/exceptions/CreateCredentialException;", lib.android.paypal.com.magnessdk.g.n2, "", "isValidBase64Url", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ConversionUtilsKt {
    public static final android.os.Bundle getFinalCreateCredentialData(androidx.view.CreateCredentialRequest createCredentialRequest, android.content.Context context) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.os.Bundle credentialData = createCredentialRequest.getCredentialData();
        android.os.Bundle bundle = createCredentialRequest.getDisplayInfo().toBundle();
        if (createCredentialRequest instanceof androidx.view.CreatePasswordRequest) {
            i = androidx.view.C0273R.drawable.adx_ic_password;
        } else {
            i = createCredentialRequest instanceof androidx.view.CreatePublicKeyCredentialRequest ? androidx.view.C0273R.drawable.adx_ic_passkey : androidx.view.C0273R.drawable.adx_ic_other_sign_in;
        }
        bundle.putParcelable(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_CREDENTIAL_TYPE_ICON, android.graphics.drawable.Icon.createWithResource(context, i));
        credentialData.putBundle(androidx.credentials.CreateCredentialRequest.DisplayInfo.BUNDLE_KEY_REQUEST_DISPLAY_INFO, bundle);
        return credentialData;
    }

    public static final androidx.view.exceptions.GetCredentialException toJetpackGetException(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -781118336:
                if (str.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    return new androidx.view.exceptions.GetCredentialUnknownException(charSequence);
                }
                break;
            case -408155724:
                if (str.equals(androidx.view.exceptions.GetCredentialUnsupportedException.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                    return new androidx.view.exceptions.GetCredentialUnsupportedException(charSequence);
                }
                break;
            case -45448328:
                if (str.equals(androidx.view.exceptions.GetCredentialInterruptedException.TYPE_GET_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                    return new androidx.view.exceptions.GetCredentialInterruptedException(charSequence);
                }
                break;
            case 580557411:
                if (str.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    return new androidx.view.exceptions.GetCredentialCancellationException(charSequence);
                }
                break;
            case 627896683:
                if (str.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    return new androidx.view.exceptions.NoCredentialException(charSequence);
                }
                break;
            case 1594095913:
                if (str.equals(androidx.view.exceptions.GetCredentialProviderConfigurationException.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new androidx.view.exceptions.GetCredentialProviderConfigurationException(charSequence);
                }
                break;
        }
        if (kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (java.lang.Object) null)) {
            return androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialException.INSTANCE.createFrom(str, charSequence != null ? charSequence.toString() : null);
        }
        return new androidx.view.exceptions.GetCredentialCustomException(str, charSequence);
    }

    public static /* synthetic */ androidx.view.exceptions.CreateCredentialException toJetpackCreateException$default(java.lang.String str, java.lang.CharSequence charSequence, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            charSequence = null;
        }
        return toJetpackCreateException(str, charSequence);
    }

    public static final androidx.view.exceptions.CreateCredentialException toJetpackCreateException(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        switch (str.hashCode()) {
            case -2055374133:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_USER_CANCELED")) {
                    return new androidx.view.exceptions.CreateCredentialCancellationException(charSequence);
                }
                break;
            case -1166690414:
                if (str.equals(androidx.view.exceptions.CreateCredentialUnsupportedException.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION)) {
                    return new androidx.view.exceptions.CreateCredentialUnsupportedException(charSequence);
                }
                break;
            case -580283253:
                if (str.equals(androidx.view.exceptions.CreateCredentialProviderConfigurationException.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new androidx.view.exceptions.CreateCredentialProviderConfigurationException(charSequence);
                }
                break;
            case 1316905704:
                if (str.equals("android.credentials.CreateCredentialException.TYPE_UNKNOWN")) {
                    return new androidx.view.exceptions.CreateCredentialUnknownException(charSequence);
                }
                break;
            case 2092588512:
                if (str.equals(androidx.view.exceptions.CreateCredentialInterruptedException.TYPE_CREATE_CREDENTIAL_INTERRUPTED_EXCEPTION)) {
                    return new androidx.view.exceptions.CreateCredentialInterruptedException(charSequence);
                }
                break;
            case 2131915191:
                if (str.equals(androidx.view.exceptions.CreateCredentialNoCreateOptionException.TYPE_CREATE_CREDENTIAL_NO_CREATE_OPTION)) {
                    return new androidx.view.exceptions.CreateCredentialNoCreateOptionException(charSequence);
                }
                break;
        }
        if (kotlin.text.StringsKt.startsWith$default(str, androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (java.lang.Object) null)) {
            return androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialException.INSTANCE.createFrom(str, charSequence != null ? charSequence.toString() : null);
        }
        return new androidx.view.exceptions.CreateCredentialCustomException(str, charSequence);
    }

    public static final boolean isValidBase64Url(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            android.util.Base64.decode(str, 11);
            return true;
        } catch (java.lang.IllegalArgumentException unused) {
            return false;
        }
    }
}
