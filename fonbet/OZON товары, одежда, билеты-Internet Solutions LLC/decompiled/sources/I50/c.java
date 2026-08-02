package I50;

import Jb.e;
import P60.g;
import P60.q;
import android.content.Context;
import x40.C10656a;

/* loaded from: classes3.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11992a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a f11993b;

    /* renamed from: c, reason: collision with root package name */
    private final Pc.a f11994c;

    public /* synthetic */ c(Pc.a aVar, Pc.a aVar2, int i11) {
        this.f11992a = i11;
        this.f11993b = aVar;
        this.f11994c = aVar2;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f11992a) {
            case 0:
                return new b((C10656a) this.f11993b.get(), (S80.b) this.f11994c.get());
            default:
                return new q((Context) this.f11993b.get(), (g) this.f11994c.get());
        }
    }
}
