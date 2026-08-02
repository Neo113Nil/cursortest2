package com.paypal.oslo.feature.activity.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentItemFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "name", "", "quantity", "", "imageUrl", "", "Lcom/paypal/oslo/api/graphql/schema/type/ShipmentPackageItemTag;", "tags", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/Object;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;)Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityShipmentItemFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Ljava/lang/Integer;", "getQuantity", "Ljava/lang/Object;", "getImageUrl", "Ljava/util/List;", "getTags"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityShipmentItemFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object imageUrl;
    private final java.lang.String name;
    private final java.lang.Integer quantity;
    private final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityShipmentItemFragment(java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
        this.quantity = num;
        this.imageUrl = obj;
        this.tags = list;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.Integer getQuantity() {
        return this.quantity;
    }

    public final java.lang.Object getImageUrl() {
        return this.imageUrl;
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> getTags() {
        return this.tags;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.Integer num = this.quantity;
        java.lang.Object obj = this.imageUrl;
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityShipmentItemFragment(name=");
        sb.append(str);
        sb.append(", quantity=");
        sb.append(num);
        sb.append(", imageUrl=");
        sb.append(obj);
        sb.append(", tags=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        java.lang.Integer num = this.quantity;
        int hashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Object obj = this.imageUrl;
        int hashCode3 = obj == null ? 0 : obj.hashCode();
        java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> list = this.tags;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment)) {
            return false;
        }
        com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment activityShipmentItemFragment = (com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, activityShipmentItemFragment.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, activityShipmentItemFragment.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, activityShipmentItemFragment.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.tags, activityShipmentItemFragment.tags);
    }

    public final com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment copy(java.lang.String name2, java.lang.Integer quantity, java.lang.Object imageUrl, java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> tags) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment(name2, quantity, imageUrl, tags);
    }

    public final java.util.List<com.paypal.oslo.api.graphql.schema.type.ShipmentPackageItemTag> component4() {
        return this.tags;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getImageUrl() {
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
    public static /* synthetic */ com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment copy$default(com.paypal.oslo.feature.activity.graphql.fragment.ActivityShipmentItemFragment activityShipmentItemFragment, java.lang.String str, java.lang.Integer num, java.lang.Object obj, java.util.List list, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = activityShipmentItemFragment.name;
        }
        if ((i & 2) != 0) {
            num = activityShipmentItemFragment.quantity;
        }
        if ((i & 4) != 0) {
            obj = activityShipmentItemFragment.imageUrl;
        }
        if ((i & 8) != 0) {
            list = activityShipmentItemFragment.tags;
        }
        return activityShipmentItemFragment.copy(str, num, obj, list);
    }
}
