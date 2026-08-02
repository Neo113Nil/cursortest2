package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013JP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b1\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SkipChangePasswordAndLoginChallenge;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "id", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "type", "", "isEligible", "validationToken", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "component3", "()Z", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SkipChangePasswordAndLoginChallenge;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SkipChangePasswordAndLoginChallenge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "getType", "Z", "getValidationToken", "getNonce", "getPartialToken", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SkipChangePasswordAndLoginChallenge implements com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final boolean isEligible;
    private final java.lang.String nonce;
    private final java.lang.String partialToken;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type;
    private final java.lang.String validationToken;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SkipChangePasswordAndLoginChallenge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SkipChangePasswordAndLoginChallenge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge> serializer() {
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SkipChangePasswordAndLoginChallenge(int i, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.validationToken = str2;
        this.nonce = str3;
        this.partialToken = str4;
    }

    public SkipChangePasswordAndLoginChallenge(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.validationToken = str2;
        this.nonce = str3;
        this.partialToken = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getType());
        output.encodeBooleanElement(serialDesc, 2, self.isEligible());
        output.encodeStringElement(serialDesc, 3, self.validationToken);
        output.encodeNullableSerializableElement(serialDesc, 4, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nonce);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.partialToken);
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge
    public final boolean isEligible() {
        return this.isEligible;
    }

    public final java.lang.String getValidationToken() {
        return this.validationToken;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = this.type;
        boolean z = this.isEligible;
        java.lang.String str2 = this.validationToken;
        java.lang.String str3 = this.nonce;
        java.lang.String str4 = this.partialToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SkipChangePasswordAndLoginChallenge(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(challengeType);
        sb.append(", isEligible=");
        sb.append(z);
        sb.append(", validationToken=");
        sb.append(str2);
        sb.append(", nonce=");
        sb.append(str3);
        sb.append(", partialToken=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.isEligible);
        int hashCode4 = this.validationToken.hashCode();
        java.lang.String str = this.nonce;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.partialToken;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge)) {
            return false;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge skipChangePasswordAndLoginChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, skipChangePasswordAndLoginChallenge.id) && this.type == skipChangePasswordAndLoginChallenge.type && this.isEligible == skipChangePasswordAndLoginChallenge.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.validationToken, skipChangePasswordAndLoginChallenge.validationToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, skipChangePasswordAndLoginChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, skipChangePasswordAndLoginChallenge.partialToken);
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge copy(java.lang.String id, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type, boolean isEligible, java.lang.String validationToken, java.lang.String nonce, java.lang.String partialToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationToken, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge(id, type, isEligible, validationToken, nonce, partialToken);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getValidationToken() {
        return this.validationToken;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsEligible() {
        return this.isEligible;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge copy$default(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SkipChangePasswordAndLoginChallenge skipChangePasswordAndLoginChallenge, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = skipChangePasswordAndLoginChallenge.id;
        }
        if ((i & 2) != 0) {
            challengeType = skipChangePasswordAndLoginChallenge.type;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = challengeType;
        if ((i & 4) != 0) {
            z = skipChangePasswordAndLoginChallenge.isEligible;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = skipChangePasswordAndLoginChallenge.validationToken;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            str3 = skipChangePasswordAndLoginChallenge.nonce;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            str4 = skipChangePasswordAndLoginChallenge.partialToken;
        }
        return skipChangePasswordAndLoginChallenge.copy(str, challengeType2, z2, str5, str6, str4);
    }
}
