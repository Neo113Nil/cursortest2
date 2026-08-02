package com.paypal.oslo.feature.activity.ui.ledger.model.factory;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J<\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000bJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "", "", "emptyStateTitleResId", "emptyStateDescriptionResId", "emptyStateCTAResId", "Lcom/paypal/pds/core/Icon;", "emptyStateIcon", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/pds/core/Icon;)V", "component1", "()I", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Lcom/paypal/pds/core/Icon;", "copy", "(ILjava/lang/Integer;Ljava/lang/Integer;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getEmptyStateTitleResId", "Ljava/lang/Integer;", "getEmptyStateDescriptionResId", "getEmptyStateCTAResId", "Lcom/paypal/pds/core/Icon;", "getEmptyStateIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityLedgerEmptyStateModel {
    public static final int $stable = 0;
    private final java.lang.Integer emptyStateCTAResId;
    private final java.lang.Integer emptyStateDescriptionResId;
    private final com.paypal.pds.core.Icon emptyStateIcon;
    private final int emptyStateTitleResId;

    public ActivityLedgerEmptyStateModel(int i, java.lang.Integer num, java.lang.Integer num2, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.emptyStateTitleResId = i;
        this.emptyStateDescriptionResId = num;
        this.emptyStateCTAResId = num2;
        this.emptyStateIcon = icon;
    }

    public final int getEmptyStateTitleResId() {
        return this.emptyStateTitleResId;
    }

    public final java.lang.Integer getEmptyStateDescriptionResId() {
        return this.emptyStateDescriptionResId;
    }

    public final java.lang.Integer getEmptyStateCTAResId() {
        return this.emptyStateCTAResId;
    }

    public /* synthetic */ ActivityLedgerEmptyStateModel(int i, java.lang.Integer num, java.lang.Integer num2, com.paypal.pds.core.Icon.Receipt receipt, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? com.paypal.pds.core.Icon.Receipt.INSTANCE : receipt);
    }

    public final com.paypal.pds.core.Icon getEmptyStateIcon() {
        return this.emptyStateIcon;
    }

    public final java.lang.String toString() {
        int i = this.emptyStateTitleResId;
        java.lang.Integer num = this.emptyStateDescriptionResId;
        java.lang.Integer num2 = this.emptyStateCTAResId;
        com.paypal.pds.core.Icon icon = this.emptyStateIcon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityLedgerEmptyStateModel(emptyStateTitleResId=");
        sb.append(i);
        sb.append(", emptyStateDescriptionResId=");
        sb.append(num);
        sb.append(", emptyStateCTAResId=");
        sb.append(num2);
        sb.append(", emptyStateIcon=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.emptyStateTitleResId);
        java.lang.Integer num = this.emptyStateDescriptionResId;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.emptyStateCTAResId;
        return (((((hashCode * 31) + hashCode2) * 31) + (num2 != null ? num2.hashCode() : 0)) * 31) + this.emptyStateIcon.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel = (com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel) other;
        return this.emptyStateTitleResId == activityLedgerEmptyStateModel.emptyStateTitleResId && kotlin.jvm.internal.Intrinsics.areEqual(this.emptyStateDescriptionResId, activityLedgerEmptyStateModel.emptyStateDescriptionResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.emptyStateCTAResId, activityLedgerEmptyStateModel.emptyStateCTAResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.emptyStateIcon, activityLedgerEmptyStateModel.emptyStateIcon);
    }

    public final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel copy(int emptyStateTitleResId, java.lang.Integer emptyStateDescriptionResId, java.lang.Integer emptyStateCTAResId, com.paypal.pds.core.Icon emptyStateIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emptyStateIcon, "");
        return new com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel(emptyStateTitleResId, emptyStateDescriptionResId, emptyStateCTAResId, emptyStateIcon);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.Icon getEmptyStateIcon() {
        return this.emptyStateIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getEmptyStateCTAResId() {
        return this.emptyStateCTAResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getEmptyStateDescriptionResId() {
        return this.emptyStateDescriptionResId;
    }

    /* renamed from: component1, reason: from getter */
    public final int getEmptyStateTitleResId() {
        return this.emptyStateTitleResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel copy$default(com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel, int i, java.lang.Integer num, java.lang.Integer num2, com.paypal.pds.core.Icon icon, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = activityLedgerEmptyStateModel.emptyStateTitleResId;
        }
        if ((i2 & 2) != 0) {
            num = activityLedgerEmptyStateModel.emptyStateDescriptionResId;
        }
        if ((i2 & 4) != 0) {
            num2 = activityLedgerEmptyStateModel.emptyStateCTAResId;
        }
        if ((i2 & 8) != 0) {
            icon = activityLedgerEmptyStateModel.emptyStateIcon;
        }
        return activityLedgerEmptyStateModel.copy(i, num, num2, icon);
    }
}
