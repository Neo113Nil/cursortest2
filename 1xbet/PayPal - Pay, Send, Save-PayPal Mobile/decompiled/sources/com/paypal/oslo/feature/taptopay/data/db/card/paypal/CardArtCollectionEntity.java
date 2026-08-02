package com.paypal.oslo.feature.taptopay.data.db.card.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtCollectionEntity;", "", "", "payPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "primary", "thumbnail", "stackView", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;)Lcom/paypal/oslo/feature/taptopay/data/db/card/paypal/CardArtCollectionEntity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPayPalCardId", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArt;", "getPrimary", "getThumbnail", "getStackView"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardArtCollectionEntity {
    public static final int $stable = 0;
    private final java.lang.String payPalCardId;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView;
    private final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail;

    public CardArtCollectionEntity(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.payPalCardId = str;
        this.primary = cardArt;
        this.thumbnail = cardArt2;
        this.stackView = cardArt3;
    }

    public /* synthetic */ CardArtCollectionEntity(java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : cardArt, (i & 4) != 0 ? null : cardArt2, (i & 8) != 0 ? null : cardArt3);
    }

    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getPrimary() {
        return this.primary;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getThumbnail() {
        return this.thumbnail;
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getStackView() {
        return this.stackView;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.payPalCardId;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt = this.primary;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2 = this.thumbnail;
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3 = this.stackView;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArtCollectionEntity(payPalCardId=");
        sb.append(str);
        sb.append(", primary=");
        sb.append(cardArt);
        sb.append(", thumbnail=");
        sb.append(cardArt2);
        sb.append(", stackView=");
        sb.append(cardArt3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.payPalCardId.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt = this.primary;
        int hashCode2 = cardArt == null ? 0 : cardArt.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2 = this.thumbnail;
        int hashCode3 = cardArt2 == null ? 0 : cardArt2.hashCode();
        com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3 = this.stackView;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (cardArt3 != null ? cardArt3.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity = (com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.payPalCardId, cardArtCollectionEntity.payPalCardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.primary, cardArtCollectionEntity.primary) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnail, cardArtCollectionEntity.thumbnail) && kotlin.jvm.internal.Intrinsics.areEqual(this.stackView, cardArtCollectionEntity.stackView);
    }

    public final com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity copy(java.lang.String payPalCardId, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt primary, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt thumbnail, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt stackView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalCardId, "");
        return new com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity(payPalCardId, primary, thumbnail, stackView);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getStackView() {
        return this.stackView;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt getPrimary() {
        return this.primary;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPayPalCardId() {
        return this.payPalCardId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity copy$default(com.paypal.oslo.feature.taptopay.data.db.card.paypal.CardArtCollectionEntity cardArtCollectionEntity, java.lang.String str, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt2, com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArt cardArt3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardArtCollectionEntity.payPalCardId;
        }
        if ((i & 2) != 0) {
            cardArt = cardArtCollectionEntity.primary;
        }
        if ((i & 4) != 0) {
            cardArt2 = cardArtCollectionEntity.thumbnail;
        }
        if ((i & 8) != 0) {
            cardArt3 = cardArtCollectionEntity.stackView;
        }
        return cardArtCollectionEntity.copy(str, cardArt, cardArt2, cardArt3);
    }
}
