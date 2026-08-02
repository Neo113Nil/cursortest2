package org.betup.ui.fragment.matches.details;

import org.betup.ui.TabMenuItem;

/* loaded from: classes4.dex */
public interface MatchBottomNavigator {
    TabMenuItem getCurrent();

    boolean isEmpty();

    void navigate(TabMenuItem item);
}
