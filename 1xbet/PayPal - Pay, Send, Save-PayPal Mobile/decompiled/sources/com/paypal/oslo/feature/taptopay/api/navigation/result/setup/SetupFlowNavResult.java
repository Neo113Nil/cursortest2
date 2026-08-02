package com.paypal.oslo.feature.taptopay.api.navigation.result.setup;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0004$%&#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;)Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_api_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "getStatus", "Companion", "Status", "SetupFlowError", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SetupFlowNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult> serializer() {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SetupFlowNavResult(int i, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
    }

    public SetupFlowNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.status = status;
    }

    public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Cancelled", "Failed", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Status {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Companion INSTANCE = com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Failed$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Completed implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Completed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed.$r8$lambda$mtqrY1lRd8U6ciXGnTRgh_uKAMY();
                }
            });

            public final int hashCode() {
                return -308821255;
            }

            private Completed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$mtqrY1lRd8U6ciXGnTRgh_uKAMY() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Completed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled.$r8$lambda$7If1N_p2x21_e9r082jeXAAOVEs();
                }
            });

            public final int hashCode() {
                return 1570698751;
            }

            private Cancelled() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$7If1N_p2x21_e9r082jeXAAOVEs() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Cancelled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "error", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;)Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_api_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "getError", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Failed implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status {
            private final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError error;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed.Companion(null);
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Failed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.INSTANCE.serializer();
                    return serializer;
                }
            })};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$Status$Failed;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed> serializer() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Failed$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Failed(int i, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError setupFlowError, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$Status$Failed$$serializer.INSTANCE.getDescriptor());
                }
                this.error = setupFlowError;
            }

            public Failed(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError setupFlowError) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupFlowError, "");
                this.error = setupFlowError;
            }

            public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError getError() {
                return this.error;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError setupFlowError = this.error;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed(error=");
                sb.append(setupFlowError);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.error.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed) other).error);
            }

            public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed copy(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError error) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
                return new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed(error);
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError getError() {
                return this.error;
            }

            public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed copy$default(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status.Failed failed, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError setupFlowError, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    setupFlowError = failed.error;
                }
                return failed.copy(setupFlowError);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\u0002\u0082\u0001\u0005\b\t\n\u000b\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "", "Companion", "EligibilityCheckFailed", "DigitizationFailed", "ActivationFailed", "CardNotFound", "Unknown", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface SetupFlowError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Companion INSTANCE = com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Companion.getHighSpeedVideoSizes;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Companion getHighSpeedVideoSizes = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown", com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$EligibilityCheckFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class EligibilityCheckFailed implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$SetupFlowError$EligibilityCheckFailed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed.$r8$lambda$aOTQkHuCMhJI1ZOhzzNTZCgvU_U();
                }
            });

            public final int hashCode() {
                return 1086100927;
            }

            private EligibilityCheckFailed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$aOTQkHuCMhJI1ZOhzzNTZCgvU_U() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "EligibilityCheckFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.EligibilityCheckFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$DigitizationFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class DigitizationFailed implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$SetupFlowError$DigitizationFailed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed.$r8$lambda$WcVUT2SvmXPWfg6ETSXIoRwRSxE();
                }
            });

            public final int hashCode() {
                return -1764964005;
            }

            private DigitizationFailed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$WcVUT2SvmXPWfg6ETSXIoRwRSxE() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "DigitizationFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.DigitizationFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$ActivationFailed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class ActivationFailed implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$SetupFlowError$ActivationFailed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed.$r8$lambda$c4x3mFLoZM_HWSLFSlnDdqGqM3A();
                }
            });

            public final int hashCode() {
                return -359014822;
            }

            private ActivationFailed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$c4x3mFLoZM_HWSLFSlnDdqGqM3A() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "ActivationFailed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.ActivationFailed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$CardNotFound;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class CardNotFound implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$SetupFlowError$CardNotFound$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound.m20002$r8$lambda$M0enjebTOlOKNRupZiMX5KOcjc();
                }
            });

            public final int hashCode() {
                return -1342510970;
            }

            private CardNotFound() {
            }

            /* renamed from: $r8$lambda$M0enjebTOlO-KNRupZiMX5KOcjc, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20002$r8$lambda$M0enjebTOlOKNRupZiMX5KOcjc() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "CardNotFound";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.CardNotFound)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError$Unknown;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/setup/SetupFlowNavResult$SetupFlowError;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Unknown implements com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult$SetupFlowError$Unknown$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown.$r8$lambda$SJQbroOk9oBFcWIrcYyb4OnAKWE();
                }
            });

            public final int hashCode() {
                return 1840391939;
            }

            private Unknown() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$SJQbroOk9oBFcWIrcYyb4OnAKWE() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Unknown";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.SetupFlowError.Unknown)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupFlowNavResult(status=");
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
        return (other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult) other).status);
    }

    public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult copy(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult copy$default(com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult setupFlowNavResult, com.paypal.oslo.feature.taptopay.api.navigation.result.setup.SetupFlowNavResult.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = setupFlowNavResult.status;
        }
        return setupFlowNavResult.copy(status);
    }
}
