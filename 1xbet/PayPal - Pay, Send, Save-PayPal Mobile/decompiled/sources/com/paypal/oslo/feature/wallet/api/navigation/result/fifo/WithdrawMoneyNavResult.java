package com.paypal.oslo.feature.wallet.api.navigation.result.fifo;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004$%&#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "CancellationReason", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class WithdrawMoneyNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ WithdrawMoneyNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public WithdrawMoneyNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "", "Companion", "Success", "Error", "Cancelled", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Companion.getHighSpeedVideoFpsRanges;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "", "amountWithdrawn", "successMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getAmountWithdrawn", "getSuccessMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success.Companion(null);
            private final java.lang.String amountWithdrawn;
            private final java.lang.String successMessage;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.amountWithdrawn = str;
                this.successMessage = str2;
            }

            public Success(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.amountWithdrawn = str;
                this.successMessage = str2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.amountWithdrawn);
                output.encodeStringElement(serialDesc, 1, self.successMessage);
            }

            public final java.lang.String getAmountWithdrawn() {
                return this.amountWithdrawn;
            }

            public final java.lang.String getSuccessMessage() {
                return this.successMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.amountWithdrawn;
                java.lang.String str2 = this.successMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(amountWithdrawn=");
                sb.append(str);
                sb.append(", successMessage=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.amountWithdrawn.hashCode() * 31) + this.successMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.amountWithdrawn, success.amountWithdrawn) && kotlin.jvm.internal.Intrinsics.areEqual(this.successMessage, success.successMessage);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success copy(java.lang.String amountWithdrawn, java.lang.String successMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountWithdrawn, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(successMessage, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success(amountWithdrawn, successMessage);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getSuccessMessage() {
                return this.successMessage;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getAmountWithdrawn() {
                return this.amountWithdrawn;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Success success, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.amountWithdrawn;
                }
                if ((i & 2) != 0) {
                    str2 = success.successMessage;
                }
                return success.copy(str, str2);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "", "errorMessage", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errorCode;
            private final java.lang.String errorMessage;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.errorMessage = null;
                } else {
                    this.errorMessage = str;
                }
                if ((i & 2) == 0) {
                    this.errorCode = null;
                } else {
                    this.errorCode = str2;
                }
            }

            public Error(java.lang.String str, java.lang.String str2) {
                this.errorMessage = str;
                this.errorCode = str2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.errorMessage != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.errorMessage);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.errorCode != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.errorCode);
                }
            }

            public /* synthetic */ Error(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.String str2 = this.errorCode;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
                sb.append(str);
                sb.append(", errorCode=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                java.lang.String str = this.errorMessage;
                int hashCode = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.errorCode;
                return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error copy(java.lang.String errorMessage, java.lang.String errorCode) {
                return new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error(errorMessage, errorCode);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                if ((i & 2) != 0) {
                    str2 = error.errorCode;
                }
                return error.copy(str, str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Error() {
                this((java.lang.String) null, (java.lang.String) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "reason", "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "getReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome {
            private final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason reason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$Outcome$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Cancelled$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason cancellationReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$Outcome$Cancelled$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = cancellationReason;
            }

            public Cancelled(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason cancellationReason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
                this.reason = cancellationReason;
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason cancellationReason = this.reason;
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
                return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled) other).reason);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled copy(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome.Cancelled cancelled, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason cancellationReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    cancellationReason = cancelled.reason;
                }
                return cancelled.copy(cancellationReason);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "", "Companion", "UserNavigatedBack", "UserClosedFlow", "UserSkippedFlow", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserSkippedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface CancellationReason {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.Companion.getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow", com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack", com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow", com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserNavigatedBack;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class UserNavigatedBack implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$CancellationReason$UserNavigatedBack$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack.m20749$r8$lambda$LqBkQb_KCOhQYzUdqqmA7gsATs();
                }
            });
            public static final int $stable = 8;

            public final int hashCode() {
                return 756470265;
            }

            private UserNavigatedBack() {
            }

            /* renamed from: $r8$lambda$L-qBkQb_KCOhQYzUdqqmA7gsATs, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20749$r8$lambda$LqBkQb_KCOhQYzUdqqmA7gsATs() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "UserNavigatedBack";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserNavigatedBack)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserClosedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class UserClosedFlow implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$CancellationReason$UserClosedFlow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow.m20748$r8$lambda$4rRuFKOAA4MmmdpF5Uoi2MOVw();
                }
            });
            public static final int $stable = 8;

            public final int hashCode() {
                return 144794555;
            }

            private UserClosedFlow() {
            }

            /* renamed from: $r8$lambda$4rRuF-KOAA4MmmdpF5Uoi2MO-Vw, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20748$r8$lambda$4rRuFKOAA4MmmdpF5Uoi2MOVw() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "UserClosedFlow";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserClosedFlow)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason$UserSkippedFlow;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/fifo/WithdrawMoneyNavResult$CancellationReason;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class UserSkippedFlow implements com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult$CancellationReason$UserSkippedFlow$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow.m20750$r8$lambda$KakWVnzWUvRVAwzlTgUHkWfwaw();
                }
            });
            public static final int $stable = 8;

            public final int hashCode() {
                return -42106467;
            }

            private UserSkippedFlow() {
            }

            /* renamed from: $r8$lambda$K-akWVnzWUvRVAwzlTgUHkWfwaw, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20750$r8$lambda$KakWVnzWUvRVAwzlTgUHkWfwaw() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "UserSkippedFlow";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.CancellationReason.UserSkippedFlow)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WithdrawMoneyNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult withdrawMoneyNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.fifo.WithdrawMoneyNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = withdrawMoneyNavResult.outcome;
        }
        return withdrawMoneyNavResult.copy(outcome);
    }
}
