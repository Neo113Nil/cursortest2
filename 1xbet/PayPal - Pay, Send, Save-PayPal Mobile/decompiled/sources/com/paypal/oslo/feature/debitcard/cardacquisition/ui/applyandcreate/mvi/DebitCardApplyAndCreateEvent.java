package com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0003\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000e\u000f"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ProvisionCard", "OnProvisionSuccess", "OnProvisionError", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionError;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$ProvisionCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class DebitCardApplyAndCreateEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private DebitCardApplyAndCreateEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$ProvisionCard;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "", "shouldIssuePhysical", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;", "fundingPreference", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "tokenProductName", "<init>", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZLcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "component2", "()Z", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;", "component4", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "copy", "(Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;ZLcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$ProvisionCard;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "getProductName", "Z", "getShouldIssuePhysical", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/fundingoptions/DebitCardFundingPreference;", "getFundingPreference", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/DebitCardTokenProductName;", "getTokenProductName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionCard extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference fundingPreference;
        private final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName;
        private final boolean shouldIssuePhysical;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName tokenProductName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisionCard(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName) {
            super("ProvisionCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
            this.productName = debitCardProductName;
            this.shouldIssuePhysical = z;
            this.fundingPreference = debitCardFundingPreference;
            this.tokenProductName = debitCardTokenProductName;
        }

        public /* synthetic */ ProvisionCard(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(debitCardProductName, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : debitCardFundingPreference, (i & 8) != 0 ? null : debitCardTokenProductName);
        }

        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public final boolean getShouldIssuePhysical() {
            return this.shouldIssuePhysical;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference getFundingPreference() {
            return this.fundingPreference;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName getTokenProductName() {
            return this.tokenProductName;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName = this.productName;
            boolean z = this.shouldIssuePhysical;
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference = this.fundingPreference;
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName = this.tokenProductName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionCard(productName=");
            sb.append(debitCardProductName);
            sb.append(", shouldIssuePhysical=");
            sb.append(z);
            sb.append(", fundingPreference=");
            sb.append(debitCardFundingPreference);
            sb.append(", tokenProductName=");
            sb.append(debitCardTokenProductName);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.productName.hashCode();
            int hashCode2 = java.lang.Boolean.hashCode(this.shouldIssuePhysical);
            com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference = this.fundingPreference;
            int hashCode3 = debitCardFundingPreference == null ? 0 : debitCardFundingPreference.hashCode();
            com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName = this.tokenProductName;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (debitCardTokenProductName != null ? debitCardTokenProductName.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard provisionCard = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard) other;
            return this.productName == provisionCard.productName && this.shouldIssuePhysical == provisionCard.shouldIssuePhysical && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPreference, provisionCard.fundingPreference) && this.tokenProductName == provisionCard.tokenProductName;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard copy(com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName, boolean shouldIssuePhysical, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference fundingPreference, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName tokenProductName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(productName, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard(productName, shouldIssuePhysical, fundingPreference, tokenProductName);
        }

        /* renamed from: component4, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName getTokenProductName() {
            return this.tokenProductName;
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference getFundingPreference() {
            return this.fundingPreference;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldIssuePhysical() {
            return this.shouldIssuePhysical;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName getProductName() {
            return this.productName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.ProvisionCard provisionCard, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, boolean z, com.paypal.oslo.feature.debitcard.shared.domain.model.fundingoptions.DebitCardFundingPreference debitCardFundingPreference, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitCardTokenProductName debitCardTokenProductName, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitCardProductName = provisionCard.productName;
            }
            if ((i & 2) != 0) {
                z = provisionCard.shouldIssuePhysical;
            }
            if ((i & 4) != 0) {
                debitCardFundingPreference = provisionCard.fundingPreference;
            }
            if ((i & 8) != 0) {
                debitCardTokenProductName = provisionCard.tokenProductName;
            }
            return provisionCard.copy(debitCardProductName, z, debitCardFundingPreference, debitCardTokenProductName);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionSuccess;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "response", "<init>", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "copy", "(Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/domain/model/ProvisionDebitInstrumentResponse;", "getResponse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisionSuccess extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse response;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnProvisionSuccess(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse provisionDebitInstrumentResponse) {
            super("OnProvisionSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionDebitInstrumentResponse, "");
            this.response = provisionDebitInstrumentResponse;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse getResponse() {
            return this.response;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse provisionDebitInstrumentResponse = this.response;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnProvisionSuccess(response=");
            sb.append(provisionDebitInstrumentResponse);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.response.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.response, ((com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess) other).response);
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess copy(com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess(response);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse getResponse() {
            return this.response;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionSuccess onProvisionSuccess, com.paypal.oslo.feature.debitcard.cardacquisition.domain.model.ProvisionDebitInstrumentResponse provisionDebitInstrumentResponse, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                provisionDebitInstrumentResponse = onProvisionSuccess.response;
            }
            return onProvisionSuccess.copy(provisionDebitInstrumentResponse);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionError;", "Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent;", "", "errorMessage", "errorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/cardacquisition/ui/applyandcreate/mvi/DebitCardApplyAndCreateEvent$OnProvisionError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage", "getErrorCode", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnProvisionError extends com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent {
        public static final int $stable = 0;
        private final java.lang.String errorCode;
        private final java.lang.String errorMessage;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnProvisionError(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("OnProvisionError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorMessage = str;
            this.errorCode = str2;
            this.errorType = debitErrorType;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.String str2 = this.errorCode;
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnProvisionError(errorMessage=");
            sb.append(str);
            sb.append(", errorCode=");
            sb.append(str2);
            sb.append(", errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.errorMessage.hashCode() * 31) + this.errorCode.hashCode()) * 31) + this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError onProvisionError = (com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, onProvisionError.errorMessage) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorCode, onProvisionError.errorCode) && this.errorType == onProvisionError.errorType;
        }

        public final com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError copy(java.lang.String errorMessage, java.lang.String errorCode, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError(errorMessage, errorCode, errorType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError copy$default(com.paypal.oslo.feature.debitcard.cardacquisition.ui.applyandcreate.mvi.DebitCardApplyAndCreateEvent.OnProvisionError onProvisionError, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onProvisionError.errorMessage;
            }
            if ((i & 2) != 0) {
                str2 = onProvisionError.errorCode;
            }
            if ((i & 4) != 0) {
                debitErrorType = onProvisionError.errorType;
            }
            return onProvisionError.copy(str, str2, debitErrorType);
        }
    }

    public /* synthetic */ DebitCardApplyAndCreateEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
