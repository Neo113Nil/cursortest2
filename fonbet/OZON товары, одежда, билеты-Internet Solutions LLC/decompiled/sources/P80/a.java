package P80;

import Jb.e;
import Jb.f;
import Jb.j;
import kotlin.jvm.internal.Intrinsics;
import v80.C10275b;
import vj0.C10326a;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22009a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f22010b;

    public /* synthetic */ a(Pc.a aVar, int i11) {
        this.f22009a = i11;
        this.f22010b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f22009a) {
            case 0:
                Q80.c fintechActivityResultHandlerInner = (Q80.c) this.f22010b.get();
                Intrinsics.checkNotNullParameter(fintechActivityResultHandlerInner, "fintechActivityResultHandlerInner");
                j.d(fintechActivityResultHandlerInner);
                return fintechActivityResultHandlerInner;
            case 1:
                C10326a serviceLocator = (C10326a) this.f22010b.get();
                Intrinsics.checkNotNullParameter(serviceLocator, "serviceLocator");
                return serviceLocator.c();
            default:
                return new C10275b((Z30.a) ((f) this.f22010b).get());
        }
    }
}
