package com.paypal.oslo.feature.identity.checkoutdataprovider.ui;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\"8\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "checkoutInputDataStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "checkoutOutputDataStore", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "authCodeDataStore", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "identityTokenStorage", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "identityAnalyticsTracker", "<init>", "(Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;)V", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent;", "event", "", "processEvent", "(Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationEvent;)V", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutInputDataStore;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/CheckoutOutputDataStore;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/domain/datastore/AuthCodeDataStore;", "getOutputMinFrameDuration", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Lcom/paypal/oslo/feature/identity/analytics/domain/IdentityAnalyticsTracker;", "Lkotlinx/coroutines/channels/Channel;", "Lcom/paypal/oslo/feature/identity/checkoutdataprovider/ui/CheckoutAuthenticationUiEffect;", "Lkotlinx/coroutines/channels/Channel;", "getInputFormats", "Lkotlinx/coroutines/flow/Flow;", "uiEffect", "Lkotlinx/coroutines/flow/Flow;", "getUiEffect", "()Lkotlinx/coroutines/flow/Flow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutAuthenticationViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect> getInputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.storage.IdentityTokenStorage Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect> uiEffect;

    @javax.inject.Inject
    public CheckoutAuthenticationViewModel(com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutInputDataStore checkoutInputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.CheckoutOutputDataStore checkoutOutputDataStore, com.paypal.oslo.feature.identity.checkoutdataprovider.domain.datastore.AuthCodeDataStore authCodeDataStore, com.paypal.oslo.feature.identity.storage.IdentityTokenStorage identityTokenStorage, com.paypal.oslo.feature.identity.analytics.domain.IdentityAnalyticsTracker identityAnalyticsTracker) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutOutputDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authCodeDataStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityAnalyticsTracker, "");
        this.getHighSpeedVideoSizes = checkoutInputDataStore;
        this.getHighSpeedVideoFpsRanges = checkoutOutputDataStore;
        this.getHighResolutionOutputSizeshNQ4ISI = authCodeDataStore;
        this.Camera2StreamConfigurationMap = identityTokenStorage;
        this.getHighSpeedVideoFpsRangesFor = identityAnalyticsTracker;
        kotlinx.coroutines.channels.Channel<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect> Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(-2, null, null, 6, null);
        this.getInputFormats = Channel$default;
        this.uiEffect = kotlinx.coroutines.flow.FlowKt.receiveAsFlow(Channel$default);
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationUiEffect> getUiEffect() {
        return this.uiEffect;
    }

    public final void processEvent(com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleInitialize$1(this, (com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.Initialize) event, null), 3, null);
        } else {
            if (event instanceof com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationEvent.AuthenticationSuccess) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.view.ViewModelKt.getViewModelScope(this), null, null, new com.paypal.oslo.feature.identity.checkoutdataprovider.ui.CheckoutAuthenticationViewModel$handleAuthenticationSuccess$1(this, null), 3, null);
                return;
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }
}
