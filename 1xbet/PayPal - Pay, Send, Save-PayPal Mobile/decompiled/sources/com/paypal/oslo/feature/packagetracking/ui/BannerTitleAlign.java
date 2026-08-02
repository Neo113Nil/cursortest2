package com.paypal.oslo.feature.packagetracking.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/ui/BannerTitleAlign;", "", "", "subtitle", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/packagetracking/ui/BannerTitleAlign;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSubtitle", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "vertical", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "getVertical", "()Landroidx/compose/foundation/layout/Arrangement$Vertical;", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontal", "Landroidx/compose/ui/Alignment$Horizontal;", "getHorizontal", "()Landroidx/compose/ui/Alignment$Horizontal;", "Landroidx/compose/ui/text/style/TextAlign;", "textAlign", com.visa.cbp.getEncExpo.warmup, "getTextAlign-e0LSkKk"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BannerTitleAlign {
    public static final int $stable = 0;
    private final androidx.compose.ui.Alignment.Horizontal horizontal;
    private final java.lang.String subtitle;
    private final int textAlign;
    private final androidx.compose.foundation.layout.Arrangement.Vertical vertical;

    public BannerTitleAlign(java.lang.String str) {
        androidx.compose.foundation.layout.Arrangement.HorizontalOrVertical top;
        androidx.compose.ui.Alignment.Horizontal start;
        int m8448getStarte0LSkKk;
        this.subtitle = str;
        if (str == null) {
            top = androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter();
        } else {
            top = androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop();
        }
        this.vertical = top;
        if (str == null) {
            start = androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally();
        } else {
            start = androidx.compose.ui.Alignment.INSTANCE.getStart();
        }
        this.horizontal = start;
        if (str == null) {
            m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk();
        } else {
            m8448getStarte0LSkKk = androidx.compose.ui.text.style.TextAlign.INSTANCE.m8448getStarte0LSkKk();
        }
        this.textAlign = m8448getStarte0LSkKk;
    }

    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public final androidx.compose.foundation.layout.Arrangement.Vertical getVertical() {
        return this.vertical;
    }

    public final androidx.compose.ui.Alignment.Horizontal getHorizontal() {
        return this.horizontal;
    }

    /* renamed from: getTextAlign-e0LSkKk, reason: not valid java name and from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.subtitle;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BannerTitleAlign(subtitle=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.subtitle;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign) && kotlin.jvm.internal.Intrinsics.areEqual(this.subtitle, ((com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign) other).subtitle);
    }

    public final com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign copy(java.lang.String subtitle) {
        return new com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign(subtitle);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSubtitle() {
        return this.subtitle;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign copy$default(com.paypal.oslo.feature.packagetracking.ui.BannerTitleAlign bannerTitleAlign, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerTitleAlign.subtitle;
        }
        return bannerTitleAlign.copy(str);
    }
}
