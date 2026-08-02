package com.paypal.oslo.feature.wallet.api.navigation.result.preferred;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PaymentPreferenceNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PaymentPreferenceNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public PaymentPreferenceNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "", "Companion", "Cancelled", "Error", "Success", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Companion.Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "getReason", "Companion", "Reason", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = reason;
            }

            public Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                this.reason = reason;
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason getReason() {
                return this.reason;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "", "Companion", "Closed", "NavigatedBack", "Skipped", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Closed;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$NavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Skipped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            @kotlinx.serialization.Serializable
            public interface Reason {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Companion.Camera2StreamConfigurationMap;

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                /* loaded from: classes15.dex */
                public static final class Companion {
                    static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Companion();

                    private Companion() {
                    }

                    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason> serializer() {
                        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed", com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack", com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped", com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
                    }
                }

                @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Closed;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                /* loaded from: classes15.dex */
                public static final /* data */ class Closed implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason {
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed();
                    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Closed$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed.m20751$r8$lambda$Eu1ET7vTbyXtTbtiYC8oD_lN8();
                        }
                    });
                    public static final int $stable = 8;

                    public final int hashCode() {
                        return 972339114;
                    }

                    private Closed() {
                    }

                    /* renamed from: $r8$lambda$Eu-1ET7vTby-XtTbtiYC8oD_lN8, reason: not valid java name */
                    public static /* synthetic */ kotlinx.serialization.KSerializer m20751$r8$lambda$Eu1ET7vTbyXtTbtiYC8oD_lN8() {
                        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed", INSTANCE, new java.lang.annotation.Annotation[0]);
                    }

                    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed> serializer() {
                        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
                    }

                    public final java.lang.String toString() {
                        return "Closed";
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Closed)) {
                            return false;
                        }
                        return true;
                    }
                }

                @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$NavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                /* loaded from: classes15.dex */
                public static final /* data */ class NavigatedBack implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason {
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack();
                    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$Reason$NavigatedBack$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack.m20752$r8$lambda$hPxb4PvOMSPJAKptdvHoJN5NP4();
                        }
                    });
                    public static final int $stable = 8;

                    public final int hashCode() {
                        return 1807427740;
                    }

                    private NavigatedBack() {
                    }

                    /* renamed from: $r8$lambda$h-Pxb4PvOMSPJAKptdvHoJN5NP4, reason: not valid java name */
                    public static /* synthetic */ kotlinx.serialization.KSerializer m20752$r8$lambda$hPxb4PvOMSPJAKptdvHoJN5NP4() {
                        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack", INSTANCE, new java.lang.annotation.Annotation[0]);
                    }

                    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack> serializer() {
                        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
                    }

                    public final java.lang.String toString() {
                        return "NavigatedBack";
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.NavigatedBack)) {
                            return false;
                        }
                        return true;
                    }
                }

                @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Skipped;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Cancelled$Reason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                /* loaded from: classes15.dex */
                public static final /* data */ class Skipped implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason {
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped();
                    private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Cancelled$Reason$Skipped$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped.$r8$lambda$q8EBz4lRCT0GGLtyiIiGsN84o7w();
                        }
                    });
                    public static final int $stable = 8;

                    public final int hashCode() {
                        return 1358649522;
                    }

                    private Skipped() {
                    }

                    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$q8EBz4lRCT0GGLtyiIiGsN84o7w() {
                        return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped", INSTANCE, new java.lang.annotation.Annotation[0]);
                    }

                    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped> serializer() {
                        return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
                    }

                    public final java.lang.String toString() {
                        return "Skipped";
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason.Skipped)) {
                            return false;
                        }
                        return true;
                    }
                }
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(reason=");
                sb.append(reason);
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
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled) other).reason);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled copy(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled cancelled, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Cancelled.Reason reason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    reason = cancelled.reason;
                }
                return cancelled.copy(reason);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errorMessage;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.errorMessage = null;
                } else {
                    this.errorMessage = str;
                }
            }

            public Error(java.lang.String str) {
                this.errorMessage = str;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.errorMessage != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.errorMessage);
                }
            }

            public /* synthetic */ Error(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorMessage;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error) other).errorMessage);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error copy(java.lang.String errorMessage) {
                return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error(errorMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                return error.copy(str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this((java.lang.String) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "preferredInstrument", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "getPreferredInstrument", "Companion", "PreferredInstrument", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.preferredInstrument = preferredInstrument;
            }

            public Success(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredInstrument, "");
                this.preferredInstrument = preferredInstrument;
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument getPreferredInstrument() {
                return this.preferredInstrument;
            }

            @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00062\u00020\u0001:\u0004\u0007\b\t\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "Companion", com.discover.mpos.sdk.core.ConstantsKt.BALANCE_OUTCOME_QUALIFIER, com.paypal.oslo.feature.bnplacquisition.ui.common.components.PlanCardTestTag.CARD, "Bank", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            @kotlinx.serialization.Serializable
            public interface PreferredInstrument {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Companion.getHighSpeedVideoFpsRangesFor;

                java.lang.String getDisplayName();

                @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                /* loaded from: classes15.dex */
                public static final class Companion {
                    static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Companion();

                    private Companion() {
                    }

                    public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument> serializer() {
                        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "", "id", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "getDisplayName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class Balance implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument {
                    public static final int $stable = 0;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance.Companion(null);
                    private final java.lang.String displayName;
                    private final java.lang.String id;

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    /* loaded from: classes15.dex */
                    public static final class Companion {
                        private Companion() {
                        }

                        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance> serializer() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance$$serializer.INSTANCE;
                        }

                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ Balance(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Balance$$serializer.INSTANCE.getDescriptor());
                        }
                        this.id = str;
                        this.displayName = str2;
                    }

                    public Balance(java.lang.String str, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        this.id = str;
                        this.displayName = str2;
                    }

                    @kotlin.jvm.JvmStatic
                    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        output.encodeStringElement(serialDesc, 0, self.id);
                        output.encodeStringElement(serialDesc, 1, self.getDisplayName());
                    }

                    public final java.lang.String getId() {
                        return this.id;
                    }

                    @Override // com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    public final java.lang.String toString() {
                        java.lang.String str = this.id;
                        java.lang.String str2 = this.displayName;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Balance(id=");
                        sb.append(str);
                        sb.append(", displayName=");
                        sb.append(str2);
                        sb.append(")");
                        return sb.toString();
                    }

                    public final int hashCode() {
                        return (this.id.hashCode() * 31) + this.displayName.hashCode();
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance)) {
                            return false;
                        }
                        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance balance = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance) other;
                        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, balance.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, balance.displayName);
                    }

                    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance copy(java.lang.String id, java.lang.String displayName) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
                        return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance(id, displayName);
                    }

                    /* renamed from: component2, reason: from getter */
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    /* renamed from: component1, reason: from getter */
                    public final java.lang.String getId() {
                        return this.id;
                    }

                    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Balance balance, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                        if ((i & 1) != 0) {
                            str = balance.id;
                        }
                        if ((i & 2) != 0) {
                            str2 = balance.displayName;
                        }
                        return balance.copy(str, str2);
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "card", "", "displayName", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "getCard", "Ljava/lang/String;", "getDisplayName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class Card implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument {
                    private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card;
                    private final java.lang.String displayName;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card.Companion(null);
                    public static final int $stable = 8;

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    /* loaded from: classes15.dex */
                    public static final class Companion {
                        private Companion() {
                        }

                        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card> serializer() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card$$serializer.INSTANCE;
                        }

                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ Card(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Card$$serializer.INSTANCE.getDescriptor());
                        }
                        this.card = card;
                        this.displayName = str;
                    }

                    public Card(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        this.card = card;
                        this.displayName = str;
                    }

                    @kotlin.jvm.JvmStatic
                    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card$$serializer.INSTANCE, self.card);
                        output.encodeStringElement(serialDesc, 1, self.getDisplayName());
                    }

                    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card getCard() {
                        return this.card;
                    }

                    @Override // com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    public final java.lang.String toString() {
                        com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card = this.card;
                        java.lang.String str = this.displayName;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Card(card=");
                        sb.append(card);
                        sb.append(", displayName=");
                        sb.append(str);
                        sb.append(")");
                        return sb.toString();
                    }

                    public final int hashCode() {
                        return (this.card.hashCode() * 31) + this.displayName.hashCode();
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card)) {
                            return false;
                        }
                        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card card = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card) other;
                        return kotlin.jvm.internal.Intrinsics.areEqual(this.card, card.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, card.displayName);
                    }

                    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String displayName) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
                        return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card(card, displayName);
                    }

                    /* renamed from: component2, reason: from getter */
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    /* renamed from: component1, reason: from getter */
                    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card getCard() {
                        return this.card;
                    }

                    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Card card, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card2, java.lang.String str, int i, java.lang.Object obj) {
                        if ((i & 1) != 0) {
                            card2 = card.card;
                        }
                        if ((i & 2) != 0) {
                            str = card.displayName;
                        }
                        return card.copy(card2, str);
                    }
                }

                @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument;", "", "accountId", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAccountId", "getDisplayName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @kotlinx.serialization.Serializable
                public static final /* data */ class Bank implements com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument {
                    public static final int $stable = 0;

                    /* renamed from: Companion, reason: from kotlin metadata */
                    public static final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank.Companion(null);
                    private final java.lang.String accountId;
                    private final java.lang.String displayName;

                    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/preferred/PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
                    /* loaded from: classes15.dex */
                    public static final class Companion {
                        private Companion() {
                        }

                        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank> serializer() {
                            return com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank$$serializer.INSTANCE;
                        }

                        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }
                    }

                    public /* synthetic */ Bank(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                        if (3 != (i & 3)) {
                            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult$Outcome$Success$PreferredInstrument$Bank$$serializer.INSTANCE.getDescriptor());
                        }
                        this.accountId = str;
                        this.displayName = str2;
                    }

                    public Bank(java.lang.String str, java.lang.String str2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                        this.accountId = str;
                        this.displayName = str2;
                    }

                    @kotlin.jvm.JvmStatic
                    public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                        output.encodeStringElement(serialDesc, 0, self.accountId);
                        output.encodeStringElement(serialDesc, 1, self.getDisplayName());
                    }

                    public final java.lang.String getAccountId() {
                        return this.accountId;
                    }

                    @Override // com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    public final java.lang.String toString() {
                        java.lang.String str = this.accountId;
                        java.lang.String str2 = this.displayName;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Bank(accountId=");
                        sb.append(str);
                        sb.append(", displayName=");
                        sb.append(str2);
                        sb.append(")");
                        return sb.toString();
                    }

                    public final int hashCode() {
                        return (this.accountId.hashCode() * 31) + this.displayName.hashCode();
                    }

                    public final boolean equals(java.lang.Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank)) {
                            return false;
                        }
                        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank bank = (com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank) other;
                        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountId, bank.accountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, bank.displayName);
                    }

                    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank copy(java.lang.String accountId, java.lang.String displayName) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountId, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
                        return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank(accountId, displayName);
                    }

                    /* renamed from: component2, reason: from getter */
                    public final java.lang.String getDisplayName() {
                        return this.displayName;
                    }

                    /* renamed from: component1, reason: from getter */
                    public final java.lang.String getAccountId() {
                        return this.accountId;
                    }

                    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument.Bank bank, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                        if ((i & 1) != 0) {
                            str = bank.accountId;
                        }
                        if ((i & 2) != 0) {
                            str2 = bank.displayName;
                        }
                        return bank.copy(str, str2);
                    }
                }
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument = this.preferredInstrument;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(preferredInstrument=");
                sb.append(preferredInstrument);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.preferredInstrument.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferredInstrument, ((com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success) other).preferredInstrument);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success copy(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preferredInstrument, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success(preferredInstrument);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument getPreferredInstrument() {
                return this.preferredInstrument;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success success, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome.Success.PreferredInstrument preferredInstrument, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    preferredInstrument = success.preferredInstrument;
                }
                return success.copy(preferredInstrument);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentPreferenceNavResult(outcome=");
        sb.append(outcome);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.outcome.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult paymentPreferenceNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.preferred.PaymentPreferenceNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = paymentPreferenceNavResult.outcome;
        }
        return paymentPreferenceNavResult.copy(outcome);
    }
}
