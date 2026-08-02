package com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0006\n\u000b\f\r\u000e\u000fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ProvisionStatusCheckRequested", "ProvisionStatusCheckSucceeded", "EligibilityCheckRequested", "EligibilityCheckSucceeded", "ClickedActivateContactless", "ClickedDeactivateContactless", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ClickedActivateContactless;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ClickedDeactivateContactless;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckSucceeded;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ContactlessPaymentsOperationEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactlessPaymentsOperationEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "", "cardId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionStatusCheckRequested extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisionStatusCheckRequested(java.lang.String str) {
            super("ProvisionStatusCheckRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.cardId = str;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionStatusCheckRequested(cardId=");
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
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) && kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested) other).cardId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested copy(java.lang.String cardId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested(cardId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckRequested provisionStatusCheckRequested, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = provisionStatusCheckRequested.cardId;
            }
            return provisionStatusCheckRequested.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "provisionStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ProvisionStatusCheckSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "getProvisionStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ProvisionStatusCheckSucceeded extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus provisionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProvisionStatusCheckSucceeded(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus) {
            super("ProvisionStatusCheckSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsProvisionStatus, "");
            this.cardId = str;
            this.provisionStatus = contactlessPaymentsProvisionStatus;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus getProvisionStatus() {
            return this.provisionStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus = this.provisionStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ProvisionStatusCheckSucceeded(cardId=");
            sb.append(str);
            sb.append(", provisionStatus=");
            sb.append(contactlessPaymentsProvisionStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.provisionStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded provisionStatusCheckSucceeded = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, provisionStatusCheckSucceeded.cardId) && this.provisionStatus == provisionStatusCheckSucceeded.provisionStatus;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded copy(java.lang.String cardId, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus provisionStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionStatus, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded(cardId, provisionStatus);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus getProvisionStatus() {
            return this.provisionStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ProvisionStatusCheckSucceeded provisionStatusCheckSucceeded, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = provisionStatusCheckSucceeded.cardId;
            }
            if ((i & 2) != 0) {
                contactlessPaymentsProvisionStatus = provisionStatusCheckSucceeded.provisionStatus;
            }
            return provisionStatusCheckSucceeded.copy(str, contactlessPaymentsProvisionStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckRequested;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "", "cardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "provisionStatus", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/ContactlessPaymentsProvisionStatus;", "getProvisionStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityCheckRequested extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        private final java.lang.String cardId;
        private final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus provisionStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityCheckRequested(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus) {
            super("EligibilityCheckRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactlessPaymentsProvisionStatus, "");
            this.cardId = str;
            this.provisionStatus = contactlessPaymentsProvisionStatus;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus getProvisionStatus() {
            return this.provisionStatus;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus = this.provisionStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityCheckRequested(cardId=");
            sb.append(str);
            sb.append(", provisionStatus=");
            sb.append(contactlessPaymentsProvisionStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.provisionStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested eligibilityCheckRequested = (com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, eligibilityCheckRequested.cardId) && this.provisionStatus == eligibilityCheckRequested.provisionStatus;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested copy(java.lang.String cardId, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus provisionStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionStatus, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested(cardId, provisionStatus);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus getProvisionStatus() {
            return this.provisionStatus;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckRequested eligibilityCheckRequested, java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.ContactlessPaymentsProvisionStatus contactlessPaymentsProvisionStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = eligibilityCheckRequested.cardId;
            }
            if ((i & 2) != 0) {
                contactlessPaymentsProvisionStatus = eligibilityCheckRequested.provisionStatus;
            }
            return eligibilityCheckRequested.copy(str, contactlessPaymentsProvisionStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckSucceeded;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "eligibilityStatus", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$EligibilityCheckSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/eligibility/EligibilityStatus;", "getEligibilityStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EligibilityCheckSucceeded extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EligibilityCheckSucceeded(com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus) {
            super("EligibilityCheckSucceeded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            this.eligibilityStatus = eligibilityStatus;
        }

        public final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus = this.eligibilityStatus;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EligibilityCheckSucceeded(eligibilityStatus=");
            sb.append(eligibilityStatus);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.eligibilityStatus.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded) && this.eligibilityStatus == ((com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded) other).eligibilityStatus;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded copy(com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eligibilityStatus, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded(eligibilityStatus);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus getEligibilityStatus() {
            return this.eligibilityStatus;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.EligibilityCheckSucceeded eligibilityCheckSucceeded, com.paypal.oslo.feature.debitcard.shared.domain.model.eligibility.EligibilityStatus eligibilityStatus, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                eligibilityStatus = eligibilityCheckSucceeded.eligibilityStatus;
            }
            return eligibilityCheckSucceeded.copy(eligibilityStatus);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ClickedActivateContactless;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClickedActivateContactless extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedActivateContactless INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedActivateContactless();

        public final int hashCode() {
            return -294959182;
        }

        private ClickedActivateContactless() {
            super("ClickedActivateContactless", null);
        }

        public final java.lang.String toString() {
            return "ClickedActivateContactless";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedActivateContactless)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent$ClickedDeactivateContactless;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/taptopay/operation/mvi/ContactlessPaymentsOperationEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClickedDeactivateContactless extends com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedDeactivateContactless INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedDeactivateContactless();

        public final int hashCode() {
            return -1303955823;
        }

        private ClickedDeactivateContactless() {
            super("ClickedDeactivateContactless", null);
        }

        public final java.lang.String toString() {
            return "ClickedDeactivateContactless";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.taptopay.operation.mvi.ContactlessPaymentsOperationEvent.ClickedDeactivateContactless)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ContactlessPaymentsOperationEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
