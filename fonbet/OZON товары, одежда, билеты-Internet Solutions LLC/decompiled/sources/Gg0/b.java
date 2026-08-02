package Gg0;

import Qj0.C3894n;
import Qj0.C3898s;
import Qj0.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f10229a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f10230b;

    public b(Boolean bool, Integer num) {
        this.f10229a = bool;
        this.f10230b = num;
    }

    @Override // Gg0.a
    public final Boolean a() {
        return this.f10229a;
    }

    @Override // Gg0.a
    public final void b(@NotNull U trace) {
        Intrinsics.checkNotNullParameter(trace, "trace");
        Integer num = this.f10230b;
        if (num != null) {
            C3894n c3894n = new C3894n(num.intValue());
            int i11 = U.f23535i;
            trace.n(c3894n, true);
        }
        C3898s c3898s = new C3898s(false);
        int i12 = U.f23535i;
        trace.n(c3898s, true);
    }
}
