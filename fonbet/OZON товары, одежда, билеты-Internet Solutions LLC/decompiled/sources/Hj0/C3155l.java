package Hj0;

import We.E;
import bZ.C5608b;
import bZ.C5609c;
import kotlin.jvm.internal.Intrinsics;
import li0.InterfaceC7963a;
import ru.ozon.tracker.db.TrackerDataBase;

/* renamed from: Hj0.l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3155l implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11182a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11183b;

    public C3155l(Pc.a aVar) {
        this.f11183b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11182a) {
            case 0:
                TrackerDataBase dataBase = (TrackerDataBase) this.f11183b.get();
                Intrinsics.checkNotNullParameter(dataBase, "dataBase");
                InterfaceC7963a a11 = dataBase.a();
                Jb.j.d(a11);
                return a11;
            default:
                XY.d config = (XY.d) ((Jb.f) this.f11183b).get();
                C5608b headersInterceptor = new C5608b();
                Intrinsics.checkNotNullParameter(config, "config");
                Intrinsics.checkNotNullParameter(headersInterceptor, "headersInterceptor");
                We.E d11 = config.d();
                d11.getClass();
                E.a aVar = new E.a(d11);
                aVar.a(headersInterceptor);
                return new We.E(aVar);
        }
    }

    public C3155l(fZ.b bVar, Jb.f fVar, C5609c c5609c) {
        this.f11183b = fVar;
    }
}
