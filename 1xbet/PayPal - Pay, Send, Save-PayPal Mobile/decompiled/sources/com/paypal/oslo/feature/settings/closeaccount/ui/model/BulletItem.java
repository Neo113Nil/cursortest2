package com.paypal.oslo.feature.settings.closeaccount.ui.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/BulletItem;", "", "", "text", "", "linkTexts", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/settings/closeaccount/ui/model/BulletItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getText", "Ljava/util/List;", "getLinkTexts"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BulletItem {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> linkTexts;
    private final java.lang.String text;

    public BulletItem(java.lang.String str, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.text = str;
        this.linkTexts = list;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public /* synthetic */ BulletItem(java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<java.lang.String> getLinkTexts() {
        return this.linkTexts;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.text;
        java.util.List<java.lang.String> list = this.linkTexts;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BulletItem(text=");
        sb.append(str);
        sb.append(", linkTexts=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.text.hashCode() * 31) + this.linkTexts.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem bulletItem = (com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.text, bulletItem.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.linkTexts, bulletItem.linkTexts);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem copy(java.lang.String text, java.util.List<java.lang.String> linkTexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkTexts, "");
        return new com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem(text, linkTexts);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.linkTexts;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem copy$default(com.paypal.oslo.feature.settings.closeaccount.ui.model.BulletItem bulletItem, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bulletItem.text;
        }
        if ((i & 2) != 0) {
            list = bulletItem.linkTexts;
        }
        return bulletItem.copy(str, list);
    }
}
