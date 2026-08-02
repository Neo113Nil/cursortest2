package com.paypal.oslo.core.telemetry.analytics.context.global;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/core/telemetry/analytics/context/global/UserContextProvider;", "Lcom/paypal/oslo/core/telemetry/analytics/context/ContextProvider;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;", "event", "", "enrich", "(Lcom/paypal/oslo/core/telemetry/analytics/event/AnalyticsEvent;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/session/UserContext;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/StateFlow;", "userContext", "Lkotlinx/coroutines/flow/StateFlow;", "getUserContext$telemetry_release", "()Lkotlinx/coroutines/flow/StateFlow;", "", "getHighSpeedVideoFpsRanges", "isSessionActive", "isSessionActive$telemetry_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UserContextProvider implements com.paypal.oslo.core.telemetry.analytics.context.ContextProvider {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> getHighSpeedVideoFpsRangesFor;
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSessionActive;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> userContext;

    @javax.inject.Inject
    public UserContextProvider(com.paypal.oslo.core.userstore.UserStore userStore, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = userStore;
        this.Camera2StreamConfigurationMap = coroutineScope;
        kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(null);
        this.getHighSpeedVideoFpsRangesFor = MutableStateFlow;
        this.userContext = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.getHighSpeedVideoFpsRanges = MutableStateFlow2;
        this.isSessionActive = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider$observeUserState$1(this, null), 3, null);
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext> getUserContext$telemetry_release() {
        return this.userContext;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isSessionActive$telemetry_release() {
        return this.isSessionActive;
    }

    public static final /* synthetic */ void access$handleLoggedOut(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider userContextProvider) {
        userContextProvider.getHighSpeedVideoFpsRangesFor.setValue(null);
        userContextProvider.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.FALSE);
    }

    public static final /* synthetic */ void access$handleProfileLoaded(com.paypal.oslo.core.telemetry.analytics.context.global.UserContextProvider userContextProvider, com.paypal.oslo.core.userstore.model.User user) {
        userContextProvider.getHighSpeedVideoFpsRangesFor.setValue(new com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext(user.getId()));
        userContextProvider.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.TRUE);
    }

    @Override // com.paypal.oslo.core.telemetry.analytics.context.ContextProvider
    public final void enrich(com.paypal.oslo.core.telemetry.analytics.event.AnalyticsEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.oslo.core.telemetry.analytics.schema.context.session.UserContext value = this.getHighSpeedVideoFpsRangesFor.getValue();
        if (value != null) {
            event.addContext$telemetry_release(value);
        }
    }
}
