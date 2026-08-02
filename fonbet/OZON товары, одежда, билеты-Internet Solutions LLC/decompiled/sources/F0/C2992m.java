package F0;

import B0.EnumC2526y0;
import I0.C3196m0;
import k1.C7459e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: F0.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2992m extends AbstractC7737t implements Function1<C7459e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8322b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2990k f8323c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.L f8324d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2992m(C2990k c2990k, kotlin.jvm.internal.L l11, kotlin.jvm.internal.L l12) {
        super(1);
        this.f8322b = l11;
        this.f8323c = c2990k;
        this.f8324d = l12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C7459e c7459e) {
        c7459e.n();
        C2990k c2990k = this.f8323c;
        long a11 = C3196m0.a(c2990k.L().i());
        kotlin.jvm.internal.L l11 = this.f8322b;
        l11.f71786a = a11;
        this.f8324d.f71786a = 0L;
        c2990k.b0(true);
        C2990k.o(c2990k);
        c2990k.f0(EnumC2526y0.Cursor, l11.f71786a);
        return Unit.f71690a;
    }
}
