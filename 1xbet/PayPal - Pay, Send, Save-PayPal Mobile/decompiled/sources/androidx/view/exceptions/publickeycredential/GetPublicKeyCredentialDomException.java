package androidx.view.exceptions.publickeycredential;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/domerrors/DomError;", "domError", "", "errorMessage", "<init>", "(Landroidx/credentials/exceptions/domerrors/DomError;Ljava/lang/CharSequence;)V", "Landroidx/credentials/exceptions/domerrors/DomError;", "getDomError", "()Landroidx/credentials/exceptions/domerrors/DomError;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetPublicKeyCredentialDomException extends androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialException {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException.Companion INSTANCE = new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException.Companion(null);
    public static final java.lang.String TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION";
    private final androidx.view.exceptions.domerrors.DomError domError;

    public /* synthetic */ GetPublicKeyCredentialDomException(androidx.view.exceptions.domerrors.DomError domError, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(domError, (i & 2) != 0 ? null : charSequence);
    }

    public final androidx.view.exceptions.domerrors.DomError getDomError() {
        return this.domError;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GetPublicKeyCredentialDomException(androidx.view.exceptions.domerrors.DomError domError, java.lang.CharSequence charSequence) {
        super(r0.toString(), charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domError, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/");
        sb.append(domError.getType());
        this.domError = domError;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialDomException$Companion;", "", "<init>", "()V", "", "type", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "Landroidx/credentials/exceptions/GetCredentialException;", "createFrom", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", "TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @kotlin.jvm.JvmStatic
        public final androidx.view.exceptions.GetCredentialException createFrom(java.lang.String type, java.lang.String msg) {
            java.lang.Object access$generateException;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            try {
                androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion companion = androidx.view.exceptions.publickeycredential.DomExceptionUtils.INSTANCE;
                androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException getPublicKeyCredentialDomException = new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException(new androidx.view.exceptions.domerrors.UnknownError(), null, 2, 0 == true ? 1 : 0);
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ABORT_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.AbortError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_CONSTRAINT_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.ConstraintError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_CLONE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.DataCloneError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.DataError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_ENCODING_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.EncodingError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_HIERARCHY_REQUEST_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.HierarchyRequestError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_IN_USE_ATTRIBUTE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.InUseAttributeError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_CHARACTER_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.InvalidCharacterError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_MODIFICATION_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.InvalidModificationError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_NODE_TYPE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.InvalidNodeTypeError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_INVALID_STATE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.InvalidStateError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NAMESPACE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NamespaceError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NETWORK_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NetworkError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NO_MODIFICATION_ALLOWED_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NoModificationAllowedError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_ALLOWED_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NotAllowedError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_FOUND_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NotFoundError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_READABLE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NotReadableError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_NOT_SUPPORTED_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.NotSupportedError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPERATION_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.OperationError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_OPT_OUT_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.OptOutError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_QUOTA_EXCEEDED_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.QuotaExceededError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_READ_ONLY_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.ReadOnlyError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SECURITY_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.SecurityError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_SYNTAX_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.SyntaxError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TIMEOUT_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.TimeoutError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_TRANSACTION_INACTIVE_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.TransactionInactiveError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_UNKNOWN_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.UnknownError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_VERSION_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.VersionError(), msg, getPublicKeyCredentialDomException);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_WRONG_DOCUMENT_ERROR")) {
                    access$generateException = androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion.access$generateException(companion, new androidx.view.exceptions.domerrors.WrongDocumentError(), msg, getPublicKeyCredentialDomException);
                } else {
                    throw new androidx.view.internal.FrameworkClassParsingException();
                }
                return (androidx.view.exceptions.GetCredentialException) access$generateException;
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
    public GetPublicKeyCredentialDomException(androidx.view.exceptions.domerrors.DomError domError) {
        this(domError, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domError, "");
    }
}
