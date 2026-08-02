package com.paypal.oslo.feature.balance.ui.autoReload.review;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "", "<init>", "()V", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "Loading", "Error", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class ReviewState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Initial;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Initial INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Initial();

        public final int hashCode() {
            return 1559151432;
        }

        private Initial() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Initial)) {
                return false;
            }
            return true;
        }
    }

    private ReviewState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Ready;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready INSTANCE = new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready();

        public final int hashCode() {
            return -1930004825;
        }

        private Ready() {
            super(null);
        }

        public final java.lang.String toString() {
            return com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Ready)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Loading;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "step", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "getStep"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewRequestStep, "");
            this.step = reviewRequestStep;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep getStep() {
            return this.step;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep = this.step;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(step=");
            sb.append(reviewRequestStep);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.step.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) && this.step == ((com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading) other).step;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading copy(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep step) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading(step);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading copy$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Loading loading, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewRequestStep = loading.step;
            }
            return loading.copy(reviewRequestStep);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Error;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "step", "Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;)V", "component1", "()Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "component2", "()Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "copy", "(Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;)Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/balance/ui/autoReload/review/ReviewRequestStep;", "getStep", "Lcom/paypal/oslo/feature/balance/common/ui/BalanceErrorBottomSheetEnum;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum errorType;
        private final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep step;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep, com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewRequestStep, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceErrorBottomSheetEnum, "");
            this.step = reviewRequestStep;
            this.errorType = balanceErrorBottomSheetEnum;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep getStep() {
            return this.step;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep, com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(reviewRequestStep, (i & 2) != 0 ? com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum.GENERIC_AUTO_RELOAD_ERROR : balanceErrorBottomSheetEnum);
        }

        public final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep = this.step;
            com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(step=");
            sb.append(reviewRequestStep);
            sb.append(", errorType=");
            sb.append(balanceErrorBottomSheetEnum);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.step.hashCode() * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error = (com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error) other;
            return this.step == error.step && this.errorType == error.errorType;
        }

        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error copy(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep step, com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error(step, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep getStep() {
            return this.step;
        }

        public static /* synthetic */ com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error copy$default(com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewState.Error error, com.paypal.oslo.feature.balance.ui.autoReload.review.ReviewRequestStep reviewRequestStep, com.paypal.oslo.feature.balance.common.ui.BalanceErrorBottomSheetEnum balanceErrorBottomSheetEnum, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewRequestStep = error.step;
            }
            if ((i & 2) != 0) {
                balanceErrorBottomSheetEnum = error.errorType;
            }
            return error.copy(reviewRequestStep, balanceErrorBottomSheetEnum);
        }
    }

    public /* synthetic */ ReviewState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
