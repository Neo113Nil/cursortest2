package com.paypal.oslo.app.navigation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/app/navigation/StartDestinationProvider;", "", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "identitySession", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "appInformation", "Landroidx/navigation3/runtime/NavKey;", "welcomeDestination", "", "isProductionFlavor", "<init>", "(Lcom/paypal/oslo/feature/identity/api/IdentitySession;Lcom/paypal/oslo/core/appidentity/domain/AppInformation;Landroidx/navigation3/runtime/NavKey;Z)V", "Landroid/content/Intent;", "intent", "Lcom/paypal/oslo/app/navigation/InitialBackstack;", "getInitialBackstack", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeepLinkIntent", "(Landroid/content/Intent;)Z", "", "p0", "p1", "getHighSpeedVideoSizes", "(Ljava/util/List;Landroidx/navigation3/runtime/NavKey;)Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/api/IdentitySession;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/domain/AppInformation;", "Camera2StreamConfigurationMap", "Landroidx/navigation3/runtime/NavKey;", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StartDestinationProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.navigation3.runtime.NavKey getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppInformation Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.api.IdentitySession getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public StartDestinationProvider(com.paypal.oslo.feature.identity.api.IdentitySession identitySession, com.paypal.oslo.core.appidentity.domain.AppInformation appInformation, androidx.navigation3.runtime.NavKey navKey, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySession, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navKey, "");
        this.getHighSpeedVideoFpsRanges = identitySession;
        this.Camera2StreamConfigurationMap = appInformation;
        this.getHighSpeedVideoFpsRangesFor = navKey;
        this.getHighSpeedVideoSizes = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fa, code lost:
    
        if (r1 == r3) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getInitialBackstack(android.content.Intent intent, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.navigation.InitialBackstack> continuation) {
        com.paypal.oslo.app.navigation.StartDestinationProvider$getInitialBackstack$1 startDestinationProvider$getInitialBackstack$1;
        java.lang.Object obj;
        int i;
        com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult parseUrl;
        android.content.Intent intent2;
        android.net.Uri data;
        java.lang.String obj2;
        if (continuation instanceof com.paypal.oslo.app.navigation.StartDestinationProvider$getInitialBackstack$1) {
            startDestinationProvider$getInitialBackstack$1 = (com.paypal.oslo.app.navigation.StartDestinationProvider$getInitialBackstack$1) continuation;
            if ((startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                obj = startDestinationProvider$getInitialBackstack$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor;
                int i2 = 1;
                int i3 = 2;
                com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams = null;
                java.lang.Object[] objArr = 0;
                java.lang.Object[] objArr2 = 0;
                java.lang.Object[] objArr3 = 0;
                java.lang.Object[] objArr4 = 0;
                java.lang.Object[] objArr5 = 0;
                java.lang.Object[] objArr6 = 0;
                java.lang.Object[] objArr7 = 0;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    parseUrl = (intent == null || (data = intent.getData()) == null || (obj2 = data.toString()) == null) ? null : com.paypal.oslo.app.deeplink.DeeplinkParser.INSTANCE.parseUrl(obj2);
                    if (parseUrl != null) {
                        if (this.getHighSpeedVideoSizes) {
                            return new com.paypal.oslo.app.navigation.InitialBackstack(getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) (objArr2 == true ? 1 : 0), i2, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr == true ? 1 : 0)), com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE), parseUrl.getDestination()), parseUrl.getDestination());
                        }
                        return new com.paypal.oslo.app.navigation.InitialBackstack(getHighSpeedVideoSizes(kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor), parseUrl.getDestination()), parseUrl.getDestination());
                    }
                    com.paypal.oslo.feature.identity.api.IdentitySession identitySession = this.getHighSpeedVideoFpsRanges;
                    startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(intent);
                    startDestinationProvider$getInitialBackstack$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(parseUrl);
                    startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = identitySession.hasRememberedUser(startDestinationProvider$getInitialBackstack$1);
                    if (obj != coroutine_suspended) {
                        intent2 = intent;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        return new com.paypal.oslo.app.navigation.InitialBackstack(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.identity.api.navigation.AuthenticateDestination(com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), new com.paypal.oslo.feature.identity.api.model.PostLoginIntent.ContinueNavigation(new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination(com.paypal.oslo.feature.onboarding.api.navigation.FlowIdsKt.getExistingUserAppOnboardingFlowId(), postOnboardingDeepLinkParams, i3, objArr7 == true ? 1 : 0), new com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingFlowDestination(com.paypal.oslo.feature.onboarding.api.navigation.FlowIdsKt.getPostOnboardingFlowId(), objArr6 == true ? 1 : 0, i3, objArr5 == true ? 1 : 0)), new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("Start_destination_provider", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), (com.paypal.oslo.feature.identity.api.Intent) null, (com.paypal.oslo.feature.identity.api.accountswitch.domain.model.LinkProfileOptionType) null, 24, (kotlin.jvm.internal.DefaultConstructorMarker) null)), null);
                    }
                    return new com.paypal.oslo.app.navigation.InitialBackstack(kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor), null);
                }
                parseUrl = (com.paypal.oslo.app.deeplink.DeeplinkParser.ParseResult) startDestinationProvider$getInitialBackstack$1.getHighResolutionOutputSizeshNQ4ISI;
                intent2 = (android.content.Intent) startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                if (!((java.lang.Boolean) obj).booleanValue() && this.getHighSpeedVideoSizes) {
                    return new com.paypal.oslo.app.navigation.InitialBackstack(kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) (objArr4 == true ? 1 : 0), i2, (kotlin.jvm.internal.DefaultConstructorMarker) (objArr3 == true ? 1 : 0)), com.paypal.oslo.feature.home.api.navigation.HomeDestination.INSTANCE), null);
                }
                if (this.getHighSpeedVideoSizes) {
                    com.paypal.oslo.core.appidentity.domain.AppInformation appInformation = this.Camera2StreamConfigurationMap;
                    startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(intent2);
                    startDestinationProvider$getInitialBackstack$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(parseUrl);
                    startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor = 2;
                    obj = appInformation.isFirstLaunch(startDestinationProvider$getInitialBackstack$1);
                }
                return new com.paypal.oslo.app.navigation.InitialBackstack(kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor), null);
            }
        }
        startDestinationProvider$getInitialBackstack$1 = new com.paypal.oslo.app.navigation.StartDestinationProvider$getInitialBackstack$1(this, continuation);
        obj = startDestinationProvider$getInitialBackstack$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = startDestinationProvider$getInitialBackstack$1.getHighSpeedVideoFpsRangesFor;
        int i22 = 1;
        int i32 = 2;
        com.paypal.oslo.feature.onboarding.api.navigation.PostOnboardingDeepLinkParams postOnboardingDeepLinkParams2 = null;
        java.lang.Object[] objArr8 = 0;
        java.lang.Object[] objArr22 = 0;
        java.lang.Object[] objArr32 = 0;
        java.lang.Object[] objArr42 = 0;
        java.lang.Object[] objArr52 = 0;
        java.lang.Object[] objArr62 = 0;
        java.lang.Object[] objArr72 = 0;
        if (i != 0) {
        }
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
        if (this.getHighSpeedVideoSizes) {
        }
        return new com.paypal.oslo.app.navigation.InitialBackstack(kotlin.collections.CollectionsKt.listOf(this.getHighSpeedVideoFpsRangesFor), null);
    }

    private static java.util.List<androidx.navigation3.runtime.NavKey> getHighSpeedVideoSizes(java.util.List<? extends androidx.navigation3.runtime.NavKey> p0, androidx.navigation3.runtime.NavKey p1) {
        com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider deepLinkBackstackProvider = p1 instanceof com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider ? (com.paypal.oslo.core.deeplink.DeepLinkBackstackProvider) p1 : null;
        java.util.List<androidx.navigation3.runtime.NavKey> intermediateDestinations = deepLinkBackstackProvider != null ? deepLinkBackstackProvider.getIntermediateDestinations() : null;
        if (intermediateDestinations == null) {
            intermediateDestinations = kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends androidx.navigation3.runtime.NavKey>) kotlin.collections.CollectionsKt.plus((java.util.Collection) p0, (java.lang.Iterable) intermediateDestinations), p1);
    }

    public final boolean isDeepLinkIntent(android.content.Intent intent) {
        android.net.Uri data;
        java.lang.String obj;
        return ((intent == null || (data = intent.getData()) == null || (obj = data.toString()) == null) ? null : com.paypal.oslo.app.deeplink.DeeplinkParser.INSTANCE.parseUrl(obj)) != null;
    }
}
