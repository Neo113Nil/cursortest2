package androidx.compose.foundation.layout;

import B1.z0;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.layout.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5189l extends AbstractC7737t implements Function2<z0, Z1.b, B1.W> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B1.V f39518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f39519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5189l(B1.V v11, C4912a c4912a) {
        super(2);
        this.f39518b = v11;
        this.f39519c = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final B1.W invoke(z0 z0Var, Z1.b bVar) {
        z0 z0Var2 = z0Var;
        long p11 = bVar.p();
        return this.f39518b.mo2measure3p2s80s(z0Var2, z0Var2.L0(Unit.f71690a, new C4912a(true, -1945019079, new C5188k(this.f39519c, new C5192o(z0Var2, p11)))), p11);
    }
}
