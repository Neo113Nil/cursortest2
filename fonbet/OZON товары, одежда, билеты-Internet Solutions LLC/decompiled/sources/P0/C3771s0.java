package P0;

import I1.C3222a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: P0.s0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3771s0 extends AbstractC7737t implements Function1<I1.D, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3787x1 f21344b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f21345c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f21346d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f21347e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f21348f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ xe.M f21349g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3771s0(C3787x1 c3787x1, String str, String str2, String str3, Function0<Unit> function0, xe.M m11) {
        super(1);
        this.f21344b = c3787x1;
        this.f21345c = str;
        this.f21346d = str2;
        this.f21347e = str3;
        this.f21348f = function0;
        this.f21349g = m11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(I1.D d11) {
        I1.D d12 = d11;
        C3757n0 c3757n0 = new C3757n0(this.f21348f);
        int i11 = I1.z.f11793b;
        d12.b(I1.k.f(), new C3222a(this.f21345c, c3757n0));
        C3787x1 c3787x1 = this.f21344b;
        EnumC3790y1 d13 = c3787x1.d();
        EnumC3790y1 enumC3790y1 = EnumC3790y1.PartiallyExpanded;
        xe.M m11 = this.f21349g;
        if (d13 == enumC3790y1) {
            d12.b(I1.k.g(), new C3222a(this.f21346d, new C3763p0(c3787x1, m11, c3787x1)));
        } else if (c3787x1.f()) {
            d12.b(I1.k.b(), new C3222a(this.f21347e, new C3768r0(c3787x1, m11)));
        }
        return Unit.f71690a;
    }
}
