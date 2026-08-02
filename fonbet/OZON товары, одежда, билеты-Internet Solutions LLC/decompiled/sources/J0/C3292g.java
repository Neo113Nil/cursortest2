package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: J0.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3292g extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f13219b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f13220c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f13221d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f13222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3292g(androidx.compose.ui.e eVar, long j11, long j12, C4912a c4912a, int i11) {
        super(2);
        this.f13219b = eVar;
        this.f13220c = j11;
        this.f13221d = j12;
        this.f13222e = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(3073);
        C3296h.a(this.f13219b, this.f13220c, this.f13221d, this.f13222e, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
