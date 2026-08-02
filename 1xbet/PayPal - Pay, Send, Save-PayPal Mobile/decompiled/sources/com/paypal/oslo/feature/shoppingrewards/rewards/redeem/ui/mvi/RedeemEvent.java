package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0014\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001dB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0014\u001e\u001f !\"#$%&'()*+,-./01"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "OnLoad", "OnLoadSuccess", com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, "OnAmountChange", "OnNext", "OnLoadCharities", "OnLoadCharitiesSuccess", "OnLoadCharitiesError", "OnSelectCharity", "OnConfirmDonation", "OnRedeem", "OnRedeemSuccess", "OnSummaryAmountFormatted", "OnRedeemError", "OnTermsClick", "OnShowTermsBottomSheet", "OnRetry", "OnDismiss", "OnShareInfoToggle", "OnActivityClick", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnActivityClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnAmountChange;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnConfirmDonation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnDismiss;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharities;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnNext;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeem;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSelectCharity;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnShareInfoToggle;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnShowTermsBottomSheet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSummaryAmountFormatted;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnTermsClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class RedeemEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RedeemEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoad;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "redeemType", "", "availablePoints", "<init>", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;I)V", "component1", "()Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "component2", "()I", "copy", "(Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;I)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoad;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/shoppingrewards/api/rewards/redeem/navigation/RedeemType;", "getRedeemType", com.visa.cbp.getEncExpo.warmup, "getAvailablePoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoad extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final int availablePoints;
        private final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoad(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i) {
            super("OnLoad", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            this.redeemType = redeemType;
            this.availablePoints = i;
        }

        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType = this.redeemType;
            int i = this.availablePoints;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoad(redeemType=");
            sb.append(redeemType);
            sb.append(", availablePoints=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.redeemType.hashCode() * 31) + java.lang.Integer.hashCode(this.availablePoints);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad onLoad = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad) other;
            return this.redeemType == onLoad.redeemType && this.availablePoints == onLoad.availablePoints;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad copy(com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int availablePoints) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad(redeemType, availablePoints);
        }

        /* renamed from: component2, reason: from getter */
        public final int getAvailablePoints() {
            return this.availablePoints;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType getRedeemType() {
            return this.redeemType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoad onLoad, com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemType redeemType, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                redeemType = onLoad.redeemType;
            }
            if ((i2 & 2) != 0) {
                i = onLoad.availablePoints;
            }
            return onLoad.copy(redeemType, i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "exchangeRateDisplayText", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getData", "Ljava/lang/String;", "getExchangeRateDisplayText"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 8;
        private final java.lang.Object data;
        private final java.lang.String exchangeRateDisplayText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadSuccess(java.lang.Object obj, java.lang.String str) {
            super("OnLoadSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = obj;
            this.exchangeRateDisplayText = str;
        }

        public final java.lang.Object getData() {
            return this.data;
        }

        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.data;
            java.lang.String str = this.exchangeRateDisplayText;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadSuccess(data=");
            sb.append(obj);
            sb.append(", exchangeRateDisplayText=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.exchangeRateDisplayText.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess onLoadSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, onLoadSuccess.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.exchangeRateDisplayText, onLoadSuccess.exchangeRateDisplayText);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess copy(java.lang.Object data, java.lang.String exchangeRateDisplayText) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exchangeRateDisplayText, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess(data, exchangeRateDisplayText);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getExchangeRateDisplayText() {
            return this.exchangeRateDisplayText;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadSuccess onLoadSuccess, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onLoadSuccess.data;
            }
            if ((i & 2) != 0) {
                str = onLoadSuccess.exchangeRateDisplayText;
            }
            return onLoadSuccess.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "message", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadError extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadError(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super(com.paypal.oslo.feature.pools.constants.PoolsConstants.IntentNames.INTENT_NAVIGATE_TO_ERROR, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.message = str;
            this.errorType = errorStateType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadError(message=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError onLoadError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, onLoadError.message) && this.errorType == onLoadError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError copy(java.lang.String message, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError(message, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadError onLoadError, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadError.message;
            }
            if ((i & 2) != 0) {
                errorStateType = onLoadError.errorType;
            }
            return onLoadError.copy(str, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnAmountChange;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "amount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnAmountChange;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAmountChange extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAmountChange(java.lang.String str) {
            super("OnAmountChange", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.amount = str;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAmountChange(amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange) other).amount);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange copy(java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange(amount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnAmountChange onAmountChange, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onAmountChange.amount;
            }
            return onAmountChange.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnNext;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNext extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext();

        public final int hashCode() {
            return 1220685957;
        }

        private OnNext() {
            super("OnNext", null);
        }

        public final java.lang.String toString() {
            return "OnNext";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnNext)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharities;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadCharities extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharities INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharities();

        public final int hashCode() {
            return -1060567906;
        }

        private OnLoadCharities() {
            super("OnLoadCharities", null);
        }

        public final java.lang.String toString() {
            return "OnLoadCharities";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharities)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/domain/model/CharityModel;", "charities", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getCharities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadCharitiesSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadCharitiesSuccess(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> list) {
            super("OnLoadCharitiesSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.charities = list;
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> getCharities() {
            return this.charities;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> list = this.charities;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadCharitiesSuccess(charities=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.charities.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.charities, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess) other).charities);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess copy(java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> charities) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charities, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess(charities);
        }

        public final java.util.List<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.model.CharityModel> component1() {
            return this.charities;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesSuccess onLoadCharitiesSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onLoadCharitiesSuccess.charities;
            }
            return onLoadCharitiesSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "message", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnLoadCharitiesError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnLoadCharitiesError extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLoadCharitiesError(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super("OnLoadCharitiesError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.message = str;
            this.errorType = errorStateType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnLoadCharitiesError(message=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError onLoadCharitiesError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, onLoadCharitiesError.message) && this.errorType == onLoadCharitiesError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError copy(java.lang.String message, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError(message, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnLoadCharitiesError onLoadCharitiesError, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onLoadCharitiesError.message;
            }
            if ((i & 2) != 0) {
                errorStateType = onLoadCharitiesError.errorType;
            }
            return onLoadCharitiesError.copy(str, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSelectCharity;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "charityId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSelectCharity;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCharityId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSelectCharity extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final java.lang.String charityId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSelectCharity(java.lang.String str) {
            super("OnSelectCharity", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.charityId = str;
        }

        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.charityId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSelectCharity(charityId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.charityId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity) && kotlin.jvm.internal.Intrinsics.areEqual(this.charityId, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity) other).charityId);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity copy(java.lang.String charityId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charityId, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity(charityId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCharityId() {
            return this.charityId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSelectCharity onSelectCharity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSelectCharity.charityId;
            }
            return onSelectCharity.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnConfirmDonation;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnConfirmDonation extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation();

        public final int hashCode() {
            return -700670560;
        }

        private OnConfirmDonation() {
            super("OnConfirmDonation", null);
        }

        public final java.lang.String toString() {
            return "OnConfirmDonation";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnConfirmDonation)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeem;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRedeem extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem();

        public final int hashCode() {
            return 667042478;
        }

        private OnRedeem() {
            super("OnRedeem", null);
        }

        public final java.lang.String toString() {
            return "OnRedeem";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeem)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemSuccess;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "confirmationData", "", "formattedAmount", "<init>", "(Ljava/lang/Object;Ljava/lang/String;)V", "component1", "()Ljava/lang/Object;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemSuccess;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/Object;", "getConfirmationData", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRedeemSuccess extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 8;
        private final java.lang.Object confirmationData;
        private final java.lang.String formattedAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRedeemSuccess(java.lang.Object obj, java.lang.String str) {
            super("OnRedeemSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.confirmationData = obj;
            this.formattedAmount = str;
        }

        public final java.lang.Object getConfirmationData() {
            return this.confirmationData;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.Object obj = this.confirmationData;
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRedeemSuccess(confirmationData=");
            sb.append(obj);
            sb.append(", formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.confirmationData.hashCode() * 31) + this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess onRedeemSuccess = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.confirmationData, onRedeemSuccess.confirmationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, onRedeemSuccess.formattedAmount);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess copy(java.lang.Object confirmationData, java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmationData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess(confirmationData, formattedAmount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Object getConfirmationData() {
            return this.confirmationData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemSuccess onRedeemSuccess, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = onRedeemSuccess.confirmationData;
            }
            if ((i & 2) != 0) {
                str = onRedeemSuccess.formattedAmount;
            }
            return onRedeemSuccess.copy(obj, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSummaryAmountFormatted;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "formattedAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnSummaryAmountFormatted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFormattedAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnSummaryAmountFormatted extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final java.lang.String formattedAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnSummaryAmountFormatted(java.lang.String str) {
            super("OnSummaryAmountFormatted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.formattedAmount = str;
        }

        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.formattedAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnSummaryAmountFormatted(formattedAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formattedAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedAmount, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted) other).formattedAmount);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted copy(java.lang.String formattedAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formattedAmount, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted(formattedAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getFormattedAmount() {
            return this.formattedAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnSummaryAmountFormatted onSummaryAmountFormatted, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onSummaryAmountFormatted.formattedAmount;
            }
            return onSummaryAmountFormatted.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemError;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "message", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "errorType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRedeemError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/error/ErrorStateType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRedeemError extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnRedeemError(java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType) {
            super("OnRedeemError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorStateType, "");
            this.message = str;
            this.errorType = errorStateType;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnRedeemError(message=");
            sb.append(str);
            sb.append(", errorType=");
            sb.append(errorStateType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.message.hashCode() * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError)) {
                return false;
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError onRedeemError = (com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.message, onRedeemError.message) && this.errorType == onRedeemError.errorType;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError copy(java.lang.String message, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError(message, errorType);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRedeemError onRedeemError, java.lang.String str, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.error.ErrorStateType errorStateType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onRedeemError.message;
            }
            if ((i & 2) != 0) {
                errorStateType = onRedeemError.errorType;
            }
            return onRedeemError.copy(str, errorStateType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnTermsClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnTermsClick;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnTermsClick extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnTermsClick(java.lang.String str) {
            super("OnTermsClick", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnTermsClick(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick) other).url);
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnTermsClick onTermsClick, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onTermsClick.url;
            }
            return onTermsClick.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnShowTermsBottomSheet;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnShowTermsBottomSheet extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet();

        public final int hashCode() {
            return -1948307300;
        }

        private OnShowTermsBottomSheet() {
            super("OnShowTermsBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "OnShowTermsBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShowTermsBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnRetry;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnRetry extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry();

        public final int hashCode() {
            return -809750698;
        }

        private OnRetry() {
            super("OnRetry", null);
        }

        public final java.lang.String toString() {
            return "OnRetry";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnRetry)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnDismiss;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnDismiss extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss();

        public final int hashCode() {
            return -208057416;
        }

        private OnDismiss() {
            super("OnDismiss", null);
        }

        public final java.lang.String toString() {
            return "OnDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnDismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnShareInfoToggle;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "", "shareInfo", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnShareInfoToggle;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getShareInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnShareInfoToggle extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        private final boolean shareInfo;

        public OnShareInfoToggle(boolean z) {
            super("OnShareInfoToggle", null);
            this.shareInfo = z;
        }

        public final boolean getShareInfo() {
            return this.shareInfo;
        }

        public final java.lang.String toString() {
            boolean z = this.shareInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnShareInfoToggle(shareInfo=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.shareInfo);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle) && this.shareInfo == ((com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle) other).shareInfo;
        }

        public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle copy(boolean shareInfo) {
            return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle(shareInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getShareInfo() {
            return this.shareInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle copy$default(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnShareInfoToggle onShareInfoToggle, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = onShareInfoToggle.shareInfo;
            }
            return onShareInfoToggle.copy(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent$OnActivityClick;", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/redeem/ui/mvi/RedeemEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnActivityClick extends com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnActivityClick INSTANCE = new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnActivityClick();

        public final int hashCode() {
            return -542313881;
        }

        private OnActivityClick() {
            super("OnActivityClick", null);
        }

        public final java.lang.String toString() {
            return "OnActivityClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.rewards.redeem.ui.mvi.RedeemEvent.OnActivityClick)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RedeemEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
