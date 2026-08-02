package B1;

import B1.L;
import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class M implements W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f2064a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f2065b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<AbstractC2531a, Integer> f2066c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ L.c f2067d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ L f2068e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<m0.a, Unit> f2069f;

    M(int i11, int i12, Map map, L.c cVar, L l11, Function1 function1) {
        this.f2064a = i11;
        this.f2065b = i12;
        this.f2066c = map;
        this.f2067d = cVar;
        this.f2068e = l11;
        this.f2069f = function1;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f2065b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f2064a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f2066c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
        D1.Y c22;
        boolean R02 = this.f2067d.R0();
        Function1<m0.a, Unit> function1 = this.f2069f;
        L l11 = this.f2068e;
        if (!R02 || (c22 = l11.f2034a.J().c2()) == null) {
            function1.invoke(l11.f2034a.J().i1());
        } else {
            function1.invoke(c22.i1());
        }
    }
}
