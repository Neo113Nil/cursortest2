package com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b\b\u0010\u0013R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/model/ChecklistItem;", "", "", "text", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/core/Icon;", "icon", "", "isCompleted", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "analyticsItem", "<init>", "(IILcom/paypal/pds/core/Icon;ZLcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)V", "component1", "()I", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "component4", "()Z", "component5", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "copy", "(IILcom/paypal/pds/core/Icon;ZLcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;)Lcom/paypal/oslo/feature/onboarding/postonboarding/activation/domain/model/ChecklistItem;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getText", "getDescription", "Lcom/paypal/pds/core/Icon;", "getIcon", "Z", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/UIContext$Item;", "getAnalyticsItem"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ChecklistItem {
    public static final int $stable = com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item.$stable;
    private final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item analyticsItem;
    private final int description;
    private final com.paypal.pds.core.Icon icon;
    private final boolean isCompleted;
    private final int text;

    public ChecklistItem(int i, int i2, com.paypal.pds.core.Icon icon, boolean z, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        this.text = i;
        this.description = i2;
        this.icon = icon;
        this.isCompleted = z;
        this.analyticsItem = item;
    }

    public final int getText() {
        return this.text;
    }

    public final int getDescription() {
        return this.description;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAnalyticsItem() {
        return this.analyticsItem;
    }

    public final java.lang.String toString() {
        int i = this.text;
        int i2 = this.description;
        com.paypal.pds.core.Icon icon = this.icon;
        boolean z = this.isCompleted;
        com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item = this.analyticsItem;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChecklistItem(text=");
        sb.append(i);
        sb.append(", description=");
        sb.append(i2);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(", isCompleted=");
        sb.append(z);
        sb.append(", analyticsItem=");
        sb.append(item);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.text) * 31) + java.lang.Integer.hashCode(this.description)) * 31) + this.icon.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isCompleted)) * 31) + this.analyticsItem.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem = (com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem) other;
        return this.text == checklistItem.text && this.description == checklistItem.description && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, checklistItem.icon) && this.isCompleted == checklistItem.isCompleted && kotlin.jvm.internal.Intrinsics.areEqual(this.analyticsItem, checklistItem.analyticsItem);
    }

    public final com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem copy(int text, int description, com.paypal.pds.core.Icon icon, boolean isCompleted, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item analyticsItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsItem, "");
        return new com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem(text, description, icon, isCompleted, analyticsItem);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item getAnalyticsItem() {
        return this.analyticsItem;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final int getText() {
        return this.text;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem copy$default(com.paypal.oslo.feature.onboarding.postonboarding.activation.domain.model.ChecklistItem checklistItem, int i, int i2, com.paypal.pds.core.Icon icon, boolean z, com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Item item, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = checklistItem.text;
        }
        if ((i3 & 2) != 0) {
            i2 = checklistItem.description;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            icon = checklistItem.icon;
        }
        com.paypal.pds.core.Icon icon2 = icon;
        if ((i3 & 8) != 0) {
            z = checklistItem.isCompleted;
        }
        boolean z2 = z;
        if ((i3 & 16) != 0) {
            item = checklistItem.analyticsItem;
        }
        return checklistItem.copy(i, i4, icon2, z2, item);
    }
}
