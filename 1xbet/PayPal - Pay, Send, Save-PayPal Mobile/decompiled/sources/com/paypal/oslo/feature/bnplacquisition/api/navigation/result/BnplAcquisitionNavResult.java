package com.paypal.oslo.feature.bnplacquisition.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;)Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "getStatus", "Companion", "Status", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class BnplAcquisitionNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult> serializer() {
            return com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ BnplAcquisitionNavResult(int i, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
    }

    public BnplAcquisitionNavResult(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.status = status;
    }

    public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0002\u0082\u0001\u0004\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Cancelled", "Declined", "Error", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Status {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Companion INSTANCE = com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Companion.getHighSpeedVideoFpsRanges;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes11.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled", com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Completed$$serializer.INSTANCE, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Declined$$serializer.INSTANCE, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Error$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;", "card", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;)Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/PayLaterCard;", "getCard", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Completed implements com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed.Companion(null);
            private final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard card;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Completed;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed> serializer() {
                    return com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Completed$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Completed(int i, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard payLaterCard, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Completed$$serializer.INSTANCE.getDescriptor());
                }
                this.card = payLaterCard;
            }

            public Completed(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard payLaterCard) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payLaterCard, "");
                this.card = payLaterCard;
            }

            public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard getCard() {
                return this.card;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard payLaterCard = this.card;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(card=");
                sb.append(payLaterCard);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.card.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, ((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed) other).card);
            }

            public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed copy(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard card) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
                return new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed(card);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard getCard() {
                return this.card;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed copy$default(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Completed completed, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.PayLaterCard payLaterCard, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    payLaterCard = completed.card;
                }
                return completed.copy(payLaterCard);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes11.dex */
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status {
            public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled INSTANCE = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled.m12268$r8$lambda$Z1JOAQcEdsftvKE_xBqCghsTU();
                }
            });

            public final int hashCode() {
                return -1074301053;
            }

            private Cancelled() {
            }

            /* renamed from: $r8$lambda$Z1JOAQcEdsftv-KE_-xBqCghsTU, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m12268$r8$lambda$Z1JOAQcEdsftvKE_xBqCghsTU() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Cancelled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Declined implements com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined.Companion(null);
            private final java.lang.String reason;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Declined;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined> serializer() {
                    return com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Declined$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Declined(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Declined$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = str;
            }

            public Declined(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.reason = str;
            }

            public final java.lang.String getReason() {
                return this.reason;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.reason;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Declined(reason=");
                sb.append(str);
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
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined) other).reason);
            }

            public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined copy(java.lang.String reason) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                return new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined(reason);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getReason() {
                return this.reason;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined copy$default(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Declined declined, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = declined.reason;
                }
                return declined.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status;", "", "message", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bnpl_acquisition_api_prodRelease", "(Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error.Companion INSTANCE = new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error.Companion(null);
            private final java.lang.String message;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/bnplacquisition/api/navigation/result/BnplAcquisitionNavResult$Status$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes11.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error> serializer() {
                    return com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult$Status$Error$$serializer.INSTANCE.getDescriptor());
                }
                this.message = str;
            }

            public Error(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.message.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error) other).message);
            }

            public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error copy(java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
                return new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error(message);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error copy$default(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BnplAcquisitionNavResult(status=");
        sb.append(status);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult) other).status);
    }

    public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult copy(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult copy$default(com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult bnplAcquisitionNavResult, com.paypal.oslo.feature.bnplacquisition.api.navigation.result.BnplAcquisitionNavResult.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = bnplAcquisitionNavResult.status;
        }
        return bnplAcquisitionNavResult.copy(status);
    }
}
