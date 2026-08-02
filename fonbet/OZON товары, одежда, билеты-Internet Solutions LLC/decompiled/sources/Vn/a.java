package Vn;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.cart.ui.di.CartAtomBinderComponentApi;
import ru.ozon.app.android.cart.ui.di.module.CartAtomBinderFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        CartAtomBinderComponentApi provideAtomBinderFactory$lambda$0;
        provideAtomBinderFactory$lambda$0 = CartAtomBinderFactoryModule.provideAtomBinderFactory$lambda$0(c6740b);
        return provideAtomBinderFactory$lambda$0;
    }
}
