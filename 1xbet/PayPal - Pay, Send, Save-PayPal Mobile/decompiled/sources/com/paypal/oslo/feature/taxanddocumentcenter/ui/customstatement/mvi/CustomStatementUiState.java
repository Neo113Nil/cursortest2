package com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "Lcom/paypal/oslo/core/mvi/UiState;", "", "p0", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Content", "Loading", "RequestStatementSuccess", "RequestStatementError", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Loading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class CustomStatementUiState implements com.paypal.oslo.core.mvi.UiState {
    public static final int $stable = 0;
    private final java.lang.String name;

    private CustomStatementUiState(java.lang.String str) {
        this.name = str;
    }

    @Override // com.paypal.oslo.core.mvi.UiState
    public java.lang.String getName() {
        return this.name;
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0080\u0001\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b*\u0010\u0012R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b+\u0010\u0012R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b,\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b2\u0010\u0019R\u001a\u0010\f\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "", "", "transactionTypeLabels", "dateFilterLabels", "formatLabels", "selectedTransactionTypeIndex", "selectedDateFilterIndex", "Ljava/time/LocalDate;", "fromDate", "toDate", "selectedFormatIndex", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;", "activeDatePicker", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/time/LocalDate;Ljava/time/LocalDate;ILcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;)V", "component1", "()Ljava/util/List;", "component2", "component3", "component4", "()I", "component5", "component6", "()Ljava/time/LocalDate;", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/time/LocalDate;Ljava/time/LocalDate;ILcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getTransactionTypeLabels", "getDateFilterLabels", "getFormatLabels", com.visa.cbp.getEncExpo.warmup, "getSelectedTransactionTypeIndex", "getSelectedDateFilterIndex", "Ljava/time/LocalDate;", "getFromDate", "getToDate", "getSelectedFormatIndex", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/utils/ActiveDatePicker;", "getActiveDatePicker"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Content extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker;
        private final java.util.List<java.lang.Integer> dateFilterLabels;
        private final java.util.List<java.lang.Integer> formatLabels;
        private final java.time.LocalDate fromDate;
        private final int selectedDateFilterIndex;
        private final int selectedFormatIndex;
        private final int selectedTransactionTypeIndex;
        private final java.time.LocalDate toDate;
        private final java.util.List<java.lang.Integer> transactionTypeLabels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(java.util.List<java.lang.Integer> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3, int i, int i2, java.time.LocalDate localDate, java.time.LocalDate localDate2, int i3, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker) {
            super("Content", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeDatePicker, "");
            this.transactionTypeLabels = list;
            this.dateFilterLabels = list2;
            this.formatLabels = list3;
            this.selectedTransactionTypeIndex = i;
            this.selectedDateFilterIndex = i2;
            this.fromDate = localDate;
            this.toDate = localDate2;
            this.selectedFormatIndex = i3;
            this.activeDatePicker = activeDatePicker;
        }

        public /* synthetic */ Content(java.util.List list, java.util.List list2, java.util.List list3, int i, int i2, java.time.LocalDate localDate, java.time.LocalDate localDate2, int i3, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i4 & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i4 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? null : localDate, (i4 & 64) == 0 ? localDate2 : null, (i4 & 128) == 0 ? i3 : 0, (i4 & 256) != 0 ? com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker.NONE : activeDatePicker);
        }

        public final java.util.List<java.lang.Integer> getTransactionTypeLabels() {
            return this.transactionTypeLabels;
        }

        public final java.util.List<java.lang.Integer> getDateFilterLabels() {
            return this.dateFilterLabels;
        }

        public final java.util.List<java.lang.Integer> getFormatLabels() {
            return this.formatLabels;
        }

        public final int getSelectedTransactionTypeIndex() {
            return this.selectedTransactionTypeIndex;
        }

        public final int getSelectedDateFilterIndex() {
            return this.selectedDateFilterIndex;
        }

        public final java.time.LocalDate getFromDate() {
            return this.fromDate;
        }

        public final java.time.LocalDate getToDate() {
            return this.toDate;
        }

        public final int getSelectedFormatIndex() {
            return this.selectedFormatIndex;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker getActiveDatePicker() {
            return this.activeDatePicker;
        }

        public final java.lang.String toString() {
            java.util.List<java.lang.Integer> list = this.transactionTypeLabels;
            java.util.List<java.lang.Integer> list2 = this.dateFilterLabels;
            java.util.List<java.lang.Integer> list3 = this.formatLabels;
            int i = this.selectedTransactionTypeIndex;
            int i2 = this.selectedDateFilterIndex;
            java.time.LocalDate localDate = this.fromDate;
            java.time.LocalDate localDate2 = this.toDate;
            int i3 = this.selectedFormatIndex;
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker = this.activeDatePicker;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Content(transactionTypeLabels=");
            sb.append(list);
            sb.append(", dateFilterLabels=");
            sb.append(list2);
            sb.append(", formatLabels=");
            sb.append(list3);
            sb.append(", selectedTransactionTypeIndex=");
            sb.append(i);
            sb.append(", selectedDateFilterIndex=");
            sb.append(i2);
            sb.append(", fromDate=");
            sb.append(localDate);
            sb.append(", toDate=");
            sb.append(localDate2);
            sb.append(", selectedFormatIndex=");
            sb.append(i3);
            sb.append(", activeDatePicker=");
            sb.append(activeDatePicker);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.transactionTypeLabels.hashCode();
            int hashCode2 = this.dateFilterLabels.hashCode();
            int hashCode3 = this.formatLabels.hashCode();
            int hashCode4 = java.lang.Integer.hashCode(this.selectedTransactionTypeIndex);
            int hashCode5 = java.lang.Integer.hashCode(this.selectedDateFilterIndex);
            java.time.LocalDate localDate = this.fromDate;
            int hashCode6 = localDate == null ? 0 : localDate.hashCode();
            java.time.LocalDate localDate2 = this.toDate;
            return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (localDate2 != null ? localDate2.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.selectedFormatIndex)) * 31) + this.activeDatePicker.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content)) {
                return false;
            }
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content = (com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.transactionTypeLabels, content.transactionTypeLabels) && kotlin.jvm.internal.Intrinsics.areEqual(this.dateFilterLabels, content.dateFilterLabels) && kotlin.jvm.internal.Intrinsics.areEqual(this.formatLabels, content.formatLabels) && this.selectedTransactionTypeIndex == content.selectedTransactionTypeIndex && this.selectedDateFilterIndex == content.selectedDateFilterIndex && kotlin.jvm.internal.Intrinsics.areEqual(this.fromDate, content.fromDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.toDate, content.toDate) && this.selectedFormatIndex == content.selectedFormatIndex && this.activeDatePicker == content.activeDatePicker;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content copy(java.util.List<java.lang.Integer> transactionTypeLabels, java.util.List<java.lang.Integer> dateFilterLabels, java.util.List<java.lang.Integer> formatLabels, int selectedTransactionTypeIndex, int selectedDateFilterIndex, java.time.LocalDate fromDate, java.time.LocalDate toDate, int selectedFormatIndex, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker activeDatePicker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionTypeLabels, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateFilterLabels, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatLabels, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeDatePicker, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content(transactionTypeLabels, dateFilterLabels, formatLabels, selectedTransactionTypeIndex, selectedDateFilterIndex, fromDate, toDate, selectedFormatIndex, activeDatePicker);
        }

        /* renamed from: component9, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.utils.ActiveDatePicker getActiveDatePicker() {
            return this.activeDatePicker;
        }

        /* renamed from: component8, reason: from getter */
        public final int getSelectedFormatIndex() {
            return this.selectedFormatIndex;
        }

        /* renamed from: component7, reason: from getter */
        public final java.time.LocalDate getToDate() {
            return this.toDate;
        }

        /* renamed from: component6, reason: from getter */
        public final java.time.LocalDate getFromDate() {
            return this.fromDate;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSelectedDateFilterIndex() {
            return this.selectedDateFilterIndex;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSelectedTransactionTypeIndex() {
            return this.selectedTransactionTypeIndex;
        }

        public final java.util.List<java.lang.Integer> component3() {
            return this.formatLabels;
        }

        public final java.util.List<java.lang.Integer> component2() {
            return this.dateFilterLabels;
        }

        public final java.util.List<java.lang.Integer> component1() {
            return this.transactionTypeLabels;
        }

        public Content() {
            this(null, null, null, 0, 0, null, null, 0, null, 511, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Loading;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "formData", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "getFormData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content) {
            super("Loading", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            this.formData = content;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content = this.formData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(formData=");
            sb.append(content);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.formData, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading) other).formData);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading(formData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Loading loading, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                content = loading.formData;
            }
            return loading.copy(content);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementSuccess;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "formData", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "getFormData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestStatementSuccess extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestStatementSuccess(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content) {
            super("RequestStatementSuccess", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            this.formData = content;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content = this.formData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestStatementSuccess(formData=");
            sb.append(content);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.formData, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess) other).formData);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess(formData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementSuccess requestStatementSuccess, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                content = requestStatementSuccess.formData;
            }
            return requestStatementSuccess.copy(content);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementError;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "formData", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$RequestStatementError;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/customstatement/mvi/CustomStatementUiState$Content;", "getFormData"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class RequestStatementError extends com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState {
        public static final int $stable = 8;
        private final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RequestStatementError(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content) {
            super("RequestStatementError", null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
            this.formData = content;
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content = this.formData;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestStatementError(formData=");
            sb.append(content);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.formData.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError) && kotlin.jvm.internal.Intrinsics.areEqual(this.formData, ((com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError) other).formData);
        }

        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content formData) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formData, "");
            return new com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError(formData);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content getFormData() {
            return this.formData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.RequestStatementError requestStatementError, com.paypal.oslo.feature.taxanddocumentcenter.ui.customstatement.mvi.CustomStatementUiState.Content content, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                content = requestStatementError.formData;
            }
            return requestStatementError.copy(content);
        }
    }

    public /* synthetic */ CustomStatementUiState(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
