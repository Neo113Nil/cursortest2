package J0;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import a1.C4912a;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;

/* loaded from: classes8.dex */
final class n3 extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s3 f13328b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ U0 f13329c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ long f13330d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f13331e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC6511n<U0, InterfaceC3967k, Integer, C7807Z> f13332f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ boolean f13333g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C4912a f13334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n3(s3 s3Var, U0 u02, long j11, long j12, InterfaceC6511n interfaceC6511n, boolean z11, C4912a c4912a, int i11) {
        super(2);
        this.f13328b = s3Var;
        this.f13329c = u02;
        this.f13330d = j11;
        this.f13331e = j12;
        this.f13332f = interfaceC6511n;
        this.f13333g = z11;
        this.f13334h = c4912a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(1769473);
        C4912a c4912a = this.f13334h;
        InterfaceC6511n<U0, InterfaceC3967k, Integer, C7807Z> interfaceC6511n = this.f13332f;
        this.f13328b.a(this.f13329c, this.f13330d, this.f13331e, interfaceC6511n, this.f13333g, c4912a, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
