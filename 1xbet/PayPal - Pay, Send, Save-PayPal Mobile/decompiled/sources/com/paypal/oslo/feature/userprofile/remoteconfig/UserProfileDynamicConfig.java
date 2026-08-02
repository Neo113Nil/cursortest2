package com.paypal.oslo.feature.userprofile.remoteconfig;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/remoteconfig/UserProfileDynamicConfig;", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "", "scaListConfig$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getScaListConfig", "()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "scaListConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserProfileDynamicConfig extends com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec {
    public static final int $stable;
    static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] Camera2StreamConfigurationMap = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileDynamicConfig.class, "scaListConfig", "getScaListConfig()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};
    public static final com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileDynamicConfig INSTANCE;

    /* renamed from: scaListConfig$delegate, reason: from kotlin metadata */
    private static final kotlin.properties.ReadOnlyProperty scaListConfig;

    private UserProfileDynamicConfig() {
        super("user_profile", "sca_list_config");
    }

    public final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<java.lang.Object[]> getScaListConfig() {
        return (com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) scaListConfig.getValue(this, Camera2StreamConfigurationMap[0]);
    }

    static {
        com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileDynamicConfig userProfileDynamicConfig = new com.paypal.oslo.feature.userprofile.remoteconfig.UserProfileDynamicConfig();
        INSTANCE = userProfileDynamicConfig;
        scaListConfig = userProfileDynamicConfig.create(new java.lang.Object[0], "SCA");
        $stable = 8;
    }
}
