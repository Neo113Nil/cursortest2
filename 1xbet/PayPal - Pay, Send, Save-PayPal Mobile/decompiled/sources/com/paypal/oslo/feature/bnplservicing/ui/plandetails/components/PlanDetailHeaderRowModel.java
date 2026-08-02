package com.paypal.oslo.feature.bnplservicing.ui.plandetails.components;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel;", "", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "title", "", "amount", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;", "type", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;)Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getTitle", "Ljava/lang/String;", "getAmount", "Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;", "getType", "RowType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanDetailHeaderRowModel {
    public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
    private final java.lang.String amount;
    private final com.paypal.oslo.core.commonui.utils.RefText title;
    private final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType type;

    public PlanDetailHeaderRowModel(com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType rowType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rowType, "");
        this.title = refText;
        this.amount = str;
        this.type = rowType;
    }

    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public final java.lang.String getAmount() {
        return this.amount;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType getType() {
        return this.type;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/plandetails/components/PlanDetailHeaderRowModel$RowType;", "", "<init>", "(Ljava/lang/String;I)V", "INFO", "WARNING"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RowType {
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType INFO;
        public static final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType WARNING;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType[] getHighSpeedVideoFpsRangesFor;

        private RowType(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType rowType = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType("INFO", 0);
            INFO = rowType;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType rowType2 = new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType("WARNING", 1);
            WARNING = rowType2;
            com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType[] rowTypeArr = {rowType, rowType2};
            getHighSpeedVideoFpsRangesFor = rowTypeArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(rowTypeArr);
        }

        public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType[] values() {
            return (com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType) java.lang.Enum.valueOf(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.commonui.utils.RefText refText = this.title;
        java.lang.String str = this.amount;
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType rowType = this.type;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanDetailHeaderRowModel(title=");
        sb.append(refText);
        sb.append(", amount=");
        sb.append(str);
        sb.append(", type=");
        sb.append(rowType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.amount.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel planDetailHeaderRowModel = (com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, planDetailHeaderRowModel.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, planDetailHeaderRowModel.amount) && this.type == planDetailHeaderRowModel.type;
    }

    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel copy(com.paypal.oslo.core.commonui.utils.RefText title, java.lang.String amount, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        return new com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel(title, amount, type);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.commonui.utils.RefText getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel copy$default(com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel planDetailHeaderRowModel, com.paypal.oslo.core.commonui.utils.RefText refText, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.plandetails.components.PlanDetailHeaderRowModel.RowType rowType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            refText = planDetailHeaderRowModel.title;
        }
        if ((i & 2) != 0) {
            str = planDetailHeaderRowModel.amount;
        }
        if ((i & 4) != 0) {
            rowType = planDetailHeaderRowModel.type;
        }
        return planDetailHeaderRowModel.copy(refText, str, rowType);
    }
}
