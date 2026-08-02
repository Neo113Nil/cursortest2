package com.paypal.oslo.feature.cryptocurrency.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;)Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$cryptocurrency_prodRelease", "(Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class CryptoErrorNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Companion INSTANCE = new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult> serializer() {
            return com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CryptoErrorNavResult(int i, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public CryptoErrorNavResult(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "", "Companion", "OkayClicked", "Closed", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome$Closed;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome$OkayClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Companion.Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed", com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked", com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome$OkayClicked;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes12.dex */
        public static final /* data */ class OkayClicked implements com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked INSTANCE = new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult$Outcome$OkayClicked$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked.$r8$lambda$rCG8OuIEZMYkTvVibsnilDMZFvk();
                }
            });

            public final int hashCode() {
                return -1494442812;
            }

            private OkayClicked() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$rCG8OuIEZMYkTvVibsnilDMZFvk() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "OkayClicked";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.OkayClicked)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome$Closed;", "Lcom/paypal/oslo/feature/cryptocurrency/navigation/result/CryptoErrorNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes12.dex */
        public static final /* data */ class Closed implements com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed INSTANCE = new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult$Outcome$Closed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed.m13744$r8$lambda$AQidhOLB9yi0LG74aefQq7xWw();
                }
            });

            public final int hashCode() {
                return 538971259;
            }

            private Closed() {
            }

            /* renamed from: $r8$lambda$AQidhOLB9yi0LG74aefQq-7x-Ww, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m13744$r8$lambda$AQidhOLB9yi0LG74aefQq7xWw() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Closed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome.Closed)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoErrorNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult copy(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult copy$default(com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult cryptoErrorNavResult, com.paypal.oslo.feature.cryptocurrency.navigation.result.CryptoErrorNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = cryptoErrorNavResult.outcome;
        }
        return cryptoErrorNavResult.copy(outcome);
    }
}
