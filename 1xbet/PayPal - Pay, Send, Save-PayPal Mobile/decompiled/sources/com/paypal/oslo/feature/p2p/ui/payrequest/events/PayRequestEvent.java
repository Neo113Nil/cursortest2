package com.paypal.oslo.feature.p2p.ui.payrequest.events;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "WithMessage", "Initialize", "DataLoaded", "DataLoadFailed", "CloseClicked", "PrimaryCtaClicked", "PaymentStarted", "PaymentStartFailed", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$CloseClicked;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStartFailed;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStarted;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PrimaryCtaClicked;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PayRequestEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$WithMessage;", "", "", "getMessage", "()Ljava/lang/String;", "message", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStartFailed;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface WithMessage {
        java.lang.String getMessage();
    }

    private PayRequestEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$Initialize;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Initialize extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize INSTANCE = new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize();

        public final int hashCode() {
            return 305831298;
        }

        private Initialize() {
            super("Initialize", null);
        }

        public final java.lang.String toString() {
            return "Initialize";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.Initialize)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoaded;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;)V", "component1", "()Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;", "copy", "(Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;)Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/models/PayRequestData;", "getData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payRequestData, "");
            this.data = payRequestData;
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData getData() {
            return this.data;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData = this.data;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(data=");
            sb.append(payRequestData);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.data.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded) && kotlin.jvm.internal.Intrinsics.areEqual(this.data, ((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded) other).data);
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded copy(com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData data) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            return new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded(data);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded copy$default(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoaded dataLoaded, com.paypal.oslo.feature.p2p.ui.payrequest.models.PayRequestData payRequestData, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                payRequestData = dataLoaded.data;
            }
            return dataLoaded.copy(payRequestData);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoadFailed;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$WithMessage;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$DataLoadFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoadFailed extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent implements com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.WithMessage {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoadFailed(java.lang.String str) {
            super("DataLoadFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.WithMessage
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoadFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed) other).message);
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed copy$default(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.DataLoadFailed dataLoadFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dataLoadFailed.message;
            }
            return dataLoadFailed.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$CloseClicked;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CloseClicked extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked();

        public final int hashCode() {
            return 1761624193;
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
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.CloseClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PrimaryCtaClicked;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryCtaClicked extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked INSTANCE = new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked();

        public final int hashCode() {
            return 403537255;
        }

        private PrimaryCtaClicked() {
            super("PrimaryCtaClicked", null);
        }

        public final java.lang.String toString() {
            return "PrimaryCtaClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PrimaryCtaClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStarted;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "", "amountValue", "intent", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStarted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAmountValue", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentStarted extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent {
        public static final int $stable = 0;
        private final java.lang.String amountValue;
        private final java.lang.String intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentStarted(java.lang.String str, java.lang.String str2) {
            super("PaymentStarted", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.amountValue = str;
            this.intent = str2;
        }

        public final java.lang.String getAmountValue() {
            return this.amountValue;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.amountValue;
            java.lang.String str2 = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentStarted(amountValue=");
            sb.append(str);
            sb.append(", intent=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.amountValue.hashCode() * 31) + this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted paymentStarted = (com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.amountValue, paymentStarted.amountValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, paymentStarted.intent);
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted copy(java.lang.String amountValue, java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountValue, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted(amountValue, intent);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAmountValue() {
            return this.amountValue;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted copy$default(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStarted paymentStarted, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentStarted.amountValue;
            }
            if ((i & 2) != 0) {
                str2 = paymentStarted.intent;
            }
            return paymentStarted.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStartFailed;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent;", "Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$WithMessage;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/ui/payrequest/events/PayRequestEvent$PaymentStartFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentStartFailed extends com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent implements com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.WithMessage {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PaymentStartFailed(java.lang.String str) {
            super("PaymentStartFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        @Override // com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.WithMessage
        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PaymentStartFailed(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed) other).message);
        }

        public final com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed copy$default(com.paypal.oslo.feature.p2p.ui.payrequest.events.PayRequestEvent.PaymentStartFailed paymentStartFailed, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = paymentStartFailed.message;
            }
            return paymentStartFailed.copy(str);
        }
    }

    public /* synthetic */ PayRequestEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
