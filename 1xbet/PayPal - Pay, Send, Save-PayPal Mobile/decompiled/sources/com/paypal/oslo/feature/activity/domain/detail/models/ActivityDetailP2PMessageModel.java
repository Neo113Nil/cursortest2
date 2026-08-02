package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "", "imageUrl", "message", "Lcom/paypal/pds/core/Color;", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Color;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/pds/core/Color;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Color;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailP2PMessageModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImageUrl", "getMessage", "Lcom/paypal/pds/core/Color;", "getBackgroundColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailP2PMessageModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.pds.core.Color backgroundColor;
    private final java.lang.String imageUrl;
    private final java.lang.String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailP2PMessageModel(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color color) {
        super(null, null, false, false, false, null, null, 127, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        this.imageUrl = str;
        this.message = str2;
        this.backgroundColor = color;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public /* synthetic */ ActivityDetailP2PMessageModel(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color.BackgroundMuted backgroundMuted, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, str2, (i & 4) != 0 ? com.paypal.pds.core.Color.BackgroundMuted.INSTANCE : backgroundMuted);
    }

    @Override // com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.imageUrl;
        java.lang.String str2 = this.message;
        com.paypal.pds.core.Color color = this.backgroundColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailP2PMessageModel(imageUrl=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(", backgroundColor=");
        sb.append(color);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.imageUrl;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.message.hashCode()) * 31) + this.backgroundColor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel)) {
            return false;
        }
        com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel = (com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, activityDetailP2PMessageModel.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, activityDetailP2PMessageModel.message) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, activityDetailP2PMessageModel.backgroundColor);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel copy(java.lang.String imageUrl, java.lang.String message, com.paypal.pds.core.Color backgroundColor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backgroundColor, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel(imageUrl, message, backgroundColor);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.pds.core.Color getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailP2PMessageModel activityDetailP2PMessageModel, java.lang.String str, java.lang.String str2, com.paypal.pds.core.Color color, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = activityDetailP2PMessageModel.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = activityDetailP2PMessageModel.message;
        }
        if ((i & 4) != 0) {
            color = activityDetailP2PMessageModel.backgroundColor;
        }
        return activityDetailP2PMessageModel.copy(str, str2, color);
    }
}
