package org.betup.games;

import kotlin.Metadata;
import org.betup.bus.NavigateMessage;
import org.betup.games.GameListItem;

/* compiled from: GameListFragmentAdapter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lorg/betup/games/GameListTapListener;", "", "onNativeGameClicked", "", "target", "Lorg/betup/bus/NavigateMessage$TargetGame;", "onWebGameClicked", "item", "Lorg/betup/games/GameListItem$Web;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface GameListTapListener {
    void onNativeGameClicked(NavigateMessage.TargetGame target);

    void onWebGameClicked(GameListItem.Web item);
}
