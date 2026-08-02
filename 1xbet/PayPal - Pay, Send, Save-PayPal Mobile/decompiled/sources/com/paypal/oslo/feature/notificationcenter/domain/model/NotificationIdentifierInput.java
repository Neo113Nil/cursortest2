package com.paypal.oslo.feature.notificationcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ0\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIdentifierInput;", "", "", "notificationId", "contentId", "campaignId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/notificationcenter/domain/model/NotificationIdentifierInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNotificationId", "getContentId", "getCampaignId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class NotificationIdentifierInput {
    public static final int $stable = 0;
    private final java.lang.String campaignId;
    private final java.lang.String contentId;
    private final java.lang.String notificationId;

    public NotificationIdentifierInput(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.notificationId = str;
        this.contentId = str2;
        this.campaignId = str3;
    }

    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.notificationId;
        java.lang.String str2 = this.contentId;
        java.lang.String str3 = this.campaignId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationIdentifierInput(notificationId=");
        sb.append(str);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append(", campaignId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.notificationId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.contentId.hashCode()) * 31) + this.campaignId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput)) {
            return false;
        }
        com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput notificationIdentifierInput = (com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notificationIdentifierInput.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, notificationIdentifierInput.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notificationIdentifierInput.campaignId);
    }

    public final com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput copy(java.lang.String notificationId, java.lang.String contentId, java.lang.String campaignId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignId, "");
        return new com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput(notificationId, contentId, campaignId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContentId() {
        return this.contentId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNotificationId() {
        return this.notificationId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput copy$default(com.paypal.oslo.feature.notificationcenter.domain.model.NotificationIdentifierInput notificationIdentifierInput, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = notificationIdentifierInput.notificationId;
        }
        if ((i & 2) != 0) {
            str2 = notificationIdentifierInput.contentId;
        }
        if ((i & 4) != 0) {
            str3 = notificationIdentifierInput.campaignId;
        }
        return notificationIdentifierInput.copy(str, str2, str3);
    }
}
