package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "<init>", "(Landroidx/credentials/provider/CallingAppInfo;)V", "Landroidx/credentials/provider/CallingAppInfo;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProviderClearCredentialStateRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.ProviderClearCredentialStateRequest.Companion INSTANCE = new androidx.view.provider.ProviderClearCredentialStateRequest.Companion(null);
    private final androidx.view.provider.CallingAppInfo callingAppInfo;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/credentials/provider/ProviderClearCredentialStateRequest$Companion;", "", "<init>", "()V", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "request", "Landroid/os/Bundle;", "asBundle", "(Landroidx/credentials/provider/ProviderClearCredentialStateRequest;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/ProviderClearCredentialStateRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.ProviderClearCredentialStateRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            androidx.view.provider.CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(bundle, request.getCallingAppInfo());
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderClearCredentialStateRequest fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            androidx.view.provider.CallingAppInfo extractCallingAppInfo = androidx.view.provider.CallingAppInfo.INSTANCE.extractCallingAppInfo(bundle);
            if (extractCallingAppInfo == null) {
                throw new java.lang.IllegalArgumentException("Bundle was missing CallingAppInfo.");
            }
            return new androidx.view.provider.ProviderClearCredentialStateRequest(extractCallingAppInfo);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ProviderClearCredentialStateRequest(androidx.view.provider.CallingAppInfo callingAppInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callingAppInfo, "");
        this.callingAppInfo = callingAppInfo;
    }

    public final androidx.view.provider.CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.ProviderClearCredentialStateRequest fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.ProviderClearCredentialStateRequest providerClearCredentialStateRequest) {
        return INSTANCE.asBundle(providerClearCredentialStateRequest);
    }
}
