package com.paypal.oslo.feature.taptopay.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "copy", "(Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;)Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "getStatus", "Companion", "Status", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ChooseDefaultPaymentNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult> serializer() {
            return com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ChooseDefaultPaymentNavResult(int i, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
    }

    public ChooseDefaultPaymentNavResult(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.status = status;
    }

    public final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bq\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Skipped", "Closed", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Closed;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Skipped;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Status {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Companion INSTANCE = com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Companion.getHighSpeedVideoFpsRangesFor;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Companion getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed", com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$Status$Completed$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped", com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "", "wasPPSetAsDefault", "<init>", "(Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Z", "getWasPPSetAsDefault", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Completed implements com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed.Companion(null);
            private final boolean wasPPSetAsDefault;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Completed;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed> serializer() {
                    return com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$Status$Completed$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Completed(int i, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$Status$Completed$$serializer.INSTANCE.getDescriptor());
                }
                this.wasPPSetAsDefault = z;
            }

            public Completed(boolean z) {
                this.wasPPSetAsDefault = z;
            }

            public final boolean getWasPPSetAsDefault() {
                return this.wasPPSetAsDefault;
            }

            public final java.lang.String toString() {
                boolean z = this.wasPPSetAsDefault;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Completed(wasPPSetAsDefault=");
                sb.append(z);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return java.lang.Boolean.hashCode(this.wasPPSetAsDefault);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed) && this.wasPPSetAsDefault == ((com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed) other).wasPPSetAsDefault;
            }

            public final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed copy(boolean wasPPSetAsDefault) {
                return new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed(wasPPSetAsDefault);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getWasPPSetAsDefault() {
                return this.wasPPSetAsDefault;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed copy$default(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Completed completed, boolean z, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    z = completed.wasPPSetAsDefault;
                }
                return completed.copy(z);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Skipped;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Skipped implements com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped INSTANCE = new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$Status$Skipped$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped.m20096$r8$lambda$2qCjvFpD6yHg5Wv9Y8ILaKRN2U();
                }
            });

            public final int hashCode() {
                return -1573332888;
            }

            private Skipped() {
            }

            /* renamed from: $r8$lambda$2qCjvFpD6-yHg5Wv9Y8ILaKRN2U, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20096$r8$lambda$2qCjvFpD6yHg5Wv9Y8ILaKRN2U() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Skipped";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Skipped)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status$Closed;", "Lcom/paypal/oslo/feature/taptopay/navigation/result/ChooseDefaultPaymentNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Closed implements com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed INSTANCE = new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult$Status$Closed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed.$r8$lambda$4JTCZnVZRHDpKbsH3W18tmqdLUI();
                }
            });

            public final int hashCode() {
                return 600664372;
            }

            private Closed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$4JTCZnVZRHDpKbsH3W18tmqdLUI() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Closed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status.Closed)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ChooseDefaultPaymentNavResult(status=");
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
        return (other instanceof com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult) other).status);
    }

    public final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult copy(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult copy$default(com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult chooseDefaultPaymentNavResult, com.paypal.oslo.feature.taptopay.navigation.result.ChooseDefaultPaymentNavResult.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = chooseDefaultPaymentNavResult.status;
        }
        return chooseDefaultPaymentNavResult.copy(status);
    }
}
