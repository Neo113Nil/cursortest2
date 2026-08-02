package com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class AmexAndP3LinkingFlowNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AmexAndP3LinkingFlowNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public AmexAndP3LinkingFlowNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "", "Companion", "Success", "Error", "Cancelled", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Companion.getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled", com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0011J'\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "linkedInstruments", "", "partnerLink", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getLinkedInstruments", "Ljava/lang/String;", "getPartnerLink", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome {
            private final java.util.List<com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> linkedInstruments;
            private final java.lang.String partnerLink;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Success$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success.m20731$r8$lambda$rxQcmA7pNuLHnECGJPiDUxJle4();
                }
            }), null};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, java.util.List list, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.linkedInstruments = list;
                if ((i & 2) == 0) {
                    this.partnerLink = null;
                } else {
                    this.partnerLink = str;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Success(java.util.List<? extends com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> list, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.linkedInstruments = list;
                this.partnerLink = str;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.linkedInstruments);
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.partnerLink != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.partnerLink);
                }
            }

            public /* synthetic */ Success(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i & 2) != 0 ? null : str);
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> getLinkedInstruments() {
                return this.linkedInstruments;
            }

            public final java.lang.String getPartnerLink() {
                return this.partnerLink;
            }

            /* renamed from: $r8$lambda$rxQcmA7pNuLHnECGJPiDUx-Jle4, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20731$r8$lambda$rxQcmA7pNuLHnECGJPiDUxJle4() {
                return new kotlinx.serialization.internal.ArrayListSerializer(new kotlinx.serialization.PolymorphicSerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.class), new java.lang.annotation.Annotation[0]));
            }

            public final java.lang.String toString() {
                java.util.List<com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> list = this.linkedInstruments;
                java.lang.String str = this.partnerLink;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(linkedInstruments=");
                sb.append(list);
                sb.append(", partnerLink=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.linkedInstruments.hashCode();
                java.lang.String str = this.partnerLink;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success success = (com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.linkedInstruments, success.linkedInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.partnerLink, success.partnerLink);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success copy(java.util.List<? extends com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> linkedInstruments, java.lang.String partnerLink) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkedInstruments, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success(linkedInstruments, partnerLink);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getPartnerLink() {
                return this.partnerLink;
            }

            public final java.util.List<com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument> component1() {
                return this.linkedInstruments;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Success success, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    list = success.linkedInstruments;
                }
                if ((i & 2) != 0) {
                    str = success.partnerLink;
                }
                return success.copy(list, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ(\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "", "errorMessage", "errorCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errorCode;
            private final java.lang.String errorMessage;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Error$$serializer.INSTANCE;
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
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
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
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error error = (com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, error.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error copy(java.lang.String errorMessage, java.lang.String errorCode) {
                return new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error(errorMessage, errorCode);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getErrorCode() {
                return this.errorCode;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Error error, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
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

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome$Cancelled;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/AmexAndP3LinkingFlowNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult$Outcome$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled.$r8$lambda$Xh4TCPpyzDRqmjqMrGXYVD8CFm8();
                }
            });
            public static final int $stable = 8;

            public final int hashCode() {
                return 1961217930;
            }

            private Cancelled() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$Xh4TCPpyzDRqmjqMrGXYVD8CFm8() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome.Cancelled)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AmexAndP3LinkingFlowNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult amexAndP3LinkingFlowNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.AmexAndP3LinkingFlowNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = amexAndP3LinkingFlowNavResult.outcome;
        }
        return amexAndP3LinkingFlowNavResult.copy(outcome);
    }
}
