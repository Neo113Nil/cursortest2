package com.paypal.oslo.feature.debitcard.api.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013JV\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0013J'\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0013R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0013R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b4\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "cardLast4", "schema", "displayProductName", "primaryCardArtUrl", "thumbnailCardArtUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$debit_card_api_prodRelease", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getCardId", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "getCardLast4", "getSchema", "getDisplayProductName", "getPrimaryCardArtUrl", "getThumbnailCardArtUrl", "Companion", "$serializer"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class DebitCardData {
    public static final int $stable = 0;
    private final java.lang.String cardId;
    private final java.lang.String cardLast4;
    private final java.lang.String displayProductName;
    private final java.lang.String primaryCardArtUrl;
    private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
    private final java.lang.String schema;
    private final java.lang.String thumbnailCardArtUrl;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.debitcard.api.model.DebitCardData.Companion INSTANCE = new com.paypal.oslo.feature.debitcard.api.model.DebitCardData.Companion(null);
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] $childSerializers = {null, kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.api.model.DebitCardData$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            kotlinx.serialization.KSerializer serializer;
            serializer = com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.INSTANCE.serializer();
            return serializer;
        }
    }), null, null, null, null, null};

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.paypal.oslo.feature.debitcard.api.model.DebitCardData> serializer() {
            return com.paypal.oslo.feature.debitcard.api.model.DebitCardData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DebitCardData(int i, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 127, com.paypal.oslo.feature.debitcard.api.model.DebitCardData$$serializer.INSTANCE.getDescriptor());
        }
        this.cardId = str;
        this.productName = debitCardProductName;
        this.cardLast4 = str2;
        this.schema = str3;
        this.displayProductName = str4;
        this.primaryCardArtUrl = str5;
        this.thumbnailCardArtUrl = str6;
    }

    public DebitCardData(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.cardId = str;
        this.productName = debitCardProductName;
        this.cardLast4 = str2;
        this.schema = str3;
        this.displayProductName = str4;
        this.primaryCardArtUrl = str5;
        this.thumbnailCardArtUrl = str6;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$debit_card_api_prodRelease(com.paypal.oslo.feature.debitcard.api.model.DebitCardData self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>>[] lazyArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.cardId);
        output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.productName);
        output.encodeStringElement(serialDesc, 2, self.cardLast4);
        output.encodeStringElement(serialDesc, 3, self.schema);
        output.encodeStringElement(serialDesc, 4, self.displayProductName);
        output.encodeStringElement(serialDesc, 5, self.primaryCardArtUrl);
        output.encodeStringElement(serialDesc, 6, self.thumbnailCardArtUrl);
    }

    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    public final java.lang.String getCardLast4() {
        return this.cardLast4;
    }

    public final java.lang.String getSchema() {
        return this.schema;
    }

    public final java.lang.String getDisplayProductName() {
        return this.displayProductName;
    }

    public final java.lang.String getPrimaryCardArtUrl() {
        return this.primaryCardArtUrl;
    }

    public final java.lang.String getThumbnailCardArtUrl() {
        return this.thumbnailCardArtUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.cardId;
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
        java.lang.String str2 = this.cardLast4;
        java.lang.String str3 = this.schema;
        java.lang.String str4 = this.displayProductName;
        java.lang.String str5 = this.primaryCardArtUrl;
        java.lang.String str6 = this.thumbnailCardArtUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardData(cardId=");
        sb.append(str);
        sb.append(", productName=");
        sb.append(debitCardProductName);
        sb.append(", cardLast4=");
        sb.append(str2);
        sb.append(", schema=");
        sb.append(str3);
        sb.append(", displayProductName=");
        sb.append(str4);
        sb.append(", primaryCardArtUrl=");
        sb.append(str5);
        sb.append(", thumbnailCardArtUrl=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((this.cardId.hashCode() * 31) + this.productName.hashCode()) * 31) + this.cardLast4.hashCode()) * 31) + this.schema.hashCode()) * 31) + this.displayProductName.hashCode()) * 31) + this.primaryCardArtUrl.hashCode()) * 31) + this.thumbnailCardArtUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.api.model.DebitCardData)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData = (com.paypal.oslo.feature.debitcard.api.model.DebitCardData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, debitCardData.cardId) && this.productName == debitCardData.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.cardLast4, debitCardData.cardLast4) && kotlin.jvm.internal.Intrinsics.areEqual(this.schema, debitCardData.schema) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayProductName, debitCardData.displayProductName) && kotlin.jvm.internal.Intrinsics.areEqual(this.primaryCardArtUrl, debitCardData.primaryCardArtUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailCardArtUrl, debitCardData.thumbnailCardArtUrl);
    }

    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardData copy(java.lang.String cardId, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String cardLast4, java.lang.String schema, java.lang.String displayProductName, java.lang.String primaryCardArtUrl, java.lang.String thumbnailCardArtUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardLast4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schema, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(primaryCardArtUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(thumbnailCardArtUrl, "");
        return new com.paypal.oslo.feature.debitcard.api.model.DebitCardData(cardId, productName, cardLast4, schema, displayProductName, primaryCardArtUrl, thumbnailCardArtUrl);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getThumbnailCardArtUrl() {
        return this.thumbnailCardArtUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getPrimaryCardArtUrl() {
        return this.primaryCardArtUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDisplayProductName() {
        return this.displayProductName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSchema() {
        return this.schema;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardLast4() {
        return this.cardLast4;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
        return this.productName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCardId() {
        return this.cardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.api.model.DebitCardData copy$default(com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitCardData.cardId;
        }
        if ((i & 2) != 0) {
            debitCardProductName = debitCardData.productName;
        }
        com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName2 = debitCardProductName;
        if ((i & 4) != 0) {
            str2 = debitCardData.cardLast4;
        }
        java.lang.String str7 = str2;
        if ((i & 8) != 0) {
            str3 = debitCardData.schema;
        }
        java.lang.String str8 = str3;
        if ((i & 16) != 0) {
            str4 = debitCardData.displayProductName;
        }
        java.lang.String str9 = str4;
        if ((i & 32) != 0) {
            str5 = debitCardData.primaryCardArtUrl;
        }
        java.lang.String str10 = str5;
        if ((i & 64) != 0) {
            str6 = debitCardData.thumbnailCardArtUrl;
        }
        return debitCardData.copy(str, debitCardProductName2, str7, str8, str9, str10, str6);
    }
}
