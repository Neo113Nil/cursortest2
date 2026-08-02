package S0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: S0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3973n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3969l f25489b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ T0.a f25490c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C3944b1 f25491d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C3968k0 f25492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3973n(C3969l c3969l, T0.a aVar, C3944b1 c3944b1, C3968k0 c3968k0) {
        super(0);
        this.f25489b = c3969l;
        this.f25490c = aVar;
        this.f25491d = c3944b1;
        this.f25492e = c3968k0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        T0.b bVar;
        int[] iArr;
        U0.a aVar;
        T0.b bVar2;
        C3969l c3969l = this.f25489b;
        bVar = c3969l.f25449L;
        T0.a aVar2 = this.f25490c;
        C3944b1 c3944b1 = this.f25491d;
        C3968k0 c3968k0 = this.f25492e;
        T0.a m11 = bVar.m();
        try {
            bVar.J(aVar2);
            C3944b1 y02 = c3969l.y0();
            iArr = c3969l.f25467n;
            aVar = c3969l.f25474u;
            c3969l.f25467n = null;
            c3969l.f25474u = null;
            try {
                c3969l.N0(c3944b1);
                bVar2 = c3969l.f25449L;
                boolean n11 = bVar2.n();
                try {
                    bVar2.K(false);
                    C3969l.S(c3969l, c3968k0.c(), c3968k0.e(), c3968k0.f());
                    bVar2.K(n11);
                    Unit unit = Unit.f71690a;
                    bVar.J(m11);
                    return Unit.f71690a;
                } catch (Throwable th2) {
                    bVar2.K(n11);
                    throw th2;
                }
            } finally {
                c3969l.N0(y02);
                c3969l.f25467n = iArr;
                c3969l.f25474u = aVar;
            }
        } catch (Throwable th3) {
            bVar.J(m11);
            throw th3;
        }
    }
}
