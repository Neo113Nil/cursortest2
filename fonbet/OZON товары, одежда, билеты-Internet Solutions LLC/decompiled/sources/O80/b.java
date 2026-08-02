package O80;

import Jb.e;
import Jb.f;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import m90.C8110a;
import n30.C8438b;
import si0.C9700a;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20061a;

    /* renamed from: b, reason: collision with root package name */
    private final f f20062b;

    public /* synthetic */ b(f fVar, int i11) {
        this.f20061a = i11;
        this.f20062b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f20061a) {
            case 0:
                return new a((T80.b) this.f20062b.get());
            case 1:
                C8110a ozonTrackerPluginInterctor = (C8110a) this.f20062b.get();
                Intrinsics.checkNotNullParameter(ozonTrackerPluginInterctor, "ozonTrackerPluginInterctor");
                return new C8438b(ozonTrackerPluginInterctor);
            default:
                C7967a serviceLocator = (C7967a) this.f20062b.get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.f();
        }
    }

    public b(C9700a c9700a, f fVar) {
        this.f20061a = 2;
        this.f20062b = fVar;
    }
}
