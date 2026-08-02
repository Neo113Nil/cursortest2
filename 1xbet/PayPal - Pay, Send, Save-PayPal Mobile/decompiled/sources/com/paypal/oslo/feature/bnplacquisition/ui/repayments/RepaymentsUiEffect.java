package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\u000f\u0010\u0011\u0012\u0013"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowExitConfirmationModal", "CloseAcquisition", "OpenUrl", "NavigateToLinkCard", "NavigateToVirtualCardOverviewScreen", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$NavigateToLinkCard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$NavigateToVirtualCardOverviewScreen;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$ShowExitConfirmationModal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class RepaymentsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RepaymentsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$ShowExitConfirmationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowExitConfirmationModal extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal();

        public final int hashCode() {
            return -1959073086;
        }

        private ShowExitConfirmationModal() {
            super("ShowExitConfirmationModal", null);
        }

        public final java.lang.String toString() {
            return "ShowExitConfirmationModal";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.ShowExitConfirmationModal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition();

        public final int hashCode() {
            return -286661360;
        }

        private CloseAcquisition() {
            super("CloseAcquisition", null);
        }

        public final java.lang.String toString() {
            return "CloseAcquisition";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "", "url", "html", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$OpenUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getHtml"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String html;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(java.lang.String str, java.lang.String str2) {
            super("OpenUrl", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.html = str2;
        }

        public /* synthetic */ OpenUrl(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getHtml() {
            return this.html;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.html;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenUrl(url=");
            sb.append(str);
            sb.append(", html=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.html;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl openUrl = (com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openUrl.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.html, openUrl.html);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl copy(java.lang.String url, java.lang.String html) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl(url, html);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHtml() {
            return this.html;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.OpenUrl openUrl, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            if ((i & 2) != 0) {
                str2 = openUrl.html;
            }
            return openUrl.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$NavigateToLinkCard;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToLinkCard extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToLinkCard INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToLinkCard();

        public final int hashCode() {
            return -1170727439;
        }

        private NavigateToLinkCard() {
            super("NavigateToLinkCard", null);
        }

        public final java.lang.String toString() {
            return "NavigateToLinkCard";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToLinkCard)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$NavigateToVirtualCardOverviewScreen;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/repayments/RepaymentsUiEffect$NavigateToVirtualCardOverviewScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverviewScreen extends com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToVirtualCardOverviewScreen(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess) {
            super("NavigateToVirtualCardOverviewScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitVirtualCardApplicationDetailsSuccess, "");
            this.data = submitVirtualCardApplicationDetailsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToVirtualCardOverviewScreen(data=");
            sb.append(submitVirtualCardApplicationDetailsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen copy$default(com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiEffect.NavigateToVirtualCardOverviewScreen navigateToVirtualCardOverviewScreen, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                submitVirtualCardApplicationDetailsSuccess = navigateToVirtualCardOverviewScreen.data;
            }
            return navigateToVirtualCardOverviewScreen.copy(submitVirtualCardApplicationDetailsSuccess);
        }
    }

    public /* synthetic */ RepaymentsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
