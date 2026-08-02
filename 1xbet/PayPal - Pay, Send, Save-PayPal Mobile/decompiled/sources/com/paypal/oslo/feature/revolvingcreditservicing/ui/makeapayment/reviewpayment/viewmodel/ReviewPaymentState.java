package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0001\u0003\u0014\u0015\u0016"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "p1", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "readyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "getReadyInfo", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "Initial", "Loading", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "ReadyInfo", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ReviewPaymentState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 8;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo;

    private ReviewPaymentState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo) {
        this.name = str;
        this.readyInfo = readyInfo;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo getReadyInfo() {
        return this.readyInfo;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial();
        public static final int $stable = 8;

        public final int hashCode() {
            return -491791084;
        }

        private Initial() {
            super("Initial", com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentStateKt.access$blankReadyInfo(), null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Loading;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Loading extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo) {
            super("Loading", readyInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "readyInfo", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, readyInfo, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readyInfo, "");
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "uiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "args", "Ljava/time/LocalDate;", "paymentDate", "", "showCalendarPicker", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;Ljava/time/LocalDate;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "component3", "()Ljava/time/LocalDate;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;Ljava/time/LocalDate;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/viewmodel/ReviewPaymentState$ReadyInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/makeapayment/reviewpayment/uimodel/ReviewPaymentUiModel;", "getUiModel", "Lcom/paypal/oslo/feature/revolvingcreditservicing/di/navigation/arguments/ReviewPaymentArgs;", "getArgs", "Ljava/time/LocalDate;", "getPaymentDate", "Z", "getShowCalendarPicker"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReadyInfo {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args;
        private final java.time.LocalDate paymentDate;
        private final boolean showCalendarPicker;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel;

        public ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, java.time.LocalDate localDate, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reviewPaymentArgs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.uiModel = reviewPaymentUiModel;
            this.args = reviewPaymentArgs;
            this.paymentDate = localDate;
            this.showCalendarPicker = z;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ReadyInfo(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, java.time.LocalDate localDate, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(reviewPaymentUiModel, r0, r2, (i & 8) != 0 ? false : z);
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs2;
            java.time.LocalDate localDate2;
            if ((i & 2) != 0) {
                java.lang.String str = "";
                reviewPaymentArgs2 = new com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs(str, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument.FundingInstrumentBalance("", null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("", "")), (java.util.List) null, (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.fundinginstrument.FundingInstrument) null, new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount("", ""), reviewPaymentUiModel.getTermsAndConditionsUrl(), com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN, 90, (java.time.LocalDate) null, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            } else {
                reviewPaymentArgs2 = reviewPaymentArgs;
            }
            if ((i & 4) != 0) {
                localDate2 = java.time.LocalDate.now();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(localDate2, "");
            } else {
                localDate2 = localDate;
            }
        }

        public final java.time.LocalDate getPaymentDate() {
            return this.paymentDate;
        }

        public final boolean getShowCalendarPicker() {
            return this.showCalendarPicker;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel = this.uiModel;
            com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs = this.args;
            java.time.LocalDate localDate = this.paymentDate;
            boolean z = this.showCalendarPicker;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReadyInfo(uiModel=");
            sb.append(reviewPaymentUiModel);
            sb.append(", args=");
            sb.append(reviewPaymentArgs);
            sb.append(", paymentDate=");
            sb.append(localDate);
            sb.append(", showCalendarPicker=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.uiModel.hashCode() * 31) + this.args.hashCode()) * 31) + this.paymentDate.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showCalendarPicker);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo = (com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, readyInfo.uiModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.args, readyInfo.args) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentDate, readyInfo.paymentDate) && this.showCalendarPicker == readyInfo.showCalendarPicker;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel uiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs args, java.time.LocalDate paymentDate, boolean showCalendarPicker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentDate, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo(uiModel, args, paymentDate, showCalendarPicker);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowCalendarPicker() {
            return this.showCalendarPicker;
        }

        /* renamed from: component3, reason: from getter */
        public final java.time.LocalDate getPaymentDate() {
            return this.paymentDate;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs getArgs() {
            return this.args;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.uimodel.ReviewPaymentUiModel reviewPaymentUiModel, com.paypal.oslo.feature.revolvingcreditservicing.di.navigation.arguments.ReviewPaymentArgs reviewPaymentArgs, java.time.LocalDate localDate, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                reviewPaymentUiModel = readyInfo.uiModel;
            }
            if ((i & 2) != 0) {
                reviewPaymentArgs = readyInfo.args;
            }
            if ((i & 4) != 0) {
                localDate = readyInfo.paymentDate;
            }
            if ((i & 8) != 0) {
                z = readyInfo.showCalendarPicker;
            }
            return readyInfo.copy(reviewPaymentUiModel, reviewPaymentArgs, localDate, z);
        }
    }

    public /* synthetic */ ReviewPaymentState(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.ReviewPaymentState.ReadyInfo readyInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, readyInfo);
    }
}
