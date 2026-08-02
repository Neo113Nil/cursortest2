package PA;

import gi.C6740b;
import hi.InterfaceC6958a;
import ii.InterfaceC7081a;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentApi;
import ru.ozon.app.android.metrics.client.di.MetricsClientComponentFactoryModule;
import ru.ozon.app.android.network.di.NetworkComponent;
import ru.ozon.app.android.network.di.factory.NetworkComponentFactoryModule;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements InterfaceC7081a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22086a;

    public /* synthetic */ a(int i11) {
        this.f22086a = i11;
    }

    @Override // ii.InterfaceC7081a
    public final InterfaceC6958a create(C6740b c6740b) {
        NetworkComponent provideNetworkComponentFactory$lambda$0;
        MetricsClientComponentApi provideFactory$lambda$0;
        switch (this.f22086a) {
            case 0:
                provideNetworkComponentFactory$lambda$0 = NetworkComponentFactoryModule.provideNetworkComponentFactory$lambda$0(c6740b);
                return provideNetworkComponentFactory$lambda$0;
            default:
                provideFactory$lambda$0 = MetricsClientComponentFactoryModule.provideFactory$lambda$0(c6740b);
                return provideFactory$lambda$0;
        }
    }
}
