package androidx.view.exceptions.publickeycredential;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/SignalCredentialSecurityException;", "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SignalCredentialSecurityException extends androidx.view.exceptions.publickeycredential.SignalCredentialStateException {
    public static final java.lang.String TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION = "androidx.credentials.SignalCredentialStateException.TYPE_SECURITY";

    public /* synthetic */ SignalCredentialSecurityException(java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : charSequence);
    }

    public SignalCredentialSecurityException(java.lang.CharSequence charSequence) {
        super(TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialSecurityException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
