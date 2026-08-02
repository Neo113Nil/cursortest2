package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00068G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00068G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/paypal/pds/components/RangeCalendarState;", "", "Landroidx/compose/material3/DateRangePickerState;", "state", "<init>", "(Landroidx/compose/material3/DateRangePickerState;)V", "Ljava/time/LocalDate;", "startDate", "endDate", "", "setSelection", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "Landroidx/compose/material3/DateRangePickerState;", "getState$pds_release", "()Landroidx/compose/material3/DateRangePickerState;", "getStartDate", "()Ljava/time/LocalDate;", "getEndDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RangeCalendarState {
    public static final int $stable = 0;
    private final androidx.compose.material3.DateRangePickerState state;

    public RangeCalendarState(androidx.compose.material3.DateRangePickerState dateRangePickerState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dateRangePickerState, "");
        this.state = dateRangePickerState;
    }

    /* renamed from: getState$pds_release, reason: from getter */
    public final androidx.compose.material3.DateRangePickerState getState() {
        return this.state;
    }

    public final java.time.LocalDate getStartDate() {
        return androidx.compose.material3.DatePicker_jvmKt.getSelectedStartDate(this.state);
    }

    public final java.time.LocalDate getEndDate() {
        return androidx.compose.material3.DatePicker_jvmKt.getSelectedEndDate(this.state);
    }

    public final void setSelection(java.time.LocalDate startDate, java.time.LocalDate endDate) {
        androidx.compose.material3.DatePicker_jvmKt.setSelection(this.state, startDate, endDate);
    }
}
