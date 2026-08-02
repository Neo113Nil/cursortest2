package com.paypal.oslo.feature.p2p.di;

/* loaded from: classes13.dex */
public final class NavigationModule_ProvideP2PEntryProviderInstallerFactory implements dagger.internal.Factory<kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit>> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> getOutputStallDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> getOutputStallDurationlomOqCM;

    private NavigationModule_ProvideP2PEntryProviderInstallerFactory(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider5, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> provider6, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents> provider7, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider8, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler> provider9, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy> provider10, dagger.internal.Provider<android.content.Context> provider11, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider12, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider13) {
        this.getOutputFormats = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getOutputMinFrameDuration = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
        this.getOutputStallDuration = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getOutputStallDurationlomOqCM = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getInputFormats = provider10;
        this.getHighSpeedVideoFpsRanges = provider11;
        this.getOutputMinFrameDurationlomOqCM = provider12;
        this.getHighSpeedVideoSizesFor = provider13;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> get() {
        return provideP2PEntryProviderInstaller(this.getOutputFormats.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputStallDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getOutputStallDurationlomOqCM.get(), this.getInputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getHighSpeedVideoSizesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.di.NavigationModule_ProvideP2PEntryProviderInstallerFactory create(dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.ContactsApi> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents> provider5, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents> provider6, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents> provider7, dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents> provider8, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler> provider9, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy> provider10, dagger.internal.Provider<android.content.Context> provider11, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider12, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider13) {
        return new com.paypal.oslo.feature.p2p.di.NavigationModule_ProvideP2PEntryProviderInstallerFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12, provider13);
    }

    public static kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideP2PEntryProviderInstaller(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.contacts.api.ContactsApi contactsApi, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentTransferResultToSuccessDestinationMapper paymentTransferResultToSuccessDestinationMapper, com.paypal.oslo.feature.p2p.ui.review.mappers.P2PContactItemToUiContactMapper p2PContactItemToUiContactMapper, com.paypal.oslo.feature.moneymovement.api.amount.AmountScreenComponents amountScreenComponents, com.paypal.oslo.feature.moneymovement.api.transfer.TransferScreenComponents transferScreenComponents, com.paypal.oslo.feature.moneymovement.api.currencypicker.components.CurrencyPickerComponents currencyPickerComponents, com.paypal.oslo.feature.moneymovement.api.success.SuccessScreenComponents successScreenComponents, com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler searchContactsEventHandler, com.paypal.oslo.feature.contacts.api.searchstrategy.ContactsSearchStrategy contactsSearchStrategy, android.content.Context context, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        return (kotlin.jvm.functions.Function1) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.p2p.di.NavigationModule.INSTANCE.provideP2PEntryProviderInstaller(appNavigator, contactsApi, paymentTransferResultToSuccessDestinationMapper, p2PContactItemToUiContactMapper, amountScreenComponents, transferScreenComponents, currencyPickerComponents, successScreenComponents, searchContactsEventHandler, contactsSearchStrategy, context, userStore, p2pFeatureGateManager));
    }
}
