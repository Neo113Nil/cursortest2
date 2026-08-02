package com.paypal.oslo.feature.identity.api.navigation;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR \u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/PartnerLinkingDestination;", "Landroidx/navigation3/runtime/NavKey;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "request", "", "requestId", "<init>", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/navigation/PartnerLinkingDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/PartnerLinkingDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "getRequest", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PartnerLinkingDestination implements androidx.navigation3.runtime.NavKey {
    private final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest request;
    private final java.lang.String requestId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlinx.serialization.Transient
    public static /* synthetic */ void getRequestId$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/PartnerLinkingDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/PartnerLinkingDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PartnerLinkingDestination(int i, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.request = partnerLinkingRequest;
        this.requestId = "";
    }

    public PartnerLinkingDestination(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerLinkingRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.request = partnerLinkingRequest;
        this.requestId = str;
    }

    public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest getRequest() {
        return this.request;
    }

    public /* synthetic */ PartnerLinkingDestination(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(partnerLinkingRequest, (i & 2) != 0 ? "" : str);
    }

    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest = this.request;
        java.lang.String str = this.requestId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartnerLinkingDestination(request=");
        sb.append(partnerLinkingRequest);
        sb.append(", requestId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.request.hashCode() * 31) + this.requestId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination partnerLinkingDestination = (com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.request, partnerLinkingDestination.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, partnerLinkingDestination.requestId);
    }

    public final com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination copy(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest request, java.lang.String requestId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
        return new com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination(request, requestId);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest getRequest() {
        return this.request;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination copy$default(com.paypal.oslo.feature.identity.api.navigation.PartnerLinkingDestination partnerLinkingDestination, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest partnerLinkingRequest, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            partnerLinkingRequest = partnerLinkingDestination.request;
        }
        if ((i & 2) != 0) {
            str = partnerLinkingDestination.requestId;
        }
        return partnerLinkingDestination.copy(partnerLinkingRequest, str);
    }
}
