package com.paypal.oslo.feature.moneymovement.api.ui.plan;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/moneymovement/api/ui/plan/BannerData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getTitle", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BannerData {
    public static final int $stable = 0;
    private final java.lang.String message;
    private final java.lang.String title;

    public BannerData(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.title = str;
        this.message = str2;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getMessage() {
        return this.message;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.title;
        java.lang.String str2 = this.message;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BannerData(title=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.title.hashCode() * 31) + this.message.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData)) {
            return false;
        }
        com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData = (com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.title, bannerData.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, bannerData.message);
    }

    public final com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData copy(java.lang.String title, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return new com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData(title, message);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMessage() {
        return this.message;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    public static /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData copy$default(com.paypal.oslo.feature.moneymovement.api.ui.plan.BannerData bannerData, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bannerData.title;
        }
        if ((i & 2) != 0) {
            str2 = bannerData.message;
        }
        return bannerData.copy(str, str2);
    }
}
