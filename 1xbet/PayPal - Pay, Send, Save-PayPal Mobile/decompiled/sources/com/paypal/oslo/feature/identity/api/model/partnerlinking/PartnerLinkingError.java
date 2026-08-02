package com.paypal.oslo.feature.identity.api.model.partnerlinking;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0007\u0019\u001a\u001b\u001c\u001d\u001e\u001f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "InvalidSession", "NetworkError", "InvalidOAuthParameters", "ValidationFailed", "FailedToOpenPartnerUrl", "ConsentDeclined", "Unknown", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ConsentDeclined;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$InvalidOAuthParameters;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$InvalidSession;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class PartnerLinkingError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.m15027$r8$lambda$iWjOWe78O1iOnsjzryPJzWSW8E();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private PartnerLinkingError() {
    }

    public /* synthetic */ PartnerLinkingError(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$InvalidSession;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class InvalidSession extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$InvalidSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession.m15029$r8$lambda$PDwkc5becn_aD_AF7fX1cQ52Nk();
            }
        });

        public final int hashCode() {
            return -2099594405;
        }

        private InvalidSession() {
            super(null);
        }

        /* renamed from: $r8$lambda$PDwkc5bec-n_aD_AF7fX1cQ52Nk, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15029$r8$lambda$PDwkc5becn_aD_AF7fX1cQ52Nk() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "InvalidSession";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getDescription", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class NetworkError extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError.Companion(null);
        private final java.lang.String description;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$NetworkError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$NetworkError$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ NetworkError(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$NetworkError$$serializer.INSTANCE.getDescriptor());
            }
            this.description = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkError(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.description);
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkError(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError) other).description);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError networkError, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkError.description;
            }
            return networkError.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$InvalidOAuthParameters;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class InvalidOAuthParameters extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$InvalidOAuthParameters$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters.m15028$r8$lambda$M_6S34BZuuXaGaMZeIcx808Z9c();
            }
        });

        public final int hashCode() {
            return -798880826;
        }

        private InvalidOAuthParameters() {
            super(null);
        }

        /* renamed from: $r8$lambda$M_6S34BZuuXaGaMZeIc-x808Z9c, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15028$r8$lambda$M_6S34BZuuXaGaMZeIcx808Z9c() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "InvalidOAuthParameters";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class ValidationFailed extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed.Companion(null);
        private final java.lang.String reason;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ValidationFailed;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$ValidationFailed$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ValidationFailed(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$ValidationFailed$$serializer.INSTANCE.getDescriptor());
            }
            this.reason = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ValidationFailed(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.reason);
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.reason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ValidationFailed(reason=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed) other).reason);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed validationFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = validationFailed.reason;
            }
            return validationFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "", "url", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class FailedToOpenPartnerUrl extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl.Companion(null);
        private final java.lang.String url;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$FailedToOpenPartnerUrl;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$FailedToOpenPartnerUrl$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FailedToOpenPartnerUrl(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$FailedToOpenPartnerUrl$$serializer.INSTANCE.getDescriptor());
            }
            this.url = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedToOpenPartnerUrl(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.url);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FailedToOpenPartnerUrl(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl) other).url);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl failedToOpenPartnerUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = failedToOpenPartnerUrl.url;
            }
            return failedToOpenPartnerUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$ConsentDeclined;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes12.dex */
    public static final /* data */ class ConsentDeclined extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$ConsentDeclined$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined.$r8$lambda$8X7BTKSQr8GtWmXUdsmTvSnPDOU();
            }
        });

        public final int hashCode() {
            return 2066667308;
        }

        private ConsentDeclined() {
            super(null);
        }

        public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$8X7BTKSQr8GtWmXUdsmTvSnPDOU() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "ConsentDeclined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError;", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getDescription", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown.Companion(null);
        private final java.lang.String description;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/partnerlinking/PartnerLinkingError$Unknown;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown> serializer() {
                return com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$Unknown$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Unknown(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$Unknown$$serializer.INSTANCE.getDescriptor());
            }
            this.description = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.description = str;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.description);
        }

        public final java.lang.String getDescription() {
            return this.description;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.description;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(description=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.description.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, ((com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown) other).description);
        }

        public final com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown copy(java.lang.String description) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
            return new com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown(description);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDescription() {
            return this.description;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown copy$default(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown unknown, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unknown.description;
            }
            return unknown.copy(str);
        }
    }

    /* renamed from: $r8$lambda$iWjOWe78O1-iOnsjzryPJzWSW8E, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m15027$r8$lambda$iWjOWe78O1iOnsjzryPJzWSW8E() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.FailedToOpenPartnerUrl.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.NetworkError.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.Unknown.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ValidationFailed.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined", com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.ConsentDeclined.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$FailedToOpenPartnerUrl$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters", com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidOAuthParameters.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession", com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError.InvalidSession.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$NetworkError$$serializer.INSTANCE, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$Unknown$$serializer.INSTANCE, com.paypal.oslo.feature.identity.api.model.partnerlinking.PartnerLinkingError$ValidationFailed$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ PartnerLinkingError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
