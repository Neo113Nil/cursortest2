package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "NavigateBack", "PaymentAuthorizationPressed", "ConfirmAndPayPressed", "LoadData", "ChangePaymentMethodPressed", "DataLoaded", "ShowErrorScreen", "AmountSelected", "OnPaymentSucceeded", "OnPaymentError", "FundingInstrumentSelected", "ChangeFiDismissed", "OnAddFiSuccess", "OnNewFiConsumed", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$AmountSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ChangeFiDismissed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ChangePaymentMethodPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ConfirmAndPayPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$FundingInstrumentSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentSucceeded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$PaymentAuthorizationPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ShowErrorScreen;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class MakeAPaymentEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private MakeAPaymentEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$NavigateBack;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack();

        public final int hashCode() {
            return 347174138;
        }

        private NavigateBack() {
            super("NavigateBack", null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$PaymentAuthorizationPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PaymentAuthorizationPressed extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.PaymentAuthorizationPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.PaymentAuthorizationPressed();

        public final int hashCode() {
            return -1656552115;
        }

        private PaymentAuthorizationPressed() {
            super("PaymentAuthorizationPressed", null);
        }

        public final java.lang.String toString() {
            return "PaymentAuthorizationPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.PaymentAuthorizationPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ConfirmAndPayPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmAndPayPressed extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed();

        public final int hashCode() {
            return 1738535347;
        }

        private ConfirmAndPayPressed() {
            super("ConfirmAndPayPressed", null);
        }

        public final java.lang.String toString() {
            return "ConfirmAndPayPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ConfirmAndPayPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$LoadData;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class LoadData extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData();

        public final int hashCode() {
            return 1755622834;
        }

        private LoadData() {
            super("LoadData", null);
        }

        public final java.lang.String toString() {
            return "LoadData";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.LoadData)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ChangePaymentMethodPressed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangePaymentMethodPressed extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed();

        public final int hashCode() {
            return 1182963437;
        }

        private ChangePaymentMethodPressed() {
            super("ChangePaymentMethodPressed", null);
        }

        public final java.lang.String toString() {
            return "ChangePaymentMethodPressed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangePaymentMethodPressed)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$DataLoaded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "correlationId", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "uiModel", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$DataLoaded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentUiModel;", "getUiModel"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DataLoaded extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 8;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DataLoaded(java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel) {
            super("DataLoaded", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(makeAPaymentUiModel, "");
            this.correlationId = str;
            this.uiModel = makeAPaymentUiModel;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel = this.uiModel;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DataLoaded(correlationId=");
            sb.append(str);
            sb.append(", uiModel=");
            sb.append(makeAPaymentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.correlationId.hashCode() * 31) + this.uiModel.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded dataLoaded = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, dataLoaded.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.uiModel, dataLoaded.uiModel);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded copy(java.lang.String correlationId, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel uiModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uiModel, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded(correlationId, uiModel);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel getUiModel() {
            return this.uiModel;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.DataLoaded dataLoaded, java.lang.String str, com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentUiModel makeAPaymentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = dataLoaded.correlationId;
            }
            if ((i & 2) != 0) {
                makeAPaymentUiModel = dataLoaded.uiModel;
            }
            return dataLoaded.copy(str, makeAPaymentUiModel);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ShowErrorScreen;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "correlationId", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ShowErrorScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCorrelationId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowErrorScreen extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        private final java.lang.String correlationId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowErrorScreen(java.lang.String str) {
            super("ShowErrorScreen", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.correlationId = str;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.correlationId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowErrorScreen(correlationId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.correlationId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen) other).correlationId);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen copy(java.lang.String correlationId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen(correlationId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ShowErrorScreen showErrorScreen, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showErrorScreen.correlationId;
            }
            return showErrorScreen.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$AmountSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "index", "", "amount", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$AmountSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", com.visa.cbp.getEncExpo.warmup, "getIndex", "Ljava/lang/String;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AmountSelected extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        private final java.lang.String amount;
        private final int index;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AmountSelected(int i, java.lang.String str) {
            super("AmountSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.index = i;
            this.amount = str;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.String str = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AmountSelected(index=");
            sb.append(i);
            sb.append(", amount=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (java.lang.Integer.hashCode(this.index) * 31) + this.amount.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected amountSelected = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected) other;
            return this.index == amountSelected.index && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, amountSelected.amount);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected copy(int index, java.lang.String amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected(index, amount);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getAmount() {
            return this.amount;
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.AmountSelected amountSelected, int i, java.lang.String str, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = amountSelected.index;
            }
            if ((i2 & 2) != 0) {
                str = amountSelected.amount;
            }
            return amountSelected.copy(i, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentSucceeded;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "correlationId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "amount", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "component2", "()Ljava/lang/String;", "component3", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentSucceeded;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/uimodels/PaymentSuccessUiModel;", "getData", "Ljava/lang/String;", "getCorrelationId", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/Money;", "getAmount"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentSucceeded extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = com.paypal.oslo.core.commonui.utils.RefText.$stable;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount;
        private final java.lang.String correlationId;
        private final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel data;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnPaymentSucceeded(com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money) {
            super("OnPaymentSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentSuccessUiModel, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.data = paymentSuccessUiModel;
            this.correlationId = str;
            this.amount = money;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel getData() {
            return this.data;
        }

        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
            return this.amount;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel = this.data;
            java.lang.String str = this.correlationId;
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentSucceeded(data=");
            sb.append(paymentSuccessUiModel);
            sb.append(", correlationId=");
            sb.append(str);
            sb.append(", amount=");
            sb.append(money);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.data.hashCode();
            int hashCode2 = this.correlationId.hashCode();
            com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money = this.amount;
            return (((hashCode * 31) + hashCode2) * 31) + (money == null ? 0 : money.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded)) {
                return false;
            }
            com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded onPaymentSucceeded = (com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.data, onPaymentSucceeded.data) && kotlin.jvm.internal.Intrinsics.areEqual(this.correlationId, onPaymentSucceeded.correlationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, onPaymentSucceeded.amount);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded copy(com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel data, java.lang.String correlationId, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money amount) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(correlationId, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded(data, correlationId, amount);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.common.Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCorrelationId() {
            return this.correlationId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel getData() {
            return this.data;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentSucceeded onPaymentSucceeded, com.paypal.oslo.feature.bnplservicing.ui.makepayment.uimodels.PaymentSuccessUiModel paymentSuccessUiModel, java.lang.String str, com.paypal.oslo.feature.bnplservicing.domain.model.common.Money money, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                paymentSuccessUiModel = onPaymentSucceeded.data;
            }
            if ((i & 2) != 0) {
                str = onPaymentSucceeded.correlationId;
            }
            if ((i & 4) != 0) {
                money = onPaymentSucceeded.amount;
            }
            return onPaymentSucceeded.copy(paymentSuccessUiModel, str, money);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentError;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "error", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnPaymentError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/UseCaseResult$Error;", "getError"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPaymentError extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error;

        public OnPaymentError(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error) {
            super("OnPaymentError", null);
            this.error = error;
        }

        public /* synthetic */ OnPaymentError(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : error);
        }

        public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error getError() {
            return this.error;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error = this.error;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPaymentError(error=");
            sb.append(error);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error = this.error;
            if (error == null) {
                return 0;
            }
            return error.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError) && kotlin.jvm.internal.Intrinsics.areEqual(this.error, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError) other).error);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError copy(com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error) {
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError(error);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error getError() {
            return this.error;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnPaymentError onPaymentError, com.paypal.oslo.feature.bnplservicing.domain.model.UseCaseResult.Error error, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                error = onPaymentError.error;
            }
            return onPaymentError.copy(error);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OnPaymentError() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$FundingInstrumentSelected;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "fundingInstrument", "<init>", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;)V", "component1", "()Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "copy", "(Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$FundingInstrumentSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/bnplservicing/ui/changefi/FundingInstrumentUiModel;", "getFundingInstrument"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FundingInstrumentSelected extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable;
        private final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrument;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FundingInstrumentSelected(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel) {
            super("FundingInstrumentSelected", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentUiModel, "");
            this.fundingInstrument = fundingInstrumentUiModel;
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel = this.fundingInstrument;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentSelected(fundingInstrument=");
            sb.append(fundingInstrumentUiModel);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.fundingInstrument.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingInstrument, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected) other).fundingInstrument);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected copy(com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrument) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrument, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected(fundingInstrument);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel getFundingInstrument() {
            return this.fundingInstrument;
        }

        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.FundingInstrumentSelected fundingInstrumentSelected, com.paypal.oslo.feature.bnplservicing.ui.changefi.FundingInstrumentUiModel fundingInstrumentUiModel, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                fundingInstrumentUiModel = fundingInstrumentSelected.fundingInstrument;
            }
            return fundingInstrumentSelected.copy(fundingInstrumentUiModel);
        }

        static {
            int i = com.paypal.oslo.core.commonui.utils.RefText.$stable;
            $stable = i | i;
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ChangeFiDismissed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "updatedFundingInstruments", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$ChangeFiDismissed;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getUpdatedFundingInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeFiDismissed extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> updatedFundingInstruments;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ChangeFiDismissed(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list) {
            super("ChangeFiDismissed", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.updatedFundingInstruments = list;
        }

        public /* synthetic */ ChangeFiDismissed(java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> getUpdatedFundingInstruments() {
            return this.updatedFundingInstruments;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> list = this.updatedFundingInstruments;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ChangeFiDismissed(updatedFundingInstruments=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.updatedFundingInstruments.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed) && kotlin.jvm.internal.Intrinsics.areEqual(this.updatedFundingInstruments, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed) other).updatedFundingInstruments);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed copy(java.util.List<? extends com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> updatedFundingInstruments) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updatedFundingInstruments, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed(updatedFundingInstruments);
        }

        public final java.util.List<com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrument> component1() {
            return this.updatedFundingInstruments;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.ChangeFiDismissed changeFiDismissed, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = changeFiDismissed.updatedFundingInstruments;
            }
            return changeFiDismissed.copy(list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ChangeFiDismissed() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnAddFiSuccess;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "", "", "newFiIds", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnAddFiSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getNewFiIds"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnAddFiSuccess extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 8;
        private final java.util.List<java.lang.String> newFiIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnAddFiSuccess(java.util.List<java.lang.String> list) {
            super("OnAddFiSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.newFiIds = list;
        }

        public final java.util.List<java.lang.String> getNewFiIds() {
            return this.newFiIds;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.String> list = this.newFiIds;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnAddFiSuccess(newFiIds=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.newFiIds.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.newFiIds, ((com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess) other).newFiIds);
        }

        public final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess copy(java.util.List<java.lang.String> newFiIds) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newFiIds, "");
            return new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess(newFiIds);
        }

        public final java.util.List<java.lang.String> component1() {
            return this.newFiIds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess copy$default(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnAddFiSuccess onAddFiSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = onAddFiSuccess.newFiIds;
            }
            return onAddFiSuccess.copy(list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent$OnNewFiConsumed;", "Lcom/paypal/oslo/feature/bnplservicing/ui/makepayment/MakeAPaymentEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnNewFiConsumed extends com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnNewFiConsumed INSTANCE = new com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnNewFiConsumed();

        public final int hashCode() {
            return 1224562090;
        }

        private OnNewFiConsumed() {
            super("OnNewFiConsumed", null);
        }

        public final java.lang.String toString() {
            return "OnNewFiConsumed";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentEvent.OnNewFiConsumed)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ MakeAPaymentEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
