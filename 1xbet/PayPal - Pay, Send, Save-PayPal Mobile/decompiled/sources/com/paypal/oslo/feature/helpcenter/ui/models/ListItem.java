package com.paypal.oslo.feature.helpcenter.ui.models;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/ui/models/ListItem;", "", "", "Lcom/paypal/oslo/feature/helpcenter/ui/models/ContentElement;", "content", "", "number", "<init>", "(Ljava/util/List;I)V", "component1", "()Ljava/util/List;", "component2", "()I", "copy", "(Ljava/util/List;I)Lcom/paypal/oslo/feature/helpcenter/ui/models/ListItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContent", com.visa.cbp.getEncExpo.warmup, "getNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ListItem {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> content;
    private final int number;

    /* JADX WARN: Multi-variable type inference failed */
    public ListItem(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> list, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.content = list;
        this.number = i;
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> getContent() {
        return this.content;
    }

    public final int getNumber() {
        return this.number;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> list = this.content;
        int i = this.number;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ListItem(content=");
        sb.append(list);
        sb.append(", number=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.content.hashCode() * 31) + java.lang.Integer.hashCode(this.number);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.helpcenter.ui.models.ListItem)) {
            return false;
        }
        com.paypal.oslo.feature.helpcenter.ui.models.ListItem listItem = (com.paypal.oslo.feature.helpcenter.ui.models.ListItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, listItem.content) && this.number == listItem.number;
    }

    public final com.paypal.oslo.feature.helpcenter.ui.models.ListItem copy(java.util.List<? extends com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> content, int number) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        return new com.paypal.oslo.feature.helpcenter.ui.models.ListItem(content, number);
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public final java.util.List<com.paypal.oslo.feature.helpcenter.ui.models.ContentElement> component1() {
        return this.content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.models.ListItem copy$default(com.paypal.oslo.feature.helpcenter.ui.models.ListItem listItem, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            list = listItem.content;
        }
        if ((i2 & 2) != 0) {
            i = listItem.number;
        }
        return listItem.copy(list, i);
    }
}
