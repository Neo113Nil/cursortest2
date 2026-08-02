package com.paypal.oslo.feature.contacts.data.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0007\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/remoteconfig/ContactsFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "Camera2StreamConfigurationMap", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ContactsFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoFpsRangesFor;
    public static final com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates INSTANCE;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates.class, "sendRequestIntentEnabled", "getSendRequestIntentEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    private ContactsFeatureGates() {
        super(com.paypal.oslo.feature.onboarding.postonboarding.intent.domain.IntentFlowDataValues.P2P);
    }

    static {
        com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates contactsFeatureGates = new com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates();
        INSTANCE = contactsFeatureGates;
        getHighSpeedVideoFpsRangesFor = contactsFeatureGates.create("contact_search_send_request_intent_enabled");
    }
}
