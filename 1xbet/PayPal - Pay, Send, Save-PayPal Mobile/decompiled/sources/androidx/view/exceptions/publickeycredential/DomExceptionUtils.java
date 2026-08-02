package androidx.view.exceptions.publickeycredential;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/DomExceptionUtils;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DomExceptionUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion INSTANCE = new androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion(null);
    public static final java.lang.String SEPARATOR = "/";

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\n\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/DomExceptionUtils$Companion;", "", "<init>", "()V", "T", "", "type", "prefix", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "t", "generateDomException$credentials_release", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "SEPARATOR", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ <T> T generateDomException$credentials_release(java.lang.String type, java.lang.String prefix, java.lang.String msg, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(prefix);
            sb.append(androidx.view.exceptions.domerrors.AbortError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ABORT_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.AbortError(), msg, t);
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(prefix);
            sb2.append(androidx.view.exceptions.domerrors.ConstraintError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_CONSTRAINT_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb2.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.ConstraintError(), msg, t);
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(prefix);
            sb3.append(androidx.view.exceptions.domerrors.DataCloneError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_CLONE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb3.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.DataCloneError(), msg, t);
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(prefix);
            sb4.append(androidx.view.exceptions.domerrors.DataError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DATA_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb4.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.DataError(), msg, t);
            }
            java.lang.StringBuilder sb5 = new java.lang.StringBuilder();
            sb5.append(prefix);
            sb5.append(androidx.view.exceptions.domerrors.EncodingError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_ENCODING_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb5.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.EncodingError(), msg, t);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(prefix);
            sb6.append(androidx.view.exceptions.domerrors.HierarchyRequestError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_HIERARCHY_REQUEST_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb6.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.HierarchyRequestError(), msg, t);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(prefix);
            sb7.append(androidx.view.exceptions.domerrors.InUseAttributeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_IN_USE_ATTRIBUTE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb7.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.InUseAttributeError(), msg, t);
            }
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(prefix);
            sb8.append(androidx.view.exceptions.domerrors.InvalidCharacterError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_CHARACTER_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb8.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.InvalidCharacterError(), msg, t);
            }
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(prefix);
            sb9.append(androidx.view.exceptions.domerrors.InvalidModificationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_MODIFICATION_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb9.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.InvalidModificationError(), msg, t);
            }
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(prefix);
            sb10.append(androidx.view.exceptions.domerrors.InvalidNodeTypeError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_NODE_TYPE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb10.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.InvalidNodeTypeError(), msg, t);
            }
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(prefix);
            sb11.append(androidx.view.exceptions.domerrors.InvalidStateError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_INVALID_STATE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb11.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.InvalidStateError(), msg, t);
            }
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(prefix);
            sb12.append(androidx.view.exceptions.domerrors.NamespaceError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NAMESPACE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb12.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NamespaceError(), msg, t);
            }
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
            sb13.append(prefix);
            sb13.append(androidx.view.exceptions.domerrors.NetworkError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NETWORK_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb13.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NetworkError(), msg, t);
            }
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
            sb14.append(prefix);
            sb14.append(androidx.view.exceptions.domerrors.NoModificationAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NO_MODIFICATION_ALLOWED_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb14.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NoModificationAllowedError(), msg, t);
            }
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
            sb15.append(prefix);
            sb15.append(androidx.view.exceptions.domerrors.NotAllowedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_ALLOWED_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb15.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NotAllowedError(), msg, t);
            }
            java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
            sb16.append(prefix);
            sb16.append(androidx.view.exceptions.domerrors.NotFoundError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_FOUND_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb16.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NotFoundError(), msg, t);
            }
            java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
            sb17.append(prefix);
            sb17.append(androidx.view.exceptions.domerrors.NotReadableError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_READABLE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb17.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NotReadableError(), msg, t);
            }
            java.lang.StringBuilder sb18 = new java.lang.StringBuilder();
            sb18.append(prefix);
            sb18.append(androidx.view.exceptions.domerrors.NotSupportedError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_NOT_SUPPORTED_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb18.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.NotSupportedError(), msg, t);
            }
            java.lang.StringBuilder sb19 = new java.lang.StringBuilder();
            sb19.append(prefix);
            sb19.append(androidx.view.exceptions.domerrors.OperationError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPERATION_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb19.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.OperationError(), msg, t);
            }
            java.lang.StringBuilder sb20 = new java.lang.StringBuilder();
            sb20.append(prefix);
            sb20.append(androidx.view.exceptions.domerrors.OptOutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_OPT_OUT_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb20.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.OptOutError(), msg, t);
            }
            java.lang.StringBuilder sb21 = new java.lang.StringBuilder();
            sb21.append(prefix);
            sb21.append(androidx.view.exceptions.domerrors.QuotaExceededError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_QUOTA_EXCEEDED_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb21.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.QuotaExceededError(), msg, t);
            }
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
            sb22.append(prefix);
            sb22.append(androidx.view.exceptions.domerrors.ReadOnlyError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_READ_ONLY_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb22.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.ReadOnlyError(), msg, t);
            }
            java.lang.StringBuilder sb23 = new java.lang.StringBuilder();
            sb23.append(prefix);
            sb23.append(androidx.view.exceptions.domerrors.SecurityError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SECURITY_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb23.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.SecurityError(), msg, t);
            }
            java.lang.StringBuilder sb24 = new java.lang.StringBuilder();
            sb24.append(prefix);
            sb24.append(androidx.view.exceptions.domerrors.SyntaxError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_SYNTAX_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb24.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.SyntaxError(), msg, t);
            }
            java.lang.StringBuilder sb25 = new java.lang.StringBuilder();
            sb25.append(prefix);
            sb25.append(androidx.view.exceptions.domerrors.TimeoutError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TIMEOUT_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb25.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.TimeoutError(), msg, t);
            }
            java.lang.StringBuilder sb26 = new java.lang.StringBuilder();
            sb26.append(prefix);
            sb26.append(androidx.view.exceptions.domerrors.TransactionInactiveError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_TRANSACTION_INACTIVE_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb26.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.TransactionInactiveError(), msg, t);
            }
            java.lang.StringBuilder sb27 = new java.lang.StringBuilder();
            sb27.append(prefix);
            sb27.append(androidx.view.exceptions.domerrors.UnknownError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_UNKNOWN_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb27.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.UnknownError(), msg, t);
            }
            java.lang.StringBuilder sb28 = new java.lang.StringBuilder();
            sb28.append(prefix);
            sb28.append(androidx.view.exceptions.domerrors.VersionError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_VERSION_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb28.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.VersionError(), msg, t);
            }
            java.lang.StringBuilder sb29 = new java.lang.StringBuilder();
            sb29.append(prefix);
            sb29.append(androidx.view.exceptions.domerrors.WrongDocumentError.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_WRONG_DOCUMENT_ERROR);
            if (kotlin.jvm.internal.Intrinsics.areEqual(type, sb29.toString())) {
                return (T) access$generateException(this, new androidx.view.exceptions.domerrors.WrongDocumentError(), msg, t);
            }
            throw new androidx.view.internal.FrameworkClassParsingException();
        }

        public static final /* synthetic */ java.lang.Object access$generateException(androidx.view.exceptions.publickeycredential.DomExceptionUtils.Companion companion, androidx.view.exceptions.domerrors.DomError domError, java.lang.String str, java.lang.Object obj) {
            if (obj instanceof androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException) {
                return new androidx.view.exceptions.publickeycredential.CreatePublicKeyCredentialDomException(domError, str);
            }
            if (obj instanceof androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException) {
                return new androidx.view.exceptions.publickeycredential.GetPublicKeyCredentialDomException(domError, str);
            }
            throw new androidx.view.internal.FrameworkClassParsingException();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
