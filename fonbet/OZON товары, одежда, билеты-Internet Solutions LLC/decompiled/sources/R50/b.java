package R50;

import b40.InterfaceC5539a;
import f40.InterfaceC6422b;
import f90.InterfaceC6469a;
import i40.InterfaceC7007a;
import kotlin.jvm.internal.Intrinsics;
import m40.InterfaceC8077a;
import n90.InterfaceC8456a;
import oa0.InterfaceC8681a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;
import s30.InterfaceC9590a;
import wa0.InterfaceC10467a;
import y30.InterfaceC10835a;

/* loaded from: classes3.dex */
public final class b implements Y30.a<Q50.a> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC5539a f24637a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final N30.b f24638b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Z30.a f24639c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f24640d;

    public b(@NotNull InterfaceC5539a esiaApi, @NotNull N30.b widgetConfig, @NotNull Z30.a digRoubleApi, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(esiaApi, "esiaApi");
        Intrinsics.checkNotNullParameter(widgetConfig, "widgetConfig");
        Intrinsics.checkNotNullParameter(digRoubleApi, "digRoubleApi");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f24637a = esiaApi;
        this.f24638b = widgetConfig;
        this.f24639c = digRoubleApi;
        this.f24640d = externalNetworkSettings;
    }

    @Override // Y30.a
    public final Q50.a create(Y30.b componentStorage) {
        Intrinsics.checkNotNullParameter(componentStorage, "componentStorage");
        Y20.a aVar = (Y20.a) componentStorage.a(Y20.a.class);
        P30.b bVar = (P30.b) componentStorage.a(P30.b.class);
        M80.a aVar2 = (M80.a) componentStorage.a(M80.a.class);
        Z80.a aVar3 = (Z80.a) componentStorage.a(Z80.a.class);
        O90.a aVar4 = (O90.a) componentStorage.a(O90.a.class);
        InterfaceC10835a interfaceC10835a = (InterfaceC10835a) componentStorage.a(InterfaceC10835a.class);
        InterfaceC6422b interfaceC6422b = (InterfaceC6422b) componentStorage.a(InterfaceC6422b.class);
        InterfaceC8077a interfaceC8077a = (InterfaceC8077a) componentStorage.a(InterfaceC8077a.class);
        InterfaceC8681a interfaceC8681a = (InterfaceC8681a) componentStorage.a(InterfaceC8681a.class);
        InterfaceC6469a interfaceC6469a = (InterfaceC6469a) componentStorage.a(InterfaceC6469a.class);
        N60.a aVar5 = (N60.a) componentStorage.a(N60.a.class);
        InterfaceC8456a interfaceC8456a = (InterfaceC8456a) componentStorage.a(InterfaceC8456a.class);
        I40.a aVar6 = (I40.a) componentStorage.a(I40.a.class);
        InterfaceC9590a interfaceC9590a = (InterfaceC9590a) componentStorage.a(InterfaceC9590a.class);
        H80.a aVar7 = (H80.a) componentStorage.a(H80.a.class);
        T70.a aVar8 = (T70.a) componentStorage.a(T70.a.class);
        InterfaceC7007a interfaceC7007a = (InterfaceC7007a) componentStorage.a(InterfaceC7007a.class);
        I70.a aVar9 = (I70.a) componentStorage.a(I70.a.class);
        U60.a aVar10 = (U60.a) componentStorage.a(U60.a.class);
        InterfaceC10467a interfaceC10467a = (InterfaceC10467a) componentStorage.a(InterfaceC10467a.class);
        Q60.a aVar11 = (Q60.a) componentStorage.a(Q60.a.class);
        InterfaceC5539a interfaceC5539a = this.f24637a;
        interfaceC5539a.getClass();
        N30.b bVar2 = this.f24638b;
        bVar2.getClass();
        Z30.a aVar12 = this.f24639c;
        aVar12.getClass();
        ExternalNetworkSettings externalNetworkSettings = this.f24640d;
        externalNetworkSettings.getClass();
        return new a(aVar, bVar, aVar2, aVar3, aVar4, interfaceC10835a, interfaceC6422b, interfaceC8077a, aVar8, aVar5, interfaceC7007a, interfaceC8681a, interfaceC6469a, interfaceC8456a, aVar6, interfaceC9590a, aVar7, interfaceC5539a, bVar2, aVar12, aVar9, aVar10, externalNetworkSettings, aVar11, interfaceC10467a);
    }
}
