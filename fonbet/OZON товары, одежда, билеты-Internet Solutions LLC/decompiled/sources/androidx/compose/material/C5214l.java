package androidx.compose.material;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.material.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5214l extends AbstractC7737t implements Function0<Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5210h<Object> f40078b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5214l(C5210h<Object> c5210h) {
        super(0);
        this.f40078b = c5210h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        C5210h<Object> c5210h = this.f40078b;
        float e11 = c5210h.l().e(c5210h.p());
        float e12 = c5210h.l().e(c5210h.n()) - e11;
        float abs = Math.abs(e12);
        float f7 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float w11 = (c5210h.w() - e11) / e12;
            if (w11 < 1.0E-6f) {
                f7 = 0.0f;
            } else if (w11 <= 0.999999f) {
                f7 = w11;
            }
        }
        return Float.valueOf(f7);
    }
}
