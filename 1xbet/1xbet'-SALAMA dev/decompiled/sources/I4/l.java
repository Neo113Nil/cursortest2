package I4;

import Y4.H0;
import Y4.I0;
import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I0 f3685a;

    public l(I0 i7) {
        p113p3.f.O("NumericIncrementTransformOperation expects a NumberValue operand", H4.o.h(i7) || H4.o.g(i7), new Object[0]);
        this.f3685a = i7;
    }

    @Override // I4.q
    public final I0 a(I0 i7, Timestamp timestamp) {
        long jM;
        I0 i0B = b(i7);
        if (H4.o.h(i0B)) {
            I0 i8 = this.f3685a;
            if (H4.o.h(i8)) {
                long jM2 = i0B.M();
                if (H4.o.g(i8)) {
                    jM = (long) i8.K();
                } else {
                    if (!H4.o.h(i8)) {
                        p113p3.f.F("Expected 'operand' to be of Number type, but was " + i8.getClass().getCanonicalName(), new Object[0]);
                        throw null;
                    }
                    jM = i8.M();
                }
                long j = jM2 + jM;
                if (((jM2 ^ j) & (jM ^ j)) < 0) {
                    j = j >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                H0 h0S = I0.S();
                h0S.h(j);
                return (I0) h0S.b();
            }
        }
        if (H4.o.h(i0B)) {
            double d7 = d() + i0B.M();
            H0 h0S2 = I0.S();
            h0S2.g(d7);
            return (I0) h0S2.b();
        }
        p113p3.f.O("Expected NumberValue to be of type DoubleValue, but was ", H4.o.g(i0B), i7.getClass().getCanonicalName());
        double d8 = d() + i0B.K();
        H0 h0S3 = I0.S();
        h0S3.g(d8);
        return (I0) h0S3.b();
    }

    @Override // I4.q
    public final I0 b(I0 i7) {
        if (H4.o.h(i7) || H4.o.g(i7)) {
            return i7;
        }
        H0 h0S = I0.S();
        h0S.h(0L);
        return (I0) h0S.b();
    }

    public final double d() {
        I0 i7 = this.f3685a;
        if (H4.o.g(i7)) {
            return i7.K();
        }
        if (H4.o.h(i7)) {
            return i7.M();
        }
        p113p3.f.F("Expected 'operand' to be of Number type, but was " + i7.getClass().getCanonicalName(), new Object[0]);
        throw null;
    }

    @Override // I4.q
    public final I0 c(I0 i7, I0 i8) {
        return i8;
    }
}
