package com.paypal.oslo.feature.identity.api.model.partnerlinking;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0019\u0017B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u0082\u0001\u0002\u001a\u001b"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "getFlowType", "()Ljava/lang/String;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "getPartnerIdentifier", "partnerIdentifier", "Companion", "PartnerInitiated", "PayPalInitiated", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PartnerLinkingRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.$r8$lambda$PIXgKUJu5KJDBFGeAJbLeT2G7No();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PartnerLinkingRequest() {
    }

    public /* synthetic */ PartnerLinkingRequest(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010J'\u0010%\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "", "clientId", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "authClaim", "redirectUri", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getClientId", "getScope", "getAuthClaim", "getRedirectUri", "getState", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PartnerInitiated extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated.Companion(null);
        private final java.lang.String authClaim;
        private final java.lang.String clientId;
        private final java.lang.String redirectUri;
        private final java.lang.String scope;
        private final java.lang.String state;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PartnerInitiated;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PartnerInitiated$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PartnerInitiated(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (31 != (i & 31)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 31, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PartnerInitiated$$serializer.INSTANCE.getDescriptor());
            }
            this.clientId = str;
            this.scope = str2;
            this.authClaim = str3;
            this.redirectUri = str4;
            this.state = str5;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartnerInitiated(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.clientId = str;
            this.scope = str2;
            this.authClaim = str3;
            this.redirectUri = str4;
            this.state = str5;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.clientId);
            output.encodeStringElement(serialDesc, 1, self.scope);
            output.encodeStringElement(serialDesc, 2, self.authClaim);
            output.encodeStringElement(serialDesc, 3, self.redirectUri);
            output.encodeStringElement(serialDesc, 4, self.state);
        }

        public final java.lang.String getClientId() {
            return this.clientId;
        }

        public final java.lang.String getScope() {
            return this.scope;
        }

        public final java.lang.String getAuthClaim() {
            return this.authClaim;
        }

        public final java.lang.String getRedirectUri() {
            return this.redirectUri;
        }

        public final java.lang.String getState() {
            return this.state;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.clientId;
            java.lang.String str2 = this.scope;
            java.lang.String str3 = this.authClaim;
            java.lang.String str4 = this.redirectUri;
            java.lang.String str5 = this.state;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PartnerInitiated(clientId=");
            sb.append(str);
            sb.append(", scope=");
            sb.append(str2);
            sb.append(", authClaim=");
            sb.append(str3);
            sb.append(", redirectUri=");
            sb.append(str4);
            sb.append(", state=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.clientId.hashCode() * 31) + this.scope.hashCode()) * 31) + this.authClaim.hashCode()) * 31) + this.redirectUri.hashCode()) * 31) + this.state.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated)) {
                return false;
            }
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated partnerInitiated = (com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.clientId, partnerInitiated.clientId) && kotlin.jvm.internal.Intrinsics.areEqual(this.scope, partnerInitiated.scope) && kotlin.jvm.internal.Intrinsics.areEqual(this.authClaim, partnerInitiated.authClaim) && kotlin.jvm.internal.Intrinsics.areEqual(this.redirectUri, partnerInitiated.redirectUri) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, partnerInitiated.state);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated copy(java.lang.String clientId, java.lang.String scope, java.lang.String authClaim, java.lang.String redirectUri, java.lang.String state) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scope, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authClaim, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redirectUri, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated(clientId, scope, authClaim, redirectUri, state);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getRedirectUri() {
            return this.redirectUri;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAuthClaim() {
            return this.authClaim;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getScope() {
            return this.scope;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getClientId() {
            return this.clientId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated partnerInitiated, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = partnerInitiated.clientId;
            }
            if ((i & 2) != 0) {
                str2 = partnerInitiated.scope;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = partnerInitiated.authClaim;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = partnerInitiated.redirectUri;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = partnerInitiated.state;
            }
            return partnerInitiated.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ&\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest;", "", "partnerName", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_CONTEXT_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getPartnerName", "getFlowContextId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class PayPalInitiated extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated.Companion(null);
        private final java.lang.String flowContextId;
        private final java.lang.String partnerName;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingRequest$PayPalInitiated;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PayPalInitiated$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PayPalInitiated(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PayPalInitiated$$serializer.INSTANCE.getDescriptor());
            }
            this.partnerName = str;
            if ((i & 2) == 0) {
                this.flowContextId = null;
            } else {
                this.flowContextId = str2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PayPalInitiated(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.partnerName = str;
            this.flowContextId = str2;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.partnerName);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.flowContextId != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.flowContextId);
            }
        }

        public /* synthetic */ PayPalInitiated(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.partnerName;
            java.lang.String str2 = this.flowContextId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PayPalInitiated(partnerName=");
            sb.append(str);
            sb.append(", flowContextId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.partnerName.hashCode();
            java.lang.String str = this.flowContextId;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated)) {
                return false;
            }
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated = (com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.partnerName, payPalInitiated.partnerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.flowContextId, payPalInitiated.flowContextId);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated copy(java.lang.String partnerName, java.lang.String flowContextId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(partnerName, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated(partnerName, flowContextId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFlowContextId() {
            return this.flowContextId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPartnerName() {
            return this.partnerName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated payPalInitiated, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = payPalInitiated.partnerName;
            }
            if ((i & 2) != 0) {
                str2 = payPalInitiated.flowContextId;
            }
            return payPalInitiated.copy(str, str2);
        }
    }

    public final java.lang.String getFlowType() {
        if (this instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated) {
            return "partner_initiated";
        }
        if (this instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) {
            return "paypal_initiated";
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String getPartnerIdentifier() {
        if (this instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated) {
            return ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated) this).getClientId();
        }
        if (this instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) {
            return ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated) this).getPartnerName();
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$PIXgKUJu5KJDBFGeAJbLeT2G7No() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PartnerInitiated.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest.PayPalInitiated.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PartnerInitiated$$serializer.INSTANCE, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingRequest$PayPalInitiated$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PartnerLinkingRequest(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
