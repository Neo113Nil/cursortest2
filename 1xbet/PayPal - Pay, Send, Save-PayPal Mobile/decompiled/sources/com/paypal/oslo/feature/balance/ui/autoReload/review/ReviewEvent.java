package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "", "Initialize", "OnChangeOrAddClicked", "OnFiChanged", "OnAddFundingInstrument", "OnDismissFiSelection", "OnDismissError", "OnAuthorizeClicked", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnAddFundingInstrument;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnAuthorizeClicked;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnChangeOrAddClicked;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnDismissError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnDismissFiSelection;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnFiChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface ReviewEvent {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$Initialize;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize();

        public final int hashCode() {
            return 1856181091;
        }

        private Initialize() {
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnChangeOrAddClicked;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnChangeOrAddClicked implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnChangeOrAddClicked INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnChangeOrAddClicked();

        public final int hashCode() {
            return -2053505365;
        }

        private OnChangeOrAddClicked() {
        }

        public final java.lang.String toString() {
            return "OnChangeOrAddClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnChangeOrAddClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnFiChanged;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "selectedFundingInstrument", "", "options", "<init>", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "component2", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;Ljava/util/List;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnFiChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "getSelectedFundingInstrument", "Ljava/util/List;", "getOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnFiChanged implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> options;
        private final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption selectedFundingInstrument;

        /* JADX WARN: Multi-variable type inference failed */
        public OnFiChanged(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.selectedFundingInstrument = fundingInstrumentOption;
            this.options = list;
        }

        public final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> getOptions() {
            return this.options;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption = this.selectedFundingInstrument;
            java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> list = this.options;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnFiChanged(selectedFundingInstrument=");
            sb.append(fundingInstrumentOption);
            sb.append(", options=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.selectedFundingInstrument.hashCode() * 31) + this.options.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged onFiChanged = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrument, onFiChanged.selectedFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, onFiChanged.options);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged copy(com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption selectedFundingInstrument, java.util.List<? extends com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> options) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFundingInstrument, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged(selectedFundingInstrument, options);
        }

        public final java.util.List<com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption> component2() {
            return this.options;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption getSelectedFundingInstrument() {
            return this.selectedFundingInstrument;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged copy$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnFiChanged onFiChanged, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption fundingInstrumentOption, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentOption = onFiChanged.selectedFundingInstrument;
            }
            if ((i & 2) != 0) {
                list = onFiChanged.options;
            }
            return onFiChanged.copy(fundingInstrumentOption, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnAddFundingInstrument;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "", "fundingInstrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnAddFundingInstrument;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFundingInstrument implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        private final java.lang.String fundingInstrumentId;

        public OnAddFundingInstrument(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.fundingInstrumentId = str;
        }

        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.fundingInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddFundingInstrument(fundingInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrumentId, ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument) other).fundingInstrumentId);
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument copy(java.lang.String fundingInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentId, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument(fundingInstrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFundingInstrumentId() {
            return this.fundingInstrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument copy$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAddFundingInstrument onAddFundingInstrument, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAddFundingInstrument.fundingInstrumentId;
            }
            return onAddFundingInstrument.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnDismissFiSelection;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissFiSelection implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissFiSelection INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissFiSelection();

        public final int hashCode() {
            return -1858168975;
        }

        private OnDismissFiSelection() {
        }

        public final java.lang.String toString() {
            return "OnDismissFiSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissFiSelection)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnDismissError;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismissError implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissError INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissError();

        public final int hashCode() {
            return -1997150352;
        }

        private OnDismissError() {
        }

        public final java.lang.String toString() {
            return "OnDismissError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnDismissError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent$OnAuthorizeClicked;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAuthorizeClicked implements com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked();

        public final int hashCode() {
            return 1294307536;
        }

        private OnAuthorizeClicked() {
        }

        public final java.lang.String toString() {
            return "OnAuthorizeClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewEvent.OnAuthorizeClicked)) {
                return false;
            }
            return true;
        }
    }
}
