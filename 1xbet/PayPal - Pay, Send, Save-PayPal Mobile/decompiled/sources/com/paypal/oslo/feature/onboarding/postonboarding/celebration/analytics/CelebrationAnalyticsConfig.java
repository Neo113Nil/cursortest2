package com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/analytics/CelebrationAnalyticsConfig;", "", "", "screenId", "action", "feature", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "closeButtonItem", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)Lcom/paypal/oslo/feature/onboarding/postonboarding/celebration/analytics/CelebrationAnalyticsConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getScreenId", "getAction", "getFeature", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getCloseButtonItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CelebrationAnalyticsConfig {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    private final java.lang.String action;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item closeButtonItem;
    private final java.lang.String feature;
    private final java.lang.String screenId;

    public CelebrationAnalyticsConfig(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        this.screenId = str;
        this.action = str2;
        this.feature = str3;
        this.closeButtonItem = item;
    }

    public final java.lang.String getScreenId() {
        return this.screenId;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String getFeature() {
        return this.feature;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCloseButtonItem() {
        return this.closeButtonItem;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.screenId;
        java.lang.String str2 = this.action;
        java.lang.String str3 = this.feature;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = this.closeButtonItem;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CelebrationAnalyticsConfig(screenId=");
        sb.append(str);
        sb.append(", action=");
        sb.append(str2);
        sb.append(", feature=");
        sb.append(str3);
        sb.append(", closeButtonItem=");
        sb.append(item);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.screenId.hashCode() * 31) + this.action.hashCode()) * 31) + this.feature.hashCode()) * 31) + this.closeButtonItem.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig celebrationAnalyticsConfig = (com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.screenId, celebrationAnalyticsConfig.screenId) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, celebrationAnalyticsConfig.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, celebrationAnalyticsConfig.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.closeButtonItem, celebrationAnalyticsConfig.closeButtonItem);
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig copy(java.lang.String screenId, java.lang.String action, java.lang.String feature, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item closeButtonItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(screenId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closeButtonItem, "");
        return new com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig(screenId, action, feature, closeButtonItem);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getCloseButtonItem() {
        return this.closeButtonItem;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFeature() {
        return this.feature;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getScreenId() {
        return this.screenId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig copy$default(com.paypal.oslo.feature.onboarding.postonboarding.celebration.analytics.CelebrationAnalyticsConfig celebrationAnalyticsConfig, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = celebrationAnalyticsConfig.screenId;
        }
        if ((i & 2) != 0) {
            str2 = celebrationAnalyticsConfig.action;
        }
        if ((i & 4) != 0) {
            str3 = celebrationAnalyticsConfig.feature;
        }
        if ((i & 8) != 0) {
            item = celebrationAnalyticsConfig.closeButtonItem;
        }
        return celebrationAnalyticsConfig.copy(str, str2, str3, item);
    }
}
