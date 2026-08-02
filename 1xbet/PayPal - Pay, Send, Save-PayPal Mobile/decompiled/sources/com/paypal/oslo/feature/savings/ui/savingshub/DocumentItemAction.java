package com.paypal.oslo.feature.savings.ui.savingshub;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "", "Destination", "Pdf", "Web", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Destination;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Pdf;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Web;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface DocumentItemAction {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Destination;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "", "destinationType", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Destination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDestinationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Destination implements com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction {
        public static final int $stable = 0;
        private final java.lang.String destinationType;

        public Destination(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.destinationType = str;
        }

        public final java.lang.String getDestinationType() {
            return this.destinationType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.destinationType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Destination(destinationType=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.destinationType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination) && kotlin.jvm.internal.Intrinsics.areEqual(this.destinationType, ((com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination) other).destinationType);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination copy(java.lang.String destinationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destinationType, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination(destinationType);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDestinationType() {
            return this.destinationType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination copy$default(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Destination destination, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = destination.destinationType;
            }
            return destination.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Pdf;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Pdf;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Pdf implements com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction {
        public static final int $stable = 0;
        private final java.lang.String url;

        public Pdf(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Pdf(url=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf) other).url);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf copy$default(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Pdf pdf, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = pdf.url;
            }
            return pdf.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Web;", "Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/ui/savingshub/DocumentItemAction$Web;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Web implements com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction {
        public static final int $stable = 0;
        private final java.lang.String url;

        public Web(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Web(url=");
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
            return (other instanceof com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web) other).url);
        }

        public final com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web copy$default(com.paypal.oslo.feature.savings.ui.savingshub.DocumentItemAction.Web web, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = web.url;
            }
            return web.copy(str);
        }
    }
}
