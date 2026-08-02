package com.paypal.oslo.feature.onboarding.postonboarding.activation.domain;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/ActivationTaskConfig;", "", "", "flowDataKey", "", "titleRes", "descriptionRes", "Lcom/paypal/pds/core/Icon;", "icon", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "analyticsItem", "<init>", "(Ljava/lang/String;IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/paypal/pds/core/Icon;", "component5", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "copy", "(Ljava/lang/String;IILcom/paypal/pds/core/Icon;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/ActivationTaskConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getFlowDataKey", com.visa.cbp.getEncExpo.warmup, "getTitleRes", "getDescriptionRes", "Lcom/paypal/pds/core/Icon;", "getIcon", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getAnalyticsItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ActivationTaskConfig {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item analyticsItem;
    private final int descriptionRes;
    private final java.lang.String flowDataKey;
    private final com.paypal.pds.core.Icon icon;
    private final int titleRes;

    public ActivationTaskConfig(java.lang.String str, int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        this.flowDataKey = str;
        this.titleRes = i;
        this.descriptionRes = i2;
        this.icon = icon;
        this.analyticsItem = item;
    }

    public final java.lang.String getFlowDataKey() {
        return this.flowDataKey;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAnalyticsItem() {
        return this.analyticsItem;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.flowDataKey;
        int i = this.titleRes;
        int i2 = this.descriptionRes;
        com.paypal.pds.core.Icon icon = this.icon;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = this.analyticsItem;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivationTaskConfig(flowDataKey=");
        sb.append(str);
        sb.append(", titleRes=");
        sb.append(i);
        sb.append(", descriptionRes=");
        sb.append(i2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", analyticsItem=");
        sb.append(item);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.flowDataKey.hashCode() * 31) + java.lang.Integer.hashCode(this.titleRes)) * 31) + java.lang.Integer.hashCode(this.descriptionRes)) * 31) + this.icon.hashCode()) * 31) + this.analyticsItem.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig activationTaskConfig = (com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.flowDataKey, activationTaskConfig.flowDataKey) && this.titleRes == activationTaskConfig.titleRes && this.descriptionRes == activationTaskConfig.descriptionRes && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, activationTaskConfig.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsItem, activationTaskConfig.analyticsItem);
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig copy(java.lang.String flowDataKey, int titleRes, int descriptionRes, com.paypal.pds.core.Icon icon, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item analyticsItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowDataKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsItem, "");
        return new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig(flowDataKey, titleRes, descriptionRes, icon, analyticsItem);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAnalyticsItem() {
        return this.analyticsItem;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFlowDataKey() {
        return this.flowDataKey;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig copy$default(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.ActivationTaskConfig activationTaskConfig, java.lang.String str, int i, int i2, com.paypal.pds.core.Icon icon, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = activationTaskConfig.flowDataKey;
        }
        if ((i3 & 2) != 0) {
            i = activationTaskConfig.titleRes;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = activationTaskConfig.descriptionRes;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            icon = activationTaskConfig.icon;
        }
        com.paypal.pds.core.Icon icon2 = icon;
        if ((i3 & 16) != 0) {
            item = activationTaskConfig.analyticsItem;
        }
        return activationTaskConfig.copy(str, i4, i5, icon2, item);
    }
}
