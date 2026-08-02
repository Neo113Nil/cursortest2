package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\\\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b3\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b\t\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b\n\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b6\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "", "", "referenceId", "fundingPrimaryAccountNumberReferenceId", "fundingPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;", "state", "", "isCompanionToken", "isDefaultToken", "issuerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;ZLjava/lang/Boolean;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;ZLjava/lang/Boolean;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;", "component5", "()Z", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;ZLjava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$revolvingcredit_servicing_prodRelease", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getReferenceId", "getFundingPrimaryAccountNumberReferenceId", "getFundingPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ExternalWalletTokenState;", "getState", "Z", "Ljava/lang/Boolean;", "getIssuerName", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class ProvisionedWalletToken {
    public static final int $stable = 0;
    private final java.lang.String fundingPrimaryAccountNumberLastDigits;
    private final java.lang.String fundingPrimaryAccountNumberReferenceId;
    private final boolean isCompanionToken;
    private final java.lang.Boolean isDefaultToken;
    private final java.lang.String issuerName;
    private final java.lang.String referenceId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken.Companion INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState", com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState.values());
            return createSimpleEnumSerializer;
        }
    }), null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/wallet/ProvisionedWalletToken;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken> serializer() {
            return com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ProvisionedWalletToken(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState, boolean z, java.lang.Boolean bool, java.lang.String str4, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken$$serializer.INSTANCE.getDescriptor());
        }
        this.referenceId = str;
        this.fundingPrimaryAccountNumberReferenceId = str2;
        this.fundingPrimaryAccountNumberLastDigits = str3;
        this.state = externalWalletTokenState;
        this.isCompanionToken = z;
        this.isDefaultToken = bool;
        this.issuerName = str4;
    }

    public ProvisionedWalletToken(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState, boolean z, java.lang.Boolean bool, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalWalletTokenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.referenceId = str;
        this.fundingPrimaryAccountNumberReferenceId = str2;
        this.fundingPrimaryAccountNumberLastDigits = str3;
        this.state = externalWalletTokenState;
        this.isCompanionToken = z;
        this.isDefaultToken = bool;
        this.issuerName = str4;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$revolvingcredit_servicing_prodRelease(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.referenceId);
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.fundingPrimaryAccountNumberReferenceId);
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.fundingPrimaryAccountNumberLastDigits);
        output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.state);
        output.encodeBooleanElement(serialDesc, 4, self.isCompanionToken);
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.BooleanSerializer.INSTANCE, self.isDefaultToken);
        output.encodeStringElement(serialDesc, 6, self.issuerName);
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final java.lang.String getFundingPrimaryAccountNumberReferenceId() {
        return this.fundingPrimaryAccountNumberReferenceId;
    }

    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState getState() {
        return this.state;
    }

    public final boolean isCompanionToken() {
        return this.isCompanionToken;
    }

    public final java.lang.Boolean isDefaultToken() {
        return this.isDefaultToken;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.referenceId;
        java.lang.String str2 = this.fundingPrimaryAccountNumberReferenceId;
        java.lang.String str3 = this.fundingPrimaryAccountNumberLastDigits;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState = this.state;
        boolean z = this.isCompanionToken;
        java.lang.Boolean bool = this.isDefaultToken;
        java.lang.String str4 = this.issuerName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionedWalletToken(referenceId=");
        sb.append(str);
        sb.append(", fundingPrimaryAccountNumberReferenceId=");
        sb.append(str2);
        sb.append(", fundingPrimaryAccountNumberLastDigits=");
        sb.append(str3);
        sb.append(", state=");
        sb.append(externalWalletTokenState);
        sb.append(", isCompanionToken=");
        sb.append(z);
        sb.append(", isDefaultToken=");
        sb.append(bool);
        sb.append(", issuerName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.referenceId.hashCode();
        java.lang.String str = this.fundingPrimaryAccountNumberReferenceId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.fundingPrimaryAccountNumberLastDigits;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        int hashCode4 = this.state.hashCode();
        int hashCode5 = java.lang.Boolean.hashCode(this.isCompanionToken);
        java.lang.Boolean bool = this.isDefaultToken;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.issuerName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken provisionedWalletToken = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, provisionedWalletToken.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberReferenceId, provisionedWalletToken.fundingPrimaryAccountNumberReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberLastDigits, provisionedWalletToken.fundingPrimaryAccountNumberLastDigits) && this.state == provisionedWalletToken.state && this.isCompanionToken == provisionedWalletToken.isCompanionToken && kotlin.jvm.internal.Intrinsics.areEqual(this.isDefaultToken, provisionedWalletToken.isDefaultToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, provisionedWalletToken.issuerName);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken copy(java.lang.String referenceId, java.lang.String fundingPrimaryAccountNumberReferenceId, java.lang.String fundingPrimaryAccountNumberLastDigits, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState state, boolean isCompanionToken, java.lang.Boolean isDefaultToken, java.lang.String issuerName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(referenceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken(referenceId, fundingPrimaryAccountNumberReferenceId, fundingPrimaryAccountNumberLastDigits, state, isCompanionToken, isDefaultToken, issuerName);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.Boolean getIsDefaultToken() {
        return this.isDefaultToken;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsCompanionToken() {
        return this.isCompanionToken;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState getState() {
        return this.state;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getFundingPrimaryAccountNumberReferenceId() {
        return this.fundingPrimaryAccountNumberReferenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ProvisionedWalletToken provisionedWalletToken, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState, boolean z, java.lang.Boolean bool, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = provisionedWalletToken.referenceId;
        }
        if ((i & 2) != 0) {
            str2 = provisionedWalletToken.fundingPrimaryAccountNumberReferenceId;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = provisionedWalletToken.fundingPrimaryAccountNumberLastDigits;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            externalWalletTokenState = provisionedWalletToken.state;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.wallet.ExternalWalletTokenState externalWalletTokenState2 = externalWalletTokenState;
        if ((i & 16) != 0) {
            z = provisionedWalletToken.isCompanionToken;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            bool = provisionedWalletToken.isDefaultToken;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 64) != 0) {
            str4 = provisionedWalletToken.issuerName;
        }
        return provisionedWalletToken.copy(str, str5, str6, externalWalletTokenState2, z2, bool2, str4);
    }
}
