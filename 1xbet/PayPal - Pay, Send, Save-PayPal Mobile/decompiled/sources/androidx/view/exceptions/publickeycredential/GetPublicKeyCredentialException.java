package androidx.view.exceptions.publickeycredential;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class GetPublicKeyCredentialException extends androidx.view.exceptions.GetCredentialException {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialException.Companion INSTANCE = new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialException.Companion(null);
    private final java.lang.String type;

    public /* synthetic */ GetPublicKeyCredentialException(java.lang.String str, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.view.exceptions.GetCredentialException
    public java.lang.String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialException(java.lang.String str, java.lang.CharSequence charSequence) {
        super(str, charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        if (getType().length() <= 0) {
            throw new java.lang.IllegalArgumentException("type must not be empty".toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException$Companion;", "", "<init>", "()V", "", "type", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroidx/credentials/exceptions/GetCredentialException;", "createFrom", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.exceptions.GetCredentialException createFrom(java.lang.String type, java.lang.String msg) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            try {
                if (kotlin.text.StringsKt.startsWith$default(type, androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION, false, 2, (java.lang.Object) null)) {
                    return androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException.INSTANCE.createFrom(type, msg);
                }
                throw new androidx.view.internal.FrameworkClassParsingException();
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.exceptions.GetCredentialCustomException(type, msg);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.exceptions.GetCredentialException createFrom(java.lang.String str, java.lang.String str2) {
        return INSTANCE.createFrom(str, str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetPublicKeyCredentialException(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
