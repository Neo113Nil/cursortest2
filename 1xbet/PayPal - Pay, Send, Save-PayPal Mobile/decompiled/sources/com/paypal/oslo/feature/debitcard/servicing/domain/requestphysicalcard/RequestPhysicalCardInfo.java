package com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019JN\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\rHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0013J'\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b/\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b0\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b\n\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "", "", "debitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardArtUrl", "agreementUrl", "", "isPinRequired", "isPhysicalCardFee", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component3", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getDebitInstrumentId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getCardArtUrl", "getAgreementUrl", "Z", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class RequestPhysicalCardInfo {
    public static final int $stable = 0;
    private final java.lang.String agreementUrl;
    private final java.lang.String cardArtUrl;
    private final java.lang.String debitInstrumentId;
    private final boolean isPhysicalCardFee;
    private final boolean isPinRequired;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo> serializer() {
            return com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ RequestPhysicalCardInfo(int i, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.debitInstrumentId = str;
        this.productName = debitCardProductName;
        this.cardArtUrl = str2;
        if ((i & 8) == 0) {
            this.agreementUrl = null;
        } else {
            this.agreementUrl = str3;
        }
        if ((i & 16) == 0) {
            this.isPinRequired = true;
        } else {
            this.isPinRequired = z;
        }
        if ((i & 32) == 0) {
            this.isPhysicalCardFee = false;
        } else {
            this.isPhysicalCardFee = z2;
        }
    }

    public RequestPhysicalCardInfo(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.debitInstrumentId = str;
        this.productName = debitCardProductName;
        this.cardArtUrl = str2;
        this.agreementUrl = str3;
        this.isPinRequired = z;
        this.isPhysicalCardFee = z2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_prodRelease(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.debitInstrumentId);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productName);
        output.encodeStringElement(serialDesc, 2, self.cardArtUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.agreementUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.agreementUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !self.isPinRequired) {
            output.encodeBooleanElement(serialDesc, 4, self.isPinRequired);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.isPhysicalCardFee) {
            output.encodeBooleanElement(serialDesc, 5, self.isPhysicalCardFee);
        }
    }

    public /* synthetic */ RequestPhysicalCardInfo(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, debitCardProductName, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? true : z, (i & 32) != 0 ? false : z2);
    }

    public final java.lang.String getDebitInstrumentId() {
        return this.debitInstrumentId;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getCardArtUrl() {
        return this.cardArtUrl;
    }

    public final java.lang.String getAgreementUrl() {
        return this.agreementUrl;
    }

    public final boolean isPinRequired() {
        return this.isPinRequired;
    }

    public final boolean isPhysicalCardFee() {
        return this.isPhysicalCardFee;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.debitInstrumentId;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str2 = this.cardArtUrl;
        java.lang.String str3 = this.agreementUrl;
        boolean z = this.isPinRequired;
        boolean z2 = this.isPhysicalCardFee;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhysicalCardInfo(debitInstrumentId=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(debitCardProductName);
        sb.append(", cardArtUrl=");
        sb.append(str2);
        sb.append(", agreementUrl=");
        sb.append(str3);
        sb.append(", isPinRequired=");
        sb.append(z);
        sb.append(", isPhysicalCardFee=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.debitInstrumentId.hashCode();
        int hashCode2 = this.productName.hashCode();
        int hashCode3 = this.cardArtUrl.hashCode();
        java.lang.String str = this.agreementUrl;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isPinRequired)) * 31) + java.lang.Boolean.hashCode(this.isPhysicalCardFee);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo = (com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, requestPhysicalCardInfo.debitInstrumentId) && this.productName == requestPhysicalCardInfo.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtUrl, requestPhysicalCardInfo.cardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.agreementUrl, requestPhysicalCardInfo.agreementUrl) && this.isPinRequired == requestPhysicalCardInfo.isPinRequired && this.isPhysicalCardFee == requestPhysicalCardInfo.isPhysicalCardFee;
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo copy(java.lang.String debitInstrumentId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardArtUrl, java.lang.String agreementUrl, boolean isPinRequired, boolean isPhysicalCardFee) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArtUrl, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo(debitInstrumentId, productName, cardArtUrl, agreementUrl, isPinRequired, isPhysicalCardFee);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsPhysicalCardFee() {
        return this.isPhysicalCardFee;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPinRequired() {
        return this.isPinRequired;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAgreementUrl() {
        return this.agreementUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardArtUrl() {
        return this.cardArtUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDebitInstrumentId() {
        return this.debitInstrumentId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = requestPhysicalCardInfo.debitInstrumentId;
        }
        if ((i & 2) != 0) {
            debitCardProductName = requestPhysicalCardInfo.productName;
        }
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = debitCardProductName;
        if ((i & 4) != 0) {
            str2 = requestPhysicalCardInfo.cardArtUrl;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = requestPhysicalCardInfo.agreementUrl;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            z = requestPhysicalCardInfo.isPinRequired;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = requestPhysicalCardInfo.isPhysicalCardFee;
        }
        return requestPhysicalCardInfo.copy(str, debitCardProductName2, str4, str5, z3, z2);
    }
}
