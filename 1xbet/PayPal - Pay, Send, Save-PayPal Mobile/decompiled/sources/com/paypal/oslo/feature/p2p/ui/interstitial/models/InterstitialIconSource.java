package com.paypal.oslo.feature.p2p.ui.interstitial.models;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "", "<init>", "()V", "PdsIcon", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$PdsIcon;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$Url;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class InterstitialIconSource {
    public static final int $stable = 0;

    private InterstitialIconSource() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$PdsIcon;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "Lcom/paypal/pds/core/Icon;", "icon", "<init>", "(Lcom/paypal/pds/core/Icon;)V", "component1", "()Lcom/paypal/pds/core/Icon;", "copy", "(Lcom/paypal/pds/core/Icon;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$PdsIcon;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/pds/core/Icon;", "getIcon"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PdsIcon extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource {
        public static final int $stable = 0;
        private final com.paypal.pds.core.Icon icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PdsIcon(com.paypal.pds.core.Icon icon) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            this.icon = icon;
        }

        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public final java.lang.String toString() {
            com.paypal.pds.core.Icon icon = this.icon;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PdsIcon(icon=");
            sb.append(icon);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.icon.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon) other).icon);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon copy(com.paypal.pds.core.Icon icon) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon(icon);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.pds.core.Icon getIcon() {
            return this.icon;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.PdsIcon pdsIcon, com.paypal.pds.core.Icon icon, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                icon = pdsIcon.icon;
            }
            return pdsIcon.copy(icon);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$Url;", "Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/interstitial/models/InterstitialIconSource$Url;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Url extends com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource {
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
            return (other instanceof com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url) other).url);
        }

        public final com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url copy$default(com.paypal.oslo.feature.p2p.ui.interstitial.models.InterstitialIconSource.Url url, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = url.url;
            }
            return url.copy(str);
        }
    }

    public /* synthetic */ InterstitialIconSource(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
