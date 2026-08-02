package com.paypal.oslo.feature.identity.stepup.domain.model;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0012\u0013\u0014\u0015\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "", "<init>", "()V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "NoChallengesAvailable", "AutoResolveSilentAuth", "SingleChallenge", "MultipleChoices", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$NoChallengesAvailable;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class StepupProcessingResult {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.$r8$lambda$OcDt3GuMAEh2fJuiaQhyxqZdDuY();
        }
    });

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.$cachedSerializer$delegate.getValue();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private StepupProcessingResult() {
    }

    public /* synthetic */ StepupProcessingResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$NoChallengesAvailable;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    /* loaded from: classes13.dex */
    public static final /* data */ class NoChallengesAvailable extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable INSTANCE = new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> $cachedSerializer$delegate = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$NoChallengesAvailable$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable.m15362$r8$lambda$wC2idBeBrZEB96ljBUkNTbUjck();
            }
        });

        public final int hashCode() {
            return 124690184;
        }

        private NoChallengesAvailable() {
            super(null);
        }

        /* renamed from: $r8$lambda$wC2idBeBrZEB9-6ljBUkNTbUjck, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15362$r8$lambda$wC2idBeBrZEB96ljBUkNTbUjck() {
            return new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable", INSTANCE, new java.lang.annotation.Annotation[0]);
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable> serializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final java.lang.String toString() {
            return "NoChallengesAvailable";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class AutoResolveSilentAuth extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult {
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$AutoResolveSilentAuth;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth> serializer() {
                return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$AutoResolveSilentAuth$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AutoResolveSilentAuth(int i, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$AutoResolveSilentAuth$$serializer.INSTANCE.getDescriptor());
            }
            this.challengeData = challengeData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoResolveSilentAuth(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            this.challengeData = challengeData;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData$$serializer.INSTANCE, self.challengeData);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AutoResolveSilentAuth(challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, ((com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth) other).challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth(challengeData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth copy$default(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth autoResolveSilentAuth, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeData = autoResolveSilentAuth.challengeData;
            }
            return autoResolveSilentAuth.copy(challengeData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeData", "<init>", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "copy", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;)Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "getChallengeData", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class SingleChallenge extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult {
        private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge.Companion(null);
        public static final int $stable = 8;

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$SingleChallenge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge> serializer() {
                return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$SingleChallenge$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SingleChallenge(int i, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$SingleChallenge$$serializer.INSTANCE.getDescriptor());
            }
            this.challengeData = challengeData;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SingleChallenge(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            this.challengeData = challengeData;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData$$serializer.INSTANCE, self.challengeData);
        }

        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData = this.challengeData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SingleChallenge(challengeData=");
            sb.append(challengeData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeData, ((com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge) other).challengeData);
        }

        public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge copy(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeData, "");
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge(challengeData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData getChallengeData() {
            return this.challengeData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge copy$default(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge singleChallenge, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData challengeData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                challengeData = singleChallenge.challengeData;
            }
            return singleChallenge.copy(challengeData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ \u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeData;", "challengeDataList", "<init>", "(Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getChallengeDataList", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final /* data */ class MultipleChoices extends com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult {
        private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> challengeDataList;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices.Companion INSTANCE = new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices.Companion(null);
        public static final int $stable = 8;
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$MultipleChoices$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices.m15361$r8$lambda$SdfdVwSz72LRJoMg9B_wk8NJf4();
            }
        })};

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/stepup/domain/model/StepupProcessingResult$MultipleChoices;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes13.dex */
        public static final class Companion {
            private Companion() {
            }

            public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices> serializer() {
                return com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$MultipleChoices$$serializer.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MultipleChoices(int i, java.util.List list, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$MultipleChoices$$serializer.INSTANCE.getDescriptor());
            }
            this.challengeDataList = list;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MultipleChoices(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.challengeDataList = list;
        }

        @kotlin.jvm.JvmStatic
        public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, $childSerializers[0].getValue(), self.challengeDataList);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> getChallengeDataList() {
            return this.challengeDataList;
        }

        /* renamed from: $r8$lambda$SdfdVwSz72LRJo-Mg9B_wk8NJf4, reason: not valid java name */
        public static /* synthetic */ kotlinx.serialization.KSerializer m15361$r8$lambda$SdfdVwSz72LRJoMg9B_wk8NJf4() {
            return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData$$serializer.INSTANCE);
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> list = this.challengeDataList;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MultipleChoices(challengeDataList=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.challengeDataList.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeDataList, ((com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices) other).challengeDataList);
        }

        public final com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices copy(java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> challengeDataList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeDataList, "");
            return new com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices(challengeDataList);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeData> component1() {
            return this.challengeDataList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices copy$default(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices multipleChoices, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = multipleChoices.challengeDataList;
            }
            return multipleChoices.copy(list);
        }
    }

    public static /* synthetic */ kotlinx.serialization.KSerializer $r8$lambda$OcDt3GuMAEh2fJuiaQhyxqZdDuY() {
        return new kotlinx.serialization.SealedClassSerializer("com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.AutoResolveSilentAuth.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.MultipleChoices.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.SingleChallenge.class)}, new kotlinx.serialization.KSerializer[]{com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$AutoResolveSilentAuth$$serializer.INSTANCE, com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$MultipleChoices$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable", com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult.NoChallengesAvailable.INSTANCE, new java.lang.annotation.Annotation[0]), com.paypal.oslo.feature.identity.stepup.domain.model.StepupProcessingResult$SingleChallenge$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
    }

    public /* synthetic */ StepupProcessingResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
