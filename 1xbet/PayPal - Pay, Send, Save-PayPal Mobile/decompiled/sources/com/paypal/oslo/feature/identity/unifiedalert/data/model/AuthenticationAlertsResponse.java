package com.paypal.oslo.feature.identity.unifiedalert.data.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 %2\u00020\u0001:\u0002&%B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ0\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\u000eR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;", "", "", "", "alerts", "acceptableClaims", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAlerts", "getAcceptableClaims", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AuthenticationAlertsResponse {
    private final java.util.List<java.lang.String> acceptableClaims;
    private final java.util.List<java.lang.String> alerts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse.Companion INSTANCE = new com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse.$r8$lambda$ED_AXihoMZYfiOl8UHfQpHcD0Ng();
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse.$r8$lambda$tasfbwnGUHHZAdM5ntqmHC2iQGQ();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/unifiedalert/data/model/AuthenticationAlertsResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse> serializer() {
            return com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AuthenticationAlertsResponse(int i, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.alerts = list;
        this.acceptableClaims = list2;
    }

    public AuthenticationAlertsResponse(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.alerts = list;
        this.acceptableClaims = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.alerts);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.acceptableClaims);
    }

    public final java.util.List<java.lang.String> getAlerts() {
        return this.alerts;
    }

    public final java.util.List<java.lang.String> getAcceptableClaims() {
        return this.acceptableClaims;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$ED_AXihoMZYfiOl8UHfQpHcD0Ng() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$tasfbwnGUHHZAdM5ntqmHC2iQGQ() {
        return new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.alerts;
        java.util.List<java.lang.String> list2 = this.acceptableClaims;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationAlertsResponse(alerts=");
        sb.append(list);
        sb.append(", acceptableClaims=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.alerts.hashCode() * 31) + this.acceptableClaims.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse)) {
            return false;
        }
        com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse authenticationAlertsResponse = (com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alerts, authenticationAlertsResponse.alerts) && kotlin.jvm.internal.Intrinsics.areEqual(this.acceptableClaims, authenticationAlertsResponse.acceptableClaims);
    }

    public final com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse copy(java.util.List<java.lang.String> alerts, java.util.List<java.lang.String> acceptableClaims) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(alerts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acceptableClaims, "");
        return new com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse(alerts, acceptableClaims);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.acceptableClaims;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.alerts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse copy$default(com.paypal.oslo.feature.identity.unifiedalert.data.model.AuthenticationAlertsResponse authenticationAlertsResponse, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = authenticationAlertsResponse.alerts;
        }
        if ((i & 2) != 0) {
            list2 = authenticationAlertsResponse.acceptableClaims;
        }
        return authenticationAlertsResponse.copy(list, list2);
    }
}
