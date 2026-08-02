package My;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.geoprovider.di.GeoProviderComponentApi;
import ru.ozon.app.android.geoprovider.di.factory.GeoProviderComponentFactoryModule;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentApi;
import ru.ozon.app.android.storefront.widgets.appOnboarding.di.AppOnboardingComponentFactoryModule;

/* renamed from: My.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3642a implements InterfaceC7081a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18175a;

    public /* synthetic */ C3642a(int i11) {
        this.f18175a = i11;
    }

    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        GeoProviderComponentApi provideFactory$lambda$0;
        AppOnboardingComponentApi provideFactory$lambda$02;
        switch (this.f18175a) {
            case 0:
                provideFactory$lambda$0 = GeoProviderComponentFactoryModule.provideFactory$lambda$0(c6740b);
                return provideFactory$lambda$0;
            default:
                provideFactory$lambda$02 = AppOnboardingComponentFactoryModule.provideFactory$lambda$0(c6740b);
                return provideFactory$lambda$02;
        }
    }
}
