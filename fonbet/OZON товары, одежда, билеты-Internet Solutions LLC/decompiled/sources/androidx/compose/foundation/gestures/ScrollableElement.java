package androidx.compose.foundation.gestures;

import D1.AbstractC2794c0;
import Kk.C3532b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n0.W;
import org.jetbrains.annotations.NotNull;
import r0.EnumC9142v;
import r0.InterfaceC9108I;
import r0.InterfaceC9124d;
import r0.InterfaceC9138r;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableElement;", "LD1/c0;", "Landroidx/compose/foundation/gestures/N;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollableElement extends AbstractC2794c0<N> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC9108I f39099a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final EnumC9142v f39100b;

    /* renamed from: c, reason: collision with root package name */
    private final W f39101c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f39102d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f39103e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC9138r f39104f;

    /* renamed from: g, reason: collision with root package name */
    private final t0.q f39105g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC9124d f39106h;

    public ScrollableElement(W w11, InterfaceC9124d interfaceC9124d, InterfaceC9138r interfaceC9138r, @NotNull EnumC9142v enumC9142v, @NotNull InterfaceC9108I interfaceC9108I, t0.q qVar, boolean z11, boolean z12) {
        this.f39099a = interfaceC9108I;
        this.f39100b = enumC9142v;
        this.f39101c = w11;
        this.f39102d = z11;
        this.f39103e = z12;
        this.f39104f = interfaceC9138r;
        this.f39105g = qVar;
        this.f39106h = interfaceC9124d;
    }

    @Override // D1.AbstractC2794c0
    /* renamed from: create */
    public final N getF41119a() {
        t0.q qVar = this.f39105g;
        return new N(this.f39101c, this.f39106h, this.f39104f, this.f39100b, this.f39099a, qVar, this.f39102d, this.f39103e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollableElement)) {
            return false;
        }
        ScrollableElement scrollableElement = (ScrollableElement) obj;
        return Intrinsics.d(this.f39099a, scrollableElement.f39099a) && this.f39100b == scrollableElement.f39100b && Intrinsics.d(this.f39101c, scrollableElement.f39101c) && this.f39102d == scrollableElement.f39102d && this.f39103e == scrollableElement.f39103e && Intrinsics.d(this.f39104f, scrollableElement.f39104f) && Intrinsics.d(this.f39105g, scrollableElement.f39105g) && Intrinsics.d(this.f39106h, scrollableElement.f39106h);
    }

    public final int hashCode() {
        int hashCode = (this.f39100b.hashCode() + (this.f39099a.hashCode() * 31)) * 31;
        W w11 = this.f39101c;
        int a11 = C3532b.a(C3532b.a((hashCode + (w11 != null ? w11.hashCode() : 0)) * 31, 31, this.f39102d), 31, this.f39103e);
        InterfaceC9138r interfaceC9138r = this.f39104f;
        int hashCode2 = (a11 + (interfaceC9138r != null ? interfaceC9138r.hashCode() : 0)) * 31;
        t0.q qVar = this.f39105g;
        int hashCode3 = (hashCode2 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        InterfaceC9124d interfaceC9124d = this.f39106h;
        return hashCode3 + (interfaceC9124d != null ? interfaceC9124d.hashCode() : 0);
    }

    @Override // D1.AbstractC2794c0
    public final void update(N n11) {
        t0.q qVar = this.f39105g;
        InterfaceC9124d interfaceC9124d = this.f39106h;
        InterfaceC9108I interfaceC9108I = this.f39099a;
        EnumC9142v enumC9142v = this.f39100b;
        n11.h2(this.f39101c, interfaceC9124d, this.f39104f, enumC9142v, interfaceC9108I, qVar, this.f39102d, this.f39103e);
    }
}
