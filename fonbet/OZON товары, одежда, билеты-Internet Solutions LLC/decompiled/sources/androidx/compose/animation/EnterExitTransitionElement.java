package androidx.compose.animation;

import D1.AbstractC2794c0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l0.O;
import l0.d0;
import m0.C8010q;
import m0.D0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "LD1/c0;", "Landroidx/compose/animation/p;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* data */ class EnterExitTransitionElement extends AbstractC2794c0<p> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final D0<O> f38753a;

    /* renamed from: b, reason: collision with root package name */
    private D0<O>.a<Z1.q, C8010q> f38754b;

    /* renamed from: c, reason: collision with root package name */
    private D0<O>.a<Z1.m, C8010q> f38755c;

    /* renamed from: d, reason: collision with root package name */
    private D0<O>.a<Z1.m, C8010q> f38756d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private q f38757e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private s f38758f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private Function0<Boolean> f38759g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private d0 f38760h;

    public EnterExitTransitionElement(@NotNull D0<O> d02, D0<O>.a<Z1.q, C8010q> aVar, D0<O>.a<Z1.m, C8010q> aVar2, D0<O>.a<Z1.m, C8010q> aVar3, @NotNull q qVar, @NotNull s sVar, @NotNull Function0<Boolean> function0, @NotNull d0 d0Var) {
        this.f38753a = d02;
        this.f38754b = aVar;
        this.f38755c = aVar2;
        this.f38756d = aVar3;
        this.f38757e = qVar;
        this.f38758f = sVar;
        this.f38759g = function0;
        this.f38760h = d0Var;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final p getF41119a() {
        q qVar = this.f38757e;
        s sVar = this.f38758f;
        return new p(this.f38753a, this.f38754b, this.f38755c, this.f38756d, qVar, sVar, this.f38759g, this.f38760h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.d(this.f38753a, enterExitTransitionElement.f38753a) && Intrinsics.d(this.f38754b, enterExitTransitionElement.f38754b) && Intrinsics.d(this.f38755c, enterExitTransitionElement.f38755c) && Intrinsics.d(this.f38756d, enterExitTransitionElement.f38756d) && Intrinsics.d(this.f38757e, enterExitTransitionElement.f38757e) && Intrinsics.d(this.f38758f, enterExitTransitionElement.f38758f) && Intrinsics.d(this.f38759g, enterExitTransitionElement.f38759g) && Intrinsics.d(this.f38760h, enterExitTransitionElement.f38760h);
    }

    public final int hashCode() {
        int hashCode = this.f38753a.hashCode() * 31;
        D0<O>.a<Z1.q, C8010q> aVar = this.f38754b;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        D0<O>.a<Z1.m, C8010q> aVar2 = this.f38755c;
        int hashCode3 = (hashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        D0<O>.a<Z1.m, C8010q> aVar3 = this.f38756d;
        return this.f38760h.hashCode() + ((this.f38759g.hashCode() + ((this.f38758f.hashCode() + ((this.f38757e.hashCode() + ((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f38753a + ", sizeAnimation=" + this.f38754b + ", offsetAnimation=" + this.f38755c + ", slideAnimation=" + this.f38756d + ", enter=" + this.f38757e + ", exit=" + this.f38758f + ", isEnabled=" + this.f38759g + ", graphicsLayerBlock=" + this.f38760h + ')';
    }

    @Override // D1.AbstractC2794c0
    public final void update(p pVar) {
        p pVar2 = pVar;
        pVar2.S1(this.f38753a);
        pVar2.Q1(this.f38754b);
        pVar2.P1(this.f38755c);
        pVar2.R1(this.f38756d);
        pVar2.M1(this.f38757e);
        pVar2.N1(this.f38758f);
        pVar2.L1(this.f38759g);
        pVar2.O1(this.f38760h);
    }
}
