package org.betup.ui.fragment.matches.filter;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.betup.ui.fragment.matches.filter.NewMatchFilter;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchFilterState.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003J\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÂ\u0003J#\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00050\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/matches/filter/MatchFilterState;", "", "selectedFilterP", "Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;", "defaultList", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/ui/fragment/matches/filter/NewMatchFilter;Ljava/util/List;)V", "_filterList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "filterList", "Lkotlinx/coroutines/flow/StateFlow;", "getFilterList", "()Lkotlinx/coroutines/flow/StateFlow;", "_selectedFilter", "selectedFilter", "getSelectedFilter", "selectFilter", "", "newSelectedFilter", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchFilterState {
    public static final int $stable = 8;
    private final MutableStateFlow<List<NewMatchFilter>> _filterList;
    private final MutableStateFlow<NewMatchFilter> _selectedFilter;
    private final List<NewMatchFilter> defaultList;
    private final StateFlow<List<NewMatchFilter>> filterList;
    private final StateFlow<NewMatchFilter> selectedFilter;
    private final NewMatchFilter selectedFilterP;

    /* JADX WARN: Multi-variable type inference failed */
    public MatchFilterState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final NewMatchFilter getSelectedFilterP() {
        return this.selectedFilterP;
    }

    private final List<NewMatchFilter> component2() {
        return this.defaultList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchFilterState copy$default(MatchFilterState matchFilterState, NewMatchFilter newMatchFilter, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            newMatchFilter = matchFilterState.selectedFilterP;
        }
        if ((i & 2) != 0) {
            list = matchFilterState.defaultList;
        }
        return matchFilterState.copy(newMatchFilter, list);
    }

    public final MatchFilterState copy(NewMatchFilter selectedFilterP, List<? extends NewMatchFilter> defaultList) {
        Intrinsics.checkNotNullParameter(selectedFilterP, "selectedFilterP");
        Intrinsics.checkNotNullParameter(defaultList, "defaultList");
        return new MatchFilterState(selectedFilterP, defaultList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchFilterState)) {
            return false;
        }
        MatchFilterState matchFilterState = (MatchFilterState) other;
        return Intrinsics.areEqual(this.selectedFilterP, matchFilterState.selectedFilterP) && Intrinsics.areEqual(this.defaultList, matchFilterState.defaultList);
    }

    public int hashCode() {
        return (this.selectedFilterP.hashCode() * 31) + this.defaultList.hashCode();
    }

    public String toString() {
        return "MatchFilterState(selectedFilterP=" + this.selectedFilterP + ", defaultList=" + this.defaultList + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MatchFilterState(NewMatchFilter selectedFilterP, List<? extends NewMatchFilter> defaultList) {
        Intrinsics.checkNotNullParameter(selectedFilterP, "selectedFilterP");
        Intrinsics.checkNotNullParameter(defaultList, "defaultList");
        this.selectedFilterP = selectedFilterP;
        this.defaultList = defaultList;
        MutableStateFlow<List<NewMatchFilter>> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this._filterList = MutableStateFlow;
        this.filterList = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<NewMatchFilter> MutableStateFlow2 = StateFlowKt.MutableStateFlow(selectedFilterP);
        this._selectedFilter = MutableStateFlow2;
        this.selectedFilter = FlowKt.asStateFlow(MutableStateFlow2);
        selectFilter(selectedFilterP);
    }

    public /* synthetic */ MatchFilterState(NewMatchFilter.All all, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NewMatchFilter.All.INSTANCE : all, (i & 2) != 0 ? CollectionsKt.listOf((Object[]) new NewMatchFilter[]{NewMatchFilter.All.INSTANCE, NewMatchFilter.Today.INSTANCE, NewMatchFilter.Live.INSTANCE, NewMatchFilter.OneHour.INSTANCE, NewMatchFilter.ThreeHours.INSTANCE, NewMatchFilter.SixHours.INSTANCE, NewMatchFilter.TwelveHours.INSTANCE}) : list);
    }

    public final StateFlow<List<NewMatchFilter>> getFilterList() {
        return this.filterList;
    }

    public final StateFlow<NewMatchFilter> getSelectedFilter() {
        return this.selectedFilter;
    }

    public final void selectFilter(NewMatchFilter newSelectedFilter) {
        Intrinsics.checkNotNullParameter(newSelectedFilter, "newSelectedFilter");
        this._selectedFilter.setValue(newSelectedFilter);
        List<NewMatchFilter> list = this.defaultList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!Intrinsics.areEqual((NewMatchFilter) obj, newSelectedFilter)) {
                arrayList.add(obj);
            }
        }
        this._filterList.setValue(arrayList);
    }
}
