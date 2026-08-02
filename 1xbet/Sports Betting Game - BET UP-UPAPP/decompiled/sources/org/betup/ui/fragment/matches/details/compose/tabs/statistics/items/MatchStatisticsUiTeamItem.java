package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.ui.fragment.matches.details.compose.tabs.statistics.items.MatchStatsItemValueUnit;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatisticsUiTeamItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiTeamItem;", "", "label", "", "percentage", "", "unit", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;FLorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;)V", "getLabel", "()Ljava/lang/String;", "getPercentage", "()F", "getUnit", "()Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsItemValueUnit;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchStatisticsUiTeamItem {
    public static final int $stable = 0;
    private final String label;
    private final float percentage;
    private final MatchStatsItemValueUnit unit;

    public static /* synthetic */ MatchStatisticsUiTeamItem copy$default(MatchStatisticsUiTeamItem matchStatisticsUiTeamItem, String str, float f, MatchStatsItemValueUnit matchStatsItemValueUnit, int i, Object obj) {
        if ((i & 1) != 0) {
            str = matchStatisticsUiTeamItem.label;
        }
        if ((i & 2) != 0) {
            f = matchStatisticsUiTeamItem.percentage;
        }
        if ((i & 4) != 0) {
            matchStatsItemValueUnit = matchStatisticsUiTeamItem.unit;
        }
        return matchStatisticsUiTeamItem.copy(str, f, matchStatsItemValueUnit);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final float getPercentage() {
        return this.percentage;
    }

    /* renamed from: component3, reason: from getter */
    public final MatchStatsItemValueUnit getUnit() {
        return this.unit;
    }

    public final MatchStatisticsUiTeamItem copy(String label, float percentage, MatchStatsItemValueUnit unit) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new MatchStatisticsUiTeamItem(label, percentage, unit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchStatisticsUiTeamItem)) {
            return false;
        }
        MatchStatisticsUiTeamItem matchStatisticsUiTeamItem = (MatchStatisticsUiTeamItem) other;
        return Intrinsics.areEqual(this.label, matchStatisticsUiTeamItem.label) && Float.compare(this.percentage, matchStatisticsUiTeamItem.percentage) == 0 && Intrinsics.areEqual(this.unit, matchStatisticsUiTeamItem.unit);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + Float.hashCode(this.percentage)) * 31) + this.unit.hashCode();
    }

    public String toString() {
        return "MatchStatisticsUiTeamItem(label=" + this.label + ", percentage=" + this.percentage + ", unit=" + this.unit + ")";
    }

    public MatchStatisticsUiTeamItem(String label, float f, MatchStatsItemValueUnit unit) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.label = label;
        this.percentage = f;
        this.unit = unit;
    }

    public final String getLabel() {
        return this.label;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public /* synthetic */ MatchStatisticsUiTeamItem(String str, float f, MatchStatsItemValueUnit.None none, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? MatchStatsItemValueUnit.None.INSTANCE : none);
    }

    public final MatchStatsItemValueUnit getUnit() {
        return this.unit;
    }
}
