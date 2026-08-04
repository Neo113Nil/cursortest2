package I4;

import Y4.D;
import Y4.H0;
import Y4.I;
import Y4.I0;
import Y4.K;
import com.google.firebase.Timestamp;
import com.google.protobuf.y0;
import com.google.protobuf.z0;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f3691a = new o();

    @Override // I4.q
    public final I0 a(I0 i7, Timestamp timestamp) {
        H0 h0S = I0.S();
        h0S.k("server_timestamp");
        I0 i8 = (I0) h0S.b();
        H0 h0S2 = I0.S();
        y0 y0VarA = z0.A();
        y0VarA.f(timestamp.f11828a);
        y0VarA.d();
        z0.w((z0) y0VarA.f12096b, timestamp.f11829b);
        h0S2.l(y0VarA);
        I0 i9 = (I0) h0S2.b();
        I iB = K.B();
        iB.f(i8, "__type__");
        iB.f(i9, "__local_write_time__");
        if (D.A(i7)) {
            i7 = D.t(i7);
        }
        if (i7 != null) {
            iB.f(i7, "__previous_value__");
        }
        H0 h0S3 = I0.S();
        h0S3.i(iB);
        return (I0) h0S3.b();
    }

    @Override // I4.q
    public final I0 b(I0 i7) {
        return null;
    }

    @Override // I4.q
    public final I0 c(I0 i7, I0 i8) {
        return i8;
    }
}
