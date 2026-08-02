package org.betup.ui.dialogs.offer.webview;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OfferWebLoadSpec.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "InlineHtml", "RemoteUrl", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec$InlineHtml;", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec$RemoteUrl;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OfferWebLoadSpec {
    public static final int $stable = 0;

    public /* synthetic */ OfferWebLoadSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private OfferWebLoadSpec() {
    }

    /* compiled from: OfferWebLoadSpec.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec$InlineHtml;", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "html", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineHtml extends OfferWebLoadSpec {
        public static final int $stable = 0;
        private final String html;

        public static /* synthetic */ InlineHtml copy$default(InlineHtml inlineHtml, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inlineHtml.html;
            }
            return inlineHtml.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHtml() {
            return this.html;
        }

        public final InlineHtml copy(String html) {
            Intrinsics.checkNotNullParameter(html, "html");
            return new InlineHtml(html);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InlineHtml) && Intrinsics.areEqual(this.html, ((InlineHtml) other).html);
        }

        public int hashCode() {
            return this.html.hashCode();
        }

        public String toString() {
            return "InlineHtml(html=" + this.html + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InlineHtml(String html) {
            super(null);
            Intrinsics.checkNotNullParameter(html, "html");
            this.html = html;
        }

        public final String getHtml() {
            return this.html;
        }
    }

    /* compiled from: OfferWebLoadSpec.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec$RemoteUrl;", "Lorg/betup/ui/dialogs/offer/webview/OfferWebLoadSpec;", "url", "", "priceInjection", "Lorg/betup/ui/dialogs/offer/webview/OfferWebPriceInjection;", "prefetchedDocumentHtml", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Lorg/betup/ui/dialogs/offer/webview/OfferWebPriceInjection;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getPriceInjection", "()Lorg/betup/ui/dialogs/offer/webview/OfferWebPriceInjection;", "getPrefetchedDocumentHtml", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoteUrl extends OfferWebLoadSpec {
        public static final int $stable = 8;
        private final String prefetchedDocumentHtml;
        private final OfferWebPriceInjection priceInjection;
        private final String url;

        public static /* synthetic */ RemoteUrl copy$default(RemoteUrl remoteUrl, String str, OfferWebPriceInjection offerWebPriceInjection, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = remoteUrl.url;
            }
            if ((i & 2) != 0) {
                offerWebPriceInjection = remoteUrl.priceInjection;
            }
            if ((i & 4) != 0) {
                str2 = remoteUrl.prefetchedDocumentHtml;
            }
            return remoteUrl.copy(str, offerWebPriceInjection, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final OfferWebPriceInjection getPriceInjection() {
            return this.priceInjection;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPrefetchedDocumentHtml() {
            return this.prefetchedDocumentHtml;
        }

        public final RemoteUrl copy(String url, OfferWebPriceInjection priceInjection, String prefetchedDocumentHtml) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new RemoteUrl(url, priceInjection, prefetchedDocumentHtml);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RemoteUrl)) {
                return false;
            }
            RemoteUrl remoteUrl = (RemoteUrl) other;
            return Intrinsics.areEqual(this.url, remoteUrl.url) && Intrinsics.areEqual(this.priceInjection, remoteUrl.priceInjection) && Intrinsics.areEqual(this.prefetchedDocumentHtml, remoteUrl.prefetchedDocumentHtml);
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            OfferWebPriceInjection offerWebPriceInjection = this.priceInjection;
            int hashCode2 = (hashCode + (offerWebPriceInjection == null ? 0 : offerWebPriceInjection.hashCode())) * 31;
            String str = this.prefetchedDocumentHtml;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "RemoteUrl(url=" + this.url + ", priceInjection=" + this.priceInjection + ", prefetchedDocumentHtml=" + this.prefetchedDocumentHtml + ")";
        }

        public /* synthetic */ RemoteUrl(String str, OfferWebPriceInjection offerWebPriceInjection, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : offerWebPriceInjection, (i & 4) != 0 ? null : str2);
        }

        public final String getUrl() {
            return this.url;
        }

        public final OfferWebPriceInjection getPriceInjection() {
            return this.priceInjection;
        }

        public final String getPrefetchedDocumentHtml() {
            return this.prefetchedDocumentHtml;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteUrl(String url, OfferWebPriceInjection offerWebPriceInjection, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.priceInjection = offerWebPriceInjection;
            this.prefetchedDocumentHtml = str;
        }
    }
}
