package com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\b\n\u000b\f\r\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "ContinuePressed", "BackPressed", "ClosePressed", "SenderAmountChanged", "ReceiverAmountChanged", "PrimaryRowClicked", "SecondaryRowClicked", "ResetAmount", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ContinuePressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$PrimaryRowClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ReceiverAmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ResetAmount;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$SecondaryRowClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$SenderAmountChanged;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class PpwEnterAmountEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private PpwEnterAmountEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ContinuePressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ContinuePressed extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ContinuePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ContinuePressed();

        public final int hashCode() {
            return -196374284;
        }

        private ContinuePressed() {
            super("PpwEnterAmountEvent.ContinuePressed", null);
        }

        public final java.lang.String toString() {
            return "ContinuePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ContinuePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$BackPressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackPressed extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.BackPressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.BackPressed();

        public final int hashCode() {
            return -2059037388;
        }

        private BackPressed() {
            super("PpwEnterAmountEvent.BackPressed", null);
        }

        public final java.lang.String toString() {
            return "BackPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.BackPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ClosePressed;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClosePressed extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ClosePressed INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ClosePressed();

        public final int hashCode() {
            return 987096625;
        }

        private ClosePressed() {
            super("PpwEnterAmountEvent.ClosePressed", null);
        }

        public final java.lang.String toString() {
            return "ClosePressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ClosePressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$SenderAmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "", "newAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$SenderAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SenderAmountChanged extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String newAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SenderAmountChanged(java.lang.String str) {
            super("PpwEnterAmountEvent.SenderAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newAmount = str;
        }

        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SenderAmountChanged(newAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.newAmount, ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged) other).newAmount);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged copy(java.lang.String newAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged(newAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SenderAmountChanged senderAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = senderAmountChanged.newAmount;
            }
            return senderAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ReceiverAmountChanged;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "", "newAmount", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ReceiverAmountChanged;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNewAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ReceiverAmountChanged extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        private final java.lang.String newAmount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiverAmountChanged(java.lang.String str) {
            super("PpwEnterAmountEvent.ReceiverAmountChanged", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.newAmount = str;
        }

        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.newAmount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ReceiverAmountChanged(newAmount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newAmount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged) && kotlin.jvm.internal.Intrinsics.areEqual(this.newAmount, ((com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged) other).newAmount);
        }

        public final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged copy(java.lang.String newAmount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newAmount, "");
            return new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged(newAmount);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNewAmount() {
            return this.newAmount;
        }

        public static /* synthetic */ com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged copy$default(com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ReceiverAmountChanged receiverAmountChanged, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = receiverAmountChanged.newAmount;
            }
            return receiverAmountChanged.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$PrimaryRowClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PrimaryRowClicked extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.PrimaryRowClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.PrimaryRowClicked();

        public final int hashCode() {
            return -1542386232;
        }

        private PrimaryRowClicked() {
            super("PpwEnterAmountEvent.PrimaryRowClicked", null);
        }

        public final java.lang.String toString() {
            return "PrimaryRowClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.PrimaryRowClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$SecondaryRowClicked;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SecondaryRowClicked extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SecondaryRowClicked INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SecondaryRowClicked();

        public final int hashCode() {
            return -1434001286;
        }

        private SecondaryRowClicked() {
            super("PpwEnterAmountEvent.SecondaryRowClicked", null);
        }

        public final java.lang.String toString() {
            return "SecondaryRowClicked";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.SecondaryRowClicked)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent$ResetAmount;", "Lcom/paypal/oslo/feature/qrc/ui/showtopay/ppwenteramount/PpwEnterAmountEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ResetAmount extends com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ResetAmount INSTANCE = new com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ResetAmount();

        public final int hashCode() {
            return -1763165568;
        }

        private ResetAmount() {
            super("PpwEnterAmountEvent.ResetAmount", null);
        }

        public final java.lang.String toString() {
            return "ResetAmount";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.qrc.ui.showtopay.ppwenteramount.PpwEnterAmountEvent.ResetAmount)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ PpwEnterAmountEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
