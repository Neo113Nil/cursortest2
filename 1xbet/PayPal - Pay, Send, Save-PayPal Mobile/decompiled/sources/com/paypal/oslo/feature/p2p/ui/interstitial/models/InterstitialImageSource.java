package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "", "<init>", "()V", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "Drawable", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Drawable;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Url;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialImageSource {
    public static final int $stable = 0;

    private InterstitialImageSource() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Url;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Url;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Url extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Url(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Url(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url) other).url);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Url url, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            return url.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Drawable;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource;", "", "resId", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialImageSource$Drawable;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Drawable extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource {
        public static final int $stable = 0;
        private final int resId;

        public Drawable(int i) {
            super(null);
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }

        public final java.lang.String toString() {
            int i = this.resId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Drawable(resId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.resId);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable) && this.resId == ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable) other).resId;
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable copy(int resId) {
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable(resId);
        }

        /* renamed from: component1, reason: from getter */
        public final int getResId() {
            return this.resId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialImageSource.Drawable drawable, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = drawable.resId;
            }
            return drawable.copy(i);
        }
    }

    public /* synthetic */ InterstitialImageSource(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
