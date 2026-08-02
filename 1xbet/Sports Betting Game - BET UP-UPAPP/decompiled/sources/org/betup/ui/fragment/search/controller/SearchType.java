package org.betup.ui.fragment.search.controller;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.betup.model.remote.api.rest.user.V7UserBetStatisticsInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lorg/betup/ui/fragment/search/controller/SearchType;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V", V7UserBetStatisticsInteractor.STATS_TYPE_ALL, "LEAGUES", "TEAMS", "MATCHES", "USERS", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SearchType[] $VALUES;
    public static final SearchType ALL = new SearchType(V7UserBetStatisticsInteractor.STATS_TYPE_ALL, 0);
    public static final SearchType LEAGUES = new SearchType("LEAGUES", 1);
    public static final SearchType TEAMS = new SearchType("TEAMS", 2);
    public static final SearchType MATCHES = new SearchType("MATCHES", 3);
    public static final SearchType USERS = new SearchType("USERS", 4);

    private static final /* synthetic */ SearchType[] $values() {
        return new SearchType[]{ALL, LEAGUES, TEAMS, MATCHES, USERS};
    }

    public static EnumEntries<SearchType> getEntries() {
        return $ENTRIES;
    }

    private SearchType(String str, int i) {
    }

    static {
        SearchType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SearchType valueOf(String str) {
        return (SearchType) Enum.valueOf(SearchType.class, str);
    }

    public static SearchType[] values() {
        return (SearchType[]) $VALUES.clone();
    }
}
