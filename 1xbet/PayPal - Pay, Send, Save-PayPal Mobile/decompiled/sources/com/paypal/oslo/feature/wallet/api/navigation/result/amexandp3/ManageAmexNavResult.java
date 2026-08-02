package com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ManageAmexNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult> serializer() {
            return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ManageAmexNavResult(int i, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public ManageAmexNavResult(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "", "Companion", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "Removed", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$None;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Companion.getHighResolutionOutputSizeshNQ4ISI;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes15.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Companion getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None", com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$Outcome$Removed$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$None;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes15.dex */
        public static final /* data */ class None implements com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome {
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$Outcome$None$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None.m20733$r8$lambda$ZVQtOpj_oAryZ4Mm9PQ5cCYmY();
                }
            });
            public static final int $stable = 8;

            public final int hashCode() {
                return 1699613544;
            }

            private None() {
            }

            /* renamed from: $r8$lambda$-ZVQtOpj-_oAryZ4Mm9PQ5cCYmY, reason: not valid java name */
            public static /* synthetic */ kotlinx.serialization.KSerializer m20733$r8$lambda$ZVQtOpj_oAryZ4Mm9PQ5cCYmY() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.None)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome;", "", "name", "last4Chars", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_api_prodRelease", "(Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getName", "getLast4Chars", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Removed implements com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed.Companion INSTANCE = new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed.Companion(null);
            private final java.lang.String last4Chars;
            private final java.lang.String name;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/api/navigation/result/amexandp3/ManageAmexNavResult$Outcome$Removed;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes15.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed> serializer() {
                    return com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$Outcome$Removed$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Removed(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult$Outcome$Removed$$serializer.INSTANCE.getDescriptor());
                }
                this.name = str;
                this.last4Chars = str2;
            }

            public Removed(java.lang.String str, java.lang.String str2) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                this.name = str;
                this.last4Chars = str2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$wallet_api_prodRelease(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeStringElement(serialDesc, 0, self.name);
                output.encodeStringElement(serialDesc, 1, self.last4Chars);
            }

            public final java.lang.String getName() {
                return this.name;
            }

            public final java.lang.String getLast4Chars() {
                return this.last4Chars;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.name;
                java.lang.String str2 = this.last4Chars;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Removed(name=");
                sb.append(str);
                sb.append(", last4Chars=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return (this.name.hashCode() * 31) + this.last4Chars.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed)) {
                    return false;
                }
                com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed removed = (com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, removed.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.last4Chars, removed.last4Chars);
            }

            public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed copy(java.lang.String name2, java.lang.String last4Chars) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last4Chars, "");
                return new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed(name2, last4Chars);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getLast4Chars() {
                return this.last4Chars;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getName() {
                return this.name;
            }

            public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome.Removed removed, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = removed.name;
                }
                if ((i & 2) != 0) {
                    str2 = removed.last4Chars;
                }
                return removed.copy(str, str2);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ManageAmexNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult copy(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult copy$default(com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult manageAmexNavResult, com.paypal.oslo.feature.wallet.api.navigation.result.amexandp3.ManageAmexNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = manageAmexNavResult.outcome;
        }
        return manageAmexNavResult.copy(outcome);
    }
}
