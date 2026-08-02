package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000eR\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "authenticationContext", "Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;", "checkoutInputData", "<init>", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "component2", "()Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;", "copy", "(Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;)Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/identity/domain/model/AuthenticationContext;", "getAuthenticationContext", "Lcom/paypal/oslo/feature/identity/api/CheckoutInputData;", "getCheckoutInputData", "getCheckoutInputData$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CheckoutAuthenticationContext {
    private final com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext;
    private final com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext.$r8$lambda$cOG9pJWxZzxyDFE0AZgfW7QOVd8();
        }
    })};

    public static /* synthetic */ void getCheckoutInputData$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationContext;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext> serializer() {
            return com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutAuthenticationContext(int i, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext$$serializer.INSTANCE.getDescriptor());
        }
        this.authenticationContext = authenticationContext;
        this.checkoutInputData = checkoutInputData;
    }

    public CheckoutAuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputData, "");
        this.authenticationContext = authenticationContext;
        this.checkoutInputData = checkoutInputData;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.core.identity.domain.model.AuthenticationContext$$serializer.INSTANCE, self.authenticationContext);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.checkoutInputData);
    }

    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public final com.paypal.oslo.feature.identity.api.CheckoutInputData getCheckoutInputData() {
        return this.checkoutInputData;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$cOG9pJWxZzxyDFE0AZgfW7QOVd8() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.CheckoutInputData.class), null, new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext = this.authenticationContext;
        com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData = this.checkoutInputData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutAuthenticationContext(authenticationContext=");
        sb.append(authenticationContext);
        sb.append(", checkoutInputData=");
        sb.append(checkoutInputData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.authenticationContext.hashCode() * 31) + this.checkoutInputData.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationContext, checkoutAuthenticationContext.authenticationContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutInputData, checkoutAuthenticationContext.checkoutInputData);
    }

    public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext copy(com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutInputData, "");
        return new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext(authenticationContext, checkoutInputData);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.CheckoutInputData getCheckoutInputData() {
        return this.checkoutInputData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.identity.domain.model.AuthenticationContext getAuthenticationContext() {
        return this.authenticationContext;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext copy$default(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationContext checkoutAuthenticationContext, com.paypal.oslo.core.identity.domain.model.AuthenticationContext authenticationContext, com.paypal.oslo.feature.identity.api.CheckoutInputData checkoutInputData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            authenticationContext = checkoutAuthenticationContext.authenticationContext;
        }
        if ((i & 2) != 0) {
            checkoutInputData = checkoutAuthenticationContext.checkoutInputData;
        }
        return checkoutAuthenticationContext.copy(authenticationContext, checkoutInputData);
    }
}
