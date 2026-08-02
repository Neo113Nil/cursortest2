package B0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes.dex */
final class J1 extends AbstractC7737t implements Function1<Float, Float> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ M1 f1413b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    J1(M1 m12) {
        super(1);
        this.f1413b = m12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Float invoke(Float f7) {
        float floatValue = f7.floatValue();
        M1 m12 = this.f1413b;
        float c11 = m12.c() + floatValue;
        if (c11 > m12.b()) {
            floatValue = m12.b() - m12.c();
        } else if (c11 < 0.0f) {
            floatValue = -m12.c();
        }
        m12.f(m12.c() + floatValue);
        return Float.valueOf(floatValue);
    }
}
