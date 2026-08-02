package com.paypal.oslo.feature.qrc.ui.review;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JL\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "", "", "id", "name", "typeLabel", "imageUrl", "balanceAmount", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/qrc/ui/review/FiUiItem;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getTypeLabel", "getImageUrl", "getBalanceAmount", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FiUiItem {
    public static final int $stable = 0;
    private final java.lang.String balanceAmount;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final boolean isSelected;
    private final java.lang.String name;
    private final java.lang.String typeLabel;

    public FiUiItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.id = str;
        this.name = str2;
        this.typeLabel = str3;
        this.imageUrl = str4;
        this.balanceAmount = str5;
        this.isSelected = z;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getTypeLabel() {
        return this.typeLabel;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getBalanceAmount() {
        return this.balanceAmount;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.typeLabel;
        java.lang.String str4 = this.imageUrl;
        java.lang.String str5 = this.balanceAmount;
        boolean z = this.isSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FiUiItem(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", typeLabel=");
        sb.append(str3);
        sb.append(", imageUrl=");
        sb.append(str4);
        sb.append(", balanceAmount=");
        sb.append(str5);
        sb.append(", isSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.typeLabel.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.balanceAmount.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.qrc.ui.review.FiUiItem)) {
            return false;
        }
        com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem = (com.paypal.oslo.feature.qrc.ui.review.FiUiItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fiUiItem.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fiUiItem.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.typeLabel, fiUiItem.typeLabel) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fiUiItem.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.balanceAmount, fiUiItem.balanceAmount) && this.isSelected == fiUiItem.isSelected;
    }

    public final com.paypal.oslo.feature.qrc.ui.review.FiUiItem copy(java.lang.String id, java.lang.String name2, java.lang.String typeLabel, java.lang.String imageUrl, java.lang.String balanceAmount, boolean isSelected) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeLabel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceAmount, "");
        return new com.paypal.oslo.feature.qrc.ui.review.FiUiItem(id, name2, typeLabel, imageUrl, balanceAmount, isSelected);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBalanceAmount() {
        return this.balanceAmount;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTypeLabel() {
        return this.typeLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.FiUiItem copy$default(com.paypal.oslo.feature.qrc.ui.review.FiUiItem fiUiItem, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fiUiItem.id;
        }
        if ((i & 2) != 0) {
            str2 = fiUiItem.name;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = fiUiItem.typeLabel;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = fiUiItem.imageUrl;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = fiUiItem.balanceAmount;
        }
        java.lang.String str9 = str5;
        if ((i & 32) != 0) {
            z = fiUiItem.isSelected;
        }
        return fiUiItem.copy(str, str6, str7, str8, str9, z);
    }
}
