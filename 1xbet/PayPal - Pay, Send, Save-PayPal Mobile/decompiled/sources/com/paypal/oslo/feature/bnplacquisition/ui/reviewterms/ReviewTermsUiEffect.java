package com.paypal.oslo.feature.bnplacquisition.ui.reviewterms;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\n\u000b\f\r\u000e\u000f\u0010B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "CloseAcquisition", "ShowExitConfirmationModal", "OpenUrl", "NavigateToRepaymentSelection", "ShowDocumentsHalfSheet", "ShowApprovedToast", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$NavigateToRepaymentSelection;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowApprovedToast;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowDocumentsHalfSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowExitConfirmationModal;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewTermsUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ReviewTermsUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$NavigateBack;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateBack();

        public final int hashCode() {
            return -1108983951;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$CloseAcquisition;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseAcquisition extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition();

        public final int hashCode() {
            return -1427215506;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.CloseAcquisition)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowExitConfirmationModal;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowExitConfirmationModal extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal();

        public final int hashCode() {
            return 937733668;
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
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowExitConfirmationModal)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$OpenUrl;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "", "url", "html", "downloadStaticUrl", "downloadRelativePath", "downloadFileName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$OpenUrl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl", "getHtml", "getDownloadStaticUrl", "getDownloadRelativePath", "getDownloadFileName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 0;
        private final java.lang.String downloadFileName;
        private final java.lang.String downloadRelativePath;
        private final java.lang.String downloadStaticUrl;
        private final java.lang.String html;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super("OpenUrl", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
            this.html = str2;
            this.downloadStaticUrl = str3;
            this.downloadRelativePath = str4;
            this.downloadFileName = str5;
        }

        public /* synthetic */ OpenUrl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String getHtml() {
            return this.html;
        }

        public final java.lang.String getDownloadStaticUrl() {
            return this.downloadStaticUrl;
        }

        public final java.lang.String getDownloadRelativePath() {
            return this.downloadRelativePath;
        }

        public final java.lang.String getDownloadFileName() {
            return this.downloadFileName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.String str2 = this.html;
            java.lang.String str3 = this.downloadStaticUrl;
            java.lang.String str4 = this.downloadRelativePath;
            java.lang.String str5 = this.downloadFileName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OpenUrl(url=");
            sb.append(str);
            sb.append(", html=");
            sb.append(str2);
            sb.append(", downloadStaticUrl=");
            sb.append(str3);
            sb.append(", downloadRelativePath=");
            sb.append(str4);
            sb.append(", downloadFileName=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.url.hashCode();
            java.lang.String str = this.html;
            int hashCode2 = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.downloadStaticUrl;
            int hashCode3 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.downloadRelativePath;
            int hashCode4 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.downloadFileName;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl)) {
                return false;
            }
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl openUrl = (com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.url, openUrl.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.html, openUrl.html) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadStaticUrl, openUrl.downloadStaticUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadRelativePath, openUrl.downloadRelativePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadFileName, openUrl.downloadFileName);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl copy(java.lang.String url, java.lang.String html, java.lang.String downloadStaticUrl, java.lang.String downloadRelativePath, java.lang.String downloadFileName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl(url, html, downloadStaticUrl, downloadRelativePath, downloadFileName);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getDownloadFileName() {
            return this.downloadFileName;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getDownloadRelativePath() {
            return this.downloadRelativePath;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDownloadStaticUrl() {
            return this.downloadStaticUrl;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getHtml() {
            return this.html;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.OpenUrl openUrl, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = openUrl.url;
            }
            if ((i & 2) != 0) {
                str2 = openUrl.html;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = openUrl.downloadStaticUrl;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = openUrl.downloadRelativePath;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = openUrl.downloadFileName;
            }
            return openUrl.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$NavigateToRepaymentSelection;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$NavigateToRepaymentSelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/repayments/RepaymentsSuccess;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRepaymentSelection extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRepaymentSelection(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess) {
            super("NavigateToRepaymentSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repaymentsSuccess, "");
            this.data = repaymentsSuccess;
        }

        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRepaymentSelection(data=");
            sb.append(repaymentsSuccess);
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
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection) other).data);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection copy(com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.NavigateToRepaymentSelection navigateToRepaymentSelection, com.paypal.oslo.feature.bnplacquisition.domain.model.repayments.RepaymentsSuccess repaymentsSuccess, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                repaymentsSuccess = navigateToRepaymentSelection.data;
            }
            return navigateToRepaymentSelection.copy(repaymentsSuccess);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowDocumentsHalfSheet;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;", "documentsSheetUiModel", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowDocumentsHalfSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/documents/DocumentsSheetUiModel;", "getDocumentsSheetUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDocumentsHalfSheet extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDocumentsHalfSheet(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel) {
            super("ShowDocumentsHalfSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsSheetUiModel, "");
            this.documentsSheetUiModel = documentsSheetUiModel;
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel getDocumentsSheetUiModel() {
            return this.documentsSheetUiModel;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel = this.documentsSheetUiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowDocumentsHalfSheet(documentsSheetUiModel=");
            sb.append(documentsSheetUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.documentsSheetUiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.documentsSheetUiModel, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet) other).documentsSheetUiModel);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet copy(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentsSheetUiModel, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet(documentsSheetUiModel);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel getDocumentsSheetUiModel() {
            return this.documentsSheetUiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowDocumentsHalfSheet showDocumentsHalfSheet, com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.documents.DocumentsSheetUiModel documentsSheetUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                documentsSheetUiModel = showDocumentsHalfSheet.documentsSheetUiModel;
            }
            return showDocumentsHalfSheet.copy(documentsSheetUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowApprovedToast;", "Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "text", "<init>", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)V", "component1", "()Lcom/paypal/oslo/core/commonui/utils/RefText;", "copy", "(Lcom/paypal/oslo/core/commonui/utils/RefText;)Lcom/paypal/oslo/feature/bnplacquisition/ui/reviewterms/ReviewTermsUiEffect$ShowApprovedToast;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/core/commonui/utils/RefText;", "getText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowApprovedToast extends com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.core.commonui.utils.RefText text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowApprovedToast(com.paypal.oslo.core.commonui.utils.RefText refText) {
            super("ShowApprovedToast", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refText, "");
            this.text = refText;
        }

        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.core.commonui.utils.RefText refText = this.text;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowApprovedToast(text=");
            sb.append(refText);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.text.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast) && kotlin.jvm.internal.Intrinsics.areEqual(this.text, ((com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast) other).text);
        }

        public final com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast copy(com.paypal.oslo.core.commonui.utils.RefText text) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(text, "");
            return new com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast(text);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.core.commonui.utils.RefText getText() {
            return this.text;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast copy$default(com.paypal.oslo.feature.bnplacquisition.ui.reviewterms.ReviewTermsUiEffect.ShowApprovedToast showApprovedToast, com.paypal.oslo.core.commonui.utils.RefText refText, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                refText = showApprovedToast.text;
            }
            return showApprovedToast.copy(refText);
        }
    }

    public /* synthetic */ ReviewTermsUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
