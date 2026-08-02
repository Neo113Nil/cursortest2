package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Fb implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28985a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f28986b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f28987c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f28988d;

    /* renamed from: e, reason: collision with root package name */
    public final Jb.e f28989e;

    public Fb(B6 b62, Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f28989e = b62;
        this.f28986b = aVar;
        this.f28987c = aVar2;
        this.f28988d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f28985a) {
            case 0:
                return new C4152cb((Te) ((B6) this.f28989e).get(), (Vm) this.f28986b.get(), (Y9) this.f28988d.get(), (Ib) this.f28987c.get());
            default:
                InterfaceC4524p8 sPayRepository = (InterfaceC4524p8) ((C4609s7) this.f28989e).get();
                Y9 sPaySdkReducer = (Y9) this.f28986b.get();
                InterfaceC4686uq authHandler = (InterfaceC4686uq) this.f28987c.get();
                Y4 setCookieHandler = (Y4) this.f28988d.get();
                Vi fraudMonResultHandler = new Vi();
                Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
                Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
                Intrinsics.checkNotNullParameter(authHandler, "authHandler");
                Intrinsics.checkNotNullParameter(setCookieHandler, "setCookieHandler");
                Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
                return new C4646tf(sPayRepository, sPaySdkReducer, authHandler, setCookieHandler, fraudMonResultHandler);
        }
    }

    public Fb(C4609s7 c4609s7, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, C4542pq c4542pq) {
        this.f28989e = c4609s7;
        this.f28986b = aVar;
        this.f28987c = aVar2;
        this.f28988d = aVar3;
    }
}
