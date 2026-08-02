package androidx.compose.material3.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class n extends AbstractC7737t implements Function0<Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f40281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p<Object> pVar) {
        super(0);
        this.f40281b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object j11;
        p<Object> pVar = this.f40281b;
        Object c11 = p.c(pVar);
        if (c11 != null) {
            return c11;
        }
        float s11 = pVar.s();
        if (Float.isNaN(s11)) {
            return pVar.p();
        }
        j11 = pVar.j(s11, 0.0f, pVar.p());
        return j11;
    }
}
