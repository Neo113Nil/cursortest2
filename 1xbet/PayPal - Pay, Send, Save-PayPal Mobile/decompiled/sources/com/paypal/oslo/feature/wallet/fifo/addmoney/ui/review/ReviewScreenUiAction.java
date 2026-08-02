package com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "", "<init>", "()V", "ToggleFundingSourceSection", "AddNewFundingSource", "SelectFundingInstrument", "ViewIneligibleFundingSources", "SubmitAddMoney", "NavigateBack", "EndFlow", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$AddNewFundingSource;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$EndFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$NavigateBack;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$SubmitAddMoney;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$ToggleFundingSourceSection;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$ViewIneligibleFundingSources;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ReviewScreenUiAction {
    public static final int $stable = 0;

    private ReviewScreenUiAction() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$ToggleFundingSourceSection;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToggleFundingSourceSection extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ToggleFundingSourceSection INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ToggleFundingSourceSection();

        public final int hashCode() {
            return 2033975092;
        }

        private ToggleFundingSourceSection() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ToggleFundingSourceSection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ToggleFundingSourceSection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$AddNewFundingSource;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "config", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$AddNewFundingSource;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/wallet/fifo/common/ui/AddFIConfig;", "getConfig"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddNewFundingSource extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig config;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddNewFundingSource(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addFIConfig, "");
            this.config = addFIConfig;
        }

        public /* synthetic */ AddNewFundingSource(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig(null, null, null, null, null, 31, null) : addFIConfig);
        }

        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig getConfig() {
            return this.config;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig = this.config;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddNewFundingSource(config=");
            sb.append(addFIConfig);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.config.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource) && kotlin.jvm.internal.Intrinsics.areEqual(this.config, ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource) other).config);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource copy(com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource(config);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig getConfig() {
            return this.config;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.AddNewFundingSource addNewFundingSource, com.paypal.oslo.feature.wallet.fifo.common.ui.AddFIConfig addFIConfig, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                addFIConfig = addNewFundingSource.config;
            }
            return addNewFundingSource.copy(addFIConfig);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AddNewFundingSource() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$SelectFundingInstrument;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "", "fiID", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$SelectFundingInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFiID"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectFundingInstrument extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        private final java.lang.String fiID;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectFundingInstrument(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fiID = str;
        }

        public final java.lang.String getFiID() {
            return this.fiID;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fiID;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectFundingInstrument(fiID=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fiID.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiID, ((com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument) other).fiID);
        }

        public final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument copy(java.lang.String fiID) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiID, "");
            return new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument(fiID);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFiID() {
            return this.fiID;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument copy$default(com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SelectFundingInstrument selectFundingInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectFundingInstrument.fiID;
            }
            return selectFundingInstrument.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$ViewIneligibleFundingSources;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewIneligibleFundingSources extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ViewIneligibleFundingSources INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ViewIneligibleFundingSources();

        public final int hashCode() {
            return -281209457;
        }

        private ViewIneligibleFundingSources() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ViewIneligibleFundingSources";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.ViewIneligibleFundingSources)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$SubmitAddMoney;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SubmitAddMoney extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SubmitAddMoney INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SubmitAddMoney();

        public final int hashCode() {
            return -2051081014;
        }

        private SubmitAddMoney() {
            super(null);
        }

        public final java.lang.String toString() {
            return "SubmitAddMoney";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.SubmitAddMoney)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$NavigateBack;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.NavigateBack INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.NavigateBack();

        public final int hashCode() {
            return -297125205;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction$EndFlow;", "Lcom/paypal/oslo/feature/wallet/fifo/addmoney/ui/review/ReviewScreenUiAction;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EndFlow extends com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.EndFlow INSTANCE = new com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.EndFlow();

        public final int hashCode() {
            return -1592698858;
        }

        private EndFlow() {
            super(null);
        }

        public final java.lang.String toString() {
            return "EndFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.addmoney.ui.review.ReviewScreenUiAction.EndFlow)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReviewScreenUiAction(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
