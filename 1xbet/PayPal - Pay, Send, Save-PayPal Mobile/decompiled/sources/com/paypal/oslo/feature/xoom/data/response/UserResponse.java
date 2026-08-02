package com.paypal.oslo.feature.xoom.data.response;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0011\u0010\"\u001a\u00020\u001f8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/response/UserResponse;", "", "Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/xoom/data/response/UserResponseData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "copy", "(Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;)Lcom/paypal/oslo/feature/xoom/data/response/UserResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$xoom_prodRelease", "(Lcom/paypal/oslo/feature/xoom/data/response/UserResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;", "Lcom/paypal/oslo/feature/xoom/data/response/User;", "getUser", "()Lcom/paypal/oslo/feature/xoom/data/response/User;", "user", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class UserResponse {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.xoom.data.response.UserResponse.Companion INSTANCE = new com.paypal.oslo.feature.xoom.data.response.UserResponse.Companion(null);
    private final com.paypal.oslo.feature.xoom.data.response.UserResponseData data;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/response/UserResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/xoom/data/response/UserResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.xoom.data.response.UserResponse> serializer() {
            return com.paypal.oslo.feature.xoom.data.response.UserResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserResponse(int i, com.paypal.oslo.feature.xoom.data.response.UserResponseData userResponseData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.xoom.data.response.UserResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.data = userResponseData;
    }

    public UserResponse(com.paypal.oslo.feature.xoom.data.response.UserResponseData userResponseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userResponseData, "");
        this.data = userResponseData;
    }

    public final com.paypal.oslo.feature.xoom.data.response.User getUser() {
        return this.data.getUser();
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.xoom.data.response.UserResponseData userResponseData = this.data;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserResponse(data=");
        sb.append(userResponseData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.data.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.xoom.data.response.UserResponse) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.xoom.data.response.UserResponse) other).data);
    }

    public final com.paypal.oslo.feature.xoom.data.response.UserResponse copy(com.paypal.oslo.feature.xoom.data.response.UserResponseData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.xoom.data.response.UserResponse(data);
    }

    public static /* synthetic */ com.paypal.oslo.feature.xoom.data.response.UserResponse copy$default(com.paypal.oslo.feature.xoom.data.response.UserResponse userResponse, com.paypal.oslo.feature.xoom.data.response.UserResponseData userResponseData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userResponseData = userResponse.data;
        }
        return userResponse.copy(userResponseData);
    }
}
