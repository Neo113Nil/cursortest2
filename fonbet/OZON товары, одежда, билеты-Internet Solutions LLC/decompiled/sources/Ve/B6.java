package Ve;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B6 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28669a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Pc.a f28670b;

    /* renamed from: c, reason: collision with root package name */
    public final Pc.a f28671c;

    /* renamed from: d, reason: collision with root package name */
    public final Pc.a f28672d;

    /* renamed from: e, reason: collision with root package name */
    public final Pc.a f28673e;

    public B6(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, C4809z8 c4809z8) {
        this.f28673e = fVar;
        this.f28670b = aVar;
        this.f28671c = aVar2;
        this.f28672d = aVar3;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f28669a) {
            case 0:
                return new C4089a6((C4248fl) this.f28670b.get(), (InterfaceC4686uq) this.f28671c.get(), (Y9) this.f28672d.get(), (Vm) this.f28673e.get());
            case 1:
                Context context = (Context) ((Jb.f) this.f28673e).get();
                C4248fl featuresHandler = (C4248fl) this.f28670b.get();
                Vm sPayDataContract = (Vm) this.f28671c.get();
                InterfaceC4436m7 userIdManager = (InterfaceC4436m7) this.f28672d.get();
                C4515p clientProvider = new C4515p();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
                Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
                Intrinsics.checkNotNullParameter(userIdManager, "userIdManager");
                Intrinsics.checkNotNullParameter(clientProvider, "clientProvider");
                return new Te(context, featuresHandler, sPayDataContract, userIdManager, clientProvider);
            default:
                return new C4741wo((Te) ((B6) this.f28673e).get(), (Vm) this.f28670b.get(), (Y9) this.f28671c.get(), (Vl) this.f28672d.get());
        }
    }

    public B6(Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4) {
        this.f28670b = aVar;
        this.f28671c = aVar2;
        this.f28672d = aVar3;
        this.f28673e = aVar4;
    }

    public B6(B6 b62, Pc.a aVar, Pc.a aVar2, Pc.a aVar3) {
        this.f28673e = b62;
        this.f28670b = aVar;
        this.f28671c = aVar2;
        this.f28672d = aVar3;
    }
}
