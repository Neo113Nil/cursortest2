package com.paypal.oslo.feature.wallet.banks.ui.details.model;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\n\u001a\u001e\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0011\u001a\u001e\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JJ\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042$\b\u0002\u0010\n\u001a\u001e\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R6\u0010\n\u001a\u001e\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailBanner;", "", "Lcom/paypal/pds/core/RichText;", "richText", "Lcom/paypal/pds/components/BannerStyle;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "", "onLinkClick", "<init>", "(Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/components/BannerStyle;Lkotlin/jvm/functions/Function2;)V", "component1", "()Lcom/paypal/pds/core/RichText;", "component2", "()Lcom/paypal/pds/components/BannerStyle;", "component3", "()Lkotlin/jvm/functions/Function2;", "copy", "(Lcom/paypal/pds/core/RichText;Lcom/paypal/pds/components/BannerStyle;Lkotlin/jvm/functions/Function2;)Lcom/paypal/oslo/feature/wallet/banks/ui/details/model/BankDetailBanner;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/RichText;", "getRichText", "Lcom/paypal/pds/components/BannerStyle;", "getStyle", "Lkotlin/jvm/functions/Function2;", "getOnLinkClick"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankDetailBanner {
    public static final int $stable = 0;
    private final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> onLinkClick;
    private final com.paypal.pds.core.RichText richText;
    private final com.paypal.pds.components.BannerStyle style;

    /* JADX WARN: Multi-variable type inference failed */
    public BankDetailBanner(com.paypal.pds.core.RichText richText, com.paypal.pds.components.BannerStyle bannerStyle, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerStyle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.richText = richText;
        this.style = bannerStyle;
        this.onLinkClick = function2;
    }

    public final com.paypal.pds.core.RichText getRichText() {
        return this.richText;
    }

    public final com.paypal.pds.components.BannerStyle getStyle() {
        return this.style;
    }

    public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> getOnLinkClick() {
        return this.onLinkClick;
    }

    public final java.lang.String toString() {
        com.paypal.pds.core.RichText richText = this.richText;
        com.paypal.pds.components.BannerStyle bannerStyle = this.style;
        kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> function2 = this.onLinkClick;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankDetailBanner(richText=");
        sb.append(richText);
        sb.append(", style=");
        sb.append(bannerStyle);
        sb.append(", onLinkClick=");
        sb.append(function2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.richText.hashCode() * 31) + this.style.hashCode()) * 31) + this.onLinkClick.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner bankDetailBanner = (com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.richText, bankDetailBanner.richText) && kotlin.jvm.internal.Intrinsics.areEqual(this.style, bankDetailBanner.style) && kotlin.jvm.internal.Intrinsics.areEqual(this.onLinkClick, bankDetailBanner.onLinkClick);
    }

    public final com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner copy(com.paypal.pds.core.RichText richText, com.paypal.pds.components.BannerStyle style, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> onLinkClick) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(richText, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onLinkClick, "");
        return new com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner(richText, style, onLinkClick);
    }

    public final kotlin.jvm.functions.Function2<java.lang.String, java.lang.String, kotlin.Unit> component3() {
        return this.onLinkClick;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.pds.components.BannerStyle getStyle() {
        return this.style;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.pds.core.RichText getRichText() {
        return this.richText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner copy$default(com.paypal.oslo.feature.wallet.banks.ui.details.model.BankDetailBanner bankDetailBanner, com.paypal.pds.core.RichText richText, com.paypal.pds.components.BannerStyle bannerStyle, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            richText = bankDetailBanner.richText;
        }
        if ((i & 2) != 0) {
            bannerStyle = bankDetailBanner.style;
        }
        if ((i & 4) != 0) {
            function2 = bankDetailBanner.onLinkClick;
        }
        return bankDetailBanner.copy(richText, bannerStyle, function2);
    }
}
