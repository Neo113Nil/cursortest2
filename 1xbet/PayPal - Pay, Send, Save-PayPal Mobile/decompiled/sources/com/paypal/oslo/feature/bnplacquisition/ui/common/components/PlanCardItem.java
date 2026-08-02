package com.paypal.oslo.feature.bnplacquisition.ui.common.components;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItem;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/pds/core/Icon;", "leadingIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Icon;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/PlanCardItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/paypal/pds/core/Icon;", "getLeadingIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PlanCardItem {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final com.paypal.pds.core.Icon leadingIcon;
    private final java.lang.String title;

    public PlanCardItem(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.title = str;
        this.description = str2;
        this.leadingIcon = icon;
    }

    public /* synthetic */ PlanCardItem(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, icon);
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.pds.core.Icon getLeadingIcon() {
        return this.leadingIcon;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        com.paypal.pds.core.Icon icon = this.leadingIcon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PlanCardItem(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", leadingIcon=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.description;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.leadingIcon.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem planCardItem = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, planCardItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, planCardItem.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.leadingIcon, planCardItem.leadingIcon);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem copy(java.lang.String title, java.lang.String description, com.paypal.pds.core.Icon leadingIcon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(leadingIcon, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem(title, description, leadingIcon);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Icon getLeadingIcon() {
        return this.leadingIcon;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardItem planCardItem, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = planCardItem.title;
        }
        if ((i & 2) != 0) {
            str2 = planCardItem.description;
        }
        if ((i & 4) != 0) {
            icon = planCardItem.leadingIcon;
        }
        return planCardItem.copy(str, str2, icon);
    }
}
