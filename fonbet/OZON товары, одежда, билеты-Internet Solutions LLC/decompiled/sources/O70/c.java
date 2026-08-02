package O70;

import Jb.e;
import Jb.f;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import lj0.C7967a;
import si0.C9700a;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20054a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f20055b;

    public c(Pc.a aVar) {
        this.f20055b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f20054a) {
            case 0:
                return new b((Context) this.f20055b.get());
            default:
                C7967a serviceLocator = (C7967a) ((f) this.f20055b).get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.e();
        }
    }

    public c(C9700a c9700a, f fVar) {
        this.f20055b = fVar;
    }
}
