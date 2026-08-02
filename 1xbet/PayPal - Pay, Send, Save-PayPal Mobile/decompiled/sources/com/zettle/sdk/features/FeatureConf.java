package com.zettle.sdk.features;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ}\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001e\u001a\u00020\u001c2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020&2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020&H&¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020&H&¢\u0006\u0004\b7\u00106R\u001a\u0010<\u001a\u0002088'X¦\u0004¢\u0006\f\u0012\u0004\b;\u00106\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/features/FeatureConf;", "", "", "Lcom/zettle/sdk/headless/HeadlessPlugin;", "getProvidedHeadlessPlugins", "()Ljava/util/List;", "Lcom/zettle/sdk/features/Action;", "action", "Lcom/zettle/sdk/ui/ZettleResult;", "headless", "(Lcom/zettle/sdk/features/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/ui/ZettleApiResult;", "headlessApi", "(Lcom/zettle/sdk/features/Action;)Lcom/zettle/sdk/ui/ZettleApiResult;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "serviceProvider", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "merchantConfig", "Lcom/zettle/sdk/core/auth/AuthStateProvider;", "authStateProvider", "Lcom/zettle/sdk/core/os/LocationInfoController;", "locationInfo", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "", "isDebug", "analyticsWhileRoaming", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "config", "Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;", "globalContext", "isUatMode", "Lcom/zettle/sdk/core/auth/Environment;", "environment", "", "internalInit", "(Landroid/content/Context;Lcom/zettle/sdk/core/auth/ServiceProvider;Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;Lcom/zettle/sdk/core/auth/AuthStateProvider;Lcom/zettle/sdk/core/os/LocationInfoController;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;ZZLcom/zettle/sdk/commons/util/ExternalConfig;Lcom/zettle/sdk/core/context/ZettleGlobalContext$Initializer;ZLcom/zettle/sdk/core/auth/Environment;)V", "isActionValid", "(Lcom/zettle/sdk/features/Action;)Z", "Lcom/zettle/sdk/core/permission/Prerequisite;", "requirements", "(Lcom/zettle/sdk/features/Action;)Ljava/util/List;", "Landroidx/fragment/app/Fragment;", "screen", "(Lcom/zettle/sdk/features/Action;)Landroidx/fragment/app/Fragment;", "Lcom/zettle/sdk/core/Register;", "register", "setup", "(Lcom/zettle/sdk/core/Register;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "", "getID", "()Ljava/lang/String;", "getID$annotations", "ID"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FeatureConf {
    java.lang.String getID();

    java.util.List<com.zettle.sdk.headless.HeadlessPlugin> getProvidedHeadlessPlugins();

    java.lang.Object headless(com.zettle.sdk.features.Action action, kotlin.coroutines.Continuation<? super com.zettle.sdk.ui.ZettleResult> continuation);

    com.zettle.sdk.ui.ZettleApiResult headlessApi(com.zettle.sdk.features.Action action);

    void internalInit(android.content.Context context, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.core.auth.AuthStateProvider authStateProvider, com.zettle.sdk.core.os.LocationInfoController locationInfo, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo, boolean isDebug, boolean analyticsWhileRoaming, com.zettle.sdk.commons.util.ExternalConfig config, com.zettle.sdk.core.context.ZettleGlobalContext.Initializer globalContext, boolean isUatMode, com.zettle.sdk.core.auth.Environment environment);

    boolean isActionValid(com.zettle.sdk.features.Action action);

    java.util.List<com.zettle.sdk.core.permission.Prerequisite> requirements(com.zettle.sdk.features.Action action);

    androidx.fragment.app.Fragment screen(com.zettle.sdk.features.Action action);

    void setup(com.zettle.sdk.core.Register register);

    void start();

    void stop();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getID$annotations() {
        }

        public static /* synthetic */ void internalInit$default(com.zettle.sdk.features.FeatureConf featureConf, android.content.Context context, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, com.zettle.sdk.core.auth.merchant.MerchantConfig merchantConfig, com.zettle.sdk.core.auth.AuthStateProvider authStateProvider, com.zettle.sdk.core.os.LocationInfoController locationInfoController, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo, boolean z, boolean z2, com.zettle.sdk.commons.util.ExternalConfig externalConfig, com.zettle.sdk.core.context.ZettleGlobalContext.Initializer initializer, boolean z3, com.zettle.sdk.core.auth.Environment environment, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: internalInit");
            }
            featureConf.internalInit(context, serviceProvider, merchantConfig, authStateProvider, locationInfoController, analytics, appInfo, z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : externalConfig, initializer, z3, environment);
        }

        public static java.lang.Object headless(com.zettle.sdk.features.FeatureConf featureConf, com.zettle.sdk.features.Action action, kotlin.coroutines.Continuation<? super com.zettle.sdk.ui.ZettleResult> continuation) {
            return new com.zettle.sdk.core.error.ZettleSDKError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented(action));
        }

        public static com.zettle.sdk.ui.ZettleApiResult headlessApi(com.zettle.sdk.features.FeatureConf featureConf, com.zettle.sdk.features.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return new com.zettle.sdk.core.error.ZettleApiError(new com.zettle.sdk.core.error.ZettleSDKFailureReason.HeadlessNotImplemented(action));
        }

        public static java.util.List<com.zettle.sdk.headless.HeadlessPlugin> getProvidedHeadlessPlugins(com.zettle.sdk.features.FeatureConf featureConf) {
            return kotlin.collections.CollectionsKt.emptyList();
        }

        public static void setup(com.zettle.sdk.features.FeatureConf featureConf, com.zettle.sdk.core.Register register) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(register, "");
        }

        public static boolean isActionValid(com.zettle.sdk.features.FeatureConf featureConf, com.zettle.sdk.features.Action action) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
            return true;
        }
    }
}
