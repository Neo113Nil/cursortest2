package com.paypal.oslo.feature.taptopay.api.navigation.result.intro;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "status", "<init>", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "copy", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;)Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_api_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "getStatus", "Companion", "Status", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class OnboardingIntroNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult> serializer() {
            return com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ OnboardingIntroNavResult(int i, com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.status = status;
    }

    public OnboardingIntroNavResult(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        this.status = status;
    }

    public final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status getStatus() {
        return this.status;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "", "Companion", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE, "Cancelled", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status$Completed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Status {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Companion INSTANCE = com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Companion.Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled", com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed", com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status$Completed;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Completed implements com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult$Status$Completed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed.m19999$r8$lambda$6MxZOWlCXgfZ4A23UfpCG51Slc();
                }
            });

            public final int hashCode() {
                return 765149102;
            }

            private Completed() {
            }

            /* renamed from: $r8$lambda$6MxZOWlCXgfZ4A23Uf-pCG51Slc, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m19999$r8$lambda$6MxZOWlCXgfZ4A23UfpCG51Slc() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.COMPLETE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Completed)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status$Cancelled;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/result/intro/OnboardingIntroNavResult$Status;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class Cancelled implements com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status {
            public static final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled INSTANCE = new com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult$Status$Cancelled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled.m19998$r8$lambda$4MKs9iM1zewoicqknTK9TlaeIA();
                }
            });

            public final int hashCode() {
                return -1650298188;
            }

            private Cancelled() {
            }

            /* renamed from: $r8$lambda$4MK-s9iM1zewoicqknTK9TlaeIA, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m19998$r8$lambda$4MKs9iM1zewoicqknTK9TlaeIA() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Cancelled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status.Cancelled)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OnboardingIntroNavResult(status=");
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
        return (other instanceof com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, ((com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult) other).status);
    }

    public final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult copy(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult(status);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status getStatus() {
        return this.status;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult copy$default(com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult onboardingIntroNavResult, com.paypal.oslo.feature.taptopay.api.navigation.result.intro.OnboardingIntroNavResult.Status status, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            status = onboardingIntroNavResult.status;
        }
        return onboardingIntroNavResult.copy(status);
    }
}
