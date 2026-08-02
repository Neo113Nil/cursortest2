package Ve;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G1 implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.a f29054a;

    public G1(Pc.a aVar) {
        this.f29054a = aVar;
    }

    @Override // Pc.a
    public final Object get() {
        Y9 reducer = (Y9) this.f29054a.get();
        Intrinsics.checkNotNullParameter(reducer, "reducer");
        return new Q(reducer);
    }
}
