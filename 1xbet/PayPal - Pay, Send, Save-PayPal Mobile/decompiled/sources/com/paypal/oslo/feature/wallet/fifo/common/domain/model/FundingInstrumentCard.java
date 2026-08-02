package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJh\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0015J'\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b/\u00100R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b7\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b8\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b9\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrument;", "", "id", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingInstrumentType", "logoUrl", "issuerName", "name", "brand", "lastNChars", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "component3", "component4", "component5", "component6", "component7", "component8", "()Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;)Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$wallet_prodRelease", "(Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getFundingInstrumentType", "getLogoUrl", "getIssuerName", "getName", "getBrand", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/CardType;", "getCardType", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class FundingInstrumentCard implements com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument {
    public static final int $stable = 0;
    private final java.lang.String brand;
    private final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType;
    private final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType;
    private final java.lang.String id;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final java.lang.String logoUrl;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard.Companion INSTANCE = new com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer createSimpleEnumSerializer;
            createSimpleEnumSerializer = kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType", com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType.values());
            return createSimpleEnumSerializer;
        }
    })};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard> serializer() {
            return com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FundingInstrumentCard(int i, java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 255, com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.fundingInstrumentType = fundingInstrumentType;
        this.logoUrl = str2;
        this.issuerName = str3;
        this.name = str4;
        this.brand = str5;
        this.lastNChars = str6;
        this.cardType = cardType;
    }

    public FundingInstrumentCard(java.lang.String str, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        this.id = str;
        this.fundingInstrumentType = fundingInstrumentType;
        this.logoUrl = str2;
        this.issuerName = str3;
        this.name = str4;
        this.brand = str5;
        this.lastNChars = str6;
        this.cardType = cardType;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$wallet_prodRelease(com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.getId());
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.getFundingInstrumentType());
        output.encodeNullableSerializableElement(serialDesc, 2, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.getLogoUrl());
        output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.issuerName);
        output.encodeStringElement(serialDesc, 4, self.getName());
        output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.brand);
        output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.lastNChars);
        output.encodeSerializableElement(serialDesc, 7, lazyArr[7].getValue(), self.cardType);
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    @Override // com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrument
    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType getCardType() {
        return this.cardType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType = this.fundingInstrumentType;
        java.lang.String str2 = this.logoUrl;
        java.lang.String str3 = this.issuerName;
        java.lang.String str4 = this.name;
        java.lang.String str5 = this.brand;
        java.lang.String str6 = this.lastNChars;
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType = this.cardType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentCard(id=");
        sb.append(str);
        sb.append(", fundingInstrumentType=");
        sb.append(fundingInstrumentType);
        sb.append(", logoUrl=");
        sb.append(str2);
        sb.append(", issuerName=");
        sb.append(str3);
        sb.append(", name=");
        sb.append(str4);
        sb.append(", brand=");
        sb.append(str5);
        sb.append(", lastNChars=");
        sb.append(str6);
        sb.append(", cardType=");
        sb.append(cardType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.fundingInstrumentType.hashCode();
        java.lang.String str = this.logoUrl;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.issuerName;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        int hashCode5 = this.name.hashCode();
        java.lang.String str3 = this.brand;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.lastNChars;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.cardType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard fundingInstrumentCard = (com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrumentCard.id) && this.fundingInstrumentType == fundingInstrumentCard.fundingInstrumentType && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, fundingInstrumentCard.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, fundingInstrumentCard.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrumentCard.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, fundingInstrumentCard.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, fundingInstrumentCard.lastNChars) && this.cardType == fundingInstrumentCard.cardType;
    }

    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard copy(java.lang.String id, com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType fundingInstrumentType, java.lang.String logoUrl, java.lang.String issuerName, java.lang.String name2, java.lang.String brand, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType cardType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        return new com.paypal.oslo.feature.wallet.fifo.common.domain.model.FundingInstrumentCard(id, fundingInstrumentType, logoUrl, issuerName, name2, brand, lastNChars, cardType);
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.wallet.fifo.common.domain.model.CardType getCardType() {
        return this.cardType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType() {
        return this.fundingInstrumentType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
