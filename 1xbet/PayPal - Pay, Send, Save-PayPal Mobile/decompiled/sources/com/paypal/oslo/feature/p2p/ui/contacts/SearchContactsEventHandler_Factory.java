package com.paypal.oslo.feature.p2p.ui.contacts;

/* loaded from: classes13.dex */
public final class SearchContactsEventHandler_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper> getHighSpeedVideoFpsRangesFor;

    private SearchContactsEventHandler_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver> provider2) {
        return new com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler newInstance(com.paypal.oslo.feature.p2p.ui.review.mappers.ContactSearchItemToP2PContactItemMapper contactSearchItemToP2PContactItemMapper, com.paypal.oslo.feature.p2p.domain.contacts.ReceiverTypeResolver receiverTypeResolver) {
        return new com.paypal.oslo.feature.p2p.ui.contacts.SearchContactsEventHandler(contactSearchItemToP2PContactItemMapper, receiverTypeResolver);
    }
}
