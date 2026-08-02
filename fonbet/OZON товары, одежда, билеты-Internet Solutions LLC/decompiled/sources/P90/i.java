package P90;

import P90.a;
import Q90.o;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;
import ru.ozon.fintech.settings.network.AuthPinpadNetwork;

/* loaded from: classes3.dex */
public final class i implements Jb.e<Q90.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f22067a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<T90.a> f22068b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a<InterfaceC6618a> f22069c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<o> f22070d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<AuthPinpadNetwork> f22071e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<O30.b> f22072f;

    public i(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5) {
        this.f22067a = fVar;
        this.f22068b = aVar;
        this.f22069c = aVar2;
        this.f22070d = aVar3;
        this.f22071e = aVar4;
        this.f22072f = aVar5;
    }

    @Override // Pc.a
    public final Object get() {
        ExternalFintechSettings externalFintechSettings = (ExternalFintechSettings) this.f22067a.get();
        T90.a featureTogglesRepository = this.f22068b.get();
        InterfaceC6618a fintechAnalyticInteractor = (InterfaceC6618a) ((a.b) this.f22069c).get();
        o sessionIdProvider = this.f22070d.get();
        AuthPinpadNetwork authPinpadNetwork = this.f22071e.get();
        O30.b fintechLibType = (O30.b) ((a.i) this.f22072f).get();
        Intrinsics.checkNotNullParameter(externalFintechSettings, "externalFintechSettings");
        Intrinsics.checkNotNullParameter(featureTogglesRepository, "featureTogglesRepository");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        Intrinsics.checkNotNullParameter(sessionIdProvider, "sessionIdProvider");
        Intrinsics.checkNotNullParameter(authPinpadNetwork, "authPinpadNetwork");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        return new Q90.c(featureTogglesRepository, externalFintechSettings, sessionIdProvider, authPinpadNetwork, fintechAnalyticInteractor, fintechLibType);
    }
}
