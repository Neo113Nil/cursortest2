package I4;

import Y4.D;
import Y4.H0;
import Y4.I;
import Y4.I0;
import Y4.K;
import com.google.firebase.Timestamp;
import com.google.protobuf.y0;
import com.google.protobuf.z0;

/* loaded from: classes2.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    public static final o f3691a = new o();

    @Override // I4.q
    public final I0 a(I0 i02, Timestamp timestamp) {
        H0 S6 = I0.S();
        S6.k("server_timestamp");
        I0 i03 = (I0) S6.b();
        H0 S7 = I0.S();
        y0 A7 = z0.A();
        A7.f(timestamp.f11828a);
        A7.d();
        z0.w((z0) A7.f12096b, timestamp.f11829b);
        S7.l(A7);
        I0 i04 = (I0) S7.b();
        I B7 = K.B();
        B7.f(i03, "__type__");
        B7.f(i04, "__local_write_time__");
        if (D.A(i02)) {
            i02 = D.t(i02);
        }
        if (i02 != null) {
            B7.f(i02, "__previous_value__");
        }
        H0 S8 = I0.S();
        S8.i(B7);
        return (I0) S8.b();
    }

    @Override // I4.q
    public final I0 b(I0 i02) {
        return null;
    }

    @Override // I4.q
    public final I0 c(I0 i02, I0 i03) {
        return i03;
    }
}
