package com.zettle.sdk;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \"2\u00020\u0001:\u0001\"J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\"\b\u0002\u0010\u0012\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011H&ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H&¢\u0006\u0004\b\u0017\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u00108'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/ZettleSDK;", "", "Landroid/app/Activity;", "activity", "", "toolbarColor", "", "login", "(Landroid/app/Activity;Ljava/lang/Integer;)V", "", "enforcedUserAccount", "(Landroid/app/Activity;Ljava/lang/Integer;Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "(Ljava/lang/String;)V", "Lkotlin/Function1;", "Lkotlin/Result;", "", "Lcom/zettle/sdk/core/auth/OnResult;", "onResult", "logout", "(Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "Landroidx/lifecycle/LiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "getAuthState", "()Landroidx/lifecycle/LiveData;", "authState", "isLoggedIn", "()Z", "getVersionName", "()Ljava/lang/String;", "versionName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ZettleSDK {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.ZettleSDK.Companion INSTANCE = com.zettle.sdk.ZettleSDK.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.view.LiveData<com.zettle.sdk.core.auth.User.AuthState> getAuthState();

    java.lang.String getVersionName();

    boolean isLoggedIn();

    void login(android.app.Activity activity, java.lang.Integer toolbarColor);

    void login(android.app.Activity activity, java.lang.Integer toolbarColor, java.lang.String enforcedUserAccount);

    void login(java.lang.String token);

    void logout(kotlin.jvm.functions.Function1<? super kotlin.Result<java.lang.Boolean>, kotlin.Unit> onResult);

    void start();

    void stop();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void login$default(com.zettle.sdk.ZettleSDK zettleSDK, android.app.Activity activity, java.lang.Integer num, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            zettleSDK.login(activity, num);
        }

        public static /* synthetic */ void login$default(com.zettle.sdk.ZettleSDK zettleSDK, android.app.Activity activity, java.lang.Integer num, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            zettleSDK.login(activity, num, str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logout$default(com.zettle.sdk.ZettleSDK zettleSDK, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
            }
            if ((i & 1) != 0) {
                function1 = null;
            }
            zettleSDK.logout(function1);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00068G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u00108GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u00020\u001a*\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/ZettleSDK$Companion;", "", "<init>", "()V", "Lcom/zettle/sdk/Configuration;", "config", "Lcom/zettle/sdk/ZettleSDK;", "configure", "(Lcom/zettle/sdk/Configuration;)Lcom/zettle/sdk/ZettleSDK;", "Lcom/zettle/sdk/ZettleSDKImpl;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/ZettleSDKImpl;", "getHighResolutionOutputSizeshNQ4ISI", "getInstance", "()Lcom/zettle/sdk/ZettleSDK;", "instance", "", "isInitialized", "()Z", "isInitialized$annotations", "", "", "Lcom/zettle/sdk/features/FeatureConf;", "getFeatures$core_publicRelease", "(Lcom/zettle/sdk/ZettleSDK;)Ljava/util/Map;", "features", "Lcom/zettle/sdk/core/Register;", "getModules$core_publicRelease", "(Lcom/zettle/sdk/ZettleSDK;)Lcom/zettle/sdk/core/Register;", "modules"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.ZettleSDK.Companion getHighResolutionOutputSizeshNQ4ISI = new com.zettle.sdk.ZettleSDK.Companion();

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static com.zettle.sdk.ZettleSDKImpl getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void isInitialized$annotations() {
        }

        private Companion() {
        }

        public final boolean isInitialized() {
            return getHighResolutionOutputSizeshNQ4ISI != null;
        }

        @kotlin.jvm.JvmStatic
        public final com.zettle.sdk.ZettleSDK configure(com.zettle.sdk.Configuration config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            com.zettle.sdk.ZettleSDKImpl.INSTANCE.configure$core_publicRelease(config);
            com.zettle.sdk.ZettleSDKImpl zettleSDKImpl = com.zettle.sdk.ZettleSDKImpl.INSTANCE;
            getHighResolutionOutputSizeshNQ4ISI = zettleSDKImpl;
            if (zettleSDKImpl == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zettleSDKImpl = null;
            }
            return zettleSDKImpl;
        }

        public final com.zettle.sdk.ZettleSDK getInstance() {
            com.zettle.sdk.ZettleSDKImpl zettleSDKImpl = getHighResolutionOutputSizeshNQ4ISI;
            if (zettleSDKImpl == null) {
                return null;
            }
            if (zettleSDKImpl == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zettleSDKImpl = null;
            }
            return zettleSDKImpl;
        }

        public final com.zettle.sdk.core.Register getModules$core_publicRelease(com.zettle.sdk.ZettleSDK zettleSDK) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleSDK, "");
            return ((com.zettle.sdk.ZettleSDKImpl) zettleSDK).getStore$core_publicRelease();
        }

        public final java.util.Map<java.lang.String, com.zettle.sdk.features.FeatureConf> getFeatures$core_publicRelease(com.zettle.sdk.ZettleSDK zettleSDK) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleSDK, "");
            return ((com.zettle.sdk.ZettleSDKImpl) zettleSDK).getFeatures$core_publicRelease();
        }
    }

    static boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    @kotlin.jvm.JvmStatic
    static com.zettle.sdk.ZettleSDK configure(com.zettle.sdk.Configuration configuration) {
        return INSTANCE.configure(configuration);
    }
}
