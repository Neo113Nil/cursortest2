package com.paypal.oslo.feature.xoom.data.response;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;", "", "Lcom/paypal/oslo/feature/xoom/data/response/User;", "user", "<init>", "(Lcom/paypal/oslo/feature/xoom/data/response/User;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/xoom/data/response/User;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/xoom/data/response/User;", "copy", "(Lcom/paypal/oslo/feature/xoom/data/response/User;)Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$xoom_prodRelease", "(Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/xoom/data/response/User;", "getUser", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class UserResponseData {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.xoom.data.response.UserResponseData.Companion INSTANCE = new com.paypal.oslo.feature.xoom.data.response.UserResponseData.Companion(null);
    private final com.paypal.oslo.feature.xoom.data.response.User user;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/xoom/data/response/UserResponseData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.xoom.data.response.UserResponseData> serializer() {
            return com.paypal.oslo.feature.xoom.data.response.UserResponseData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserResponseData(int i, com.paypal.oslo.feature.xoom.data.response.User user, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.xoom.data.response.UserResponseData$$serializer.INSTANCE.getDescriptor());
        }
        this.user = user;
    }

    public UserResponseData(com.paypal.oslo.feature.xoom.data.response.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        this.user = user;
    }

    public final com.paypal.oslo.feature.xoom.data.response.User getUser() {
        return this.user;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.xoom.data.response.User user = this.user;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserResponseData(user=");
        sb.append(user);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.user.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.xoom.data.response.UserResponseData) && kotlin.jvm.internal.Intrinsics.areEqual(this.user, ((com.paypal.oslo.feature.xoom.data.response.UserResponseData) other).user);
    }

    public final com.paypal.oslo.feature.xoom.data.response.UserResponseData copy(com.paypal.oslo.feature.xoom.data.response.User user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        return new com.paypal.oslo.feature.xoom.data.response.UserResponseData(user);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.xoom.data.response.User getUser() {
        return this.user;
    }

    public static /* synthetic */ com.paypal.oslo.feature.xoom.data.response.UserResponseData copy$default(com.paypal.oslo.feature.xoom.data.response.UserResponseData userResponseData, com.paypal.oslo.feature.xoom.data.response.User user, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            user = userResponseData.user;
        }
        return userResponseData.copy(user);
    }
}
