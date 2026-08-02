package com.paypal.oslo.feature.bnplacquisition.ui.reviewplan;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowExitConfirmationModal", "CloseAcquisition", "OpenUrl", "SaveSubmitApplicationData", "NavigateToVirtualCardOverview", "HandleTokenizationTapToPayMode", "NavigateToSetupFlow", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$HandleTokenizationTapToPayMode;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$NavigateToSetupFlow;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$SaveSubmitApplicationData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$ShowExitConfirmationModal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewPlanUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewPlanUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$ShowExitConfirmationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowExitConfirmationModal extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.ShowExitConfirmationModal INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.ShowExitConfirmationModal();

        public final int hashCode() {
            return 2048905282;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.ShowExitConfirmationModal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition();

        public final int hashCode() {
            return 795135888;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$OpenUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(java.lang.String str) {
            super("OpenUrl", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenUrl(url=");
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl) other).url);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.OpenUrl openUrl, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            return openUrl.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$SaveSubmitApplicationData;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "submitApplicationData", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$SaveSubmitApplicationData;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/SubmitVirtualCardApplicationDetailsSuccess;", "getSubmitApplicationData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SaveSubmitApplicationData extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitApplicationData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveSubmitApplicationData(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess) {
            super("SaveSubmitApplicationData", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitVirtualCardApplicationDetailsSuccess, "");
            this.submitApplicationData = submitVirtualCardApplicationDetailsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSubmitApplicationData() {
            return this.submitApplicationData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess = this.submitApplicationData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SaveSubmitApplicationData(submitApplicationData=");
            sb.append(submitVirtualCardApplicationDetailsSuccess);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.submitApplicationData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.submitApplicationData, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData) other).submitApplicationData);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitApplicationData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(submitApplicationData, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData(submitApplicationData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess getSubmitApplicationData() {
            return this.submitApplicationData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.SaveSubmitApplicationData saveSubmitApplicationData, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.SubmitVirtualCardApplicationDetailsSuccess submitVirtualCardApplicationDetailsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                submitVirtualCardApplicationDetailsSuccess = saveSubmitApplicationData.submitApplicationData;
            }
            return saveSubmitApplicationData.copy(submitVirtualCardApplicationDetailsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$NavigateToVirtualCardOverview;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToVirtualCardOverview extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview();

        public final int hashCode() {
            return -2104246611;
        }

        private NavigateToVirtualCardOverview() {
            super("NavigateToVirtualCardOverview", null);
        }

        public final java.lang.String toString() {
            return "NavigateToVirtualCardOverview";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToVirtualCardOverview)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$HandleTokenizationTapToPayMode;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HandleTokenizationTapToPayMode extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode();

        public final int hashCode() {
            return -2027313381;
        }

        private HandleTokenizationTapToPayMode() {
            super("HandleTokenizationTapToPayMode", null);
        }

        public final java.lang.String toString() {
            return "HandleTokenizationTapToPayMode";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.HandleTokenizationTapToPayMode)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect$NavigateToSetupFlow;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewplan/ReviewPlanUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSetupFlow extends com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToSetupFlow INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToSetupFlow();

        public final int hashCode() {
            return -337077276;
        }

        private NavigateToSetupFlow() {
            super("NavigateToSetupFlow", null);
        }

        public final java.lang.String toString() {
            return "NavigateToSetupFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewplan.ReviewPlanUiEffect.NavigateToSetupFlow)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewPlanUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
