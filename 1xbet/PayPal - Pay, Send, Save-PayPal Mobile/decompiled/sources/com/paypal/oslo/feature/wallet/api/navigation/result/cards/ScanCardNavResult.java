package com.paypal.oslo.feature.wallet.api.navigation.result.cards;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004$%&#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "CancellationReason", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ScanCardNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ScanCardNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public ScanCardNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "", "Companion", "Success", "Error", "Cancelled", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Companion.getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "", "cardNumber", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.ExpiryDate, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCardNumber", "getExpiryDate", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success.Companion(null);
            private final java.lang.String cardNumber;
            private final java.lang.String expiryDate;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.cardNumber = str;
                this.expiryDate = str2;
            }

            public Success(java.lang.String str, java.lang.String str2) {
                this.cardNumber = str;
                this.expiryDate = str2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.cardNumber);
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.expiryDate);
            }

            public final java.lang.String getCardNumber() {
                return this.cardNumber;
            }

            public final java.lang.String getExpiryDate() {
                return this.expiryDate;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.cardNumber;
                java.lang.String str2 = this.expiryDate;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(cardNumber=");
                sb.append(str);
                sb.append(", expiryDate=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.cardNumber;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.expiryDate;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, success.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.expiryDate, success.expiryDate);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success copy(java.lang.String cardNumber, java.lang.String expiryDate) {
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success(cardNumber, expiryDate);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getExpiryDate() {
                return this.expiryDate;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getCardNumber() {
                return this.cardNumber;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Success success, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.cardNumber;
                }
                if ((i & 2) != 0) {
                    str2 = success.expiryDate;
                }
                return success.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "", "errMsg", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrMsg", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errMsg;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Error$$serializer.INSTANCE.getDescriptor());
                }
                this.errMsg = str;
            }

            public Error(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errMsg = str;
            }

            public final java.lang.String getErrMsg() {
                return this.errMsg;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errMsg;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errMsg=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errMsg.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errMsg, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error) other).errMsg);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error copy(java.lang.String errMsg) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errMsg, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error(errMsg);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrMsg() {
                return this.errMsg;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errMsg;
                }
                return error.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "getReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason reason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$Outcome$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Cancelled$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason cancellationReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$Outcome$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = cancellationReason;
            }

            public Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason cancellationReason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
                this.reason = cancellationReason;
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason cancellationReason = this.reason;
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
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled) other).reason);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome.Cancelled cancelled, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason cancellationReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cancellationReason = cancelled.reason;
                }
                return cancelled.copy(cancellationReason);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "", "Companion", "UserNavigatedBack", "UserClosedTheScanner", "UserNavigatedToManualEntry", "UserNavigatedToVerifyWithBank", "CameraPermissionDenied", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$CameraPermissionDenied;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserClosedTheScanner;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedToManualEntry;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedToVerifyWithBank;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface CancellationReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied", com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner", com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack", com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry", com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank", com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserNavigatedBack implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$CancellationReason$UserNavigatedBack$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack.$r8$lambda$tptqgKrhTZUu2FnUlr70YqaloZc();
                }
            });
            public static final int $stable = 8;

            private UserNavigatedBack() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$tptqgKrhTZUu2FnUlr70YqaloZc() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedBack> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserClosedTheScanner;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserClosedTheScanner implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$CancellationReason$UserClosedTheScanner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner.m20738$r8$lambda$NZm96zUwngMs3DMPOQWkzZFtqY();
                }
            });
            public static final int $stable = 8;

            private UserClosedTheScanner() {
            }

            /* renamed from: $r8$lambda$NZ-m96zUwngMs3DMPOQWkzZFtqY, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20738$r8$lambda$NZm96zUwngMs3DMPOQWkzZFtqY() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserClosedTheScanner> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedToManualEntry;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserNavigatedToManualEntry implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$CancellationReason$UserNavigatedToManualEntry$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry.m20739$r8$lambda$FBHFkRTfZl7loxZ9J1j0O86ouk();
                }
            });
            public static final int $stable = 8;

            private UserNavigatedToManualEntry() {
            }

            /* renamed from: $r8$lambda$FBHFkRTfZl-7loxZ9J1j0O86ouk, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20739$r8$lambda$FBHFkRTfZl7loxZ9J1j0O86ouk() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToManualEntry> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$UserNavigatedToVerifyWithBank;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class UserNavigatedToVerifyWithBank implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$CancellationReason$UserNavigatedToVerifyWithBank$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank.$r8$lambda$J6Ta8wOX2avdpZXrnMzwMUAmr_c();
                }
            });
            public static final int $stable = 8;

            private UserNavigatedToVerifyWithBank() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$J6Ta8wOX2avdpZXrnMzwMUAmr_c() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.UserNavigatedToVerifyWithBank> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason$CameraPermissionDenied;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/cards/ScanCardNavResult$CancellationReason;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final class CameraPermissionDenied implements com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult$CancellationReason$CameraPermissionDenied$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied.m20737$r8$lambda$qDLN0VacqPeOW97F_k9TqvnM4();
                }
            });
            public static final int $stable = 8;

            private CameraPermissionDenied() {
            }

            /* renamed from: $r8$lambda$qDLN0-VacqPeOW97F_k9-TqvnM4, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20737$r8$lambda$qDLN0VacqPeOW97F_k9TqvnM4() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.CancellationReason.CameraPermissionDenied> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ScanCardNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult scanCardNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.cards.ScanCardNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = scanCardNavResult.outcome;
        }
        return scanCardNavResult.copy(outcome);
    }
}
