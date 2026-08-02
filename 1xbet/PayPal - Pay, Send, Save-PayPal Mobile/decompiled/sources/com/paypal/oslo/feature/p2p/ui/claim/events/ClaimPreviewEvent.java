package com.paypal.oslo.feature.p2p.ui.claim.events;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ScreenAppeared", "AcceptMoneyClicked", "CloseClicked", "DataLoaded", "DataLoadFailed", "ClaimSucceeded", "ClaimFailed", "ClaimDeclined", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$AcceptMoneyClicked;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimDeclined;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimFailed;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$CloseClicked;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$DataLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$DataLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ScreenAppeared;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ClaimPreviewEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private ClaimPreviewEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ScreenAppeared;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.PAYMENT_CODE_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ScreenAppeared;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPaymentCodeId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ScreenAppeared extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        private final java.lang.String paymentCodeId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScreenAppeared(java.lang.String str) {
            super("ScreenAppeared", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.paymentCodeId = str;
        }

        public final java.lang.String getPaymentCodeId() {
            return this.paymentCodeId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.paymentCodeId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ScreenAppeared(paymentCodeId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.paymentCodeId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentCodeId, ((com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared) other).paymentCodeId);
        }

        public final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared copy(java.lang.String paymentCodeId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentCodeId, "");
            return new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared(paymentCodeId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPaymentCodeId() {
            return this.paymentCodeId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared copy$default(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ScreenAppeared screenAppeared, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = screenAppeared.paymentCodeId;
            }
            return screenAppeared.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$AcceptMoneyClicked;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AcceptMoneyClicked extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked();

        public final int hashCode() {
            return 1547487977;
        }

        private AcceptMoneyClicked() {
            super("AcceptMoneyClicked", null);
        }

        public final java.lang.String toString() {
            return "AcceptMoneyClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.AcceptMoneyClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$CloseClicked;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.CloseClicked();

        public final int hashCode() {
            return -414620407;
        }

        private CloseClicked() {
            super("CloseClicked", null);
        }

        public final java.lang.String toString() {
            return "CloseClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$DataLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "transactionId", "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/p2p/ui/claim/composables/ClaimPreviewData;", "getData", "Ljava/lang/String;", "getTransactionId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData data;
        private final java.lang.String transactionId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData, java.lang.String str) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(claimPreviewData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = claimPreviewData;
            this.transactionId = str;
        }

        public final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData getData() {
            return this.data;
        }

        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData = this.data;
            java.lang.String str = this.transactionId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(data=");
            sb.append(claimPreviewData);
            sb.append(", transactionId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.data.hashCode() * 31) + this.transactionId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded dataLoaded = (com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, dataLoaded.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionId, dataLoaded.transactionId);
        }

        public final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded copy(com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData data, java.lang.String transactionId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionId, "");
            return new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded(data, transactionId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getTransactionId() {
            return this.transactionId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded copy$default(com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.p2p.ui.claim.composables.ClaimPreviewData claimPreviewData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                claimPreviewData = dataLoaded.data;
            }
            if ((i & 2) != 0) {
                str = dataLoaded.transactionId;
            }
            return dataLoaded.copy(claimPreviewData, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$DataLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoadFailed extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoadFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoadFailed();

        public final int hashCode() {
            return 2055728007;
        }

        private DataLoadFailed() {
            super("DataLoadFailed", null);
        }

        public final java.lang.String toString() {
            return "DataLoadFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.DataLoadFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimSucceeded;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClaimSucceeded extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimSucceeded INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimSucceeded();

        public final int hashCode() {
            return 1302423807;
        }

        private ClaimSucceeded() {
            super("ClaimSucceeded", null);
        }

        public final java.lang.String toString() {
            return "ClaimSucceeded";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimSucceeded)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimFailed;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClaimFailed extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimFailed INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimFailed();

        public final int hashCode() {
            return 75539039;
        }

        private ClaimFailed() {
            super("ClaimFailed", null);
        }

        public final java.lang.String toString() {
            return "ClaimFailed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimFailed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent$ClaimDeclined;", "Lcom/paypal/oslo/feature/p2p/ui/claim/events/ClaimPreviewEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClaimDeclined extends com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimDeclined INSTANCE = new com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimDeclined();

        public final int hashCode() {
            return -528676400;
        }

        private ClaimDeclined() {
            super("ClaimDeclined", null);
        }

        public final java.lang.String toString() {
            return "ClaimDeclined";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.claim.events.ClaimPreviewEvent.ClaimDeclined)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ClaimPreviewEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
