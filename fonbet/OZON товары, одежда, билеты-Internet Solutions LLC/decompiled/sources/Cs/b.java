package Cs;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.di.FactoryModule;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        CoroutineDispatchersComponentApi provideCoroutineDispatchersComponentApi$lambda$0;
        provideCoroutineDispatchersComponentApi$lambda$0 = FactoryModule.Companion.provideCoroutineDispatchersComponentApi$lambda$0(c6740b);
        return provideCoroutineDispatchersComponentApi$lambda$0;
    }
}
