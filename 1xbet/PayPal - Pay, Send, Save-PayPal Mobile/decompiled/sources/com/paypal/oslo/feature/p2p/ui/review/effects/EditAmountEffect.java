package com.paypal.oslo.feature.p2p.ui.review.effects;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "AmountUpdateSuccess", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect$AmountUpdateSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class EditAmountEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private EditAmountEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect$AmountUpdateSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "fundingOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "transferAmount", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "fxQuote", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;)Lcom/paypal/oslo/feature/p2p/ui/review/effects/EditAmountEffect$AmountUpdateSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingOptions;", "getFundingOptions", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getTransferAmount", "Lcom/paypal/oslo/feature/p2p/domain/model/FxQuote;", "getFxQuote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountUpdateSuccess extends com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions;
        private final com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote;
        private final com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount;

        public AmountUpdateSuccess(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            super("AmountUpdateSuccess", null);
            this.fundingOptions = fundingOptions;
            this.transferAmount = amount;
            this.fxQuote = fxQuote;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.Amount getTransferAmount() {
            return this.transferAmount;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.transferAmount;
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountUpdateSuccess(fundingOptions=");
            sb.append(fundingOptions);
            sb.append(", transferAmount=");
            sb.append(amount);
            sb.append(", fxQuote=");
            sb.append(fxQuote);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions = this.fundingOptions;
            int hashCode = fundingOptions == null ? 0 : fundingOptions.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.transferAmount;
            int hashCode2 = amount == null ? 0 : amount.hashCode();
            com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote = this.fxQuote;
            return (((hashCode * 31) + hashCode2) * 31) + (fxQuote != null ? fxQuote.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess amountUpdateSuccess = (com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingOptions, amountUpdateSuccess.fundingOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.transferAmount, amountUpdateSuccess.transferAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.fxQuote, amountUpdateSuccess.fxQuote);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess copy(com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.Amount transferAmount, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote) {
            return new com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess(fundingOptions, transferAmount, fxQuote);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FxQuote getFxQuote() {
            return this.fxQuote;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.Amount getTransferAmount() {
            return this.transferAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.FundingOptions getFundingOptions() {
            return this.fundingOptions;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess copy$default(com.paypal.oslo.feature.p2p.ui.review.effects.EditAmountEffect.AmountUpdateSuccess amountUpdateSuccess, com.paypal.oslo.feature.p2p.domain.model.FundingOptions fundingOptions, com.paypal.oslo.feature.p2p.domain.model.Amount amount, com.paypal.oslo.feature.p2p.domain.model.FxQuote fxQuote, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingOptions = amountUpdateSuccess.fundingOptions;
            }
            if ((i & 2) != 0) {
                amount = amountUpdateSuccess.transferAmount;
            }
            if ((i & 4) != 0) {
                fxQuote = amountUpdateSuccess.fxQuote;
            }
            return amountUpdateSuccess.copy(fundingOptions, amount, fxQuote);
        }
    }

    public /* synthetic */ EditAmountEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
