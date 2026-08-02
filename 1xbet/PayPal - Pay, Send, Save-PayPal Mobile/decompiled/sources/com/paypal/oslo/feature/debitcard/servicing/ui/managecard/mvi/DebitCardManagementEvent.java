package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi;

@kotlin.Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\"\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\",-./0123456789:;<=>?@ABCDEFGHIJKLM"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "LoadCardDetails", "ViewShowCardClicked", "DebitCardBannerClicked", "ReplaceDigitalCardClicked", "DebitPinClicked", "ViewPinClicked", "CancelCardClicked", "ReportLostStolenCardClicked", "ReportCardClicked", "RequestPhysicalCardClicked", "HelpLinkClicked", "CardDetailsLoaded", "CardDetailsLoadFailed", "AddCardholderButtonClicked", "ManageSecondaryCardholderClicked", "CardholderSelected", "PushProvisioningSuccessful", "PushProvisioningAndPinSetupSuccessful", "PendingFlowEventReceived", "BackClicked", "ErrorDismissCtaClicked", "OperationErrorDismissed", "LockCardToggled", "UnlockCardToggled", "CardLockedFailed", "CardUnlockedFailed", "AddressSaved", "CardConnectEligible", "CardConnectIneligible", "DeactivateContactlessClicked", "ContactlessDeactivationSuccess", "CardConnectEntryPointTapped", "EditSecondaryFundingSourceClicked", "PayPalBalanceInfoClicked", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$AddCardholderButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$AddressSaved;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CancelCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectEligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectEntryPointTapped;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectIneligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardLockedFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardUnlockedFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardholderSelected;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ContactlessDeactivationSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DeactivateContactlessClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DebitCardBannerClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DebitPinClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$EditSecondaryFundingSourceClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ErrorDismissCtaClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$HelpLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LoadCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LockCardToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ManageSecondaryCardholderClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$OperationErrorDismissed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PayPalBalanceInfoClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PendingFlowEventReceived;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PushProvisioningAndPinSetupSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PushProvisioningSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReplaceDigitalCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReportCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReportLostStolenCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$RequestPhysicalCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$UnlockCardToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ViewPinClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ViewShowCardClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardManagementEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardManagementEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LoadCardDetails;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "loadContext", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "copy", "(Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LoadCardDetails;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext;", "getLoadContext"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadCardDetails extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadContext;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadCardDetails(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadCardDetailsContext) {
            super("LoadCardDetails", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadCardDetailsContext, "");
            this.loadContext = loadCardDetailsContext;
        }

        public /* synthetic */ LoadCardDetails(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards refreshAllCards, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.RefreshAllCards(null, 1, null) : refreshAllCards);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext getLoadContext() {
            return this.loadContext;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadCardDetailsContext = this.loadContext;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadCardDetails(loadContext=");
            sb.append(loadCardDetailsContext);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.loadContext.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.loadContext, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails) other).loadContext);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails copy(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadContext) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadContext, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails(loadContext);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext getLoadContext() {
            return this.loadContext;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LoadCardDetails loadCardDetails, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext loadCardDetailsContext, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                loadCardDetailsContext = loadCardDetails.loadContext;
            }
            return loadCardDetails.copy(loadCardDetailsContext);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LoadCardDetails() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ViewShowCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewShowCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewShowCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewShowCardClicked();

        public final int hashCode() {
            return 723458798;
        }

        private ViewShowCardClicked() {
            super("ViewShowCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ViewShowCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewShowCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DebitCardBannerClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitCardBannerClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitCardBannerClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitCardBannerClicked();

        public final int hashCode() {
            return -1574987930;
        }

        private DebitCardBannerClicked() {
            super("DebitCardBannerClicked", null);
        }

        public final java.lang.String toString() {
            return "DebitCardBannerClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitCardBannerClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReplaceDigitalCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReplaceDigitalCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReplaceDigitalCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReplaceDigitalCardClicked();

        public final int hashCode() {
            return -1019908756;
        }

        private ReplaceDigitalCardClicked() {
            super("ReplaceDigitalCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ReplaceDigitalCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReplaceDigitalCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DebitPinClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DebitPinClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitPinClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitPinClicked();

        public final int hashCode() {
            return 1393928183;
        }

        private DebitPinClicked() {
            super("DebitPinClicked", null);
        }

        public final java.lang.String toString() {
            return "DebitPinClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DebitPinClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ViewPinClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ViewPinClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewPinClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewPinClicked();

        public final int hashCode() {
            return 582435102;
        }

        private ViewPinClicked() {
            super("ViewPinClicked", null);
        }

        public final java.lang.String toString() {
            return "ViewPinClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ViewPinClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CancelCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CancelCardClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CancelCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelCardClicked(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("CancelCardClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CancelCardClicked(productName=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CancelCardClicked cancelCardClicked, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = cancelCardClicked.productName;
            }
            return cancelCardClicked.copy(debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReportLostStolenCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportLostStolenCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportLostStolenCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportLostStolenCardClicked();

        public final int hashCode() {
            return 1436748625;
        }

        private ReportLostStolenCardClicked() {
            super("ReportLostStolenCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ReportLostStolenCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportLostStolenCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ReportCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReportCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportCardClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportCardClicked();

        public final int hashCode() {
            return 1739127804;
        }

        private ReportCardClicked() {
            super("ReportCardClicked", null);
        }

        public final java.lang.String toString() {
            return "ReportCardClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ReportCardClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$RequestPhysicalCardClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$RequestPhysicalCardClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestPhysicalCardClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestPhysicalCardClicked(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName) {
            super("RequestPhysicalCardClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestPhysicalCardClicked(productName=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked) && this.productName == ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked) other).productName;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked(productName);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.RequestPhysicalCardClicked requestPhysicalCardClicked, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = requestPhysicalCardClicked.productName;
            }
            return requestPhysicalCardClicked.copy(debitCardProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$HelpLinkClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "url", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$HelpLinkClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpLinkClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpLinkClicked(java.lang.String str) {
            super("HelpLinkClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.url;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpLinkClicked(url=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.url, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked) other).url);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked copy(java.lang.String url) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked(url);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getUrl() {
            return this.url;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.HelpLinkClicked helpLinkClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = helpLinkClicked.url;
            }
            return helpLinkClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0010\u0010\u0012\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b#\u0010\u000eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoaded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "operationSections", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrument;", "allInstruments", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "postLoadAction", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getOperationSections", "Ljava/lang/String;", "getCardId", "getAllInstruments", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/LoadCardDetailsContext$PostLoadAction;", "getPostLoadAction"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardDetailsLoaded extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> allInstruments;
        private final java.lang.String cardId;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> operationSections;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CardDetailsLoaded(java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> list, java.lang.String str, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            super("CardDetailsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            this.operationSections = list;
            this.cardId = str;
            this.allInstruments = list2;
            this.postLoadAction = postLoadAction;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> getOperationSections() {
            return this.operationSections;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> getAllInstruments() {
            return this.allInstruments;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> list = this.operationSections;
            java.lang.String str = this.cardId;
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> list2 = this.allInstruments;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction = this.postLoadAction;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetailsLoaded(operationSections=");
            sb.append(list);
            sb.append(", cardId=");
            sb.append(str);
            sb.append(", allInstruments=");
            sb.append(list2);
            sb.append(", postLoadAction=");
            sb.append(postLoadAction);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((this.operationSections.hashCode() * 31) + this.cardId.hashCode()) * 31) + this.allInstruments.hashCode()) * 31) + this.postLoadAction.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.operationSections, cardDetailsLoaded.operationSections) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, cardDetailsLoaded.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.allInstruments, cardDetailsLoaded.allInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.postLoadAction, cardDetailsLoaded.postLoadAction);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded copy(java.util.List<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> operationSections, java.lang.String cardId, java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> allInstruments, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationSections, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allInstruments, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postLoadAction, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded(operationSections, cardId, allInstruments, postLoadAction);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction getPostLoadAction() {
            return this.postLoadAction;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrument> component3() {
            return this.allInstruments;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection> component1() {
            return this.operationSections;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoaded cardDetailsLoaded, java.util.List list, java.lang.String str, java.util.List list2, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.LoadCardDetailsContext.PostLoadAction postLoadAction, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cardDetailsLoaded.operationSections;
            }
            if ((i & 2) != 0) {
                str = cardDetailsLoaded.cardId;
            }
            if ((i & 4) != 0) {
                list2 = cardDetailsLoaded.allInstruments;
            }
            if ((i & 8) != 0) {
                postLoadAction = cardDetailsLoaded.postLoadAction;
            }
            return cardDetailsLoaded.copy(list, str, list2, postLoadAction);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoadFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorCode", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardDetailsLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardDetailsLoadFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardDetailsLoadFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("CardDetailsLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorType = debitErrorType;
            this.errorCode = str;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardDetailsLoadFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.errorType.hashCode() * 31) + this.errorCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed cardDetailsLoadFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed) other;
            return this.errorType == cardDetailsLoadFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, cardDetailsLoadFailed.errorCode);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed(errorType, errorCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardDetailsLoadFailed cardDetailsLoadFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = cardDetailsLoadFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = cardDetailsLoadFailed.errorCode;
            }
            return cardDetailsLoadFailed.copy(debitErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$AddCardholderButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddCardholderButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddCardholderButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddCardholderButtonClicked();

        public final int hashCode() {
            return 1156886687;
        }

        private AddCardholderButtonClicked() {
            super("AddCardholderButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "AddCardholderButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddCardholderButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ManageSecondaryCardholderClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageSecondaryCardholderClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ManageSecondaryCardholderClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ManageSecondaryCardholderClicked();

        public final int hashCode() {
            return 2142246403;
        }

        private ManageSecondaryCardholderClicked() {
            super("ManageSecondaryCardholderClicked", null);
        }

        public final java.lang.String toString() {
            return "ManageSecondaryCardholderClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ManageSecondaryCardholderClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardholderSelected;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardholderSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardholderSelected extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardholderSelected(java.lang.String str) {
            super("CardholderSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardholderSelected(cardId=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardholderSelected cardholderSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cardholderSelected.cardId;
            }
            return cardholderSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PushProvisioningSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningSuccessful extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful();

        public final int hashCode() {
            return -1927836056;
        }

        private PushProvisioningSuccessful() {
            super("PushProvisioningSuccessful", null);
        }

        public final java.lang.String toString() {
            return "PushProvisioningSuccessful";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningSuccessful)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PushProvisioningAndPinSetupSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PushProvisioningAndPinSetupSuccessful extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful();

        public final int hashCode() {
            return 1518071883;
        }

        private PushProvisioningAndPinSetupSuccessful() {
            super("PushProvisioningAndPinSetupSuccessful", null);
        }

        public final java.lang.String toString() {
            return "PushProvisioningAndPinSetupSuccessful";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PushProvisioningAndPinSetupSuccessful)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PendingFlowEventReceived;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "flowIntent", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "component2", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PendingFlowEventReceived;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlow;", "getFlow", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardFlowIntent;", "getFlowIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PendingFlowEventReceived extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow flow;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent flowIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingFlowEventReceived(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent) {
            super("PendingFlowEventReceived", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardFlow, "");
            this.flow = debitCardFlow;
            this.flowIntent = debitCardFlowIntent;
        }

        public /* synthetic */ PendingFlowEventReceived(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow.DISPLAY : debitCardFlow, debitCardFlowIntent);
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow getFlow() {
            return this.flow;
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow = this.flow;
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent = this.flowIntent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PendingFlowEventReceived(flow=");
            sb.append(debitCardFlow);
            sb.append(", flowIntent=");
            sb.append(debitCardFlowIntent);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.flow.hashCode();
            com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent = this.flowIntent;
            return (hashCode * 31) + (debitCardFlowIntent == null ? 0 : debitCardFlowIntent.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived pendingFlowEventReceived = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived) other;
            return this.flow == pendingFlowEventReceived.flow && this.flowIntent == pendingFlowEventReceived.flowIntent;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow flow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent flowIntent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flow, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived(flow, flowIntent);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent getFlowIntent() {
            return this.flowIntent;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow getFlow() {
            return this.flow;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PendingFlowEventReceived pendingFlowEventReceived, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlow debitCardFlow, com.paypal.oslo.feature.debitcard.api.model.DebitCardFlowIntent debitCardFlowIntent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardFlow = pendingFlowEventReceived.flow;
            }
            if ((i & 2) != 0) {
                debitCardFlowIntent = pendingFlowEventReceived.flowIntent;
            }
            return pendingFlowEventReceived.copy(debitCardFlow, debitCardFlowIntent);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$BackClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.BackClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.BackClicked();

        public final int hashCode() {
            return 1056607961;
        }

        private BackClicked() {
            super("BackClicked", null);
        }

        public final java.lang.String toString() {
            return "BackClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.BackClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ErrorDismissCtaClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorDismissCtaClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ErrorDismissCtaClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ErrorDismissCtaClicked();

        public final int hashCode() {
            return -1041914432;
        }

        private ErrorDismissCtaClicked() {
            super("ErrorDismissCtaClicked", null);
        }

        public final java.lang.String toString() {
            return "ErrorDismissCtaClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ErrorDismissCtaClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$OperationErrorDismissed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OperationErrorDismissed extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.OperationErrorDismissed INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.OperationErrorDismissed();

        public final int hashCode() {
            return 2079116513;
        }

        private OperationErrorDismissed() {
            super("OperationErrorDismissed", null);
        }

        public final java.lang.String toString() {
            return "OperationErrorDismissed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.OperationErrorDismissed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LockCardToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "instrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$LockCardToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LockCardToggled extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String instrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LockCardToggled(java.lang.String str) {
            super("LockCardToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.instrumentId = str;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("LockCardToggled(instrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.instrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled) other).instrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled copy(java.lang.String instrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled(instrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.LockCardToggled lockCardToggled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = lockCardToggled.instrumentId;
            }
            return lockCardToggled.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$UnlockCardToggled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "instrumentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$UnlockCardToggled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnlockCardToggled extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String instrumentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnlockCardToggled(java.lang.String str) {
            super("UnlockCardToggled", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.instrumentId = str;
        }

        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.instrumentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UnlockCardToggled(instrumentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.instrumentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled) other).instrumentId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled copy(java.lang.String instrumentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled(instrumentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getInstrumentId() {
            return this.instrumentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.UnlockCardToggled unlockCardToggled, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = unlockCardToggled.instrumentId;
            }
            return unlockCardToggled.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardLockedFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardLockedFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardLockedFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardLockedFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("CardLockedFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.errorMessage = str;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardLockedFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed cardLockedFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed) other;
            return this.errorType == cardLockedFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, cardLockedFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed(errorType, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardLockedFailed cardLockedFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = cardLockedFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = cardLockedFailed.errorMessage;
            }
            return cardLockedFailed.copy(debitErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardUnlockedFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "", "errorMessage", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardUnlockedFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardUnlockedFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardUnlockedFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str) {
            super("CardUnlockedFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
            this.errorMessage = str;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardUnlockedFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(", errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.errorType.hashCode();
            java.lang.String str = this.errorMessage;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed cardUnlockedFailed = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed) other;
            return this.errorType == cardUnlockedFailed.errorType && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, cardUnlockedFailed.errorMessage);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType, java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed(errorType, errorMessage);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardUnlockedFailed cardUnlockedFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = cardUnlockedFailed.errorType;
            }
            if ((i & 2) != 0) {
                str = cardUnlockedFailed.errorMessage;
            }
            return cardUnlockedFailed.copy(debitErrorType, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$AddressSaved;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSaved extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddressSaved INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddressSaved();

        public final int hashCode() {
            return -1478852486;
        }

        private AddressSaved() {
            super("AddressSaved", null);
        }

        public final java.lang.String toString() {
            return "AddressSaved";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.AddressSaved)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectEligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardConnectEligible extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEligible INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEligible();

        public final int hashCode() {
            return 808324170;
        }

        private CardConnectEligible() {
            super("CardConnectEligible", null);
        }

        public final java.lang.String toString() {
            return "CardConnectEligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectIneligible;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardConnectIneligible extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible();

        public final int hashCode() {
            return 1070224303;
        }

        private CardConnectIneligible() {
            super("CardConnectIneligible", null);
        }

        public final java.lang.String toString() {
            return "CardConnectIneligible";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectIneligible)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DeactivateContactlessClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$DeactivateContactlessClicked;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DeactivateContactlessClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeactivateContactlessClicked(java.lang.String str) {
            super("DeactivateContactlessClicked", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DeactivateContactlessClicked(cardId=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.DeactivateContactlessClicked deactivateContactlessClicked, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = deactivateContactlessClicked.cardId;
            }
            return deactivateContactlessClicked.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$ContactlessDeactivationSuccess;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactlessDeactivationSuccess extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ContactlessDeactivationSuccess INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ContactlessDeactivationSuccess();

        public final int hashCode() {
            return -271390982;
        }

        private ContactlessDeactivationSuccess() {
            super("ContactlessDeactivationSuccess", null);
        }

        public final java.lang.String toString() {
            return "ContactlessDeactivationSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.ContactlessDeactivationSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$CardConnectEntryPointTapped;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardConnectEntryPointTapped extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEntryPointTapped INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEntryPointTapped();

        public final int hashCode() {
            return 1005876189;
        }

        private CardConnectEntryPointTapped() {
            super("CardConnectEntryPointTapped", null);
        }

        public final java.lang.String toString() {
            return "CardConnectEntryPointTapped";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.CardConnectEntryPointTapped)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$EditSecondaryFundingSourceClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EditSecondaryFundingSourceClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.EditSecondaryFundingSourceClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.EditSecondaryFundingSourceClicked();

        public final int hashCode() {
            return 1737984530;
        }

        private EditSecondaryFundingSourceClicked() {
            super("EditSecondaryFundingSourceClicked", null);
        }

        public final java.lang.String toString() {
            return "EditSecondaryFundingSourceClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.EditSecondaryFundingSourceClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent$PayPalBalanceInfoClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/mvi/DebitCardManagementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PayPalBalanceInfoClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PayPalBalanceInfoClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PayPalBalanceInfoClicked();

        public final int hashCode() {
            return 716653143;
        }

        private PayPalBalanceInfoClicked() {
            super("PayPalBalanceInfoClicked", null);
        }

        public final java.lang.String toString() {
            return "PayPalBalanceInfoClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEvent.PayPalBalanceInfoClicked)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ DebitCardManagementEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
