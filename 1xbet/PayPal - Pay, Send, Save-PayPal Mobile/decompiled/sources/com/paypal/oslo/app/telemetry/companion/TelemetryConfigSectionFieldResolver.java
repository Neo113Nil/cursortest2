package com.paypal.oslo.app.telemetry.companion;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/app/telemetry/companion/TelemetryConfigSectionFieldResolver;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "adobeEnvironmentManager", "<init>", "(Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;)V", "", "fieldId", "", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "", "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "canHandleField", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/telemetry/vendors/adobe/environment/AdobeEnvironmentManager;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TelemetryConfigSectionFieldResolver implements com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public TelemetryConfigSectionFieldResolver(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentManager adobeEnvironmentManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adobeEnvironmentManager, "");
        this.getHighResolutionOutputSizeshNQ4ISI = adobeEnvironmentManager;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_ENVIRONMENT_FIELD_ID)) {
            return java.lang.Boolean.valueOf(this.getHighResolutionOutputSizeshNQ4ISI.environmentType() == com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.PROD);
        }
        return null;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_ENVIRONMENT_FIELD_ID)) {
            java.lang.Boolean bool = newValue instanceof java.lang.Boolean ? (java.lang.Boolean) newValue : null;
            if (bool != null) {
                if (bool.booleanValue()) {
                    this.getHighResolutionOutputSizeshNQ4ISI.setEnvironmentType(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.PROD);
                    return true;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.setEnvironmentType(com.paypal.oslo.core.telemetry.vendors.adobe.environment.AdobeEnvironmentType.STAGE);
                return true;
            }
        }
        return false;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean canHandleField(java.lang.String fieldId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.app.telemetry.companion.TelemetryConfigSectionConstants.ADOBE_ENVIRONMENT_FIELD_ID);
    }
}
