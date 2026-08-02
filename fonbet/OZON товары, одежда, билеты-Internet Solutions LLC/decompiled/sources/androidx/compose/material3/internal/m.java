package androidx.compose.material3.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes8.dex */
final class m extends AbstractC7737t implements Function0<Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p<Object> f40280b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(p<Object> pVar) {
        super(0);
        this.f40280b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        p<Object> pVar = this.f40280b;
        float e11 = pVar.l().e(pVar.p());
        float e12 = pVar.l().e(pVar.n()) - e11;
        float abs = Math.abs(e12);
        float f7 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float w11 = (pVar.w() - e11) / e12;
            if (w11 < 1.0E-6f) {
                f7 = 0.0f;
            } else if (w11 <= 0.999999f) {
                f7 = w11;
            }
        }
        return Float.valueOf(f7);
    }
}
