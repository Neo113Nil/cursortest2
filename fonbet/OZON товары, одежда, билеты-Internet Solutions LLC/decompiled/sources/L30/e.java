package L30;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import ru.ozon.android.messenger.framework.domain.usecases.C9396m;
import si0.C9700a;

/* loaded from: classes3.dex */
public final class e implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16492a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f16493b;

    public /* synthetic */ e(Pc.a aVar, int i11) {
        this.f16492a = i11;
        this.f16493b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f16492a) {
            case 0:
                return new d((Application) this.f16493b.get());
            case 1:
                return new C9396m((ru.ozon.android.messenger.framework.domain.repository.b) this.f16493b.get());
            default:
                C7967a serviceLocator = (C7967a) ((Jb.f) this.f16493b).get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.d();
        }
    }

    public e(C9700a c9700a, Jb.f fVar) {
        this.f16492a = 2;
        this.f16493b = fVar;
    }
}
