package R3;

import Q3.t;
import V3.O;
import V3.r0;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q3.k f6048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Q3.j f6049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Q3.b f6050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Q3.a f6051d;

    static {
        X3.a aVarB = t.b("type.googleapis.com/google.crypto.tink.HmacKey");
        f6048a = new Q3.k(k.class);
        f6049b = new Q3.j(aVarB);
        f6050c = new Q3.b(j.class);
        f6051d = new Q3.a(aVarB, new H5.k(16));
    }

    public static d a(O o7) throws GeneralSecurityException {
        int iOrdinal = o7.ordinal();
        if (iOrdinal == 1) {
            return d.f6024g;
        }
        if (iOrdinal == 2) {
            return d.j;
        }
        if (iOrdinal == 3) {
            return d.f6026i;
        }
        if (iOrdinal == 4) {
            return d.f6027k;
        }
        if (iOrdinal == 5) {
            return d.f6025h;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + o7.a());
    }

    public static d b(r0 r0Var) throws GeneralSecurityException {
        int iOrdinal = r0Var.ordinal();
        if (iOrdinal == 1) {
            return d.f6028l;
        }
        if (iOrdinal == 2) {
            return d.f6030n;
        }
        if (iOrdinal == 3) {
            return d.f6031o;
        }
        if (iOrdinal == 4) {
            return d.f6029m;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + r0Var.b());
    }
}
