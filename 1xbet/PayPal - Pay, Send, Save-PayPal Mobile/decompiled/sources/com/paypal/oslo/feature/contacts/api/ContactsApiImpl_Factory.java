package com.paypal.oslo.feature.contacts.api;

/* loaded from: classes12.dex */
public final class ContactsApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.api.ContactsApiImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.api.ContactsApiImpl get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.contacts.api.ContactsApiImpl_Factory create() {
        return com.paypal.oslo.feature.contacts.api.ContactsApiImpl_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.contacts.api.ContactsApiImpl newInstance() {
        return new com.paypal.oslo.feature.contacts.api.ContactsApiImpl();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.contacts.api.ContactsApiImpl_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.contacts.api.ContactsApiImpl_Factory();

        private InstanceHolder() {
        }
    }
}
