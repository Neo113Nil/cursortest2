package NF;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.push.di.PushComponentApi;
import ru.ozon.app.android.push.di.factory.PushComponentFactoryModule;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        PushComponentApi providePushComponentFactory$lambda$0;
        providePushComponentFactory$lambda$0 = PushComponentFactoryModule.providePushComponentFactory$lambda$0(c6740b);
        return providePushComponentFactory$lambda$0;
    }
}
