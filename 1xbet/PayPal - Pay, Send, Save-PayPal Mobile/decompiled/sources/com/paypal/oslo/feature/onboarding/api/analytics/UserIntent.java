package com.paypal.oslo.feature.onboarding.api.analytics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;", "", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "product", "", "feature", "action", "<init>", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/core/telemetry/analytics/schema/Product;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/core/telemetry/analytics/schema/Product;", "getProduct", "Ljava/lang/String;", "getFeature", "getAction", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class UserIntent {
    private final java.lang.String action;
    private final java.lang.String feature;
    private final com.paypal.oslo.core.telemetry.analytics.schema.Product product;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.api.analytics.UserIntent.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.api.analytics.UserIntent.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.core.telemetry.analytics.schema.Product", com.paypal.oslo.core.telemetry.analytics.schema.Product.values());
            return createSimpleEnumSerializer;
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/onboarding/api/analytics/UserIntent;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.onboarding.api.analytics.UserIntent> serializer() {
            return com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ UserIntent(int i, com.paypal.oslo.core.telemetry.analytics.schema.Product product, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.onboarding.api.analytics.UserIntent$$serializer.INSTANCE.getDescriptor());
        }
        this.product = product;
        this.feature = str;
        this.action = str2;
    }

    public UserIntent(com.paypal.oslo.core.telemetry.analytics.schema.Product product, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.product = product;
        this.feature = str;
        this.action = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$onboarding_api_prodRelease(com.paypal.oslo.feature.onboarding.api.analytics.UserIntent self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.product);
        output.encodeStringElement(serialDesc, 1, self.feature);
        output.encodeStringElement(serialDesc, 2, self.action);
    }

    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getProduct() {
        return this.product;
    }

    public final java.lang.String getFeature() {
        return this.feature;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.core.telemetry.analytics.schema.Product product = this.product;
        java.lang.String str = this.feature;
        java.lang.String str2 = this.action;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserIntent(product=");
        sb.append(product);
        sb.append(", feature=");
        sb.append(str);
        sb.append(", action=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.product.hashCode() * 31) + this.feature.hashCode()) * 31) + this.action.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.api.analytics.UserIntent)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent = (com.paypal.oslo.feature.onboarding.api.analytics.UserIntent) other;
        return this.product == userIntent.product && kotlin.jvm.internal.Intrinsics.areEqual(this.feature, userIntent.feature) && kotlin.jvm.internal.Intrinsics.areEqual(this.action, userIntent.action);
    }

    public final com.paypal.oslo.feature.onboarding.api.analytics.UserIntent copy(com.paypal.oslo.core.telemetry.analytics.schema.Product product, java.lang.String feature, java.lang.String action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(product, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        return new com.paypal.oslo.feature.onboarding.api.analytics.UserIntent(product, feature, action);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFeature() {
        return this.feature;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.core.telemetry.analytics.schema.Product getProduct() {
        return this.product;
    }

    public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.analytics.UserIntent copy$default(com.paypal.oslo.feature.onboarding.api.analytics.UserIntent userIntent, com.paypal.oslo.core.telemetry.analytics.schema.Product product, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            product = userIntent.product;
        }
        if ((i & 2) != 0) {
            str = userIntent.feature;
        }
        if ((i & 4) != 0) {
            str2 = userIntent.action;
        }
        return userIntent.copy(product, str, str2);
    }
}
