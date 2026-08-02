package Ua0;

import Jb.d;
import Jb.e;
import Jb.f;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import ru.ozon.android.messenger.framework.domain.usecases.C9388e;
import si0.C9700a;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27480a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f27481b;

    public /* synthetic */ b(Pc.a aVar, int i11) {
        this.f27480a = i11;
        this.f27481b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f27480a) {
            case 0:
                return new a(d.a(this.f27481b));
            case 1:
                return new C9388e((ru.ozon.android.messenger.framework.domain.repository.b) this.f27481b.get());
            default:
                C7967a serviceLocator = (C7967a) ((f) this.f27481b).get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.a();
        }
    }

    public b(C9700a c9700a, f fVar) {
        this.f27480a = 2;
        this.f27481b = fVar;
    }
}
