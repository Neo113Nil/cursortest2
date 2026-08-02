package Hj0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class E implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11077a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Object f11078b;

    public E(s10.d dVar) {
        this.f11078b = dVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11077a) {
            case 0:
                fi0.w settings = (fi0.w) ((F) this.f11078b).get();
                Intrinsics.checkNotNullParameter(settings, "settings");
                fi0.o<kotlin.time.b> a11 = settings.a();
                Jb.j.d(a11);
                return a11;
            default:
                ((s10.d) this.f11078b).getClass();
                return new ru.ozon.composer.ui.widget.f();
        }
    }

    public E(D d11, F f7) {
        this.f11078b = f7;
    }
}
