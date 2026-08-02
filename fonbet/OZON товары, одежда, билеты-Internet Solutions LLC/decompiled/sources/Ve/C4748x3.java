package Ve;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xe.C10727i;

/* renamed from: Ve.x3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4748x3 extends M1.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4524p8 f32451a;

    /* renamed from: b, reason: collision with root package name */
    public final Vm f32452b;

    /* renamed from: c, reason: collision with root package name */
    public final Ib f32453c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f32454d;

    /* renamed from: e, reason: collision with root package name */
    public final C4248fl f32455e;

    /* renamed from: f, reason: collision with root package name */
    public final Vi f32456f;

    /* renamed from: g, reason: collision with root package name */
    public int f32457g;

    public C4748x3(InterfaceC4524p8 sPayRepository, Vm sPayDataContract, Ib sPayStorage, Y9 sPaySdkReducer, C4248fl featuresHandler, Vi fraudMonResultHandler) {
        Intrinsics.checkNotNullParameter(sPayRepository, "sPayRepository");
        Intrinsics.checkNotNullParameter(sPayDataContract, "sPayDataContract");
        Intrinsics.checkNotNullParameter(sPayStorage, "sPayStorage");
        Intrinsics.checkNotNullParameter(sPaySdkReducer, "sPaySdkReducer");
        Intrinsics.checkNotNullParameter(featuresHandler, "featuresHandler");
        Intrinsics.checkNotNullParameter(fraudMonResultHandler, "fraudMonResultHandler");
        this.f32451a = sPayRepository;
        this.f32452b = sPayDataContract;
        this.f32453c = sPayStorage;
        this.f32454d = sPaySdkReducer;
        this.f32455e = featuresHandler;
        this.f32456f = fraudMonResultHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4748x3)) {
            return false;
        }
        C4748x3 c4748x3 = (C4748x3) obj;
        return Intrinsics.d(this.f32451a, c4748x3.f32451a) && Intrinsics.d(this.f32452b, c4748x3.f32452b) && Intrinsics.d(this.f32453c, c4748x3.f32453c) && Intrinsics.d(this.f32454d, c4748x3.f32454d) && Intrinsics.d(this.f32455e, c4748x3.f32455e) && Intrinsics.d(this.f32456f, c4748x3.f32456f);
    }

    @Override // M1.b
    public final Object f(Object obj, xe.I i11, kotlin.coroutines.d dVar) {
        Object f7 = C10727i.f(i11.plus(xe.X0.b()), new C4773y0(this, (C4087a4) obj, i11, null), dVar);
        return f7 == Wc.a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    public final int hashCode() {
        return this.f32456f.hashCode() + ((this.f32455e.hashCode() + ((this.f32454d.hashCode() + ((this.f32453c.hashCode() + ((this.f32452b.hashCode() + (this.f32451a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GetPayOnlineUseCase(sPayRepository=" + this.f32451a + ", sPayDataContract=" + this.f32452b + ", sPayStorage=" + this.f32453c + ", sPaySdkReducer=" + this.f32454d + ", featuresHandler=" + this.f32455e + ", fraudMonResultHandler=" + this.f32456f + ")";
    }
}
