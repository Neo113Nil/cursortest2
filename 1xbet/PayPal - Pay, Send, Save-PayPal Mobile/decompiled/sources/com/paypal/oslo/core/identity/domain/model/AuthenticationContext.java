package com.paypal.oslo.core.identity.domain.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "authenticationState", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "authenticationFlowInfo", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "component2", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;)Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_release", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationState;", "getAuthenticationState", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationFlowInfo;", "getAuthenticationFlowInfo", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AuthenticationContext {
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo;
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.identity.domain.model.AuthenticationContext.Companion INSTANCE = new com.paypal.oslo.core.identity.domain.model.AuthenticationContext.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.core.identity.domain.model.AuthenticationContext$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.core.identity.domain.model.AuthenticationState.INSTANCE.serializer();
            return serializer;
        }
    }), null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.core.identity.domain.model.AuthenticationContext> serializer() {
            return com.paypal.oslo.core.identity.domain.model.AuthenticationContext$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AuthenticationContext(int i, com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.core.identity.domain.model.AuthenticationContext$$serializer.INSTANCE.getDescriptor());
        }
        this.authenticationState = authenticationState;
        this.authenticationFlowInfo = authenticationFlowInfo;
    }

    public AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowInfo, "");
        this.authenticationState = authenticationState;
        this.authenticationFlowInfo = authenticationFlowInfo;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_release(com.paypal.oslo.core.identity.domain.model.AuthenticationContext self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.authenticationState);
        output.encodeSerializableElement(serialDesc, 1, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo$$serializer.INSTANCE, self.authenticationFlowInfo);
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationState getAuthenticationState() {
        return this.authenticationState;
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo getAuthenticationFlowInfo() {
        return this.authenticationFlowInfo;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState = this.authenticationState;
        com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo = this.authenticationFlowInfo;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationContext(authenticationState=");
        sb.append(authenticationState);
        sb.append(", authenticationFlowInfo=");
        sb.append(authenticationFlowInfo);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.authenticationState.hashCode() * 31) + this.authenticationFlowInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.identity.domain.model.AuthenticationContext)) {
            return false;
        }
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = (com.paypal.oslo.core.identity.domain.model.AuthenticationContext) other;
        return this.authenticationState == authenticationContext.authenticationState && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationFlowInfo, authenticationContext.authenticationFlowInfo);
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext copy(com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationFlowInfo, "");
        return new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(authenticationState, authenticationFlowInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo getAuthenticationFlowInfo() {
        return this.authenticationFlowInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationState getAuthenticationState() {
        return this.authenticationState;
    }

    public static /* synthetic */ com.paypal.oslo.core.identity.domain.model.AuthenticationContext copy$default(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.core.identity.domain.model.AuthenticationState authenticationState, com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo authenticationFlowInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationState = authenticationContext.authenticationState;
        }
        if ((i & 2) != 0) {
            authenticationFlowInfo = authenticationContext.authenticationFlowInfo;
        }
        return authenticationContext.copy(authenticationState, authenticationFlowInfo);
    }
}
