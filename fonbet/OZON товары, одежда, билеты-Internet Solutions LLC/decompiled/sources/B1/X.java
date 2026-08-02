package B1;

import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class X implements W {

    /* renamed from: a, reason: collision with root package name */
    private final int f2085a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2086b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<AbstractC2531a, Integer> f2087c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f2088d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Y f2089e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1<m0.a, Unit> f2090f;

    X(int i11, int i12, Map map, Y y11, Function1 function1) {
        this.f2088d = i11;
        this.f2089e = y11;
        this.f2090f = function1;
        this.f2085a = i11;
        this.f2086b = i12;
        this.f2087c = map;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f2086b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f2085a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f2087c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
        Y y11 = this.f2089e;
        boolean z11 = y11 instanceof D1.V;
        Function1<m0.a, Unit> function1 = this.f2090f;
        if (z11) {
            function1.invoke(((D1.V) y11).i1());
        } else {
            function1.invoke(new u0(this.f2088d, y11.getLayoutDirection()));
        }
    }
}
