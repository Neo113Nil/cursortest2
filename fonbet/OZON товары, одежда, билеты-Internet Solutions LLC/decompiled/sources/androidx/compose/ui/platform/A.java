package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.collection.AbstractC5144m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class A extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ K1 f40489b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C5299y f40490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(C5299y c5299y, K1 k12) {
        super(0);
        this.f40489b = k12;
        this.f40490c = c5299y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int Z11;
        AbstractC5144m G11;
        y2.q qVar;
        Rect x11;
        AbstractC5144m G12;
        I1.r b11;
        D1.H n11;
        androidx.collection.C c11;
        androidx.collection.C c12;
        K1 k12 = this.f40489b;
        I1.j a11 = k12.a();
        I1.j e11 = k12.e();
        Float b12 = k12.b();
        Float c13 = k12.c();
        float floatValue = (a11 == null || b12 == null) ? 0.0f : a11.c().invoke().floatValue() - b12.floatValue();
        float floatValue2 = (e11 == null || c13 == null) ? 0.0f : e11.c().invoke().floatValue() - c13.floatValue();
        if (floatValue != 0.0f || floatValue2 != 0.0f) {
            int d11 = k12.d();
            C5299y c5299y = this.f40490c;
            Z11 = c5299y.Z(d11);
            G11 = c5299y.G();
            M1 m12 = (M1) G11.c(c5299y.f41072k);
            if (m12 != null) {
                try {
                    qVar = c5299y.f41073l;
                    if (qVar != null) {
                        x11 = c5299y.x(m12);
                        qVar.H(x11);
                        Unit unit = Unit.f71690a;
                    }
                } catch (IllegalStateException unused) {
                    Unit unit2 = Unit.f71690a;
                }
            }
            c5299y.Q().invalidate();
            G12 = c5299y.G();
            M1 m13 = (M1) G12.c(Z11);
            if (m13 != null && (b11 = m13.b()) != null && (n11 = b11.n()) != null) {
                if (a11 != null) {
                    c12 = c5299y.f41075n;
                    c12.j(Z11, a11);
                }
                if (e11 != null) {
                    c11 = c5299y.f41076o;
                    c11.j(Z11, e11);
                }
                c5299y.T(n11);
            }
        }
        if (a11 != null) {
            k12.g(a11.c().invoke());
        }
        if (e11 != null) {
            k12.h(e11.c().invoke());
        }
        return Unit.f71690a;
    }
}
