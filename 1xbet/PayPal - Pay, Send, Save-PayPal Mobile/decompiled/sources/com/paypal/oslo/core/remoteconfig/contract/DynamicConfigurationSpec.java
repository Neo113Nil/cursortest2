package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006JA\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n\"\n\b\u0000\u0010\u0007*\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00028\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0004¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfigurationSpec;", "", "", "domain", "configName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "T", "defaultValue", "keyName", "Lkotlin/properties/ReadOnlyProperty;", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "create", "(Ljava/lang/Object;Ljava/lang/String;)Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public class DynamicConfigurationSpec {
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    public DynamicConfigurationSpec(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.getHighSpeedVideoFpsRangesFor = str2;
    }

    public static /* synthetic */ kotlin.properties.ReadOnlyProperty create$default(com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec dynamicConfigurationSpec, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return dynamicConfigurationSpec.create(obj, str);
    }

    public final <T> kotlin.properties.ReadOnlyProperty<java.lang.Object, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T>> create(final T defaultValue, final java.lang.String keyName) {
        return new kotlin.properties.ReadOnlyProperty() { // from class: com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec$$ExternalSyntheticLambda0
            @Override // kotlin.properties.ReadOnlyProperty
            public final java.lang.Object getValue(java.lang.Object obj, kotlin.reflect.KProperty kProperty) {
                return com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.$r8$lambda$jYZ9LfZu9lotOS4YplH9gKkiukY(com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec.this, keyName, defaultValue, obj, kProperty);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec$create$1$1] */
    public static /* synthetic */ com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec$create$1$1 $r8$lambda$jYZ9LfZu9lotOS4YplH9gKkiukY(final com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec dynamicConfigurationSpec, final java.lang.String str, final java.lang.Object obj, java.lang.Object obj2, final kotlin.reflect.KProperty kProperty) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kProperty, "");
        return new com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T>(dynamicConfigurationSpec, str, kProperty, obj) { // from class: com.paypal.oslo.core.remoteconfig.contract.DynamicConfigurationSpec$create$1$1
            private final T defaultValue;
            private final java.lang.String domain;
            private final java.lang.String groupName;
            private final java.lang.String keyName;

            {
                java.lang.String str2;
                java.lang.String str3;
                java.lang.String str4;
                com.paypal.oslo.core.remoteconfig.StatsigHelper statsigHelper = com.paypal.oslo.core.remoteconfig.StatsigHelper.INSTANCE;
                str2 = dynamicConfigurationSpec.getHighResolutionOutputSizeshNQ4ISI;
                str3 = dynamicConfigurationSpec.getHighSpeedVideoFpsRangesFor;
                this.groupName = statsigHelper.definedName$remote_config_release(str2, str3);
                this.keyName = str == null ? kProperty.getName() : str;
                this.defaultValue = obj;
                str4 = dynamicConfigurationSpec.getHighResolutionOutputSizeshNQ4ISI;
                this.domain = str4;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
            public final java.lang.String getGroupName() {
                return this.groupName;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey, com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
            public final java.lang.String getKeyName() {
                return this.keyName;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey
            public final T getDefaultValue() {
                return this.defaultValue;
            }

            @Override // com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey
            public final java.lang.String getDomain() {
                return this.domain;
            }
        };
    }
}
