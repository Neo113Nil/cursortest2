package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemData;", "", "", "title", "subtitle", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "action", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;Lcom/paypal/pds/core/Icon;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "component4", "()Lcom/paypal/pds/core/Icon;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "getAction", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DocumentItemData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction action;
    private final com.paypal.pds.core.Icon icon;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public DocumentItemData(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction documentItemAction, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentItemAction, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        this.title = str;
        this.subtitle = str2;
        this.action = documentItemAction;
        this.icon = icon;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction getAction() {
        return this.action;
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.subtitle;
        com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction documentItemAction = this.action;
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DocumentItemData(title=");
        sb.append(str);
        sb.append(", subtitle=");
        sb.append(str2);
        sb.append(", action=");
        sb.append(documentItemAction);
        sb.append(", icon=");
        sb.append(icon);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode();
        java.lang.String str = this.subtitle;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.action.hashCode()) * 31) + this.icon.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData)) {
            return false;
        }
        com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData = (com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, documentItemData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, documentItemData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, documentItemData.action) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, documentItemData.icon);
    }

    public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData copy(java.lang.String title, java.lang.String subtitle, com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction action, com.paypal.pds.core.Icon icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        return new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData(title, subtitle, action, icon);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData copy$default(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemData documentItemData, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction documentItemAction, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = documentItemData.title;
        }
        if ((i & 2) != 0) {
            str2 = documentItemData.subtitle;
        }
        if ((i & 4) != 0) {
            documentItemAction = documentItemData.action;
        }
        if ((i & 8) != 0) {
            icon = documentItemData.icon;
        }
        return documentItemData.copy(str, str2, documentItemAction, icon);
    }
}
