package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001c\u001d\u001e\u001f !\"#$%&'()*+,-"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "SelectedItemNoteUpdated", "ClearSelections", "RecommendedContactsLoaded", "PaymentIdInitialized", "ContactSelected", "UpdateReceiverFailed", "UpdateReceiverSuccess", "PaymentLinkOptionSelected", "ResetForNewFlow", "ContingenciesDetected", "ResolveContingencyRequested", "DismissContingencySheet", "ContingencyResolutionFailed", "ReceiverPrePopulated", "ScamContingencyDetected", "ClearScamContingency", "HighRiskScamDeclineDetected", "RemoveRecommendedContact", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ClearScamContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ClearSelections;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContactSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingenciesDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingencyResolutionFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$DismissContingencySheet;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$HighRiskScamDeclineDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$PaymentIdInitialized;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$PaymentLinkOptionSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ReceiverPrePopulated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RecommendedContactsLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RemoveRecommendedContact;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResetForNewFlow;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResolveContingencyRequested;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ScamContingencyDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$SelectedItemNoteUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$UpdateReceiverFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$UpdateReceiverSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ContactSectionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ContactSectionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$SelectedItemNoteUpdated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.NOTE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$SelectedItemNoteUpdated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNote"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SelectedItemNoteUpdated extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String note;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedItemNoteUpdated(java.lang.String str) {
            super("SelectedItemNoteUpdated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.note = str;
        }

        public final java.lang.String getNote() {
            return this.note;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.note;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SelectedItemNoteUpdated(note=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.note.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated) && kotlin.jvm.internal.Intrinsics.areEqual(this.note, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated) other).note);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated copy(java.lang.String note) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(note, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated(note);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNote() {
            return this.note;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.SelectedItemNoteUpdated selectedItemNoteUpdated, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = selectedItemNoteUpdated.note;
            }
            return selectedItemNoteUpdated.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ClearSelections;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearSelections extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearSelections INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearSelections();

        public final int hashCode() {
            return -1268606797;
        }

        private ClearSelections() {
            super("ClearSelections", null);
        }

        public final java.lang.String toString() {
            return "ClearSelections";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearSelections)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RecommendedContactsLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "contacts", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RecommendedContactsLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContacts"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RecommendedContactsLoaded extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> contacts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecommendedContactsLoaded(java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> list) {
            super("RecommendedContactsLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.contacts = list;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> getContacts() {
            return this.contacts;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> list = this.contacts;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RecommendedContactsLoaded(contacts=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.contacts.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.contacts, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded) other).contacts);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded copy(java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> contacts) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contacts, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded(contacts);
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem> component1() {
            return this.contacts;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RecommendedContactsLoaded recommendedContactsLoaded, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = recommendedContactsLoaded.contacts;
            }
            return recommendedContactsLoaded.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$PaymentIdInitialized;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$PaymentIdInitialized;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentIdInitialized extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String paymentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentIdInitialized(java.lang.String str) {
            super("PaymentIdInitialized", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentId = str;
        }

        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentIdInitialized(paymentId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized) other).paymentId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized copy(java.lang.String paymentId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized(paymentId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentIdInitialized paymentIdInitialized, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentIdInitialized.paymentId;
            }
            return paymentIdInitialized.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContactSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "contact", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "receiverType", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContactSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "getContact", "Ljava/lang/String;", "getContactId", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverType;", "getReceiverType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContactSelected extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact;
        private final java.lang.String contactId;
        private final com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactSelected(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
            super("ContactSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
            this.contact = p2PContactItem;
            this.contactId = str;
            this.receiverType = receiverType;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
            return this.receiverType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            java.lang.String str = this.contactId;
            com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType = this.receiverType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactSelected(contact=");
            sb.append(p2PContactItem);
            sb.append(", contactId=");
            sb.append(str);
            sb.append(", receiverType=");
            sb.append(receiverType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.contact.hashCode() * 31) + this.contactId.hashCode()) * 31) + this.receiverType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected contactSelected = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contact, contactSelected.contact) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, contactSelected.contactId) && this.receiverType == contactSelected.receiverType;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected copy(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact, java.lang.String contactId, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiverType, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected(contact, contactId, receiverType);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.ReceiverType getReceiverType() {
            return this.receiverType;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContactSelected contactSelected, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.ReceiverType receiverType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                p2PContactItem = contactSelected.contact;
            }
            if ((i & 2) != 0) {
                str = contactSelected.contactId;
            }
            if ((i & 4) != 0) {
                receiverType = contactSelected.receiverType;
            }
            return contactSelected.copy(p2PContactItem, str, receiverType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$UpdateReceiverFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateReceiverFailed extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed();

        public final int hashCode() {
            return 1915872630;
        }

        private UpdateReceiverFailed() {
            super("UpdateReceiverFailed", null);
        }

        public final java.lang.String toString() {
            return "UpdateReceiverFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$UpdateReceiverSuccess;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updateReceiverAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "copy", "(Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$UpdateReceiverSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "getUpdateReceiverAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UpdateReceiverSuccess extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateReceiverSuccess(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
            super("UpdateReceiverSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiver, "");
            this.updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateReceiverSuccess(updateReceiverAttempt=");
            sb.append(updatePaymentTransferAttemptReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updateReceiverAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateReceiverAttempt, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess) other).updateReceiverAttempt);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess copy(com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateReceiverAttempt, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess(updateReceiverAttempt);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.UpdateReceiverSuccess updateReceiverSuccess, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                updatePaymentTransferAttemptReceiver = updateReceiverSuccess.updateReceiverAttempt;
            }
            return updateReceiverSuccess.copy(updatePaymentTransferAttemptReceiver);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$PaymentLinkOptionSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentLinkOptionSelected extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected();

        public final int hashCode() {
            return 1544452303;
        }

        private PaymentLinkOptionSelected() {
            super("PaymentLinkOptionSelected", null);
        }

        public final java.lang.String toString() {
            return "PaymentLinkOptionSelected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.PaymentLinkOptionSelected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u0007\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\b\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResetForNewFlow;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", "paymentId", "", "isContactSyncEnabled", "isPpLinkEnabled", "isQrcFlowEnabled", "isPublicProfileEnabled", "<init>", "(Ljava/lang/String;ZZZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ZZZZ)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResetForNewFlow;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetForNewFlow extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final boolean isContactSyncEnabled;
        private final boolean isPpLinkEnabled;
        private final boolean isPublicProfileEnabled;
        private final boolean isQrcFlowEnabled;
        private final java.lang.String paymentId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetForNewFlow(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4) {
            super("ResetForNewFlow", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentId = str;
            this.isContactSyncEnabled = z;
            this.isPpLinkEnabled = z2;
            this.isQrcFlowEnabled = z3;
            this.isPublicProfileEnabled = z4;
        }

        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public final boolean isContactSyncEnabled() {
            return this.isContactSyncEnabled;
        }

        public final boolean isPpLinkEnabled() {
            return this.isPpLinkEnabled;
        }

        public final boolean isQrcFlowEnabled() {
            return this.isQrcFlowEnabled;
        }

        public final boolean isPublicProfileEnabled() {
            return this.isPublicProfileEnabled;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentId;
            boolean z = this.isContactSyncEnabled;
            boolean z2 = this.isPpLinkEnabled;
            boolean z3 = this.isQrcFlowEnabled;
            boolean z4 = this.isPublicProfileEnabled;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResetForNewFlow(paymentId=");
            sb.append(str);
            sb.append(", isContactSyncEnabled=");
            sb.append(z);
            sb.append(", isPpLinkEnabled=");
            sb.append(z2);
            sb.append(", isQrcFlowEnabled=");
            sb.append(z3);
            sb.append(", isPublicProfileEnabled=");
            sb.append(z4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.paymentId.hashCode() * 31) + java.lang.Boolean.hashCode(this.isContactSyncEnabled)) * 31) + java.lang.Boolean.hashCode(this.isPpLinkEnabled)) * 31) + java.lang.Boolean.hashCode(this.isQrcFlowEnabled)) * 31) + java.lang.Boolean.hashCode(this.isPublicProfileEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow resetForNewFlow = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.paymentId, resetForNewFlow.paymentId) && this.isContactSyncEnabled == resetForNewFlow.isContactSyncEnabled && this.isPpLinkEnabled == resetForNewFlow.isPpLinkEnabled && this.isQrcFlowEnabled == resetForNewFlow.isQrcFlowEnabled && this.isPublicProfileEnabled == resetForNewFlow.isPublicProfileEnabled;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow copy(java.lang.String paymentId, boolean isContactSyncEnabled, boolean isPpLinkEnabled, boolean isQrcFlowEnabled, boolean isPublicProfileEnabled) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentId, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow(paymentId, isContactSyncEnabled, isPpLinkEnabled, isQrcFlowEnabled, isPublicProfileEnabled);
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsPublicProfileEnabled() {
            return this.isPublicProfileEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsQrcFlowEnabled() {
            return this.isQrcFlowEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsPpLinkEnabled() {
            return this.isPpLinkEnabled;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsContactSyncEnabled() {
            return this.isContactSyncEnabled;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentId() {
            return this.paymentId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResetForNewFlow resetForNewFlow, java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resetForNewFlow.paymentId;
            }
            if ((i & 2) != 0) {
                z = resetForNewFlow.isContactSyncEnabled;
            }
            boolean z5 = z;
            if ((i & 4) != 0) {
                z2 = resetForNewFlow.isPpLinkEnabled;
            }
            boolean z6 = z2;
            if ((i & 8) != 0) {
                z3 = resetForNewFlow.isQrcFlowEnabled;
            }
            boolean z7 = z3;
            if ((i & 16) != 0) {
                z4 = resetForNewFlow.isPublicProfileEnabled;
            }
            return resetForNewFlow.copy(str, z5, z6, z7, z4);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingenciesDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", "Lcom/paypal/oslo/feature/p2p/domain/model/Contingency;", "contingencies", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updateReceiverAttempt", "<init>", "(Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "copy", "(Ljava/util/List;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingenciesDetected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getContingencies", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "getUpdateReceiverAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContingenciesDetected extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContingenciesDetected(java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
            super("ContingenciesDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiver, "");
            this.contingencies = list;
            this.updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> getContingencies() {
            return this.contingencies;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> list = this.contingencies;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContingenciesDetected(contingencies=");
            sb.append(list);
            sb.append(", updateReceiverAttempt=");
            sb.append(updatePaymentTransferAttemptReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contingencies.hashCode() * 31) + this.updateReceiverAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected contingenciesDetected = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contingencies, contingenciesDetected.contingencies) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateReceiverAttempt, contingenciesDetected.updateReceiverAttempt);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected copy(java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> contingencies, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contingencies, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateReceiverAttempt, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected(contingencies, updateReceiverAttempt);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public final java.util.List<com.paypal.oslo.feature.p2p.domain.model.Contingency> component1() {
            return this.contingencies;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingenciesDetected contingenciesDetected, java.util.List list, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = contingenciesDetected.contingencies;
            }
            if ((i & 2) != 0) {
                updatePaymentTransferAttemptReceiver = contingenciesDetected.updateReceiverAttempt;
            }
            return contingenciesDetected.copy(list, updatePaymentTransferAttemptReceiver);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResolveContingencyRequested;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ResolveContingencyRequested;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResolveContingencyRequested extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResolveContingencyRequested(java.lang.String str, java.lang.String str2) {
            super("ResolveContingencyRequested", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.givenName = str;
            this.surname = str2;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ResolveContingencyRequested(givenName=");
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested resolveContingencyRequested = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, resolveContingencyRequested.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, resolveContingencyRequested.surname);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested copy(java.lang.String givenName, java.lang.String surname) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surname, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ResolveContingencyRequested resolveContingencyRequested, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = resolveContingencyRequested.givenName;
            }
            if ((i & 2) != 0) {
                str2 = resolveContingencyRequested.surname;
            }
            return resolveContingencyRequested.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$DismissContingencySheet;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissContingencySheet extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.DismissContingencySheet INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.DismissContingencySheet();

        public final int hashCode() {
            return 643857945;
        }

        private DismissContingencySheet() {
            super("DismissContingencySheet", null);
        }

        public final java.lang.String toString() {
            return "DismissContingencySheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.DismissContingencySheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingencyResolutionFailed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", "errorMessage", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ContingencyResolutionFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getErrorMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContingencyResolutionFailed extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String errorMessage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContingencyResolutionFailed(java.lang.String str) {
            super("ContingencyResolutionFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.errorMessage = str;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.errorMessage;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContingencyResolutionFailed(errorMessage=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorMessage.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, ((com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed) other).errorMessage);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed copy(java.lang.String errorMessage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMessage, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed(errorMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ContingencyResolutionFailed contingencyResolutionFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = contingencyResolutionFailed.errorMessage;
            }
            return contingencyResolutionFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ReceiverPrePopulated;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "contact", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updateReceiverAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ReceiverPrePopulated;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/review/models/P2PContactItem;", "getContact", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "getUpdateReceiverAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiverPrePopulated extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiverPrePopulated(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
            super("ReceiverPrePopulated", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2PContactItem, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiver, "");
            this.contact = p2PContactItem;
            this.updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem = this.contact;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverPrePopulated(contact=");
            sb.append(p2PContactItem);
            sb.append(", updateReceiverAttempt=");
            sb.append(updatePaymentTransferAttemptReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contact.hashCode() * 31) + this.updateReceiverAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated receiverPrePopulated = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contact, receiverPrePopulated.contact) && kotlin.jvm.internal.Intrinsics.areEqual(this.updateReceiverAttempt, receiverPrePopulated.updateReceiverAttempt);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated copy(com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem contact, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contact, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateReceiverAttempt, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated(contact, updateReceiverAttempt);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem getContact() {
            return this.contact;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ReceiverPrePopulated receiverPrePopulated, com.paypal.oslo.feature.p2p.ui.review.models.P2PContactItem p2PContactItem, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                p2PContactItem = receiverPrePopulated.contact;
            }
            if ((i & 2) != 0) {
                updatePaymentTransferAttemptReceiver = receiverPrePopulated.updateReceiverAttempt;
            }
            return receiverPrePopulated.copy(p2PContactItem, updatePaymentTransferAttemptReceiver);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ScamContingencyDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "scamAlertType", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "updateReceiverAttempt", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ScamContingencyDetected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/scamalert/composables/ScamAlertType;", "getScamAlertType", "Lcom/paypal/oslo/feature/p2p/domain/model/UpdatePaymentTransferAttemptReceiver;", "getUpdateReceiverAttempt"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScamContingencyDetected extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType;
        private final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScamContingencyDetected(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver) {
            super("ScamContingencyDetected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatePaymentTransferAttemptReceiver, "");
            this.scamAlertType = scamAlertType;
            this.updateReceiverAttempt = updatePaymentTransferAttemptReceiver;
        }

        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType = this.scamAlertType;
            com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver = this.updateReceiverAttempt;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScamContingencyDetected(scamAlertType=");
            sb.append(scamAlertType);
            sb.append(", updateReceiverAttempt=");
            sb.append(updatePaymentTransferAttemptReceiver);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.scamAlertType.hashCode() * 31) + this.updateReceiverAttempt.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected scamContingencyDetected = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected) other;
            return this.scamAlertType == scamContingencyDetected.scamAlertType && kotlin.jvm.internal.Intrinsics.areEqual(this.updateReceiverAttempt, scamContingencyDetected.updateReceiverAttempt);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected copy(com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updateReceiverAttempt) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scamAlertType, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateReceiverAttempt, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected(scamAlertType, updateReceiverAttempt);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver getUpdateReceiverAttempt() {
            return this.updateReceiverAttempt;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType getScamAlertType() {
            return this.scamAlertType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ScamContingencyDetected scamContingencyDetected, com.paypal.oslo.feature.p2p.ui.scamalert.composables.ScamAlertType scamAlertType, com.paypal.oslo.feature.p2p.domain.model.UpdatePaymentTransferAttemptReceiver updatePaymentTransferAttemptReceiver, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                scamAlertType = scamContingencyDetected.scamAlertType;
            }
            if ((i & 2) != 0) {
                updatePaymentTransferAttemptReceiver = scamContingencyDetected.updateReceiverAttempt;
            }
            return scamContingencyDetected.copy(scamAlertType, updatePaymentTransferAttemptReceiver);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$ClearScamContingency;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearScamContingency extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearScamContingency INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearScamContingency();

        public final int hashCode() {
            return 78270823;
        }

        private ClearScamContingency() {
            super("ClearScamContingency", null);
        }

        public final java.lang.String toString() {
            return "ClearScamContingency";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.ClearScamContingency)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$HighRiskScamDeclineDetected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HighRiskScamDeclineDetected extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.HighRiskScamDeclineDetected INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.HighRiskScamDeclineDetected();

        public final int hashCode() {
            return 114570698;
        }

        private HighRiskScamDeclineDetected() {
            super("HighRiskScamDeclineDetected", null);
        }

        public final java.lang.String toString() {
            return "HighRiskScamDeclineDetected";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.HighRiskScamDeclineDetected)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RemoveRecommendedContact;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONTACT_ID, "contactName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/ContactSectionEvent$RemoveRecommendedContact;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getContactId", "getContactName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RemoveRecommendedContact extends com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent {
        public static final int $stable = 0;
        private final java.lang.String contactId;
        private final java.lang.String contactName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveRecommendedContact(java.lang.String str, java.lang.String str2) {
            super("RemoveRecommendedContact", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.contactId = str;
            this.contactName = str2;
        }

        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public final java.lang.String getContactName() {
            return this.contactName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.contactId;
            java.lang.String str2 = this.contactName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RemoveRecommendedContact(contactId=");
            sb.append(str);
            sb.append(", contactName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.contactId.hashCode() * 31) + this.contactName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact removeRecommendedContact = (com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.contactId, removeRecommendedContact.contactId) && kotlin.jvm.internal.Intrinsics.areEqual(this.contactName, removeRecommendedContact.contactName);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact copy(java.lang.String contactId, java.lang.String contactName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactName, "");
            return new com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact(contactId, contactName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getContactName() {
            return this.contactName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getContactId() {
            return this.contactId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact copy$default(com.paypal.oslo.feature.p2p.ui.review.events.ContactSectionEvent.RemoveRecommendedContact removeRecommendedContact, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = removeRecommendedContact.contactId;
            }
            if ((i & 2) != 0) {
                str2 = removeRecommendedContact.contactName;
            }
            return removeRecommendedContact.copy(str, str2);
        }
    }

    public /* synthetic */ ContactSectionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
