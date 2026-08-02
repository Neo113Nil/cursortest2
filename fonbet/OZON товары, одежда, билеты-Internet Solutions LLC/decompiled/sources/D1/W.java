package D1;

import B1.AbstractC2531a;
import B1.m0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class W implements B1.W {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f5387a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f5388b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Map<AbstractC2531a, Integer> f5389c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<m0.a, Unit> f5390d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ V f5391e;

    W(int i11, int i12, Map map, Function1 function1, V v11) {
        this.f5387a = i11;
        this.f5388b = i12;
        this.f5389c = map;
        this.f5390d = function1;
        this.f5391e = v11;
    }

    @Override // B1.W
    public final int getHeight() {
        return this.f5388b;
    }

    @Override // B1.W
    public final int getWidth() {
        return this.f5387a;
    }

    @Override // B1.W
    @NotNull
    public final Map<AbstractC2531a, Integer> s() {
        return this.f5389c;
    }

    @Override // B1.W
    public final Function1<Object, Unit> t() {
        return null;
    }

    @Override // B1.W
    public final void u() {
        this.f5390d.invoke(this.f5391e.i1());
    }
}
