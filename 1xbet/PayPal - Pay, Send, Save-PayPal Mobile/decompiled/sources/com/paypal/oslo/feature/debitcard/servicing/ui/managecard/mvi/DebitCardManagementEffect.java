package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u001c\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u001c&'()*+,-./0123456789:;<=>?@A"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/core/mvi/UiEffect;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ShowCardDetailsBottomSheet", "ShowBillingAddressBottomSheet", "NavigateToReplaceDigitalCard", "NavigateToDebitPin", "NavigateToDebitPinForShowCard", "NavigateToViewPin", "NavigateToCancelCard", "NavigateToCardReplacement", "NavigateToReportCardReasonSelection", "NavigateToRequestPhysicalCard", "NavigateToBrowser", "NavigateToAddCardholderFlow", "NavigateToManageSecondaryCardholderFlow", "CloseManageCardholderBottomSheet", "NavigateToActivateCardFlow", "ShowPushProvisioningBottomSheet", "ShowFundingSourceSelectorBottomSheet", "ShowPayPalBalanceInfoBottomSheet", "ShowPushProvisioningSuccessToast", "ShowCardLockedToast", "ShowCardUnlockedToast", "ShowCardAlreadyLockedToast", "ShowCardAlreadyUnlockedToast", "ShowAddressUpdatedToast", "ShowDeactivateContactlessBottomSheet", "ShowContactlessDeactivatedToast", "NavigateBack", "NavigateToCardConnect", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$CloseManageCardholderBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToAddCardholderFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToBrowser;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCancelCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardConnect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardReplacement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPinForShowCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToManageSecondaryCardholderFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReplaceDigitalCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReportCardReasonSelection;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToRequestPhysicalCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToViewPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowAddressUpdatedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowBillingAddressBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardAlreadyLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardAlreadyUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardDetailsBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowContactlessDeactivatedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowDeactivateContactlessBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowFundingSourceSelectorBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPayPalBalanceInfoBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPushProvisioningBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPushProvisioningSuccessToast;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardManagementEffect implements com.paypal.oslo.core.mvi.UiEffect {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardManagementEffect(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiEffect
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardDetailsBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardDetailsBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet();

        public final int hashCode() {
            return -2100426615;
        }

        private ShowCardDetailsBottomSheet() {
            super("ShowCardDetailsBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowCardDetailsBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardDetailsBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowBillingAddressBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "debitInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowBillingAddressBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Ljava/lang/String;", "getDebitInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowBillingAddressBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final java.lang.String debitInstrumentId;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowBillingAddressBottomSheet(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
            super("ShowBillingAddressBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.productName = debitCardProductName;
            this.debitInstrumentId = str;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.String str = this.debitInstrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowBillingAddressBottomSheet(productName=");
            sb.append(debitCardProductName);
            sb.append(", debitInstrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.productName.hashCode() * 31) + this.debitInstrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet showBillingAddressBottomSheet = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet) other;
            return this.productName == showBillingAddressBottomSheet.productName && kotlin.jvm.internal.Intrinsics.areEqual(this.debitInstrumentId, showBillingAddressBottomSheet.debitInstrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, java.lang.String debitInstrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet(productName, debitInstrumentId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDebitInstrumentId() {
            return this.debitInstrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowBillingAddressBottomSheet showBillingAddressBottomSheet, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = showBillingAddressBottomSheet.productName;
            }
            if ((i & 2) != 0) {
                str = showBillingAddressBottomSheet.debitInstrumentId;
            }
            return showBillingAddressBottomSheet.copy(debitCardProductName, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReplaceDigitalCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReplaceDigitalCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReplaceDigitalCard extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReplaceDigitalCard(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
            super("NavigateToReplaceDigitalCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
            this.replacementInfo = cardReplacementInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = this.replacementInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReplaceDigitalCard(replacementInfo=");
            sb.append(cardReplacementInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replacementInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacementInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard) other).replacementInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacementInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard(replacementInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReplaceDigitalCard navigateToReplaceDigitalCard, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardReplacementInfo = navigateToReplaceDigitalCard.replacementInfo;
            }
            return navigateToReplaceDigitalCard.copy(cardReplacementInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDebitPin extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDebitPin(java.lang.String str) {
            super("NavigateToDebitPin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDebitPin(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPin navigateToDebitPin, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDebitPin.cardId;
            }
            return navigateToDebitPin.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPinForShowCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToDebitPinForShowCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDebitPinForShowCard extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToDebitPinForShowCard(java.lang.String str) {
            super("NavigateToDebitPinForShowCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDebitPinForShowCard(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToDebitPinForShowCard navigateToDebitPinForShowCard, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDebitPinForShowCard.cardId;
            }
            return navigateToDebitPinForShowCard.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToViewPin;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;", "viewPinInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToViewPin;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/viewpin/model/ViewPinInfo;", "getViewPinInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToViewPin extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo viewPinInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToViewPin(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo viewPinInfo) {
            super("NavigateToViewPin", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinInfo, "");
            this.viewPinInfo = viewPinInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo getViewPinInfo() {
            return this.viewPinInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo viewPinInfo = this.viewPinInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToViewPin(viewPinInfo=");
            sb.append(viewPinInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.viewPinInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin) && kotlin.jvm.internal.Intrinsics.areEqual(this.viewPinInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin) other).viewPinInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin copy(com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo viewPinInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewPinInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin(viewPinInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo getViewPinInfo() {
            return this.viewPinInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToViewPin navigateToViewPin, com.paypal.oslo.feature.debitcard.servicing.domain.viewpin.model.ViewPinInfo viewPinInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                viewPinInfo = navigateToViewPin.viewPinInfo;
            }
            return navigateToViewPin.copy(viewPinInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCancelCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "cancelCardInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCancelCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/cancelcard/CancelCardInfo;", "getCancelCardInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCancelCard extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCancelCard(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
            super("NavigateToCancelCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardInfo, "");
            this.cancelCardInfo = cancelCardInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getCancelCardInfo() {
            return this.cancelCardInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo = this.cancelCardInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCancelCard(cancelCardInfo=");
            sb.append(cancelCardInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cancelCardInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.cancelCardInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard) other).cancelCardInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard copy(com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancelCardInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard(cancelCardInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo getCancelCardInfo() {
            return this.cancelCardInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCancelCard navigateToCancelCard, com.paypal.oslo.feature.debitcard.servicing.domain.cancelcard.CancelCardInfo cancelCardInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cancelCardInfo = navigateToCancelCard.cancelCardInfo;
            }
            return navigateToCancelCard.copy(cancelCardInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardReplacement;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardReplacement;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCardReplacement extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCardReplacement(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
            super("NavigateToCardReplacement", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
            this.replacementInfo = cardReplacementInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = this.replacementInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCardReplacement(replacementInfo=");
            sb.append(cardReplacementInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replacementInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacementInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement) other).replacementInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacementInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement(replacementInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardReplacement navigateToCardReplacement, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardReplacementInfo = navigateToCardReplacement.replacementInfo;
            }
            return navigateToCardReplacement.copy(cardReplacementInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReportCardReasonSelection;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "replacementInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToReportCardReasonSelection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/reportcard/CardReplacementInfo;", "getReplacementInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReportCardReasonSelection extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReportCardReasonSelection(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo) {
            super("NavigateToReportCardReasonSelection", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardReplacementInfo, "");
            this.replacementInfo = cardReplacementInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo = this.replacementInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReportCardReasonSelection(replacementInfo=");
            sb.append(cardReplacementInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.replacementInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection) && kotlin.jvm.internal.Intrinsics.areEqual(this.replacementInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection) other).replacementInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection copy(com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo replacementInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(replacementInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection(replacementInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo getReplacementInfo() {
            return this.replacementInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToReportCardReasonSelection navigateToReportCardReasonSelection, com.paypal.oslo.feature.debitcard.servicing.domain.reportcard.CardReplacementInfo cardReplacementInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                cardReplacementInfo = navigateToReportCardReasonSelection.replacementInfo;
            }
            return navigateToReportCardReasonSelection.copy(cardReplacementInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToRequestPhysicalCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "requestPhysicalCardInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToRequestPhysicalCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/requestphysicalcard/RequestPhysicalCardInfo;", "getRequestPhysicalCardInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRequestPhysicalCard extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToRequestPhysicalCard(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo) {
            super("NavigateToRequestPhysicalCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardInfo, "");
            this.requestPhysicalCardInfo = requestPhysicalCardInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo getRequestPhysicalCardInfo() {
            return this.requestPhysicalCardInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo = this.requestPhysicalCardInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRequestPhysicalCard(requestPhysicalCardInfo=");
            sb.append(requestPhysicalCardInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.requestPhysicalCardInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestPhysicalCardInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard) other).requestPhysicalCardInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard copy(com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestPhysicalCardInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard(requestPhysicalCardInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo getRequestPhysicalCardInfo() {
            return this.requestPhysicalCardInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToRequestPhysicalCard navigateToRequestPhysicalCard, com.paypal.oslo.feature.debitcard.servicing.domain.requestphysicalcard.RequestPhysicalCardInfo requestPhysicalCardInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                requestPhysicalCardInfo = navigateToRequestPhysicalCard.requestPhysicalCardInfo;
            }
            return navigateToRequestPhysicalCard.copy(requestPhysicalCardInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToBrowser;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToBrowser;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBrowser extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToBrowser(java.lang.String str) {
            super("NavigateToBrowser", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToBrowser(url=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToBrowser navigateToBrowser, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToBrowser.url;
            }
            return navigateToBrowser.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToAddCardholderFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAddCardholderFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToAddCardholderFlow INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToAddCardholderFlow();

        public final int hashCode() {
            return 383184437;
        }

        private NavigateToAddCardholderFlow() {
            super("NavigateToAddCardholderFlow", null);
        }

        public final java.lang.String toString() {
            return "NavigateToAddCardholderFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToAddCardholderFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToManageSecondaryCardholderFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToManageSecondaryCardholderFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToManageSecondaryCardholderFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToManageSecondaryCardholderFlow(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("NavigateToManageSecondaryCardholderFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToManageSecondaryCardholderFlow(productName=");
            sb.append(debitCardProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.productName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToManageSecondaryCardholderFlow navigateToManageSecondaryCardholderFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = navigateToManageSecondaryCardholderFlow.productName;
            }
            return navigateToManageSecondaryCardholderFlow.copy(debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$CloseManageCardholderBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseManageCardholderBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.CloseManageCardholderBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.CloseManageCardholderBottomSheet();

        public final int hashCode() {
            return -420259259;
        }

        private CloseManageCardholderBottomSheet() {
            super("CloseManageCardholderBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "CloseManageCardholderBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.CloseManageCardholderBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToActivateCardFlow;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "debitCardActivationInfo", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToActivateCardFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/activatecard/DebitCardActivationInfo;", "getDebitCardActivationInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToActivateCardFlow extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToActivateCardFlow(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
            super("NavigateToActivateCardFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
            this.debitCardActivationInfo = debitCardActivationInfo;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getDebitCardActivationInfo() {
            return this.debitCardActivationInfo;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo = this.debitCardActivationInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToActivateCardFlow(debitCardActivationInfo=");
            sb.append(debitCardActivationInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.debitCardActivationInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.debitCardActivationInfo, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow) other).debitCardActivationInfo);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow copy(com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardActivationInfo, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow(debitCardActivationInfo);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo getDebitCardActivationInfo() {
            return this.debitCardActivationInfo;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToActivateCardFlow navigateToActivateCardFlow, com.paypal.oslo.feature.debitcard.servicing.domain.activatecard.DebitCardActivationInfo debitCardActivationInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardActivationInfo = navigateToActivateCardFlow.debitCardActivationInfo;
            }
            return navigateToActivateCardFlow.copy(debitCardActivationInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPushProvisioningBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPushProvisioningBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningBottomSheet();

        public final int hashCode() {
            return -150645338;
        }

        private ShowPushProvisioningBottomSheet() {
            super("ShowPushProvisioningBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowPushProvisioningBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowFundingSourceSelectorBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowFundingSourceSelectorBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowFundingSourceSelectorBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowFundingSourceSelectorBottomSheet();

        public final int hashCode() {
            return -1621269948;
        }

        private ShowFundingSourceSelectorBottomSheet() {
            super("ShowFundingSourceSelectorBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowFundingSourceSelectorBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowFundingSourceSelectorBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPayPalBalanceInfoBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPayPalBalanceInfoBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPayPalBalanceInfoBottomSheet INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPayPalBalanceInfoBottomSheet();

        public final int hashCode() {
            return -1551794588;
        }

        private ShowPayPalBalanceInfoBottomSheet() {
            super("ShowPayPalBalanceInfoBottomSheet", null);
        }

        public final java.lang.String toString() {
            return "ShowPayPalBalanceInfoBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPayPalBalanceInfoBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowPushProvisioningSuccessToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPushProvisioningSuccessToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningSuccessToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningSuccessToast();

        public final int hashCode() {
            return 1015088754;
        }

        private ShowPushProvisioningSuccessToast() {
            super("ShowPushProvisioningSuccessToast", null);
        }

        public final java.lang.String toString() {
            return "ShowPushProvisioningSuccessToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowPushProvisioningSuccessToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardLockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardLockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardLockedToast();

        public final int hashCode() {
            return -1844031770;
        }

        private ShowCardLockedToast() {
            super("ShowCardLockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCardLockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardLockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardUnlockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardUnlockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardUnlockedToast();

        public final int hashCode() {
            return -331181971;
        }

        private ShowCardUnlockedToast() {
            super("ShowCardUnlockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCardUnlockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardUnlockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardAlreadyLockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardAlreadyLockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyLockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyLockedToast();

        public final int hashCode() {
            return -363129860;
        }

        private ShowCardAlreadyLockedToast() {
            super("ShowCardAlreadyLockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCardAlreadyLockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyLockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowCardAlreadyUnlockedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowCardAlreadyUnlockedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyUnlockedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyUnlockedToast();

        public final int hashCode() {
            return 1181378563;
        }

        private ShowCardAlreadyUnlockedToast() {
            super("ShowCardAlreadyUnlockedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowCardAlreadyUnlockedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowCardAlreadyUnlockedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowAddressUpdatedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowAddressUpdatedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowAddressUpdatedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowAddressUpdatedToast();

        public final int hashCode() {
            return -940674407;
        }

        private ShowAddressUpdatedToast() {
            super("ShowAddressUpdatedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowAddressUpdatedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowAddressUpdatedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowDeactivateContactlessBottomSheet;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowDeactivateContactlessBottomSheet;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowDeactivateContactlessBottomSheet extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowDeactivateContactlessBottomSheet(java.lang.String str) {
            super("ShowDeactivateContactlessBottomSheet", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowDeactivateContactlessBottomSheet(cardId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowDeactivateContactlessBottomSheet showDeactivateContactlessBottomSheet, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showDeactivateContactlessBottomSheet.cardId;
            }
            return showDeactivateContactlessBottomSheet.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$ShowContactlessDeactivatedToast;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowContactlessDeactivatedToast extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowContactlessDeactivatedToast INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowContactlessDeactivatedToast();

        public final int hashCode() {
            return -1329284407;
        }

        private ShowContactlessDeactivatedToast() {
            super("ShowContactlessDeactivatedToast", null);
        }

        public final java.lang.String toString() {
            return "ShowContactlessDeactivatedToast";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.ShowContactlessDeactivatedToast)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateBack;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateBack();

        public final int hashCode() {
            return -533619934;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardConnect;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "cardProduct", "", "instrumentId", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEffect$NavigateToCardConnect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getCardProduct", "Ljava/lang/String;", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCardConnect extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName cardProduct;
        private final java.lang.String instrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToCardConnect(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str) {
            super("NavigateToCardConnect", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardProduct = debitCardProductName;
            this.instrumentId = str;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getCardProduct() {
            return this.cardProduct;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.cardProduct;
            java.lang.String str = this.instrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToCardConnect(cardProduct=");
            sb.append(debitCardProductName);
            sb.append(", instrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardProduct.hashCode() * 31) + this.instrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect navigateToCardConnect = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect) other;
            return this.cardProduct == navigateToCardConnect.cardProduct && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, navigateToCardConnect.instrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName cardProduct, java.lang.String instrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardProduct, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect(cardProduct, instrumentId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getCardProduct() {
            return this.cardProduct;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect.NavigateToCardConnect navigateToCardConnect, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = navigateToCardConnect.cardProduct;
            }
            if ((i & 2) != 0) {
                str = navigateToCardConnect.instrumentId;
            }
            return navigateToCardConnect.copy(debitCardProductName, str);
        }
    }

    public /* synthetic */ DebitCardManagementEffect(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
