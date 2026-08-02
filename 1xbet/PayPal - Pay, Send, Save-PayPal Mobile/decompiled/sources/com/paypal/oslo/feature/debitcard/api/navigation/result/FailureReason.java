package com.paypal.oslo.feature.debitcard.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "", "Companion", "Error", "Cancelled", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public interface FailureReason {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Companion INSTANCE = com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason> serializer() {
            return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Cancelled$$serializer.INSTANCE, com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Error$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "errorReason", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/ErrorReason;", "getErrorReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Error implements com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason {
        private final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Error$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error> serializer() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Error$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Error(int i, com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Error$$serializer.INSTANCE.getDescriptor());
            }
            this.errorReason = errorReason;
        }

        public Error(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
            this.errorReason = errorReason;
        }

        public final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason = this.errorReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorReason=");
            sb.append(errorReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorReason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorReason, ((com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error) other).errorReason);
        }

        public final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error copy(com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReason, "");
            return new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error(errorReason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason getErrorReason() {
            return this.errorReason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error copy$default(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Error error, com.paypal.oslo.feature.debitcard.api.navigation.result.ErrorReason errorReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorReason = error.errorReason;
            }
            return error.copy(errorReason);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "cancellationReason", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;)Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/CancellationReason;", "getCancellationReason", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason {
        private final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Cancelled$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlinx.serialization.KSerializer serializer;
                serializer = com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason.INSTANCE.serializer();
                return serializer;
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/navigation/result/FailureReason$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled> serializer() {
                return com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Cancelled$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Cancelled(int i, com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason$Cancelled$$serializer.INSTANCE.getDescriptor());
            }
            this.cancellationReason = cancellationReason;
        }

        public Cancelled(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
            this.cancellationReason = cancellationReason;
        }

        public final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason getCancellationReason() {
            return this.cancellationReason;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason = this.cancellationReason;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(cancellationReason=");
            sb.append(cancellationReason);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cancellationReason.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancellationReason, ((com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled) other).cancellationReason);
        }

        public final com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled copy(com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellationReason, "");
            return new com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled(cancellationReason);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason getCancellationReason() {
            return this.cancellationReason;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled copy$default(com.paypal.oslo.feature.debitcard.api.navigation.result.FailureReason.Cancelled cancelled, com.paypal.oslo.feature.debitcard.api.navigation.result.CancellationReason cancellationReason, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cancellationReason = cancelled.cancellationReason;
            }
            return cancelled.copy(cancellationReason);
        }
    }
}
