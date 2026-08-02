package com.paypal.oslo.feature.subscriptions.shared.iab.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "", "BackClicked", "OnSystemBackClicked", "UrlLoadFailed", "TryAgainClicked", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$BackClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$OnSystemBackClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$TryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$UrlLoadFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface GenericInAppBrowserEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$BackClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked();

        public final int hashCode() {
            return 1927626111;
        }

        private BackClicked() {
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$OnSystemBackClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSystemBackClicked implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.OnSystemBackClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.OnSystemBackClicked();

        public final int hashCode() {
            return -1857835855;
        }

        private OnSystemBackClicked() {
        }

        public final java.lang.String toString() {
            return "OnSystemBackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.OnSystemBackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$UrlLoadFailed;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$UrlLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UrlLoadFailed implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        public UrlLoadFailed(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UrlLoadFailed(url=");
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
            return (other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed) other).url);
        }

        public final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed copy$default(com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.UrlLoadFailed urlLoadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = urlLoadFailed.url;
            }
            return urlLoadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent$TryAgainClicked;", "Lcom/paypal/oslo/feature/subscriptions/shared/iab/ui/GenericInAppBrowserEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TryAgainClicked implements com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.TryAgainClicked INSTANCE = new com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.TryAgainClicked();

        public final int hashCode() {
            return 408789697;
        }

        private TryAgainClicked() {
        }

        public final java.lang.String toString() {
            return "TryAgainClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.subscriptions.shared.iab.ui.GenericInAppBrowserEvent.TryAgainClicked)) {
                return false;
            }
            return true;
        }
    }
}
