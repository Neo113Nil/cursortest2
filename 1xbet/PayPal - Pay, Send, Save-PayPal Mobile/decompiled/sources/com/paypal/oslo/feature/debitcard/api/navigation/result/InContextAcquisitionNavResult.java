package com.paypal.oslo.feature.debitcard.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class InContextAcquisitionNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult> serializer() {
            return com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InContextAcquisitionNavResult(int i, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public InContextAcquisitionNavResult(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "", "Companion", "Success", "Failure", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Companion.getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Failure$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "debitCardData", "", "progressValue", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "getDebitCardData", "Ljava/lang/Integer;", "getProgressValue", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success.Companion(null);
            private final com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData;
            private final java.lang.Integer progressValue;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.Integer num, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.debitCardData = debitCardData;
                if ((i & 2) == 0) {
                    this.progressValue = null;
                } else {
                    this.progressValue = num;
                }
            }

            public Success(com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.Integer num) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardData, "");
                this.debitCardData = debitCardData;
                this.progressValue = num;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$debit_card_api_prodRelease(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.debitcard.api.model.DebitCardData$$serializer.INSTANCE, self.debitCardData);
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.progressValue != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.progressValue);
                }
            }

            public /* synthetic */ Success(com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(debitCardData, (i & 2) != 0 ? null : num);
            }

            public final com.paypal.oslo.feature.debitcard.api.model.DebitCardData getDebitCardData() {
                return this.debitCardData;
            }

            public final java.lang.Integer getProgressValue() {
                return this.progressValue;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData = this.debitCardData;
                java.lang.Integer num = this.progressValue;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(debitCardData=");
                sb.append(debitCardData);
                sb.append(", progressValue=");
                sb.append(num);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.debitCardData.hashCode();
                java.lang.Integer num = this.progressValue;
                return (hashCode * 31) + (num == null ? 0 : num.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success success = (com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardData, success.debitCardData) && kotlin.jvm.internal.Intrinsics.areEqual(this.progressValue, success.progressValue);
            }

            public final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.Integer progressValue) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardData, "");
                return new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success(debitCardData, progressValue);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.Integer getProgressValue() {
                return this.progressValue;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.debitcard.api.model.DebitCardData getDebitCardData() {
                return this.debitCardData;
            }

            public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Success success, com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.Integer num, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    debitCardData = success.debitCardData;
                }
                if ((i & 2) != 0) {
                    num = success.progressValue;
                }
                return success.copy(debitCardData, num);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "failureReason", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "getFailureReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Failure implements com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome {
            private final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Failure$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/InContextAcquisitionNavResult$Outcome$Failure;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure> serializer() {
                    return com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Failure$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Failure(int i, com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult$Outcome$Failure$$serializer.INSTANCE.getDescriptor());
                }
                this.failureReason = failureReason;
            }

            public Failure(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                this.failureReason = failureReason;
            }

            public final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason getFailureReason() {
                return this.failureReason;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason = this.failureReason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(failureReason=");
                sb.append(failureReason);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.failureReason.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.failureReason, ((com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure) other).failureReason);
            }

            public final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure copy(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failureReason, "");
                return new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure(failureReason);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason getFailureReason() {
                return this.failureReason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure copy$default(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome.Failure failure, com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason failureReason, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    failureReason = failure.failureReason;
                }
                return failure.copy(failureReason);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InContextAcquisitionNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult copy(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult copy$default(com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult inContextAcquisitionNavResult, com.paypal.oslo.feature.debitcard.api.navigation.result.InContextAcquisitionNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = inContextAcquisitionNavResult.outcome;
        }
        return inContextAcquisitionNavResult.copy(outcome);
    }
}
