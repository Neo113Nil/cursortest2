package com.paypal.oslo.feature.oneonboarding.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "status", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/StatusDetails;", "statusDetails", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;Ljava/util/List;)Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Status;", "getStatus", "Ljava/util/List;", "getStatusDetails", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class OneOnboardingFlowNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.oneonboarding.api.domain.Status status;
    private final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> statusDetails;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.oneonboarding.api.domain.Status.INSTANCE.serializer();
            return serializer;
        }
    }), kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult.$r8$lambda$RDeIon3qvK8u7cUHdOi6TFKPloc();
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/result/OneOnboardingFlowNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult> serializer() {
            return com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OneOnboardingFlowNavResult(int i, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
        if ((i & 2) == 0) {
            this.statusDetails = kotlin.collections.CollectionsKt.emptyList();
        } else {
            this.statusDetails = list;
        }
    }

    public OneOnboardingFlowNavResult(com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.status = status;
        this.statusDetails = list;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$one_onboarding_api_prodRelease(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.status);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !kotlin.jvm.internal.Intrinsics.areEqual(self.statusDetails, kotlin.collections.CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.statusDetails);
        }
    }

    public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
        return this.status;
    }

    public /* synthetic */ OneOnboardingFlowNavResult(com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> getStatusDetails() {
        return this.statusDetails;
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$RDeIon3qvK8u7cUHdOi6TFKPloc() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.Status status = this.status;
        java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> list = this.statusDetails;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OneOnboardingFlowNavResult(status=");
        sb.append(status);
        sb.append(", statusDetails=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.status.hashCode() * 31) + this.statusDetails.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult = (com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult) other;
        return this.status == oneOnboardingFlowNavResult.status && kotlin.jvm.internal.Intrinsics.areEqual(this.statusDetails, oneOnboardingFlowNavResult.statusDetails);
    }

    public final com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult copy(com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> statusDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusDetails, "");
        return new com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult(status, statusDetails);
    }

    public final java.util.List<com.paypal.oslo.feature.oneonboarding.api.domain.StatusDetails> component2() {
        return this.statusDetails;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.Status getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult copy$default(com.paypal.oslo.feature.oneonboarding.api.navigation.result.OneOnboardingFlowNavResult oneOnboardingFlowNavResult, com.paypal.oslo.feature.oneonboarding.api.domain.Status status, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = oneOnboardingFlowNavResult.status;
        }
        if ((i & 2) != 0) {
            list = oneOnboardingFlowNavResult.statusDetails;
        }
        return oneOnboardingFlowNavResult.copy(status, list);
    }
}
