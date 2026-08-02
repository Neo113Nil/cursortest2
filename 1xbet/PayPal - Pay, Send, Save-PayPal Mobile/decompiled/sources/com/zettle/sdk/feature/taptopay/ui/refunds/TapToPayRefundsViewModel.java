package com.zettle.sdk.feature.taptopay.ui.refunds;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel;", "", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "action", "", "dispatchAction", "(Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "getEffects", "()Lkotlinx/coroutines/flow/SharedFlow;", "effects", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;", "getUiData", "()Lkotlinx/coroutines/flow/StateFlow;", "uiData", "Actions", "Effects", "UiData"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TapToPayRefundsViewModel {
    void dispatchAction(com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions action);

    kotlinx.coroutines.flow.SharedFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects> getEffects();

    kotlinx.coroutines.flow.StateFlow<com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData> getUiData();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJj\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b&\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0016R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b+\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b/\u0010\u001eR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0013"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;", "", "", "refundedAmount", "totalAmount", "", "date", "card", "receiptNumber", "Ljava/util/Currency;", "currency", "", "refundButtonText", "", "refundButtonEnable", "loading", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;IZZ)V", "component1", "()J", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Ljava/util/Currency;", "component7", "()I", "component8", "()Z", "component9", "copy", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Currency;IZZ)Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$UiData;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getCard", "Ljava/util/Currency;", "getCurrency", "getDate", "Z", "getLoading", "getReceiptNumber", "getRefundButtonEnable", com.visa.cbp.getEncExpo.warmup, "getRefundButtonText", "J", "getRefundedAmount", "getTotalAmount"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class UiData {
        public static final int $stable = 8;
        private final java.lang.String card;
        private final java.util.Currency currency;
        private final java.lang.String date;
        private final boolean loading;
        private final java.lang.String receiptNumber;
        private final boolean refundButtonEnable;
        private final int refundButtonText;
        private final long refundedAmount;
        private final long totalAmount;

        public UiData(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Currency currency, int i, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            this.refundedAmount = j;
            this.totalAmount = j2;
            this.date = str;
            this.card = str2;
            this.receiptNumber = str3;
            this.currency = currency;
            this.refundButtonText = i;
            this.refundButtonEnable = z;
            this.loading = z2;
        }

        public final long getRefundedAmount() {
            return this.refundedAmount;
        }

        public final long getTotalAmount() {
            return this.totalAmount;
        }

        public final java.lang.String getDate() {
            return this.date;
        }

        public final java.lang.String getCard() {
            return this.card;
        }

        public final java.lang.String getReceiptNumber() {
            return this.receiptNumber;
        }

        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        public /* synthetic */ UiData(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Currency currency, int i, boolean z, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, str, str2, str3, currency, (i2 & 64) != 0 ? com.zettle.sdk.feature.taptopay.ui.R.string.tap_to_pay_refunds_confirm_button : i, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? true : z2);
        }

        public final int getRefundButtonText() {
            return this.refundButtonText;
        }

        public final boolean getRefundButtonEnable() {
            return this.refundButtonEnable;
        }

        public final boolean getLoading() {
            return this.loading;
        }

        public final java.lang.String toString() {
            long j = this.refundedAmount;
            long j2 = this.totalAmount;
            java.lang.String str = this.date;
            java.lang.String str2 = this.card;
            java.lang.String str3 = this.receiptNumber;
            java.util.Currency currency = this.currency;
            int i = this.refundButtonText;
            boolean z = this.refundButtonEnable;
            boolean z2 = this.loading;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UiData(refundedAmount=");
            sb.append(j);
            sb.append(", totalAmount=");
            sb.append(j2);
            sb.append(", date=");
            sb.append(str);
            sb.append(", card=");
            sb.append(str2);
            sb.append(", receiptNumber=");
            sb.append(str3);
            sb.append(", currency=");
            sb.append(currency);
            sb.append(", refundButtonText=");
            sb.append(i);
            sb.append(", refundButtonEnable=");
            sb.append(z);
            sb.append(", loading=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int hashCode = java.lang.Long.hashCode(this.refundedAmount);
            int hashCode2 = java.lang.Long.hashCode(this.totalAmount);
            int hashCode3 = this.date.hashCode();
            int hashCode4 = this.card.hashCode();
            int hashCode5 = this.receiptNumber.hashCode();
            int hashCode6 = this.currency.hashCode();
            int hashCode7 = java.lang.Integer.hashCode(this.refundButtonText);
            boolean z = this.refundButtonEnable;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            boolean z2 = this.loading;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData)) {
                return false;
            }
            com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData uiData = (com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData) other;
            return this.refundedAmount == uiData.refundedAmount && this.totalAmount == uiData.totalAmount && kotlin.jvm.internal.Intrinsics.areEqual(this.date, uiData.date) && kotlin.jvm.internal.Intrinsics.areEqual(this.card, uiData.card) && kotlin.jvm.internal.Intrinsics.areEqual(this.receiptNumber, uiData.receiptNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.currency, uiData.currency) && this.refundButtonText == uiData.refundButtonText && this.refundButtonEnable == uiData.refundButtonEnable && this.loading == uiData.loading;
        }

        public final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData copy(long refundedAmount, long totalAmount, java.lang.String date, java.lang.String card, java.lang.String receiptNumber, java.util.Currency currency, int refundButtonText, boolean refundButtonEnable, boolean loading) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(card, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiptNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currency, "");
            return new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.UiData(refundedAmount, totalAmount, date, card, receiptNumber, currency, refundButtonText, refundButtonEnable, loading);
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getRefundButtonEnable() {
            return this.refundButtonEnable;
        }

        /* renamed from: component7, reason: from getter */
        public final int getRefundButtonText() {
            return this.refundButtonText;
        }

        /* renamed from: component6, reason: from getter */
        public final java.util.Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getReceiptNumber() {
            return this.receiptNumber;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCard() {
            return this.card;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTotalAmount() {
            return this.totalAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final long getRefundedAmount() {
            return this.refundedAmount;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "", "<init>", "()V", "Canceled", "DisplayErrorAmountAboveMaximum", "DisplayErrorDoRefund", "DisplayErrorRetrieveData", "SuccessDoRefund", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorAmountAboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorDoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorRetrieveData;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$SuccessDoRefund;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Effects {
        public static final int $stable = 0;

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$Canceled;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Canceled extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects {
            public static final int $stable = 0;
            public static final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.Canceled INSTANCE = new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects.Canceled();

            private Canceled() {
                super(null);
            }
        }

        private Effects() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorRetrieveData;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedRetrieveRefund;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DisplayErrorRetrieveData extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects {
            public static final int $stable = 0;
            private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayErrorRetrieveData(com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund failedRetrieveRefund) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedRetrieveRefund, "");
                this.reason = failedRetrieveRefund;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedRetrieveRefund getReason() {
                return this.reason;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorDoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayRefundFailureReason$FailedDoRefund;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DisplayErrorDoRefund extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects {
            public static final int $stable = 0;
            private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayErrorDoRefund(com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund failedDoRefund) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(failedDoRefund, "");
                this.reason = failedDoRefund;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayRefundFailureReason.FailedDoRefund getReason() {
                return this.reason;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$DisplayErrorAmountAboveMaximum;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;", "reason", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;", "getReason", "()Lcom/zettle/sdk/feature/taptopay/ui/models/TapToPayFailureReason$AboveMaximum;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DisplayErrorAmountAboveMaximum extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects {
            public static final int $stable = 0;
            private final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum reason;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplayErrorAmountAboveMaximum(com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum aboveMaximum) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aboveMaximum, "");
                this.reason = aboveMaximum;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.TapToPayFailureReason.AboveMaximum getReason() {
                return this.reason;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects$SuccessDoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Effects;", "Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;", "payload", "<init>", "(Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;)V", "Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;", "getPayload", "()Lcom/zettle/sdk/feature/taptopay/ui/models/RefundPayloadResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class SuccessDoRefund extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Effects {
            public static final int $stable = 0;
            private final com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult payload;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SuccessDoRefund(com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult refundPayloadResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refundPayloadResult, "");
                this.payload = refundPayloadResult;
            }

            public final com.zettle.sdk.feature.taptopay.ui.models.RefundPayloadResult getPayload() {
                return this.payload;
            }
        }

        public /* synthetic */ Effects(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "", "<init>", "()V", com.paypal.oslo.feature.balance.common.AutoReloadConstants.IntentNames.INTENT_CANCEL, "DoRefund", "RetrievePaymentInfo", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$Cancel;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$DoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$RetrievePaymentInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Actions {
        public static final int $stable = 0;

        private Actions() {
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$RetrievePaymentInfo;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "", "paymentReferenceId", "", "amount", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/String;", "getPaymentReferenceId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class RetrievePaymentInfo extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions {
            public static final int $stable = 0;
            private final java.lang.Long amount;
            private final java.lang.String paymentReferenceId;

            public final java.lang.String getPaymentReferenceId() {
                return this.paymentReferenceId;
            }

            public final java.lang.Long getAmount() {
                return this.amount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetrievePaymentInfo(java.lang.String str, java.lang.Long l) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.paymentReferenceId = str;
                this.amount = l;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$DoRefund;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "", "amount", "", "refundReferenceId", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "Ljava/lang/Long;", "getAmount", "()Ljava/lang/Long;", "Ljava/lang/String;", "getRefundReferenceId", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class DoRefund extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions {
            public static final int $stable = 0;
            private final java.lang.Long amount;
            private final java.lang.String refundReferenceId;

            public final java.lang.Long getAmount() {
                return this.amount;
            }

            public final java.lang.String getRefundReferenceId() {
                return this.refundReferenceId;
            }

            public DoRefund(java.lang.Long l, java.lang.String str) {
                super(null);
                this.amount = l;
                this.refundReferenceId = str;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions$Cancel;", "Lcom/zettle/sdk/feature/taptopay/ui/refunds/TapToPayRefundsViewModel$Actions;", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Cancel extends com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions {
            public static final int $stable = 0;
            public static final com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.Cancel INSTANCE = new com.zettle.sdk.feature.taptopay.ui.refunds.TapToPayRefundsViewModel.Actions.Cancel();

            private Cancel() {
                super(null);
            }
        }

        public /* synthetic */ Actions(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
