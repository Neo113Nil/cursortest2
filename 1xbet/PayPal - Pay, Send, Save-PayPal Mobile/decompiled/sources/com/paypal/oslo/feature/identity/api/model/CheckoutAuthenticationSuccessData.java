package com.paypal.oslo.feature.identity.api.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "", "", com.paypal.oslo.feature.identity.merchantonboarding.MerchantOnboardingExtensionsKt.KeyAuthCodeParam, "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "checkoutData", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;)Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAuthCode", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutData;", "getCheckoutData", "getCheckoutData$annotations", "()V", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CheckoutAuthenticationSuccessData {
    private final java.lang.String authCode;
    private final com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData.$r8$lambda$hSkT6eB0LqGUizB7UM8a3Xrsfhw();
        }
    })};

    public static /* synthetic */ void getCheckoutData$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/model/CheckoutAuthenticationSuccessData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData> serializer() {
            return com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CheckoutAuthenticationSuccessData(int i, java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.authCode = null;
        } else {
            this.authCode = str;
        }
        if ((i & 2) == 0) {
            this.checkoutData = null;
        } else {
            this.checkoutData = checkoutData;
        }
    }

    public CheckoutAuthenticationSuccessData(java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData) {
        this.authCode = str;
        this.checkoutData = checkoutData;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.authCode != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.authCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.checkoutData != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.checkoutData);
        }
    }

    public /* synthetic */ CheckoutAuthenticationSuccessData(java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : checkoutData);
    }

    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public final com.paypal.oslo.feature.identity.api.model.CheckoutData getCheckoutData() {
        return this.checkoutData;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$hSkT6eB0LqGUizB7UM8a3Xrsfhw() {
        return new kotlinx.serialization.ContextualSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.model.CheckoutData.class), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.paypal.oslo.feature.identity.api.model.CheckoutData$$serializer.INSTANCE), new kotlinx.serialization.KSerializer[0]);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.authCode;
        com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData = this.checkoutData;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CheckoutAuthenticationSuccessData(authCode=");
        sb.append(str);
        sb.append(", checkoutData=");
        sb.append(checkoutData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.authCode;
        int hashCode = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData = this.checkoutData;
        return (hashCode * 31) + (checkoutData != null ? checkoutData.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData)) {
            return false;
        }
        com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData = (com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.authCode, checkoutAuthenticationSuccessData.authCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkoutData, checkoutAuthenticationSuccessData.checkoutData);
    }

    public final com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData copy(java.lang.String authCode, com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData) {
        return new com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData(authCode, checkoutData);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.model.CheckoutData getCheckoutData() {
        return this.checkoutData;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAuthCode() {
        return this.authCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData copy$default(com.paypal.oslo.feature.identity.api.model.CheckoutAuthenticationSuccessData checkoutAuthenticationSuccessData, java.lang.String str, com.paypal.oslo.feature.identity.api.model.CheckoutData checkoutData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = checkoutAuthenticationSuccessData.authCode;
        }
        if ((i & 2) != 0) {
            checkoutData = checkoutAuthenticationSuccessData.checkoutData;
        }
        return checkoutAuthenticationSuccessData.copy(str, checkoutData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutAuthenticationSuccessData() {
        this((java.lang.String) null, (com.paypal.oslo.feature.identity.api.model.CheckoutData) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
