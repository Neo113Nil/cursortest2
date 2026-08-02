package Pr;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentFactoryModule;
import ru.ozon.app.android.update.di.InAppUpdateComponentApi;
import ru.ozon.app.android.update.di.factory.InAppUpdateComponentFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22707a;

    public /* synthetic */ a(int i11) {
        this.f22707a = i11;
    }

    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        ComposerWidgetAsyncComponentApi provideFactory$lambda$0;
        InAppUpdateComponentApi provideInAppUpdateComponentFactory$lambda$0;
        switch (this.f22707a) {
            case 0:
                provideFactory$lambda$0 = ComposerWidgetAsyncComponentFactoryModule.provideFactory$lambda$0(c6740b);
                return provideFactory$lambda$0;
            default:
                provideInAppUpdateComponentFactory$lambda$0 = InAppUpdateComponentFactoryModule.provideInAppUpdateComponentFactory$lambda$0(c6740b);
                return provideInAppUpdateComponentFactory$lambda$0;
        }
    }
}
