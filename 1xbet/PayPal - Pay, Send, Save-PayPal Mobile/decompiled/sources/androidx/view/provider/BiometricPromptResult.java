package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019"}, d2 = {"Landroidx/credentials/provider/BiometricPromptResult;", "", "Landroidx/credentials/provider/AuthenticationResult;", "authenticationResult", "Landroidx/credentials/provider/AuthenticationError;", "authenticationError", "<init>", "(Landroidx/credentials/provider/AuthenticationResult;Landroidx/credentials/provider/AuthenticationError;)V", "(Landroidx/credentials/provider/AuthenticationError;)V", "(Landroidx/credentials/provider/AuthenticationResult;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/credentials/provider/AuthenticationResult;", "getAuthenticationResult", "()Landroidx/credentials/provider/AuthenticationResult;", "Landroidx/credentials/provider/AuthenticationError;", "getAuthenticationError", "()Landroidx/credentials/provider/AuthenticationError;", "isSuccessful", "Z", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BiometricPromptResult {
    private final androidx.view.provider.AuthenticationError authenticationError;
    private final androidx.view.provider.AuthenticationResult authenticationResult;
    private final boolean isSuccessful;

    public BiometricPromptResult(androidx.view.provider.AuthenticationResult authenticationResult, androidx.view.provider.AuthenticationError authenticationError) {
        this.authenticationResult = authenticationResult;
        this.authenticationError = authenticationError;
        this.isSuccessful = authenticationResult != null;
    }

    public /* synthetic */ BiometricPromptResult(androidx.view.provider.AuthenticationResult authenticationResult, androidx.view.provider.AuthenticationError authenticationError, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : authenticationResult, (i & 2) != 0 ? null : authenticationError);
    }

    public final androidx.view.provider.AuthenticationResult getAuthenticationResult() {
        return this.authenticationResult;
    }

    public final androidx.view.provider.AuthenticationError getAuthenticationError() {
        return this.authenticationError;
    }

    /* renamed from: isSuccessful, reason: from getter */
    public final boolean getIsSuccessful() {
        return this.isSuccessful;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(androidx.view.provider.AuthenticationError authenticationError) {
        this(null, authenticationError);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationError, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BiometricPromptResult(androidx.view.provider.AuthenticationResult authenticationResult) {
        this(authenticationResult, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationResult, "");
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.view.provider.BiometricPromptResult)) {
            return false;
        }
        androidx.view.provider.BiometricPromptResult biometricPromptResult = (androidx.view.provider.BiometricPromptResult) other;
        return this.isSuccessful == biometricPromptResult.isSuccessful && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationResult, biometricPromptResult.authenticationResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationError, biometricPromptResult.authenticationError);
    }

    public final int hashCode() {
        boolean z = this.isSuccessful;
        return java.util.Objects.hash(java.lang.Boolean.valueOf(z), this.authenticationResult, this.authenticationError);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
