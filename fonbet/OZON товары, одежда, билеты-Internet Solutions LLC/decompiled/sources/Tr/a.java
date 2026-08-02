package Tr;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentApi;
import ru.ozon.app.android.composer.widgets.v2.onboarding.di.OnBoardingComponentFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {
    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        OnBoardingComponentApi provideFactory$lambda$0;
        provideFactory$lambda$0 = OnBoardingComponentFactoryModule.provideFactory$lambda$0(c6740b);
        return provideFactory$lambda$0;
    }
}
