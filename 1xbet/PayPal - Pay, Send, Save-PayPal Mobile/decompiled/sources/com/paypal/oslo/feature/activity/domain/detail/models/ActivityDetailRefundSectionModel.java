package com.paypal.oslo.feature.activity.domain.detail.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailBaseSectionModel;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "descriptionAndLinks", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;)V", "component1", "()Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "copy", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;)Lcom/paypal/oslo/feature/activity/domain/detail/models/ActivityDetailRefundSectionModel;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/activity/domain/detail/models/DescriptionAndLinkModel;", "getDescriptionAndLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActivityDetailRefundSectionModel extends com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailBaseSectionModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityDetailRefundSectionModel(com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel) {
        super(null, null, false, false, false, null, null, 127, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionAndLinkModel, "");
        this.descriptionAndLinks = descriptionAndLinkModel;
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel getDescriptionAndLinks() {
        return this.descriptionAndLinks;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel = this.descriptionAndLinks;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityDetailRefundSectionModel(descriptionAndLinks=");
        sb.append(descriptionAndLinkModel);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.descriptionAndLinks.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.descriptionAndLinks, ((com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel) other).descriptionAndLinks);
    }

    public final com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel copy(com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionAndLinks, "");
        return new com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel(descriptionAndLinks);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel getDescriptionAndLinks() {
        return this.descriptionAndLinks;
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel copy$default(com.paypal.oslo.feature.activity.domain.detail.models.ActivityDetailRefundSectionModel activityDetailRefundSectionModel, com.paypal.oslo.feature.activity.domain.detail.models.DescriptionAndLinkModel descriptionAndLinkModel, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            descriptionAndLinkModel = activityDetailRefundSectionModel.descriptionAndLinks;
        }
        return activityDetailRefundSectionModel.copy(descriptionAndLinkModel);
    }
}
