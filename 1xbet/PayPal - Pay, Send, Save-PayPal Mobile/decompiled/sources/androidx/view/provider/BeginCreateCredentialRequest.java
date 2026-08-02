package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b&\u0018\u0000 \u00132\u00020\u0001:\u0003\u0014\u0015\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest;", "", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)V", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Landroid/os/Bundle;", "getCandidateQueryData", "()Landroid/os/Bundle;", "Landroidx/credentials/provider/CallingAppInfo;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Companion", "Api34Impl", "Api21Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BeginCreateCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginCreateCredentialRequest.Companion INSTANCE = new androidx.view.provider.BeginCreateCredentialRequest.Companion(null);
    private final androidx.view.provider.CallingAppInfo callingAppInfo;
    private final android.os.Bundle candidateQueryData;
    private final java.lang.String type;

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "getHighSpeedVideoSizes", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.BeginCreateCredentialRequest.Api34Impl INSTANCE = new androidx.credentials.provider.BeginCreateCredentialRequest.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle p0, androidx.view.provider.BeginCreateCredentialRequest p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            p0.putParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToFrameworkRequest(p1));
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginCreateCredentialRequest getHighSpeedVideoSizes(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.service.credentials.BeginCreateCredentialRequest beginCreateCredentialRequest = (android.service.credentials.BeginCreateCredentialRequest) p0.getParcelable("androidx.credentials.provider.BeginCreateCredentialRequest", android.service.credentials.BeginCreateCredentialRequest.class);
            if (beginCreateCredentialRequest != null) {
                return androidx.view.provider.utils.BeginCreateCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(beginCreateCredentialRequest);
            }
            return null;
        }
    }

    public BeginCreateCredentialRequest(java.lang.String str, android.os.Bundle bundle, androidx.view.provider.CallingAppInfo callingAppInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
        this.type = str;
        this.candidateQueryData = bundle;
        this.callingAppInfo = callingAppInfo;
    }

    public final androidx.view.provider.CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    public final android.os.Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Api21Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginCreateCredentialRequest;)V", "getHighSpeedVideoFpsRanges", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api21Impl {
        public static final androidx.credentials.provider.BeginCreateCredentialRequest.Api21Impl INSTANCE = new androidx.credentials.provider.BeginCreateCredentialRequest.Api21Impl();

        private Api21Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle p0, androidx.view.provider.BeginCreateCredentialRequest p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            p0.putString("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE", p1.getType());
            p0.putBundle("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA", p1.getCandidateQueryData());
            androidx.view.provider.CallingAppInfo callingAppInfo = p1.getCallingAppInfo();
            if (callingAppInfo != null) {
                androidx.view.provider.CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(p0, callingAppInfo);
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginCreateCredentialRequest getHighSpeedVideoFpsRanges(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.lang.String string = p0.getString("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_TYPE");
            if (string == null) {
                return null;
            }
            android.os.Bundle bundle = p0.getBundle("androidx.credentials.provider.extra.BEGIN_CREATE_CREDENTIAL_REQUEST_CANDIDATE_QUERY_DATA");
            if (bundle == null) {
                bundle = new android.os.Bundle();
            }
            return androidx.view.provider.BeginCreateCredentialRequest.INSTANCE.createFrom(string, bundle, androidx.view.provider.CallingAppInfo.INSTANCE.extractCallingAppInfo(p0));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/BeginCreateCredentialRequest$Companion;", "", "<init>", "()V", "", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "Landroidx/credentials/provider/BeginCreateCredentialRequest;", "createFrom", "(Ljava/lang/String;Landroid/os/Bundle;Landroidx/credentials/provider/CallingAppInfo;)Landroidx/credentials/provider/BeginCreateCredentialRequest;", "request", "asBundle", "(Landroidx/credentials/provider/BeginCreateCredentialRequest;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginCreateCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreateCredentialRequest createFrom(java.lang.String type, android.os.Bundle candidateQueryData, androidx.view.provider.CallingAppInfo callingAppInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            try {
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PasswordCredential.TYPE_PASSWORD_CREDENTIAL)) {
                    return androidx.view.provider.BeginCreatePasswordCredentialRequest.INSTANCE.createFrom$credentials_release(candidateQueryData, callingAppInfo);
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(type, androidx.view.PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL)) {
                    return androidx.view.provider.BeginCreatePublicKeyCredentialRequest.INSTANCE.createFrom$credentials_release(candidateQueryData, callingAppInfo);
                }
                return new androidx.view.provider.BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            } catch (androidx.view.internal.FrameworkClassParsingException unused) {
                return new androidx.view.provider.BeginCreateCustomCredentialRequest(type, candidateQueryData, callingAppInfo);
            }
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.BeginCreateCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.BeginCreateCredentialRequest.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(bundle, request);
                return bundle;
            }
            androidx.credentials.provider.BeginCreateCredentialRequest.Api21Impl.getHighResolutionOutputSizeshNQ4ISI(bundle, request);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginCreateCredentialRequest fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.BeginCreateCredentialRequest.Api34Impl.getHighSpeedVideoSizes(bundle);
            }
            return androidx.credentials.provider.BeginCreateCredentialRequest.Api21Impl.getHighSpeedVideoFpsRanges(bundle);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginCreateCredentialRequest fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginCreateCredentialRequest createFrom(java.lang.String str, android.os.Bundle bundle, androidx.view.provider.CallingAppInfo callingAppInfo) {
        return INSTANCE.createFrom(str, bundle, callingAppInfo);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.BeginCreateCredentialRequest beginCreateCredentialRequest) {
        return INSTANCE.asBundle(beginCreateCredentialRequest);
    }
}
