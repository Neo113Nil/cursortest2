package com.paypal.oslo.app.network;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/app/network/NetworkConfigSectionResolver;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelSetter;", "loggingLevelSetter", "Lcom/paypal/oslo/app/network/ChuckerSetter;", "chuckerSetter", "<init>", "(Lcom/paypal/oslo/app/network/NetworkLoggingLevelSetter;Lcom/paypal/oslo/app/network/ChuckerSetter;)V", "", "fieldId", "", "canHandleField", "(Ljava/lang/String;)Z", "", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "Lcom/paypal/oslo/app/network/NetworkLoggingLevelSetter;", "getLoggingLevelSetter", "()Lcom/paypal/oslo/app/network/NetworkLoggingLevelSetter;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/app/network/ChuckerSetter;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkConfigSectionResolver implements com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver {
    public static final int $stable = 0;
    public static final java.lang.String NETWORK_CHUCKER_ENABLED_FIELD_ID = "network_chucker_enabled";

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.app.network.ChuckerSetter Camera2StreamConfigurationMap;
    private final com.paypal.oslo.app.network.NetworkLoggingLevelSetter loggingLevelSetter;

    @javax.inject.Inject
    public NetworkConfigSectionResolver(com.paypal.oslo.app.network.NetworkLoggingLevelSetter networkLoggingLevelSetter, com.paypal.oslo.app.network.ChuckerSetter chuckerSetter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkLoggingLevelSetter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chuckerSetter, "");
        this.loggingLevelSetter = networkLoggingLevelSetter;
        this.Camera2StreamConfigurationMap = chuckerSetter;
    }

    public final com.paypal.oslo.app.network.NetworkLoggingLevelSetter getLoggingLevelSetter() {
        return this.loggingLevelSetter;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean canHandleField(java.lang.String fieldId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.NetworkSectionConstants.NETWORK_LOGGING_LEVEL_FIELD_ID) || kotlin.jvm.internal.Intrinsics.areEqual(fieldId, NETWORK_CHUCKER_ENABLED_FIELD_ID);
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.NetworkSectionConstants.NETWORK_LOGGING_LEVEL_FIELD_ID)) {
            return com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.INSTANCE.getDEFAULT().name();
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, NETWORK_CHUCKER_ENABLED_FIELD_ID)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (!kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.NetworkSectionConstants.NETWORK_LOGGING_LEVEL_FIELD_ID)) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, NETWORK_CHUCKER_ENABLED_FIELD_ID)) {
                java.lang.Boolean bool = newValue instanceof java.lang.Boolean ? (java.lang.Boolean) newValue : null;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Updating Chucker enabled state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(booleanValue))), null, 4, null);
                    this.Camera2StreamConfigurationMap.setEnabled(booleanValue);
                    return true;
                }
            }
            return false;
        }
        java.lang.String str = newValue instanceof java.lang.String ? (java.lang.String) newValue : null;
        if (str == null) {
            return false;
        }
        com.paypal.oslo.core.companion.domain.NetworkLoggingLevel fromString = com.paypal.oslo.core.companion.domain.NetworkLoggingLevel.INSTANCE.fromString(str);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Updating network logging level", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("level", fromString.name())), null, 4, null);
        this.loggingLevelSetter.setLevel(fromString);
        return true;
    }
}
