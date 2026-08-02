package R3;

import Q3.t;
import V3.r0;
import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Q3.k f6037a;

    /* renamed from: b, reason: collision with root package name */
    public static final Q3.j f6038b;

    /* renamed from: c, reason: collision with root package name */
    public static final Q3.b f6039c;

    /* renamed from: d, reason: collision with root package name */
    public static final Q3.a f6040d;

    static {
        X3.a b7 = t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f6037a = new Q3.k(e.class);
        f6038b = new Q3.j(b7);
        f6039c = new Q3.b(a.class);
        f6040d = new Q3.a(b7, new H5.k(14));
    }

    public static d a(r0 r0Var) {
        int ordinal = r0Var.ordinal();
        if (ordinal == 1) {
            return d.f6020c;
        }
        if (ordinal == 2) {
            return d.f6022e;
        }
        if (ordinal == 3) {
            return d.f6023f;
        }
        if (ordinal == 4) {
            return d.f6021d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
