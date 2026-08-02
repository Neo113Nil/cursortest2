package androidx.compose.foundation.text.modifiers;

import B1.InterfaceC2552v;
import B1.U;
import B1.W;
import B1.Y;
import D1.AbstractC2810k0;
import D1.AbstractC2813m;
import D1.C2809k;
import D1.E;
import D1.InterfaceC2819t;
import D1.InterfaceC2821v;
import D1.V;
import H0.h;
import K1.C3422b;
import K1.T;
import P1.AbstractC3809p;
import java.util.List;
import kotlin.jvm.functions.Function1;
import l1.InterfaceC7813c0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a extends AbstractC2813m implements E, InterfaceC2819t, InterfaceC2821v {

    /* renamed from: c, reason: collision with root package name */
    private h f39839c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final b f39840d;

    private a() {
        throw null;
    }

    public a(int i11, int i12, int i13, h hVar, C3422b c3422b, T t2, AbstractC3809p.a aVar, List list, Function1 function1, Function1 function12, InterfaceC7813c0 interfaceC7813c0, boolean z11) {
        this.f39839c = hVar;
        b bVar = new b(c3422b, t2, aVar, function1, i11, z11, i12, i13, list, function12, hVar, interfaceC7813c0, null);
        I1(bVar);
        this.f39840d = bVar;
        if (this.f39839c == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // D1.E
    public final int A(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39840d.A(v11, interfaceC2552v, i11);
    }

    @Override // D1.E
    @NotNull
    public final W D(@NotNull Y y11, @NotNull U u11, long j11) {
        return this.f39840d.D(y11, u11, j11);
    }

    @Override // D1.E
    public final int I(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39840d.I(v11, interfaceC2552v, i11);
    }

    @Override // D1.E
    public final int K(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39840d.K(v11, interfaceC2552v, i11);
    }

    public final void N1(int i11, int i12, int i13, h hVar, @NotNull C3422b c3422b, @NotNull T t2, @NotNull AbstractC3809p.a aVar, List list, Function1 function1, Function1 function12, InterfaceC7813c0 interfaceC7813c0, boolean z11) {
        b bVar = this.f39840d;
        bVar.P1(bVar.U1(interfaceC7813c0, t2), bVar.W1(c3422b), this.f39840d.V1(t2, list, i11, i12, z11, aVar, i13), bVar.T1(function1, function12, hVar, null));
        this.f39839c = hVar;
        C2809k.f(this).u0();
    }

    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        this.f39840d.draw(interfaceC8410c);
    }

    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 abstractC2810k0) {
        h hVar = this.f39839c;
        if (hVar != null) {
            hVar.g(abstractC2810k0);
        }
    }

    @Override // D1.E
    public final int u(@NotNull V v11, @NotNull InterfaceC2552v interfaceC2552v, int i11) {
        return this.f39840d.u(v11, interfaceC2552v, i11);
    }
}
