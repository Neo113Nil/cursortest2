package R70;

import Gi0.g;
import Jb.e;
import d40.InterfaceC6083a;
import g30.InterfaceC6618a;
import kotlin.jvm.internal.Intrinsics;
import tj0.InterfaceC9881a;
import tj0.InterfaceC9882b;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24783a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f24784b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f24785c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a f24786d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a f24787e;

    public c(Pc.a aVar, Pc.a aVar2, Pa0.e eVar, Pc.a aVar3) {
        this.f24784b = aVar;
        this.f24785c = aVar2;
        this.f24787e = eVar;
        this.f24786d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f24783a) {
            case 0:
                return new b((O70.a) this.f24784b.get(), (InterfaceC6083a) this.f24785c.get(), (C10656a) ((Pa0.e) this.f24787e).get(), (InterfaceC6618a) this.f24786d.get());
            default:
                g menuBuilder = (g) this.f24784b.get();
                InterfaceC9882b trackTraces = (InterfaceC9882b) this.f24785c.get();
                InterfaceC9882b pclPageTraces = (InterfaceC9882b) this.f24786d.get();
                InterfaceC9881a dispatchTraces = (InterfaceC9881a) this.f24787e.get();
                Intrinsics.checkNotNullParameter(menuBuilder, "menuBuilder");
                Intrinsics.checkNotNullParameter(trackTraces, "trackTraces");
                Intrinsics.checkNotNullParameter(pclPageTraces, "pclPageTraces");
                Intrinsics.checkNotNullParameter(dispatchTraces, "dispatchTraces");
                return new Wi0.b(menuBuilder, trackTraces, pclPageTraces, dispatchTraces);
        }
    }

    public c(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f24784b = aVar;
        this.f24785c = aVar2;
        this.f24786d = aVar3;
        this.f24787e = aVar4;
    }
}
