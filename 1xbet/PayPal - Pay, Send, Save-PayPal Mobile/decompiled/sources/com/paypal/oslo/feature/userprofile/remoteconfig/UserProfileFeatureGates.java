package com.paypal.oslo.feature.userprofile.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001b\u0010\u0012\u001a\u00020\u00048GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/remoteconfig/UserProfileFeatureGates;", "Lcom/paypal/oslo/core/remoteconfig/contract/FeatureGateSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "nameEditWebViewEnabled$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getNameEditWebViewEnabled", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "nameEditWebViewEnabled", "emailsWebViewEnabled$delegate", "getEmailsWebViewEnabled", "emailsWebViewEnabled", "phonesWebViewEnabled$delegate", "getPhonesWebViewEnabled", "phonesWebViewEnabled", "addressesWebViewEnabled$delegate", "getAddressesWebViewEnabled", "addressesWebViewEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserProfileFeatureGates extends com.paypal.oslo.core.remoteconfig.contract.FeatureGateSpec {
    public static final int $stable;
    public static final com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates INSTANCE;

    /* renamed from: addressesWebViewEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty addressesWebViewEnabled;

    /* renamed from: emailsWebViewEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty emailsWebViewEnabled;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighSpeedVideoFpsRangesFor = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.class, "nameEditWebViewEnabled", "getNameEditWebViewEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.class, "emailsWebViewEnabled", "getEmailsWebViewEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.class, "phonesWebViewEnabled", "getPhonesWebViewEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0)), kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates.class, "addressesWebViewEnabled", "getAddressesWebViewEnabled()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", 0))};

    /* renamed from: nameEditWebViewEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty nameEditWebViewEnabled;

    /* renamed from: phonesWebViewEnabled$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty phonesWebViewEnabled;

    private UserProfileFeatureGates() {
        super("user_profile");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getNameEditWebViewEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) nameEditWebViewEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[0]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getEmailsWebViewEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) emailsWebViewEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[1]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getPhonesWebViewEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) phonesWebViewEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[2]);
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey getAddressesWebViewEnabled() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey) addressesWebViewEnabled.getValue(this, getHighSpeedVideoFpsRangesFor[3]);
    }

    static {
        com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates userProfileFeatureGates = new com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileFeatureGates();
        INSTANCE = userProfileFeatureGates;
        nameEditWebViewEnabled = userProfileFeatureGates.create("name_edit_webview_enabled");
        emailsWebViewEnabled = userProfileFeatureGates.create("emails_webview_enabled");
        phonesWebViewEnabled = userProfileFeatureGates.create("phones_webview_enabled");
        addressesWebViewEnabled = userProfileFeatureGates.create("addresses_webview_enabled");
        $stable = 8;
    }
}
