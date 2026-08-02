package com.paypal.oslo.feature.wallet.fifo.transfer.ui.review;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "", "<init>", "()V", "Loading", "Content", "Error", "Success", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Content;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WithdrawMoneyUIState {
    public static final int $stable = 0;

    private WithdrawMoneyUIState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Loading;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Loading INSTANCE = new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Loading();

        public final int hashCode() {
            return 969874646;
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
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b!\u0010\"Jt\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010\u001aR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b3\u0010\u001aR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b4\u0010\u001aR\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u0010\u001eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00107\u001a\u0004\b8\u0010 R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010\""}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Content;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "withdrawSpeedSection", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "withdrawFISection", "", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentUiModel;", "allFundingInstruments", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalOption;", "allWithdrawalOptions", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/PotentialInstrument;", "potentialInstruments", "", "withdrawalOptionId", "", "withdrawalAmount", "", "error", "<init>", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;DLjava/lang/Integer;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "component2", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "()D", "component8", "()Ljava/lang/Integer;", "copy", "(Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;DLjava/lang/Integer;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawSpeedSection;", "getWithdrawSpeedSection", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawFISection;", "getWithdrawFISection", "Ljava/util/List;", "getAllFundingInstruments", "getAllWithdrawalOptions", "getPotentialInstruments", "Ljava/lang/String;", "getWithdrawalOptionId", "D", "getWithdrawalAmount", "Ljava/lang/Integer;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> allFundingInstruments;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> allWithdrawalOptions;
        private final java.lang.Integer error;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> potentialInstruments;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection;
        private final double withdrawalAmount;
        private final java.lang.String withdrawalOptionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list2, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> list3, java.lang.String str, double d, java.lang.Integer num) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.withdrawSpeedSection = withdrawSpeedSection;
            this.withdrawFISection = withdrawFISection;
            this.allFundingInstruments = list;
            this.allWithdrawalOptions = list2;
            this.potentialInstruments = list3;
            this.withdrawalOptionId = str;
            this.withdrawalAmount = d;
            this.error = num;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection getWithdrawSpeedSection() {
            return this.withdrawSpeedSection;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection getWithdrawFISection() {
            return this.withdrawFISection;
        }

        public /* synthetic */ Content(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, double d, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(withdrawSpeedSection, withdrawFISection, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 32) != 0 ? "" : str, (i & 64) != 0 ? 0.0d : d, (i & 128) != 0 ? null : num);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> getAllFundingInstruments() {
            return this.allFundingInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> getAllWithdrawalOptions() {
            return this.allWithdrawalOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> getPotentialInstruments() {
            return this.potentialInstruments;
        }

        public final java.lang.String getWithdrawalOptionId() {
            return this.withdrawalOptionId;
        }

        public final double getWithdrawalAmount() {
            return this.withdrawalAmount;
        }

        public final java.lang.Integer getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection = this.withdrawSpeedSection;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection = this.withdrawFISection;
            java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> list = this.allFundingInstruments;
            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list2 = this.allWithdrawalOptions;
            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> list3 = this.potentialInstruments;
            java.lang.String str = this.withdrawalOptionId;
            double d = this.withdrawalAmount;
            java.lang.Integer num = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(withdrawSpeedSection=");
            sb.append(withdrawSpeedSection);
            sb.append(", withdrawFISection=");
            sb.append(withdrawFISection);
            sb.append(", allFundingInstruments=");
            sb.append(list);
            sb.append(", allWithdrawalOptions=");
            sb.append(list2);
            sb.append(", potentialInstruments=");
            sb.append(list3);
            sb.append(", withdrawalOptionId=");
            sb.append(str);
            sb.append(", withdrawalAmount=");
            sb.append(d);
            sb.append(", error=");
            sb.append(num);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.withdrawSpeedSection.hashCode();
            int hashCode2 = this.withdrawFISection.hashCode();
            int hashCode3 = this.allFundingInstruments.hashCode();
            int hashCode4 = this.allWithdrawalOptions.hashCode();
            int hashCode5 = this.potentialInstruments.hashCode();
            int hashCode6 = this.withdrawalOptionId.hashCode();
            int hashCode7 = java.lang.Double.hashCode(this.withdrawalAmount);
            java.lang.Integer num = this.error;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (num == null ? 0 : num.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content content = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawSpeedSection, content.withdrawSpeedSection) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawFISection, content.withdrawFISection) && kotlin.jvm.internal.Intrinsics.areEqual(this.allFundingInstruments, content.allFundingInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.allWithdrawalOptions, content.allWithdrawalOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.potentialInstruments, content.potentialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.withdrawalOptionId, content.withdrawalOptionId) && java.lang.Double.compare(this.withdrawalAmount, content.withdrawalAmount) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.error, content.error);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content copy(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection withdrawSpeedSection, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection withdrawFISection, java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> allFundingInstruments, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> allWithdrawalOptions, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> potentialInstruments, java.lang.String withdrawalOptionId, double withdrawalAmount, java.lang.Integer error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawSpeedSection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawFISection, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allFundingInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allWithdrawalOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(potentialInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withdrawalOptionId, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Content(withdrawSpeedSection, withdrawFISection, allFundingInstruments, allWithdrawalOptions, potentialInstruments, withdrawalOptionId, withdrawalAmount, error);
        }

        /* renamed from: component8, reason: from getter */
        public final java.lang.Integer getError() {
            return this.error;
        }

        /* renamed from: component7, reason: from getter */
        public final double getWithdrawalAmount() {
            return this.withdrawalAmount;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getWithdrawalOptionId() {
            return this.withdrawalOptionId;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> component5() {
            return this.potentialInstruments;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> component4() {
            return this.allWithdrawalOptions;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.common.model.FundingInstrumentUiModel> component3() {
            return this.allFundingInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawFISection getWithdrawFISection() {
            return this.withdrawFISection;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawSpeedSection getWithdrawSpeedSection() {
            return this.withdrawSpeedSection;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJb\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0011J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b'\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b,\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010\u0019R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Error;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "", "errorMessageRes", "errorDescRes", "", "errorCode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;", "errorAction", "formattedAmount", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorArg;", "errorDescArgs", "", "limitsArgs", "<init>", "(IILjava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorArg;Ljava/util/List;)V", "component1", "()I", "component2", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorArg;", "component7", "()Ljava/util/List;", "copy", "(IILjava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorArg;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getErrorMessageRes", "getErrorDescRes", "Ljava/lang/String;", "getErrorCode", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorAction;", "getErrorAction", "getFormattedAmount", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/ErrorArg;", "getErrorDescArgs", "Ljava/util/List;", "getLimitsArgs"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorDescArgs;
        private final int errorDescRes;
        private final int errorMessageRes;
        private final java.lang.String formattedAmount;
        private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> limitsArgs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Error(int i, int i2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.errorMessageRes = i;
            this.errorDescRes = i2;
            this.errorCode = str;
            this.errorAction = errorAction;
            this.formattedAmount = str2;
            this.errorDescArgs = errorArg;
            this.limitsArgs = list;
        }

        public final int getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public final int getErrorDescRes() {
            return this.errorDescRes;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public /* synthetic */ Error(int i, int i2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg, java.util.List list, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction.EndFlow : errorAction, (i3 & 16) != 0 ? null : str2, (i3 & 32) != 0 ? null : errorArg, (i3 & 64) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction getErrorAction() {
            return this.errorAction;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg getErrorDescArgs() {
            return this.errorDescArgs;
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> getLimitsArgs() {
            return this.limitsArgs;
        }

        public final java.lang.String toString() {
            int i = this.errorMessageRes;
            int i2 = this.errorDescRes;
            java.lang.String str = this.errorCode;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction = this.errorAction;
            java.lang.String str2 = this.formattedAmount;
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg = this.errorDescArgs;
            java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> list = this.limitsArgs;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(errorMessageRes=");
            sb.append(i);
            sb.append(", errorDescRes=");
            sb.append(i2);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(", errorAction=");
            sb.append(errorAction);
            sb.append(", formattedAmount=");
            sb.append(str2);
            sb.append(", errorDescArgs=");
            sb.append(errorArg);
            sb.append(", limitsArgs=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.errorMessageRes);
            int hashCode2 = java.lang.Integer.hashCode(this.errorDescRes);
            java.lang.String str = this.errorCode;
            int hashCode3 = str == null ? 0 : str.hashCode();
            int hashCode4 = this.errorAction.hashCode();
            java.lang.String str2 = this.formattedAmount;
            int hashCode5 = str2 == null ? 0 : str2.hashCode();
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg = this.errorDescArgs;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (errorArg != null ? errorArg.hashCode() : 0)) * 31) + this.limitsArgs.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error error = (com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error) other;
            return this.errorMessageRes == error.errorMessageRes && this.errorDescRes == error.errorDescRes && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, error.errorCode) && this.errorAction == error.errorAction && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, error.formattedAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorDescArgs, error.errorDescArgs) && kotlin.jvm.internal.Intrinsics.areEqual(this.limitsArgs, error.limitsArgs);
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error copy(int errorMessageRes, int errorDescRes, java.lang.String errorCode, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction, java.lang.String formattedAmount, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorDescArgs, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> limitsArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorAction, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(limitsArgs, "");
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error(errorMessageRes, errorDescRes, errorCode, errorAction, formattedAmount, errorDescArgs, limitsArgs);
        }

        public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg> component7() {
            return this.limitsArgs;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg getErrorDescArgs() {
            return this.errorDescArgs;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction getErrorAction() {
            return this.errorAction;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component2, reason: from getter */
        public final int getErrorDescRes() {
            return this.errorDescRes;
        }

        /* renamed from: component1, reason: from getter */
        public final int getErrorMessageRes() {
            return this.errorMessageRes;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Error error, int i, int i2, java.lang.String str, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction, java.lang.String str2, com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg, java.util.List list, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                i = error.errorMessageRes;
            }
            if ((i3 & 2) != 0) {
                i2 = error.errorDescRes;
            }
            int i4 = i2;
            if ((i3 & 4) != 0) {
                str = error.errorCode;
            }
            java.lang.String str3 = str;
            if ((i3 & 8) != 0) {
                errorAction = error.errorAction;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorAction errorAction2 = errorAction;
            if ((i3 & 16) != 0) {
                str2 = error.formattedAmount;
            }
            java.lang.String str4 = str2;
            if ((i3 & 32) != 0) {
                errorArg = error.errorDescArgs;
            }
            com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.ErrorArg errorArg2 = errorArg;
            if ((i3 & 64) != 0) {
                list = error.limitsArgs;
            }
            return error.copy(i, i4, str3, errorAction2, str4, errorArg2, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Success;", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState;", "", "amount", "<init>", "(D)V", "component1", "()D", "copy", "(D)Lcom/paypal/oslo/feature/wallet/fifo/transfer/ui/review/WithdrawMoneyUIState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState {
        public static final int $stable = 0;
        private final double amount;

        public Success(double d) {
            super(null);
            this.amount = d;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            double d = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(amount=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Double.hashCode(this.amount);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success) && java.lang.Double.compare(this.amount, ((com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success) other).amount) == 0;
        }

        public final com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success copy(double amount) {
            return new com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.ui.review.WithdrawMoneyUIState.Success success, double d, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                d = success.amount;
            }
            return success.copy(d);
        }
    }

    public /* synthetic */ WithdrawMoneyUIState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
