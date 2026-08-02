package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.material.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5212j extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40071b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5212j(C5210h<Object> c5210h) {
        super(0);
        this.f40071b = c5210h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C5210h<Object> c5210h = this.f40071b;
        Object c11 = C5210h.c(c5210h);
        if (c11 != null) {
            return c11;
        }
        float s11 = c5210h.s();
        if (Float.isNaN(s11)) {
            return c5210h.p();
        }
        Object p11 = c5210h.p();
        J0.M<Object> l11 = c5210h.l();
        float e11 = l11.e(p11);
        if (e11 != s11 && !Float.isNaN(e11)) {
            if (e11 < s11) {
                Object a11 = l11.a(s11, true);
                if (a11 != null) {
                    return a11;
                }
            } else {
                Object a12 = l11.a(s11, false);
                if (a12 != null) {
                    return a12;
                }
            }
        }
        return p11;
    }
}
