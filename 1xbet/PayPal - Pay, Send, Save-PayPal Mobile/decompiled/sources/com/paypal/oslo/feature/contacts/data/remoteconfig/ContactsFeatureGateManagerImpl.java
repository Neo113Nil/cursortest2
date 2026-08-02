package com.paypal.oslo.feature.contacts.data.remoteconfig;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/contacts/data/remoteconfig/ContactsFeatureGateManagerImpl;", "Lcom/paypal/oslo/feature/contacts/domain/remoteconfig/ContactsFeatureGateManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "featureGate", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;)V", "", "isSendRequestIntentInContactSearchApiCallEnabled", "()Z", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGate;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactsFeatureGateManagerImpl implements com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.FeatureGate getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ContactsFeatureGateManagerImpl(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureGate, "");
        this.getHighSpeedVideoFpsRanges = featureGate;
    }

    @Override // com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager
    public final boolean isSendRequestIntentInContactSearchApiCallEnabled() {
        return this.getHighSpeedVideoFpsRanges.checkGate((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates.INSTANCE, com.paypal.oslo.feature.contacts.data.remoteconfig.ContactsFeatureGates.getHighResolutionOutputSizeshNQ4ISI[0]));
    }
}
