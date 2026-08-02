package com.paypal.oslo.feature.p2p.ui.review.events;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "TypeSelected", "Expanded", "Collapsed", "SetLoading", "TypeConfirmedByServer", "TypeSelectionReverted", "SupportedTransferTypesLoaded", "AwaitingConfirmationChanged", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$AwaitingConfirmationChanged;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$Collapsed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$Expanded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$SetLoading;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$SupportedTransferTypesLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeConfirmedByServer;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeSelectionReverted;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentTypeAccordionEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PaymentTypeAccordionEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeSelected;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "selectedTypeId", "", "shouldCollapse", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeSelected;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSelectedTypeId", "Z", "getShouldCollapse"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TypeSelected extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        private final java.lang.String selectedTypeId;
        private final boolean shouldCollapse;

        public TypeSelected(java.lang.String str, boolean z) {
            super("TypeSelected", null);
            this.selectedTypeId = str;
            this.shouldCollapse = z;
        }

        public /* synthetic */ TypeSelected(java.lang.String str, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? true : z);
        }

        public final java.lang.String getSelectedTypeId() {
            return this.selectedTypeId;
        }

        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.selectedTypeId;
            boolean z = this.shouldCollapse;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeSelected(selectedTypeId=");
            sb.append(str);
            sb.append(", shouldCollapse=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.selectedTypeId;
            return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Boolean.hashCode(this.shouldCollapse);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected typeSelected = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.selectedTypeId, typeSelected.selectedTypeId) && this.shouldCollapse == typeSelected.shouldCollapse;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected copy(java.lang.String selectedTypeId, boolean shouldCollapse) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected(selectedTypeId, shouldCollapse);
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShouldCollapse() {
            return this.shouldCollapse;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getSelectedTypeId() {
            return this.selectedTypeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelected typeSelected, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = typeSelected.selectedTypeId;
            }
            if ((i & 2) != 0) {
                z = typeSelected.shouldCollapse;
            }
            return typeSelected.copy(str, z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$Expanded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Expanded extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Expanded INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Expanded();

        public final int hashCode() {
            return 1072992349;
        }

        private Expanded() {
            super("Expanded", null);
        }

        public final java.lang.String toString() {
            return "Expanded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Expanded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$Collapsed;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Collapsed extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Collapsed INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Collapsed();

        public final int hashCode() {
            return 765780787;
        }

        private Collapsed() {
            super("Collapsed", null);
        }

        public final java.lang.String toString() {
            return "Collapsed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.Collapsed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$SetLoading;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SetLoading extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SetLoading INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SetLoading();

        public final int hashCode() {
            return -1171393250;
        }

        private SetLoading() {
            super("SetLoading", null);
        }

        public final java.lang.String toString() {
            return "SetLoading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SetLoading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeConfirmedByServer;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "confirmedTypeId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeConfirmedByServer;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmedTypeId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TypeConfirmedByServer extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        private final java.lang.String confirmedTypeId;

        public TypeConfirmedByServer(java.lang.String str) {
            super("TypeConfirmedByServer", null);
            this.confirmedTypeId = str;
        }

        public final java.lang.String getConfirmedTypeId() {
            return this.confirmedTypeId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmedTypeId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TypeConfirmedByServer(confirmedTypeId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.confirmedTypeId;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmedTypeId, ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer) other).confirmedTypeId);
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer copy(java.lang.String confirmedTypeId) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer(confirmedTypeId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmedTypeId() {
            return this.confirmedTypeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeConfirmedByServer typeConfirmedByServer, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = typeConfirmedByServer.confirmedTypeId;
            }
            return typeConfirmedByServer.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$TypeSelectionReverted;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TypeSelectionReverted extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted INSTANCE = new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted();

        public final int hashCode() {
            return -382039567;
        }

        private TypeSelectionReverted() {
            super("TypeSelectionReverted", null);
        }

        public final java.lang.String toString() {
            return "TypeSelectionReverted";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.TypeSelectionReverted)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$SupportedTransferTypesLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "supportedTransferTypesCount", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "transferSelectionRequirement", "<init>", "(ILcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;)V", "component1", "()I", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "copy", "(ILcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$SupportedTransferTypesLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getSupportedTransferTypesCount", "Lcom/paypal/oslo/feature/p2p/domain/model/TransferSelectionRequirement;", "getTransferSelectionRequirement"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SupportedTransferTypesLoaded extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        private final int supportedTransferTypesCount;
        private final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement;

        public SupportedTransferTypesLoaded(int i, com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement) {
            super("SupportedTransferTypesLoaded", null);
            this.supportedTransferTypesCount = i;
            this.transferSelectionRequirement = transferSelectionRequirement;
        }

        public final int getSupportedTransferTypesCount() {
            return this.supportedTransferTypesCount;
        }

        public final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement getTransferSelectionRequirement() {
            return this.transferSelectionRequirement;
        }

        public final java.lang.String toString() {
            int i = this.supportedTransferTypesCount;
            com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement = this.transferSelectionRequirement;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SupportedTransferTypesLoaded(supportedTransferTypesCount=");
            sb.append(i);
            sb.append(", transferSelectionRequirement=");
            sb.append(transferSelectionRequirement);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Integer.hashCode(this.supportedTransferTypesCount);
            com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement = this.transferSelectionRequirement;
            return (hashCode * 31) + (transferSelectionRequirement == null ? 0 : transferSelectionRequirement.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded supportedTransferTypesLoaded = (com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded) other;
            return this.supportedTransferTypesCount == supportedTransferTypesLoaded.supportedTransferTypesCount && this.transferSelectionRequirement == supportedTransferTypesLoaded.transferSelectionRequirement;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded copy(int supportedTransferTypesCount, com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded(supportedTransferTypesCount, transferSelectionRequirement);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement getTransferSelectionRequirement() {
            return this.transferSelectionRequirement;
        }

        /* renamed from: component1, reason: from getter */
        public final int getSupportedTransferTypesCount() {
            return this.supportedTransferTypesCount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.SupportedTransferTypesLoaded supportedTransferTypesLoaded, int i, com.paypal.oslo.feature.p2p.domain.model.TransferSelectionRequirement transferSelectionRequirement, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = supportedTransferTypesLoaded.supportedTransferTypesCount;
            }
            if ((i2 & 2) != 0) {
                transferSelectionRequirement = supportedTransferTypesLoaded.transferSelectionRequirement;
            }
            return supportedTransferTypesLoaded.copy(i, transferSelectionRequirement);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0003\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$AwaitingConfirmationChanged;", "Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent;", "", "isAwaiting", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/p2p/ui/review/events/PaymentTypeAccordionEvent$AwaitingConfirmationChanged;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AwaitingConfirmationChanged extends com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent {
        public static final int $stable = 0;
        private final boolean isAwaiting;

        public AwaitingConfirmationChanged(boolean z) {
            super("AwaitingConfirmationChanged", null);
            this.isAwaiting = z;
        }

        public final boolean isAwaiting() {
            return this.isAwaiting;
        }

        public final java.lang.String toString() {
            boolean z = this.isAwaiting;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AwaitingConfirmationChanged(isAwaiting=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.isAwaiting);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged) && this.isAwaiting == ((com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged) other).isAwaiting;
        }

        public final com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged copy(boolean isAwaiting) {
            return new com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged(isAwaiting);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsAwaiting() {
            return this.isAwaiting;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged copy$default(com.paypal.oslo.feature.p2p.ui.review.events.PaymentTypeAccordionEvent.AwaitingConfirmationChanged awaitingConfirmationChanged, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = awaitingConfirmationChanged.isAwaiting;
            }
            return awaitingConfirmationChanged.copy(z);
        }
    }

    public /* synthetic */ PaymentTypeAccordionEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
