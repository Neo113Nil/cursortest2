package Cs;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.di.FactoryModule;
import ru.ozon.app.android.tabbar.di.TabsUiControllerComponentApi;

/* loaded from: classes6.dex */
public final /* synthetic */ class c implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        TabsUiControllerComponentApi provideTabsUiControllerComponentApi$lambda$1;
        provideTabsUiControllerComponentApi$lambda$1 = FactoryModule.Companion.provideTabsUiControllerComponentApi$lambda$1(c6740b);
        return provideTabsUiControllerComponentApi$lambda$1;
    }
}
