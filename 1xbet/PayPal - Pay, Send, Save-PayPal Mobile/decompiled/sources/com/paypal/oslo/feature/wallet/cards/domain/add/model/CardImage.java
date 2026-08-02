package com.paypal.oslo.feature.wallet.cards.domain.add.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b \u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "", "", "baseCdnLinkPath", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "", "height", "width", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getStandardCardImage2", "()Ljava/lang/String;", "getStandardCardImage3", "component1", "component2", "component3", "()Ljava/lang/Integer;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBaseCdnLinkPath", "getMimeType", "Ljava/lang/Integer;", "getHeight", "getWidth", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class CardImage {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage.Companion Companion = new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage.Companion(null);
    private final java.lang.String baseCdnLinkPath;
    private final java.lang.Integer height;
    private final java.lang.String mimeType;
    private final java.lang.Integer width;

    public CardImage(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2) {
        this.baseCdnLinkPath = str;
        this.mimeType = str2;
        this.height = num;
        this.width = num2;
    }

    public final java.lang.String getBaseCdnLinkPath() {
        return this.baseCdnLinkPath;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final java.lang.Integer getHeight() {
        return this.height;
    }

    public final java.lang.Integer getWidth() {
        return this.width;
    }

    public final java.lang.String getStandardCardImage2() {
        java.lang.String str = this.baseCdnLinkPath;
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/$_2.JPG");
        return sb.toString();
    }

    public final java.lang.String getStandardCardImage3() {
        java.lang.String str = this.baseCdnLinkPath;
        if (str == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("/$_3.JPG");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardImage$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.baseCdnLinkPath;
        java.lang.String str2 = this.mimeType;
        java.lang.Integer num = this.height;
        java.lang.Integer num2 = this.width;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardImage(baseCdnLinkPath=");
        sb.append(str);
        sb.append(", mimeType=");
        sb.append(str2);
        sb.append(", height=");
        sb.append(num);
        sb.append(", width=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.baseCdnLinkPath;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.mimeType;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.height;
        int hashCode3 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.width;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage = (com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.baseCdnLinkPath, cardImage.baseCdnLinkPath) && kotlin.jvm.internal.Intrinsics.areEqual(this.mimeType, cardImage.mimeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, cardImage.height) && kotlin.jvm.internal.Intrinsics.areEqual(this.width, cardImage.width);
    }

    public final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage copy(java.lang.String baseCdnLinkPath, java.lang.String mimeType, java.lang.Integer height, java.lang.Integer width) {
        return new com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage(baseCdnLinkPath, mimeType, height, width);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getWidth() {
        return this.width;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Integer getHeight() {
        return this.height;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getBaseCdnLinkPath() {
        return this.baseCdnLinkPath;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage copy$default(com.paypal.oslo.feature.wallet.cards.domain.add.model.CardImage cardImage, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardImage.baseCdnLinkPath;
        }
        if ((i & 2) != 0) {
            str2 = cardImage.mimeType;
        }
        if ((i & 4) != 0) {
            num = cardImage.height;
        }
        if ((i & 8) != 0) {
            num2 = cardImage.width;
        }
        return cardImage.copy(str, str2, num, num2);
    }
}
