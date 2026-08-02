package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u001e\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015Jb\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b&\u0010\u000eR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardData;", "", "", "payPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "type", "brand", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "timeCardAdded", "", "extras", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "getType", "getBrand", "getDescription", "getTimeCardAdded", "Ljava/util/Map;", "getExtras"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardData {
    public static final int $stable = 8;
    private final java.lang.String brand;
    private final java.lang.String description;
    private final java.util.Map<java.lang.String, java.lang.String> extras;
    private final java.lang.String payPalCardId;
    private final java.lang.String timeCardAdded;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type;

    public CardData(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.payPalCardId = str;
        this.type = cardType;
        this.brand = str2;
        this.description = str3;
        this.timeCardAdded = str4;
        this.extras = map;
    }

    public /* synthetic */ CardData(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : cardType, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) == 0 ? map : null);
    }

    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType() {
        return this.type;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getTimeCardAdded() {
        return this.timeCardAdded;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getExtras() {
        return this.extras;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.payPalCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.type;
        java.lang.String str2 = this.brand;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.timeCardAdded;
        java.util.Map<java.lang.String, java.lang.String> map = this.extras;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardData(payPalCardId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(cardType);
        sb.append(", brand=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", timeCardAdded=");
        sb.append(str4);
        sb.append(", extras=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.payPalCardId.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType = this.type;
        int hashCode2 = cardType == null ? 0 : cardType.hashCode();
        java.lang.String str = this.brand;
        int hashCode3 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.description;
        int hashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.timeCardAdded;
        int hashCode5 = str3 == null ? 0 : str3.hashCode();
        java.util.Map<java.lang.String, java.lang.String> map = this.extras;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (map != null ? map.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.payPalCardId, cardData.payPalCardId) && this.type == cardData.type && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, cardData.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, cardData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeCardAdded, cardData.timeCardAdded) && kotlin.jvm.internal.Intrinsics.areEqual(this.extras, cardData.extras);
    }

    public final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData copy(java.lang.String payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType type, java.lang.String brand, java.lang.String description, java.lang.String timeCardAdded, java.util.Map<java.lang.String, java.lang.String> extras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        return new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData(payPalCardId, type, brand, description, timeCardAdded, extras);
    }

    public final java.util.Map<java.lang.String, java.lang.String> component6() {
        return this.extras;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTimeCardAdded() {
        return this.timeCardAdded;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData copy$default(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardData cardData, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardData.payPalCardId;
        }
        if ((i & 2) != 0) {
            cardType = cardData.type;
        }
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType cardType2 = cardType;
        if ((i & 4) != 0) {
            str2 = cardData.brand;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = cardData.description;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = cardData.timeCardAdded;
        }
        java.lang.String str7 = str4;
        if ((i & 32) != 0) {
            map = cardData.extras;
        }
        return cardData.copy(str, cardType2, str5, str6, str7, map);
    }
}
