package Q30;

import Jb.e;
import Jb.f;
import android.app.Application;

/* loaded from: classes3.dex */
public final class b implements e<a> {

    /* renamed from: a, reason: collision with root package name */
    private final f f22949a;

    /* renamed from: b, reason: collision with root package name */
    private final f f22950b;

    public b(f fVar, f fVar2) {
        this.f22949a = fVar;
        this.f22950b = fVar2;
    }

    @Override // Pc.a
    public final Object get() {
        return new a((Application) this.f22949a.get(), (O30.b) this.f22950b.get());
    }
}
