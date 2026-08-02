package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "", "<init>", "()V", "CardArt", "SecondaryCardArt", "CardBanner", "ManageCardholderDropdown", "CardOperations", "BillingAddress", "HelpLinks", "DailyLimits", "FundedBySection", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$BillingAddress;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardArt;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardBanner;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardOperations;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$DailyLimits;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$FundedBySection;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$HelpLinks;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$ManageCardholderDropdown;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$SecondaryCardArt;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardManagementSection {
    public static final int $stable = 0;

    private DebitCardManagementSection() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardArt;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;", "cardArt", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardArt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardArt;", "getCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardArt extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt cardArt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardArt(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardArt, "");
            this.cardArt = debitCardArt;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt getCardArt() {
            return this.cardArt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt = this.cardArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardArt(cardArt=");
            sb.append(debitCardArt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.cardArt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardArt, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt) other).cardArt);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt cardArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardArt, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt(cardArt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt getCardArt() {
            return this.cardArt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardArt cardArt, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardArt debitCardArt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardArt = cardArt.cardArt;
            }
            return cardArt.copy(debitCardArt);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$SecondaryCardArt;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "secondaryCardArt", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$SecondaryCardArt;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitSecondaryCardArt;", "getSecondaryCardArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecondaryCardArt extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt secondaryCardArt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryCardArt(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitSecondaryCardArt, "");
            this.secondaryCardArt = debitSecondaryCardArt;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt getSecondaryCardArt() {
            return this.secondaryCardArt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt = this.secondaryCardArt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SecondaryCardArt(secondaryCardArt=");
            sb.append(debitSecondaryCardArt);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.secondaryCardArt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondaryCardArt, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt) other).secondaryCardArt);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt secondaryCardArt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryCardArt, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt(secondaryCardArt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt getSecondaryCardArt() {
            return this.secondaryCardArt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.SecondaryCardArt secondaryCardArt, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitSecondaryCardArt debitSecondaryCardArt, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitSecondaryCardArt = secondaryCardArt.secondaryCardArt;
            }
            return secondaryCardArt.copy(debitSecondaryCardArt);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b\t\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardBanner;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "state", "", "arrivalDate", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "helpLink", "", "isSecondaryCardActivation", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;Z)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "component4", "()Z", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardBanner;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentDisplayState;", "getState", "Ljava/lang/String;", "getArrivalDate", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "getHelpLink", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardBanner extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 0;
        private final java.lang.String arrivalDate;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails helpLink;
        private final boolean isSecondaryCardActivation;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardBanner(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrumentDisplayState, "");
            this.state = debitInstrumentDisplayState;
            this.arrivalDate = str;
            this.helpLink = debitInstrumentLinkDetails;
            this.isSecondaryCardActivation = z;
        }

        public /* synthetic */ CardBanner(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitInstrumentDisplayState, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : debitInstrumentLinkDetails, (i & 8) != 0 ? false : z);
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState getState() {
            return this.state;
        }

        public final java.lang.String getArrivalDate() {
            return this.arrivalDate;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails getHelpLink() {
            return this.helpLink;
        }

        public final boolean isSecondaryCardActivation() {
            return this.isSecondaryCardActivation;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState = this.state;
            java.lang.String str = this.arrivalDate;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails = this.helpLink;
            boolean z = this.isSecondaryCardActivation;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardBanner(state=");
            sb.append(debitInstrumentDisplayState);
            sb.append(", arrivalDate=");
            sb.append(str);
            sb.append(", helpLink=");
            sb.append(debitInstrumentLinkDetails);
            sb.append(", isSecondaryCardActivation=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.state.hashCode();
            java.lang.String str = this.arrivalDate;
            int hashCode2 = str == null ? 0 : str.hashCode();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails = this.helpLink;
            return (((((hashCode * 31) + hashCode2) * 31) + (debitInstrumentLinkDetails != null ? debitInstrumentLinkDetails.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isSecondaryCardActivation);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner cardBanner = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner) other;
            return this.state == cardBanner.state && kotlin.jvm.internal.Intrinsics.areEqual(this.arrivalDate, cardBanner.arrivalDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.helpLink, cardBanner.helpLink) && this.isSecondaryCardActivation == cardBanner.isSecondaryCardActivation;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState state, java.lang.String arrivalDate, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails helpLink, boolean isSecondaryCardActivation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner(state, arrivalDate, helpLink, isSecondaryCardActivation);
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSecondaryCardActivation() {
            return this.isSecondaryCardActivation;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails getHelpLink() {
            return this.helpLink;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getArrivalDate() {
            return this.arrivalDate;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState getState() {
            return this.state;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardBanner cardBanner, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentDisplayState debitInstrumentDisplayState, java.lang.String str, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails debitInstrumentLinkDetails, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentDisplayState = cardBanner.state;
            }
            if ((i & 2) != 0) {
                str = cardBanner.arrivalDate;
            }
            if ((i & 4) != 0) {
                debitInstrumentLinkDetails = cardBanner.helpLink;
            }
            if ((i & 8) != 0) {
                z = cardBanner.isSecondaryCardActivation;
            }
            return cardBanner.copy(debitInstrumentDisplayState, str, debitInstrumentLinkDetails, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0007HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$ManageCardholderDropdown;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "cardholders", "", "Lcom/paypal/pds/components/MenuItem;", "Lcom/paypal/pds/components/DropdownItem;", "showAddCardholderButton", "", "<init>", "(Ljava/util/List;Z)V", "getCardholders", "()Ljava/util/List;", "getShowAddCardholderButton", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "debit-card_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ManageCardholderDropdown extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.pds.components.MenuItem> getHighSpeedVideoFpsRanges;
        private final boolean getHighSpeedVideoSizes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageCardholderDropdown(java.util.List<com.paypal.pds.components.MenuItem> list, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighSpeedVideoSizes = z;
        }

        public final java.util.List<com.paypal.pds.components.MenuItem> getCardholders() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final boolean getShowAddCardholderButton() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.pds.components.MenuItem> list = this.getHighSpeedVideoFpsRanges;
            boolean z = this.getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ManageCardholderDropdown(cardholders=");
            sb.append(list);
            sb.append(", showAddCardholderButton=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRanges.hashCode() * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown manageCardholderDropdown = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, manageCardholderDropdown.getHighSpeedVideoFpsRanges) && this.getHighSpeedVideoSizes == manageCardholderDropdown.getHighSpeedVideoSizes;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown copy(java.util.List<com.paypal.pds.components.MenuItem> cardholders, boolean showAddCardholderButton) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardholders, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown(cardholders, showAddCardholderButton);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.util.List<com.paypal.pds.components.MenuItem> component1() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.ManageCardholderDropdown manageCardholderDropdown, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = manageCardholderDropdown.getHighSpeedVideoFpsRanges;
            }
            if ((i & 2) != 0) {
                z = manageCardholderDropdown.getHighSpeedVideoSizes;
            }
            return manageCardholderDropdown.copy(list, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardOperations;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/cardoperations/model/CardOperationItem;", "operations", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$CardOperations;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOperations"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CardOperations extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> operations;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CardOperations(java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.operations = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> getOperations() {
            return this.operations;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> list = this.operations;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CardOperations(operations=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.operations.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations) && kotlin.jvm.internal.Intrinsics.areEqual(this.operations, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations) other).operations);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> operations) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operations, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations(operations);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.cardoperations.model.CardOperationItem> component1() {
            return this.operations;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.CardOperations cardOperations, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = cardOperations.operations;
            }
            return cardOperations.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$BillingAddress;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "", "", "address", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$BillingAddress;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BillingAddress extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> address;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillingAddress(java.util.List<java.lang.String> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.address = list;
        }

        public final java.util.List<java.lang.String> getAddress() {
            return this.address;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.address;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BillingAddress(address=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.address.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress) other).address);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress copy(java.util.List<java.lang.String> address) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress(address);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.address;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.BillingAddress billingAddress, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = billingAddress.address;
            }
            return billingAddress.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$HelpLinks;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentLinkDetails;", "links", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$HelpLinks;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLinks"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HelpLinks extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HelpLinks(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.links = list;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> getLinks() {
            return this.links;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> list = this.links;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("HelpLinks(links=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.links.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks) && kotlin.jvm.internal.Intrinsics.areEqual(this.links, ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks) other).links);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks copy(java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> links) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(links, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks(links);
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLinkDetails> component1() {
            return this.links;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.HelpLinks helpLinks, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = helpLinks.links;
            }
            return helpLinks.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$DailyLimits;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/limits/model/DailyLimit;", "dailyLimits", "", "testTags", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$DailyLimits;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getDailyLimits", "getTestTags"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DailyLimits extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> dailyLimits;
        private final java.util.List<java.lang.String> testTags;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DailyLimits(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> list, java.util.List<java.lang.String> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.dailyLimits = list;
            this.testTags = list2;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> getDailyLimits() {
            return this.dailyLimits;
        }

        public /* synthetic */ DailyLimits(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final java.util.List<java.lang.String> getTestTags() {
            return this.testTags;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> list = this.dailyLimits;
            java.util.List<java.lang.String> list2 = this.testTags;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DailyLimits(dailyLimits=");
            sb.append(list);
            sb.append(", testTags=");
            sb.append(list2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.dailyLimits.hashCode() * 31) + this.testTags.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits dailyLimits = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.dailyLimits, dailyLimits.dailyLimits) && kotlin.jvm.internal.Intrinsics.areEqual(this.testTags, dailyLimits.testTags);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits copy(java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> dailyLimits, java.util.List<java.lang.String> testTags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyLimits, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(testTags, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits(dailyLimits, testTags);
        }

        public final java.util.List<java.lang.String> component2() {
            return this.testTags;
        }

        public final java.util.List<com.paypal.oslo.feature.debitcard.servicing.domain.managecard.limits.model.DailyLimit> component1() {
            return this.dailyLimits;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.DailyLimits dailyLimits, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = dailyLimits.dailyLimits;
            }
            if ((i & 2) != 0) {
                list2 = dailyLimits.testTags;
            }
            return dailyLimits.copy(list, list2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$FundedBySection;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "totalBalanceAmount", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "variant", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "component2", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/managecard/model/DebitCardManagementSection$FundedBySection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitInstrumentMoneyAmount;", "getTotalBalanceAmount", "Lcom/paypal/oslo/feature/debitcard/shared/ui/components/fundingoptions/FundingOptionsComponentVariant;", "getVariant"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundedBySection extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount totalBalanceAmount;
        private final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant variant;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundedBySection(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingOptionsComponentVariant, "");
            this.totalBalanceAmount = debitInstrumentMoneyAmount;
            this.variant = fundingOptionsComponentVariant;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount getTotalBalanceAmount() {
            return this.totalBalanceAmount;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant getVariant() {
            return this.variant;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount = this.totalBalanceAmount;
            com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant = this.variant;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundedBySection(totalBalanceAmount=");
            sb.append(debitInstrumentMoneyAmount);
            sb.append(", variant=");
            sb.append(fundingOptionsComponentVariant);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount = this.totalBalanceAmount;
            return ((debitInstrumentMoneyAmount == null ? 0 : debitInstrumentMoneyAmount.hashCode()) * 31) + this.variant.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection fundedBySection = (com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalanceAmount, fundedBySection.totalBalanceAmount) && this.variant == fundedBySection.variant;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection copy(com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount totalBalanceAmount, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant variant) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(variant, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection(totalBalanceAmount, variant);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant getVariant() {
            return this.variant;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount getTotalBalanceAmount() {
            return this.totalBalanceAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.model.DebitCardManagementSection.FundedBySection fundedBySection, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentMoneyAmount debitInstrumentMoneyAmount, com.paypal.oslo.feature.debitcard.shared.ui.components.fundingoptions.FundingOptionsComponentVariant fundingOptionsComponentVariant, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitInstrumentMoneyAmount = fundedBySection.totalBalanceAmount;
            }
            if ((i & 2) != 0) {
                fundingOptionsComponentVariant = fundedBySection.variant;
            }
            return fundedBySection.copy(debitInstrumentMoneyAmount, fundingOptionsComponentVariant);
        }
    }

    public /* synthetic */ DebitCardManagementSection(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
