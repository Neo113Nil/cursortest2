package Hj0;

import h20.C6787b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class B implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11071a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11072b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f11073c;

    /* renamed from: d, reason: collision with root package name */
    private final Jb.e f11074d;

    public B(Pc.a aVar, Qj0.A a11, Jb.f fVar) {
        this.f11073c = aVar;
        this.f11074d = a11;
        this.f11072b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11071a) {
            case 0:
                Ib.a impl = Jb.d.a(this.f11073c);
                Ib.a noop = Jb.d.a((Qj0.A) this.f11074d);
                fi0.x settings = (fi0.x) this.f11072b.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(noop, "noop");
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (settings.D().a()) {
                    Object obj = impl.get();
                    Intrinsics.f(obj);
                    return (Qj0.V) obj;
                }
                Object obj2 = noop.get();
                Intrinsics.f(obj2);
                return (Qj0.V) obj2;
            default:
                n20.k widgetStore = (n20.k) this.f11072b.get();
                C6787b composerWidgetViewModelStore = (C6787b) this.f11073c.get();
                X10.f widgetViewAsyncCreator = (X10.f) ((Jb.f) this.f11074d).get();
                Intrinsics.checkNotNullParameter(widgetStore, "widgetStore");
                Intrinsics.checkNotNullParameter(composerWidgetViewModelStore, "composerWidgetViewModelStore");
                Intrinsics.checkNotNullParameter(widgetViewAsyncCreator, "widgetViewAsyncCreator");
                return new ru.ozon.composer.ui.widget.o(widgetStore, composerWidgetViewModelStore, widgetViewAsyncCreator);
        }
    }

    public B(s10.d dVar, Jb.f fVar, Pc.a aVar, Jb.f fVar2) {
        this.f11072b = fVar;
        this.f11073c = aVar;
        this.f11074d = fVar2;
    }
}
