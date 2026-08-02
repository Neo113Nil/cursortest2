package androidx.compose.foundation.gestures;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: androidx.compose.foundation.gestures.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5169l extends AbstractC7737t implements Function0<Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C5167j<Object> f39208b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C5169l(C5167j<Object> c5167j) {
        super(0);
        this.f39208b = c5167j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        C5167j<Object> c5167j = this.f39208b;
        float e11 = c5167j.j().e(c5167j.p());
        float e12 = c5167j.j().e(c5167j.r()) - e11;
        float abs = Math.abs(e12);
        float f7 = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float u11 = (c5167j.u() - e11) / e12;
            if (u11 < 1.0E-6f) {
                f7 = 0.0f;
            } else if (u11 <= 0.999999f) {
                f7 = u11;
            }
        }
        return Float.valueOf(f7);
    }
}
