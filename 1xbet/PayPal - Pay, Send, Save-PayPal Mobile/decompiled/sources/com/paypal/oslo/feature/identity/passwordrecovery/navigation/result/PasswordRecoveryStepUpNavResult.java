package com.paypal.oslo.feature.identity.passwordrecovery.navigation.result;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0003$%#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult;", "Lcom/paypal/oslo/core/navigation/result/NavResult;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OUTCOME, "<init>", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "copy", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;)Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "getOutcome", "Companion", "Outcome", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class PasswordRecoveryStepUpNavResult implements com.paypal.oslo.core.navigation.result.NavResult {
    private final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Companion INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.INSTANCE.serializer();
            return serializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult> serializer() {
            return com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PasswordRecoveryStepUpNavResult(int i, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$$serializer.INSTANCE.getDescriptor());
        }
        this.outcome = outcome;
    }

    public PasswordRecoveryStepUpNavResult(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        this.outcome = outcome;
    }

    public final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "", "Companion", "Success", "UserCanceled", "Error", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$UserCanceled;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public interface Outcome {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Companion INSTANCE = com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Companion.getHighSpeedVideoFpsRanges;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            static final /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Companion getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Companion();

            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome> serializer() {
                return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Error$$serializer.INSTANCE, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Success$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled", com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0011J'\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "createPasswordChallenge", "", "nonce", "partialToken", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "getCreatePasswordChallenge", "Ljava/lang/String;", "getNonce", "getPartialToken", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Success implements com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome {
            private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge createPasswordChallenge;
            private final java.lang.String nonce;
            private final java.lang.String partialToken;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success.Companion INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success.Companion(null);
            public static final int $stable = 8;
            private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Success$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlinx.serialization.KSerializer serializer;
                    serializer = com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge.INSTANCE.serializer();
                    return serializer;
                }
            }), null, null};

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes13.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success> serializer() {
                    return com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Success$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Success(int i, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.createPasswordChallenge = null;
                } else {
                    this.createPasswordChallenge = challenge;
                }
                if ((i & 2) == 0) {
                    this.nonce = null;
                } else {
                    this.nonce = str;
                }
                if ((i & 4) == 0) {
                    this.partialToken = null;
                } else {
                    this.partialToken = str2;
                }
            }

            public Success(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2) {
                this.createPasswordChallenge = challenge;
                this.nonce = str;
                this.partialToken = str2;
            }

            @kotlin.jvm.JvmStatic
            public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.createPasswordChallenge != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.createPasswordChallenge);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || self.nonce != null) {
                    output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nonce);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || self.partialToken != null) {
                    output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.partialToken);
                }
            }

            public /* synthetic */ Success(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : challenge, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
            }

            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getCreatePasswordChallenge() {
                return this.createPasswordChallenge;
            }

            public final java.lang.String getNonce() {
                return this.nonce;
            }

            public final java.lang.String getPartialToken() {
                return this.partialToken;
            }

            public final java.lang.String toString() {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.createPasswordChallenge;
                java.lang.String str = this.nonce;
                java.lang.String str2 = this.partialToken;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(createPasswordChallenge=");
                sb.append(challenge);
                sb.append(", nonce=");
                sb.append(str);
                sb.append(", partialToken=");
                sb.append(str2);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge = this.createPasswordChallenge;
                int hashCode = challenge == null ? 0 : challenge.hashCode();
                java.lang.String str = this.nonce;
                int hashCode2 = str == null ? 0 : str.hashCode();
                java.lang.String str2 = this.partialToken;
                return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success)) {
                    return false;
                }
                com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success success = (com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.createPasswordChallenge, success.createPasswordChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, success.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, success.partialToken);
            }

            public final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge createPasswordChallenge, java.lang.String nonce, java.lang.String partialToken) {
                return new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success(createPasswordChallenge, nonce, partialToken);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getPartialToken() {
                return this.partialToken;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getNonce() {
                return this.nonce;
            }

            /* renamed from: component1, reason: from getter */
            public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge getCreatePasswordChallenge() {
                return this.createPasswordChallenge;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success copy$default(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Success success, com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge challenge, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    challenge = success.createPasswordChallenge;
                }
                if ((i & 2) != 0) {
                    str = success.nonce;
                }
                if ((i & 4) != 0) {
                    str2 = success.partialToken;
                }
                return success.copy(challenge, str, str2);
            }

            public Success() {
                this((com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$UserCanceled;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes13.dex */
        public static final /* data */ class UserCanceled implements com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome {
            public static final int $stable = 0;
            public static final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$UserCanceled$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled.$r8$lambda$_llkkzRqsaLTjhYbyO_R8cDa7m0();
                }
            });

            public final int hashCode() {
                return 639081147;
            }

            private UserCanceled() {
            }

            public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$_llkkzRqsaLTjhYbyO_R8cDa7m0() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled", INSTANCE, new java.lang.annotation.Annotation[0]);
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled> serializer() {
                return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
            }

            public final java.lang.String toString() {
                return "UserCanceled";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.UserCanceled)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fJ'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getErrorMessage", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final /* data */ class Error implements com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome {
            public static final int $stable = 0;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error.Companion INSTANCE = new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error.Companion(null);
            private final java.lang.String errorMessage;

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/passwordrecovery/navigation/result/PasswordRecoveryStepUpNavResult$Outcome$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes13.dex */
            public static final class Companion {
                private Companion() {
                }

                public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error> serializer() {
                    return com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Error$$serializer.INSTANCE;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Error(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult$Outcome$Error$$serializer.INSTANCE.getDescriptor());
                }
                this.errorMessage = str;
            }

            public Error(java.lang.String str) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.errorMessage = str;
            }

            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public final java.lang.String toString() {
                java.lang.String str = this.errorMessage;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessage=");
                sb.append(str);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.errorMessage.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error) other).errorMessage);
            }

            public final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error copy(java.lang.String errorMessage) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
                return new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error(errorMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getErrorMessage() {
                return this.errorMessage;
            }

            public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error copy$default(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome.Error error, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = error.errorMessage;
                }
                return error.copy(str);
            }
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome = this.outcome;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasswordRecoveryStepUpNavResult(outcome=");
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
        return (other instanceof com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.outcome, ((com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult) other).outcome);
    }

    public final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult copy(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outcome, "");
        return new com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult(outcome);
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome getOutcome() {
        return this.outcome;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult copy$default(com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult passwordRecoveryStepUpNavResult, com.paypal.oslo.feature.identity.passwordrecovery.navigation.result.PasswordRecoveryStepUpNavResult.Outcome outcome, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            outcome = passwordRecoveryStepUpNavResult.outcome;
        }
        return passwordRecoveryStepUpNavResult.copy(outcome);
    }
}
