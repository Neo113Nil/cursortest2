package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.w0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3783w0 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f21425b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21426c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f21427d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f21428e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3783w0(long j11, Function0<Unit> function0, boolean z11, int i11) {
        super(2);
        this.f21425b = j11;
        this.f21426c = function0;
        this.f21427d = z11;
        this.f21428e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21428e | 1);
        Function0<Unit> function0 = this.f21426c;
        boolean z11 = this.f21427d;
        B0.c(this.f21425b, function0, z11, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
