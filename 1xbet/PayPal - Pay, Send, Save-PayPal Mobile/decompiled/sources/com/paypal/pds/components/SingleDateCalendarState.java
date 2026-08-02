package com.paypal.pds.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR(\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8G@GX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/pds/components/SingleDateCalendarState;", "", "Landroidx/compose/material3/DatePickerState;", "state", "<init>", "(Landroidx/compose/material3/DatePickerState;)V", "Landroidx/compose/material3/DatePickerState;", "getState$pds_release", "()Landroidx/compose/material3/DatePickerState;", "Ljava/time/LocalDate;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getSelectedDate", "()Ljava/time/LocalDate;", "setSelectedDate", "(Ljava/time/LocalDate;)V", "selectedDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SingleDateCalendarState {
    public static final int $stable = 0;
    private final androidx.compose.material3.DatePickerState state;

    public SingleDateCalendarState(androidx.compose.material3.DatePickerState datePickerState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datePickerState, "");
        this.state = datePickerState;
    }

    /* renamed from: getState$pds_release, reason: from getter */
    public final androidx.compose.material3.DatePickerState getState() {
        return this.state;
    }

    public final java.time.LocalDate getSelectedDate() {
        return androidx.compose.material3.DatePicker_jvmKt.getSelectedDate(this.state);
    }

    public final void setSelectedDate(java.time.LocalDate localDate) {
        androidx.compose.material3.DatePicker_jvmKt.setSelectedDate(this.state, localDate);
    }
}
