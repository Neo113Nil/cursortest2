package com.paypal.oslo.feature.identity.shared.domain.model.challenge;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBe\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J`\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b6\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00107\u001a\u0004\b8\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b9\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00101\u001a\u0004\b:\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/Challenge;", "", "id", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "type", "", "isEligible", "evUrl", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/PhoneNumber;", "phoneNumbers", "nonce", "partialToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "component3", "()Z", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identity_prodRelease", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/ChallengeType;", "getType", "Z", "getEvUrl", "Ljava/util/List;", "getPhoneNumbers", "getNonce", "getPartialToken", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SilentAuthChallenge implements com.paypal.oslo.feature.identity.shared.domain.model.challenge.Challenge {
    private final java.lang.String evUrl;
    private final java.lang.String id;
    private final boolean isEligible;
    private final java.lang.String nonce;
    private final java.lang.String partialToken;
    private final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers;
    private final com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.Companion INSTANCE = new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.Companion(null);
    public static final int $stable = 8;
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge.m15336$r8$lambda$4DtzbvPP6VIvN4tnafYUlhTjQU();
        }
    }), null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/challenge/SilentAuthChallenge;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge> serializer() {
            return com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SilentAuthChallenge(int i, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.evUrl = str2;
        this.phoneNumbers = list;
        this.nonce = str3;
        this.partialToken = str4;
    }

    public SilentAuthChallenge(java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = str;
        this.type = challengeType;
        this.isEligible = z;
        this.evUrl = str2;
        this.phoneNumbers = list;
        this.nonce = str3;
        this.partialToken = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$identity_prodRelease(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getType());
        output.encodeBooleanElement(serialDesc, 2, self.isEligible());
        output.encodeStringElement(serialDesc, 3, self.evUrl);
        output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.phoneNumbers);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.nonce);
        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.partialToken);
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

    public final java.lang.String getEvUrl() {
        return this.evUrl;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    /* renamed from: $r8$lambda$4D-tzbvPP6VIvN4tnafYUlhTjQU, reason: not valid java name */
    public static /* synthetic */ kotlinx.serialization.KSerializer m15336$r8$lambda$4DtzbvPP6VIvN4tnafYUlhTjQU() {
        return new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber$$serializer.INSTANCE);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType = this.type;
        boolean z = this.isEligible;
        java.lang.String str2 = this.evUrl;
        java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> list = this.phoneNumbers;
        java.lang.String str3 = this.nonce;
        java.lang.String str4 = this.partialToken;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SilentAuthChallenge(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(challengeType);
        sb.append(", isEligible=");
        sb.append(z);
        sb.append(", evUrl=");
        sb.append(str2);
        sb.append(", phoneNumbers=");
        sb.append(list);
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
        int hashCode4 = this.evUrl.hashCode();
        int hashCode5 = this.phoneNumbers.hashCode();
        java.lang.String str = this.nonce;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.partialToken;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge)) {
            return false;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge = (com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, silentAuthChallenge.id) && this.type == silentAuthChallenge.type && this.isEligible == silentAuthChallenge.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.evUrl, silentAuthChallenge.evUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumbers, silentAuthChallenge.phoneNumbers) && kotlin.jvm.internal.Intrinsics.areEqual(this.nonce, silentAuthChallenge.nonce) && kotlin.jvm.internal.Intrinsics.areEqual(this.partialToken, silentAuthChallenge.partialToken);
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge copy(java.lang.String id, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType type, boolean isEligible, java.lang.String evUrl, java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> phoneNumbers, java.lang.String nonce, java.lang.String partialToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumbers, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge(id, type, isEligible, evUrl, phoneNumbers, nonce, partialToken);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPartialToken() {
        return this.partialToken;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getNonce() {
        return this.nonce;
    }

    public final java.util.List<com.paypal.oslo.feature.identity.shared.domain.model.challenge.PhoneNumber> component5() {
        return this.phoneNumbers;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEvUrl() {
        return this.evUrl;
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

    public static /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge copy$default(com.paypal.oslo.feature.identity.shared.domain.model.challenge.SilentAuthChallenge silentAuthChallenge, java.lang.String str, com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType, boolean z, java.lang.String str2, java.util.List list, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = silentAuthChallenge.id;
        }
        if ((i & 2) != 0) {
            challengeType = silentAuthChallenge.type;
        }
        com.paypal.oslo.feature.identity.shared.domain.model.challenge.ChallengeType challengeType2 = challengeType;
        if ((i & 4) != 0) {
            z = silentAuthChallenge.isEligible;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str2 = silentAuthChallenge.evUrl;
        }
        java.lang.String str5 = str2;
        if ((i & 16) != 0) {
            list = silentAuthChallenge.phoneNumbers;
        }
        java.util.List list2 = list;
        if ((i & 32) != 0) {
            str3 = silentAuthChallenge.nonce;
        }
        java.lang.String str6 = str3;
        if ((i & 64) != 0) {
            str4 = silentAuthChallenge.partialToken;
        }
        return silentAuthChallenge.copy(str, challengeType2, z2, str5, list2, str6, str4);
    }
}
