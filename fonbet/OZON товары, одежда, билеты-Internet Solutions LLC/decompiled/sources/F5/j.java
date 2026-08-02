package F5;

import B1.InterfaceC2547p;
import B1.s0;
import B5.EnumC2597a;
import S0.InterfaceC3978p0;
import android.graphics.Matrix;
import hd.C6915b;
import k1.C7464j;
import k1.C7465k;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7845v;
import l1.InterfaceC7802U;
import n1.InterfaceC8412e;

/* loaded from: classes8.dex */
final class j extends AbstractC7737t implements Function1<InterfaceC8412e, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ B5.g f9053b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC2547p.a.C0051a f9054c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e1.d f9055d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Matrix f9056e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.g f9057f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ com.airbnb.lottie.i f9058g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ EnumC2597a f9059h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Float> f9060i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ InterfaceC3978p0<x> f9061j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(B5.g gVar, InterfaceC2547p.a.C0051a c0051a, e1.d dVar, Matrix matrix, com.airbnb.lottie.g gVar2, com.airbnb.lottie.i iVar, EnumC2597a enumC2597a, Function0 function0, InterfaceC3978p0 interfaceC3978p0) {
        super(1);
        this.f9053b = gVar;
        this.f9054c = c0051a;
        this.f9055d = dVar;
        this.f9056e = matrix;
        this.f9057f = gVar2;
        this.f9058g = iVar;
        this.f9059h = enumC2597a;
        this.f9060i = function0;
        this.f9061j = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8412e interfaceC8412e) {
        InterfaceC8412e Canvas = interfaceC8412e;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        InterfaceC7802U a11 = Canvas.w0().a();
        B5.g gVar = this.f9053b;
        long a12 = C7465k.a(gVar.b().width(), gVar.b().height());
        long a13 = Z1.r.a(C6915b.c(C7464j.f(Canvas.i())), C6915b.c(C7464j.d(Canvas.i())));
        long a14 = this.f9054c.a(a12, Canvas.i());
        long a15 = this.f9055d.a(Z1.r.a((int) (s0.a(a14) * C7464j.f(a12)), (int) (s0.b(a14) * C7464j.d(a12))), a13, Canvas.getLayoutDirection());
        Matrix matrix = this.f9056e;
        matrix.reset();
        matrix.preTranslate((int) (a15 >> 32), (int) (a15 & 4294967295L));
        matrix.preScale(s0.a(a14), s0.b(a14));
        com.airbnb.lottie.g drawable = this.f9057f;
        drawable.m(false);
        drawable.N(this.f9058g);
        drawable.F(this.f9059h);
        drawable.H(gVar);
        InterfaceC3978p0<x> interfaceC3978p0 = this.f9061j;
        if (interfaceC3978p0.getValue() != null) {
            if (interfaceC3978p0.getValue() != null) {
                Intrinsics.checkNotNullParameter(drawable, "drawable");
                throw null;
            }
            interfaceC3978p0.setValue(null);
        }
        drawable.G(true);
        drawable.M(this.f9060i.invoke().floatValue());
        drawable.setBounds(0, 0, gVar.b().width(), gVar.b().height());
        drawable.k(C7845v.b(a11), matrix);
        return Unit.f71690a;
    }
}
