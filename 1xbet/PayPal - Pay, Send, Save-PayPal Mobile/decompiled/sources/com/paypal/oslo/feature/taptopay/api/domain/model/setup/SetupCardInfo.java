package com.paypal.oslo.feature.taptopay.api.domain.model.setup;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJR\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0014J'\u0010,\u001a\u00020+2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "", "", "id", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "type", "cardNumber", "brand", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "payLaterData", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;", "cardArtCollection", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "component6", "()Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;)Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$taptopay_api_prodRelease", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "getType", "getCardNumber", "getBrand", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/eligibility/PayLaterData;", "getPayLaterData", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/art/CardArtCollection;", "getCardArtCollection", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class SetupCardInfo {
    private final java.lang.String brand;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection;
    private final java.lang.String cardNumber;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData;
    private final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/setup/SetupCardInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo> serializer() {
            return com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SetupCardInfo(int i, java.lang.String str, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.type = cardType;
        this.cardNumber = str2;
        if ((i & 8) == 0) {
            this.brand = null;
        } else {
            this.brand = str3;
        }
        if ((i & 16) == 0) {
            this.payLaterData = null;
        } else {
            this.payLaterData = payLaterData;
        }
        if ((i & 32) == 0) {
            this.cardArtCollection = null;
        } else {
            this.cardArtCollection = cardArtCollection;
        }
    }

    public SetupCardInfo(java.lang.String str, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.id = str;
        this.type = cardType;
        this.cardNumber = str2;
        this.brand = str3;
        this.payLaterData = payLaterData;
        this.cardArtCollection = cardArtCollection;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$taptopay_api_prodRelease(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.type);
        output.encodeStringElement(serialDesc, 2, self.cardNumber);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.brand != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.brand);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.payLaterData != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData$$serializer.INSTANCE, self.payLaterData);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.cardArtCollection != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection$$serializer.INSTANCE, self.cardArtCollection);
        }
    }

    public /* synthetic */ SetupCardInfo(java.lang.String str, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cardType, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : payLaterData, (i & 32) != 0 ? null : cardArtCollection);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getType() {
        return this.type;
    }

    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection getCardArtCollection() {
        return this.cardArtCollection;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType = this.type;
        java.lang.String str2 = this.cardNumber;
        java.lang.String str3 = this.brand;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData = this.payLaterData;
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection = this.cardArtCollection;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SetupCardInfo(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(cardType);
        sb.append(", cardNumber=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(str3);
        sb.append(", payLaterData=");
        sb.append(payLaterData);
        sb.append(", cardArtCollection=");
        sb.append(cardArtCollection);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = this.cardNumber.hashCode();
        java.lang.String str = this.brand;
        int hashCode4 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData = this.payLaterData;
        int hashCode5 = payLaterData == null ? 0 : payLaterData.hashCode();
        com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection = this.cardArtCollection;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (cardArtCollection != null ? cardArtCollection.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo = (com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, setupCardInfo.id) && this.type == setupCardInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.cardNumber, setupCardInfo.cardNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, setupCardInfo.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.payLaterData, setupCardInfo.payLaterData) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArtCollection, setupCardInfo.cardArtCollection);
    }

    public final com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo copy(java.lang.String id, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType type, java.lang.String cardNumber, java.lang.String brand, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardNumber, "");
        return new com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo(id, type, cardNumber, brand, payLaterData, cardArtCollection);
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection getCardArtCollection() {
        return this.cardArtCollection;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData getPayLaterData() {
        return this.payLaterData;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo copy$default(com.paypal.oslo.feature.taptopay.api.domain.model.setup.SetupCardInfo setupCardInfo, java.lang.String str, com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData, com.paypal.oslo.feature.taptopay.api.domain.model.card.art.CardArtCollection cardArtCollection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = setupCardInfo.id;
        }
        if ((i & 2) != 0) {
            cardType = setupCardInfo.type;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType cardType2 = cardType;
        if ((i & 4) != 0) {
            str2 = setupCardInfo.cardNumber;
        }
        java.lang.String str4 = str2;
        if ((i & 8) != 0) {
            str3 = setupCardInfo.brand;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            payLaterData = setupCardInfo.payLaterData;
        }
        com.paypal.oslo.feature.taptopay.api.domain.model.card.eligibility.PayLaterData payLaterData2 = payLaterData;
        if ((i & 32) != 0) {
            cardArtCollection = setupCardInfo.cardArtCollection;
        }
        return setupCardInfo.copy(str, cardType2, str4, str5, payLaterData2, cardArtCollection);
    }
}
