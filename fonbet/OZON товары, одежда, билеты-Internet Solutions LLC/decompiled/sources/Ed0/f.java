package Ed0;

import We.E;
import h20.C6787b;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes7.dex */
public final class f implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7851a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Object f7852b;

    public f(s10.d dVar) {
        this.f7852b = dVar;
    }

    @Override // Pc.a
    public final Object get() {
        Object obj = this.f7852b;
        switch (this.f7851a) {
            case 0:
                zd0.b config = (zd0.b) ((Jb.f) obj).get();
                Intrinsics.checkNotNullParameter(config, "config");
                E.a aVar = new E.a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                aVar.d(30L, timeUnit);
                aVar.b0(30L, timeUnit);
                aVar.X(30L, timeUnit);
                aVar.h(config.g().b());
                aVar.S().addAll(config.g().c());
                aVar.a(new Hd0.a());
                C8588a c8588a = new C8588a(0);
                Jd0.a aVar2 = Jd0.a.f14618a;
                if (Jd0.a.c()) {
                    c8588a.c(C8588a.EnumC1299a.BODY);
                } else {
                    c8588a.c(C8588a.EnumC1299a.NONE);
                }
                aVar.a(c8588a);
                aVar.T().addAll(config.g().d());
                return new E(aVar);
            default:
                ((s10.d) obj).getClass();
                return new C6787b();
        }
    }

    public f(c cVar, Jb.f fVar) {
        this.f7852b = fVar;
    }
}
