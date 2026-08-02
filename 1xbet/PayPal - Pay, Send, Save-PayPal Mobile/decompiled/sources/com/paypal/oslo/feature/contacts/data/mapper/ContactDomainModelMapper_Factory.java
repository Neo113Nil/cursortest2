package com.paypal.oslo.feature.contacts.data.mapper;

/* loaded from: classes12.dex */
public final class ContactDomainModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper_Factory create() {
        return com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper newInstance() {
        return new com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper_Factory();

        private InstanceHolder() {
        }
    }
}
