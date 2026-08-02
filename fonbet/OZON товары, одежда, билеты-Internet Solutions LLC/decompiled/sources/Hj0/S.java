package Hj0;

import bZ.C5612f;
import bZ.InterfaceC5607a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class S implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11104a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11105b;

    public /* synthetic */ S(Pc.a aVar, int i11) {
        this.f11104a = i11;
        this.f11105b = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11104a) {
            case 0:
                fi0.x settings = (fi0.x) ((Jb.f) this.f11105b).get();
                Intrinsics.checkNotNullParameter(settings, "settings");
                fi0.v p11 = settings.p();
                Jb.j.d(p11);
                return p11;
            default:
                return new C5612f((InterfaceC5607a) this.f11105b.get());
        }
    }
}
