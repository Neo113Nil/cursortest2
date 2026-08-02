package P0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import androidx.compose.ui.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import u0.C9892a;

/* renamed from: P0.f1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3734f1 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e.a f21028b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C4912a f21029c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4912a f21030d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4912a f21031e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C4912a f21032f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f21033g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f21034h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ long f21035i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C9892a f21036j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C4912a f21037k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ int f21038l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ int f21039m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3734f1(e.a aVar, C4912a c4912a, C4912a c4912a2, C4912a c4912a3, C4912a c4912a4, int i11, long j11, long j12, C9892a c9892a, C4912a c4912a5, int i12, int i13) {
        super(2);
        this.f21028b = aVar;
        this.f21029c = c4912a;
        this.f21030d = c4912a2;
        this.f21031e = c4912a3;
        this.f21032f = c4912a4;
        this.f21033g = i11;
        this.f21034h = j11;
        this.f21035i = j12;
        this.f21036j = c9892a;
        this.f21037k = c4912a5;
        this.f21038l = i12;
        this.f21039m = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f21038l | 1);
        C4912a c4912a = this.f21037k;
        long j11 = this.f21035i;
        int i11 = this.f21039m;
        C3752l1.a(this.f21028b, this.f21029c, this.f21030d, this.f21031e, this.f21032f, this.f21033g, this.f21034h, j11, this.f21036j, c4912a, interfaceC3967k, e11, i11);
        return Unit.f71690a;
    }
}
