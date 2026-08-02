package com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/earncategory/EarnCategoryCardUiData;", "", "", "imageUrl", "title", "subtitle", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "buttonCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/common/ui/components/earncategory/EarnCategoryCardUiData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getImageUrl", "getTitle", "getSubtitle", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/ButtonUiData;", "getButtonCta"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class EarnCategoryCardUiData {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonCta;
    private final java.lang.String imageUrl;
    private final java.lang.String subtitle;
    private final java.lang.String title;

    public EarnCategoryCardUiData(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonUiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonUiData, "");
        this.imageUrl = str;
        this.title = str2;
        this.subtitle = str3;
        this.buttonCta = buttonUiData;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData getButtonCta() {
        return this.buttonCta;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.imageUrl;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.subtitle;
        com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonUiData = this.buttonCta;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EarnCategoryCardUiData(imageUrl=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subtitle=");
        sb.append(str3);
        sb.append(", buttonCta=");
        sb.append(buttonUiData);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.imageUrl.hashCode() * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.buttonCta.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData earnCategoryCardUiData = (com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, earnCategoryCardUiData.imageUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, earnCategoryCardUiData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, earnCategoryCardUiData.subtitle) && kotlin.jvm.internal.Intrinsics.areEqual(this.buttonCta, earnCategoryCardUiData.buttonCta);
    }

    public final com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData copy(java.lang.String imageUrl, java.lang.String title, java.lang.String subtitle, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonCta) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtitle, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonCta, "");
        return new com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData(imageUrl, title, subtitle, buttonCta);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData getButtonCta() {
        return this.buttonCta;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.earncategory.EarnCategoryCardUiData earnCategoryCardUiData, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.ButtonUiData buttonUiData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = earnCategoryCardUiData.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = earnCategoryCardUiData.title;
        }
        if ((i & 4) != 0) {
            str3 = earnCategoryCardUiData.subtitle;
        }
        if ((i & 8) != 0) {
            buttonUiData = earnCategoryCardUiData.buttonCta;
        }
        return earnCategoryCardUiData.copy(str, str2, str3, buttonUiData);
    }
}
