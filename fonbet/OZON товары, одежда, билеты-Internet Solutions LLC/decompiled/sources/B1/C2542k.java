package B1;

import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: B1.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2542k implements W {

    /* renamed from: a, reason: collision with root package name */
    private final int f2115a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2116b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<AbstractC2531a, Integer> f2117c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<m0.a, Unit> f2118d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2543l f2119e;

    C2542k(int i11, int i12, Map map, Function1 function1, C2543l c2543l) {
        this.f2118d = function1;
        this.f2119e = c2543l;
        this.f2115a = i11;
        this.f2116b = i12;
        this.f2117c = map;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f2116b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f2115a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f2117c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
        this.f2118d.invoke(this.f2119e.t().i1());
    }
}
