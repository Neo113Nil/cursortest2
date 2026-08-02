package com.paypal.oslo.feature.packagetracking.domain.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JD\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/model/Item;", "", "", "name", "", "quantity", "imageUrl", "", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/packagetracking/domain/model/Item;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getQuantity", "getImageUrl", "Ljava/util/List;", "getTags"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Item {
    public static final int $stable = 8;
    private final java.lang.String imageUrl;
    private final java.lang.String name;
    private final java.lang.Integer quantity;
    private final java.util.List<java.lang.String> tags;

    public Item(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.name = str;
        this.quantity = num;
        this.imageUrl = str2;
        this.tags = list;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public /* synthetic */ Item(java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<java.lang.String> getTags() {
        return this.tags;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.Integer num = this.quantity;
        java.lang.String str2 = this.imageUrl;
        java.util.List<java.lang.String> list = this.tags;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Item(name=");
        sb.append(str);
        sb.append(", quantity=");
        sb.append(num);
        sb.append(", imageUrl=");
        sb.append(str2);
        sb.append(", tags=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.quantity;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.imageUrl;
        return (((((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.domain.model.Item)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.domain.model.Item item = (com.paypal.oslo.feature.packagetracking.domain.model.Item) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, item.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, item.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, item.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, item.tags);
    }

    public final com.paypal.oslo.feature.packagetracking.domain.model.Item copy(java.lang.String name2, java.lang.Integer quantity, java.lang.String imageUrl, java.util.List<java.lang.String> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tags, "");
        return new com.paypal.oslo.feature.packagetracking.domain.model.Item(name2, quantity, imageUrl, tags);
    }

    public final java.util.List<java.lang.String> component4() {
        return this.tags;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Integer getQuantity() {
        return this.quantity;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.model.Item copy$default(com.paypal.oslo.feature.packagetracking.domain.model.Item item, java.lang.String str, java.lang.Integer num, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = item.name;
        }
        if ((i & 2) != 0) {
            num = item.quantity;
        }
        if ((i & 4) != 0) {
            str2 = item.imageUrl;
        }
        if ((i & 8) != 0) {
            list = item.tags;
        }
        return item.copy(str, num, str2, list);
    }

    public Item() {
        this(null, null, null, null, 15, null);
    }
}
