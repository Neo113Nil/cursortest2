package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ6\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/NotificationIdentifierInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "notificationId", "contentId", "campaignId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/api/graphql/schema/type/NotificationIdentifierInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/apollographql/apollo/api/Optional;", "getNotificationId", "Ljava/lang/String;", "getContentId", "getCampaignId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationIdentifierInput {
    private final java.lang.String campaignId;
    private final java.lang.String contentId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> notificationId;

    public NotificationIdentifierInput(com.apollographql.apollo.api.Optional<java.lang.String> optional, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.notificationId = optional;
        this.contentId = str;
        this.campaignId = str2;
    }

    public /* synthetic */ NotificationIdentifierInput(com.apollographql.apollo.api.Optional.Absent absent, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, str, str2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getNotificationId() {
        return this.notificationId;
    }

    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.notificationId;
        java.lang.String str = this.contentId;
        java.lang.String str2 = this.campaignId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NotificationIdentifierInput(notificationId=");
        sb.append(optional);
        sb.append(", contentId=");
        sb.append(str);
        sb.append(", campaignId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.notificationId.hashCode() * 31) + this.contentId.hashCode()) * 31) + this.campaignId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput notificationIdentifierInput = (com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.notificationId, notificationIdentifierInput.notificationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contentId, notificationIdentifierInput.contentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.campaignId, notificationIdentifierInput.campaignId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput copy(com.apollographql.apollo.api.Optional<java.lang.String> notificationId, java.lang.String contentId, java.lang.String campaignId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(campaignId, "");
        return new com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput(notificationId, contentId, campaignId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getContentId() {
        return this.contentId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component1() {
        return this.notificationId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput copy$default(com.paypal.oslo.api.graphql.schema.type.NotificationIdentifierInput notificationIdentifierInput, com.apollographql.apollo.api.Optional optional, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = notificationIdentifierInput.notificationId;
        }
        if ((i & 2) != 0) {
            str = notificationIdentifierInput.contentId;
        }
        if ((i & 4) != 0) {
            str2 = notificationIdentifierInput.campaignId;
        }
        return notificationIdentifierInput.copy(optional, str, str2);
    }
}
