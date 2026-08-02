package com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;", "resultKey", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;)Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/ResultKey;", "getResultKey", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentCanceledNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey", com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/result/PaymentCanceledNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentCanceledNavResult(int i, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.resultKey = com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.NONE;
        } else {
            this.resultKey = resultKey;
        }
    }

    public PaymentCanceledNavResult(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultKey, "");
        this.resultKey = resultKey;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.resultKey != com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.NONE) {
            output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.resultKey);
        }
    }

    public /* synthetic */ PaymentCanceledNavResult(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey.NONE : resultKey);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey getResultKey() {
        return this.resultKey;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey = this.resultKey;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentCanceledNavResult(resultKey=");
        sb.append(resultKey);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.resultKey.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult) && this.resultKey == ((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult) other).resultKey;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult copy(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resultKey, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult(resultKey);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey getResultKey() {
        return this.resultKey;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult copy$default(com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.PaymentCanceledNavResult paymentCanceledNavResult, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey resultKey, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            resultKey = paymentCanceledNavResult.resultKey;
        }
        return paymentCanceledNavResult.copy(resultKey);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentCanceledNavResult() {
        this((com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.result.ResultKey) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
