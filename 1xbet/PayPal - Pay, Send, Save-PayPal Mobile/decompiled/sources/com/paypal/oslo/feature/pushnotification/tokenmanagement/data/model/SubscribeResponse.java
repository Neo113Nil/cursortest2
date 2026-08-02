package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/SubscribeResponse;", "", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "Lcom/paypal/oslo/feature/pushnotification/graphql/type/PushNotificationsSubscriptionStatus;", "status", "", "cloudId", "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;Ljava/lang/String;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/data/model/SubscribeResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationsSubscriptionStatus;", "getStatus", "Ljava/lang/String;", "getCloudId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class SubscribeResponse {
    public static final int $stable = 0;
    private final java.lang.String cloudId;
    private final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status;

    public SubscribeResponse(com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus, java.lang.String str) {
        this.status = pushNotificationsSubscriptionStatus;
        this.cloudId = str;
    }

    public /* synthetic */ SubscribeResponse(com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(pushNotificationsSubscriptionStatus, (i & 2) != 0 ? null : str);
    }

    public final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus getStatus() {
        return this.status;
    }

    public final java.lang.String getCloudId() {
        return this.cloudId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus = this.status;
        java.lang.String str = this.cloudId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscribeResponse(status=");
        sb.append(pushNotificationsSubscriptionStatus);
        sb.append(", cloudId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus = this.status;
        int hashCode = pushNotificationsSubscriptionStatus == null ? 0 : pushNotificationsSubscriptionStatus.hashCode();
        java.lang.String str = this.cloudId;
        return (hashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse)) {
            return false;
        }
        com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse subscribeResponse = (com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse) other;
        return this.status == subscribeResponse.status && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudId, subscribeResponse.cloudId);
    }

    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse copy(com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus status, java.lang.String cloudId) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse(status, cloudId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCloudId() {
        return this.cloudId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse copy$default(com.paypal.oslo.feature.pushnotification.tokenmanagement.data.model.SubscribeResponse subscribeResponse, com.paypal.oslo.api.graphql.schema.type.PushNotificationsSubscriptionStatus pushNotificationsSubscriptionStatus, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            pushNotificationsSubscriptionStatus = subscribeResponse.status;
        }
        if ((i & 2) != 0) {
            str = subscribeResponse.cloudId;
        }
        return subscribeResponse.copy(pushNotificationsSubscriptionStatus, str);
    }
}
