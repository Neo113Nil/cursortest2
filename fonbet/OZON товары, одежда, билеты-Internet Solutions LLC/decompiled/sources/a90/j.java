package a90;

import We.B;
import a90.C4963a;
import b90.C5594a;
import c90.InterfaceC5773a;
import e90.C6321a;
import e90.C6322b;
import e90.C6323c;
import e90.C6324d;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* loaded from: classes3.dex */
public final class j implements Jb.e<Set<B>> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.f f36470a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<C5594a> f36471b;

    /* renamed from: c, reason: collision with root package name */
    private final C6322b f36472c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<InterfaceC5773a> f36473d;

    public j(Jb.f fVar, Pc.a aVar, C6322b c6322b, C6324d c6324d, Pc.a aVar2) {
        this.f36470a = fVar;
        this.f36471b = aVar;
        this.f36472c = c6322b;
        this.f36473d = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        ExternalNetworkSettings externalNetworkSettings = (ExternalNetworkSettings) this.f36470a.get();
        C5594a externalOkHttpSettings = (C5594a) ((C4963a.b) this.f36471b).get();
        C6321a appHeadersInterceptor = (C6321a) this.f36472c.get();
        C6323c newApiHeaderInterceptor = new C6323c();
        Ib.a testEnvironmentManagerLazy = Jb.d.a(this.f36473d);
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        Intrinsics.checkNotNullParameter(externalOkHttpSettings, "externalOkHttpSettings");
        Intrinsics.checkNotNullParameter(appHeadersInterceptor, "appHeadersInterceptor");
        Intrinsics.checkNotNullParameter(newApiHeaderInterceptor, "newApiHeaderInterceptor");
        Intrinsics.checkNotNullParameter(testEnvironmentManagerLazy, "testEnvironmentManagerLazy");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (externalOkHttpSettings.d()) {
            C8588a c8588a = new C8588a(0);
            c8588a.a(C8588a.EnumC1299a.BODY);
            linkedHashSet.add(c8588a);
            if (externalNetworkSettings.isQa()) {
                InterfaceC5773a interfaceC5773a = (InterfaceC5773a) testEnvironmentManagerLazy.get();
                linkedHashSet.add(interfaceC5773a.h());
                linkedHashSet.add(interfaceC5773a.j());
            }
            linkedHashSet.add(newApiHeaderInterceptor);
        }
        linkedHashSet.add(appHeadersInterceptor);
        Set<B> c11 = externalOkHttpSettings.c();
        if (c11 != null) {
            linkedHashSet.addAll(c11);
        }
        return linkedHashSet;
    }
}
