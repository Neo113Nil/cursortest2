package com.paypal.oslo.feature.taptopay.ui.paymode.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;", "", "", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "cardArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/taptopay/ui/paymode/model/PromoCardContent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getDescription", "getCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PromoCardContent {
    public static final int $stable = 0;
    private final java.lang.String cardArt;
    private final java.lang.String description;
    private final java.lang.String title;

    public PromoCardContent(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.title = str;
        this.description = str2;
        this.cardArt = str3;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getCardArt() {
        return this.cardArt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.description;
        java.lang.String str3 = this.cardArt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PromoCardContent(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", cardArt=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.cardArt.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent)) {
            return false;
        }
        com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent = (com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, promoCardContent.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, promoCardContent.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, promoCardContent.cardArt);
    }

    public final com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent copy(java.lang.String title, java.lang.String description, java.lang.String cardArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArt, "");
        return new com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent(title, description, cardArt);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCardArt() {
        return this.cardArt;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent copy$default(com.paypal.oslo.feature.taptopay.ui.paymode.model.PromoCardContent promoCardContent, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = promoCardContent.title;
        }
        if ((i & 2) != 0) {
            str2 = promoCardContent.description;
        }
        if ((i & 4) != 0) {
            str3 = promoCardContent.cardArt;
        }
        return promoCardContent.copy(str, str2, str3);
    }
}
