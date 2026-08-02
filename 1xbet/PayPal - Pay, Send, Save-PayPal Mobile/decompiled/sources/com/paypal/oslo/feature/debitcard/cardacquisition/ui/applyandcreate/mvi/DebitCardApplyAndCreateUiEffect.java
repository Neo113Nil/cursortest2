package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0001\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateToCardCreationSuccess", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect$NavigateToCardCreationSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardApplyAndCreateUiEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardApplyAndCreateUiEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u0005\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect$NavigateToCardCreationSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect;", "", "cardId", "", "isEligible", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "debitCardData", "<init>", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "copy", "(Ljava/lang/String;ZLcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateUiEffect$NavigateToCardCreationSuccess;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "Z", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardData;", "getDebitCardData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCardCreationSuccess extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect {
        public static final int $stable = com.paypal.oslo.feature.debitcard.api.model.DebitCardData.$stable;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData;
        private final boolean isEligible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCardCreationSuccess(java.lang.String str, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData) {
            super("NavigateToCardCreationSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardData, "");
            this.cardId = str;
            this.isEligible = z;
            this.debitCardData = debitCardData;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final boolean isEligible() {
            return this.isEligible;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardData getDebitCardData() {
            return this.debitCardData;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            boolean z = this.isEligible;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData = this.debitCardData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCardCreationSuccess(cardId=");
            sb.append(str);
            sb.append(", isEligible=");
            sb.append(z);
            sb.append(", debitCardData=");
            sb.append(debitCardData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.cardId.hashCode() * 31) + java.lang.Boolean.hashCode(this.isEligible)) * 31) + this.debitCardData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess navigateToCardCreationSuccess = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, navigateToCardCreationSuccess.cardId) && this.isEligible == navigateToCardCreationSuccess.isEligible && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardData, navigateToCardCreationSuccess.debitCardData);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess copy(java.lang.String cardId, boolean isEligible, com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardData, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess(cardId, isEligible, debitCardData);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardData getDebitCardData() {
            return this.debitCardData;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEligible() {
            return this.isEligible;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateUiEffect.NavigateToCardCreationSuccess navigateToCardCreationSuccess, java.lang.String str, boolean z, com.paypal.oslo.feature.debitcard.api.model.DebitCardData debitCardData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCardCreationSuccess.cardId;
            }
            if ((i & 2) != 0) {
                z = navigateToCardCreationSuccess.isEligible;
            }
            if ((i & 4) != 0) {
                debitCardData = navigateToCardCreationSuccess.debitCardData;
            }
            return navigateToCardCreationSuccess.copy(str, z, debitCardData);
        }
    }

    public /* synthetic */ DebitCardApplyAndCreateUiEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
