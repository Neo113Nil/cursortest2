package E80;

import A30.m;
import We.E;
import android.app.Application;
import b40.InterfaceC5539a;
import b90.C5597d;
import g30.InterfaceC6618a;
import h90.f;
import i30.C7004a;
import i30.C7005b;
import l90.C7901a;
import m90.C8110a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.analytic.domain.config.AnalyticsConfig;
import ru.ozon.fintech.auth.domain.external.ExternalFintechAuth;
import ru.ozon.fintech.features.camera.scanners.api.CameraScannerFactory;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import v30.C10219a;
import x70.C10674a;
import x70.C10675b;

/* loaded from: classes3.dex */
public interface b {

    public interface a {
        @NotNull
        a a(@NotNull Application application);

        @NotNull
        a b(@NotNull InterfaceC5539a interfaceC5539a);

        @NotNull
        a c(@NotNull ExternalNetworkSettings externalNetworkSettings);

        @NotNull
        b create();

        @NotNull
        a d(@NotNull C7004a c7004a);

        @NotNull
        a e(@NotNull C10219a c10219a);

        @NotNull
        a f(@NotNull C8110a c8110a);

        @NotNull
        a g(@NotNull C10674a c10674a);

        @NotNull
        a h(@NotNull T80.b bVar);

        @NotNull
        a i(@NotNull Z30.a aVar);

        @NotNull
        a j(@NotNull ExternalFintechAuth externalFintechAuth);

        @NotNull
        a k(@NotNull C10675b c10675b);

        @NotNull
        a l(@NotNull C7901a c7901a);

        @NotNull
        a m(@NotNull M90.a aVar);

        @NotNull
        a n(@NotNull C5597d c5597d);

        @NotNull
        a o(@NotNull K80.a aVar);

        @NotNull
        a p(@NotNull N90.a aVar);

        @NotNull
        a q(@NotNull CameraScannerFactory cameraScannerFactory);

        @NotNull
        a r(@NotNull ExternalFintechSettings externalFintechSettings);

        @NotNull
        a s(@NotNull N30.b bVar);

        @NotNull
        a t(@NotNull C7005b c7005b);

        @NotNull
        a u(@NotNull AnalyticsConfig analyticsConfig);

        @NotNull
        a v(@NotNull O30.b bVar);

        @NotNull
        a w(@NotNull C80.a aVar);
    }

    @NotNull
    E a();

    @NotNull
    R30.a f();

    @NotNull
    h80.b g();

    @NotNull
    Y30.b h();

    @NotNull
    S80.b i();

    @NotNull
    ru.ozon.fintech.settings.domain.a j();

    @NotNull
    S30.a k();

    @NotNull
    f l();

    @NotNull
    InterfaceC6618a m();

    @NotNull
    m n();
}
