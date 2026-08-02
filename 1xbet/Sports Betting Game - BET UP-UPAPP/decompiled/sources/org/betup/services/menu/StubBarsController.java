package org.betup.services.menu;

import org.betup.ui.MenuBarsController;
import org.betup.ui.TabMenuItem;

/* loaded from: classes2.dex */
public class StubBarsController implements MenuBarsController {
    @Override // org.betup.ui.MenuBarsController
    public boolean isReady() {
        return true;
    }

    @Override // org.betup.ui.MenuBarsController
    public void restorePrevious() {
    }

    @Override // org.betup.ui.MenuBarsController
    public void setBottomMenu(Object sender, BottomMenuProvider bottomMenuProvider) {
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTabMenu(TabMenuItem tabMenuItem) {
    }

    @Override // org.betup.ui.MenuBarsController
    public void updateTitle(String title) {
    }

    @Override // org.betup.ui.MenuBarsController
    public TabMenuItem getCurrent() {
        return TabMenuItem.NONE;
    }
}
