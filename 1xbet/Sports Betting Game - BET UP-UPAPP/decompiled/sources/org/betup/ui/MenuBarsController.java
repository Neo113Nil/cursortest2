package org.betup.ui;

import org.betup.services.menu.BottomMenuProvider;

/* loaded from: classes2.dex */
public interface MenuBarsController {
    TabMenuItem getCurrent();

    boolean isReady();

    void restorePrevious();

    void setBottomMenu(Object sender, BottomMenuProvider bottomMenuProvider);

    void updateTabMenu(TabMenuItem tabMenuItem);

    void updateTitle(String title);
}
