package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchStatsTabs.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs;", "", "nameRes", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "getNameRes", "()I", "MatchStatisticsUiItem", "MatchHistoryUiItem", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs$MatchHistoryUiItem;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs$MatchStatisticsUiItem;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MatchStatsTabs {
    public static final int $stable = 0;
    private final int nameRes;

    public /* synthetic */ MatchStatsTabs(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    private MatchStatsTabs(int i) {
        this.nameRes = i;
    }

    public final int getNameRes() {
        return this.nameRes;
    }

    /* compiled from: MatchStatsTabs.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs$MatchStatisticsUiItem;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs;", "items", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatisticsUiSingleItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchStatisticsUiItem extends MatchStatsTabs {
        public static final int $stable = 8;
        private final List<MatchStatisticsUiSingleItem> items;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchStatisticsUiItem copy$default(MatchStatisticsUiItem matchStatisticsUiItem, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = matchStatisticsUiItem.items;
            }
            return matchStatisticsUiItem.copy(list);
        }

        public final List<MatchStatisticsUiSingleItem> component1() {
            return this.items;
        }

        public final MatchStatisticsUiItem copy(List<MatchStatisticsUiSingleItem> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            return new MatchStatisticsUiItem(items);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MatchStatisticsUiItem) && Intrinsics.areEqual(this.items, ((MatchStatisticsUiItem) other).items);
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "MatchStatisticsUiItem(items=" + this.items + ")";
        }

        public final List<MatchStatisticsUiSingleItem> getItems() {
            return this.items;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchStatisticsUiItem(List<MatchStatisticsUiSingleItem> items) {
            super(R.string.match_stats, null);
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }
    }

    /* compiled from: MatchStatsTabs.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs$MatchHistoryUiItem;", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchStatsTabs;", "categories", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;)V", "getCategories", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MatchHistoryUiItem extends MatchStatsTabs {
        public static final int $stable = 8;
        private final List<MatchHistoryCategoryUiItem> categories;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MatchHistoryUiItem copy$default(MatchHistoryUiItem matchHistoryUiItem, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = matchHistoryUiItem.categories;
            }
            return matchHistoryUiItem.copy(list);
        }

        public final List<MatchHistoryCategoryUiItem> component1() {
            return this.categories;
        }

        public final MatchHistoryUiItem copy(List<MatchHistoryCategoryUiItem> categories) {
            Intrinsics.checkNotNullParameter(categories, "categories");
            return new MatchHistoryUiItem(categories);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MatchHistoryUiItem) && Intrinsics.areEqual(this.categories, ((MatchHistoryUiItem) other).categories);
        }

        public int hashCode() {
            return this.categories.hashCode();
        }

        public String toString() {
            return "MatchHistoryUiItem(categories=" + this.categories + ")";
        }

        public final List<MatchHistoryCategoryUiItem> getCategories() {
            return this.categories;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MatchHistoryUiItem(List<MatchHistoryCategoryUiItem> categories) {
            super(R.string.history, null);
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.categories = categories;
        }
    }
}
