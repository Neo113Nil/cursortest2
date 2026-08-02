package com.paypal.oslo.feature.savings.domain.model.transfers;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "selectedFrequency", "Ljava/time/DayOfWeek;", "selectedDayOfWeek", "Ljava/time/LocalDate;", "selectedDate", "<init>", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/time/DayOfWeek;Ljava/time/LocalDate;)V", "component1", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component2", "()Ljava/time/DayOfWeek;", "component3", "()Ljava/time/LocalDate;", "copy", "(Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/time/DayOfWeek;Ljava/time/LocalDate;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencySelectionState;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getSelectedFrequency", "Ljava/time/DayOfWeek;", "getSelectedDayOfWeek", "Ljava/time/LocalDate;", "getSelectedDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FrequencySelectionState {
    public static final int $stable = 8;
    private final java.time.LocalDate selectedDate;
    private final java.time.DayOfWeek selectedDayOfWeek;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType selectedFrequency;

    public FrequencySelectionState(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.time.DayOfWeek dayOfWeek, java.time.LocalDate localDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localDate, "");
        this.selectedFrequency = frequencyType;
        this.selectedDayOfWeek = dayOfWeek;
        this.selectedDate = localDate;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public final java.time.DayOfWeek getSelectedDayOfWeek() {
        return this.selectedDayOfWeek;
    }

    public final java.time.LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.selectedFrequency;
        java.time.DayOfWeek dayOfWeek = this.selectedDayOfWeek;
        java.time.LocalDate localDate = this.selectedDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FrequencySelectionState(selectedFrequency=");
        sb.append(frequencyType);
        sb.append(", selectedDayOfWeek=");
        sb.append(dayOfWeek);
        sb.append(", selectedDate=");
        sb.append(localDate);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.selectedFrequency.hashCode() * 31) + this.selectedDayOfWeek.hashCode()) * 31) + this.selectedDate.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState = (com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState) other;
        return this.selectedFrequency == frequencySelectionState.selectedFrequency && this.selectedDayOfWeek == frequencySelectionState.selectedDayOfWeek && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedDate, frequencySelectionState.selectedDate);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState copy(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType selectedFrequency, java.time.DayOfWeek selectedDayOfWeek, java.time.LocalDate selectedDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedFrequency, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDayOfWeek, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selectedDate, "");
        return new com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState(selectedFrequency, selectedDayOfWeek, selectedDate);
    }

    /* renamed from: component3, reason: from getter */
    public final java.time.LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* renamed from: component2, reason: from getter */
    public final java.time.DayOfWeek getSelectedDayOfWeek() {
        return this.selectedDayOfWeek;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getSelectedFrequency() {
        return this.selectedFrequency;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState copy$default(com.paypal.oslo.feature.savings.domain.model.transfers.FrequencySelectionState frequencySelectionState, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.time.DayOfWeek dayOfWeek, java.time.LocalDate localDate, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            frequencyType = frequencySelectionState.selectedFrequency;
        }
        if ((i & 2) != 0) {
            dayOfWeek = frequencySelectionState.selectedDayOfWeek;
        }
        if ((i & 4) != 0) {
            localDate = frequencySelectionState.selectedDate;
        }
        return frequencySelectionState.copy(frequencyType, dayOfWeek, localDate);
    }
}
