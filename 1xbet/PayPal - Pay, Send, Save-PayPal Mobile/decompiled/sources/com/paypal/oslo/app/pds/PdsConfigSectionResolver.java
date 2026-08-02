package com.paypal.oslo.app.pds;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/app/pds/PdsConfigSectionResolver;", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "Lcom/paypal/oslo/app/pds/PdsHighlightSetter;", "pdsHighlightSetter", "<init>", "(Lcom/paypal/oslo/app/pds/PdsHighlightSetter;)V", "", "fieldId", "", "canHandleField", "(Ljava/lang/String;)Z", "", "currentValue", "defaultValue", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "overrideValue", "(Ljava/lang/String;Ljava/lang/Object;)Z", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/app/pds/PdsHighlightSetter;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PdsConfigSectionResolver implements com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver {
    public static final java.lang.String PDS_COMPONENT_HIGHLIGHT_FIELD_ID = "pdsComponentHighlight";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.app.pds.PdsHighlightSetter Camera2StreamConfigurationMap;
    public static final int $stable = 8;

    @javax.inject.Inject
    public PdsConfigSectionResolver(com.paypal.oslo.app.pds.PdsHighlightSetter pdsHighlightSetter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdsHighlightSetter, "");
        this.Camera2StreamConfigurationMap = pdsHighlightSetter;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean canHandleField(java.lang.String fieldId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(fieldId, PDS_COMPONENT_HIGHLIGHT_FIELD_ID);
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final java.lang.Object defaultValue(java.lang.String fieldId, java.lang.Object currentValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(fieldId, PDS_COMPONENT_HIGHLIGHT_FIELD_ID)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }

    @Override // com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver
    public final boolean overrideValue(java.lang.String fieldId, java.lang.Object newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fieldId, "");
        if (!canHandleField(fieldId)) {
            return false;
        }
        java.lang.Boolean bool = newValue instanceof java.lang.Boolean ? (java.lang.Boolean) newValue : null;
        if (bool == null) {
            return false;
        }
        boolean booleanValue = bool.booleanValue();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Updating pdsComponentHighlight state", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("enabled", java.lang.Boolean.valueOf(booleanValue))), null, 4, null);
        this.Camera2StreamConfigurationMap.setPdsHighlightEnabled(booleanValue);
        return true;
    }
}
