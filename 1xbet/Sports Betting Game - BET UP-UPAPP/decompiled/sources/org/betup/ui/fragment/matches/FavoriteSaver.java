package org.betup.ui.fragment.matches;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: BasePagingController.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH&J8\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\bH&¨\u0006\r"}, d2 = {"Lorg/betup/ui/fragment/matches/FavoriteSaver;", "", "saveFavorites", "", "ids", "", "", "onResult", "Lkotlin/Function1;", "", "saveFavoritesWithDeleteAndPut", "initialIds", "newIds", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FavoriteSaver {
    void saveFavorites(List<Integer> ids, Function1<? super Boolean, Unit> onResult);

    void saveFavoritesWithDeleteAndPut(List<Integer> initialIds, List<Integer> newIds, Function1<? super Boolean, Unit> onResult);
}
