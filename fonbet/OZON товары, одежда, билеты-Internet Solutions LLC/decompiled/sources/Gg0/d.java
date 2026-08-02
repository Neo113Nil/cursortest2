package Gg0;

import Qj0.B;
import Qj0.C3898s;
import Qj0.U;
import Qj0.t0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.ObjectTypes;

/* loaded from: classes7.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f10236a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f10237b;

    public d(Boolean bool, @NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f10236a = bool;
        this.f10237b = url;
    }

    @Override // Gg0.a
    public final Boolean a() {
        return this.f10236a;
    }

    @Override // Gg0.a
    public final void b(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        B b11 = new B(ObjectTypes.IMAGE);
        int i11 = U.f23535i;
        trace.n(b11, true);
        trace.n(new t0(this.f10237b), true);
        trace.n(new C3898s(true), true);
    }
}
