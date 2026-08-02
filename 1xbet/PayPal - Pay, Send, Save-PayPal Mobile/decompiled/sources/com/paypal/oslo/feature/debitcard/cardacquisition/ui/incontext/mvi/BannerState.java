package com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "", "<init>", "()V", "Hidden", "NoFundingSource", "FundingSourceContingency", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$FundingSourceContingency;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$Hidden;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$NoFundingSource;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class BannerState {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$Hidden;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Hidden extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden();

        public final int hashCode() {
            return 1834596139;
        }

        private Hidden() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Hidden";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.Hidden)) {
                return false;
            }
            return true;
        }
    }

    private BannerState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$NoFundingSource;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NoFundingSource extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.NoFundingSource INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.NoFundingSource();

        public final int hashCode() {
            return 89682134;
        }

        private NoFundingSource() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NoFundingSource";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.NoFundingSource)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState$FundingSourceContingency;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/incontext/mvi/BannerState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingSourceContingency extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.FundingSourceContingency INSTANCE = new com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.FundingSourceContingency();

        public final int hashCode() {
            return -107241224;
        }

        private FundingSourceContingency() {
            super(null);
        }

        public final java.lang.String toString() {
            return "FundingSourceContingency";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.incontext.mvi.BannerState.FundingSourceContingency)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ BannerState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
