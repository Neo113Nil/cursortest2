package B50;

import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LB50/o;", "LE30/d;", "<init>", "()V", "cbottom-stories_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o extends E30.d {

    /* renamed from: a, reason: collision with root package name */
    public A50.c f2947a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final x0<C50.e> f2948b = O0.a(null);

    /* renamed from: c, reason: collision with root package name */
    private int f2949c;

    @NotNull
    public final A50.c d0() {
        A50.c cVar = this.f2947a;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.n("storiesInteractor");
        throw null;
    }

    @NotNull
    public final x0<C50.e> e0() {
        return this.f2948b;
    }

    public final void f0(int i11) {
        this.f2949c = i11;
    }

    public final void g0() {
        this.f2948b.setValue(d0().r(this.f2949c));
    }
}
