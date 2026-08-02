package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\f\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\f\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "Lcom/paypal/oslo/core/mvi/Event;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "TransactionTypeSelect", "DateFilterSelect", "FromDateClick", "ToDateClick", "FromDateConfirm", "ToDateConfirm", "DatePickerDismiss", "FormatSelect", "RequestStatementClick", "RequestStatementSuccess", "RequestStatementError", "BackToForm", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$BackToForm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$DateFilterSelect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$DatePickerDismiss;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FormatSelect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FromDateClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FromDateConfirm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$ToDateClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$ToDateConfirm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$TransactionTypeSelect;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CustomStatementEvent implements com.paypal.oslo.core.mvi.Event {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CustomStatementEvent(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.Event
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$TransactionTypeSelect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$TransactionTypeSelect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TransactionTypeSelect extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        private final int index;

        public TransactionTypeSelect(int i) {
            super("TransactionTypeSelect", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransactionTypeSelect(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect) && this.index == ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect) other).index;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect copy(int index) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.TransactionTypeSelect transactionTypeSelect, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = transactionTypeSelect.index;
            }
            return transactionTypeSelect.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$DateFilterSelect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$DateFilterSelect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DateFilterSelect extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        private final int index;

        public DateFilterSelect(int i) {
            super("DateFilterSelect", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DateFilterSelect(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect) && this.index == ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect) other).index;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect copy(int index) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DateFilterSelect dateFilterSelect, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = dateFilterSelect.index;
            }
            return dateFilterSelect.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FromDateClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromDateClick extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateClick INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateClick();

        public final int hashCode() {
            return -1767700619;
        }

        private FromDateClick() {
            super("FromDateClick", null);
        }

        public final java.lang.String toString() {
            return "FromDateClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$ToDateClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToDateClick extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateClick INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateClick();

        public final int hashCode() {
            return 439929092;
        }

        private ToDateClick() {
            super("ToDateClick", null);
        }

        public final java.lang.String toString() {
            return "ToDateClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FromDateConfirm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "Ljava/time/LocalDate;", "date", "<init>", "(Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "copy", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FromDateConfirm;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FromDateConfirm extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 8;
        private final java.time.LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FromDateConfirm(java.time.LocalDate localDate) {
            super("FromDateConfirm", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.date = localDate;
        }

        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.date;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FromDateConfirm(date=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm) other).date);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm copy(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm(date);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FromDateConfirm fromDateConfirm, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = fromDateConfirm.date;
            }
            return fromDateConfirm.copy(localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$ToDateConfirm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "Ljava/time/LocalDate;", "date", "<init>", "(Ljava/time/LocalDate;)V", "component1", "()Ljava/time/LocalDate;", "copy", "(Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$ToDateConfirm;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/time/LocalDate;", "getDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ToDateConfirm extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 8;
        private final java.time.LocalDate date;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToDateConfirm(java.time.LocalDate localDate) {
            super("ToDateConfirm", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
            this.date = localDate;
        }

        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public final java.lang.String toString() {
            java.time.LocalDate localDate = this.date;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ToDateConfirm(date=");
            sb.append(localDate);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.date.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm) && kotlin.jvm.internal.Intrinsics.areEqual(this.date, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm) other).date);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm copy(java.time.LocalDate date) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(date, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm(date);
        }

        /* renamed from: component1, reason: from getter */
        public final java.time.LocalDate getDate() {
            return this.date;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.ToDateConfirm toDateConfirm, java.time.LocalDate localDate, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                localDate = toDateConfirm.date;
            }
            return toDateConfirm.copy(localDate);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$DatePickerDismiss;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DatePickerDismiss extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DatePickerDismiss INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DatePickerDismiss();

        public final int hashCode() {
            return -725482477;
        }

        private DatePickerDismiss() {
            super("DatePickerDismiss", null);
        }

        public final java.lang.String toString() {
            return "DatePickerDismiss";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.DatePickerDismiss)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FormatSelect;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "", "index", "<init>", "(I)V", "component1", "()I", "copy", "(I)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$FormatSelect;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getIndex"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class FormatSelect extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        private final int index;

        public FormatSelect(int i) {
            super("FormatSelect", null);
            this.index = i;
        }

        public final int getIndex() {
            return this.index;
        }

        public final java.lang.String toString() {
            int i = this.index;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("FormatSelect(index=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Integer.hashCode(this.index);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect) && this.index == ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect) other).index;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect copy(int index) {
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect(index);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.FormatSelect formatSelect, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = formatSelect.index;
            }
            return formatSelect.copy(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementClick;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestStatementClick extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick();

        public final int hashCode() {
            return 609483341;
        }

        private RequestStatementClick() {
            super("RequestStatementClick", null);
        }

        public final java.lang.String toString() {
            return "RequestStatementClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestStatementSuccess extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementSuccess INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementSuccess();

        public final int hashCode() {
            return -1129752696;
        }

        private RequestStatementSuccess() {
            super("RequestStatementSuccess", null);
        }

        public final java.lang.String toString() {
            return "RequestStatementSuccess";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementSuccess)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$RequestStatementError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestStatementError extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError();

        public final int hashCode() {
            return 611518157;
        }

        private RequestStatementError() {
            super("RequestStatementError", null);
        }

        public final java.lang.String toString() {
            return "RequestStatementError";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.RequestStatementError)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent$BackToForm;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BackToForm extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.BackToForm INSTANCE = new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.BackToForm();

        public final int hashCode() {
            return -2114110911;
        }

        private BackToForm() {
            super("BackToForm", null);
        }

        public final java.lang.String toString() {
            return "BackToForm";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementEvent.BackToForm)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CustomStatementEvent(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
