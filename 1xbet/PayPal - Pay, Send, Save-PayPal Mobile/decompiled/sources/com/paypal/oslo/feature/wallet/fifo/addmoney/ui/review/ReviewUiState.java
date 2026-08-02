package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState;", "", "<init>", "()V", "Loading", "Content", "Error", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Content;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Loading;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ReviewUiState {
    public static final int $stable = 0;

    private ReviewUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Loading();

        public final int hashCode() {
            return 1918799654;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Content;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState;", "", "amount", "currencyCode", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "fundingSourceSection", "Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;", "totalSection", "", "addFIButtonTextRes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "component4", "()Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;", "component5", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;Ljava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount", "getCurrencyCode", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/FundingSourceSection;", "getFundingSourceSection", "Lcom/paypal/oslo/feature/wallet/common/model/TotalSectionModel;", "getTotalSection", "Ljava/lang/Integer;", "getAddFIButtonTextRes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState {
        public static final int $stable = 0;
        private final java.lang.Integer addFIButtonTextRes;
        private final java.lang.String amount;
        private final java.lang.String currencyCode;
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection;
        private final com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalSectionModel, "");
            this.amount = str;
            this.currencyCode = str2;
            this.fundingSourceSection = fundingSourceSection;
            this.totalSection = totalSectionModel;
            this.addFIButtonTextRes = num;
        }

        public /* synthetic */ Content(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, fundingSourceSection, totalSectionModel, (i & 16) != 0 ? null : num);
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection getFundingSourceSection() {
            return this.fundingSourceSection;
        }

        public final com.paypal.oslo.feature.wallet.common.model.TotalSectionModel getTotalSection() {
            return this.totalSection;
        }

        public final java.lang.Integer getAddFIButtonTextRes() {
            return this.addFIButtonTextRes;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.String str2 = this.currencyCode;
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection = this.fundingSourceSection;
            com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel = this.totalSection;
            java.lang.Integer num = this.addFIButtonTextRes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(amount=");
            sb.append(str);
            sb.append(", currencyCode=");
            sb.append(str2);
            sb.append(", fundingSourceSection=");
            sb.append(fundingSourceSection);
            sb.append(", totalSection=");
            sb.append(totalSectionModel);
            sb.append(", addFIButtonTextRes=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.amount.hashCode();
            int hashCode2 = this.currencyCode.hashCode();
            int hashCode3 = this.fundingSourceSection.hashCode();
            int hashCode4 = this.totalSection.hashCode();
            java.lang.Integer num = this.addFIButtonTextRes;
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amount, content.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, content.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSourceSection, content.fundingSourceSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalSection, content.totalSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.addFIButtonTextRes, content.addFIButtonTextRes);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content copy(java.lang.String amount, java.lang.String currencyCode, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSection, java.lang.Integer addFIButtonTextRes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalSection, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content(amount, currencyCode, fundingSourceSection, totalSection, addFIButtonTextRes);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.Integer getAddFIButtonTextRes() {
            return this.addFIButtonTextRes;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.model.TotalSectionModel getTotalSection() {
            return this.totalSection;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection getFundingSourceSection() {
            return this.fundingSourceSection;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCurrencyCode() {
            return this.currencyCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Content content, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection, com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = content.amount;
            }
            if ((i & 2) != 0) {
                str2 = content.currencyCode;
            }
            java.lang.String str3 = str2;
            if ((i & 4) != 0) {
                fundingSourceSection = content.fundingSourceSection;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.FundingSourceSection fundingSourceSection2 = fundingSourceSection;
            if ((i & 8) != 0) {
                totalSectionModel = content.totalSection;
            }
            com.paypal.oslo.feature.wallet.common.model.TotalSectionModel totalSectionModel2 = totalSectionModel;
            if ((i & 16) != 0) {
                num = content.addFIButtonTextRes;
            }
            return content.copy(str, str3, fundingSourceSection2, totalSectionModel2, num);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState;", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "errorMessageRes", "errorDescRes", "", "errorCode", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ErrorAction;", "errorAction", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ErrorAction;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ErrorAction;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Lcom/paypal/oslo/feature/wallet/common/ui/UiText;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ErrorAction;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/common/ui/UiText;", "getErrorMessageRes", "getErrorDescRes", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ErrorAction;", "getErrorAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.wallet.common.ui.UiText errorDescRes;
        private final com.paypal.oslo.feature.wallet.common.ui.UiText errorMessageRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiText2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorAction, "");
            this.errorMessageRes = uiText;
            this.errorDescRes = uiText2;
            this.errorCode = str;
            this.errorAction = errorAction;
        }

        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorDescRes() {
            return this.errorDescRes;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(uiText, uiText2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction.EndFlow : errorAction);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction getErrorAction() {
            return this.errorAction;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.common.ui.UiText uiText = this.errorMessageRes;
            com.paypal.oslo.feature.wallet.common.ui.UiText uiText2 = this.errorDescRes;
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction = this.errorAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessageRes=");
            sb.append(uiText);
            sb.append(", errorDescRes=");
            sb.append(uiText2);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(", errorAction=");
            sb.append(errorAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorMessageRes.hashCode();
            int hashCode2 = this.errorDescRes.hashCode();
            java.lang.String str = this.errorCode;
            return (((((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.errorAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error error = (com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessageRes, error.errorMessageRes) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescRes, error.errorDescRes) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && this.errorAction == error.errorAction;
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error copy(com.paypal.oslo.feature.wallet.common.ui.UiText errorMessageRes, com.paypal.oslo.feature.wallet.common.ui.UiText errorDescRes, java.lang.String errorCode, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessageRes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorDescRes, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorAction, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error(errorMessageRes, errorDescRes, errorCode, errorAction);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction getErrorAction() {
            return this.errorAction;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorDescRes() {
            return this.errorDescRes;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.common.ui.UiText getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewUiState.Error error, com.paypal.oslo.feature.wallet.common.ui.UiText uiText, com.paypal.oslo.feature.wallet.common.ui.UiText uiText2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ErrorAction errorAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                uiText = error.errorMessageRes;
            }
            if ((i & 2) != 0) {
                uiText2 = error.errorDescRes;
            }
            if ((i & 4) != 0) {
                str = error.errorCode;
            }
            if ((i & 8) != 0) {
                errorAction = error.errorAction;
            }
            return error.copy(uiText, uiText2, str, errorAction);
        }
    }

    public /* synthetic */ ReviewUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
