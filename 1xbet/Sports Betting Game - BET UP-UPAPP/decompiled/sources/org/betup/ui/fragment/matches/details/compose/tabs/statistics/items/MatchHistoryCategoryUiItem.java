package org.betup.ui.fragment.matches.details.compose.tabs.statistics.items;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.entity.matches.history.MatchHistoryType;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MatchHistoryCategoryUiItem.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryCategoryUiItem;", "", "type", "Lorg/betup/model/remote/entity/matches/history/MatchHistoryType;", "categoryTitle", "", "categoryTitleAdditional", "matches", "", "Lorg/betup/ui/fragment/matches/details/compose/tabs/statistics/items/MatchHistoryMatchUiItem;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/matches/history/MatchHistoryType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getType", "()Lorg/betup/model/remote/entity/matches/history/MatchHistoryType;", "getCategoryTitle", "()Ljava/lang/String;", "getCategoryTitleAdditional", "getMatches", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MatchHistoryCategoryUiItem {
    public static final int $stable = 8;
    private final String categoryTitle;
    private final String categoryTitleAdditional;
    private final List<MatchHistoryMatchUiItem> matches;
    private final MatchHistoryType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MatchHistoryCategoryUiItem copy$default(MatchHistoryCategoryUiItem matchHistoryCategoryUiItem, MatchHistoryType matchHistoryType, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            matchHistoryType = matchHistoryCategoryUiItem.type;
        }
        if ((i & 2) != 0) {
            str = matchHistoryCategoryUiItem.categoryTitle;
        }
        if ((i & 4) != 0) {
            str2 = matchHistoryCategoryUiItem.categoryTitleAdditional;
        }
        if ((i & 8) != 0) {
            list = matchHistoryCategoryUiItem.matches;
        }
        return matchHistoryCategoryUiItem.copy(matchHistoryType, str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final MatchHistoryType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCategoryTitleAdditional() {
        return this.categoryTitleAdditional;
    }

    public final List<MatchHistoryMatchUiItem> component4() {
        return this.matches;
    }

    public final MatchHistoryCategoryUiItem copy(MatchHistoryType type, String categoryTitle, String categoryTitleAdditional, List<MatchHistoryMatchUiItem> matches) {
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(matches, "matches");
        return new MatchHistoryCategoryUiItem(type, categoryTitle, categoryTitleAdditional, matches);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MatchHistoryCategoryUiItem)) {
            return false;
        }
        MatchHistoryCategoryUiItem matchHistoryCategoryUiItem = (MatchHistoryCategoryUiItem) other;
        return this.type == matchHistoryCategoryUiItem.type && Intrinsics.areEqual(this.categoryTitle, matchHistoryCategoryUiItem.categoryTitle) && Intrinsics.areEqual(this.categoryTitleAdditional, matchHistoryCategoryUiItem.categoryTitleAdditional) && Intrinsics.areEqual(this.matches, matchHistoryCategoryUiItem.matches);
    }

    public int hashCode() {
        MatchHistoryType matchHistoryType = this.type;
        int hashCode = (((matchHistoryType == null ? 0 : matchHistoryType.hashCode()) * 31) + this.categoryTitle.hashCode()) * 31;
        String str = this.categoryTitleAdditional;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.matches.hashCode();
    }

    public String toString() {
        return "MatchHistoryCategoryUiItem(type=" + this.type + ", categoryTitle=" + this.categoryTitle + ", categoryTitleAdditional=" + this.categoryTitleAdditional + ", matches=" + this.matches + ")";
    }

    public MatchHistoryCategoryUiItem(MatchHistoryType matchHistoryType, String categoryTitle, String str, List<MatchHistoryMatchUiItem> matches) {
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(matches, "matches");
        this.type = matchHistoryType;
        this.categoryTitle = categoryTitle;
        this.categoryTitleAdditional = str;
        this.matches = matches;
    }

    public /* synthetic */ MatchHistoryCategoryUiItem(MatchHistoryType matchHistoryType, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(matchHistoryType, str, (i & 4) != 0 ? null : str2, list);
    }

    public final MatchHistoryType getType() {
        return this.type;
    }

    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final String getCategoryTitleAdditional() {
        return this.categoryTitleAdditional;
    }

    public final List<MatchHistoryMatchUiItem> getMatches() {
        return this.matches;
    }
}
