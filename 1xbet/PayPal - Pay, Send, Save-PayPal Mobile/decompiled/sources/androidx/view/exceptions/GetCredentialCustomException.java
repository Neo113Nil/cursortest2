package androidx.view.exceptions;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "", "type", "", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetCredentialCustomException extends androidx.view.exceptions.GetCredentialException {
    private final java.lang.String type;

    public /* synthetic */ GetCredentialCustomException(java.lang.String str, java.lang.CharSequence charSequence, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    @Override // androidx.view.exceptions.GetCredentialException
    public final java.lang.String getType() {
        return this.type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCredentialCustomException(java.lang.String str, java.lang.CharSequence charSequence) {
        super(str, charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
        if (getType().length() <= 0) {
            throw new java.lang.IllegalArgumentException("type must not be empty".toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialCustomException(java.lang.String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }
}
