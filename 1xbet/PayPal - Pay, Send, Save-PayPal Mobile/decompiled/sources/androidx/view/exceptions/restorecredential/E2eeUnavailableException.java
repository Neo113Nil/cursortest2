package androidx.view.exceptions.restorecredential;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/credentials/exceptions/restorecredential/E2eeUnavailableException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "", "errorMessage", "<init>", "(Ljava/lang/CharSequence;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class E2eeUnavailableException extends androidx.view.exceptions.CreateCredentialException {
    public static final java.lang.String TYPE_E2EE_UNAVAILABLE_EXCEPTION = "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E2eeUnavailableException(java.lang.CharSequence charSequence) {
        super(TYPE_E2EE_UNAVAILABLE_EXCEPTION, charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
    }
}
