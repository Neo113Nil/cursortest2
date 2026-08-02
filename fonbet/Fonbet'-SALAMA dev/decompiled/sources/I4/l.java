package I4;

import Y4.H0;
import Y4.I0;
import com.google.firebase.Timestamp;

/* loaded from: classes2.dex */
public final class l implements q {

    /* renamed from: a, reason: collision with root package name */
    public final I0 f3685a;

    public l(I0 i02) {
        p3.f.O("NumericIncrementTransformOperation expects a NumberValue operand", H4.o.h(i02) || H4.o.g(i02), new Object[0]);
        this.f3685a = i02;
    }

    @Override // I4.q
    public final I0 a(I0 i02, Timestamp timestamp) {
        long M7;
        I0 b7 = b(i02);
        if (H4.o.h(b7)) {
            I0 i03 = this.f3685a;
            if (H4.o.h(i03)) {
                long M8 = b7.M();
                if (H4.o.g(i03)) {
                    M7 = (long) i03.K();
                } else {
                    if (!H4.o.h(i03)) {
                        p3.f.F("Expected 'operand' to be of Number type, but was " + i03.getClass().getCanonicalName(), new Object[0]);
                        throw null;
                    }
                    M7 = i03.M();
                }
                long j = M8 + M7;
                if (((M8 ^ j) & (M7 ^ j)) < 0) {
                    j = j >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                H0 S6 = I0.S();
                S6.h(j);
                return (I0) S6.b();
            }
        }
        if (H4.o.h(b7)) {
            double d7 = d() + b7.M();
            H0 S7 = I0.S();
            S7.g(d7);
            return (I0) S7.b();
        }
        p3.f.O("Expected NumberValue to be of type DoubleValue, but was ", H4.o.g(b7), i02.getClass().getCanonicalName());
        double d8 = d() + b7.K();
        H0 S8 = I0.S();
        S8.g(d8);
        return (I0) S8.b();
    }

    @Override // I4.q
    public final I0 b(I0 i02) {
        if (H4.o.h(i02) || H4.o.g(i02)) {
            return i02;
        }
        H0 S6 = I0.S();
        S6.h(0L);
        return (I0) S6.b();
    }

    public final double d() {
        I0 i02 = this.f3685a;
        if (H4.o.g(i02)) {
            return i02.K();
        }
        if (H4.o.h(i02)) {
            return i02.M();
        }
        p3.f.F("Expected 'operand' to be of Number type, but was " + i02.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // I4.q
    public final I0 c(I0 i02, I0 i03) {
        return i03;
    }
}
