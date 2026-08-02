package R3;

import Q3.t;
import V3.O;
import V3.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Q3.k f6048a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q3.j f6049b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q3.b f6050c;

    /* renamed from: d, reason: collision with root package name */
    public static final Q3.a f6051d;

    static {
        X3.a b7 = t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f6048a = new Q3.k(k.class);
        f6049b = new Q3.j(b7);
        f6050c = new Q3.b(j.class);
        f6051d = new Q3.a(b7, new H5.k(16));
    }

    public static d a(O o7) {
        int ordinal = o7.ordinal();
        if (ordinal == 1) {
            return d.f6024g;
        }
        if (ordinal == 2) {
            return d.j;
        }
        if (ordinal == 3) {
            return d.f6026i;
        }
        if (ordinal == 4) {
            return d.f6027k;
        }
        if (ordinal == 5) {
            return d.f6025h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o7.a());
    }

    public static d b(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal == 1) {
            return d.f6028l;
        }
        if (ordinal == 2) {
            return d.f6030n;
        }
        if (ordinal == 3) {
            return d.f6031o;
        }
        if (ordinal == 4) {
            return d.f6029m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
