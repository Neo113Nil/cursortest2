package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000eJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankBanner;", "", "", "messageResId", "", "", "messageArgs", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lcom/paypal/oslo/feature/wallet/banks/domain/model/ClickableTextSegment;", "clickableSegments", "<init>", "(ILjava/util/List;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;Ljava/util/List;)V", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;", "component4", "copy", "(ILjava/util/List;Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankBanner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMessageResId", "Ljava/util/List;", "getMessageArgs", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BannerStyle;", "getStyle", "getClickableSegments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankBanner {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> clickableSegments;
    private final java.util.List<java.lang.String> messageArgs;
    private final int messageResId;
    private final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle style;

    public BankBanner(int i, java.util.List<java.lang.String> list, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.messageResId = i;
        this.messageArgs = list;
        this.style = bannerStyle;
        this.clickableSegments = list2;
    }

    public final int getMessageResId() {
        return this.messageResId;
    }

    public /* synthetic */ BankBanner(int i, java.util.List list, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle, java.util.List list2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, bannerStyle, (i2 & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.util.List<java.lang.String> getMessageArgs() {
        return this.messageArgs;
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle getStyle() {
        return this.style;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> getClickableSegments() {
        return this.clickableSegments;
    }

    public final java.lang.String toString() {
        int i = this.messageResId;
        java.util.List<java.lang.String> list = this.messageArgs;
        com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle = this.style;
        java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> list2 = this.clickableSegments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankBanner(messageResId=");
        sb.append(i);
        sb.append(", messageArgs=");
        sb.append(list);
        sb.append(", style=");
        sb.append(bannerStyle);
        sb.append(", clickableSegments=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((java.lang.Integer.hashCode(this.messageResId) * 31) + this.messageArgs.hashCode()) * 31) + this.style.hashCode()) * 31) + this.clickableSegments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner bankBanner = (com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner) other;
        return this.messageResId == bankBanner.messageResId && kotlin.jvm.internal.Intrinsics.areEqual(this.messageArgs, bankBanner.messageArgs) && this.style == bankBanner.style && kotlin.jvm.internal.Intrinsics.areEqual(this.clickableSegments, bankBanner.clickableSegments);
    }

    public final com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner copy(int messageResId, java.util.List<java.lang.String> messageArgs, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle style, java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> clickableSegments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageArgs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickableSegments, "");
        return new com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner(messageResId, messageArgs, style, clickableSegments);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.banks.domain.model.ClickableTextSegment> component4() {
        return this.clickableSegments;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle getStyle() {
        return this.style;
    }

    public final java.util.List<java.lang.String> component2() {
        return this.messageArgs;
    }

    /* renamed from: component1, reason: from getter */
    public final int getMessageResId() {
        return this.messageResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankBanner bankBanner, int i, java.util.List list, com.paypal.oslo.feature.wallet.banks.domain.model.BannerStyle bannerStyle, java.util.List list2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = bankBanner.messageResId;
        }
        if ((i2 & 2) != 0) {
            list = bankBanner.messageArgs;
        }
        if ((i2 & 4) != 0) {
            bannerStyle = bankBanner.style;
        }
        if ((i2 & 8) != 0) {
            list2 = bankBanner.clickableSegments;
        }
        return bankBanner.copy(i, list, bannerStyle, list2);
    }
}
