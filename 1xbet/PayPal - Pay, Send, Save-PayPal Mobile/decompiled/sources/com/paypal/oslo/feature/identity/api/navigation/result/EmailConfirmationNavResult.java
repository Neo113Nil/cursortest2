package com.paypal.oslo.feature.identity.api.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;)Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class EmailConfirmationNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult> serializer() {
            return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EmailConfirmationNavResult(int i, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public EmailConfirmationNavResult(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "", "Companion", "Success", "Error", "Dismissed", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Dismissed;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Companion.Camera2StreamConfigurationMap;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes12.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed", com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Success$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "", "confirmedEmail", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getConfirmedEmail", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success.Companion(null);
            private final java.lang.String confirmedEmail;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Success$$serializer.INSTANCE.getDescriptor());
                }
                this.confirmedEmail = str;
            }

            public Success(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.confirmedEmail = str;
            }

            public final java.lang.String getConfirmedEmail() {
                return this.confirmedEmail;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.confirmedEmail;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(confirmedEmail=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.confirmedEmail.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmedEmail, ((com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success) other).confirmedEmail);
            }

            public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success copy(java.lang.String confirmedEmail) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmedEmail, "");
                return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success(confirmedEmail);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getConfirmedEmail() {
                return this.confirmedEmail;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Success success, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = success.confirmedEmail;
                }
                return success.copy(str);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J'\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "errorType", "", "message", "<init>", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_api_prodRelease", "(Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationErrorType;", "getErrorType", "Ljava/lang/String;", "getMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome {
            private final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType errorType;
            private final java.lang.String message;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error.Companion(null);
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Error$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType.INSTANCE.serializer();
                    return serializer;
                }
            }), null};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes12.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Error$$serializer.INSTANCE.getDescriptor());
                }
                this.errorType = emailConfirmationErrorType;
                this.message = str;
            }

            public Error(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailConfirmationErrorType, "");
                this.errorType = emailConfirmationErrorType;
                this.message = str;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$identity_api_prodRelease(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.errorType);
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.message);
            }

            public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType getErrorType() {
                return this.errorType;
            }

            public final java.lang.String getMessage() {
                return this.message;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType emailConfirmationErrorType = this.errorType;
                java.lang.String str = this.message;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorType=");
                sb.append(emailConfirmationErrorType);
                sb.append(", message=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.errorType.hashCode();
                java.lang.String str = this.message;
                return (hashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error error = (com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.errorType, error.errorType) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, error.message);
            }

            public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error copy(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType errorType, java.lang.String message) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
                return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error(errorType, message);
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getMessage() {
                return this.message;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType getErrorType() {
                return this.errorType;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Error error, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationErrorType emailConfirmationErrorType, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    emailConfirmationErrorType = error.errorType;
                }
                if ((i & 2) != 0) {
                    str = error.message;
                }
                return error.copy(emailConfirmationErrorType, str);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome$Dismissed;", "Lcom/paypal/oslo/feature/identity/api/navigation/result/EmailConfirmationNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes12.dex */
        public static final /* data */ class Dismissed implements com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome {
            public static final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed INSTANCE = new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult$Outcome$Dismissed$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed.$r8$lambda$o7FnOKmAM1oL6rbqpiVzGD_Ml0g();
                }
            });

            public final int hashCode() {
                return 1675292408;
            }

            private Dismissed() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$o7FnOKmAM1oL6rbqpiVzGD_Ml0g() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "Dismissed";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome.Dismissed)) {
                    return false;
                }
                return true;
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmationNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult copy(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult copy$default(com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult emailConfirmationNavResult, com.paypal.oslo.feature.identity.api.navigation.result.EmailConfirmationNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = emailConfirmationNavResult.outcome;
        }
        return emailConfirmationNavResult.copy(outcome);
    }
}
