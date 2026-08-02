package com.paypal.oslo.feature.oneonboarding.api.navigation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingFlowDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingDestination;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "intentId", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "copy", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingFlowDestination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$one_onboarding_api_prodRelease", "(Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingFlowDestination;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "getIntentId", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class OneOnboardingFlowDestination implements com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination {
    private final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination.Companion INSTANCE = new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingFlowDestination$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/oneonboarding/api/navigation/OneOnboardingFlowDestination;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination> serializer() {
            return com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OneOnboardingFlowDestination(int i, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination$$serializer.INSTANCE.getDescriptor());
        }
        this.intentId = intentId;
    }

    public OneOnboardingFlowDestination(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        this.intentId = intentId;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingDestination
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId = this.intentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OneOnboardingFlowDestination(intentId=");
        sb.append(intentId);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.intentId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination) && kotlin.jvm.internal.Intrinsics.areEqual(this.intentId, ((com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination) other).intentId);
    }

    public final com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination copy(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        return new com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination(intentId);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId getIntentId() {
        return this.intentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination copy$default(com.paypal.oslo.feature.oneonboarding.api.navigation.OneOnboardingFlowDestination oneOnboardingFlowDestination, com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intentId = oneOnboardingFlowDestination.intentId;
        }
        return oneOnboardingFlowDestination.copy(intentId);
    }
}
