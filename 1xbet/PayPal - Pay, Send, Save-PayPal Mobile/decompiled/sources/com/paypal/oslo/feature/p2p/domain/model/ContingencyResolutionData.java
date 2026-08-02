package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "getAction", "()Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "action", "ReceiverNameInput", "ScamWarningChoice", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ReceiverNameInput;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ScamWarningChoice;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ContingencyResolutionData {
    com.paypal.oslo.feature.p2p.domain.model.ContingencyAction getAction();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00188\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ReceiverNameInput;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ReceiverNameInput;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "action", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "getAction", "()Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiverNameInput implements com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction action;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public ReceiverNameInput(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.givenName = str;
            this.surname = str2;
            this.action = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.USER_DATA_COLLECTION_REQUIRED;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        @Override // com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData
        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverNameInput(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.givenName.hashCode() * 31) + this.surname.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput receiverNameInput = (com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, receiverNameInput.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, receiverNameInput.surname);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput copy(java.lang.String givenName, java.lang.String surname) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surname, "");
            return new com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput copy$default(com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ReceiverNameInput receiverNameInput, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = receiverNameInput.givenName;
            }
            if ((i & 2) != 0) {
                str2 = receiverNameInput.surname;
            }
            return receiverNameInput.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0018\u001a\u00020\u00178\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ScamWarningChoice;", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData;", "Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;", "customerChoice", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;)Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyResolutionData$ScamWarningChoice;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/ScamCustomerChoice;", "getCustomerChoice", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "action", "Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;", "getAction", "()Lcom/paypal/oslo/feature/p2p/domain/model/ContingencyAction;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScamWarningChoice implements com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction action;
        private final com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice customerChoice;

        public ScamWarningChoice(com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamCustomerChoice, "");
            this.customerChoice = scamCustomerChoice;
            this.action = com.paypal.oslo.feature.p2p.domain.model.ContingencyAction.DISPLAY_SCAM_WARNING;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice getCustomerChoice() {
            return this.customerChoice;
        }

        @Override // com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData
        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyAction getAction() {
            return this.action;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice = this.customerChoice;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScamWarningChoice(customerChoice=");
            sb.append(scamCustomerChoice);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.customerChoice.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice) && this.customerChoice == ((com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice) other).customerChoice;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice copy(com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice customerChoice) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customerChoice, "");
            return new com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice(customerChoice);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice getCustomerChoice() {
            return this.customerChoice;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice copy$default(com.paypal.oslo.feature.p2p.domain.model.ContingencyResolutionData.ScamWarningChoice scamWarningChoice, com.paypal.oslo.feature.p2p.domain.model.ScamCustomerChoice scamCustomerChoice, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scamCustomerChoice = scamWarningChoice.customerChoice;
            }
            return scamWarningChoice.copy(scamCustomerChoice);
        }
    }
}
