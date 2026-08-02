package androidx.view.exceptions.publickeycredential;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b&\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fB\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00038G¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SignalCredentialStateException extends java.lang.Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.exceptions.publickeycredential.SignalCredentialStateException.Companion INSTANCE = new androidx.view.exceptions.publickeycredential.SignalCredentialStateException.Companion(null);
    private final java.lang.String type;

    public /* synthetic */ SignalCredentialStateException(java.lang.String str, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public final java.lang.String getType() {
        return this.type;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException$Companion;", "", "<init>", "()V", "", "type", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "createFrom", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;", "(Ljava/lang/String;)Landroidx/credentials/exceptions/publickeycredential/SignalCredentialStateException;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.view.exceptions.publickeycredential.SignalCredentialStateException createFrom(java.lang.String type, java.lang.String msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            int hashCode = type.hashCode();
            if (hashCode != 23095403) {
                if (hashCode != 1509209331) {
                    if (hashCode == 1902044575 && type.equals(androidx.view.exceptions.publickeycredential.SignalCredentialUnknownException.TYPE_SIGNAL_CREDENTIAL_STATE_UNKNOWN_EXCEPTION)) {
                        return new androidx.view.exceptions.publickeycredential.SignalCredentialUnknownException(msg);
                    }
                } else if (type.equals(androidx.view.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException.TYPE_SIGNAL_CREDENTIAL_STATE_PROVIDER_CONFIGURATION_EXCEPTION)) {
                    return new androidx.view.exceptions.publickeycredential.SignalCredentialStateProviderConfigurationException(msg);
                }
            } else if (type.equals(androidx.view.exceptions.publickeycredential.SignalCredentialSecurityException.TYPE_SIGNAL_CREDENTIAL_STATE_SECURITY_EXCEPTION)) {
                return new androidx.view.exceptions.publickeycredential.SignalCredentialSecurityException(msg);
            }
            return new androidx.view.exceptions.publickeycredential.SignalCredentialUnknownException(msg);
        }

        public final androidx.view.exceptions.publickeycredential.SignalCredentialStateException createFrom(java.lang.String msg) {
            return new androidx.view.exceptions.publickeycredential.SignalCredentialUnknownException(msg);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateException(java.lang.String str, java.lang.CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SignalCredentialStateException(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
