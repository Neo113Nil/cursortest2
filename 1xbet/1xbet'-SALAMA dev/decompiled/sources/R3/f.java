package R3;

import Q3.t;
import V3.r0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q3.k f6037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q3.j f6038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q3.b f6039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q3.a f6040d;

    static {
        X3.a aVarB = t.b("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f6037a = new Q3.k(e.class);
        f6038b = new Q3.j(aVarB);
        f6039c = new Q3.b(a.class);
        f6040d = new Q3.a(aVarB, new H5.k(14));
    }

    public static d a(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f6020c;
        }
        if (iOrdinal == 2) {
            return d.f6022e;
        }
        if (iOrdinal == 3) {
            return d.f6023f;
        }
        if (iOrdinal == 4) {
            return d.f6021d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
