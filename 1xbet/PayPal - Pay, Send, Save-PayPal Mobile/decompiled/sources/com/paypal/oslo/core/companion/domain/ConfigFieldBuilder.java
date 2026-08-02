package com.paypal.oslo.core.companion.domain;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\u000eJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0012\u001a\u00028\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/core/companion/domain/ConfigFieldBuilder;", "", "T", "", "id", "defaultValue", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "name", "(Ljava/lang/String;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "(Ljava/lang/Object;)V", "Lcom/paypal/oslo/core/companion/domain/ConfigField;", "build", "()Lcom/paypal/oslo/core/companion/domain/ConfigField;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/companion/domain/FieldType;", "Lcom/paypal/oslo/core/companion/domain/FieldType;", "getInputFormats", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "resolver", "Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "getResolver", "()Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;", "setResolver", "(Lcom/paypal/oslo/core/companion/domain/ConfigSectionFieldResolver;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
@com.paypal.oslo.core.companion.domain.CompanionAppDsl
/* loaded from: classes4.dex */
public final class ConfigFieldBuilder<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final T Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.companion.domain.FieldType getInputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private T getHighSpeedVideoSizes;
    private com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver resolver;

    public ConfigFieldBuilder(java.lang.String str, T t) {
        com.paypal.oslo.core.companion.domain.FieldType fieldType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = "";
        this.getHighSpeedVideoSizes = t;
        if (!(t instanceof java.lang.String)) {
            if (t instanceof java.lang.Boolean) {
                fieldType = com.paypal.oslo.core.companion.domain.FieldType.BOOLEAN;
            } else if (t instanceof java.lang.Integer) {
                fieldType = com.paypal.oslo.core.companion.domain.FieldType.INTEGER;
            } else if (t instanceof java.lang.Double) {
                fieldType = com.paypal.oslo.core.companion.domain.FieldType.DOUBLE;
            }
            this.getInputFormats = fieldType;
        }
        fieldType = com.paypal.oslo.core.companion.domain.FieldType.STRING;
        this.getInputFormats = fieldType;
    }

    public final com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver getResolver() {
        return this.resolver;
    }

    public final void setResolver(com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver configSectionFieldResolver) {
        this.resolver = configSectionFieldResolver;
    }

    public final void name(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges = value;
    }

    public final void description(java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighResolutionOutputSizeshNQ4ISI = value;
    }

    public final void value(T newValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "");
        this.getHighSpeedVideoSizes = newValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r1 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.core.companion.domain.ConfigField<T> build() {
        java.lang.Object obj;
        com.paypal.oslo.core.companion.domain.ConfigSectionFieldResolver configSectionFieldResolver = this.resolver;
        if (configSectionFieldResolver != null) {
            if (configSectionFieldResolver.canHandleField(this.getHighSpeedVideoFpsRangesFor)) {
                java.lang.Object defaultValue = configSectionFieldResolver.defaultValue(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
                java.lang.Object obj2 = defaultValue == null ? null : defaultValue;
                if (obj2 != null) {
                    obj = kotlin.jvm.internal.Intrinsics.areEqual(defaultValue.getClass(), this.Camera2StreamConfigurationMap.getClass()) ? obj2 : null;
                }
                obj = this.getHighSpeedVideoSizes;
            } else {
                obj = this.getHighSpeedVideoSizes;
            }
        }
        obj = this.getHighSpeedVideoSizes;
        return new com.paypal.oslo.core.companion.domain.ConfigField<>(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, obj, this.Camera2StreamConfigurationMap, this.getInputFormats);
    }
}
