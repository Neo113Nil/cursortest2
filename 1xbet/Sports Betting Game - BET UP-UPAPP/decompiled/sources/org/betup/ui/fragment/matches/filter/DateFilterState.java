package org.betup.ui.fragment.matches.filter;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DateFilterState.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\u0013\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/DateFilterState;", "", "selectedDateP", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "_selectedDate", "Lkotlinx/coroutines/flow/MutableStateFlow;", "selectedDate", "Lkotlinx/coroutines/flow/StateFlow;", "getSelectedDate", "()Lkotlinx/coroutines/flow/StateFlow;", "selectDate", "", "newDate", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DateFilterState {
    public static final int $stable = 8;
    private final MutableStateFlow<String> _selectedDate;
    private final StateFlow<String> selectedDate;
    private final String selectedDateP;

    /* JADX WARN: Multi-variable type inference failed */
    public DateFilterState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final String getSelectedDateP() {
        return this.selectedDateP;
    }

    public static /* synthetic */ DateFilterState copy$default(DateFilterState dateFilterState, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dateFilterState.selectedDateP;
        }
        return dateFilterState.copy(str);
    }

    public final DateFilterState copy(String selectedDateP) {
        Intrinsics.checkNotNullParameter(selectedDateP, "selectedDateP");
        return new DateFilterState(selectedDateP);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DateFilterState) && Intrinsics.areEqual(this.selectedDateP, ((DateFilterState) other).selectedDateP);
    }

    public int hashCode() {
        return this.selectedDateP.hashCode();
    }

    public String toString() {
        return "DateFilterState(selectedDateP=" + this.selectedDateP + ")";
    }

    public DateFilterState(String selectedDateP) {
        Intrinsics.checkNotNullParameter(selectedDateP, "selectedDateP");
        this.selectedDateP = selectedDateP;
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(selectedDateP);
        this._selectedDate = MutableStateFlow;
        this.selectedDate = FlowKt.asStateFlow(MutableStateFlow);
        selectDate(selectedDateP);
    }

    public /* synthetic */ DateFilterState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? LocalDate.now().toString() : str);
    }

    public final StateFlow<String> getSelectedDate() {
        return this.selectedDate;
    }

    public final void selectDate(String newDate) {
        Intrinsics.checkNotNullParameter(newDate, "newDate");
        this._selectedDate.setValue(newDate);
    }
}
