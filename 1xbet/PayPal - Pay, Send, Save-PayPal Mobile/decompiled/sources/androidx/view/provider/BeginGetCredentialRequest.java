package androidx.view.provider;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u000fB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest;", "", "", "Landroidx/credentials/provider/BeginGetCredentialOption;", "beginGetCredentialOptions", "Landroidx/credentials/provider/CallingAppInfo;", "callingAppInfo", "<init>", "(Ljava/util/List;Landroidx/credentials/provider/CallingAppInfo;)V", "Ljava/util/List;", "getBeginGetCredentialOptions", "()Ljava/util/List;", "Landroidx/credentials/provider/CallingAppInfo;", "getCallingAppInfo", "()Landroidx/credentials/provider/CallingAppInfo;", "Companion", "Api34Impl", "Api21Impl"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BeginGetCredentialRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.view.provider.BeginGetCredentialRequest.Companion INSTANCE = new androidx.view.provider.BeginGetCredentialRequest.Companion(null);
    private final java.util.List<androidx.view.provider.BeginGetCredentialOption> beginGetCredentialOptions;
    private final androidx.view.provider.CallingAppInfo callingAppInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(java.util.List<? extends androidx.view.provider.BeginGetCredentialOption> list, androidx.view.provider.CallingAppInfo callingAppInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.beginGetCredentialOptions = list;
        this.callingAppInfo = callingAppInfo;
    }

    public /* synthetic */ BeginGetCredentialRequest(java.util.List list, androidx.view.provider.CallingAppInfo callingAppInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : callingAppInfo);
    }

    public final java.util.List<androidx.view.provider.BeginGetCredentialOption> getBeginGetCredentialOptions() {
        return this.beginGetCredentialOptions;
    }

    public final androidx.view.provider.CallingAppInfo getCallingAppInfo() {
        return this.callingAppInfo;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api34Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "p1", "", "getHighSpeedVideoFpsRanges", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "getHighSpeedVideoFpsRangesFor", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api34Impl {
        public static final androidx.credentials.provider.BeginGetCredentialRequest.Api34Impl INSTANCE = new androidx.credentials.provider.BeginGetCredentialRequest.Api34Impl();

        private Api34Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoFpsRanges(android.os.Bundle p0, androidx.view.provider.BeginGetCredentialRequest p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            p0.putParcelable("androidx.credentials.provider.BeginGetCredentialRequest", androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToFrameworkRequest(p1));
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialRequest getHighSpeedVideoFpsRangesFor(android.os.Bundle p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            android.service.credentials.BeginGetCredentialRequest beginGetCredentialRequest = (android.service.credentials.BeginGetCredentialRequest) p0.getParcelable("androidx.credentials.provider.BeginGetCredentialRequest", android.service.credentials.BeginGetCredentialRequest.class);
            if (beginGetCredentialRequest != null) {
                return androidx.view.provider.utils.BeginGetCredentialUtil.INSTANCE.convertToJetpackRequest$credentials_release(beginGetCredentialRequest);
            }
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Api21Impl;", "", "<init>", "()V", "Landroid/os/Bundle;", "p0", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "p1", "", "getHighSpeedVideoFpsRanges", "(Landroid/os/Bundle;Landroidx/credentials/provider/BeginGetCredentialRequest;)V", "Camera2StreamConfigurationMap", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class Api21Impl {
        public static final androidx.credentials.provider.BeginGetCredentialRequest.Api21Impl INSTANCE = new androidx.credentials.provider.BeginGetCredentialRequest.Api21Impl();

        private Api21Impl() {
        }

        @kotlin.jvm.JvmStatic
        public static final void getHighSpeedVideoFpsRanges(android.os.Bundle p0, androidx.view.provider.BeginGetCredentialRequest p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            int size = p1.getBeginGetCredentialOptions().size();
            p0.putInt("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE", size);
            for (int i = 0; i < size; i++) {
                p0.putString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_".concat(java.lang.String.valueOf(i)), p1.getBeginGetCredentialOptions().get(i).getId());
                p0.putString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_".concat(java.lang.String.valueOf(i)), p1.getBeginGetCredentialOptions().get(i).getType());
                p0.putBundle("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_".concat(java.lang.String.valueOf(i)), p1.getBeginGetCredentialOptions().get(i).getCandidateQueryData());
                androidx.view.provider.CallingAppInfo callingAppInfo = p1.getCallingAppInfo();
                if (callingAppInfo != null) {
                    androidx.view.provider.CallingAppInfo.INSTANCE.setCallingAppInfo$credentials_release(p0, callingAppInfo);
                }
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.view.provider.BeginGetCredentialRequest Camera2StreamConfigurationMap(android.os.Bundle p0) {
            java.lang.String string;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            androidx.view.provider.CallingAppInfo extractCallingAppInfo = androidx.view.provider.CallingAppInfo.INSTANCE.extractCallingAppInfo(p0);
            int i = p0.getInt("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_SIZE", -1);
            if (i < 0) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                java.lang.String string2 = p0.getString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_ID_".concat(java.lang.String.valueOf(i2)));
                if (string2 == null || (string = p0.getString("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_TYPE_".concat(java.lang.String.valueOf(i2)))) == null) {
                    return null;
                }
                android.os.Bundle bundle = p0.getBundle("androidx.credentials.provider.extra.EXTRA_BEGIN_GET_CREDENTIAL_OPTION_CANDIDATE_QUERY_DATA_".concat(java.lang.String.valueOf(i2)));
                if (bundle == null) {
                    bundle = new android.os.Bundle();
                }
                arrayList.add(androidx.view.provider.BeginGetCredentialOption.INSTANCE.createFrom$credentials_release(string2, string, bundle));
            }
            return new androidx.view.provider.BeginGetCredentialRequest(arrayList, extractCallingAppInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/credentials/provider/BeginGetCredentialRequest$Companion;", "", "<init>", "()V", "", "id", "type", "Landroid/os/Bundle;", "candidateQueryData", "Landroidx/credentials/provider/BeginGetCredentialOption;", "createFrom", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialOption;", "Landroidx/credentials/provider/BeginGetCredentialRequest;", "request", "asBundle", "(Landroidx/credentials/provider/BeginGetCredentialRequest;)Landroid/os/Bundle;", "bundle", "fromBundle", "(Landroid/os/Bundle;)Landroidx/credentials/provider/BeginGetCredentialRequest;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialOption createFrom(java.lang.String id, java.lang.String type, android.os.Bundle candidateQueryData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidateQueryData, "");
            return androidx.view.provider.BeginGetCredentialOption.INSTANCE.createFrom$credentials_release(id, type, candidateQueryData);
        }

        @kotlin.jvm.JvmStatic
        public final android.os.Bundle asBundle(androidx.view.provider.BeginGetCredentialRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            android.os.Bundle bundle = new android.os.Bundle();
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                androidx.credentials.provider.BeginGetCredentialRequest.Api34Impl.getHighSpeedVideoFpsRanges(bundle, request);
                return bundle;
            }
            androidx.credentials.provider.BeginGetCredentialRequest.Api21Impl.getHighSpeedVideoFpsRanges(bundle, request);
            return bundle;
        }

        @kotlin.jvm.JvmStatic
        public final androidx.view.provider.BeginGetCredentialRequest fromBundle(android.os.Bundle bundle) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "");
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                return androidx.credentials.provider.BeginGetCredentialRequest.Api34Impl.getHighSpeedVideoFpsRangesFor(bundle);
            }
            return androidx.credentials.provider.BeginGetCredentialRequest.Api21Impl.Camera2StreamConfigurationMap(bundle);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginGetCredentialRequest fromBundle(android.os.Bundle bundle) {
        return INSTANCE.fromBundle(bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.view.provider.BeginGetCredentialOption createFrom(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        return INSTANCE.createFrom(str, str2, bundle);
    }

    @kotlin.jvm.JvmStatic
    public static final android.os.Bundle asBundle(androidx.view.provider.BeginGetCredentialRequest beginGetCredentialRequest) {
        return INSTANCE.asBundle(beginGetCredentialRequest);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BeginGetCredentialRequest(java.util.List<? extends androidx.view.provider.BeginGetCredentialOption> list) {
        this(list, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
    }
}
