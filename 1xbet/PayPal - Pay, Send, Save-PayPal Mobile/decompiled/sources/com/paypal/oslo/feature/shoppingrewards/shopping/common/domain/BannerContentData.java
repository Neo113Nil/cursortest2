package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016JF\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010\u0014R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "", "", "textResId", "", "textString", "ctaTextResId", "", "useBadge", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;", "ctaMode", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;IZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "()Z", "component5", "()Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;IZLcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerContentData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/Integer;", "getTextResId", "Ljava/lang/String;", "getTextString", com.visa.cbp.getEncExpo.warmup, "getCtaTextResId", "Z", "getUseBadge", "Lcom/paypal/oslo/feature/shoppingrewards/shopping/common/domain/BannerCtaMode;", "getCtaMode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BannerContentData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode ctaMode;
    private final int ctaTextResId;
    private final java.lang.Integer textResId;
    private final java.lang.String textString;
    private final boolean useBadge;

    public BannerContentData(java.lang.Integer num, java.lang.String str, int i, boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bannerCtaMode, "");
        this.textResId = num;
        this.textString = str;
        this.ctaTextResId = i;
        this.useBadge = z;
        this.ctaMode = bannerCtaMode;
    }

    public final java.lang.Integer getTextResId() {
        return this.textResId;
    }

    public final java.lang.String getTextString() {
        return this.textString;
    }

    public /* synthetic */ BannerContentData(java.lang.Integer num, java.lang.String str, int i, boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) == 0 ? str : null, (i2 & 4) != 0 ? com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_shared_action_learn_more : i, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode.Visible : bannerCtaMode);
    }

    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }

    public final boolean getUseBadge() {
        return this.useBadge;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode getCtaMode() {
        return this.ctaMode;
    }

    public final java.lang.String toString() {
        java.lang.Integer num = this.textResId;
        java.lang.String str = this.textString;
        int i = this.ctaTextResId;
        boolean z = this.useBadge;
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode = this.ctaMode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BannerContentData(textResId=");
        sb.append(num);
        sb.append(", textString=");
        sb.append(str);
        sb.append(", ctaTextResId=");
        sb.append(i);
        sb.append(", useBadge=");
        sb.append(z);
        sb.append(", ctaMode=");
        sb.append(bannerCtaMode);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.Integer num = this.textResId;
        int hashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.textString;
        return (((((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.ctaTextResId)) * 31) + java.lang.Boolean.hashCode(this.useBadge)) * 31) + this.ctaMode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData = (com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.textResId, bannerContentData.textResId) && kotlin.jvm.internal.Intrinsics.areEqual(this.textString, bannerContentData.textString) && this.ctaTextResId == bannerContentData.ctaTextResId && this.useBadge == bannerContentData.useBadge && this.ctaMode == bannerContentData.ctaMode;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData copy(java.lang.Integer textResId, java.lang.String textString, int ctaTextResId, boolean useBadge, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode ctaMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ctaMode, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData(textResId, textString, ctaTextResId, useBadge, ctaMode);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode getCtaMode() {
        return this.ctaMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseBadge() {
        return this.useBadge;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCtaTextResId() {
        return this.ctaTextResId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTextString() {
        return this.textString;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.Integer getTextResId() {
        return this.textResId;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerContentData bannerContentData, java.lang.Integer num, java.lang.String str, int i, boolean z, com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.BannerCtaMode bannerCtaMode, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            num = bannerContentData.textResId;
        }
        if ((i2 & 2) != 0) {
            str = bannerContentData.textString;
        }
        java.lang.String str2 = str;
        if ((i2 & 4) != 0) {
            i = bannerContentData.ctaTextResId;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = bannerContentData.useBadge;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            bannerCtaMode = bannerContentData.ctaMode;
        }
        return bannerContentData.copy(num, str2, i3, z2, bannerCtaMode);
    }

    public BannerContentData() {
        this(null, null, 0, false, null, 31, null);
    }
}
