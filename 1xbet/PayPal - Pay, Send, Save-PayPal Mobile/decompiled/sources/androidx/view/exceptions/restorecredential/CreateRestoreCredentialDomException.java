package androidx.view.exceptions.restorecredential;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/CreateRestoreCredentialDomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "Landroidx/credentials/exceptions/domerrors/DomError;", "domError", "", "errorMessage", "<init>", "(Landroidx/credentials/exceptions/domerrors/DomError;Ljava/lang/CharSequence;)V", "Landroidx/credentials/exceptions/domerrors/DomError;", "getDomError", "()Landroidx/credentials/exceptions/domerrors/DomError;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CreateRestoreCredentialDomException extends androidx.view.exceptions.CreateCredentialException {
    public static final java.lang.String TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION = "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION";
    private final androidx.view.exceptions.domerrors.DomError domError;

    public final androidx.view.exceptions.domerrors.DomError getDomError() {
        return this.domError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CreateRestoreCredentialDomException(androidx.view.exceptions.domerrors.DomError domError, java.lang.CharSequence charSequence) {
        super(r0.toString(), charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/");
        sb.append(domError.getType());
        this.domError = domError;
    }
}
