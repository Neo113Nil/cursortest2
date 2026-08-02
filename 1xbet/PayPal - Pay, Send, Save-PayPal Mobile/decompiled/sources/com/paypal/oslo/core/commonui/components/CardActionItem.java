package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/CardActionItem;", "", "Lcom/paypal/pds/core/Icon;", "icon", "", "title", "Lkotlin/Function0;", "", "onClick", "contentDescription", "<init>", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "component2", "()Ljava/lang/String;", "component3", "()Lkotlin/jvm/functions/Function0;", "component4", "copy", "(Lcom/paypal/pds/core/Icon;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/paypal/oslo/core/commonui/components/CardActionItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/pds/core/Icon;", "getIcon", "Ljava/lang/String;", "getTitle", "Lkotlin/jvm/functions/Function0;", "getOnClick", "getContentDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CardActionItem {
    public static final int $stable = 0;
    private final java.lang.String contentDescription;
    private final com.paypal.pds.core.Icon icon;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> onClick;
    private final java.lang.String title;

    public CardActionItem(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0<kotlin.Unit> function0, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.icon = icon;
        this.title = str;
        this.onClick = function0;
        this.contentDescription = str2;
    }

    public /* synthetic */ CardActionItem(com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(icon, str, function0, (i & 8) != 0 ? null : str2);
    }

    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getOnClick() {
        return this.onClick;
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.Icon icon = this.icon;
        java.lang.String str = this.title;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.onClick;
        java.lang.String str2 = this.contentDescription;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardActionItem(icon=");
        sb.append(icon);
        sb.append(", title=");
        sb.append(str);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(", contentDescription=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.icon.hashCode();
        int hashCode2 = this.title.hashCode();
        int hashCode3 = this.onClick.hashCode();
        java.lang.String str = this.contentDescription;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.commonui.components.CardActionItem)) {
            return false;
        }
        com.paypal.oslo.core.commonui.components.CardActionItem cardActionItem = (com.paypal.oslo.core.commonui.components.CardActionItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, cardActionItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, cardActionItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.onClick, cardActionItem.onClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentDescription, cardActionItem.contentDescription);
    }

    public final com.paypal.oslo.core.commonui.components.CardActionItem copy(com.paypal.pds.core.Icon icon, java.lang.String title, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, java.lang.String contentDescription) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onClick, "");
        return new com.paypal.oslo.core.commonui.components.CardActionItem(icon, title, onClick, contentDescription);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> component3() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.Icon getIcon() {
        return this.icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.commonui.components.CardActionItem copy$default(com.paypal.oslo.core.commonui.components.CardActionItem cardActionItem, com.paypal.pds.core.Icon icon, java.lang.String str, kotlin.jvm.functions.Function0 function0, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            icon = cardActionItem.icon;
        }
        if ((i & 2) != 0) {
            str = cardActionItem.title;
        }
        if ((i & 4) != 0) {
            function0 = cardActionItem.onClick;
        }
        if ((i & 8) != 0) {
            str2 = cardActionItem.contentDescription;
        }
        return cardActionItem.copy(icon, str, function0, str2);
    }
}
