package Hj0;

import kotlin.jvm.internal.Intrinsics;
import mi0.C8337g;
import mi0.C8338h;
import xb0.InterfaceC10696a;

/* loaded from: classes7.dex */
public final class P implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11099a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.f f11100b;

    public P(Jb.f fVar) {
        this.f11100b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11099a) {
            case 0:
                fi0.x trackerSettings = (fi0.x) this.f11100b.get();
                Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
                return trackerSettings.H() ? new C8337g() : new C8338h();
            default:
                Ld0.c store = (Ld0.c) this.f11100b.get();
                Intrinsics.checkNotNullParameter(store, "store");
                return (InterfaceC10696a) store.d(InterfaceC10696a.class);
        }
    }

    public P(O7.o oVar, Jb.f fVar) {
        this.f11100b = fVar;
    }
}
