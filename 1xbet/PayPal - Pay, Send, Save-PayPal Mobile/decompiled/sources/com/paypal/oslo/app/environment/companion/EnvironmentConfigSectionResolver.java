package com.paypal.oslo.app.environment.companion;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/app/environment/companion/EnvironmentConfigSectionResolver;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "Lcom/paypal/oslo/app/environment/EnvironmentSetter;", "environmentSetter", "<init>", "(Lcom/paypal/oslo/app/environment/EnvironmentSetter;)V", "", "fieldId", "", "canHandleField", "(Ljava/lang/String;)Z", "", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/app/environment/EnvironmentSetter;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnvironmentConfigSectionResolver implements com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.app.environment.EnvironmentSetter getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public EnvironmentConfigSectionResolver(com.paypal.oslo.app.environment.EnvironmentSetter environmentSetter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environmentSetter, "");
        this.getHighResolutionOutputSizeshNQ4ISI = environmentSetter;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean canHandleField(java.lang.String fieldId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.EnvironmentSectionConstants.ENVIRONMENT_URL_FIELD_ID);
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.EnvironmentSectionConstants.ENVIRONMENT_URL_FIELD_ID)) {
            return com.paypal.oslo.app.environment.Environment.Production.INSTANCE.getBaseUrl();
        }
        return null;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue) {
        java.lang.String obj;
        com.paypal.oslo.app.environment.Environment.Production production;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (canHandleField(fieldId) && kotlin.jvm.internal.Intrinsics.areEqual(fieldId, com.paypal.oslo.core.companion.domain.EnvironmentSectionConstants.ENVIRONMENT_URL_FIELD_ID)) {
            java.lang.String str = newValue instanceof java.lang.String ? (java.lang.String) newValue : null;
            if (str != null) {
                java.lang.String str2 = kotlin.text.StringsKt.isBlank(str) ? null : str;
                if (str2 != null && (obj = kotlin.text.StringsKt.trim(str2).toString()) != null) {
                    com.paypal.oslo.core.companion.domain.EnvironmentType determineEnvironmentType = com.paypal.oslo.core.companion.domain.EnvironmentUrlHandler.INSTANCE.determineEnvironmentType(obj);
                    if (determineEnvironmentType != null && com.paypal.oslo.app.environment.companion.EnvironmentConfigSectionResolver.WhenMappings.$EnumSwitchMapping$0[determineEnvironmentType.ordinal()] == 1) {
                        production = new com.paypal.oslo.app.environment.Environment.Stage(obj);
                    } else {
                        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.app.LoggerKt.log, "Environment type not found ".concat(java.lang.String.valueOf(obj)), null, null, 6, null);
                        production = com.paypal.oslo.app.environment.Environment.Production.INSTANCE;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.setEnvironment(production);
                    return true;
                }
            }
        }
        return false;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.core.companion.domain.EnvironmentType.values().length];
            try {
                iArr[com.paypal.oslo.core.companion.domain.EnvironmentType.STAGE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
