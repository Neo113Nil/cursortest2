package androidx.view.provider.utils;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ClearCredentialUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.utils.ClearCredentialUtil.Companion INSTANCE = new androidx.view.provider.utils.ClearCredentialUtil.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/credentials/provider/utils/ClearCredentialUtil$Companion;", "", "<init>", "()V", "Landroid/service/credentials/ClearCredentialStateRequest;", "request", "Landroidx/credentials/provider/ProviderClearCredentialStateRequest;", "convertToJetpackRequest$credentials_release", "(Landroid/service/credentials/ClearCredentialStateRequest;)Landroidx/credentials/provider/ProviderClearCredentialStateRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.ProviderClearCredentialStateRequest convertToJetpackRequest$credentials_release(android.service.credentials.ClearCredentialStateRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            androidx.view.provider.CallingAppInfo.Companion companion = androidx.view.provider.CallingAppInfo.INSTANCE;
            java.lang.String packageName = request.getCallingAppInfo().getPackageName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
            android.content.pm.SigningInfo signingInfo = request.getCallingAppInfo().getSigningInfo();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(signingInfo, "");
            return new androidx.view.provider.ProviderClearCredentialStateRequest(companion.create(packageName, signingInfo, request.getCallingAppInfo().getOrigin()));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
