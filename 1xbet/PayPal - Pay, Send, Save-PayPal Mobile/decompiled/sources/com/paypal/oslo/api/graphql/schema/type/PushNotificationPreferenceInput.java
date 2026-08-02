package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferenceInput;", "", "", "type", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;)Lcom/paypal/oslo/api/graphql/schema/type/PushNotificationPreferenceInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "Lcom/paypal/oslo/api/graphql/schema/type/NotificationPreferenceStatus;", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PushNotificationPreferenceInput {
    private final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status;
    private final java.lang.String type;

    public PushNotificationPreferenceInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(notificationPreferenceStatus, "");
        this.type = str;
        this.status = notificationPreferenceStatus;
    }

    public final java.lang.String getType() {
        return this.type;
    }

    public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.type;
        com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PushNotificationPreferenceInput(type=");
        sb.append(str);
        sb.append(", status=");
        sb.append(notificationPreferenceStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.type.hashCode() * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput pushNotificationPreferenceInput = (com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.type, pushNotificationPreferenceInput.type) && this.status == pushNotificationPreferenceInput.status;
    }

    public final com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput copy(java.lang.String type, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput(type, status);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus getStatus() {
        return this.status;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getType() {
        return this.type;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput copy$default(com.paypal.oslo.api.graphql.schema.type.PushNotificationPreferenceInput pushNotificationPreferenceInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.NotificationPreferenceStatus notificationPreferenceStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = pushNotificationPreferenceInput.type;
        }
        if ((i & 2) != 0) {
            notificationPreferenceStatus = pushNotificationPreferenceInput.status;
        }
        return pushNotificationPreferenceInput.copy(str, notificationPreferenceStatus);
    }
}
