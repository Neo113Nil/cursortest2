package com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\n\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "PinRequired", "CreatePinSuccessful", "AddressSelectionRequired", "AddressSelectionSuccessful", "RequestCard", "RequestSuccessful", "RequestFailed", "RetryRequest", "OkButtonClicked", "FlowCancelled", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$AddressSelectionRequired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$AddressSelectionSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$CreatePinSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$FlowCancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$OkButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$PinRequired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RetryRequest;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class RequestPhysicalCardEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private RequestPhysicalCardEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$PinRequired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PinRequired extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.PinRequired INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.PinRequired();

        public final int hashCode() {
            return 1701258955;
        }

        private PinRequired() {
            super("PinRequired", null);
        }

        public final java.lang.String toString() {
            return "PinRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.PinRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$CreatePinSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "", "requiresRefresh", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$CreatePinSuccessful;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getRequiresRefresh"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CreatePinSuccessful extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final boolean requiresRefresh;

        public CreatePinSuccessful(boolean z) {
            super("CreatePinSuccessful", null);
            this.requiresRefresh = z;
        }

        public /* synthetic */ CreatePinSuccessful(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z);
        }

        public final boolean getRequiresRefresh() {
            return this.requiresRefresh;
        }

        public final java.lang.String toString() {
            boolean z = this.requiresRefresh;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CreatePinSuccessful(requiresRefresh=");
            sb.append(z);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.requiresRefresh);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful) && this.requiresRefresh == ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful) other).requiresRefresh;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful copy(boolean requiresRefresh) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful(requiresRefresh);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getRequiresRefresh() {
            return this.requiresRefresh;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.CreatePinSuccessful createPinSuccessful, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = createPinSuccessful.requiresRefresh;
            }
            return createPinSuccessful.copy(z);
        }

        public CreatePinSuccessful() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$AddressSelectionRequired;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSelectionRequired extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionRequired INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionRequired();

        public final int hashCode() {
            return 1514925728;
        }

        private AddressSelectionRequired() {
            super("AddressSelectionRequired", null);
        }

        public final java.lang.String toString() {
            return "AddressSelectionRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$AddressSelectionSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "", "addressId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$AddressSelectionSuccessful;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AddressSelectionSuccessful extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final java.lang.String addressId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddressSelectionSuccessful(java.lang.String str) {
            super("AddressSelectionSuccessful", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.addressId = str;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.addressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressSelectionSuccessful(addressId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.addressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful) other).addressId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful copy(java.lang.String addressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful(addressId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.AddressSelectionSuccessful addressSelectionSuccessful, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = addressSelectionSuccessful.addressId;
            }
            return addressSelectionSuccessful.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestCard;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "", "cardId", "addressId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestCard;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestCard extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final java.lang.String addressId;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestCard(java.lang.String str, java.lang.String str2) {
            super("RequestCard", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cardId = str;
            this.addressId = str2;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.addressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestCard(cardId=");
            sb.append(str);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.addressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard requestCard = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, requestCard.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, requestCard.addressId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard copy(java.lang.String cardId, java.lang.String addressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard(cardId, addressId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestCard requestCard, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestCard.cardId;
            }
            if ((i & 2) != 0) {
                str2 = requestCard.addressId;
            }
            return requestCard.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestSuccessful;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "", "estimatedDeliveryDate", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestSuccessful;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEstimatedDeliveryDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestSuccessful extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final java.lang.String estimatedDeliveryDate;

        public RequestSuccessful(java.lang.String str) {
            super("RequestSuccessful", null);
            this.estimatedDeliveryDate = str;
        }

        public final java.lang.String getEstimatedDeliveryDate() {
            return this.estimatedDeliveryDate;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.estimatedDeliveryDate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestSuccessful(estimatedDeliveryDate=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.estimatedDeliveryDate;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful) && kotlin.jvm.internal.Intrinsics.areEqual(this.estimatedDeliveryDate, ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful) other).estimatedDeliveryDate);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful copy(java.lang.String estimatedDeliveryDate) {
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful(estimatedDeliveryDate);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEstimatedDeliveryDate() {
            return this.estimatedDeliveryDate;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestSuccessful requestSuccessful, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = requestSuccessful.estimatedDeliveryDate;
            }
            return requestSuccessful.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestFailed;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "errorType", "<init>", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)V", "component1", "()Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "copy", "(Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RequestFailed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/debitcard/shared/ui/model/DebitErrorType;", "getErrorType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestFailed extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestFailed(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType) {
            super("RequestFailed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitErrorType, "");
            this.errorType = debitErrorType;
        }

        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType = this.errorType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestFailed(errorType=");
            sb.append(debitErrorType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.errorType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed) && this.errorType == ((com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed) other).errorType;
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed copy(com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorType, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed(errorType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType getErrorType() {
            return this.errorType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RequestFailed requestFailed, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType debitErrorType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                debitErrorType = requestFailed.errorType;
            }
            return requestFailed.copy(debitErrorType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RetryRequest;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "", "cardId", "addressId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$RetryRequest;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCardId", "getAddressId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RetryRequest extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        private final java.lang.String addressId;
        private final java.lang.String cardId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RetryRequest(java.lang.String str, java.lang.String str2) {
            super("RetryRequest", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.cardId = str;
            this.addressId = str2;
        }

        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.cardId;
            java.lang.String str2 = this.addressId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RetryRequest(cardId=");
            sb.append(str);
            sb.append(", addressId=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.cardId.hashCode() * 31) + this.addressId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest)) {
                return false;
            }
            com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest retryRequest = (com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cardId, retryRequest.cardId) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressId, retryRequest.addressId);
        }

        public final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest copy(java.lang.String cardId, java.lang.String addressId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressId, "");
            return new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest(cardId, addressId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAddressId() {
            return this.addressId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCardId() {
            return this.cardId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest copy$default(com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.RetryRequest retryRequest, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = retryRequest.cardId;
            }
            if ((i & 2) != 0) {
                str2 = retryRequest.addressId;
            }
            return retryRequest.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$OkButtonClicked;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OkButtonClicked extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.OkButtonClicked INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.OkButtonClicked();

        public final int hashCode() {
            return 1868931856;
        }

        private OkButtonClicked() {
            super("OkButtonClicked", null);
        }

        public final java.lang.String toString() {
            return "OkButtonClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.OkButtonClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent$FlowCancelled;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/requestphysicalcard/mvi/RequestPhysicalCardEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FlowCancelled extends com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.FlowCancelled INSTANCE = new com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.FlowCancelled();

        public final int hashCode() {
            return -1521793926;
        }

        private FlowCancelled() {
            super("FlowCancelled", null);
        }

        public final java.lang.String toString() {
            return "FlowCancelled";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.ui.requestphysicalcard.mvi.RequestPhysicalCardEvent.FlowCancelled)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ RequestPhysicalCardEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
