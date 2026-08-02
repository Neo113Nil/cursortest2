package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardArt;", "", "", "primaryImageUrl", "thumbnailImageUrl", "backgroundColor", "foregroundColor", "labelColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardArt;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrimaryImageUrl", "getThumbnailImageUrl", "getBackgroundColor", "getForegroundColor", "getLabelColor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardArt {
    public static final int $stable = 0;
    private final java.lang.String backgroundColor;
    private final java.lang.String foregroundColor;
    private final java.lang.String labelColor;
    private final java.lang.String primaryImageUrl;
    private final java.lang.String thumbnailImageUrl;

    public CardArt(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.primaryImageUrl = str;
        this.thumbnailImageUrl = str2;
        this.backgroundColor = str3;
        this.foregroundColor = str4;
        this.labelColor = str5;
    }

    public final java.lang.String getPrimaryImageUrl() {
        return this.primaryImageUrl;
    }

    public final java.lang.String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final java.lang.String getForegroundColor() {
        return this.foregroundColor;
    }

    public final java.lang.String getLabelColor() {
        return this.labelColor;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.primaryImageUrl;
        java.lang.String str2 = this.thumbnailImageUrl;
        java.lang.String str3 = this.backgroundColor;
        java.lang.String str4 = this.foregroundColor;
        java.lang.String str5 = this.labelColor;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(primaryImageUrl=");
        sb.append(str);
        sb.append(", thumbnailImageUrl=");
        sb.append(str2);
        sb.append(", backgroundColor=");
        sb.append(str3);
        sb.append(", foregroundColor=");
        sb.append(str4);
        sb.append(", labelColor=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.primaryImageUrl;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.thumbnailImageUrl;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.backgroundColor;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.foregroundColor;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.labelColor;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt)) {
            return false;
        }
        com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt cardArt = (com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.primaryImageUrl, cardArt.primaryImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailImageUrl, cardArt.thumbnailImageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.backgroundColor, cardArt.backgroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.foregroundColor, cardArt.foregroundColor) && kotlin.jvm.internal.Intrinsics.areEqual(this.labelColor, cardArt.labelColor);
    }

    public final com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt copy(java.lang.String primaryImageUrl, java.lang.String thumbnailImageUrl, java.lang.String backgroundColor, java.lang.String foregroundColor, java.lang.String labelColor) {
        return new com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt(primaryImageUrl, thumbnailImageUrl, backgroundColor, foregroundColor, labelColor);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLabelColor() {
        return this.labelColor;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getForegroundColor() {
        return this.foregroundColor;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getThumbnailImageUrl() {
        return this.thumbnailImageUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPrimaryImageUrl() {
        return this.primaryImageUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt copy$default(com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.CardArt cardArt, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cardArt.primaryImageUrl;
        }
        if ((i & 2) != 0) {
            str2 = cardArt.thumbnailImageUrl;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cardArt.backgroundColor;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cardArt.foregroundColor;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cardArt.labelColor;
        }
        return cardArt.copy(str, str6, str7, str8, str5);
    }
}
