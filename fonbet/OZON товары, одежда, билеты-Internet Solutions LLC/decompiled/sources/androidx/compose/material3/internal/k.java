package androidx.compose.material3.internal;

import Q0.InterfaceC3831c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class k extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f40273b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(p<Object> pVar) {
        super(0);
        this.f40273b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        p<Object> pVar = this.f40273b;
        Object c11 = p.c(pVar);
        if (c11 != null) {
            return c11;
        }
        float s11 = pVar.s();
        if (Float.isNaN(s11)) {
            return pVar.p();
        }
        Object p11 = pVar.p();
        InterfaceC3831c<Object> l11 = pVar.l();
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
