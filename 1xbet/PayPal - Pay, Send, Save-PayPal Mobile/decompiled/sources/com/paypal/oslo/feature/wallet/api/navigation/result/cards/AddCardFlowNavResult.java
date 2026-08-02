package com.paypal.oslo.feature.wallet.api.navigation.result.cards;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004$%&#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "CancellationReason", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AddCardFlowNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AddCardFlowNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public AddCardFlowNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "", "Companion", "Success", "Error", "Cancelled", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "card", "", "successMessage", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/Card;", "getCard", "Ljava/lang/String;", "getSuccessMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card;
            private final java.lang.String successMessage;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success.Companion(null);
            public static final int $stable = 8;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.card = card;
                this.successMessage = str;
            }

            public Success(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.card = card;
                this.successMessage = str;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card$$serializer.INSTANCE, self.card);
                output.encodeStringElement(serialDesc, 1, self.successMessage);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card getCard() {
                return this.card;
            }

            public final java.lang.String getSuccessMessage() {
                return this.successMessage;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card = this.card;
                java.lang.String str = this.successMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(card=");
                sb.append(card);
                sb.append(", successMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.card.hashCode() * 31) + this.successMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.card, success.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.successMessage, success.successMessage);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String successMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successMessage, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success(card, successMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSuccessMessage() {
                return this.successMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card getCard() {
                return this.card;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Success success, com.paypal.oslo.feature.wallet.api.navigation.result.cards.Card card, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    card = success.card;
                }
                if ((i & 2) != 0) {
                    str = success.successMessage;
                }
                return success.copy(card, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "", "errorMsg", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorMsg", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errorMsg;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Error$$serializer.INSTANCE.getDescriptor());
                }
                this.errorMsg = str;
            }

            public Error(java.lang.String str) {
                this.errorMsg = str;
            }

            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMsg;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMsg=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorMsg;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMsg, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error) other).errorMsg);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error copy(java.lang.String errorMsg) {
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error(errorMsg);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMsg;
                }
                return error.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "getReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason reason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$Outcome$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Cancelled$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason cancellationReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$Outcome$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = cancellationReason;
            }

            public Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason cancellationReason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
                this.reason = cancellationReason;
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason cancellationReason = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(reason=");
                sb.append(cancellationReason);
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
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled) other).reason);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome.Cancelled cancelled, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason cancellationReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cancellationReason = cancelled.reason;
                }
                return cancelled.copy(cancellationReason);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "", "Companion", "UserNavigatedBack", "UserClosedFlow", "UserSkippedFlow", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserSkippedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface CancellationReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.Companion.getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow", com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack", com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow", com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserNavigatedBack implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$CancellationReason$UserNavigatedBack$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack.$r8$lambda$C3oa7JrkY1zBUj3BhPQsfboHOm0();
                }
            });
            public static final int $stable = 8;

            private UserNavigatedBack() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$C3oa7JrkY1zBUj3BhPQsfboHOm0() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserNavigatedBack> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserClosedFlow implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$CancellationReason$UserClosedFlow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow.$r8$lambda$_YMlm05kjVIRcNMVpC3dLiSy2z0();
                }
            });
            public static final int $stable = 8;

            private UserClosedFlow() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$_YMlm05kjVIRcNMVpC3dLiSy2z0() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserClosedFlow> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason$UserSkippedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/AddCardFlowNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserSkippedFlow implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult$CancellationReason$UserSkippedFlow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow.$r8$lambda$jYICCOiWTp8tGLegqSSuxhZzpe8();
                }
            });
            public static final int $stable = 8;

            private UserSkippedFlow() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$jYICCOiWTp8tGLegqSSuxhZzpe8() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.CancellationReason.UserSkippedFlow> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddCardFlowNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult addCardFlowNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.cards.AddCardFlowNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = addCardFlowNavResult.outcome;
        }
        return addCardFlowNavResult.copy(outcome);
    }
}
