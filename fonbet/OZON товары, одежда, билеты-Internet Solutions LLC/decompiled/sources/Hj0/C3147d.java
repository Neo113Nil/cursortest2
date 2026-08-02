package Hj0;

import Qi.C3878b;
import Qi.C3879c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Hj0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3147d implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11115a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11116b;

    public C3147d(Jb.f fVar) {
        this.f11116b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11115a) {
            case 0:
                fi0.x settings = (fi0.x) ((Jb.f) this.f11116b).get();
                Intrinsics.checkNotNullParameter(settings, "settings");
                xe.J s11 = settings.s();
                Jb.j.d(s11);
                return s11;
            default:
                return new Si.e((Oi.b) this.f11116b.get(), new Mi.a(), new C3878b());
        }
    }

    public C3147d(Pc.a aVar, Mi.b bVar, C3879c c3879c) {
        this.f11116b = aVar;
    }
}
