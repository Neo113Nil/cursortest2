package Hj0;

import kotlin.jvm.internal.Intrinsics;
import nf.C8588a;

/* loaded from: classes7.dex */
public final class x implements Jb.e<C8588a> {

    /* renamed from: a, reason: collision with root package name */
    private final C3163u f11200a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<Mj0.i> f11201b;

    public x(C3163u c3163u, Pc.a<Mj0.i> aVar) {
        this.f11200a = c3163u;
        this.f11201b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Mj0.i trackerLogger = this.f11201b.get();
        this.f11200a.getClass();
        Intrinsics.checkNotNullParameter(trackerLogger, "trackerLogger");
        C8588a c8588a = new C8588a(trackerLogger);
        c8588a.a(C8588a.EnumC1299a.BODY);
        return c8588a;
    }
}
