package androidx.view.exceptions;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\n\b&\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fB\u001d\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038WX\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058WX\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Ljava/lang/CharSequence;", "getErrorMessage", "()Ljava/lang/CharSequence;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ClearCredentialException extends java.lang.Exception {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.exceptions.ClearCredentialException.Companion INSTANCE = new androidx.view.exceptions.ClearCredentialException.Companion(null);
    private final java.lang.CharSequence errorMessage;
    private final java.lang.String type;

    public /* synthetic */ ClearCredentialException(java.lang.String str, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public java.lang.String getType() {
        return this.type;
    }

    public java.lang.CharSequence getErrorMessage() {
        return this.errorMessage;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialException$Companion;", "", "<init>", "()V", "Landroidx/credentials/exceptions/ClearCredentialException;", "ex", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/exceptions/ClearCredentialException;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/exceptions/ClearCredentialException;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.exceptions.ClearCredentialException ex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ex, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE", ex.getType());
            java.lang.CharSequence errorMessage = ex.getErrorMessage();
            if (errorMessage != null) {
                bundle.putCharSequence("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE", errorMessage);
            }
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.exceptions.ClearCredentialException fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            java.lang.String string = bundle.getString("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_TYPE");
            if (string == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing exception type.");
            }
            java.lang.CharSequence charSequence = bundle.getCharSequence("androidx.credentials.provider.extra.CLEAR_CREDENTIAL_EXCEPTION_MESSAGE");
            switch (string.hashCode()) {
                case -404396566:
                    if (string.equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_INTERRUPTED_EXCEPTION")) {
                        return new androidx.view.exceptions.ClearCredentialInterruptedException(charSequence);
                    }
                    break;
                case 1050953245:
                    if (string.equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                        return new androidx.view.exceptions.ClearCredentialUnsupportedException(charSequence);
                    }
                    break;
                case 1202393376:
                    if (string.equals("androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                        return new androidx.view.exceptions.ClearCredentialProviderConfigurationException(charSequence);
                    }
                    break;
                case 1859614946:
                    if (string.equals("android.credentials.ClearCredentialStateException.TYPE_UNKNOWN")) {
                        return new androidx.view.exceptions.ClearCredentialUnknownException(charSequence);
                    }
                    break;
            }
            return new androidx.view.exceptions.ClearCredentialCustomException(string, charSequence);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearCredentialException(java.lang.String str, java.lang.CharSequence charSequence) {
        super(charSequence != null ? charSequence.toString() : null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        this.errorMessage = charSequence;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.exceptions.ClearCredentialException fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.exceptions.ClearCredentialException clearCredentialException) {
        return INSTANCE.asBundle(clearCredentialException);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialException(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
