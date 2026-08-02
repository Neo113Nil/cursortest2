package com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0005\n\u000b\f\r\u000eB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000f\u0010\u0011\u0012"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Initial", com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, "ProcessingRedemption", "Error", "ErrorContext", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ProcessingRedemption;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Ready;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class RedeemRewardsState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RedeemRewardsState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Initial;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initial extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial INSTANCE = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial();

        public final int hashCode() {
            return -26339929;
        }

        private Initial() {
            super("Initial", null);
        }

        public final java.lang.String toString() {
            return "Initial";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Initial)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ`\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\u000e2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b5\u0010\u001dR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b\u0010\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Ready;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "rewardsSummary", "", "enteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "selectedRedemptionOption", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "enteredAmountToPoints", "", "redeemButtonEnabled", "isPayPalPlusCbmcEnabled", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;FZZ)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "component4", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component6", "()F", "component7", "()Z", "component8", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;FZZ)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Ready;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "getRewardsSummary", "Ljava/lang/String;", "getEnteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "getSelectedRedemptionOption", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getEnteredAmountToPoints", "Z", "getRedeemButtonEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Ready extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String enteredAmount;
        private final float enteredAmountToPoints;
        private final boolean isPayPalPlusCbmcEnabled;
        private final boolean redeemButtonEnabled;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, float f, boolean z, boolean z2) {
            super(com.paypal.oslo.feature.consumerprivacy.ui.util.UiConstants.STATE_READY, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardsUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.rewardsSummary = redeemRewardsUiModel;
            this.enteredAmount = str;
            this.selectedRedemptionOption = redemptionOption;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.enteredAmountToPoints = f;
            this.redeemButtonEnabled = z;
            this.isPayPalPlusCbmcEnabled = z2;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }

        public /* synthetic */ Ready(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, float f, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemRewardsUiModel, (i & 2) != 0 ? "0" : str, (i & 4) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE : redemptionOption, str2, creditProductIdentifier, (i & 32) != 0 ? 0.0f : f, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2);
        }

        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final float getEnteredAmountToPoints() {
            return this.enteredAmountToPoints;
        }

        public final boolean getRedeemButtonEnabled() {
            return this.redeemButtonEnabled;
        }

        public final boolean isPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = this.rewardsSummary;
            java.lang.String str = this.enteredAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption = this.selectedRedemptionOption;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            float f = this.enteredAmountToPoints;
            boolean z = this.redeemButtonEnabled;
            boolean z2 = this.isPayPalPlusCbmcEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Ready(rewardsSummary=");
            sb.append(redeemRewardsUiModel);
            sb.append(", enteredAmount=");
            sb.append(str);
            sb.append(", selectedRedemptionOption=");
            sb.append(redemptionOption);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", enteredAmountToPoints=");
            sb.append(f);
            sb.append(", redeemButtonEnabled=");
            sb.append(z);
            sb.append(", isPayPalPlusCbmcEnabled=");
            sb.append(z2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((((((this.rewardsSummary.hashCode() * 31) + this.enteredAmount.hashCode()) * 31) + this.selectedRedemptionOption.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode()) * 31) + java.lang.Float.hashCode(this.enteredAmountToPoints)) * 31) + java.lang.Boolean.hashCode(this.redeemButtonEnabled)) * 31) + java.lang.Boolean.hashCode(this.isPayPalPlusCbmcEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready ready = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, ready.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredAmount, ready.enteredAmount) && this.selectedRedemptionOption == ready.selectedRedemptionOption && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, ready.creditAccountId) && this.creditProductIdentifier == ready.creditProductIdentifier && java.lang.Float.compare(this.enteredAmountToPoints, ready.enteredAmountToPoints) == 0 && this.redeemButtonEnabled == ready.redeemButtonEnabled && this.isPayPalPlusCbmcEnabled == ready.isPayPalPlusCbmcEnabled;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary, java.lang.String enteredAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption, java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, float enteredAmountToPoints, boolean redeemButtonEnabled, boolean isPayPalPlusCbmcEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedRedemptionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Ready(rewardsSummary, enteredAmount, selectedRedemptionOption, creditAccountId, creditProductIdentifier, enteredAmountToPoints, redeemButtonEnabled, isPayPalPlusCbmcEnabled);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getIsPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getRedeemButtonEnabled() {
            return this.redeemButtonEnabled;
        }

        /* renamed from: component6, reason: from getter */
        public final float getEnteredAmountToPoints() {
            return this.enteredAmountToPoints;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJL\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b+\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b\r\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ProcessingRedemption;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "rewardsSummary", "", "enteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "selectedRedemptionOption", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "isPayPalPlusCbmcEnabled", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "component4", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component6", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ProcessingRedemption;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "getRewardsSummary", "Ljava/lang/String;", "getEnteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "getSelectedRedemptionOption", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProcessingRedemption extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String enteredAmount;
        private final boolean isPayPalPlusCbmcEnabled;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProcessingRedemption(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z) {
            super("ProcessingRedemption", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemRewardsUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            this.rewardsSummary = redeemRewardsUiModel;
            this.enteredAmount = str;
            this.selectedRedemptionOption = redemptionOption;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.isPayPalPlusCbmcEnabled = z;
        }

        public /* synthetic */ ProcessingRedemption(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(redeemRewardsUiModel, str, redemptionOption, str2, creditProductIdentifier, (i & 32) != 0 ? false : z);
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }

        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final boolean isPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = this.rewardsSummary;
            java.lang.String str = this.enteredAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption = this.selectedRedemptionOption;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            boolean z = this.isPayPalPlusCbmcEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessingRedemption(rewardsSummary=");
            sb.append(redeemRewardsUiModel);
            sb.append(", enteredAmount=");
            sb.append(str);
            sb.append(", selectedRedemptionOption=");
            sb.append(redemptionOption);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", isPayPalPlusCbmcEnabled=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((((this.rewardsSummary.hashCode() * 31) + this.enteredAmount.hashCode()) * 31) + this.selectedRedemptionOption.hashCode()) * 31) + this.creditAccountId.hashCode()) * 31) + this.creditProductIdentifier.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isPayPalPlusCbmcEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, processingRedemption.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredAmount, processingRedemption.enteredAmount) && this.selectedRedemptionOption == processingRedemption.selectedRedemptionOption && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, processingRedemption.creditAccountId) && this.creditProductIdentifier == processingRedemption.creditProductIdentifier && this.isPayPalPlusCbmcEnabled == processingRedemption.isPayPalPlusCbmcEnabled;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary, java.lang.String enteredAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption, java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean isPayPalPlusCbmcEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsSummary, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedRedemptionOption, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption(rewardsSummary, enteredAmount, selectedRedemptionOption, creditAccountId, creditProductIdentifier, isPayPalPlusCbmcEnabled);
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsPayPalPlusCbmcEnabled() {
            return this.isPayPalPlusCbmcEnabled;
        }

        /* renamed from: component5, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ProcessingRedemption processingRedemption, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                redeemRewardsUiModel = processingRedemption.rewardsSummary;
            }
            if ((i & 2) != 0) {
                str = processingRedemption.enteredAmount;
            }
            java.lang.String str3 = str;
            if ((i & 4) != 0) {
                redemptionOption = processingRedemption.selectedRedemptionOption;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption2 = redemptionOption;
            if ((i & 8) != 0) {
                str2 = processingRedemption.creditAccountId;
            }
            java.lang.String str4 = str2;
            if ((i & 16) != 0) {
                creditProductIdentifier = processingRedemption.creditProductIdentifier;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
            if ((i & 32) != 0) {
                z = processingRedemption.isPayPalPlusCbmcEnabled;
            }
            return processingRedemption.copy(redeemRewardsUiModel, str3, redemptionOption2, str4, creditProductIdentifier2, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0017R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b1\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b3\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00104\u001a\u0004\b\u000f\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Error;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/base/Loggable;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;", "context", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "rewardsSummary", "", "enteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "selectedRedemptionOption", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "creditProductIdentifier", "", "isSelectOptionError", "<init>", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Z)V", "component1", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "component5", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "component7", "()Z", "copy", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;Z)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$Error;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;", "getContext", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/model/RedeemRewardsUiModel;", "getRewardsSummary", "Ljava/lang/String;", "getEnteredAmount", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/rewards/RedemptionOption;", "getSelectedRedemptionOption", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "getCreditProductIdentifier", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState implements com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext context;
        private final java.lang.String creditAccountId;
        private final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier;
        private final java.lang.String enteredAmount;
        private final boolean isSelectOptionError;
        private final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary;
        private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z) {
            super("Error", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redemptionOption, "");
            this.context = errorContext;
            this.rewardsSummary = redeemRewardsUiModel;
            this.enteredAmount = str;
            this.selectedRedemptionOption = redemptionOption;
            this.creditAccountId = str2;
            this.creditProductIdentifier = creditProductIdentifier;
            this.isSelectOptionError = z;
        }

        @Override // com.paypal.oslo.feature.revolvingcreditservicing.ui.common.base.Loggable
        public final /* bridge */ java.util.Map<java.lang.String, java.lang.String> getLogParams() {
            return super.getLogParams();
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext getContext() {
            return this.context;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }

        public /* synthetic */ Error(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(errorContext, (i & 2) != 0 ? null : redeemRewardsUiModel, (i & 4) != 0 ? "0" : str, (i & 8) != 0 ? com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption.NONE : redemptionOption, (i & 16) != 0 ? null : str2, (i & 32) == 0 ? creditProductIdentifier : null, (i & 64) != 0 ? false : z);
        }

        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        public final boolean isSelectOptionError() {
            return this.isSelectOptionError;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext = this.context;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = this.rewardsSummary;
            java.lang.String str = this.enteredAmount;
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption = this.selectedRedemptionOption;
            java.lang.String str2 = this.creditAccountId;
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            boolean z = this.isSelectOptionError;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(context=");
            sb.append(errorContext);
            sb.append(", rewardsSummary=");
            sb.append(redeemRewardsUiModel);
            sb.append(", enteredAmount=");
            sb.append(str);
            sb.append(", selectedRedemptionOption=");
            sb.append(redemptionOption);
            sb.append(", creditAccountId=");
            sb.append(str2);
            sb.append(", creditProductIdentifier=");
            sb.append(creditProductIdentifier);
            sb.append(", isSelectOptionError=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.context.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel = this.rewardsSummary;
            int hashCode2 = redeemRewardsUiModel == null ? 0 : redeemRewardsUiModel.hashCode();
            int hashCode3 = this.enteredAmount.hashCode();
            int hashCode4 = this.selectedRedemptionOption.hashCode();
            java.lang.String str = this.creditAccountId;
            int hashCode5 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier = this.creditProductIdentifier;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (creditProductIdentifier != null ? creditProductIdentifier.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSelectOptionError);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error)) {
                return false;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error error = (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error) other;
            return this.context == error.context && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardsSummary, error.rewardsSummary) && kotlin.jvm.internal.Intrinsics.areEqual(this.enteredAmount, error.enteredAmount) && this.selectedRedemptionOption == error.selectedRedemptionOption && kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, error.creditAccountId) && this.creditProductIdentifier == error.creditProductIdentifier && this.isSelectOptionError == error.isSelectOptionError;
        }

        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error copy(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext context, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel rewardsSummary, java.lang.String enteredAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption selectedRedemptionOption, java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean isSelectOptionError) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enteredAmount, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedRedemptionOption, "");
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error(context, rewardsSummary, enteredAmount, selectedRedemptionOption, creditAccountId, creditProductIdentifier, isSelectOptionError);
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsSelectOptionError() {
            return this.isSelectOptionError;
        }

        /* renamed from: component6, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier getCreditProductIdentifier() {
            return this.creditProductIdentifier;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getCreditAccountId() {
            return this.creditAccountId;
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption getSelectedRedemptionOption() {
            return this.selectedRedemptionOption;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getEnteredAmount() {
            return this.enteredAmount;
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel getRewardsSummary() {
            return this.rewardsSummary;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext getContext() {
            return this.context;
        }

        public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error copy$default(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.Error error, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext, com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel, java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                errorContext = error.context;
            }
            if ((i & 2) != 0) {
                redeemRewardsUiModel = error.rewardsSummary;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.model.RedeemRewardsUiModel redeemRewardsUiModel2 = redeemRewardsUiModel;
            if ((i & 4) != 0) {
                str = error.enteredAmount;
            }
            java.lang.String str3 = str;
            if ((i & 8) != 0) {
                redemptionOption = error.selectedRedemptionOption;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.domain.model.rewards.RedemptionOption redemptionOption2 = redemptionOption;
            if ((i & 16) != 0) {
                str2 = error.creditAccountId;
            }
            java.lang.String str4 = str2;
            if ((i & 32) != 0) {
                creditProductIdentifier = error.creditProductIdentifier;
            }
            com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier creditProductIdentifier2 = creditProductIdentifier;
            if ((i & 64) != 0) {
                z = error.isSelectOptionError;
            }
            return error.copy(errorContext, redeemRewardsUiModel2, str3, redemptionOption2, str4, creditProductIdentifier2, z);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/rewards/redeem/viewmodel/RedeemRewardsState$ErrorContext;", "", "<init>", "(Ljava/lang/String;I)V", "REDEEMING_REWARDS", "INVALID_AMOUNT", "INSUFFICIENT_REWARDS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ErrorContext {
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext INSUFFICIENT_REWARDS;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext INVALID_AMOUNT;
        public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext REDEEMING_REWARDS;
        private static final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext[] getHighResolutionOutputSizeshNQ4ISI;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

        private ErrorContext(java.lang.String str, int i) {
        }

        static {
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext("REDEEMING_REWARDS", 0);
            REDEEMING_REWARDS = errorContext;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext2 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext("INVALID_AMOUNT", 1);
            INVALID_AMOUNT = errorContext2;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext errorContext3 = new com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext("INSUFFICIENT_REWARDS", 2);
            INSUFFICIENT_REWARDS = errorContext3;
            com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext[] errorContextArr = {errorContext, errorContext2, errorContext3};
            getHighResolutionOutputSizeshNQ4ISI = errorContextArr;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(errorContextArr);
        }

        public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext[] values() {
            return (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        }

        public static com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext valueOf(java.lang.String str) {
            return (com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext) java.lang.Enum.valueOf(com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext.class, str);
        }

        public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.revolvingcreditservicing.ui.rewards.redeem.viewmodel.RedeemRewardsState.ErrorContext> getEntries() {
            return getHighSpeedVideoFpsRangesFor;
        }
    }

    public /* synthetic */ RedeemRewardsState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
