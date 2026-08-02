package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJH\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0005HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;", "", "", "deviceId", "deviceToken", "Lcom/apollographql/apollo/api/Optional;", "cloudIdentity", "", "hasPushConsent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/apollographql/apollo/api/Optional;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/SubscribeToPushNotificationsInput;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceId", "getDeviceToken", "Lcom/apollographql/apollo/api/Optional;", "getCloudIdentity", "getHasPushConsent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SubscribeToPushNotificationsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> cloudIdentity;
    private final java.lang.String deviceId;
    private final java.lang.String deviceToken;
    private final com.apollographql.apollo.api.Optional<java.lang.Boolean> hasPushConsent;

    public SubscribeToPushNotificationsInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional<java.lang.String> optional, com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        this.deviceId = str;
        this.deviceToken = str2;
        this.cloudIdentity = optional;
        this.hasPushConsent = optional2;
    }

    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    public final java.lang.String getDeviceToken() {
        return this.deviceToken;
    }

    public /* synthetic */ SubscribeToPushNotificationsInput(java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 8) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getCloudIdentity() {
        return this.cloudIdentity;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> getHasPushConsent() {
        return this.hasPushConsent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceId;
        java.lang.String str2 = this.deviceToken;
        com.apollographql.apollo.api.Optional<java.lang.String> optional = this.cloudIdentity;
        com.apollographql.apollo.api.Optional<java.lang.Boolean> optional2 = this.hasPushConsent;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SubscribeToPushNotificationsInput(deviceId=");
        sb.append(str);
        sb.append(", deviceToken=");
        sb.append(str2);
        sb.append(", cloudIdentity=");
        sb.append(optional);
        sb.append(", hasPushConsent=");
        sb.append(optional2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.deviceId.hashCode() * 31) + this.deviceToken.hashCode()) * 31) + this.cloudIdentity.hashCode()) * 31) + this.hasPushConsent.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput = (com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceId, subscribeToPushNotificationsInput.deviceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceToken, subscribeToPushNotificationsInput.deviceToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudIdentity, subscribeToPushNotificationsInput.cloudIdentity) && kotlin.jvm.internal.Intrinsics.areEqual(this.hasPushConsent, subscribeToPushNotificationsInput.hasPushConsent);
    }

    public final com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput copy(java.lang.String deviceId, java.lang.String deviceToken, com.apollographql.apollo.api.Optional<java.lang.String> cloudIdentity, com.apollographql.apollo.api.Optional<java.lang.Boolean> hasPushConsent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudIdentity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hasPushConsent, "");
        return new com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput(deviceId, deviceToken, cloudIdentity, hasPushConsent);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.Boolean> component4() {
        return this.hasPushConsent;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.cloudIdentity;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceToken() {
        return this.deviceToken;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceId() {
        return this.deviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput copy$default(com.paypal.oslo.api.graphql.schema.type.SubscribeToPushNotificationsInput subscribeToPushNotificationsInput, java.lang.String str, java.lang.String str2, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = subscribeToPushNotificationsInput.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = subscribeToPushNotificationsInput.deviceToken;
        }
        if ((i & 4) != 0) {
            optional = subscribeToPushNotificationsInput.cloudIdentity;
        }
        if ((i & 8) != 0) {
            optional2 = subscribeToPushNotificationsInput.hasPushConsent;
        }
        return subscribeToPushNotificationsInput.copy(str, str2, optional, optional2);
    }
}
