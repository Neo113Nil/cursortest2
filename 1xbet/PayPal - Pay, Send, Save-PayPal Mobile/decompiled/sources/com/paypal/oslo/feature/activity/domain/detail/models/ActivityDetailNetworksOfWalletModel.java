package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "label", "", "imageUrl", "", "wrapWithCard", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailNetworksOfWalletModel;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/Integer;", "getLabel", "Ljava/lang/String;", "getImageUrl", "Z", "getWrapWithCard"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailNetworksOfWalletModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final java.lang.String imageUrl;
    private final java.lang.Integer label;
    private final boolean wrapWithCard;

    public ActivityDetailNetworksOfWalletModel(java.lang.Integer num, java.lang.String str, boolean z) {
        super(null, null, false, false, false, null, null, 127, null);
        this.label = num;
        this.imageUrl = str;
        this.wrapWithCard = z;
    }

    public /* synthetic */ ActivityDetailNetworksOfWalletModel(java.lang.Integer num, java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }

    public final java.lang.Integer getLabel() {
        return this.label;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final boolean getWrapWithCard() {
        return this.wrapWithCard;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.label;
        java.lang.String str = this.imageUrl;
        boolean z = this.wrapWithCard;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailNetworksOfWalletModel(label=");
        sb.append(num);
        sb.append(", imageUrl=");
        sb.append(str);
        sb.append(", wrapWithCard=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.label;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.imageUrl;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.wrapWithCard);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailNetworksOfWalletModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.label, activityDetailNetworksOfWalletModel.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, activityDetailNetworksOfWalletModel.imageUrl) && this.wrapWithCard == activityDetailNetworksOfWalletModel.wrapWithCard;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel copy(java.lang.Integer label, java.lang.String imageUrl, boolean wrapWithCard) {
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel(label, imageUrl, wrapWithCard);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getWrapWithCard() {
        return this.wrapWithCard;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getLabel() {
        return this.label;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailNetworksOfWalletModel activityDetailNetworksOfWalletModel, java.lang.Integer num, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = activityDetailNetworksOfWalletModel.label;
        }
        if ((i & 2) != 0) {
            str = activityDetailNetworksOfWalletModel.imageUrl;
        }
        if ((i & 4) != 0) {
            z = activityDetailNetworksOfWalletModel.wrapWithCard;
        }
        return activityDetailNetworksOfWalletModel.copy(num, str, z);
    }

    public ActivityDetailNetworksOfWalletModel() {
        this(null, null, false, 7, null);
    }
}
