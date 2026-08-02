package OA;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponent;
import ru.ozon.app.android.commonwidgets.actionHandlersFactory.di.CommonActionHandlersFactoryComponentFactoryModule;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.navigation.di.factory.NavigationComponentFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20125a;

    public /* synthetic */ a(int i11) {
        this.f20125a = i11;
    }

    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        NavigationComponentApi bindNavigationComponentFactory$lambda$0;
        CommonActionHandlersFactoryComponent bindCommonActionStoreComponentFactory$lambda$0;
        switch (this.f20125a) {
            case 0:
                bindNavigationComponentFactory$lambda$0 = NavigationComponentFactoryModule.bindNavigationComponentFactory$lambda$0(c6740b);
                return bindNavigationComponentFactory$lambda$0;
            default:
                bindCommonActionStoreComponentFactory$lambda$0 = CommonActionHandlersFactoryComponentFactoryModule.bindCommonActionStoreComponentFactory$lambda$0(c6740b);
                return bindCommonActionStoreComponentFactory$lambda$0;
        }
    }
}
